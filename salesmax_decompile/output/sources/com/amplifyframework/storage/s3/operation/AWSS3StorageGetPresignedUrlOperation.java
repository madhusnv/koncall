package com.amplifyframework.storage.s3.operation;

import android.annotation.SuppressLint;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;

@Deprecated
/* loaded from: classes5.dex */
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
                } catch (StorageException e) {
                    this.onError.accept(e);
                    return;
                }
            }
            this.onSuccess.accept(StorageGetUrlResult.fromUrl(this.storageService.getPresignedUrl(strConcat, getRequest().getExpires(), getRequest().useAccelerateEndpoint())));
        } catch (Exception e2) {
            this.onError.accept(new StorageException("Encountered an issue while generating pre-signed URL", e2, "See included exception for more details and suggestions to fix."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.authCredentialsProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: o.b4
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f15520a.lambda$start$0((String) obj);
            }
        }, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        this.executorService.submit(new Runnable() { // from class: o.c4
            @Override // java.lang.Runnable
            public final void run() {
                this.f17254a.lambda$start$1();
            }
        });
    }
}
