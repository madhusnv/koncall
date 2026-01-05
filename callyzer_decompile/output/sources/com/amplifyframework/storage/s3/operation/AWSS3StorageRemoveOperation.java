package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.C0989b;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageRemoveRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageRemoveOperation extends StorageRemoveOperation<AWSS3StorageRemoveRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageRemoveResult> onSuccess;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageRemoveOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageRemoveRequest aWSS3StorageRemoveRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageRemoveRequest);
        Objects.requireNonNull(aWSS3StorageRemoveRequest);
        Objects.requireNonNull(storageService);
        this.storageService = storageService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        Objects.requireNonNull(consumer);
        this.onSuccess = consumer;
        Objects.requireNonNull(consumer2);
        this.onError = consumer2;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(String str) {
        try {
            String strConcat = str.concat(getRequest().getKey());
            this.storageService.deleteObject(strConcat);
            this.onSuccess.accept(new StorageRemoveResult(strConcat, getRequest().getKey()));
        } catch (Exception e2) {
            AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage remove operation", e2, "See attached exception for more information and suggestions", this.onError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.authCredentialsProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new C0989b(4, this), this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new RunnableC0024w(11, this));
    }
}
