package com.amplifyframework.storage.s3.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StorageFilePermissionException;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.TransferOperations;
import com.amplifyframework.storage.s3.extensions.StorageExceptionExtensionsKt;
import com.amplifyframework.storage.s3.transfer.worker.RouterWorker;
import com.amplifyframework.storage.s3.transfer.worker.TransferWorkerFactory;
import i0.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import mb.a1;
import og.p1;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import t8.g0;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferManager {
    private final Logger logger;
    private final Handler mainHandler;
    private final String pluginKey;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;
    private final TransferWorkerObserver transferWorkerObserver;
    private final g0 workManager;

    /* JADX WARN: Illegal instructions before constructor call */
    public TransferManager(Context context, StorageTransferClientProvider storageTransferClientProvider, String str, g0 g0Var, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 8) != 0) {
            AbstractC4154l.m8923f(context, "context");
            g0Var = C7368p.m13783g(context);
        }
        this(context, storageTransferClientProvider, str, g0Var);
    }

    private final int createMultipartUploadRecords(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, a1 a1Var, boolean z6) {
        long length = file.length();
        double d2 = length;
        long jMax = Math.max((int) Math.ceil(d2 / 10000.0d), TransferRecord.MINIMUM_UPLOAD_PART_SIZE);
        int iCeil = (int) Math.ceil(d2 / jMax);
        ContentValues[] contentValuesArr = new ContentValues[iCeil + 1];
        contentValuesArr[0] = this.transferDB.generateContentValuesForMultiPartUpload(str, str2, str3, str4, file, 0L, 0, null, file.length(), 0, objectMetadata, a1Var, z6);
        int i10 = 1;
        long j6 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            long jMin = Math.min(jMax, length);
            TransferDB transferDB = this.transferDB;
            String string = UUID.randomUUID().toString();
            AbstractC4154l.m8922e(string, "toString(...)");
            length -= jMax;
            contentValuesArr[i10] = transferDB.generateContentValuesForMultiPartUpload(string, str2, str3, str4, file, j6, i10, "", jMin, length <= 0 ? 1 : 0, objectMetadata, a1Var, z6);
            i10++;
            j6 += jMax;
        }
        return this.transferDB.bulkInsertTransferRecords(contentValuesArr);
    }

    public static /* synthetic */ TransferObserver download$default(TransferManager transferManager, String str, String str2, String str3, String str4, File file, TransferListener transferListener, boolean z6, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            transferListener = null;
        }
        return transferManager.download(str, str2, str3, str4, file, transferListener, (i10 & 64) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$1(TransferManager transferManager, int i10) {
        transferManager.workManager.mo13357e(String.valueOf(i10)).m5316f(transferManager.transferWorkerObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4$lambda$3(TransferManager transferManager, int i10) {
        transferManager.workManager.mo13357e(String.valueOf(i10)).m5316f(transferManager.transferWorkerObserver);
    }

    private final boolean shouldUploadInMultipart(File file) {
        return file.length() > 5242880;
    }

    public static /* synthetic */ TransferObserver upload$default(TransferManager transferManager, String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, a1 a1Var, TransferListener transferListener, boolean z6, int i10, Object obj) {
        if ((i10 & 64) != 0) {
            a1Var = null;
        }
        if ((i10 & 128) != 0) {
            transferListener = null;
        }
        if ((i10 & 256) != 0) {
            z6 = false;
        }
        return transferManager.upload(str, str2, str3, str4, file, objectMetadata, a1Var, transferListener, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upload$lambda$0(TransferManager transferManager, int i10) {
        transferManager.workManager.mo13357e(String.valueOf(i10)).m5316f(transferManager.transferWorkerObserver);
    }

    private final File writeInputStreamToFile(InputStream inputStream) throws IOException {
        File fileCreateTempFile = File.createTempFile(TransferStatusUpdater.TEMP_FILE_PREFIX, ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            try {
                p1.m10811a(inputStream, fileOutputStream);
                fileOutputStream.close();
                AbstractC4154l.m8920c(fileCreateTempFile);
                return fileCreateTempFile;
            } catch (IOException e2) {
                fileCreateTempFile.delete();
                throw new IOException("Error writing the inputStream into a file,  " + e2);
            }
        } finally {
        }
    }

    public final boolean cancel(int i10) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i10));
        if (transferRecord != null) {
            return TransferOperations.INSTANCE.cancel$aws_storage_s3_release(transferRecord, this.pluginKey, this.transferStatusUpdater, this.workManager);
        }
        return false;
    }

    public final TransferObserver download(String transferId, String bucket, String region, String key, File file) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        return download$default(this, transferId, bucket, region, key, file, null, false, 96, null);
    }

    public final TransferRecord getTransferOperationById(String transferId) {
        AbstractC4154l.m8923f(transferId, "transferId");
        return this.transferDB.getTransferByTransferId(transferId);
    }

    public final TransferStatusUpdater getTransferStatusUpdater() {
        return this.transferStatusUpdater;
    }

    public final boolean pause(int i10) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i10));
        if (transferRecord != null) {
            return TransferOperations.INSTANCE.pause$aws_storage_s3_release(transferRecord, this.transferStatusUpdater, this.workManager);
        }
        return false;
    }

    public final boolean resume(int i10) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i10));
        if (transferRecord == null) {
            return false;
        }
        TransferOperations.INSTANCE.resume$aws_storage_s3_release(transferRecord, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB);
        return this.mainHandler.post(new RunnableC1254a(this, i10, 1));
    }

    public final TransferObserver upload(String transferId, String bucket, String region, String key, File file, ObjectMetadata metadata) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(metadata, "metadata");
        return upload$default(this, transferId, bucket, region, key, file, metadata, null, null, false, 448, null);
    }

    public final TransferObserver download(String transferId, String bucket, String region, String key, File file, TransferListener transferListener) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        return download$default(this, transferId, bucket, region, key, file, transferListener, false, 64, null);
    }

    public final TransferObserver upload(String transferId, String bucket, String region, String key, File file, ObjectMetadata metadata, a1 a1Var) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(metadata, "metadata");
        return upload$default(this, transferId, bucket, region, key, file, metadata, a1Var, null, false, KyberEngine.KyberPolyBytes, null);
    }

    public final TransferObserver download(String transferId, String bucket, String region, String key, File file, TransferListener transferListener, boolean z6) throws StorageException, NumberFormatException, IOException {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        Uri uriInsertSingleTransferRecord = this.transferDB.insertSingleTransferRecord(transferId, TransferType.DOWNLOAD, bucket, region, key, file, (BERTags.PRIVATE & 64) != 0 ? null : null, (BERTags.PRIVATE & 128) != 0 ? new ObjectMetadata(null, null, null, null, null, null, null, 127, null) : null, (BERTags.PRIVATE & 256) != 0 ? false : z6);
        String lastPathSegment = uriInsertSingleTransferRecord.getLastPathSegment();
        if (lastPathSegment != null) {
            int i10 = Integer.parseInt(lastPathSegment);
            if (file.isFile()) {
                if (file.canWrite()) {
                    this.logger.warn("Overwriting existing file: " + file);
                    file.delete();
                } else {
                    throw StorageExceptionExtensionsKt.unableToOverwriteFileException(StorageFilePermissionException.Companion);
                }
            }
            TransferRecord transferRecordById = this.transferDB.getTransferRecordById(i10);
            if (transferRecordById != null) {
                TransferObserver transferObserverStart$aws_storage_s3_release = TransferOperations.INSTANCE.start$aws_storage_s3_release(transferRecordById, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB, transferListener);
                this.mainHandler.post(new RunnableC1254a(this, i10, 2));
                return transferObserverStart$aws_storage_s3_release;
            }
            throw new IllegalStateException("Failed to find transferRecord");
        }
        throw new IllegalStateException(m0.m7378k("Invalid TransferRecord ID ", uriInsertSingleTransferRecord.getLastPathSegment()));
    }

    public final TransferObserver upload(String transferId, String bucket, String region, String key, File file, ObjectMetadata metadata, a1 a1Var, TransferListener transferListener) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(metadata, "metadata");
        return upload$default(this, transferId, bucket, region, key, file, metadata, a1Var, transferListener, false, 256, null);
    }

    public TransferManager(Context context, StorageTransferClientProvider clientProvider, String pluginKey, g0 workManager) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(clientProvider, "clientProvider");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(workManager, "workManager");
        this.pluginKey = pluginKey;
        this.workManager = workManager;
        TransferDB companion = TransferDB.Companion.getInstance(context);
        this.transferDB = companion;
        TransferStatusUpdater transferStatusUpdater = new TransferStatusUpdater(companion);
        this.transferStatusUpdater = transferStatusUpdater;
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"TransferManager"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
        this.transferWorkerObserver = TransferWorkerObserver.Companion.getInstance(context, pluginKey, workManager, transferStatusUpdater, companion);
        this.mainHandler = new Handler(Looper.getMainLooper());
        RouterWorker.Companion.getWorkerFactories().put(pluginKey, new TransferWorkerFactory(companion, clientProvider, transferStatusUpdater));
    }

    public final TransferObserver upload(String transferId, String bucket, String region, String key, File file, ObjectMetadata metadata, a1 a1Var, TransferListener transferListener, boolean z6) throws IOException, NumberFormatException {
        int iCreateMultipartUploadRecords;
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(metadata, "metadata");
        if (shouldUploadInMultipart(file)) {
            iCreateMultipartUploadRecords = createMultipartUploadRecords(transferId, bucket, region, key, file, metadata, a1Var, z6);
        } else {
            Uri uriInsertSingleTransferRecord = this.transferDB.insertSingleTransferRecord(transferId, TransferType.UPLOAD, bucket, region, key, file, a1Var, metadata, z6);
            String lastPathSegment = uriInsertSingleTransferRecord.getLastPathSegment();
            if (lastPathSegment == null) {
                throw new IllegalStateException(m0.m7378k("Invalid TransferRecord ID ", uriInsertSingleTransferRecord.getLastPathSegment()));
            }
            iCreateMultipartUploadRecords = Integer.parseInt(lastPathSegment);
        }
        TransferRecord transferRecordById = this.transferDB.getTransferRecordById(iCreateMultipartUploadRecords);
        if (transferRecordById != null) {
            TransferObserver transferObserverStart$aws_storage_s3_release = TransferOperations.INSTANCE.start$aws_storage_s3_release(transferRecordById, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB, transferListener);
            this.mainHandler.post(new RunnableC1254a(this, iCreateMultipartUploadRecords, 0));
            return transferObserverStart$aws_storage_s3_release;
        }
        throw new IllegalStateException("Failed to find transferRecord");
    }

    public final TransferObserver upload(String transferId, String key, InputStream inputStream, UploadOptions options, boolean z6) throws IOException {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(inputStream, "inputStream");
        AbstractC4154l.m8923f(options, "options");
        return upload(transferId, options.getBucket(), options.getRegion(), key, writeInputStreamToFile(inputStream), options.getObjectMetadata(), options.getCannedAcl(), options.getTransferListener(), z6);
    }
}
