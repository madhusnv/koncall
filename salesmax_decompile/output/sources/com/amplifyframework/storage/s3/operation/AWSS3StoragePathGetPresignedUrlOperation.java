package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;
import p001o.qm1;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StoragePathGetPresignedUrlOperation extends StorageGetUrlOperation<AWSS3StoragePathGetPresignedUrlRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageGetUrlResult> onSuccess;
    private final AWSS3StoragePathGetPresignedUrlRequest request;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathGetPresignedUrlOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StoragePathGetPresignedUrlRequest);
        sq8.m48649h(storageService, "storageService");
        sq8.m48649h(executorService, "executorService");
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        sq8.m48649h(aWSS3StoragePathGetPresignedUrlRequest, "request");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.request = aWSS3StoragePathGetPresignedUrlRequest;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathGetPresignedUrlOperation aWSS3StoragePathGetPresignedUrlOperation) {
        sq8.m48649h(aWSS3StoragePathGetPresignedUrlOperation, "this$0");
        try {
            String str = (String) qm1.m45641b(null, new AWSS3StoragePathGetPresignedUrlOperation$start$1$serviceKey$1(aWSS3StoragePathGetPresignedUrlOperation, null), 1, null);
            if (aWSS3StoragePathGetPresignedUrlOperation.request.getValidateObjectExistence()) {
                try {
                    aWSS3StoragePathGetPresignedUrlOperation.storageService.validateObjectExists(str);
                } catch (StorageException e) {
                    aWSS3StoragePathGetPresignedUrlOperation.onError.accept(e);
                    return;
                } catch (Exception e2) {
                    aWSS3StoragePathGetPresignedUrlOperation.onError.accept(new StorageException("Encountered an issue while validating the existence of object", e2, "See included exception for more details and suggestions to fix."));
                    return;
                }
            }
            try {
                aWSS3StoragePathGetPresignedUrlOperation.onSuccess.accept(StorageGetUrlResult.fromUrl(aWSS3StoragePathGetPresignedUrlOperation.storageService.getPresignedUrl(str, aWSS3StoragePathGetPresignedUrlOperation.request.getExpires(), aWSS3StoragePathGetPresignedUrlOperation.request.getUseAccelerateEndpoint())));
            } catch (Exception e3) {
                aWSS3StoragePathGetPresignedUrlOperation.onError.accept(new StorageException("Encountered an issue while generating pre-signed URL", e3, "See included exception for more details and suggestions to fix."));
            }
        } catch (StorageException e4) {
            aWSS3StoragePathGetPresignedUrlOperation.onError.accept(e4);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: o.m4
            @Override // java.lang.Runnable
            public final void run() {
                AWSS3StoragePathGetPresignedUrlOperation.start$lambda$0(this.f34737a);
            }
        });
    }
}
