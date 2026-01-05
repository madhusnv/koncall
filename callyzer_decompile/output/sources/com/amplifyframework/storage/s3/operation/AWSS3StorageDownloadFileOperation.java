package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0012k;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.C0988a;
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
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final class AWSS3StorageDownloadFileOperation extends StorageDownloadFileOperation<AWSS3StorageDownloadFileRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private File file;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public final class DownloadTransferListener implements TransferListener {

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

        public DownloadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i10, Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_ERROR, exception));
            Consumer onError = AWSS3StorageDownloadFileOperation.this.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage download file operation", exception, "See attached exception for more information and suggestions", onError);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i10, long j6, long j10) {
            Consumer onProgress = AWSS3StorageDownloadFileOperation.this.getOnProgress();
            if (onProgress != null) {
                onProgress.accept(new StorageTransferProgress(j6, j10));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onStateChanged(int i10, TransferState state, String key) {
            Consumer onSuccess;
            AbstractC4154l.m8923f(state, "state");
            AbstractC4154l.m8923f(key, "key");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_STATE, state.name()));
            if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] == 1 && (onSuccess = AWSS3StorageDownloadFileOperation.this.getOnSuccess()) != null) {
                onSuccess.accept(StorageDownloadFileResult.fromFile(AWSS3StorageDownloadFileOperation.this.file));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration) {
        this(transferId, file, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, null, null, null, null, null, 1984, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$7(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to cancel your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$3(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to pause your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$5(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StorageDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StorageDownloadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to resume your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest) {
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = aWSS3StorageDownloadFileOperation.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(aWSS3StorageDownloadFileOperation.authCredentialsProvider);
        StorageAccessLevel accessLevel = aWSS3StorageDownloadFileRequest.getAccessLevel();
        AbstractC4154l.m8922e(accessLevel, "getAccessLevel(...)");
        aWSS3PluginPrefixResolver.resolvePrefix(accessLevel, aWSS3StorageDownloadFileRequest.getTargetIdentityId(), new C0988a(1, aWSS3StorageDownloadFileRequest, aWSS3StorageDownloadFileOperation), aWSS3StorageDownloadFileOperation.getOnError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, String prefix) {
        AbstractC4154l.m8923f(prefix, "prefix");
        try {
            String str = prefix + aWSS3StorageDownloadFileRequest.getKey();
            File local = aWSS3StorageDownloadFileRequest.getLocal();
            AbstractC4154l.m8922e(local, "getLocal(...)");
            aWSS3StorageDownloadFileOperation.file = local;
            TransferObserver transferObserverDownloadToFile = aWSS3StorageDownloadFileOperation.storageService.downloadToFile(aWSS3StorageDownloadFileOperation.getTransferId(), str, aWSS3StorageDownloadFileOperation.file, aWSS3StorageDownloadFileRequest.useAccelerateEndpoint());
            aWSS3StorageDownloadFileOperation.transferObserver = transferObserverDownloadToFile;
            if (transferObserverDownloadToFile != null) {
                transferObserverDownloadToFile.setTransferListener(aWSS3StorageDownloadFileOperation.new DownloadTransferListener());
            }
        } catch (Exception e2) {
            Consumer<StorageException> onError = aWSS3StorageDownloadFileOperation.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Issue downloading file", e2, "See included exception for more details and suggestions to fix.", onError);
            }
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new RunnableC1233a(this, 0));
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public TransferState getTransferState() {
        TransferState transferState;
        TransferObserver transferObserver = this.transferObserver;
        return (transferObserver == null || (transferState = transferObserver.getTransferState()) == null) ? TransferState.UNKNOWN : transferState;
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        this.executorService.submit(new RunnableC1233a(this, 2));
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new RunnableC1233a(this, 1));
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
        AWSS3StorageDownloadFileRequest request;
        if (this.transferObserver == null && (request = getRequest()) != null) {
            this.executorService.submit(new RunnableC0012k(9, this, request));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest) {
        this(transferId, file, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, null, null, null, null, 1920, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver) {
        this(transferId, file, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, null, null, null, 1792, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer) {
        this(transferId, file, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, consumer, null, null, 1536, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2) {
        this(transferId, file, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, aWSS3StorageDownloadFileRequest, transferObserver, consumer, consumer2, null, 1024, null);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
    }

    public /* synthetic */ AWSS3StorageDownloadFileOperation(String str, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i10, AbstractC4148f abstractC4148f) {
        this(str, file, storageService, executorService, authCredentialsProvider, aWSS3StoragePluginConfiguration, (i10 & 64) != 0 ? null : aWSS3StorageDownloadFileRequest, (i10 & 128) != 0 ? null : transferObserver, (i10 & 256) != 0 ? null : consumer, (i10 & 512) != 0 ? null : consumer2, (i10 & 1024) != 0 ? null : consumer3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageDownloadFileOperation(String transferId, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageDownloadFileRequest, transferId, consumer, consumer2, consumer3);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(awsS3StoragePluginConfiguration, "awsS3StoragePluginConfiguration");
        this.file = file;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = awsS3StoragePluginConfiguration;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new DownloadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StorageDownloadFileOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageDownloadFileRequest request, AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration, Consumer<StorageTransferProgress> onProgress, Consumer<StorageDownloadFileResult> onSuccess, Consumer<StorageException> onError) {
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
        File local = request.getLocal();
        AbstractC4154l.m8922e(local, "getLocal(...)");
        this(string, local, storageService, executorService, authCredentialsProvider, awsS3StoragePluginConfiguration, request, null, onProgress, onSuccess, onError);
    }
}
