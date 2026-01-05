package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathListOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathListRequest;
import com.amplifyframework.storage.s3.service.AWSS3StorageService;
import java.util.concurrent.ExecutorService;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathListOperation extends StorageListOperation<AWSS3StoragePathListRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageListResult> onSuccess;
    private final AWSS3StoragePathListRequest request;
    private final AWSS3StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathListOperation(AWSS3StorageService aWSS3StorageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePathListRequest aWSS3StoragePathListRequest, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StoragePathListRequest);
        sq8.m48649h(aWSS3StorageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePathListRequest, "request");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.storageService = aWSS3StorageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.request = aWSS3StoragePathListRequest;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathListOperation aWSS3StoragePathListOperation) {
        sq8.m48649h(aWSS3StoragePathListOperation, "this$0");
        try {
            try {
                aWSS3StoragePathListOperation.onSuccess.accept(aWSS3StoragePathListOperation.storageService.listFiles((String) qm1.m45641b(null, new AWSS3StoragePathListOperation$start$1$serviceKey$1(aWSS3StoragePathListOperation, null), 1, null), aWSS3StoragePathListOperation.request.getPageSize(), aWSS3StoragePathListOperation.request.getNextToken(), aWSS3StoragePathListOperation.request.getSubpathStrategy()));
            } catch (Exception e) {
                aWSS3StoragePathListOperation.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage list operation", e, "See attached exception for more information and suggestions"));
            }
        } catch (StorageException e2) {
            aWSS3StoragePathListOperation.onError.accept(e2);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: o.n4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathListOperation.start$lambda$0(this.f36331a);
            }
        });
    }
}
