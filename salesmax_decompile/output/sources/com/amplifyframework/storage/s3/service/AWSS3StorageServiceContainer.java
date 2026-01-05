package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amplifyframework.storage.ResolvedStorageBucket;
import com.amplifyframework.storage.s3.service.AWSS3StorageService;
import com.amplifyframework.storage.s3.transfer.S3StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.concurrent.ConcurrentHashMap;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSS3StorageServiceContainer {
    private final ConcurrentHashMap<String, AWSS3StorageService> awsS3StorageServicesByBucketName;
    private final StorageTransferClientProvider clientProvider;
    private final Context context;
    private final Object lock;
    private final AWSS3StorageService.Factory storageServiceFactory;

    public AWSS3StorageServiceContainer(Context context, AWSS3StorageService.Factory factory, StorageTransferClientProvider storageTransferClientProvider, ConcurrentHashMap<String, AWSS3StorageService> concurrentHashMap) {
        sq8.m48649h(context, "context");
        sq8.m48649h(factory, "storageServiceFactory");
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(concurrentHashMap, "awsS3StorageServicesByBucketName");
        this.context = context;
        this.storageServiceFactory = factory;
        this.clientProvider = storageTransferClientProvider;
        this.awsS3StorageServicesByBucketName = concurrentHashMap;
        this.lock = new Object();
    }

    public final AWSS3StorageService get(ResolvedStorageBucket resolvedStorageBucket) {
        AWSS3StorageService aWSS3StorageServiceCreate;
        sq8.m48649h(resolvedStorageBucket, "resolvedStorageBucket");
        synchronized (this.lock) {
            String bucketName = resolvedStorageBucket.getBucketInfo().getBucketName();
            aWSS3StorageServiceCreate = this.awsS3StorageServicesByBucketName.get(bucketName);
            if (aWSS3StorageServiceCreate == null) {
                aWSS3StorageServiceCreate = this.storageServiceFactory.create(this.context, resolvedStorageBucket.getBucketInfo().getRegion(), bucketName, this.clientProvider);
                this.awsS3StorageServicesByBucketName.put(bucketName, aWSS3StorageServiceCreate);
            }
        }
        return aWSS3StorageServiceCreate;
    }

    public final void put(String str, AWSS3StorageService aWSS3StorageService) {
        sq8.m48649h(str, "bucketName");
        sq8.m48649h(aWSS3StorageService, "service");
        synchronized (this.lock) {
            this.awsS3StorageServicesByBucketName.put(str, aWSS3StorageService);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageServiceContainer(Context context, AWSS3StorageService.Factory factory, S3StorageTransferClientProvider s3StorageTransferClientProvider) {
        this(context, factory, s3StorageTransferClientProvider, new ConcurrentHashMap());
        sq8.m48649h(context, "context");
        sq8.m48649h(factory, "storageServiceFactory");
        sq8.m48649h(s3StorageTransferClientProvider, "clientProvider");
    }

    public final AWSS3StorageService get(String str, String str2) {
        AWSS3StorageService aWSS3StorageServiceCreate;
        sq8.m48649h(str, "bucketName");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        synchronized (this.lock) {
            aWSS3StorageServiceCreate = this.awsS3StorageServicesByBucketName.get(str);
            if (aWSS3StorageServiceCreate == null) {
                aWSS3StorageServiceCreate = this.storageServiceFactory.create(this.context, str2, str, this.clientProvider);
                this.awsS3StorageServicesByBucketName.put(str, aWSS3StorageServiceCreate);
            }
        }
        return aWSS3StorageServiceCreate;
    }
}
