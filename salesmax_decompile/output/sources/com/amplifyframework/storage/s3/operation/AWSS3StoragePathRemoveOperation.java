package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathRemoveOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathRemoveRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathRemoveOperation extends StorageRemoveOperation<AWSS3StoragePathRemoveRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageRemoveResult> onSuccess;
    private final AWSS3StoragePathRemoveRequest request;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathRemoveOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePathRemoveRequest aWSS3StoragePathRemoveRequest, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StoragePathRemoveRequest);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePathRemoveRequest, "request");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.request = aWSS3StoragePathRemoveRequest;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathRemoveOperation aWSS3StoragePathRemoveOperation) {
        sq8.m48649h(aWSS3StoragePathRemoveOperation, "this$0");
        try {
            String str = (String) qm1.m45641b(null, new AWSS3StoragePathRemoveOperation$start$1$serviceKey$1(aWSS3StoragePathRemoveOperation, null), 1, null);
            try {
                aWSS3StoragePathRemoveOperation.storageService.deleteObject(str);
                aWSS3StoragePathRemoveOperation.onSuccess.accept(new StorageRemoveResult(str, str));
            } catch (Exception e) {
                aWSS3StoragePathRemoveOperation.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage remove operation", e, "See attached exception for more information and suggestions"));
            }
        } catch (StorageException e2) {
            aWSS3StoragePathRemoveOperation.onError.accept(e2);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: o.o4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathRemoveOperation.start$lambda$0(this.f37700a);
            }
        });
    }
}
