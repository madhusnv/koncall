package com.amplifyframework.storage.s3.operation;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.C0989b;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.options.SubpathStrategy;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageListRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public final class AWSS3StorageListOperation extends StorageListOperation<AWSS3StorageListRequest> {
    private final AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageListResult> onSuccess;
    private final StorageService storageService;

    public AWSS3StorageListOperation(StorageService storageService, ExecutorService executorService, AuthCredentialsProvider authCredentialsProvider, AWSS3StorageListRequest aWSS3StorageListRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageListRequest);
        this.storageService = storageService;
        this.executorService = executorService;
        this.authCredentialsProvider = authCredentialsProvider;
        this.onSuccess = consumer;
        this.onError = consumer2;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(String str) {
        try {
            String strConcat = str.concat(getRequest().getPath());
            SubpathStrategy subpathStrategy = getRequest().getSubpathStrategy();
            if (getRequest().getPageSize() == -1) {
                this.onSuccess.accept(this.storageService.listFiles(strConcat, str, subpathStrategy));
            } else {
                this.onSuccess.accept(this.storageService.listFiles(strConcat, str, getRequest().getPageSize(), getRequest().getNextToken(), subpathStrategy));
            }
        } catch (Exception e2) {
            AbstractC0030c.m130u("Something went wrong with your AWS S3 Storage list operation", e2, "See attached exception for more information and suggestions", this.onError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.authCredentialsProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new C0989b(3, this), this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new RunnableC0024w(7, this));
    }
}
