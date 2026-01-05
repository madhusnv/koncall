package com.amplifyframework.storage.s3.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.utils.JsonUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.h6c;
import p001o.id5;
import p001o.om3;
import p001o.sq8;
import p001o.tb3;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class TransferDB {
    public static final Companion Companion = new Companion(null);
    private static final String QUERY_PLACE_HOLDER_STRING = ",?";
    private static volatile TransferDB instance;
    private final Logger logger;
    private final TransferDBHelper transferDBHelper;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TransferDB getInstance() {
            return TransferDB.instance;
        }

        public final void setInstance(TransferDB transferDB) {
            TransferDB.instance = transferDB;
        }

        public final TransferDB getInstance(Context context) {
            sq8.m48649h(context, "context");
            TransferDB companion = getInstance();
            if (companion == null) {
                synchronized (this) {
                    Companion companion2 = TransferDB.Companion;
                    TransferDB companion3 = companion2.getInstance();
                    if (companion3 == null) {
                        companion3 = new TransferDB(context, null);
                        companion2.setInstance(companion3);
                    }
                    companion = companion3;
                }
            }
            return companion;
        }
    }

    public /* synthetic */ TransferDB(Context context, id5 id5Var) {
        this(context);
    }

    private final String createPlaceholders(int i) {
        if (i <= 0) {
            this.logger.error("Cannot create a string of 0 or less placeholders.");
            return null;
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(QUERY_PLACE_HOLDER_STRING);
        }
        return sb.toString();
    }

    private final ContentValues generateContentValuesForObjectMetadata(ObjectMetadata objectMetadata) {
        ContentValues contentValues = new ContentValues();
        if (objectMetadata != null) {
            contentValues.put(TransferTable.COLUMN_USER_METADATA, JsonUtils.INSTANCE.mapToString(objectMetadata.getUserMetadata()));
            Object obj = objectMetadata.getMetaData().get("Content-Type");
            if (obj != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_TYPE, obj.toString());
            }
            Object obj2 = objectMetadata.getMetaData().get("Content-Encoding");
            if (obj2 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_ENCODING, obj2.toString());
            }
            Object obj3 = objectMetadata.getMetaData().get("Cache-Control");
            if (obj3 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CACHE_CONTROL, obj3.toString());
            }
            Object obj4 = objectMetadata.getMetaData().get("Content-MD5");
            if (obj4 != null) {
                contentValues.put(TransferTable.COLUMN_CONTENT_MD5, obj4.toString());
            }
            Object obj5 = objectMetadata.getMetaData().get(ObjectMetadata.CONTENT_DISPOSITION);
            if (obj5 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_DISPOSITION, obj5.toString());
            }
            Object obj6 = objectMetadata.getMetaData().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
            if (obj6 != null) {
                contentValues.put(TransferTable.COLUMN_SSE_ALGORITHM, obj6.toString());
            }
            Object obj7 = objectMetadata.getMetaData().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID);
            if (obj7 != null) {
                contentValues.put(TransferTable.COLUMN_SSE_KMS_KEY, obj7.toString());
            }
            String expirationTimeRuleId = objectMetadata.getExpirationTimeRuleId();
            if (expirationTimeRuleId != null) {
                contentValues.put(TransferTable.COLUMN_EXPIRATION_TIME_RULE_ID, expirationTimeRuleId);
            }
            Date httpExpiresDate = objectMetadata.getHttpExpiresDate();
            if (httpExpiresDate != null) {
                contentValues.put(TransferTable.COLUMN_HTTP_EXPIRES_DATE, Long.valueOf(httpExpiresDate.getTime()));
            }
            Object obj8 = objectMetadata.getMetaData().get(ObjectMetadata.STORAGE_CLASS);
            if (obj8 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_STORAGE_CLASS, obj8.toString());
            }
        }
        return contentValues;
    }

    private final ContentValues generateContentValuesForSinglePartTransfer(String str, TransferType transferType, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_TRANSFER_ID, str);
        contentValues.put("type", transferType.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        contentValues.put(TransferTable.COLUMN_BUCKET_NAME, str2);
        contentValues.put(TransferTable.COLUMN_REGION, str3);
        contentValues.put(TransferTable.COLUMN_KEY, str4);
        contentValues.put(TransferTable.COLUMN_FILE, file != null ? file.getAbsolutePath() : null);
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, (Long) 0L);
        if (transferType == TransferType.UPLOAD) {
            contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, file != null ? Long.valueOf(file.length()) : null);
        }
        contentValues.put(TransferTable.COLUMN_IS_MULTIPART, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_PART_NUM, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_IS_ENCRYPTED, (Integer) 0);
        contentValues.putAll(generateContentValuesForObjectMetadata(objectMetadata));
        contentValues.put(TransferTable.COLUMN_CANNED_ACL, h6cVar != null ? h6cVar.mo29837b() : null);
        contentValues.put(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT, Integer.valueOf(z ? 1 : 0));
        return contentValues;
    }

    private final Uri getPartUri(int i) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release().toString() + "/part/" + i);
        sq8.m48648g(uri, "parse(...)");
        return uri;
    }

    private final Uri getRecordUri(int i) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release().toString() + "/" + i);
        sq8.m48648g(uri, "parse(...)");
        return uri;
    }

    private final Uri getTransferRecordIdUri(String str) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release().toString() + "/transferId/" + str);
        sq8.m48648g(uri, "parse(...)");
        return uri;
    }

    public final int bulkInsertTransferRecords(ContentValues[] contentValuesArr) {
        sq8.m48649h(contentValuesArr, "valuesArray");
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.bulkInsert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesArr);
    }

    public final int cancelAllWithType(TransferType transferType) {
        String[] strArr;
        String str;
        sq8.m48649h(transferType, "type");
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PENDING_CANCEL.toString());
        if (transferType == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString()};
            str = "state in (?,?,?,?,?)";
        } else {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString(), transferType.toString()};
            str = "state in (?,?,?,?,?) and type=?";
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.update$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValues, str, strArr);
    }

    public final void closeDB() {
        this.transferDBHelper.close();
    }

    public final int deletePartTransferRecords(int i) {
        return TransferDBHelper.delete$aws_storage_s3_release$default(this.transferDBHelper, getPartUri(i), null, null, 6, null);
    }

    public final int deleteTransferRecords(int i) {
        return TransferDBHelper.delete$aws_storage_s3_release$default(this.transferDBHelper, getRecordUri(i), null, null, 6, null);
    }

    public final ContentValues generateContentValuesForMultiPartUpload(String str, String str2, String str3, String str4, File file, long j, int i, String str5, long j2, int i2, ObjectMetadata objectMetadata, h6c h6cVar, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_TRANSFER_ID, str);
        contentValues.put("type", TransferType.UPLOAD.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        contentValues.put(TransferTable.COLUMN_BUCKET_NAME, str2);
        contentValues.put(TransferTable.COLUMN_REGION, str3);
        contentValues.put(TransferTable.COLUMN_KEY, str4);
        contentValues.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, (Long) 0L);
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j2));
        contentValues.put(TransferTable.COLUMN_IS_MULTIPART, (Integer) 1);
        contentValues.put(TransferTable.COLUMN_PART_NUM, Integer.valueOf(i));
        contentValues.put(TransferTable.COLUMN_FILE_OFFSET, Long.valueOf(j));
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str5);
        contentValues.put(TransferTable.COLUMN_IS_LAST_PART, Integer.valueOf(i2));
        contentValues.put(TransferTable.COLUMN_IS_ENCRYPTED, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT, Integer.valueOf(z ? 1 : 0));
        contentValues.putAll(generateContentValuesForObjectMetadata(objectMetadata));
        if (h6cVar != null) {
            contentValues.put(TransferTable.COLUMN_CANNED_ACL, h6cVar.mo29837b());
        }
        return contentValues;
    }

    public final List<Integer> getNonCompletedPartRequestsFromDB(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getPartUri(i), null, "state!=?", new String[]{TransferState.PART_COMPLETED.toString()}, null);
        ArrayList arrayList = new ArrayList();
        while (cursorQuery$aws_storage_s3_release.moveToNext()) {
            try {
                arrayList.add(Integer.valueOf(cursorQuery$aws_storage_s3_release.getInt(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow("_id"))));
            } finally {
            }
        }
        y3i y3iVar = y3i.f54824a;
        tb3.m49666a(cursorQuery$aws_storage_s3_release, null);
        return arrayList;
    }

    public final Uri getStateUri(TransferState transferState) {
        sq8.m48649h(transferState, "state");
        return Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release() + "/state/" + transferState);
    }

    public final TransferRecord getTransferByTransferId(String str) {
        TransferRecord transferRecordUpdateFromDB;
        sq8.m48649h(str, "transferId");
        TransferRecord transferRecord = null;
        try {
            Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getTransferRecordIdUri(str), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null);
            try {
                transferRecordUpdateFromDB = cursorQuery$aws_storage_s3_release.moveToFirst() ? TransferRecord.Companion.updateFromDB(cursorQuery$aws_storage_s3_release) : null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                y3i y3iVar = y3i.f54824a;
                try {
                    tb3.m49666a(cursorQuery$aws_storage_s3_release, null);
                    return transferRecordUpdateFromDB;
                } catch (Exception e) {
                    e = e;
                    transferRecord = transferRecordUpdateFromDB;
                    this.logger.error("Transfer Record Not Found", e);
                    return transferRecord;
                }
            } catch (Throwable th2) {
                TransferRecord transferRecord2 = transferRecordUpdateFromDB;
                th = th2;
                transferRecord = transferRecord2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    tb3.m49666a(cursorQuery$aws_storage_s3_release, th);
                    throw th3;
                }
            }
        } catch (Exception e2) {
            e = e2;
            this.logger.error("Transfer Record Not Found", e);
            return transferRecord;
        }
    }

    public final TransferRecord getTransferRecordById(int i) {
        TransferRecord transferRecordUpdateFromDB;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorQueryTransferById = queryTransferById(i);
            if (cursorQueryTransferById == null) {
                return null;
            }
            try {
                transferRecordUpdateFromDB = cursorQueryTransferById.moveToFirst() ? TransferRecord.Companion.updateFromDB(cursorQueryTransferById) : null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                y3i y3iVar = y3i.f54824a;
                try {
                    tb3.m49666a(cursorQueryTransferById, null);
                    return transferRecordUpdateFromDB;
                } catch (Exception e) {
                    e = e;
                    transferRecord = transferRecordUpdateFromDB;
                    this.logger.error("Transfer Record Not Found", e);
                    return transferRecord;
                }
            } catch (Throwable th2) {
                TransferRecord transferRecord2 = transferRecordUpdateFromDB;
                th = th2;
                transferRecord = transferRecord2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    tb3.m49666a(cursorQueryTransferById, th);
                    throw th3;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final Uri insertMultipartUploadRecord(String str, String str2, String str3, String str4, File file, long j, int i, String str5, long j2, int i2, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        sq8.m48649h(str5, "uploadId");
        ContentValues contentValuesGenerateContentValuesForMultiPartUpload = generateContentValuesForMultiPartUpload(str, str2, str3, str4, file, j, i, str5, j2, i2, new ObjectMetadata(null, null, null, null, null, null, null, Opcodes.LAND, null), null, z);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForMultiPartUpload);
    }

    public final Uri insertSingleTransferRecord(String str, TransferType transferType, String str2, String str3, String str4, File file, h6c h6cVar, ObjectMetadata objectMetadata, boolean z) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(transferType, "type");
        sq8.m48649h(str2, "bucket");
        sq8.m48649h(str3, TransferTable.COLUMN_REGION);
        sq8.m48649h(str4, TransferTable.COLUMN_KEY);
        ContentValues contentValuesGenerateContentValuesForSinglePartTransfer = generateContentValuesForSinglePartTransfer(str, transferType, str2, str3, str4, file, objectMetadata, h6cVar, z);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForSinglePartTransfer);
    }

    public final int pauseAllWithType(TransferType transferType) {
        String[] strArr;
        String str;
        sq8.m48649h(transferType, "type");
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PENDING_PAUSE.toString());
        if (transferType == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString()};
            str = "state in (?,?,?)";
        } else {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), transferType.toString()};
            str = "state in (?,?,?) and type=?";
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.update$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValues, str, strArr);
    }

    public final Cursor queryAllTransfersWithType(TransferType transferType) {
        sq8.m48649h(transferType, "type");
        if (transferType == TransferType.ANY) {
            TransferDBHelper transferDBHelper = this.transferDBHelper;
            return transferDBHelper.query$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null);
        }
        TransferDBHelper transferDBHelper2 = this.transferDBHelper;
        return transferDBHelper2.query$aws_storage_s3_release(transferDBHelper2.getContentUri$aws_storage_s3_release(), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : "type=?", (30 & 8) != 0 ? null : new String[]{transferType.toString()}, (30 & 16) != 0 ? null : null);
    }

    public final long queryBytesTransferredByMainUploadId(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getPartUri(i), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null);
        long j = 0;
        while (true) {
            try {
                if (!cursorQuery$aws_storage_s3_release.moveToNext()) {
                    y3i y3iVar = y3i.f54824a;
                    tb3.m49666a(cursorQuery$aws_storage_s3_release, null);
                    return j;
                }
                String string = cursorQuery$aws_storage_s3_release.getString(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow("state"));
                if (string != null) {
                    if ((TransferState.PART_COMPLETED == TransferState.Companion.getState(string) ? string : null) != null) {
                        j += cursorQuery$aws_storage_s3_release.getLong(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
                    }
                }
            } finally {
            }
        }
    }

    public final List<om3> queryPartETagsOfUpload(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getPartUri(i), null, null, null, null);
        while (cursorQuery$aws_storage_s3_release.moveToNext()) {
            try {
                arrayList.add(om3.f38560g.m42422a(new TransferDB$queryPartETagsOfUpload$1$1(cursorQuery$aws_storage_s3_release.getInt(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)), cursorQuery$aws_storage_s3_release.getString(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG)))));
            } finally {
            }
        }
        y3i y3iVar = y3i.f54824a;
        tb3.m49666a(cursorQuery$aws_storage_s3_release, null);
        return arrayList;
    }

    public final Cursor queryTransferById(int i) {
        return this.transferDBHelper.query$aws_storage_s3_release(getRecordUri(i), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null);
    }

    public final Cursor queryTransfersWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        String str;
        String[] strArr;
        sq8.m48649h(transferType, "type");
        sq8.m48649h(transferStateArr, "states");
        int length = transferStateArr.length;
        String strCreatePlaceholders = createPlaceholders(length);
        int i = 0;
        if (transferType == TransferType.ANY) {
            String str2 = "state in (" + strCreatePlaceholders + ")";
            String[] strArr2 = new String[length];
            while (i < length) {
                strArr2[i] = transferStateArr[i].toString();
                i++;
            }
            str = str2;
            strArr = strArr2;
        } else {
            String str3 = "state in (" + strCreatePlaceholders + ") and " + TransferTable.Companion + ".COLUMN_TYPE=?";
            String[] strArr3 = new String[length + 1];
            while (i < length) {
                strArr3[i] = transferStateArr[i].toString();
                i++;
            }
            strArr3[i] = transferType.toString();
            str = str3;
            strArr = strArr3;
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.query$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : str, (30 & 8) != 0 ? null : strArr, (30 & 16) != 0 ? null : null);
    }

    public final int updateBytesTotalForDownload(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j));
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    public final int updateBytesTransferred(int i, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, Long.valueOf(j));
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j2));
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    public final int updateETag(int i, String str) {
        sq8.m48649h(str, "eTag");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_ETAG, str);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    public final int updateMultipartId(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    public final int updateState(int i, TransferState transferState) {
        sq8.m48649h(transferState, "state");
        this.logger.info("update state for " + i + " to " + transferState.name());
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    public final int updateWorkManagerRequestId(int i, String str) {
        sq8.m48649h(str, "requestId");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_WORKMANAGER_REQUEST_ID, str);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i), contentValues, null, null);
    }

    private TransferDB(Context context) {
        this.transferDBHelper = new TransferDBHelper(context);
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{TransferDB.class.getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
    }

    private final Uri insertSingleTransferRecord(String str, TransferType transferType, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, h6c h6cVar, boolean z) {
        ContentValues contentValuesGenerateContentValuesForSinglePartTransfer = generateContentValuesForSinglePartTransfer(str, transferType, str2, str3, str4, file, objectMetadata, h6cVar, z);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForSinglePartTransfer);
    }
}
