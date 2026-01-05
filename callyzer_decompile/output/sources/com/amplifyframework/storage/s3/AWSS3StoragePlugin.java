package com.amplifyframework.storage.s3;

import a1.d0;
import a2.AbstractC0030c;
import android.annotation.SuppressLint;
import android.content.Context;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NoOpConsumer;
import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.storage.BucketInfo;
import com.amplifyframework.storage.InvalidStorageBucketException;
import com.amplifyframework.storage.OutputsStorageBucket;
import com.amplifyframework.storage.ResolvedStorageBucket;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageBucket;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.StoragePlugin;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.operation.StorageTransferOperation;
import com.amplifyframework.storage.operation.StorageUploadFileOperation;
import com.amplifyframework.storage.operation.StorageUploadInputStreamOperation;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.options.StorageGetUrlOptions;
import com.amplifyframework.storage.options.StorageListOptions;
import com.amplifyframework.storage.options.StoragePagedListOptions;
import com.amplifyframework.storage.options.StorageRemoveOptions;
import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageTransferResult;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.operation.AWSS3StorageDownloadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageListOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathDownloadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathGetPresignedUrlOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathListOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathRemoveOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathUploadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathUploadInputStreamOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageRemoveOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadInputStreamOperation;
import com.amplifyframework.storage.s3.options.AWSS3StorageDownloadFileOptions;
import com.amplifyframework.storage.s3.options.AWSS3StorageGetPresignedUrlOptions;
import com.amplifyframework.storage.s3.options.AWSS3StorageUploadFileOptions;
import com.amplifyframework.storage.s3.options.AWSS3StorageUploadInputStreamOptions;
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageListRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathDownloadFileRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathListRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathRemoveRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathUploadRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageRemoveRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.amplifyframework.storage.s3.service.AWSS3StorageService;
import com.amplifyframework.storage.s3.service.AWSS3StorageServiceContainer;
import com.amplifyframework.storage.s3.transfer.S3StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.amplifyframework.storage.s3.transfer.TransferType;
import gb.InterfaceC2556f;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"UnsafeOptInUsageWarning"})
/* loaded from: classes.dex */
public final class AWSS3StoragePlugin extends StoragePlugin<InterfaceC2556f> {
    public static final String AWS_S3_STORAGE_LOG_NAMESPACE = "amplify:aws-s3-storage:%s";
    private static final String AWS_S3_STORAGE_PLUGIN_KEY = "awsS3StoragePlugin";
    private static final int DEFAULT_URL_EXPIRATION_DAYS = 7;
    private AuthCredentialsProvider authCredentialsProvider;
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private AWSS3StorageServiceContainer awss3StorageServiceContainer;

    @SuppressLint({"UnsafeOptInUsageError"})
    private StorageTransferClientProvider clientProvider;

    @SuppressLint({"UnsafeOptInUsageError"})
    private List<AmplifyOutputsData.StorageBucket> configuredBuckets;
    private StorageAccessLevel defaultAccessLevel;
    private AWSS3StorageService defaultStorageService;
    private int defaultUrlExpiration;
    private final ExecutorService executorService;
    private final AWSS3StorageService.Factory storageServiceFactory;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.storage.s3.AWSS3StoragePlugin$1 */
    public static /* synthetic */ class C12271 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$storage$s3$transfer$TransferType;

