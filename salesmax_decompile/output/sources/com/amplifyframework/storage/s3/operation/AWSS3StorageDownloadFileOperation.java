package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.s3.configuration.AWSS3PluginPrefixResolver;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.operation.AWSS3StorageDownloadFileOperation;
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StorageDownloadFileOperation extends StorageDownloadFileOperation<AWSS3StorageDownloadFileRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private File file;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    public final class DownloadTransferListener implements TransferListener {

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

        public DownloadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i, Exception exc) {
            sq8.m48649h(exc, "exception");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_ERROR, exc));
            Consumer onError = AWSS3StorageDownloadFileOperation.this.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Something went wrong with your AWS S3 Storage download file operation", exc, "See attached exception for more information and suggestions"));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            Consumer onProgress = AWSS3StorageDownloadFileOperation.this.getOnProgress();
            if (onProgress != null) {
                onProgress.accept(new StorageTransferProgress(j, j2));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i, TransferState transferState, String str) {
            Consumer onSuccess;
            sq8.m48649h(transferState, "state");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_STATE, transferState.name()));
            if (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()] == 1 && (onSuccess = AWSS3StorageDownloadFileOperation.this.getOnSuccess()) != null) {
                onSuccess.accept(StorageDownloadFileResult.fromFile(AWSS3StorageDownloadFileOperation.this.file));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, null, null, null, null, null, 1984, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$7(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        sq8.m48649h(aWSS3StorageDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        sq8.m48649h(aWSS3StorageDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$5(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        sq8.m48649h(aWSS3StorageDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(final AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, final AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest) {
        sq8.m48649h(aWSS3StorageDownloadFileOperation, "this$0");
        sq8.m48649h(aWSS3StorageDownloadFileRequest, "$downloadRequest");
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = aWSS3StorageDownloadFileOperation.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(aWSS3StorageDownloadFileOperation.authCredentialsProvider);
        StorageAccessLevel accessLevel = aWSS3StorageDownloadFileRequest.getAccessLevel();
        sq8.m48648g(accessLevel, "getAccessLevel(...)");
        aWSS3PluginPrefixResolver.resolvePrefix(accessLevel, aWSS3StorageDownloadFileRequest.getTargetIdentityId(), new Consumer() { // from class: o.z3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AWSS3StorageDownloadFileOperation.start$lambda$1$lambda$0(aWSS3StorageDownloadFileRequest, aWSS3StorageDownloadFileOperation, (String) obj);
            }
        }, aWSS3StorageDownloadFileOperation.getOnError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, String str) {
        sq8.m48649h(aWSS3StorageDownloadFileRequest, "$downloadRequest");
        sq8.m48649h(aWSS3StorageDownloadFileOperation, "this$0");
        sq8.m48649h(str, "prefix");
        try {
            String str2 = str + aWSS3StorageDownloadFileRequest.getKey();
            File local = aWSS3StorageDownloadFileRequest.getLocal();
            sq8.m48648g(local, "getLocal(...)");
            aWSS3StorageDownloadFileOperation.file = local;
            TransferObserver transferObserverDownloadToFile = aWSS3StorageDownloadFileOperation.storageService.downloadToFile(aWSS3StorageDownloadFileOperation.getTransferId(), str2, aWSS3StorageDownloadFileOperation.file, aWSS3StorageDownloadFileRequest.useAccelerateEndpoint());
            aWSS3StorageDownloadFileOperation.transferObserver = transferObserverDownloadToFile;
            if (transferObserverDownloadToFile != null) {
                transferObserverDownloadToFile.setTransferListener(aWSS3StorageDownloadFileOperation.new DownloadTransferListener());
            }
        } catch (Exception e) {
            Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Issue downloading file", e, "See included exception for more details and suggestions to fix."));
            }
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new Runnable() { // from class: o.x3
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageDownloadFileOperation.cancel$lambda$7(this.f53127a);
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
        this.executorService.submit(new Runnable() { // from class: o.v3
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageDownloadFileOperation.pause$lambda$3(this.f49816a);
            }
        });
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new Runnable() { // from class: o.w3
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StorageDownloadFileOperation.resume$lambda$5(this.f51360a);
            }
        });
    }

    @Override // com.amplifyframework.storage.operation.StorageDownloadFileOperation, com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(Consumer<StorageDownloadFileResult> consumer) {
        super.setOnSuccess(consumer);
        if (getTransferState() != TransferState.COMPLETED || consumer == null) {
            return;
        }
        consumer.accept(StorageDownloadFileResult.fromFile(this.file));
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        final AWSS3StorageDownloadFileRequest request;
        if (this.transferObserver == null && (request = getRequest()) != null) {
            this.executorService.submit(new Runnable() { // from class: o.y3
                @Override // java.lang.Runnable
                public final void run() {
                    AWSS3StorageDownloadFileOperation.start$lambda$1(this.f54803a, request);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, null, null, null, null, 1920, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, null, null, null, 1792, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, consumer, null, null, 1536, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, consumer, consumer2, null, 1024, null);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    public /* synthetic */ AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, (i & 64) != 0 ? null : aWSS3StorageDownloadFileRequest, (i & 128) != 0 ? null : transferObserver, (i & 256) != 0 ? null : consumer, (i & 512) != 0 ? null : consumer2, (i & 1024) != 0 ? null : consumer3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageDownloadFileRequest, str, consumer, consumer2, consumer3);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        this.file = file;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new DownloadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StorageDownloadFileOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StorageDownloadFileRequest, "request");
        sq8.m48649h(aWSS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        sq8.m48649h(consumer, "onProgress");
        sq8.m48649h(consumer2, "onSuccess");
        sq8.m48649h(consumer3, "onError");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        File local = aWSS3StorageDownloadFileRequest.getLocal();
        sq8.m48648g(local, "getLocal(...)");
        this(string, local, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, null, consumer, consumer2, consumer3);
    }
}
