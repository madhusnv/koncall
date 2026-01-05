package com.amplifyframework.storage.s3.operation;

import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathDownloadFileRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathDownloadFileOperation extends StorageDownloadFileOperation<AWSS3StoragePathDownloadFileRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private File file;
    private final AWSS3StoragePathDownloadFileRequest request;
    private final StorageService storageService;
    private final String transferId;
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public DownloadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i10, Exception ex2) {
            AbstractC4154l.m8923f(ex2, "ex");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_ERROR, ex2));
            Consumer onError = AWSS3StoragePathDownloadFileOperation.this.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage download file operation", ex2, "See attached exception for more information and suggestions", onError);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i10, long j6, long j10) {
            Consumer onProgress = AWSS3StoragePathDownloadFileOperation.this.getOnProgress();
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
            if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] != 1 || (onSuccess = AWSS3StoragePathDownloadFileOperation.this.getOnSuccess()) == null) {
                return;
            }
            onSuccess.accept(StorageDownloadFileResult.fromFile(AWSS3StoragePathDownloadFileOperation.this.file));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AWSS3StoragePathDownloadFileOperation(String str, AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            AbstractC4154l.m8922e(str, "toString(...)");
        }
        this(str, aWSS3StoragePathDownloadFileRequest, file, storageService, executorService, authCredentialsProvider, (i10 & 64) != 0 ? null : transferObserver, (i10 & 128) != 0 ? null : consumer, (i10 & 256) != 0 ? null : consumer2, (i10 & 512) != 0 ? null : consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$6(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to cancel your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$2(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to pause your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to resume your AWS S3 Storage download file operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        try {
            try {
                TransferObserver transferObserverDownloadToFile = aWSS3StoragePathDownloadFileOperation.storageService.downloadToFile(aWSS3StoragePathDownloadFileOperation.transferId, (String) c0.m13468D(C7565i.f36440a, new AWSS3StoragePathDownloadFileOperation$start$1$serviceKey$1(aWSS3StoragePathDownloadFileOperation, null)), aWSS3StoragePathDownloadFileOperation.request.getLocal(), aWSS3StoragePathDownloadFileOperation.request.getUseAccelerateEndpoint());
                aWSS3StoragePathDownloadFileOperation.transferObserver = transferObserverDownloadToFile;
                if (transferObserverDownloadToFile != null) {
                    transferObserverDownloadToFile.setTransferListener(aWSS3StoragePathDownloadFileOperation.new DownloadTransferListener());
                }
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Issue downloading file", e2, "See included exception for more details and suggestions to fix.", onError);
                }
            }
        } catch (StorageException e10) {
            aWSS3StoragePathDownloadFileOperation.getOnError().accept(e10);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new RunnableC1234b(this, 3));
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public TransferState getTransferState() {
        TransferState transferState;
        TransferObserver transferObserver = this.transferObserver;
        return (transferObserver == null || (transferState = transferObserver.getTransferState()) == null) ? TransferState.UNKNOWN : transferState;
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        this.executorService.submit(new RunnableC1234b(this, 2));
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new RunnableC1234b(this, 1));
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
        if (this.transferObserver != null) {
            return;
        }
        this.executorService.submit(new RunnableC1234b(this, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathDownloadFileOperation(String transferId, AWSS3StoragePathDownloadFileRequest request, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(request, transferId, consumer, consumer2, consumer3);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        this.transferId = transferId;
        this.request = request;
        this.file = file;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new DownloadTransferListener());
        }
    }

    public /* synthetic */ AWSS3StoragePathDownloadFileOperation(AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer consumer, Consumer consumer2, Consumer consumer3, int i10, AbstractC4148f abstractC4148f) {
        this(aWSS3StoragePathDownloadFileRequest, storageService, executorService, authCredentialsProvider, (i10 & 16) != 0 ? null : consumer, (i10 & 32) != 0 ? null : consumer2, (i10 & 64) != 0 ? null : consumer3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePathDownloadFileOperation(AWSS3StoragePathDownloadFileRequest request, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this(string, request, request.getLocal(), storageService, executorService, authCredentialsProvider, null, consumer, consumer2, consumer3);
    }
}
