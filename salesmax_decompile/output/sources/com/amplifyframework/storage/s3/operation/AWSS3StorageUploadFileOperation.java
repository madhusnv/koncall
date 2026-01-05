package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.operation.StorageUploadFileOperation;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import com.amplifyframework.storage.s3.configuration.AWSS3PluginPrefixResolver;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadFileOperation;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StorageUploadFileOperation extends StorageUploadFileOperation<AWSS3StorageUploadRequest<File>> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    public final class UploadTransferListener implements TransferListener {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferState.values().length];
                try {
                    iArr[TransferState.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferState.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public UploadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i, Exception exc) {
            sq8.m48649h(exc, "exception");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, exc));
            Consumer onError = AWSS3StorageUploadFileOperation.this.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Something went wrong with your AWS S3 Storage upload file operation", exc, "See attached exception for more information and suggestions"));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            Consumer onProgress = AWSS3StorageUploadFileOperation.this.getOnProgress();
            if (onProgress != null) {
                onProgress.accept(new StorageTransferProgress(j, j2));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i, TransferState transferState, String str) {
            Consumer onSuccess;
            sq8.m48649h(transferState, "state");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_STATE, transferState.name()));
            if (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()] == 1 && (onSuccess = AWSS3StorageUploadFileOperation.this.getOnSuccess()) != null) {
                onSuccess.accept(StorageUploadFileResult.fromKey(str));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, null, null, null, null, null, 992, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$7(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        sq8.m48649h(aWSS3StorageUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        sq8.m48649h(aWSS3StorageUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$5(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        sq8.m48649h(aWSS3StorageUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(final AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, final AWSS3StorageUploadRequest aWSS3StorageUploadRequest) {
        sq8.m48649h(aWSS3StorageUploadFileOperation, "this$0");
        sq8.m48649h(aWSS3StorageUploadRequest, "$uploadRequest");
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = aWSS3StorageUploadFileOperation.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(aWSS3StorageUploadFileOperation.authCredentialsProvider);
        StorageAccessLevel accessLevel = aWSS3StorageUploadRequest.getAccessLevel();
        sq8.m48648g(accessLevel, "getAccessLevel(...)");
        aWSS3PluginPrefixResolver.resolvePrefix(accessLevel, aWSS3StorageUploadRequest.getTargetIdentityId(), new Consumer() { // from class: o.f5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AWSS3StorageUploadFileOperation.start$lambda$1$lambda$0(aWSS3StorageUploadRequest, aWSS3StorageUploadFileOperation, (String) obj);
            }
        }, aWSS3StorageUploadFileOperation.getOnError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(AWSS3StorageUploadRequest aWSS3StorageUploadRequest, AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, String str) {
        sq8.m48649h(aWSS3StorageUploadRequest, "$uploadRequest");
        sq8.m48649h(aWSS3StorageUploadFileOperation, "this$0");
        sq8.m48649h(str, "prefix");
        try {
            String str2 = str + aWSS3StorageUploadRequest.getKey();
            Object local = aWSS3StorageUploadRequest.getLocal();
            sq8.m48648g(local, "getLocal(...)");
            File file = (File) local;
            ObjectMetadata objectMetadata = new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null);
            Map<String, String> metadata = aWSS3StorageUploadRequest.getMetadata();
            sq8.m48648g(metadata, "getMetadata(...)");
            objectMetadata.setUserMetadata(metadata);
            objectMetadata.getMetaData().put("Content-Type", aWSS3StorageUploadRequest.getContentType());
            ServerSideEncryption serverSideEncryption = aWSS3StorageUploadRequest.getServerSideEncryption();
            sq8.m48648g(serverSideEncryption, "getServerSideEncryption(...)");
            if (ServerSideEncryption.NONE != serverSideEncryption) {
                objectMetadata.getMetaData().put(ObjectMetadata.SERVER_SIDE_ENCRYPTION, serverSideEncryption.getName());
            }
            TransferObserver transferObserverUploadFile = aWSS3StorageUploadFileOperation.storageService.uploadFile(aWSS3StorageUploadFileOperation.getTransferId(), str2, file, objectMetadata, aWSS3StorageUploadRequest.useAccelerateEndpoint());
            aWSS3StorageUploadFileOperation.transferObserver = transferObserverUploadFile;
            if (transferObserverUploadFile != null) {
                transferObserverUploadFile.setTransferListener(aWSS3StorageUploadFileOperation.new UploadTransferListener());
            }
        } catch (Exception e) {
            Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Issue uploading file.", e, "See included exception for more details and suggestions to fix."));
            }
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new Runnable() { // from class: o.g5
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageUploadFileOperation.cancel$lambda$7(this.f24579a);
            }
        });
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public TransferState getTransferState() {
        TransferState transferState;
        TransferObserver transferObserver = this.transferObserver;
        return (transferObserver == null || (transferState = transferObserver.getTransferState()) == null) ? TransferState.UNKNOWN : transferState;
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        this.executorService.submit(new Runnable() { // from class: o.i5
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageUploadFileOperation.pause$lambda$3(this.f28087a);
            }
        });
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new Runnable() { // from class: o.e5
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageUploadFileOperation.resume$lambda$5(this.f20967a);
            }
        });
    }

    @Override // com.amplifyframework.storage.operation.StorageUploadFileOperation, com.amplifyframework.storage.operation.StorageUploadOperation, com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(Consumer<StorageUploadFileResult> consumer) {
        super.setOnSuccess(consumer);
        TransferObserver transferObserver = this.transferObserver;
        String key = transferObserver != null ? transferObserver.getKey() : null;
        if (getTransferState() != TransferState.COMPLETED || key == null || consumer == null) {
            return;
        }
        consumer.accept(new StorageUploadFileResult(key, key));
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        final AWSS3StorageUploadRequest<File> request;
        if (this.transferObserver == null && (request = getRequest()) != null) {
            this.executorService.submit(new Runnable() { // from class: o.h5
                @Override // java.lang.Runnable
                public final void run() {
                    AWSS3StorageUploadFileOperation.start$lambda$1(this.f26206a, request);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageUploadRequest, null, null, null, null, 960, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, null, null, null, 896, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, consumer, null, null, 768, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, consumer, consumer2, null, 512, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    public /* synthetic */ AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, (i & 32) != 0 ? null : aWSS3StorageUploadRequest, (i & 64) != 0 ? null : transferObserver, (i & 128) != 0 ? null : consumer, (i & 256) != 0 ? null : consumer2, (i & 512) != 0 ? null : consumer3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageUploadRequest, str, consumer, consumer2, consumer3);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new UploadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StorageUploadFileOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StorageUploadRequest, "request");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        sq8.m48649h(consumer, "onProgress");
        sq8.m48649h(consumer2, "onSuccess");
        sq8.m48649h(consumer3, "onError");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        this(string, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageUploadRequest, null, consumer, consumer2, consumer3);
    }
}
