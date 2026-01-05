package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageRemoveRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@Deprecated
/* loaded from: classes5.dex */
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
        } catch (Exception e) {
            this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage remove operation", e, "See attached exception for more information and suggestions"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.authCredentialsProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: o.b5
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f15540a.lambda$start$0((String) obj);
            }
        }, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: o.c5
            @Override // java.lang.Runnable
            public final void run() {
                this.f17310a.lambda$start$1();
            }
        });
    }
}
