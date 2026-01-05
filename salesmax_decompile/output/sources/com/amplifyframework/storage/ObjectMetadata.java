package com.amplifyframework.storage;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.objectweb.asm.Opcodes;
import p001o.e9g;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ObjectMetadata {
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_MD5 = "Content-MD5";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final Companion Companion = new Companion(null);
    public static final String REDIRECT_LOCATION = "x-amz-website-redirect-location";
    public static final String REQUESTER_PAYS_HEADER = "x-amz-request-payer";
    public static final String S3_TAGGING = "x-amz-tagging";
    public static final String SERVER_SIDE_ENCRYPTION = "x-amz-server-side-encryption";
    public static final String SERVER_SIDE_ENCRYPTION_KMS_KEY_ID = "x-amz-server-side-encryption-aws-kms-key-id";
    public static final String STORAGE_CLASS = "x-amz-storage-class";
    private Date expirationTime;
    private String expirationTimeRuleId;
    private Date httpExpiresDate;
    private Map<String, Object> metaData;
    private Boolean ongoingRestore;
    private Date restoreExpirationTime;
    private Map<String, String> userMetadata;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public ObjectMetadata() {
        this(null, null, null, null, null, null, null, Opcodes.LAND, null);
    }

    public static /* synthetic */ ObjectMetadata copy$default(ObjectMetadata objectMetadata, Map map, Map map2, Date date, Date date2, String str, Boolean bool, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = objectMetadata.userMetadata;
        }
        if ((i & 2) != 0) {
            map2 = objectMetadata.metaData;
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            date = objectMetadata.httpExpiresDate;
        }
        Date date4 = date;
        if ((i & 8) != 0) {
            date2 = objectMetadata.expirationTime;
        }
        Date date5 = date2;
        if ((i & 16) != 0) {
            str = objectMetadata.expirationTimeRuleId;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            bool = objectMetadata.ongoingRestore;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            date3 = objectMetadata.restoreExpirationTime;
        }
        return objectMetadata.copy(map, map3, date4, date5, str2, bool2, date3);
    }

    public final Map<String, String> component1() {
        return this.userMetadata;
    }

    public final Map<String, Object> component2() {
        return this.metaData;
    }

    public final Date component3() {
        return this.httpExpiresDate;
    }

    public final Date component4() {
        return this.expirationTime;
    }

    public final String component5() {
        return this.expirationTimeRuleId;
    }

    public final Boolean component6() {
        return this.ongoingRestore;
    }

    public final Date component7() {
        return this.restoreExpirationTime;
    }

    public final ObjectMetadata copy(Map<String, String> map, Map<String, Object> map2, Date date, Date date2, String str, Boolean bool, Date date3) {
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
        return new ObjectMetadata(map, map2, date, date2, str, bool, date3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectMetadata)) {
            return false;
        }
        ObjectMetadata objectMetadata = (ObjectMetadata) obj;
        return sq8.m48644c(this.userMetadata, objectMetadata.userMetadata) && sq8.m48644c(this.metaData, objectMetadata.metaData) && sq8.m48644c(this.httpExpiresDate, objectMetadata.httpExpiresDate) && sq8.m48644c(this.expirationTime, objectMetadata.expirationTime) && sq8.m48644c(this.expirationTimeRuleId, objectMetadata.expirationTimeRuleId) && sq8.m48644c(this.ongoingRestore, objectMetadata.ongoingRestore) && sq8.m48644c(this.restoreExpirationTime, objectMetadata.restoreExpirationTime);
    }

    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    public final String getExpirationTimeRuleId() {
        return this.expirationTimeRuleId;
    }

    public final Date getHttpExpiresDate() {
        return this.httpExpiresDate;
    }

    public final Map<String, Object> getMetaData() {
        return this.metaData;
    }

    public final Boolean getOngoingRestore() {
        return this.ongoingRestore;
    }

    public final Date getRestoreExpirationTime() {
        return this.restoreExpirationTime;
    }

    public final Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        int iHashCode = ((this.userMetadata.hashCode() * 31) + this.metaData.hashCode()) * 31;
        Date date = this.httpExpiresDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationTime;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.expirationTimeRuleId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.ongoingRestore;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date3 = this.restoreExpirationTime;
        return iHashCode5 + (date3 != null ? date3.hashCode() : 0);
    }

    public final void setExpirationTime(Date date) {
        this.expirationTime = date;
    }

    public final void setExpirationTimeRuleId(String str) {
        this.expirationTimeRuleId = str;
    }

    public final void setHttpExpiresDate(Date date) {
        this.httpExpiresDate = date;
    }

    public final void setMetaData(Map<String, Object> map) {
        sq8.m48649h(map, "<set-?>");
        this.metaData = map;
    }

    public final void setOngoingRestore(Boolean bool) {
        this.ongoingRestore = bool;
    }

    public final void setRestoreExpirationTime(Date date) {
        this.restoreExpirationTime = date;
    }

    public final void setUserMetadata(Map<String, String> map) {
        sq8.m48649h(map, "<set-?>");
        this.userMetadata = map;
    }

    public String toString() {
        return "ObjectMetadata(userMetadata=" + this.userMetadata + ", metaData=" + this.metaData + ", httpExpiresDate=" + this.httpExpiresDate + ", expirationTime=" + this.expirationTime + ", expirationTimeRuleId=" + this.expirationTimeRuleId + ", ongoingRestore=" + this.ongoingRestore + ", restoreExpirationTime=" + this.restoreExpirationTime + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map) {
        this(map, null, null, null, null, null, null, 126, null);
        sq8.m48649h(map, "userMetadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2) {
        this(map, map2, null, null, null, null, null, 124, null);
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2, Date date) {
        this(map, map2, date, null, null, null, null, 120, null);
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2, Date date, Date date2) {
        this(map, map2, date, date2, null, null, null, 112, null);
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2, Date date, Date date2, String str) {
        this(map, map2, date, date2, str, null, null, 96, null);
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2, Date date, Date date2, String str, Boolean bool) {
        this(map, map2, date, date2, str, bool, null, 64, null);
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
    }

    public ObjectMetadata(Map<String, String> map, Map<String, Object> map2, Date date, Date date2, String str, Boolean bool, Date date3) {
        sq8.m48649h(map, "userMetadata");
        sq8.m48649h(map2, "metaData");
        this.userMetadata = map;
        this.metaData = map2;
        this.httpExpiresDate = date;
        this.expirationTime = date2;
        this.expirationTimeRuleId = str;
        this.ongoingRestore = bool;
        this.restoreExpirationTime = date3;
    }

    public /* synthetic */ ObjectMetadata(Map map, Map map2, Date date, Date date2, String str, Boolean bool, Date date3, int i, id5 id5Var) {
        this((i & 1) != 0 ? new TreeMap(e9g.m24608z(h8g.f26398a)) : map, (i & 2) != 0 ? new TreeMap(e9g.m24608z(h8g.f26398a)) : map2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : date2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) == 0 ? date3 : null);
    }
}
