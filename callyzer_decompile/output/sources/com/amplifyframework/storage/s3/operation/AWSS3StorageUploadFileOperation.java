package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0012k;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.C0988a;
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
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final class AWSS3StorageUploadFileOperation extends StorageUploadFileOperation<AWSS3StorageUploadRequest<File>> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public final class UploadTransferListener implements TransferListener {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final /* synthetic */ class WhenMappings {
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
        public void onError(int i10, Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, exception));
            Consumer onError = AWSS3StorageUploadFileOperation.this.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage upload file operation", exception, "See attached exception for more information and suggestions", onError);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i10, long j6, long j10) {
            Consumer onProgress = AWSS3StorageUploadFileOperation.this.getOnProgress();
            if (onProgress != null) {
                onProgress.accept(new StorageTransferProgress(j6, j10));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i10, TransferState state, String key) {
            Consumer onSuccess;
            AbstractC4154l.m8923f(state, "state");
            AbstractC4154l.m8923f(key, "key");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_STATE, state.name()));
            if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] == 1 && (onSuccess = AWSS3StorageUploadFileOperation.this.getOnSuccess()) != null) {
                onSuccess.accept(StorageUploadFileResult.fromKey(key));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration) {
        this(transferId, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, null, null, null, null, null, 992, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$7(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to cancel your AWS S3 Storage upload file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to pause your AWS S3 Storage upload file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$5(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageUploadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to resume your AWS S3 Storage upload file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, AWSS3StorageUploadRequest aWSS3StorageUploadRequest) {
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = aWSS3StorageUploadFileOperation.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(aWSS3StorageUploadFileOperation.authCredentialsProvider);
        StorageAccessLevel accessLevel = aWSS3StorageUploadRequest.getAccessLevel();
        AbstractC4154l.m8922e(accessLevel, "getAccessLevel(...)");
        aWSS3PluginPrefixResolver.resolvePrefix(accessLevel, aWSS3StorageUploadRequest.getTargetIdentityId(), new C0988a(2, aWSS3StorageUploadRequest, aWSS3StorageUploadFileOperation), aWSS3StorageUploadFileOperation.getOnError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(AWSS3StorageUploadRequest aWSS3StorageUploadRequest, AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, String prefix) {
        AbstractC4154l.m8923f(prefix, "prefix");
        try {
            String str = prefix + aWSS3StorageUploadRequest.getKey();
            Object local = aWSS3StorageUploadRequest.getLocal();
            AbstractC4154l.m8922e(local, "getLocal(...)");
            File file = (File) local;
            ObjectMetadata objectMetadata = new ObjectMetadata(null, null, null, null, null, null, null, 127, null);
            Map<String, String> metadata = aWSS3StorageUploadRequest.getMetadata();
            AbstractC4154l.m8922e(metadata, "getMetadata(...)");
            objectMetadata.setUserMetadata(metadata);
            objectMetadata.getMetaData().put(ObjectMetadata.CONTENT_TYPE, aWSS3StorageUploadRequest.getContentType());
            ServerSideEncryption serverSideEncryption = aWSS3StorageUploadRequest.getServerSideEncryption();
            AbstractC4154l.m8922e(serverSideEncryption, "getServerSideEncryption(...)");
            if (ServerSideEncryption.NONE != serverSideEncryption) {
                objectMetadata.getMetaData().put(ObjectMetadata.SERVER_SIDE_ENCRYPTION, serverSideEncryption.getName());
            }
            TransferObserver transferObserverUploadFile = aWSS3StorageUploadFileOperation.storageService.uploadFile(aWSS3StorageUploadFileOperation.getTransferId(), str, file, objectMetadata, aWSS3StorageUploadRequest.useAccelerateEndpoint());
            aWSS3StorageUploadFileOperation.transferObserver = transferObserverUploadFile;
            if (transferObserverUploadFile != null) {
                transferObserverUploadFile.setTransferListener(aWSS3StorageUploadFileOperation.new UploadTransferListener());
            }
        } catch (Exception e2) {
            Consumer<StorageException> onError = aWSS3StorageUploadFileOperation.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Issue uploading file.", e2, "See included exception for more details and suggestions to fix.", onError);
            }
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new RunnableC1237e(this, 0));
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public TransferState getTransferState() {
        TransferState transferState;
        TransferObserver transferObserver = this.transferObserver;
        return (transferObserver == null || (transferState = transferObserver.getTransferState()) == null) ? TransferState.UNKNOWN : transferState;
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        this.executorService.submit(new RunnableC1237e(this, 2));
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new RunnableC1237e(this, 1));
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
        AWSS3StorageUploadRequest<File> request;
        if (this.transferObserver == null && (request = getRequest()) != null) {
            this.executorService.submit(new RunnableC0012k(11, this, request));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest) {
        this(transferId, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageUploadRequest, null, null, null, null, 960, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver) {
        this(transferId, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, null, null, null, 896, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer) {
        this(transferId, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, consumer, null, null, 768, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2) {
        this(transferId, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageUploadRequest, transferObserver, consumer, consumer2, null, 512, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    public /* synthetic */ AWSS3StorageUploadFileOperation(String str, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageUploadRequest aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i10, AbstractC4148f abstractC4148f) {
        this(str, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, (i10 & 32) != 0 ? null : aWSS3StorageUploadRequest, (i10 & 64) != 0 ? null : transferObserver, (i10 & 128) != 0 ? null : consumer, (i10 & 256) != 0 ? null : consumer2, (i10 & 512) != 0 ? null : consumer3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(String transferId, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageUploadRequest, transferId, consumer, consumer2, consumer3);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = awsS3StoragePluginConfiguration;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new UploadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StorageUploadFileOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageUploadRequest<File> request, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, Consumer<StorageTransferProgress> onProgress, Consumer<StorageUploadFileResult> onSuccess, Consumer<StorageException> onError) {
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        AbstractC4154l.m8923f(onProgress, "onProgress");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this(string, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, request, null, onProgress, onSuccess, onError);
    }
}
