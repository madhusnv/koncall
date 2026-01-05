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
import com.amplifyframework.storage.operation.StorageUploadInputStreamOperation;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathUploadInputStreamOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathUploadInputStreamOperation extends StorageUploadInputStreamOperation<AWSS3StoragePathUploadRequest<InputStream>> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final AWSS3StoragePathUploadRequest<InputStream> request;
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
            Consumer onError = AWSS3StoragePathUploadInputStreamOperation.this.getOnError();
            if (onError != null) {
                onError.accept(new StorageException("Something went wrong with your AWS S3 Storage upload InputStream operation", exc, "See attached exception for more information and suggestions"));
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            Consumer onProgress = AWSS3StoragePathUploadInputStreamOperation.this.getOnProgress();
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
            if (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()] != 1 || (onSuccess = AWSS3StoragePathUploadInputStreamOperation.this.getOnSuccess()) == null) {
                return;
            }
            onSuccess.accept(new StorageUploadInputStreamResult(str, str));
        }
    }

    public /* synthetic */ AWSS3StoragePathUploadInputStreamOperation(String str, AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i, id5 id5Var) {
        this(str, aWSS3StoragePathUploadRequest, storageService, executorService, authCredentialsProvider, (i & 32) != 0 ? null : transferObserver, (i & 64) != 0 ? null : consumer, (i & 128) != 0 ? null : consumer2, (i & 256) != 0 ? null : consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$6(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        sq8.m48649h(aWSS3StoragePathUploadInputStreamOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage upload InputStream operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$2(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        sq8.m48649h(aWSS3StoragePathUploadInputStreamOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage upload InputStream operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        sq8.m48649h(aWSS3StoragePathUploadInputStreamOperation, "this$0");
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage upload InputStream operation", e, "See attached exception for more information and suggestions"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        sq8.m48649h(aWSS3StoragePathUploadInputStreamOperation, "this$0");
        try {
            String str = (String) qm1.m45641b(null, new AWSS3StoragePathUploadInputStreamOperation$start$1$serviceKey$1(aWSS3StoragePathUploadInputStreamOperation, null), 1, null);
            try {
                InputStream local = aWSS3StoragePathUploadInputStreamOperation.request.getLocal();
                ObjectMetadata objectMetadata = new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null);
                objectMetadata.setUserMetadata(aWSS3StoragePathUploadInputStreamOperation.request.getMetadata());
                objectMetadata.getMetaData().put("Content-Type", aWSS3StoragePathUploadInputStreamOperation.request.getContentType());
                ServerSideEncryption serverSideEncryption = aWSS3StoragePathUploadInputStreamOperation.request.getServerSideEncryption();
                if (ServerSideEncryption.NONE != serverSideEncryption) {
                    objectMetadata.getMetaData().put(ObjectMetadata.SERVER_SIDE_ENCRYPTION, serverSideEncryption.getName());
                }
                TransferObserver transferObserverUploadInputStream = aWSS3StoragePathUploadInputStreamOperation.storageService.uploadInputStream(aWSS3StoragePathUploadInputStreamOperation.getTransferId(), str, local, objectMetadata, aWSS3StoragePathUploadInputStreamOperation.request.getUseAccelerateEndpoint());
                aWSS3StoragePathUploadInputStreamOperation.transferObserver = transferObserverUploadInputStream;
                if (transferObserverUploadInputStream != null) {
                    transferObserverUploadInputStream.setTransferListener(aWSS3StoragePathUploadInputStreamOperation.new UploadTransferListener());
                }
            } catch (Exception e) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    onError.accept(new StorageException("Issue uploading InputStream.", e, "See included exception for more details and suggestions to fix."));
                }
            }
        } catch (StorageException e2) {
            aWSS3StoragePathUploadInputStreamOperation.getOnError().accept(e2);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new Runnable() { // from class: o.w4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadInputStreamOperation.cancel$lambda$6(this.f51389a);
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
        this.executorService.submit(new Runnable() { // from class: o.t4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadInputStreamOperation.pause$lambda$2(this.f46336a);
            }
        });
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new Runnable() { // from class: o.v4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadInputStreamOperation.resume$lambda$4(this.f49836a);
            }
        });
    }

    @Override // com.amplifyframework.storage.operation.StorageUploadInputStreamOperation, com.amplifyframework.storage.operation.StorageUploadOperation, com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(Consumer<StorageUploadInputStreamResult> consumer) {
        super.setOnSuccess(consumer);
        TransferObserver transferObserver = this.transferObserver;
        String key = transferObserver != null ? transferObserver.getKey() : null;
        if (getTransferState() != TransferState.COMPLETED || key == null || consumer == null) {
            return;
        }
        consumer.accept(new StorageUploadInputStreamResult(key, key));
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        if (this.transferObserver != null) {
            return;
        }
        this.executorService.submit(new Runnable() { // from class: o.u4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathUploadInputStreamOperation.start$lambda$0(this.f48304a);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathUploadInputStreamOperation(String str, AWSS3StoragePathUploadRequest<InputStream> aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StoragePathUploadRequest, str, consumer, consumer2, consumer3);
        sq8.m48649h(str, "transferId");
        sq8.m48649h(aWSS3StoragePathUploadRequest, "request");
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        this.request = aWSS3StoragePathUploadRequest;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new UploadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePathUploadInputStreamOperation(AWSS3StoragePathUploadRequest<InputStream> aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
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
