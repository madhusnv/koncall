package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathListRequest;
import com.amplifyframework.storage.s3.service.AWSS3StorageService;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StoragePathListOperation extends StorageListOperation<AWSS3StoragePathListRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageListResult> onSuccess;
    private final AWSS3StoragePathListRequest request;
    private final AWSS3StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StoragePathListOperation(AWSS3StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePathListRequest request, Consumer<StorageListResult> onSuccess, Consumer<StorageException> onError) {
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
    public static final void start$lambda$0(AWSS3StoragePathListOperation aWSS3StoragePathListOperation) {
        try {
            try {
                aWSS3StoragePathListOperation.onSuccess.accept(aWSS3StoragePathListOperation.storageService.listFiles((String) c0.m13468D(C7565i.f36440a, new AWSS3StoragePathListOperation$start$1$serviceKey$1(aWSS3StoragePathListOperation, null)), aWSS3StoragePathListOperation.request.getPageSize(), aWSS3StoragePathListOperation.request.getNextToken(), aWSS3StoragePathListOperation.request.getSubpathStrategy()));
            } catch (Exception e2) {
                AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage list operation", e2, "See attached exception for more information and suggestions", aWSS3StoragePathListOperation.onError);
            }
        } catch (StorageException e10) {
            aWSS3StoragePathListOperation.onError.accept(e10);
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new RunnableC0024w(9, this));
    }
}
