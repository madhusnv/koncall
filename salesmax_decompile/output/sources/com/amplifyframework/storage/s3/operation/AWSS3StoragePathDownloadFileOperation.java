package com.amplifyframework.storage.s3.operation;

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
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathDownloadFileOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathDownloadFileRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p001o.id5;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathDownloadFileOperation extends StorageDownloadFileOperation<AWSS3StoragePathDownloadFileRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private File file;
    private final AWSS3StoragePathDownloadFileRequest request;
    private final StorageService storageService;
    private final String transferId;
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public DownloadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i, Exception exc) {
            sq8.m48649h(exc, "ex");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_ERROR, exc));
            Consumer onError = AWSS3StoragePathDownloadFileOperation.this.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Something went wrong with your AWS S3 Storage download file operation", exc, "See attached exception for more information and suggestions"));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            Consumer onProgress = AWSS3StoragePathDownloadFileOperation.this.getOnProgress();
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
            if (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()] != 1 || (onSuccess = AWSS3StoragePathDownloadFileOperation.this.getOnSuccess()) == null) {
                return;
            }
            onSuccess.accept(StorageDownloadFileResult.fromFile(AWSS3StoragePathDownloadFileOperation.this.file));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AWSS3StoragePathDownloadFileOperation(String str, AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        String str2;
        if ((i & 1) != 0) {
            String string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
            str2 = string;
        } else {
            str2 = str;
        }
        this(str2, aWSS3StoragePathDownloadFileRequest, file, storageService, executorService, authCredentialsProvider, (i & 64) != 0 ? null : transferObserver, (i & 128) != 0 ? null : consumer, (i & 256) != 0 ? null : consumer2, (i & 512) != 0 ? null : consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$6(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        sq8.m48649h(aWSS3StoragePathDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$2(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        sq8.m48649h(aWSS3StoragePathDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        sq8.m48649h(aWSS3StoragePathDownloadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathDownloadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathDownloadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage download file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation) {
        sq8.m48649h(aWSS3StoragePathDownloadFileOperation, "this$0");
        try {
            try {
                TransferObserver transferObserverDownloadToFile = aWSS3StoragePathDownloadFileOperation.storageService.downloadToFile(aWSS3StoragePathDownloadFileOperation.transferId, (String) qm1.m45641b(null, new AWSS3StoragePathDownloadFileOperation$start$1$serviceKey$1(aWSS3StoragePathDownloadFileOperation, null), 1, null), aWSS3StoragePathDownloadFileOperation.request.getLocal(), aWSS3StoragePathDownloadFileOperation.request.getUseAccelerateEndpoint());
                aWSS3StoragePathDownloadFileOperation.transferObserver = transferObserverDownloadToFile;
                if (transferObserverDownloadToFile != null) {
                    transferObserverDownloadToFile.setTransferListener(aWSS3StoragePathDownloadFileOperation.new DownloadTransferListener());
                }
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathDownloadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Issue downloading file", e, "See included exception for more details and suggestions to fix."));
                }
            }
        } catch (StorageException e2) {
            aWSS3StoragePathDownloadFileOperation.getOnError().accept(e2);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new Runnable() { // from class: o.j4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathDownloadFileOperation.cancel$lambda$6(this.f29730a);
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
        this.executorService.submit(new Runnable() { // from class: o.i4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathDownloadFileOperation.pause$lambda$2(this.f28001a);
            }
        });
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new Runnable() { // from class: o.k4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathDownloadFileOperation.resume$lambda$4(this.f31447a);
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
        if (this.transferObserver != null) {
            return;
        }
        this.executorService.submit(new Runnable() { // from class: o.l4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathDownloadFileOperation.start$lambda$0(this.f33235a);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathDownloadFileOperation(String str, AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, File file, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StoragePathDownloadFileRequest, str, consumer, consumer2, consumer3);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(aWSS3StoragePathDownloadFileRequest, "request");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        this.transferId = str;
        this.request = aWSS3StoragePathDownloadFileRequest;
        this.file = file;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new DownloadTransferListener());
        }
    }

    public /* synthetic */ AWSS3StoragePathDownloadFileOperation(AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        this(aWSS3StoragePathDownloadFileRequest, storageService, executorService, authCredentialsProvider, (i & 16) != 0 ? null : consumer, (i & 32) != 0 ? null : consumer2, (i & 64) != 0 ? null : consumer3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePathDownloadFileOperation(AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        sq8.m48649h(aWSS3StoragePathDownloadFileRequest, "request");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        this(string, aWSS3StoragePathDownloadFileRequest, aWSS3StoragePathDownloadFileRequest.getLocal(), storageService, executorService, authCredentialsProvider, null, consumer, consumer2, consumer3);
    }
}
