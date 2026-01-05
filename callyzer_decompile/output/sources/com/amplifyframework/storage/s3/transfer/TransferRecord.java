package com.amplifyframework.storage.s3.transfer;

import a2.AbstractC0030c;
import android.database.Cursor;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.utils.JsonUtils;
import com.sun.mail.util.AbstractC1452a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* renamed from: id, reason: collision with root package name */
    private int f43860id;
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
    private TransferType type;
    private int useAccelerateEndpoint;
    private Map<String, String> userMetadata;
    private String versionId;
    private String workManagerRequestId;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final TransferRecord updateFromDB(Cursor c2) {
            AbstractC4154l.m8923f(c2, "c");
            int i10 = c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
            String string = c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_TRANSFER_ID));
            AbstractC4154l.m8920c(string);
            TransferRecord transferRecord = new TransferRecord(i10, string, 0, 0, 0, 0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, -4, 127, null);
            transferRecord.setMainUploadId(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_MAIN_UPLOAD_ID)));
            String string2 = c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_TYPE));
            AbstractC4154l.m8922e(string2, "getString(...)");
            transferRecord.setType(TransferType.valueOf(string2));
            TransferState.Companion companion = TransferState.Companion;
            String string3 = c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_STATE));
            AbstractC4154l.m8922e(string3, "getString(...)");
            transferRecord.setState(companion.getState(string3));
            transferRecord.setBucketName(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME)));
            transferRecord.setRegion(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_REGION)));
            transferRecord.setKey(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_KEY)));
            transferRecord.setVersionId(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_VERSION_ID)));
            transferRecord.setBytesTotal(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL)));
            transferRecord.setBytesCurrent(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT)));
            transferRecord.setSpeed(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_SPEED)));
            transferRecord.setRequesterPays(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_IS_REQUESTER_PAYS)));
            transferRecord.setMultipart(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_IS_MULTIPART)));
            transferRecord.setLastPart(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_IS_LAST_PART)));
            transferRecord.setEncrypted(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_IS_ENCRYPTED)));
            transferRecord.setPartNumber(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)));
            transferRecord.setETag(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG)));
            String string4 = c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
            AbstractC4154l.m8922e(string4, "getString(...)");
            transferRecord.setFile(string4);
            transferRecord.setMultipartId(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_MULTIPART_ID)));
            transferRecord.setRangeStart(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_START)));
            transferRecord.setRangeLast(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_DATA_RANGE_LAST)));
            transferRecord.setFileOffset(c2.getLong(c2.getColumnIndexOrThrow(TransferTable.COLUMN_FILE_OFFSET)));
            transferRecord.setHeaderContentType(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_TYPE)));
            transferRecord.setHeaderContentLanguage(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_LANGUAGE)));
            transferRecord.setHeaderContentDisposition(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_DISPOSITION)));
            transferRecord.setHeaderContentEncoding(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CONTENT_ENCODING)));
            transferRecord.setHeaderCacheControl(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_CACHE_CONTROL)));
            transferRecord.setHeaderExpire(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_EXPIRE)));
            String string5 = c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_USER_METADATA));
            Map mapJsonToMap = string5 != null ? JsonUtils.INSTANCE.jsonToMap(string5) : null;
            transferRecord.setUserMetadata(mapJsonToMap != null ? mapJsonToMap : null);
            transferRecord.setExpirationTimeRuleId(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_EXPIRATION_TIME_RULE_ID)));
            transferRecord.setHttpExpires(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HTTP_EXPIRES_DATE)));
            transferRecord.setSseAlgorithm(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_ALGORITHM)));
            transferRecord.setSseKMSKey(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_SSE_KMS_KEY)));
            transferRecord.setMd5(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_CONTENT_MD5)));
            transferRecord.setCannedAcl(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_CANNED_ACL)));
            transferRecord.setHeaderStorageClass(c2.getString(c2.getColumnIndexOrThrow(TransferTable.COLUMN_HEADER_STORAGE_CLASS)));
            transferRecord.setUseAccelerateEndpoint(c2.getInt(c2.getColumnIndexOrThrow(TransferTable.COLUMN_USE_ACCELERATE_ENDPOINT)));
            return transferRecord;
        }

        private Companion() {
        }
    }

    public TransferRecord(int i10, String transferId, int i11, int i12, int i13, int i14, int i15, int i16, long j6, long j10, long j11, long j12, long j13, long j14, TransferType transferType, TransferState transferState, String str, String str2, String str3, String str4, String file, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, String> map, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i17) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        this.f43860id = i10;
        this.transferId = transferId;
        this.mainUploadId = i11;
        this.isRequesterPays = i12;
        this.isMultipart = i13;
        this.isLastPart = i14;
        this.isEncrypted = i15;
        this.partNumber = i16;
        this.bytesTotal = j6;
        this.bytesCurrent = j10;
        this.speed = j11;
        this.rangeStart = j12;
        this.rangeLast = j13;
        this.fileOffset = j14;
        this.type = transferType;
        this.state = transferState;
        this.bucketName = str;
        this.region = str2;
        this.key = str3;
        this.versionId = str4;
        this.file = file;
        this.multipartId = str5;
        this.eTag = str6;
        this.headerContentType = str7;
        this.headerContentLanguage = str8;
        this.headerContentDisposition = str9;
        this.headerContentEncoding = str10;
        this.headerCacheControl = str11;
        this.headerExpire = str12;
        this.headerStorageClass = str13;
        this.userMetadata = map;
        this.expirationTimeRuleId = str14;
        this.httpExpires = str15;
        this.sseAlgorithm = str16;
        this.sseKMSKey = str17;
        this.md5 = str18;
        this.cannedAcl = str19;
        this.workManagerRequestId = str20;
        this.useAccelerateEndpoint = i17;
    }

    public static /* synthetic */ TransferRecord copy$default(TransferRecord transferRecord, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, long j6, long j10, long j11, long j12, long j13, long j14, TransferType transferType, TransferState transferState, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i17, int i18, int i19, Object obj) {
        int i20;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        Map map2;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        TransferType transferType2;
        TransferState transferState2;
        long j15;
        long j16;
        long j17;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        int i21 = (i18 & 1) != 0 ? transferRecord.f43860id : i10;
        String str44 = (i18 & 2) != 0 ? transferRecord.transferId : str;
        int i22 = (i18 & 4) != 0 ? transferRecord.mainUploadId : i11;
        int i23 = (i18 & 8) != 0 ? transferRecord.isRequesterPays : i12;
        int i24 = (i18 & 16) != 0 ? transferRecord.isMultipart : i13;
        int i25 = (i18 & 32) != 0 ? transferRecord.isLastPart : i14;
        int i26 = (i18 & 64) != 0 ? transferRecord.isEncrypted : i15;
        int i27 = (i18 & 128) != 0 ? transferRecord.partNumber : i16;
        long j18 = (i18 & 256) != 0 ? transferRecord.bytesTotal : j6;
        long j19 = (i18 & 512) != 0 ? transferRecord.bytesCurrent : j10;
        long j20 = (i18 & 1024) != 0 ? transferRecord.speed : j11;
        int i28 = i21;
        String str45 = str44;
        long j21 = (i18 & NewHope.SENDB_BYTES) != 0 ? transferRecord.rangeStart : j12;
        long j22 = (i18 & 4096) != 0 ? transferRecord.rangeLast : j13;
        long j23 = (i18 & 8192) != 0 ? transferRecord.fileOffset : j14;
        TransferType transferType3 = (i18 & 16384) != 0 ? transferRecord.type : transferType;
        TransferState transferState3 = (32768 & i18) != 0 ? transferRecord.state : transferState;
        String str46 = (i18 & 65536) != 0 ? transferRecord.bucketName : str2;
        String str47 = (i18 & 131072) != 0 ? transferRecord.region : str3;
        String str48 = (i18 & 262144) != 0 ? transferRecord.key : str4;
        String str49 = (i18 & 524288) != 0 ? transferRecord.versionId : str5;
        String str50 = (i18 & 1048576) != 0 ? transferRecord.file : str6;
        String str51 = (i18 & 2097152) != 0 ? transferRecord.multipartId : str7;
        String str52 = (i18 & 4194304) != 0 ? transferRecord.eTag : str8;
        String str53 = (i18 & 8388608) != 0 ? transferRecord.headerContentType : str9;
        String str54 = (i18 & 16777216) != 0 ? transferRecord.headerContentLanguage : str10;
        String str55 = (i18 & 33554432) != 0 ? transferRecord.headerContentDisposition : str11;
        String str56 = (i18 & 67108864) != 0 ? transferRecord.headerContentEncoding : str12;
        String str57 = (i18 & 134217728) != 0 ? transferRecord.headerCacheControl : str13;
        String str58 = (i18 & 268435456) != 0 ? transferRecord.headerExpire : str14;
        String str59 = (i18 & 536870912) != 0 ? transferRecord.headerStorageClass : str15;
        Map map3 = (i18 & 1073741824) != 0 ? transferRecord.userMetadata : map;
        String str60 = (i18 & Integer.MIN_VALUE) != 0 ? transferRecord.expirationTimeRuleId : str16;
        String str61 = (i19 & 1) != 0 ? transferRecord.httpExpires : str17;
        String str62 = (i19 & 2) != 0 ? transferRecord.sseAlgorithm : str18;
        String str63 = (i19 & 4) != 0 ? transferRecord.sseKMSKey : str19;
        String str64 = (i19 & 8) != 0 ? transferRecord.md5 : str20;
        String str65 = (i19 & 16) != 0 ? transferRecord.cannedAcl : str21;
        String str66 = (i19 & 32) != 0 ? transferRecord.workManagerRequestId : str22;
        if ((i19 & 64) != 0) {
            str23 = str66;
            i20 = transferRecord.useAccelerateEndpoint;
            str25 = str53;
            str26 = str54;
            str27 = str55;
            str28 = str56;
            str29 = str57;
            str30 = str58;
            str31 = str59;
            map2 = map3;
            str32 = str60;
            str33 = str61;
            str34 = str62;
            str35 = str63;
            str36 = str64;
            str37 = str65;
            transferType2 = transferType3;
            transferState2 = transferState3;
            j15 = j21;
            j16 = j22;
            j17 = j23;
            str38 = str46;
            str39 = str47;
            str40 = str48;
            str41 = str49;
            str42 = str50;
            str43 = str51;
            str24 = str52;
        } else {
            i20 = i17;
            str23 = str66;
            str24 = str52;
            str25 = str53;
            str26 = str54;
            str27 = str55;
            str28 = str56;
            str29 = str57;
            str30 = str58;
            str31 = str59;
            map2 = map3;
            str32 = str60;
            str33 = str61;
            str34 = str62;
            str35 = str63;
            str36 = str64;
            str37 = str65;
            transferType2 = transferType3;
            transferState2 = transferState3;
            j15 = j21;
            j16 = j22;
            j17 = j23;
            str38 = str46;
            str39 = str47;
            str40 = str48;
            str41 = str49;
            str42 = str50;
            str43 = str51;
        }
        return transferRecord.copy(i28, str45, i22, i23, i24, i25, i26, i27, j18, j19, j20, j15, j16, j17, transferType2, transferState2, str38, str39, str40, str41, str42, str43, str24, str25, str26, str27, str28, str29, str30, str31, map2, str32, str33, str34, str35, str36, str37, str23, i20);
    }

    public static final TransferRecord updateFromDB(Cursor cursor) {
        return Companion.updateFromDB(cursor);
    }

    public final int component1() {
        return this.f43860id;
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
        return this.type;
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

    public final TransferRecord copy(int i10, String transferId, int i11, int i12, int i13, int i14, int i15, int i16, long j6, long j10, long j11, long j12, long j13, long j14, TransferType transferType, TransferState transferState, String str, String str2, String str3, String str4, String file, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, String> map, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i17) {
        AbstractC4154l.m8923f(transferId, "transferId");
        AbstractC4154l.m8923f(file, "file");
        return new TransferRecord(i10, transferId, i11, i12, i13, i14, i15, i16, j6, j10, j11, j12, j13, j14, transferType, transferState, str, str2, str3, str4, file, str5, str6, str7, str8, str9, str10, str11, str12, str13, map, str14, str15, str16, str17, str18, str19, str20, i17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferRecord)) {
            return false;
        }
        TransferRecord transferRecord = (TransferRecord) obj;
        return this.f43860id == transferRecord.f43860id && AbstractC4154l.m8918a(this.transferId, transferRecord.transferId) && this.mainUploadId == transferRecord.mainUploadId && this.isRequesterPays == transferRecord.isRequesterPays && this.isMultipart == transferRecord.isMultipart && this.isLastPart == transferRecord.isLastPart && this.isEncrypted == transferRecord.isEncrypted && this.partNumber == transferRecord.partNumber && this.bytesTotal == transferRecord.bytesTotal && this.bytesCurrent == transferRecord.bytesCurrent && this.speed == transferRecord.speed && this.rangeStart == transferRecord.rangeStart && this.rangeLast == transferRecord.rangeLast && this.fileOffset == transferRecord.fileOffset && this.type == transferRecord.type && this.state == transferRecord.state && AbstractC4154l.m8918a(this.bucketName, transferRecord.bucketName) && AbstractC4154l.m8918a(this.region, transferRecord.region) && AbstractC4154l.m8918a(this.key, transferRecord.key) && AbstractC4154l.m8918a(this.versionId, transferRecord.versionId) && AbstractC4154l.m8918a(this.file, transferRecord.file) && AbstractC4154l.m8918a(this.multipartId, transferRecord.multipartId) && AbstractC4154l.m8918a(this.eTag, transferRecord.eTag) && AbstractC4154l.m8918a(this.headerContentType, transferRecord.headerContentType) && AbstractC4154l.m8918a(this.headerContentLanguage, transferRecord.headerContentLanguage) && AbstractC4154l.m8918a(this.headerContentDisposition, transferRecord.headerContentDisposition) && AbstractC4154l.m8918a(this.headerContentEncoding, transferRecord.headerContentEncoding) && AbstractC4154l.m8918a(this.headerCacheControl, transferRecord.headerCacheControl) && AbstractC4154l.m8918a(this.headerExpire, transferRecord.headerExpire) && AbstractC4154l.m8918a(this.headerStorageClass, transferRecord.headerStorageClass) && AbstractC4154l.m8918a(this.userMetadata, transferRecord.userMetadata) && AbstractC4154l.m8918a(this.expirationTimeRuleId, transferRecord.expirationTimeRuleId) && AbstractC4154l.m8918a(this.httpExpires, transferRecord.httpExpires) && AbstractC4154l.m8918a(this.sseAlgorithm, transferRecord.sseAlgorithm) && AbstractC4154l.m8918a(this.sseKMSKey, transferRecord.sseKMSKey) && AbstractC4154l.m8918a(this.md5, transferRecord.md5) && AbstractC4154l.m8918a(this.cannedAcl, transferRecord.cannedAcl) && AbstractC4154l.m8918a(this.workManagerRequestId, transferRecord.workManagerRequestId) && this.useAccelerateEndpoint == transferRecord.useAccelerateEndpoint;
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
        return this.f43860id;
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
        return this.type;
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
        int iM4557d = AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4556c(this.partNumber, AbstractC1452a.m4556c(this.isEncrypted, AbstractC1452a.m4556c(this.isLastPart, AbstractC1452a.m4556c(this.isMultipart, AbstractC1452a.m4556c(this.isRequesterPays, AbstractC1452a.m4556c(this.mainUploadId, AbstractC0030c.m113d(Integer.hashCode(this.f43860id) * 31, 31, this.transferId), 31), 31), 31), 31), 31), 31), 31, this.bytesTotal), 31, this.bytesCurrent), 31, this.speed), 31, this.rangeStart), 31, this.rangeLast), 31, this.fileOffset);
        TransferType transferType = this.type;
        int iHashCode = (iM4557d + (transferType == null ? 0 : transferType.hashCode())) * 31;
        TransferState transferState = this.state;
        int iHashCode2 = (iHashCode + (transferState == null ? 0 : transferState.hashCode())) * 31;
        String str = this.bucketName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.versionId;
        int iM113d = AbstractC0030c.m113d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.file);
        String str5 = this.multipartId;
        int iHashCode6 = (iM113d + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eTag;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.headerContentType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.headerContentLanguage;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.headerContentDisposition;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.headerContentEncoding;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.headerCacheControl;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.headerExpire;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.headerStorageClass;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, String> map = this.userMetadata;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str14 = this.expirationTimeRuleId;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.httpExpires;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sseAlgorithm;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.sseKMSKey;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.md5;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.cannedAcl;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.workManagerRequestId;
        return Integer.hashCode(this.useAccelerateEndpoint) + ((iHashCode21 + (str20 != null ? str20.hashCode() : 0)) * 31);
    }

    public final int isEncrypted() {
        return this.isEncrypted;
    }

    public final int isLastPart() {
        return this.isLastPart;
    }

    public final boolean isMainRecord$aws_storage_s3_release() {
        int i10 = this.isMultipart;
        return i10 == 0 || (i10 == 1 && this.mainUploadId == 0);
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

    public final void setBytesCurrent(long j6) {
        this.bytesCurrent = j6;
    }

    public final void setBytesTotal(long j6) {
        this.bytesTotal = j6;
    }

    public final void setCannedAcl(String str) {
        this.cannedAcl = str;
    }

    public final void setETag(String str) {
        this.eTag = str;
    }

    public final void setEncrypted(int i10) {
        this.isEncrypted = i10;
    }

    public final void setExpirationTimeRuleId(String str) {
        this.expirationTimeRuleId = str;
    }

    public final void setFile(String str) {
        AbstractC4154l.m8923f(str, "<set-?>");
        this.file = str;
    }

    public final void setFileOffset(long j6) {
        this.fileOffset = j6;
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

    public final void setId(int i10) {
        this.f43860id = i10;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLastPart(int i10) {
        this.isLastPart = i10;
    }

    public final void setMainUploadId(int i10) {
        this.mainUploadId = i10;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setMultipart(int i10) {
        this.isMultipart = i10;
    }

    public final void setMultipartId(String str) {
        this.multipartId = str;
    }

    public final void setPartNumber(int i10) {
        this.partNumber = i10;
    }

    public final void setRangeLast(long j6) {
        this.rangeLast = j6;
    }

    public final void setRangeStart(long j6) {
        this.rangeStart = j6;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setRequesterPays(int i10) {
        this.isRequesterPays = i10;
    }

    public final void setSpeed(long j6) {
        this.speed = j6;
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
        AbstractC4154l.m8923f(str, "<set-?>");
        this.transferId = str;
    }

    public final void setType(TransferType transferType) {
        this.type = transferType;
    }

    public final void setUseAccelerateEndpoint(int i10) {
        this.useAccelerateEndpoint = i10;
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
        int i10 = this.f43860id;
        String str = this.transferId;
        int i11 = this.mainUploadId;
        int i12 = this.isRequesterPays;
        int i13 = this.isMultipart;
        int i14 = this.isLastPart;
        int i15 = this.isEncrypted;
        int i16 = this.partNumber;
        long j6 = this.bytesTotal;
        long j10 = this.bytesCurrent;
        long j11 = this.speed;
        long j12 = this.rangeStart;
        long j13 = this.rangeLast;
        long j14 = this.fileOffset;
        TransferType transferType = this.type;
        TransferState transferState = this.state;
        String str2 = this.bucketName;
        String str3 = this.region;
        String str4 = this.key;
        String str5 = this.versionId;
        String str6 = this.file;
        String str7 = this.multipartId;
        String str8 = this.eTag;
        String str9 = this.headerContentType;
        String str10 = this.headerContentLanguage;
        String str11 = this.headerContentDisposition;
        String str12 = this.headerContentEncoding;
        String str13 = this.headerCacheControl;
        String str14 = this.headerExpire;
        String str15 = this.headerStorageClass;
        Map<String, String> map = this.userMetadata;
        String str16 = this.expirationTimeRuleId;
        String str17 = this.httpExpires;
        String str18 = this.sseAlgorithm;
        String str19 = this.sseKMSKey;
        String str20 = this.md5;
        String str21 = this.cannedAcl;
        String str22 = this.workManagerRequestId;
        int i17 = this.useAccelerateEndpoint;
        StringBuilder sbM14337q = a1.m14337q(i10, "TransferRecord(id=", ", transferId=", str, ", mainUploadId=");
        sbM14337q.append(i11);
        sbM14337q.append(", isRequesterPays=");
        sbM14337q.append(i12);
        sbM14337q.append(", isMultipart=");
        sbM14337q.append(i13);
        sbM14337q.append(", isLastPart=");
        sbM14337q.append(i14);
        sbM14337q.append(", isEncrypted=");
        sbM14337q.append(i15);
        sbM14337q.append(", partNumber=");
        sbM14337q.append(i16);
        sbM14337q.append(", bytesTotal=");
        sbM14337q.append(j6);
        sbM14337q.append(", bytesCurrent=");
        sbM14337q.append(j10);
        sbM14337q.append(", speed=");
        sbM14337q.append(j11);
        sbM14337q.append(", rangeStart=");
        sbM14337q.append(j12);
        sbM14337q.append(", rangeLast=");
        sbM14337q.append(j13);
        sbM14337q.append(", fileOffset=");
        sbM14337q.append(j14);
        sbM14337q.append(", type=");
        sbM14337q.append(transferType);
        sbM14337q.append(", state=");
        sbM14337q.append(transferState);
        sbM14337q.append(", bucketName=");
        a1.m14319B(sbM14337q, str2, ", region=", str3, ", key=");
        a1.m14319B(sbM14337q, str4, ", versionId=", str5, ", file=");
        a1.m14319B(sbM14337q, str6, ", multipartId=", str7, ", eTag=");
        a1.m14319B(sbM14337q, str8, ", headerContentType=", str9, ", headerContentLanguage=");
        a1.m14319B(sbM14337q, str10, ", headerContentDisposition=", str11, ", headerContentEncoding=");
        a1.m14319B(sbM14337q, str12, ", headerCacheControl=", str13, ", headerExpire=");
        a1.m14319B(sbM14337q, str14, ", headerStorageClass=", str15, ", userMetadata=");
        sbM14337q.append(map);
        sbM14337q.append(", expirationTimeRuleId=");
        sbM14337q.append(str16);
        sbM14337q.append(", httpExpires=");
        a1.m14319B(sbM14337q, str17, ", sseAlgorithm=", str18, ", sseKMSKey=");
        a1.m14319B(sbM14337q, str19, ", md5=", str20, ", cannedAcl=");
        a1.m14319B(sbM14337q, str21, ", workManagerRequestId=", str22, ", useAccelerateEndpoint=");
        return AbstractC5601a.m11233d(i17, ")", sbM14337q);
    }

    public /* synthetic */ TransferRecord(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, long j6, long j10, long j11, long j12, long j13, long j14, TransferType transferType, TransferState transferState, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i17, int i18, int i19, AbstractC4148f abstractC4148f) {
        this(i10, str, (i18 & 4) != 0 ? 0 : i11, (i18 & 8) != 0 ? 0 : i12, (i18 & 16) != 0 ? 0 : i13, (i18 & 32) != 0 ? 0 : i14, (i18 & 64) != 0 ? 0 : i15, (i18 & 128) != 0 ? 0 : i16, (i18 & 256) != 0 ? 0L : j6, (i18 & 512) != 0 ? 0L : j10, (i18 & 1024) != 0 ? 0L : j11, (i18 & NewHope.SENDB_BYTES) != 0 ? 0L : j12, (i18 & 4096) != 0 ? 0L : j13, (i18 & 8192) == 0 ? j14 : 0L, (i18 & 16384) != 0 ? null : transferType, (i18 & 32768) != 0 ? null : transferState, (i18 & 65536) != 0 ? null : str2, (i18 & 131072) != 0 ? null : str3, (i18 & 262144) != 0 ? null : str4, (i18 & 524288) != 0 ? null : str5, (i18 & 1048576) != 0 ? "" : str6, (i18 & 2097152) != 0 ? null : str7, (i18 & 4194304) != 0 ? null : str8, (i18 & 8388608) != 0 ? null : str9, (i18 & 16777216) != 0 ? null : str10, (i18 & 33554432) != 0 ? null : str11, (i18 & 67108864) != 0 ? null : str12, (i18 & 134217728) != 0 ? null : str13, (i18 & 268435456) != 0 ? null : str14, (i18 & 536870912) != 0 ? null : str15, (i18 & 1073741824) != 0 ? null : map, (i18 & Integer.MIN_VALUE) != 0 ? null : str16, (i19 & 1) != 0 ? null : str17, (i19 & 2) != 0 ? null : str18, (i19 & 4) != 0 ? null : str19, (i19 & 8) != 0 ? null : str20, (i19 & 16) != 0 ? null : str21, (i19 & 32) == 0 ? str22 : null, (i19 & 64) != 0 ? 0 : i17);
    }
}
