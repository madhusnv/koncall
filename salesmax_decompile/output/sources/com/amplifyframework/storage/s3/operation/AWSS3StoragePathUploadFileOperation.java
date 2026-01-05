package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.operation.StorageUploadFileOperation;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathUploadFileOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathUploadFileOperation extends StorageUploadFileOperation<AWSS3StoragePathUploadRequest<File>> {
    private final AuthCredentialsProvider authCredentialsProvider;
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public UploadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i, Exception exc) {
            sq8.m48649h(exc, "ex");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, exc));
            Consumer onError = AWSS3StoragePathUploadFileOperation.this.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Something went wrong with your AWS S3 Storage upload file operation", exc, "See attached exception for more information and suggestions"));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            Consumer onProgress = AWSS3StoragePathUploadFileOperation.this.getOnProgress();
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
            if (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()] != 1 || (onSuccess = AWSS3StoragePathUploadFileOperation.this.getOnSuccess()) == null) {
                return;
            }
            onSuccess.accept(new StorageUploadFileResult(str, str));
        }
    }

    public /* synthetic */ AWSS3StoragePathUploadFileOperation(String str, AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        this(str, aWSS3StoragePathUploadRequest, storageService, executorService, authCredentialsProvider, (i & 32) != 0 ? null : transferObserver, (i & 64) != 0 ? null : consumer, (i & 128) != 0 ? null : consumer2, (i & 256) != 0 ? null : consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$6(AWSS3StoragePathUploadFileOperation aWSS3StoragePathUploadFileOperation) {
        sq8.m48649h(aWSS3StoragePathUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadFileOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$2(AWSS3StoragePathUploadFileOperation aWSS3StoragePathUploadFileOperation) {
        sq8.m48649h(aWSS3StoragePathUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadFileOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(AWSS3StoragePathUploadFileOperation aWSS3StoragePathUploadFileOperation) {
        sq8.m48649h(aWSS3StoragePathUploadFileOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadFileOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadFileOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage upload file operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathUploadFileOperation aWSS3StoragePathUploadFileOperation, AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest) {
        sq8.m48649h(aWSS3StoragePathUploadFileOperation, "this$0");
        sq8.m48649h(aWSS3StoragePathUploadRequest, "$uploadRequest");
        try {
            String str = (String) qm1.m45641b(null, new AWSS3StoragePathUploadFileOperation$start$1$serviceKey$1(aWSS3StoragePathUploadRequest, aWSS3StoragePathUploadFileOperation, null), 1, null);
            try {
                File file = (File) aWSS3StoragePathUploadRequest.getLocal();
                ObjectMetadata objectMetadata = new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null);
                objectMetadata.setUserMetadata(aWSS3StoragePathUploadRequest.getMetadata());
                objectMetadata.getMetaData().put("Content-Type", aWSS3StoragePathUploadRequest.getContentType());
                ServerSideEncryption serverSideEncryption = aWSS3StoragePathUploadRequest.getServerSideEncryption();
                if (ServerSideEncryption.NONE != serverSideEncryption) {
                    objectMetadata.getMetaData().put(ObjectMetadata.SERVER_SIDE_ENCRYPTION, serverSideEncryption.getName());
                }
                TransferObserver transferObserverUploadFile = aWSS3StoragePathUploadFileOperation.storageService.uploadFile(aWSS3StoragePathUploadFileOperation.getTransferId(), str, file, objectMetadata, aWSS3StoragePathUploadRequest.getUseAccelerateEndpoint());
                aWSS3StoragePathUploadFileOperation.transferObserver = transferObserverUploadFile;
                if (transferObserverUploadFile != null) {
                    transferObserverUploadFile.setTransferListener(aWSS3StoragePathUploadFileOperation.new UploadTransferListener());
                }
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadFileOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Issue uploading file.", e, "See included exception for more details and suggestions to fix."));
                }
            }
        } catch (StorageException e2) {
            aWSS3StoragePathUploadFileOperation.getOnError().accept(e2);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new Runnable() { // from class: o.r4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadFileOperation.cancel$lambda$6(this.f42902a);
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
        this.executorService.submit(new Runnable() { // from class: o.q4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadFileOperation.pause$lambda$2(this.f41270a);
            }
        });
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new Runnable() { // from class: o.p4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadFileOperation.resume$lambda$4(this.f39291a);
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
        final AWSS3StoragePathUploadRequest<File> request;
        if (this.transferObserver == null && (request = getRequest()) != null) {
            this.executorService.submit(new Runnable() { // from class: o.s4
                @Override // java.lang.Runnable
                public final void run() {
                    AWSS3StoragePathUploadFileOperation.start$lambda$0(this.f44738a, request);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathUploadFileOperation(String str, AWSS3StoragePathUploadRequest<File> aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StoragePathUploadRequest, str, consumer, consumer2, consumer3);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(aWSS3StoragePathUploadRequest, "request");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new UploadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePathUploadFileOperation(AWSS3StoragePathUploadRequest<File> aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        sq8.m48649h(aWSS3StoragePathUploadRequest, "request");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(consumer, "onProgress");
        sq8.m48649h(consumer2, "onSuccess");
        sq8.m48649h(consumer3, "onError");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        this(string, aWSS3StoragePathUploadRequest, storageService, executorService, authCredentialsProvider, null, consumer, consumer2, consumer3);
    }
}
