package com.amplifyframework.storage.s3.transfer;

import android.database.Cursor;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.utils.JsonUtils;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class TransferRecord {
    public static final Companion Companion = new Companion(null);
    public static final int MAXIMUM_UPLOAD_PARTS = 10000;
    public static final int MINIMUM_UPLOAD_PART_SIZE = 5242880;
    private String bucketName;
    private long bytesCurrent;
    private long bytesTotal;
    private String cannedAcl;
    private String eTag;
    private String expirationTimeRuleId;
    private String file;
    private long fileOffset;
    private String headerCacheControl;
    private String headerContentDisposition;
    private String headerContentEncoding;
    private String headerContentLanguage;
    private String headerContentType;
    private String headerExpire;
    private String headerStorageClass;
    private String httpExpires;
    private int id;
    private int isEncrypted;
    private int isLastPart;
    private int isMultipart;
    private int isRequesterPays;
    private String key;
    private int mainUploadId;
    private String md5;
    private String multipartId;
    private int partNumber;
    private long rangeLast;
    private long rangeStart;
    private String region;
    private long speed;
    private String sseAlgorithm;
    private String sseKMSKey;
    private TransferState state;
    private String transferId;

    /* renamed from: type, reason: collision with root package name */
    private TransferType f58139type;
    private int useAccelerateEndpoint;
    private Map<String, String> userMetadata;
    private String versionId;
    private String workManagerRequestId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final TransferRecord updateFromDB(Cursor cursor) {
            Map mapJsonToMap;
            sq8.m48649h(cursor, "c");
            int i = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_TRANSFER_ID));
            sq8.m48646e(string);
            TransferRecord transferRecord = new TransferRecord(i, string, 0, 0, 0, 0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, -4, Opcodes.LAND, null);
            transferRecord.setMainUploadId(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_MAIN_UPLOAD_ID)));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("type"));
            sq8.m48648g(string2, "getString(...)");
            transferRecord.setType(TransferType.valueOf(string2));
            TransferState.Companion companion = TransferState.Companion;
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow("state"));
            sq8.m48648g(string3, "getString(...)");
            transferRecord.setState(companion.getState(string3));
            transferRecord.setBucketName(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME)));
            transferRecord.setRegion(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_REGION)));
            transferRecord.setKey(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_KEY)));
            transferRecord.setVersionId(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_VERSION_ID)));
            transferRecord.setBytesTotal(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL)));
            transferRecord.setBytesCurrent(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT)));
            transferRecord.setSpeed(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_SPEED)));
            transferRecord.setRequesterPays(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_IS_REQUESTER_PAYS)));
            transferRecord.setMultipart(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_IS_MULTIPART)));
            transferRecord.setLastPart(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_IS_LAST_PART)));
            transferRecord.setEncrypted(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_IS_ENCRYPTED)));
            transferRecord.setPartNumber(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)));
            transferRecord.setETag(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG)));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
            sq8.m48648g(string4, "getString(...)");
            transferRecord.setFile(string4);
            transferRecord.setMultipartId(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_MULTIPART_ID)));
            transferRecord.setRangeStart(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_START)));
            transferRecord.setRangeLast(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_LAST)));
            transferRecord.setFileOffset(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_FILE_OFFSET)));
            transferRecord.setHeaderContentType(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_TYPE)));
            transferRecord.setHeaderContentLanguage(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_LANGUAGE)));
            transferRecord.setHeaderContentDisposition(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_DISPOSITION)));
            transferRecord.setHeaderContentEncoding(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_ENCODING)));
            transferRecord.setHeaderCacheControl(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CACHE_CONTROL)));
            transferRecord.setHeaderExpire(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_EXPIRE)));
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_USER_METADATA));
            if (string5 != null) {
                sq8.m48646e(string5);
                mapJsonToMap = JsonUtils.INSTANCE.jsonToMap(string5);
            } else {
                mapJsonToMap = null;
            }
            transferRecord.setUserMetadata(mapJsonToMap != null ? mapJsonToMap : null);
            transferRecord.setExpirationTimeRuleId(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_EXPIRATION_TIME_RULE_ID)));
            transferRecord.setHttpExpires(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HTTP_EXPIRES_DATE)));
            transferRecord.setSseAlgorithm(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_ALGORITHM)));
            transferRecord.setSseKMSKey(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_KMS_KEY)));
            transferRecord.setMd5(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_CONTENT_MD5)));
            transferRecord.setCannedAcl(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_CANNED_ACL)));
            transferRecord.setHeaderStorageClass(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_STORAGE_CLASS)));
            transferRecord.setUseAccelerateEndpoint(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT)));
            return transferRecord;
        }
    }

    public TransferRecord(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, TransferType transferType, TransferState transferState, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map<String, String> map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i8) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str6, TransferTable.COLUMN_FILE);
        this.id = i;
        this.transferId = str;
        this.mainUploadId = i2;
        this.isRequesterPays = i3;
        this.isMultipart = i4;
        this.isLastPart = i5;
        this.isEncrypted = i6;
        this.partNumber = i7;
        this.bytesTotal = j;
        this.bytesCurrent = j2;
        this.speed = j3;
        this.rangeStart = j4;
        this.rangeLast = j5;
        this.fileOffset = j6;
        this.f58139type = transferType;
        this.state = transferState;
        this.bucketName = str2;
        this.region = str3;
        this.key = str4;
        this.versionId = str5;
        this.file = str6;
        this.multipartId = str7;
        this.eTag = str8;
        this.headerContentType = str9;
        this.headerContentLanguage = str10;
        this.headerContentDisposition = str11;
        this.headerContentEncoding = str12;
        this.headerCacheControl = str13;
        this.headerExpire = str14;
        this.headerStorageClass = str15;
        this.userMetadata = map;
        this.expirationTimeRuleId = str16;
        this.httpExpires = str17;
        this.sseAlgorithm = str18;
        this.sseKMSKey = str19;
        this.md5 = str20;
        this.cannedAcl = str21;
        this.workManagerRequestId = str22;
        this.useAccelerateEndpoint = i8;
    }

    public static final TransferRecord updateFromDB(Cursor cursor) {
        return Companion.updateFromDB(cursor);
    }

    public final int component1() {
        return this.id;
    }

    public final long component10() {
        return this.bytesCurrent;
    }

    public final long component11() {
        return this.speed;
    }

    public final long component12() {
        return this.rangeStart;
    }

    public final long component13() {
        return this.rangeLast;
    }

    public final long component14() {
        return this.fileOffset;
    }

    public final TransferType component15() {
        return this.f58139type;
    }

    public final TransferState component16() {
        return this.state;
    }

    public final String component17() {
        return this.bucketName;
    }

    public final String component18() {
        return this.region;
    }

    public final String component19() {
        return this.key;
    }

    public final String component2() {
        return this.transferId;
    }

    public final String component20() {
        return this.versionId;
    }

    public final String component21() {
        return this.file;
    }

    public final String component22() {
        return this.multipartId;
    }

    public final String component23() {
        return this.eTag;
    }

    public final String component24() {
        return this.headerContentType;
    }

    public final String component25() {
        return this.headerContentLanguage;
    }

    public final String component26() {
        return this.headerContentDisposition;
    }

    public final String component27() {
        return this.headerContentEncoding;
    }

    public final String component28() {
        return this.headerCacheControl;
    }

    public final String component29() {
        return this.headerExpire;
    }

    public final int component3() {
        return this.mainUploadId;
    }

    public final String component30() {
        return this.headerStorageClass;
    }

    public final Map<String, String> component31() {
        return this.userMetadata;
    }

    public final String component32() {
        return this.expirationTimeRuleId;
    }

    public final String component33() {
        return this.httpExpires;
    }

    public final String component34() {
        return this.sseAlgorithm;
    }

    public final String component35() {
        return this.sseKMSKey;
    }

    public final String component36() {
        return this.md5;
    }

    public final String component37() {
        return this.cannedAcl;
    }

    public final String component38() {
        return this.workManagerRequestId;
    }

    public final int component39() {
        return this.useAccelerateEndpoint;
    }

    public final int component4() {
        return this.isRequesterPays;
    }

    public final int component5() {
        return this.isMultipart;
    }

    public final int component6() {
        return this.isLastPart;
    }

    public final int component7() {
        return this.isEncrypted;
    }

    public final int component8() {
        return this.partNumber;
    }

    public final long component9() {
        return this.bytesTotal;
    }

    public final TransferRecord copy(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, TransferType transferType, TransferState transferState, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map<String, String> map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i8) {
        sq8.m48649h(str, "transferId");
        sq8.m48649h(str6, TransferTable.COLUMN_FILE);
        return new TransferRecord(i, str, i2, i3, i4, i5, i6, i7, j, j2, j3, j4, j5, j6, transferType, transferState, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, map, str16, str17, str18, str19, str20, str21, str22, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferRecord)) {
            return false;
        }
        TransferRecord transferRecord = (TransferRecord) obj;
        return this.id == transferRecord.id && sq8.m48644c(this.transferId, transferRecord.transferId) && this.mainUploadId == transferRecord.mainUploadId && this.isRequesterPays == transferRecord.isRequesterPays && this.isMultipart == transferRecord.isMultipart && this.isLastPart == transferRecord.isLastPart && this.isEncrypted == transferRecord.isEncrypted && this.partNumber == transferRecord.partNumber && this.bytesTotal == transferRecord.bytesTotal && this.bytesCurrent == transferRecord.bytesCurrent && this.speed == transferRecord.speed && this.rangeStart == transferRecord.rangeStart && this.rangeLast == transferRecord.rangeLast && this.fileOffset == transferRecord.fileOffset && this.f58139type == transferRecord.f58139type && this.state == transferRecord.state && sq8.m48644c(this.bucketName, transferRecord.bucketName) && sq8.m48644c(this.region, transferRecord.region) && sq8.m48644c(this.key, transferRecord.key) && sq8.m48644c(this.versionId, transferRecord.versionId) && sq8.m48644c(this.file, transferRecord.file) && sq8.m48644c(this.multipartId, transferRecord.multipartId) && sq8.m48644c(this.eTag, transferRecord.eTag) && sq8.m48644c(this.headerContentType, transferRecord.headerContentType) && sq8.m48644c(this.headerContentLanguage, transferRecord.headerContentLanguage) && sq8.m48644c(this.headerContentDisposition, transferRecord.headerContentDisposition) && sq8.m48644c(this.headerContentEncoding, transferRecord.headerContentEncoding) && sq8.m48644c(this.headerCacheControl, transferRecord.headerCacheControl) && sq8.m48644c(this.headerExpire, transferRecord.headerExpire) && sq8.m48644c(this.headerStorageClass, transferRecord.headerStorageClass) && sq8.m48644c(this.userMetadata, transferRecord.userMetadata) && sq8.m48644c(this.expirationTimeRuleId, transferRecord.expirationTimeRuleId) && sq8.m48644c(this.httpExpires, transferRecord.httpExpires) && sq8.m48644c(this.sseAlgorithm, transferRecord.sseAlgorithm) && sq8.m48644c(this.sseKMSKey, transferRecord.sseKMSKey) && sq8.m48644c(this.md5, transferRecord.md5) && sq8.m48644c(this.cannedAcl, transferRecord.cannedAcl) && sq8.m48644c(this.workManagerRequestId, transferRecord.workManagerRequestId) && this.useAccelerateEndpoint == transferRecord.useAccelerateEndpoint;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final long getBytesCurrent() {
        return this.bytesCurrent;
    }

    public final long getBytesTotal() {
        return this.bytesTotal;
    }

    public final String getCannedAcl() {
        return this.cannedAcl;
    }

    public final String getETag() {
        return this.eTag;
    }

    public final String getExpirationTimeRuleId() {
        return this.expirationTimeRuleId;
    }

    public final String getFile() {
        return this.file;
    }

    public final long getFileOffset() {
        return this.fileOffset;
    }

    public final String getHeaderCacheControl() {
        return this.headerCacheControl;
    }

    public final String getHeaderContentDisposition() {
        return this.headerContentDisposition;
    }

    public final String getHeaderContentEncoding() {
        return this.headerContentEncoding;
    }

    public final String getHeaderContentLanguage() {
        return this.headerContentLanguage;
    }

    public final String getHeaderContentType() {
        return this.headerContentType;
    }

    public final String getHeaderExpire() {
        return this.headerExpire;
    }

    public final String getHeaderStorageClass() {
        return this.headerStorageClass;
    }

    public final String getHttpExpires() {
        return this.httpExpires;
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getMainUploadId() {
        return this.mainUploadId;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMultipartId() {
        return this.multipartId;
    }

    public final int getPartNumber() {
        return this.partNumber;
    }

    public final long getRangeLast() {
        return this.rangeLast;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getRegion() {
        return this.region;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public final String getSseKMSKey() {
        return this.sseKMSKey;
    }

    public final TransferState getState() {
        return this.state;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final TransferType getType() {
        return this.f58139type;
    }

    public final int getUseAccelerateEndpoint() {
        return this.useAccelerateEndpoint;
    }

    public final Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public final String getVersionId() {
        return this.versionId;
    }

    public final String getWorkManagerRequestId() {
        return this.workManagerRequestId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.transferId.hashCode()) * 31) + Integer.hashCode(this.mainUploadId)) * 31) + Integer.hashCode(this.isRequesterPays)) * 31) + Integer.hashCode(this.isMultipart)) * 31) + Integer.hashCode(this.isLastPart)) * 31) + Integer.hashCode(this.isEncrypted)) * 31) + Integer.hashCode(this.partNumber)) * 31) + Long.hashCode(this.bytesTotal)) * 31) + Long.hashCode(this.bytesCurrent)) * 31) + Long.hashCode(this.speed)) * 31) + Long.hashCode(this.rangeStart)) * 31) + Long.hashCode(this.rangeLast)) * 31) + Long.hashCode(this.fileOffset)) * 31;
        TransferType transferType = this.f58139type;
        int iHashCode2 = (iHashCode + (transferType == null ? 0 : transferType.hashCode())) * 31;
        TransferState transferState = this.state;
        int iHashCode3 = (iHashCode2 + (transferState == null ? 0 : transferState.hashCode())) * 31;
        String str = this.bucketName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.versionId;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.file.hashCode()) * 31;
        String str5 = this.multipartId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eTag;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.headerContentType;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.headerContentLanguage;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.headerContentDisposition;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.headerContentEncoding;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.headerCacheControl;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.headerExpire;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.headerStorageClass;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, String> map = this.userMetadata;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        String str14 = this.expirationTimeRuleId;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.httpExpires;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sseAlgorithm;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.sseKMSKey;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.md5;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.cannedAcl;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.workManagerRequestId;
        return ((iHashCode23 + (str20 != null ? str20.hashCode() : 0)) * 31) + Integer.hashCode(this.useAccelerateEndpoint);
    }

    public final int isEncrypted() {
        return this.isEncrypted;
    }

    public final int isLastPart() {
        return this.isLastPart;
    }

    public final boolean isMainRecord$aws_storage_s3_release() {
        int i = this.isMultipart;
        if (i != 0) {
            return i == 1 && this.mainUploadId == 0;
        }
        return true;
    }

    public final int isMultipart() {
        return this.isMultipart;
    }

    public final int isRequesterPays() {
        return this.isRequesterPays;
    }

    public final void setBucketName(String str) {
        this.bucketName = str;
    }

    public final void setBytesCurrent(long j) {
        this.bytesCurrent = j;
    }

    public final void setBytesTotal(long j) {
        this.bytesTotal = j;
    }

    public final void setCannedAcl(String str) {
        this.cannedAcl = str;
    }

    public final void setETag(String str) {
        this.eTag = str;
    }

    public final void setEncrypted(int i) {
        this.isEncrypted = i;
    }

    public final void setExpirationTimeRuleId(String str) {
        this.expirationTimeRuleId = str;
    }

    public final void setFile(String str) {
        sq8.m48649h(str, "<set-?>");
        this.file = str;
    }

    public final void setFileOffset(long j) {
        this.fileOffset = j;
    }

    public final void setHeaderCacheControl(String str) {
        this.headerCacheControl = str;
    }

    public final void setHeaderContentDisposition(String str) {
        this.headerContentDisposition = str;
    }

    public final void setHeaderContentEncoding(String str) {
        this.headerContentEncoding = str;
    }

    public final void setHeaderContentLanguage(String str) {
        this.headerContentLanguage = str;
    }

    public final void setHeaderContentType(String str) {
        this.headerContentType = str;
    }

    public final void setHeaderExpire(String str) {
        this.headerExpire = str;
    }

    public final void setHeaderStorageClass(String str) {
        this.headerStorageClass = str;
    }

    public final void setHttpExpires(String str) {
        this.httpExpires = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLastPart(int i) {
        this.isLastPart = i;
    }

    public final void setMainUploadId(int i) {
        this.mainUploadId = i;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setMultipart(int i) {
        this.isMultipart = i;
    }

    public final void setMultipartId(String str) {
        this.multipartId = str;
    }

    public final void setPartNumber(int i) {
        this.partNumber = i;
    }

    public final void setRangeLast(long j) {
        this.rangeLast = j;
    }

    public final void setRangeStart(long j) {
        this.rangeStart = j;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setRequesterPays(int i) {
        this.isRequesterPays = i;
    }

    public final void setSpeed(long j) {
        this.speed = j;
    }

    public final void setSseAlgorithm(String str) {
        this.sseAlgorithm = str;
    }

    public final void setSseKMSKey(String str) {
        this.sseKMSKey = str;
    }

    public final void setState(TransferState transferState) {
        this.state = transferState;
    }

    public final void setTransferId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.transferId = str;
    }

    public final void setType(TransferType transferType) {
        this.f58139type = transferType;
    }

    public final void setUseAccelerateEndpoint(int i) {
        this.useAccelerateEndpoint = i;
    }

    public final void setUserMetadata(Map<String, String> map) {
        this.userMetadata = map;
    }

    public final void setVersionId(String str) {
        this.versionId = str;
    }

    public final void setWorkManagerRequestId(String str) {
        this.workManagerRequestId = str;
    }

    public String toString() {
        return "TransferRecord(id=" + this.id + ", transferId=" + this.transferId + ", mainUploadId=" + this.mainUploadId + ", isRequesterPays=" + this.isRequesterPays + ", isMultipart=" + this.isMultipart + ", isLastPart=" + this.isLastPart + ", isEncrypted=" + this.isEncrypted + ", partNumber=" + this.partNumber + ", bytesTotal=" + this.bytesTotal + ", bytesCurrent=" + this.bytesCurrent + ", speed=" + this.speed + ", rangeStart=" + this.rangeStart + ", rangeLast=" + this.rangeLast + ", fileOffset=" + this.fileOffset + ", type=" + this.f58139type + ", state=" + this.state + ", bucketName=" + this.bucketName + ", region=" + this.region + ", key=" + this.key + ", versionId=" + this.versionId + ", file=" + this.file + ", multipartId=" + this.multipartId + ", eTag=" + this.eTag + ", headerContentType=" + this.headerContentType + ", headerContentLanguage=" + this.headerContentLanguage + ", headerContentDisposition=" + this.headerContentDisposition + ", headerContentEncoding=" + this.headerContentEncoding + ", headerCacheControl=" + this.headerCacheControl + ", headerExpire=" + this.headerExpire + ", headerStorageClass=" + this.headerStorageClass + ", userMetadata=" + this.userMetadata + ", expirationTimeRuleId=" + this.expirationTimeRuleId + ", httpExpires=" + this.httpExpires + ", sseAlgorithm=" + this.sseAlgorithm + ", sseKMSKey=" + this.sseKMSKey + ", md5=" + this.md5 + ", cannedAcl=" + this.cannedAcl + ", workManagerRequestId=" + this.workManagerRequestId + ", useAccelerateEndpoint=" + this.useAccelerateEndpoint + ")";
    }

    public /* synthetic */ TransferRecord(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, TransferType transferType, TransferState transferState, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i8, int i9, int i10, id5 id5Var) {
        this(i, str, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? 0 : i4, (i9 & 32) != 0 ? 0 : i5, (i9 & 64) != 0 ? 0 : i6, (i9 & 128) != 0 ? 0 : i7, (i9 & 256) != 0 ? 0L : j, (i9 & 512) != 0 ? 0L : j2, (i9 & 1024) != 0 ? 0L : j3, (i9 & 2048) != 0 ? 0L : j4, (i9 & 4096) != 0 ? 0L : j5, (i9 & 8192) == 0 ? j6 : 0L, (i9 & Opcodes.ACC_ENUM) != 0 ? null : transferType, (i9 & 32768) != 0 ? null : transferState, (i9 & 65536) != 0 ? null : str2, (i9 & Opcodes.ACC_DEPRECATED) != 0 ? null : str3, (i9 & 262144) != 0 ? null : str4, (i9 & Opcodes.ASM8) != 0 ? null : str5, (i9 & 1048576) != 0 ? "" : str6, (i9 & 2097152) != 0 ? null : str7, (i9 & 4194304) != 0 ? null : str8, (i9 & 8388608) != 0 ? null : str9, (i9 & 16777216) != 0 ? null : str10, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str11, (i9 & 67108864) != 0 ? null : str12, (i9 & 134217728) != 0 ? null : str13, (i9 & 268435456) != 0 ? null : str14, (i9 & 536870912) != 0 ? null : str15, (i9 & 1073741824) != 0 ? null : map, (i9 & Integer.MIN_VALUE) != 0 ? null : str16, (i10 & 1) != 0 ? null : str17, (i10 & 2) != 0 ? null : str18, (i10 & 4) != 0 ? null : str19, (i10 & 8) != 0 ? null : str20, (i10 & 16) != 0 ? null : str21, (i10 & 32) == 0 ? str22 : null, (i10 & 64) == 0 ? i8 : 0);
    }
}