        static {
            int[] iArr = new int[TransferType.values().length];
            $SwitchMap$com$amplifyframework$storage$s3$transfer$TransferType = iArr;
            try {
                iArr[TransferType.UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$storage$s3$transfer$TransferType[TransferType.DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class GetStorageServiceResult {
        final StorageException storageException;
        final AWSS3StorageService storageService;

        public GetStorageServiceResult(AWSS3StorageService aWSS3StorageService, StorageException storageException) {
            this.storageService = aWSS3StorageService;
            this.storageException = storageException;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum JsonKeys {
        BUCKET("bucket"),
        REGION(TransferTable.COLUMN_REGION);

        private final String configurationKey;

        JsonKeys(String str) {
            this.configurationKey = str;
        }

        public String getConfigurationKey() {
            return this.configurationKey;
        }
    }

    public AWSS3StoragePlugin() {
        this(new CognitoCredentialsProvider());
    }

    private AWSS3StorageService getAwss3StorageServiceFromTransferRecord(Consumer<StorageException> consumer, TransferRecord transferRecord) {
        AWSS3StorageService aWSS3StorageService = this.defaultStorageService;
        if (transferRecord.getRegion() != null && transferRecord.getBucketName() != null) {
            try {
                return getStorageService(StorageBucket.fromBucketInfo(new BucketInfo(transferRecord.getBucketName(), transferRecord.getRegion())));
            } catch (StorageException e2) {
                consumer.accept(e2);
            }
        }
        return aWSS3StorageService;
    }

    private static void handleGetStorageServiceResult(Consumer<StorageException> consumer, GetStorageServiceResult getStorageServiceResult, AmplifyOperation<?> amplifyOperation) {
        StorageException storageException = getStorageServiceResult.storageException;
        if (storageException == null) {
            amplifyOperation.start();
        } else {
            consumer.accept(storageException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTransfer$3(String str, Consumer consumer, Consumer consumer2) {
        try {
            TransferRecord transfer = this.defaultStorageService.getTransfer(str);
            if (transfer == null) {
                consumer.accept(new StorageException("Get transfer failed", "Please verify that the transfer id is valid and the transfer is not completed"));
                return;
            }
            TransferObserver transferObserver = new TransferObserver(transfer.getId(), this.defaultStorageService.getTransferManager().getTransferStatusUpdater(), transfer.getBucketName(), transfer.getRegion(), transfer.getKey(), transfer.getFile(), null, transfer.getState() != null ? transfer.getState() : TransferState.UNKNOWN);
            TransferType type = transfer.getType();
            AWSS3StorageService awss3StorageServiceFromTransferRecord = getAwss3StorageServiceFromTransferRecord(consumer, transfer);
            int[] iArr = C12271.$SwitchMap$com$amplifyframework$storage$s3$transfer$TransferType;
            Objects.requireNonNull(type);
            int i10 = iArr[type.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                consumer2.accept(new AWSS3StorageDownloadFileOperation(str, new File(transfer.getFile()), awss3StorageServiceFromTransferRecord, this.executorService, this.authCredentialsProvider, this.awsS3StoragePluginConfiguration, (AWSS3StorageDownloadFileRequest) null, transferObserver));
            } else if (transfer.getFile().startsWith(TransferStatusUpdater.TEMP_FILE_PREFIX)) {
                consumer2.accept(new AWSS3StorageUploadInputStreamOperation(str, awss3StorageServiceFromTransferRecord, this.executorService, this.authCredentialsProvider, this.awsS3StoragePluginConfiguration, null, transferObserver));
            } else {
                consumer2.accept(new AWSS3StorageUploadFileOperation(str, awss3StorageServiceFromTransferRecord, this.executorService, this.authCredentialsProvider, this.awsS3StoragePluginConfiguration, null, transferObserver));
            }
        } catch (Exception e2) {
            AbstractC0030c.m130u("Get transfer failed", e2, "Please verify that the transfer id is valid and the transfer is not completed", consumer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC2556f lambda$new$0(String str, String str2) {
        if (str == null || str2 == null) {
            return str != null ? S3StorageTransferClientProvider.getS3Client(str, this.authCredentialsProvider) : this.defaultStorageService.getClient();
        }
        return this.awss3StorageServiceContainer.get((ResolvedStorageBucket) StorageBucket.fromBucketInfo(new BucketInfo(str2, str))).getClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AWSS3StorageService lambda$new$1(AuthCredentialsProvider authCredentialsProvider, Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider) {
        return new AWSS3StorageService(context, str, str2, authCredentialsProvider, AWS_S3_STORAGE_PLUGIN_KEY, storageTransferClientProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AWSS3StorageService lambda$new$2(AuthCredentialsProvider authCredentialsProvider, Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider) {
        return new AWSS3StorageService(context, str, str2, authCredentialsProvider, AWS_S3_STORAGE_PLUGIN_KEY, storageTransferClientProvider);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @SuppressLint({"UnsafeOptInUsageError"})
    public void configure(JSONObject jSONObject, Context context) throws JSONException, StorageException {
        try {
            String string = jSONObject.getString(JsonKeys.REGION.getConfigurationKey());
            if (string == null) {
                throw new StorageException("Invalid region provided", "Make sure the region you have configured for the AWS S3 Storage plugin is a value we support.");
            }
            try {
                configure(context, string, (ResolvedStorageBucket) StorageBucket.fromBucketInfo(new BucketInfo(jSONObject.getString(JsonKeys.BUCKET.getConfigurationKey()), string)));
            } catch (JSONException e2) {
                throw new StorageException("Missing or malformed value for bucket in awsS3StoragePluginconfiguration.", e2, "Check the attached error to see where the parsing issue took place.");
            }
        } catch (NullPointerException unused) {
            throw new StorageException("Missing configuration for awsS3StoragePlugin", "Check amplifyconfiguration.json to make sure that there is a section for awsS3StoragePlugin under the storage category.");
        } catch (JSONException e10) {
            throw new StorageException("Missing or malformed value for Region in awsS3StoragePluginconfiguration.", e10, "Check the attached error to see where the parsing issue took place.");
        }
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return downloadFile(str, file, StorageDownloadFileOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_S3_STORAGE_PLUGIN_KEY;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public AWSS3StorageService getStorageService(StorageBucket storageBucket) throws StorageException {
        if (storageBucket == null) {
            return this.defaultStorageService;
        }
        if (!(storageBucket instanceof OutputsStorageBucket)) {
            return storageBucket instanceof ResolvedStorageBucket ? this.awss3StorageServiceContainer.get((ResolvedStorageBucket) storageBucket) : this.defaultStorageService;
        }
        List<AmplifyOutputsData.StorageBucket> list = this.configuredBuckets;
        if (list != null && !list.isEmpty()) {
            String name = ((OutputsStorageBucket) storageBucket).getName();
            for (AmplifyOutputsData.StorageBucket storageBucket2 : this.configuredBuckets) {
                if (storageBucket2.getName().equals(name)) {
                    return this.awss3StorageServiceContainer.get(storageBucket2.getBucketName(), storageBucket2.getAwsRegion());
                }
            }
        }
        throw new StorageException("Unable to find bucket from name in Amplify Outputs.", new InvalidStorageBucketException(), "Ensure the bucket name used is available in Amplify Outputs.");
    }

    public GetStorageServiceResult getStorageServiceResult(StorageBucket storageBucket) {
        AWSS3StorageService storageService = this.defaultStorageService;
        try {
            storageService = getStorageService(storageBucket);
            e = null;
        } catch (StorageException e2) {
            e = e2;
        }
        return new GetStorageServiceResult(storageService, e);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @SuppressLint({"UnsafeOptInUsageError"})
    public void getTransfer(String str, Consumer<StorageTransferOperation<?, ? extends StorageTransferResult>> consumer, Consumer<StorageException> consumer2) {
        this.executorService.submit(new d0(this, str, consumer2, consumer, 2));
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(String str, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getUrl(str, StorageGetUrlOptions.defaultInstance(), consumer, consumer2);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.29.2";
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageListOperation<?> list(String str, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return list(str, StorageListOptions.defaultInstance(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(String str, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return remove(str, StorageRemoveOptions.defaultInstance(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(String str, File file, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return uploadFile(str, file, StorageUploadFileOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return uploadInputStream(str, inputStream, StorageUploadInputStreamOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    public AWSS3StoragePlugin(AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration) {
        this(new CognitoCredentialsProvider(), aWSS3StoragePluginConfiguration);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public InterfaceC2556f getEscapeHatch() {
        return this.defaultStorageService.getClient();
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(StoragePath storagePath, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getUrl(storagePath, StorageGetUrlOptions.defaultInstance(), consumer, consumer2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageListOperation<?> list(String str, StorageListOptions storageListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return list(str, ((StoragePagedListOptions.Builder) ((StoragePagedListOptions.Builder) StoragePagedListOptions.builder().accessLevel(storageListOptions.getAccessLevel())).targetIdentityId(storageListOptions.getTargetIdentityId())).setPageSize(-1).build(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(StoragePath storagePath, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return remove(storagePath, StorageRemoveOptions.defaultInstance(), consumer, consumer2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePlugin(final AuthCredentialsProvider authCredentialsProvider) {
        final int i10 = 1;
        this(new AWSS3StorageService.Factory() { // from class: com.amplifyframework.storage.s3.a
            @Override // com.amplifyframework.storage.s3.service.AWSS3StorageService.Factory
            public final AWSS3StorageService create(Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider) {
                switch (i10) {
                    case 0:
                        return AWSS3StoragePlugin.lambda$new$2(authCredentialsProvider, context, str, str2, storageTransferClientProvider);
                    default:
                        return AWSS3StoragePlugin.lambda$new$1(authCredentialsProvider, context, str, str2, storageTransferClientProvider);
                }
            }
        }, authCredentialsProvider, new AWSS3StoragePluginConfiguration.Builder().build());
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return downloadFile(storagePath, file, StorageDownloadFileOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(String str, StorageGetUrlOptions storageGetUrlOptions, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        StorageAccessLevel accessLevel;
        int expires;
        boolean z6 = storageGetUrlOptions instanceof AWSS3StorageGetPresignedUrlOptions;
        boolean z10 = z6 && ((AWSS3StorageGetPresignedUrlOptions) storageGetUrlOptions).useAccelerateEndpoint();
        boolean z11 = z6 && ((AWSS3StorageGetPresignedUrlOptions) storageGetUrlOptions).getValidateObjectExistence();
        if (storageGetUrlOptions.getAccessLevel() != null) {
            accessLevel = storageGetUrlOptions.getAccessLevel();
        } else {
            accessLevel = this.defaultAccessLevel;
        }
        StorageAccessLevel storageAccessLevel = accessLevel;
        String targetIdentityId = storageGetUrlOptions.getTargetIdentityId();
        if (storageGetUrlOptions.getExpires() != 0) {
            expires = storageGetUrlOptions.getExpires();
        } else {
            expires = this.defaultUrlExpiration;
        }
        AWSS3StorageGetPresignedUrlRequest aWSS3StorageGetPresignedUrlRequest = new AWSS3StorageGetPresignedUrlRequest(str, storageAccessLevel, targetIdentityId, expires, z10, z11);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageGetUrlOptions.getBucket());
        AWSS3StorageGetPresignedUrlOperation aWSS3StorageGetPresignedUrlOperation = new AWSS3StorageGetPresignedUrlOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StorageGetPresignedUrlRequest, this.awsS3StoragePluginConfiguration, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StorageGetPresignedUrlOperation);
        return aWSS3StorageGetPresignedUrlOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(String str, StorageRemoveOptions storageRemoveOptions, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        StorageAccessLevel accessLevel;
        if (storageRemoveOptions.getAccessLevel() != null) {
            accessLevel = storageRemoveOptions.getAccessLevel();
        } else {
            accessLevel = this.defaultAccessLevel;
        }
        AWSS3StorageRemoveRequest aWSS3StorageRemoveRequest = new AWSS3StorageRemoveRequest(str, accessLevel, storageRemoveOptions.getTargetIdentityId());
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageRemoveOptions.getBucket());
        AWSS3StorageRemoveOperation aWSS3StorageRemoveOperation = new AWSS3StorageRemoveOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StorageRemoveRequest, this.awsS3StoragePluginConfiguration, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StorageRemoveOperation);
        return aWSS3StorageRemoveOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return uploadFile(storagePath, file, StorageUploadFileOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return uploadInputStream(storagePath, inputStream, StorageUploadInputStreamOptions.defaultInstance(), NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return downloadFile(str, file, storageDownloadFileOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return uploadFile(str, file, storageUploadFileOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return uploadInputStream(str, inputStream, storageUploadInputStreamOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AWSS3StoragePlugin(final AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration) {
        final int i10 = 0;
        this(new AWSS3StorageService.Factory() { // from class: com.amplifyframework.storage.s3.a
            @Override // com.amplifyframework.storage.s3.service.AWSS3StorageService.Factory
            public final AWSS3StorageService create(Context context, String str, String str2, StorageTransferClientProvider storageTransferClientProvider) {
                switch (i10) {
                    case 0:
                        return AWSS3StoragePlugin.lambda$new$2(authCredentialsProvider, context, str, str2, storageTransferClientProvider);
                    default:
                        return AWSS3StoragePlugin.lambda$new$1(authCredentialsProvider, context, str, str2, storageTransferClientProvider);
                }
            }
        }, authCredentialsProvider, aWSS3StoragePluginConfiguration);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return downloadFile(storagePath, file, storageDownloadFileOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return uploadFile(storagePath, file, storageUploadFileOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return uploadInputStream(storagePath, inputStream, storageUploadInputStreamOptions, NoOpConsumer.create(), consumer, consumer2);
    }

    public AWSS3StoragePlugin(AWSS3StorageService.Factory factory, AuthCredentialsProvider authCredentialsProvider, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration) {
        this.clientProvider = new S3StorageTransferClientProvider(new C1230b(0, this));
        this.storageServiceFactory = factory;
        this.executorService = Executors.newCachedThreadPool();
        this.authCredentialsProvider = authCredentialsProvider;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        StorageAccessLevel accessLevel;
        boolean z6 = (storageDownloadFileOptions instanceof AWSS3StorageDownloadFileOptions) && ((AWSS3StorageDownloadFileOptions) storageDownloadFileOptions).useAccelerateEndpoint();
        if (storageDownloadFileOptions.getAccessLevel() != null) {
            accessLevel = storageDownloadFileOptions.getAccessLevel();
        } else {
            accessLevel = this.defaultAccessLevel;
        }
        AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest = new AWSS3StorageDownloadFileRequest(str, file, accessLevel, storageDownloadFileOptions.getTargetIdentityId(), z6);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageDownloadFileOptions.getBucket());
        AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation = new AWSS3StorageDownloadFileOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StorageDownloadFileRequest, this.awsS3StoragePluginConfiguration, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StorageDownloadFileOperation);
        return aWSS3StorageDownloadFileOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        StorageAccessLevel accessLevel;
        ServerSideEncryption serverSideEncryption;
        boolean z6 = (storageUploadFileOptions instanceof AWSS3StorageUploadFileOptions) && ((AWSS3StorageUploadFileOptions) storageUploadFileOptions).useAccelerateEndpoint();
        if (storageUploadFileOptions.getAccessLevel() != null) {
            accessLevel = storageUploadFileOptions.getAccessLevel();
        } else {
            accessLevel = this.defaultAccessLevel;
        }
        StorageAccessLevel storageAccessLevel = accessLevel;
        String targetIdentityId = storageUploadFileOptions.getTargetIdentityId();
        String contentType = storageUploadFileOptions.getContentType();
        if (storageUploadFileOptions instanceof AWSS3StorageUploadFileOptions) {
            serverSideEncryption = ((AWSS3StorageUploadFileOptions) storageUploadFileOptions).getServerSideEncryption();
        } else {
            serverSideEncryption = ServerSideEncryption.NONE;
        }
        AWSS3StorageUploadRequest aWSS3StorageUploadRequest = new AWSS3StorageUploadRequest(str, file, storageAccessLevel, targetIdentityId, contentType, serverSideEncryption, storageUploadFileOptions.getMetadata(), z6);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageUploadFileOptions.getBucket());
        AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation = new AWSS3StorageUploadFileOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, (AWSS3StorageUploadRequest<File>) aWSS3StorageUploadRequest, this.awsS3StoragePluginConfiguration, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StorageUploadFileOperation);
        return aWSS3StorageUploadFileOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        StorageAccessLevel accessLevel;
        ServerSideEncryption serverSideEncryption;
        boolean z6 = (storageUploadInputStreamOptions instanceof AWSS3StorageUploadInputStreamOptions) && ((AWSS3StorageUploadInputStreamOptions) storageUploadInputStreamOptions).useAccelerateEndpoint();
        if (storageUploadInputStreamOptions.getAccessLevel() != null) {
            accessLevel = storageUploadInputStreamOptions.getAccessLevel();
        } else {
            accessLevel = this.defaultAccessLevel;
        }
        StorageAccessLevel storageAccessLevel = accessLevel;
        String targetIdentityId = storageUploadInputStreamOptions.getTargetIdentityId();
        String contentType = storageUploadInputStreamOptions.getContentType();
        if (storageUploadInputStreamOptions instanceof AWSS3StorageUploadInputStreamOptions) {
            serverSideEncryption = ((AWSS3StorageUploadInputStreamOptions) storageUploadInputStreamOptions).getServerSideEncryption();
        } else {
            serverSideEncryption = ServerSideEncryption.NONE;
        }
        AWSS3StorageUploadRequest aWSS3StorageUploadRequest = new AWSS3StorageUploadRequest(str, inputStream, storageAccessLevel, targetIdentityId, contentType, serverSideEncryption, storageUploadInputStreamOptions.getMetadata(), z6);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageUploadInputStreamOptions.getBucket());
        AWSS3StorageUploadInputStreamOperation aWSS3StorageUploadInputStreamOperation = new AWSS3StorageUploadInputStreamOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, this.awsS3StoragePluginConfiguration, (AWSS3StorageUploadRequest<InputStream>) aWSS3StorageUploadRequest, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StorageUploadInputStreamOperation);
        return aWSS3StorageUploadInputStreamOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageListOperation<?> list(String str, StoragePagedListOptions storagePagedListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        AWSS3StorageListRequest aWSS3StorageListRequest = new AWSS3StorageListRequest(str, storagePagedListOptions.getAccessLevel() != null ? storagePagedListOptions.getAccessLevel() : this.defaultAccessLevel, storagePagedListOptions.getTargetIdentityId(), storagePagedListOptions.getPageSize(), storagePagedListOptions.getNextToken(), storagePagedListOptions.getSubpathStrategy());
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storagePagedListOptions.getBucket());
        AWSS3StorageListOperation aWSS3StorageListOperation = new AWSS3StorageListOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StorageListRequest, this.awsS3StoragePluginConfiguration, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StorageListOperation);
        return aWSS3StorageListOperation;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @InternalAmplifyApi
    public void configure(AmplifyOutputsData amplifyOutputsData, Context context) throws StorageException {
        AmplifyOutputsData.Storage storage = amplifyOutputsData.getStorage();
        if (storage != null) {
            this.configuredBuckets = storage.getBuckets();
            configure(context, storage.getAwsRegion(), (ResolvedStorageBucket) StorageBucket.fromBucketInfo(new BucketInfo(storage.getBucketName(), storage.getAwsRegion())));
            return;
        }
        throw new StorageException("Missing storage configuration", "Ensure that storage configuration is present in your Amplify Outputs");
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        AWSS3StoragePathRemoveRequest aWSS3StoragePathRemoveRequest = new AWSS3StoragePathRemoveRequest(storagePath);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageRemoveOptions.getBucket());
        AWSS3StoragePathRemoveOperation aWSS3StoragePathRemoveOperation = new AWSS3StoragePathRemoveOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StoragePathRemoveRequest, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StoragePathRemoveOperation);
        return aWSS3StoragePathRemoveOperation;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private void configure(Context context, String str, ResolvedStorageBucket resolvedStorageBucket) throws StorageException {
        try {
            this.defaultStorageService = this.storageServiceFactory.create(context, str, resolvedStorageBucket.getBucketInfo().getBucketName(), this.clientProvider);
            AWSS3StorageServiceContainer aWSS3StorageServiceContainer = new AWSS3StorageServiceContainer(context, this.storageServiceFactory, (S3StorageTransferClientProvider) this.clientProvider);
            this.awss3StorageServiceContainer = aWSS3StorageServiceContainer;
            aWSS3StorageServiceContainer.put(resolvedStorageBucket.getBucketInfo().getBucketName(), this.defaultStorageService);
            this.defaultAccessLevel = StorageAccessLevel.PUBLIC;
            this.defaultUrlExpiration = (int) TimeUnit.DAYS.toSeconds(7L);
        } catch (RuntimeException e2) {
            throw new StorageException("Failed to create storage service.", e2, "Did you make sure to add AWSCognitoAuthPlugin to Amplify? Check the attached exception for more details.");
        }
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        AWSS3StoragePathDownloadFileRequest aWSS3StoragePathDownloadFileRequest = new AWSS3StoragePathDownloadFileRequest(storagePath, file, (storageDownloadFileOptions instanceof AWSS3StorageDownloadFileOptions) && ((AWSS3StorageDownloadFileOptions) storageDownloadFileOptions).useAccelerateEndpoint());
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageDownloadFileOptions.getBucket());
        AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation = new AWSS3StoragePathDownloadFileOperation(aWSS3StoragePathDownloadFileRequest, storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StoragePathDownloadFileOperation);
        return aWSS3StoragePathDownloadFileOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageListOperation<?> list(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        AWSS3StoragePathListRequest aWSS3StoragePathListRequest = new AWSS3StoragePathListRequest(storagePath, storagePagedListOptions.getPageSize(), storagePagedListOptions.getNextToken(), storagePagedListOptions.getSubpathStrategy());
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storagePagedListOptions.getBucket());
        AWSS3StoragePathListOperation aWSS3StoragePathListOperation = new AWSS3StoragePathListOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StoragePathListRequest, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StoragePathListOperation);
        return aWSS3StoragePathListOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        boolean z6 = storageGetUrlOptions instanceof AWSS3StorageGetPresignedUrlOptions;
        boolean z10 = false;
        boolean z11 = z6 && ((AWSS3StorageGetPresignedUrlOptions) storageGetUrlOptions).useAccelerateEndpoint();
        if (z6 && ((AWSS3StorageGetPresignedUrlOptions) storageGetUrlOptions).getValidateObjectExistence()) {
            z10 = true;
        }
        AWSS3StoragePathGetPresignedUrlRequest aWSS3StoragePathGetPresignedUrlRequest = new AWSS3StoragePathGetPresignedUrlRequest(storagePath, storageGetUrlOptions.getExpires() != 0 ? storageGetUrlOptions.getExpires() : this.defaultUrlExpiration, z11, z10);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageGetUrlOptions.getBucket());
        AWSS3StoragePathGetPresignedUrlOperation aWSS3StoragePathGetPresignedUrlOperation = new AWSS3StoragePathGetPresignedUrlOperation(storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, aWSS3StoragePathGetPresignedUrlRequest, consumer, consumer2);
        handleGetStorageServiceResult(consumer2, storageServiceResult, aWSS3StoragePathGetPresignedUrlOperation);
        return aWSS3StoragePathGetPresignedUrlOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        ServerSideEncryption serverSideEncryption;
        boolean z6 = (storageUploadFileOptions instanceof AWSS3StorageUploadFileOptions) && ((AWSS3StorageUploadFileOptions) storageUploadFileOptions).useAccelerateEndpoint();
        String contentType = storageUploadFileOptions.getContentType();
        if (storageUploadFileOptions instanceof AWSS3StorageUploadFileOptions) {
            serverSideEncryption = ((AWSS3StorageUploadFileOptions) storageUploadFileOptions).getServerSideEncryption();
        } else {
            serverSideEncryption = ServerSideEncryption.NONE;
        }
        AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest = new AWSS3StoragePathUploadRequest(storagePath, file, contentType, serverSideEncryption, storageUploadFileOptions.getMetadata(), z6);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageUploadFileOptions.getBucket());
        AWSS3StoragePathUploadFileOperation aWSS3StoragePathUploadFileOperation = new AWSS3StoragePathUploadFileOperation(aWSS3StoragePathUploadRequest, storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StoragePathUploadFileOperation);
        return aWSS3StoragePathUploadFileOperation;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        ServerSideEncryption serverSideEncryption;
        boolean z6 = (storageUploadInputStreamOptions instanceof AWSS3StorageUploadInputStreamOptions) && ((AWSS3StorageUploadInputStreamOptions) storageUploadInputStreamOptions).useAccelerateEndpoint();
        String contentType = storageUploadInputStreamOptions.getContentType();
        if (storageUploadInputStreamOptions instanceof AWSS3StorageUploadInputStreamOptions) {
            serverSideEncryption = ((AWSS3StorageUploadInputStreamOptions) storageUploadInputStreamOptions).getServerSideEncryption();
        } else {
            serverSideEncryption = ServerSideEncryption.NONE;
        }
        AWSS3StoragePathUploadRequest aWSS3StoragePathUploadRequest = new AWSS3StoragePathUploadRequest(storagePath, inputStream, contentType, serverSideEncryption, storageUploadInputStreamOptions.getMetadata(), z6);
        GetStorageServiceResult storageServiceResult = getStorageServiceResult(storageUploadInputStreamOptions.getBucket());
        AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation = new AWSS3StoragePathUploadInputStreamOperation(aWSS3StoragePathUploadRequest, storageServiceResult.storageService, this.executorService, this.authCredentialsProvider, consumer, consumer2, consumer3);
        handleGetStorageServiceResult(consumer3, storageServiceResult, aWSS3StoragePathUploadInputStreamOperation);
        return aWSS3StoragePathUploadInputStreamOperation;
    }
}
