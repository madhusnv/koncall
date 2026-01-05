package com.amplifyframework.storage.s3.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.utils.JsonUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import mb.C4708x;
import mb.C4709y;
import mb.a1;
import og.q1;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferDB {
    public static final Companion Companion = new Companion(null);
    private static final String QUERY_PLACE_HOLDER_STRING = ",?";
    private static volatile TransferDB instance;
    private final Logger logger;
    private final TransferDBHelper transferDBHelper;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final TransferDB getInstance() {
            return TransferDB.instance;
        }

        public final void setInstance(TransferDB transferDB) {
            TransferDB.instance = transferDB;
        }

        private Companion() {
        }

        public final TransferDB getInstance(Context context) {
            TransferDB companion;
            AbstractC4154l.m8923f(context, "context");
            TransferDB companion2 = getInstance();
            if (companion2 != null) {
                return companion2;
            }
            synchronized (this) {
                Companion companion3 = TransferDB.Companion;
                companion = companion3.getInstance();
                if (companion == null) {
                    companion = new TransferDB(context, null);
                    companion3.setInstance(companion);
                }
            }
            return companion;
        }

        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    public /* synthetic */ TransferDB(Context context, AbstractC4148f abstractC4148f) {
        this(context);
    }

    private final String createPlaceholders(int i10) {
        if (i10 <= 0) {
            this.logger.error("Cannot create a string of 0 or less placeholders.");
            return null;
        }
        StringBuilder sb2 = new StringBuilder((i10 * 2) - 1);
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(QUERY_PLACE_HOLDER_STRING);
        }
        return sb2.toString();
    }

    private final ContentValues generateContentValuesForObjectMetadata(ObjectMetadata objectMetadata) {
        ContentValues contentValues = new ContentValues();
        if (objectMetadata != null) {
            contentValues.put(TransferTable.COLUMN_USER_METADATA, JsonUtils.INSTANCE.mapToString(objectMetadata.getUserMetadata()));
            Object obj = objectMetadata.getMetaData().get(ObjectMetadata.CONTENT_TYPE);
            if (obj != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_TYPE, obj.toString());
            }
            Object obj2 = objectMetadata.getMetaData().get(ObjectMetadata.CONTENT_ENCODING);
            if (obj2 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_ENCODING, obj2.toString());
            }
            Object obj3 = objectMetadata.getMetaData().get(ObjectMetadata.CACHE_CONTROL);
            if (obj3 != null) {
                contentValues.put(TransferTable.COLUMN_HEADER_CACHE_CONTROL, obj3.toString());
            }
            Object obj4 = objectMetadata.getMetaData().get(ObjectMetadata.CONTENT_MD5);
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

    private final ContentValues generateContentValuesForSinglePartTransfer(String str, TransferType transferType, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, a1 a1Var, boolean z6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_TRANSFER_ID, str);
        contentValues.put(TransferTable.COLUMN_TYPE, transferType.toString());
        contentValues.put(TransferTable.COLUMN_STATE, TransferState.WAITING.toString());
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
        contentValues.put(TransferTable.COLUMN_CANNED_ACL, a1Var != null ? a1Var.mo9579a() : null);
        contentValues.put(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT, Integer.valueOf(z6 ? 1 : 0));
        return contentValues;
    }

    private final Uri getPartUri(int i10) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release() + "/part/" + i10);
        AbstractC4154l.m8922e(uri, "parse(...)");
        return uri;
    }

    private final Uri getRecordUri(int i10) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release() + "/" + i10);
        AbstractC4154l.m8922e(uri, "parse(...)");
        return uri;
    }

    private final Uri getTransferRecordIdUri(String str) {
        Uri uri = Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release() + "/transferId/" + str);
        AbstractC4154l.m8922e(uri, "parse(...)");
        return uri;
    }

    private static final a0 queryPartETagsOfUpload$lambda$8$lambda$7(int i10, String str, C4708x CompletedPart) {
        AbstractC4154l.m8923f(CompletedPart, "$this$CompletedPart");
        CompletedPart.f23521b = Integer.valueOf(i10);
        CompletedPart.f23520a = str;
        return a0.f30746a;
    }

    public final int bulkInsertTransferRecords(ContentValues[] valuesArray) {
        AbstractC4154l.m8923f(valuesArray, "valuesArray");
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.bulkInsert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), valuesArray);
    }

    public final int cancelAllWithType(TransferType type) {
        String str;
        String[] strArr;
        AbstractC4154l.m8923f(type, "type");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_STATE, TransferState.PENDING_CANCEL.toString());
        if (type == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString()};
            str = "state in (?,?,?,?,?)";
        } else {
            str = "state in (?,?,?,?,?) and type=?";
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString(), type.toString()};
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.update$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValues, str, strArr);
    }

    public final void closeDB() {
        this.transferDBHelper.close();
    }

    public final int deletePartTransferRecords(int i10) {
        return TransferDBHelper.delete$aws_storage_s3_release$default(this.transferDBHelper, getPartUri(i10), null, null, 6, null);
    }

    public final int deleteTransferRecords(int i10) {
        return TransferDBHelper.delete$aws_storage_s3_release$default(this.transferDBHelper, getRecordUri(i10), null, null, 6, null);
    }

    public final ContentValues generateContentValuesForMultiPartUpload(String transferId, String str, String str2, String str3, File file, long j6, int i10, String str4, long j10, int i11, ObjectMetadata objectMetadata, a1 a1Var, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_TRANSFER_ID, transferId);
        contentValues.put(TransferTable.COLUMN_TYPE, TransferType.UPLOAD.toString());
        contentValues.put(TransferTable.COLUMN_STATE, TransferState.WAITING.toString());
        contentValues.put(TransferTable.COLUMN_BUCKET_NAME, str);
        contentValues.put(TransferTable.COLUMN_REGION, str2);
        contentValues.put(TransferTable.COLUMN_KEY, str3);
        contentValues.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, (Long) 0L);
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j10));
        contentValues.put(TransferTable.COLUMN_IS_MULTIPART, (Integer) 1);
        contentValues.put(TransferTable.COLUMN_PART_NUM, Integer.valueOf(i10));
        contentValues.put(TransferTable.COLUMN_FILE_OFFSET, Long.valueOf(j6));
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str4);
        contentValues.put(TransferTable.COLUMN_IS_LAST_PART, Integer.valueOf(i11));
        contentValues.put(TransferTable.COLUMN_IS_ENCRYPTED, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT, Integer.valueOf(z6 ? 1 : 0));
        contentValues.putAll(generateContentValuesForObjectMetadata(objectMetadata));
        if (a1Var != null) {
            contentValues.put(TransferTable.COLUMN_CANNED_ACL, a1Var.mo9579a());
        }
        return contentValues;
    }

    public final List<Integer> getNonCompletedPartRequestsFromDB(int i10) {
        Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getPartUri(i10), null, "state!=?", new String[]{TransferState.PART_COMPLETED.toString()}, null);
        ArrayList arrayList = new ArrayList();
        while (cursorQuery$aws_storage_s3_release.moveToNext()) {
            try {
                arrayList.add(Integer.valueOf(cursorQuery$aws_storage_s3_release.getInt(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_ID))));
            } finally {
            }
        }
        q1.m10844a(cursorQuery$aws_storage_s3_release, null);
        return arrayList;
    }

    public final Uri getStateUri(TransferState state) {
        AbstractC4154l.m8923f(state, "state");
        return Uri.parse(this.transferDBHelper.getContentUri$aws_storage_s3_release() + "/state/" + state);
    }

    public final TransferRecord getTransferByTransferId(String transferId) {
        Exception exc;
        AbstractC4154l.m8923f(transferId, "transferId");
        TransferRecord transferRecord = null;
        try {
            Cursor cursorQuery$aws_storage_s3_release$default = TransferDBHelper.query$aws_storage_s3_release$default(this.transferDBHelper, getTransferRecordIdUri(transferId), null, null, null, null, 30, null);
            try {
                TransferRecord transferRecordUpdateFromDB = cursorQuery$aws_storage_s3_release$default.moveToFirst() ? TransferRecord.Companion.updateFromDB(cursorQuery$aws_storage_s3_release$default) : null;
                try {
                    q1.m10844a(cursorQuery$aws_storage_s3_release$default, null);
                    return transferRecordUpdateFromDB;
                } catch (Exception e2) {
                    exc = e2;
                    transferRecord = transferRecordUpdateFromDB;
                    this.logger.error("Transfer Record Not Found", exc);
                    return transferRecord;
                }
            } finally {
            }
        } catch (Exception e10) {
            exc = e10;
            this.logger.error("Transfer Record Not Found", exc);
            return transferRecord;
        }
    }

    public final TransferRecord getTransferRecordById(int i10) throws IOException {
        TransferRecord transferRecordUpdateFromDB = null;
        try {
            Cursor cursorQueryTransferById = queryTransferById(i10);
            if (cursorQueryTransferById == null) {
                return null;
            }
            try {
                if (cursorQueryTransferById.moveToFirst()) {
                    transferRecordUpdateFromDB = TransferRecord.Companion.updateFromDB(cursorQueryTransferById);
                }
                cursorQueryTransferById.close();
                return transferRecordUpdateFromDB;
            } finally {
            }
        } catch (Exception e2) {
            this.logger.error("Transfer Record Not Found", e2);
            return transferRecordUpdateFromDB;
        }
    }

    public final Uri insertMultipartUploadRecord(String transferId, String bucket, String region, String key, File file, long j6, int i10, String uploadId, long j10, int i11, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(file, "file");
        AbstractC4154l.m8923f(uploadId, "uploadId");
        ContentValues contentValuesGenerateContentValuesForMultiPartUpload = generateContentValuesForMultiPartUpload(transferId, bucket, region, key, file, j6, i10, uploadId, j10, i11, new ObjectMetadata(null, null, null, null, null, null, null, 127, null), null, z6);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForMultiPartUpload);
    }

    public final Uri insertSingleTransferRecord(String transferId, TransferType type, String bucket, String region, String key, File file, a1 a1Var, ObjectMetadata objectMetadata, boolean z6) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(key, "key");
        ContentValues contentValuesGenerateContentValuesForSinglePartTransfer = generateContentValuesForSinglePartTransfer(transferId, type, bucket, region, key, file, objectMetadata, a1Var, z6);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForSinglePartTransfer);
    }

    public final int pauseAllWithType(TransferType type) {
        String str;
        String[] strArr;
        AbstractC4154l.m8923f(type, "type");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_STATE, TransferState.PENDING_PAUSE.toString());
        if (type == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString()};
            str = "state in (?,?,?)";
        } else {
            str = "state in (?,?,?) and type=?";
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), type.toString()};
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.update$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValues, str, strArr);
    }

    public final Cursor queryAllTransfersWithType(TransferType type) {
        AbstractC4154l.m8923f(type, "type");
        if (type == TransferType.ANY) {
            TransferDBHelper transferDBHelper = this.transferDBHelper;
            return TransferDBHelper.query$aws_storage_s3_release$default(transferDBHelper, transferDBHelper.getContentUri$aws_storage_s3_release(), null, null, null, null, 30, null);
        }
        TransferDBHelper transferDBHelper2 = this.transferDBHelper;
        return TransferDBHelper.query$aws_storage_s3_release$default(transferDBHelper2, transferDBHelper2.getContentUri$aws_storage_s3_release(), null, "type=?", new String[]{type.toString()}, null, 18, null);
    }

    public final long queryBytesTransferredByMainUploadId(int i10) {
        Cursor cursorQuery$aws_storage_s3_release$default = TransferDBHelper.query$aws_storage_s3_release$default(this.transferDBHelper, getPartUri(i10), null, null, null, null, 30, null);
        long j6 = 0;
        while (true) {
            try {
                if (!cursorQuery$aws_storage_s3_release$default.moveToNext()) {
                    q1.m10844a(cursorQuery$aws_storage_s3_release$default, null);
                    return j6;
                }
                String string = cursorQuery$aws_storage_s3_release$default.getString(cursorQuery$aws_storage_s3_release$default.getColumnIndexOrThrow(TransferTable.COLUMN_STATE));
                if (string != null) {
                    if ((TransferState.PART_COMPLETED == TransferState.Companion.getState(string) ? string : null) != null) {
                        j6 += cursorQuery$aws_storage_s3_release$default.getLong(cursorQuery$aws_storage_s3_release$default.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
                    }
                }
            } finally {
            }
        }
    }

    public final List<C4709y> queryPartETagsOfUpload(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery$aws_storage_s3_release = this.transferDBHelper.query$aws_storage_s3_release(getPartUri(i10), null, null, null, null);
        while (cursorQuery$aws_storage_s3_release.moveToNext()) {
            try {
                int i11 = cursorQuery$aws_storage_s3_release.getInt(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
                String string = cursorQuery$aws_storage_s3_release.getString(cursorQuery$aws_storage_s3_release.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG));
                C4708x c4708x = new C4708x();
                queryPartETagsOfUpload$lambda$8$lambda$7(i11, string, c4708x);
                arrayList.add(new C4709y(c4708x));
            } finally {
            }
        }
        cursorQuery$aws_storage_s3_release.close();
        return arrayList;
    }

    public final Cursor queryTransferById(int i10) {
        return TransferDBHelper.query$aws_storage_s3_release$default(this.transferDBHelper, getRecordUri(i10), null, null, null, null, 30, null);
    }

    public final Cursor queryTransfersWithTypeAndStates(TransferType type, TransferState[] states) {
        String str;
        String[] strArr;
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(states, "states");
        int length = states.length;
        String strCreatePlaceholders = createPlaceholders(length);
        int i10 = 0;
        if (type == TransferType.ANY) {
            String strM11238i = AbstractC5601a.m11238i("state in (", strCreatePlaceholders, ")");
            String[] strArr2 = new String[length];
            while (i10 < length) {
                strArr2[i10] = states[i10].toString();
                i10++;
            }
            str = strM11238i;
            strArr = strArr2;
        } else {
            String str2 = "state in (" + strCreatePlaceholders + ") and " + TransferTable.Companion + ".COLUMN_TYPE=?";
            String[] strArr3 = new String[length + 1];
            while (i10 < length) {
                strArr3[i10] = states[i10].toString();
                i10++;
            }
            strArr3[i10] = type.toString();
            str = str2;
            strArr = strArr3;
        }
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return TransferDBHelper.query$aws_storage_s3_release$default(transferDBHelper, transferDBHelper.getContentUri$aws_storage_s3_release(), null, str, strArr, null, 18, null);
    }

    public final int updateBytesTotalForDownload(int i10, long j6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j6));
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    public final int updateBytesTransferred(int i10, long j6, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, Long.valueOf(j6));
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j10));
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    public final int updateETag(int i10, String eTag) {
        AbstractC4154l.m8923f(eTag, "eTag");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_ETAG, eTag);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    public final int updateMultipartId(int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    public final int updateState(int i10, TransferState state) {
        AbstractC4154l.m8923f(state, "state");
        this.logger.info("update state for " + i10 + " to " + state.name());
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_STATE, state.toString());
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    public final int updateWorkManagerRequestId(int i10, String requestId) {
        AbstractC4154l.m8923f(requestId, "requestId");
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_WORKMANAGER_REQUEST_ID, requestId);
        return this.transferDBHelper.update$aws_storage_s3_release(getRecordUri(i10), contentValues, null, null);
    }

    private TransferDB(Context context) {
        this.transferDBHelper = new TransferDBHelper(context);
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"TransferDB"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
    }

    private final Uri insertSingleTransferRecord(String str, TransferType transferType, String str2, String str3, String str4, File file, ObjectMetadata objectMetadata, a1 a1Var, boolean z6) {
        ContentValues contentValuesGenerateContentValuesForSinglePartTransfer = generateContentValuesForSinglePartTransfer(str, transferType, str2, str3, str4, file, objectMetadata, a1Var, z6);
        TransferDBHelper transferDBHelper = this.transferDBHelper;
        return transferDBHelper.insert$aws_storage_s3_release(transferDBHelper.getContentUri$aws_storage_s3_release(), contentValuesGenerateContentValuesForSinglePartTransfer);
    }
}
