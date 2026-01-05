package com.amplifyframework.storage.s3.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkManager;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.TransferOperations;
import com.amplifyframework.storage.s3.transfer.TransferManager;
import com.amplifyframework.storage.s3.transfer.worker.RouterWorker;
import com.amplifyframework.storage.s3.transfer.worker.TransferWorkerFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.UUID;
import org.objectweb.asm.Opcodes;
import p001o.h6c;
import p001o.id5;
import p001o.sq8;
import p001o.tb3;
import p001o.wq1;

/* loaded from: classes5.dex */
public final class TransferManager {
    private final Logger logger;
    private final Handler mainHandler;
    private final String pluginKey;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;
    private final TransferWorkerObserver transferWorkerObserver;
    private final WorkManager workManager;

    public TransferManager(Context context, StorageTransferClientProvider storageTransferClientProvider, String str, WorkManager workManager) {
        sq8.m48649h(context, "context");
        sq8.m48649h(storageTransferClientProvider, "clientProvider");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(workManager, "workManager");
        this.pluginKey = str;
        this.workManager = workManager;
        TransferDB companion = TransferDB.Companion.getInstance(context);
        this.transferDB = companion;
        TransferStatusUpdater transferStatusUpdater = new TransferStatusUpdater(companion);
        this.transferStatusUpdater = transferStatusUpdater;
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str2 = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{TransferManager.class.getSimpleName()}, 1));
        sq8.m48648g(str2, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str2);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
        this.transferWorkerObserver = TransferWorkerObserver.Companion.getInstance(context, str, workManager, transferStatusUpdater, companion);
        this.mainHandler = new Handler(Looper.getMainLooper());
        RouterWorker.Companion.getWorkerFactories().put(str, new TransferWorkerFactory(companion, storageTransferClientProvider, transferStatusUpdater));
    }

    private final int createMultipartUploadRecords(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, boolean z) {
        long length = file.length();
        double d = length;
        long jMax = Math.max((int) Math.ceil(d / 10000.0d), TransferRecord.MINIMUM_UPLOAD_PART_SIZE);
        int iCeil = (int) Math.ceil(d / jMax);
        ContentValues[] contentValuesArr = new ContentValues[iCeil + 1];
        contentValuesArr[0] = this.transferDB.generateContentValuesForMultiPartUpload(str, str2, str3, str4, file, 0L, 0, null, file.length(), 0, objectMetadata, h6cVar, z);
        int i = 1;
        long j = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            long jMin = Math.min(jMax, length);
            TransferDB transferDB = this.transferDB;
            String string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
            length -= jMax;
            contentValuesArr[i] = transferDB.generateContentValuesForMultiPartUpload(string, str2, str3, str4, file, j, i, "", jMin, length <= 0 ? 1 : 0, objectMetadata, h6cVar, z);
            i++;
            j += jMax;
        }
        return this.transferDB.bulkInsertTransferRecords(contentValuesArr);
    }

    public static /* synthetic */ TransferObserver download$default(TransferManager transferManager, String str, String str2, String str3, String str4, File file, TransferListener transferListener, boolean z, int i, Object obj) {
        return transferManager.download(str, str2, str3, str4, file, (i & 32) != 0 ? null : transferListener, (i & 64) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$1(TransferManager transferManager, int i) {
        sq8.m48649h(transferManager, "this$0");
        transferManager.workManager.getWorkInfosForUniqueWorkLiveData(String.valueOf(i)).observeForever(transferManager.transferWorkerObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$4$lambda$3(TransferManager transferManager, int i) {
        sq8.m48649h(transferManager, "this$0");
        transferManager.workManager.getWorkInfosForUniqueWorkLiveData(String.valueOf(i)).observeForever(transferManager.transferWorkerObserver);
    }

    private final boolean shouldUploadInMultipart(File file) {
        return file.length() > 5242880;
    }

    public static /* synthetic */ TransferObserver upload$default(TransferManager transferManager, String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener, boolean z, int i, Object obj) {
        return transferManager.upload(str, str2, str3, str4, file, objectMetadata, (i & 64) != 0 ? null : h6cVar, (i & 128) != 0 ? null : transferListener, (i & 256) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upload$lambda$0(TransferManager transferManager, int i) {
        sq8.m48649h(transferManager, "this$0");
        transferManager.workManager.getWorkInfosForUniqueWorkLiveData(String.valueOf(i)).observeForever(transferManager.transferWorkerObserver);
    }

    private final File writeInputStreamToFile(InputStream inputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File fileCreateTempFile = File.createTempFile(TransferStatusUpdater.TEMP_FILE_PREFIX, ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            try {
                wq1.m54801b(inputStream, fileOutputStream, 0, 2, null);
                tb3.m49666a(fileOutputStream, null);
                sq8.m48646e(fileCreateTempFile);
                return fileCreateTempFile;
            } catch (IOException e) {
                fileCreateTempFile.delete();
                throw new IOException("Error writing the inputStream into a file,  " + e);
            }
        } finally {
        }
    }

    public final boolean cancel(int i) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i));
        if (transferRecord != null) {
            return TransferOperations.INSTANCE.cancel$aws_storage_s3_release(transferRecord, this.pluginKey, this.transferStatusUpdater, this.workManager);
        }
        return false;
    }

    public final TransferObserver download(String str, String str2, String str3, String str4, File file) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        return download$default(this, str, str2, str3, str4, file, null, false, 96, null);
    }

    public final TransferRecord getTransferOperationById(String str) {
        sq8.m48649h(str, "transferId");
        return this.transferDB.getTransferByTransferId(str);
    }

    public final TransferStatusUpdater getTransferStatusUpdater() {
        return this.transferStatusUpdater;
    }

    public final boolean pause(int i) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i));
        if (transferRecord != null) {
            return TransferOperations.INSTANCE.pause$aws_storage_s3_release(transferRecord, this.transferStatusUpdater, this.workManager);
        }
        return false;
    }

    public final boolean resume(final int i) {
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i));
        if (transferRecord == null) {
            return false;
        }
        TransferOperations.INSTANCE.resume$aws_storage_s3_release(transferRecord, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB);
        return this.mainHandler.post(new Runnable() { // from class: o.luh
            @Override // java.lang.Runnable
            public final void run() {
                TransferManager.resume$lambda$4$lambda$3(this.f34378a, i);
            }
        });
    }

    public final TransferObserver upload(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(objectMetadata, "metadata");
        return upload$default(this, str, str2, str3, str4, file, objectMetadata, null, null, false, 448, null);
    }

    public final TransferObserver download(String str, String str2, String str3, String str4, File file, TransferListener transferListener) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        return download$default(this, str, str2, str3, str4, file, transferListener, false, 64, null);
    }

    public final TransferObserver upload(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(objectMetadata, "metadata");
        return upload$default(this, str, str2, str3, str4, file, objectMetadata, h6cVar, null, false, 384, null);
    }

    public final TransferObserver download(String str, String str2, String str3, String str4, File file, TransferListener transferListener, boolean z) throws NumberFormatException {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        if (!file.isDirectory()) {
            Uri uriInsertSingleTransferRecord = this.transferDB.insertSingleTransferRecord(str, TransferType.DOWNLOAD, str2, str3, str4, file, (Opcodes.CHECKCAST & 64) != 0 ? null : null, (Opcodes.CHECKCAST & 128) != 0 ? new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null) : null, (Opcodes.CHECKCAST & 256) != 0 ? false : z);
            String lastPathSegment = uriInsertSingleTransferRecord.getLastPathSegment();
            if (lastPathSegment != null) {
                final int i = Integer.parseInt(lastPathSegment);
                if (file.isFile()) {
                    this.logger.warn("Overwriting existing file: " + file);
                    file.delete();
                }
                TransferRecord transferRecordById = this.transferDB.getTransferRecordById(i);
                if (transferRecordById != null) {
                    TransferObserver transferObserverStart$aws_storage_s3_release = TransferOperations.INSTANCE.start$aws_storage_s3_release(transferRecordById, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB, transferListener);
                    this.mainHandler.post(new Runnable() { // from class: o.kuh
                        @Override // java.lang.Runnable
                        public final void run() {
                            TransferManager.download$lambda$1(this.f32734a, i);
                        }
                    });
                    return transferObserverStart$aws_storage_s3_release;
                }
                throw new IllegalStateException("Failed to find transferRecord");
            }
            throw new IllegalStateException("Invalid TransferRecord ID " + uriInsertSingleTransferRecord.getLastPathSegment());
        }
        throw new IllegalArgumentException("Invalid file: " + file);
    }

    public final TransferObserver upload(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(objectMetadata, "metadata");
        return upload$default(this, str, str2, str3, str4, file, objectMetadata, h6cVar, transferListener, false, 256, null);
    }

    public final TransferObserver upload(String str, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, TransferListener transferListener, boolean z) throws NumberFormatException {
        final int iCreateMultipartUploadRecords;
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(objectMetadata, "metadata");
        if (shouldUploadInMultipart(file)) {
            iCreateMultipartUploadRecords = createMultipartUploadRecords(str, str2, str3, str4, file, objectMetadata, h6cVar, z);
        } else {
            Uri uriInsertSingleTransferRecord = this.transferDB.insertSingleTransferRecord(str, TransferType.UPLOAD, str2, str3, str4, file, h6cVar, objectMetadata, z);
            String lastPathSegment = uriInsertSingleTransferRecord.getLastPathSegment();
            if (lastPathSegment == null) {
                throw new IllegalStateException("Invalid TransferRecord ID " + uriInsertSingleTransferRecord.getLastPathSegment());
            }
            iCreateMultipartUploadRecords = Integer.parseInt(lastPathSegment);
        }
        TransferRecord transferRecordById = this.transferDB.getTransferRecordById(iCreateMultipartUploadRecords);
        if (transferRecordById != null) {
            TransferObserver transferObserverStart$aws_storage_s3_release = TransferOperations.INSTANCE.start$aws_storage_s3_release(transferRecordById, this.pluginKey, this.transferStatusUpdater, this.workManager, this.transferWorkerObserver, this.transferDB, transferListener);
            this.mainHandler.post(new Runnable() { // from class: o.muh
                @Override // java.lang.Runnable
                public final void run() {
                    TransferManager.upload$lambda$0(this.f36005a, iCreateMultipartUploadRecords);
                }
            });
            return transferObserverStart$aws_storage_s3_release;
        }
        throw new IllegalStateException("Failed to find transferRecord");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransferManager(Context context, StorageTransferClientProvider storageTransferClientProvider, String str, WorkManager workManager, int i, id5 id5Var) {
        if ((i & 8) != 0) {
            workManager = WorkManager.getInstance(context);
            sq8.m48648g(workManager, "getInstance(...)");
        }
        this(context, storageTransferClientProvider, str, workManager);
    }

    public final TransferObserver upload(String str, String str2, InputStream inputStream, UploadOptions uploadOptions, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(inputStream, "inputStream");
        sq8.m48649h(uploadOptions, "options");
        return upload(str, uploadOptions.getBucket(), uploadOptions.getRegion(), str2, writeInputStreamToFile(inputStream), uploadOptions.getObjectMetadata(), uploadOptions.getCannedAcl(), uploadOptions.getTransferListener(), z);
    }
}
