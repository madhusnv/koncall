package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amplifyframework.storage.ResolvedStorageBucket;
import com.amplifyframework.storage.s3.service.AWSS3StorageService;
import com.amplifyframework.storage.s3.transfer.S3StorageTransferClientProvider;
import com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSS3StorageServiceContainer {
    private final ConcurrentHashMap<String, AWSS3StorageService> awsS3StorageServicesByBucketName;
    private final StorageTransferClientProvider clientProvider;
    private final Context context;
    private final Object lock;
    private final AWSS3StorageService.Factory storageServiceFactory;

    public AWSS3StorageServiceContainer(Context context, AWSS3StorageService.Factory storageServiceFactory, StorageTransferClientProvider clientProvider, ConcurrentHashMap<String, AWSS3StorageService> awsS3StorageServicesByBucketName) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(storageServiceFactory, "storageServiceFactory");
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(awsS3StorageServicesByBucketName, "awsS3StorageServicesByBucketName");
        this.context = context;
        this.storageServiceFactory = storageServiceFactory;
        this.clientProvider = clientProvider;
        this.awsS3StorageServicesByBucketName = awsS3StorageServicesByBucketName;
        this.lock = new Object();
    }

    public final AWSS3StorageService get(ResolvedStorageBucket resolvedStorageBucket) {
        AWSS3StorageService aWSS3StorageServiceCreate;
        AbstractC4154l.m8923f(resolvedStorageBucket, "resolvedStorageBucket");
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

    public final void put(String bucketName, AWSS3StorageService service) {
        AbstractC4154l.m8923f(bucketName, "bucketName");
        AbstractC4154l.m8923f(service, "service");
        synchronized (this.lock) {
            this.awsS3StorageServicesByBucketName.put(bucketName, service);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageServiceContainer(Context context, AWSS3StorageService.Factory storageServiceFactory, S3StorageTransferClientProvider clientProvider) {
        this(context, storageServiceFactory, clientProvider, new ConcurrentHashMap());
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(storageServiceFactory, "storageServiceFactory");
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
    }

    public final AWSS3StorageService get(String bucketName, String region) {
        AWSS3StorageService aWSS3StorageServiceCreate;
        AbstractC4154l.m8923f(bucketName, "bucketName");
        AbstractC4154l.m8923f(region, "region");
        synchronized (this.lock) {
            aWSS3StorageServiceCreate = this.awsS3StorageServicesByBucketName.get(bucketName);
            if (aWSS3StorageServiceCreate == null) {
                aWSS3StorageServiceCreate = this.storageServiceFactory.create(this.context, region, bucketName, this.clientProvider);
                this.awsS3StorageServicesByBucketName.put(bucketName, aWSS3StorageServiceCreate);
            }
        }
        return aWSS3StorageServiceCreate;
    }
}
