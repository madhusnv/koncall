package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathGetPresignedUrlOperation extends StorageGetUrlOperation<AWSS3StoragePathGetPresignedUrlRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageGetUrlResult> onSuccess;
    private final AWSS3StoragePathGetPresignedUrlRequest request;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathGetPresignedUrlOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePathGetPresignedUrlRequest request, Consumer<StorageGetUrlResult> onSuccess, Consumer<StorageException> onError) {
        super(request);
        AbstractC4154l.m8923f(storageService, "storageService");
        AbstractC4154l.m8923f(executorService, "executorService");
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.request = request;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(AWSS3StoragePathGetPresignedUrlOperation aWSS3StoragePathGetPresignedUrlOperation) {
        try {
            String str = (String) c0.m13468D(C7565i.f36440a, new AWSS3StoragePathGetPresignedUrlOperation$start$1$serviceKey$1(aWSS3StoragePathGetPresignedUrlOperation, null));
            if (aWSS3StoragePathGetPresignedUrlOperation.request.getValidateObjectExistence()) {
                try {
                    aWSS3StoragePathGetPresignedUrlOperation.storageService.validateObjectExists(str);
                } catch (StorageException e2) {
                    aWSS3StoragePathGetPresignedUrlOperation.onError.accept(e2);
                    return;
                } catch (Exception e10) {
                    AbstractC0030c.m130u("Encountered an issue while validating the existence of object", e10, "See included exception for more details and suggestions to fix.", aWSS3StoragePathGetPresignedUrlOperation.onError);
                    return;
                }
            }
            try {
                aWSS3StoragePathGetPresignedUrlOperation.onSuccess.accept(StorageGetUrlResult.fromUrl(aWSS3StoragePathGetPresignedUrlOperation.storageService.getPresignedUrl(str, aWSS3StoragePathGetPresignedUrlOperation.request.getExpires(), aWSS3StoragePathGetPresignedUrlOperation.request.getUseAccelerateEndpoint())));
            } catch (Exception e11) {
                AbstractC0030c.m130u("Encountered an issue while generating pre-signed URL", e11, "See included exception for more details and suggestions to fix.", aWSS3StoragePathGetPresignedUrlOperation.onError);
            }
        } catch (StorageException e12) {
            aWSS3StoragePathGetPresignedUrlOperation.onError.accept(e12);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new RunnableC0024w(8, this));
    }
}
