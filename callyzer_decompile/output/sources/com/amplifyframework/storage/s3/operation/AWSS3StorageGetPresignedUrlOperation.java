package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import android.annotation.SuppressLint;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.C0989b;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlOperation extends StorageGetUrlOperation<AWSS3StorageGetPresignedUrlRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageGetUrlResult> onSuccess;
    private final StorageService storageService;

    public AWSS3StorageGetPresignedUrlOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageGetPresignedUrlRequest aWSS3StorageGetPresignedUrlRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageGetPresignedUrlRequest);
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(String str) {
        try {
            String strConcat = str.concat(getRequest().getKey());
            if (getRequest().validateObjectExistence()) {
                try {
                    this.storageService.validateObjectExists(strConcat);
                } catch (StorageException e2) {
                    this.onError.accept(e2);
                    return;
                }
            }
            this.onSuccess.accept(StorageGetUrlResult.fromUrl(this.storageService.getPresignedUrl(strConcat, getRequest().getExpires(), getRequest().useAccelerateEndpoint())));
        } catch (Exception e10) {
            AbstractC0030c.m130u("Encountered an issue while generating pre-signed URL", e10, "See included exception for more details and suggestions to fix.", this.onError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.authCredentialsProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new C0989b(2, this), this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        this.executorService.submit(new RunnableC0024w(6, this));
    }
}
