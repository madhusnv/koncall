package com.amplifyframework.storage.s3.operation;

import a2.AbstractC0030c;
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
import com.amplifyframework.storage.s3.request.AWSS3StoragePathUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathUploadInputStreamOperation extends StorageUploadInputStreamOperation<AWSS3StoragePathUploadRequest<InputStream>> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final AWSS3StoragePathUploadRequest<InputStream> request;
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public UploadTransferListener() {
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onError(int i10, Exception ex2) {
            AbstractC4154l.m8923f(ex2, "ex");
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, ex2));
            Consumer onError = AWSS3StoragePathUploadInputStreamOperation.this.getOnError();
            if (onError != null) {
                AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage upload InputStream operation", ex2, "See attached exception for more information and suggestions", onError);
            }
        }

        @Override // com.amplifyframework.storage.s3.transfer.TransferListener
        public void onProgressChanged(int i10, long j6, long j10) {
            Consumer onProgress = AWSS3StoragePathUploadInputStreamOperation.this.getOnProgress();
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
            if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] != 1 || (onSuccess = AWSS3StoragePathUploadInputStreamOperation.this.getOnSuccess()) == null) {
                return;
            }
            onSuccess.accept(new StorageUploadInputStreamResult(key, key));
        }
    }

    public /* synthetic */ AWSS3StoragePathUploadInputStreamOperation(String str, AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer consumer, Consumer consumer2, Consumer consumer3, int i10, AbstractC4148f abstractC4148f) {
        this(str, aWSS3StoragePathUploadRequest, storageService, executorService, authCredentialsProvider, (i10 & 32) != 0 ? null : transferObserver, (i10 & 64) != 0 ? null : consumer, (i10 & 128) != 0 ? null : consumer2, (i10 & 256) != 0 ? null : consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$6(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.cancelTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to cancel your AWS S3 Storage upload InputStream operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$2(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.pauseTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to pause your AWS S3 Storage upload InputStream operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        TransferObserver transferObserver = aWSS3StoragePathUploadInputStreamOperation.transferObserver;
        if (transferObserver != null) {
            try {
                aWSS3StoragePathUploadInputStreamOperation.storageService.resumeTransfer(transferObserver);
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Something went wrong while attempting to resume your AWS S3 Storage upload InputStream operation", e2, "See attached exception for more information and suggestions", onError);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation) {
        try {
            String str = (String) c0.m13468D(C7565i.f36440a, new AWSS3StoragePathUploadInputStreamOperation$start$1$serviceKey$1(aWSS3StoragePathUploadInputStreamOperation, null));
            try {
                InputStream local = aWSS3StoragePathUploadInputStreamOperation.request.getLocal();
                ObjectMetadata objectMetadata = new ObjectMetadata(null, null, null, null, null, null, null, 127, null);
                objectMetadata.setUserMetadata(aWSS3StoragePathUploadInputStreamOperation.request.getMetadata());
                objectMetadata.getMetaData().put(ObjectMetadata.CONTENT_TYPE, aWSS3StoragePathUploadInputStreamOperation.request.getContentType());
                ServerSideEncryption serverSideEncryption = aWSS3StoragePathUploadInputStreamOperation.request.getServerSideEncryption();
                if (ServerSideEncryption.NONE != serverSideEncryption) {
                    objectMetadata.getMetaData().put(ObjectMetadata.SERVER_SIDE_ENCRYPTION, serverSideEncryption.getName());
                }
                TransferObserver transferObserverUploadInputStream = aWSS3StoragePathUploadInputStreamOperation.storageService.uploadInputStream(aWSS3StoragePathUploadInputStreamOperation.getTransferId(), str, local, objectMetadata, aWSS3StoragePathUploadInputStreamOperation.request.getUseAccelerateEndpoint());
                aWSS3StoragePathUploadInputStreamOperation.transferObserver = transferObserverUploadInputStream;
                if (transferObserverUploadInputStream != null) {
                    transferObserverUploadInputStream.setTransferListener(aWSS3StoragePathUploadInputStreamOperation.new UploadTransferListener());
                }
            } catch (Exception e2) {
                Consumer<StorageException> onError = aWSS3StoragePathUploadInputStreamOperation.getOnError();
                if (onError != null) {
                    AbstractC0030c.m130u("Issue uploading InputStream.", e2, "See included exception for more details and suggestions to fix.", onError);
                }
            }
        } catch (StorageException e10) {
            aWSS3StoragePathUploadInputStreamOperation.getOnError().accept(e10);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.executorService.submit(new RunnableC1236d(this, 2));
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public TransferState getTransferState() {
        TransferState transferState;
        TransferObserver transferObserver = this.transferObserver;
        return (transferObserver == null || (transferState = transferObserver.getTransferState()) == null) ? TransferState.UNKNOWN : transferState;
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        this.executorService.submit(new RunnableC1236d(this, 0));
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        this.executorService.submit(new RunnableC1236d(this, 1));
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
        this.executorService.submit(new RunnableC1236d(this, 3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathUploadInputStreamOperation(String transferId, AWSS3StoragePathUploadRequest<InputStream> request, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, TransferObserver transferObserver, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        super(request, transferId, consumer, consumer2, consumer3);
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        this.request = request;
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.transferObserver = transferObserver;
        if (transferObserver != null) {
            transferObserver.setTransferListener(new UploadTransferListener());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePathUploadInputStreamOperation(AWSS3StoragePathUploadRequest<InputStream> request, StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, Consumer<StorageTransferProgress> onProgress, Consumer<StorageUploadInputStreamResult> onSuccess, Consumer<StorageException> onError) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(onProgress, "onProgress");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this(string, request, storageService, executorService, authCredentialsProvider, null, onProgress, onSuccess, onError);
    }
}
