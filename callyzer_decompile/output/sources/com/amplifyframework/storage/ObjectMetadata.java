package com.amplifyframework.storage;

import i0.m0;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public ObjectMetadata() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ObjectMetadata copy$default(ObjectMetadata objectMetadata, Map map, Map map2, Date date, Date date2, String str, Boolean bool, Date date3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = objectMetadata.userMetadata;
        }
        if ((i10 & 2) != 0) {
            map2 = objectMetadata.metaData;
        }
        if ((i10 & 4) != 0) {
            date = objectMetadata.httpExpiresDate;
        }
        if ((i10 & 8) != 0) {
            date2 = objectMetadata.expirationTime;
        }
        if ((i10 & 16) != 0) {
            str = objectMetadata.expirationTimeRuleId;
        }
        if ((i10 & 32) != 0) {
            bool = objectMetadata.ongoingRestore;
        }
        if ((i10 & 64) != 0) {
            date3 = objectMetadata.restoreExpirationTime;
        }
        Boolean bool2 = bool;
        Date date4 = date3;
        String str2 = str;
        Date date5 = date;
        return objectMetadata.copy(map, map2, date5, date2, str2, bool2, date4);
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

    public final ObjectMetadata copy(Map<String, String> userMetadata, Map<String, Object> metaData, Date date, Date date2, String str, Boolean bool, Date date3) {
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
        return new ObjectMetadata(userMetadata, metaData, date, date2, str, bool, date3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectMetadata)) {
            return false;
        }
        ObjectMetadata objectMetadata = (ObjectMetadata) obj;
        return AbstractC4154l.m8918a(this.userMetadata, objectMetadata.userMetadata) && AbstractC4154l.m8918a(this.metaData, objectMetadata.metaData) && AbstractC4154l.m8918a(this.httpExpiresDate, objectMetadata.httpExpiresDate) && AbstractC4154l.m8918a(this.expirationTime, objectMetadata.expirationTime) && AbstractC4154l.m8918a(this.expirationTimeRuleId, objectMetadata.expirationTimeRuleId) && AbstractC4154l.m8918a(this.ongoingRestore, objectMetadata.ongoingRestore) && AbstractC4154l.m8918a(this.restoreExpirationTime, objectMetadata.restoreExpirationTime);
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
        int iM7369b = m0.m7369b(this.userMetadata.hashCode() * 31, 31, this.metaData);
        Date date = this.httpExpiresDate;
        int iHashCode = (iM7369b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationTime;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.expirationTimeRuleId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.ongoingRestore;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date3 = this.restoreExpirationTime;
        return iHashCode4 + (date3 != null ? date3.hashCode() : 0);
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
        AbstractC4154l.m8923f(map, "<set-?>");
        this.metaData = map;
    }

    public final void setOngoingRestore(Boolean bool) {
        this.ongoingRestore = bool;
    }

    public final void setRestoreExpirationTime(Date date) {
        this.restoreExpirationTime = date;
    }

    public final void setUserMetadata(Map<String, String> map) {
        AbstractC4154l.m8923f(map, "<set-?>");
        this.userMetadata = map;
    }

    public String toString() {
        return "ObjectMetadata(userMetadata=" + this.userMetadata + ", metaData=" + this.metaData + ", httpExpiresDate=" + this.httpExpiresDate + ", expirationTime=" + this.expirationTime + ", expirationTimeRuleId=" + this.expirationTimeRuleId + ", ongoingRestore=" + this.ongoingRestore + ", restoreExpirationTime=" + this.restoreExpirationTime + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata) {
        this(userMetadata, null, null, null, null, null, null, 126, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData) {
        this(userMetadata, metaData, null, null, null, null, null, 124, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData, Date date) {
        this(userMetadata, metaData, date, null, null, null, null, 120, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData, Date date, Date date2) {
        this(userMetadata, metaData, date, date2, null, null, null, 112, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData, Date date, Date date2, String str) {
        this(userMetadata, metaData, date, date2, str, null, null, 96, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData, Date date, Date date2, String str, Boolean bool) {
        this(userMetadata, metaData, date, date2, str, bool, null, 64, null);
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
    }

    public ObjectMetadata(Map<String, String> userMetadata, Map<String, Object> metaData, Date date, Date date2, String str, Boolean bool, Date date3) {
        AbstractC4154l.m8923f(userMetadata, "userMetadata");
        AbstractC4154l.m8923f(metaData, "metaData");
        this.userMetadata = userMetadata;
        this.metaData = metaData;
        this.httpExpiresDate = date;
        this.expirationTime = date2;
        this.expirationTimeRuleId = str;
        this.ongoingRestore = bool;
        this.restoreExpirationTime = date3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ObjectMetadata(java.util.Map r2, java.util.Map r3, java.util.Date r4, java.util.Date r5, java.lang.String r6, java.lang.Boolean r7, java.util.Date r8, int r9, kotlin.jvm.internal.AbstractC4148f r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            if (r10 == 0) goto Le
            java.util.TreeMap r2 = new java.util.TreeMap
            nx.AbstractC5185w.m10131m()
            r2.<init>(r0)
        Le:
            r10 = r9 & 2
            if (r10 == 0) goto L1a
            java.util.TreeMap r3 = new java.util.TreeMap
            nx.AbstractC5185w.m10131m()
            r3.<init>(r0)
        L1a:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L20
            r4 = r0
        L20:
            r10 = r9 & 8
            if (r10 == 0) goto L25
            r5 = r0
        L25:
            r10 = r9 & 16
            if (r10 == 0) goto L2a
            r6 = r0
        L2a:
            r10 = r9 & 32
            if (r10 == 0) goto L30
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L30:
            r9 = r9 & 64
            if (r9 == 0) goto L3d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L45
        L3d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L45:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.ObjectMetadata.<init>(java.util.Map, java.util.Map, java.util.Date, java.util.Date, java.lang.String, java.lang.Boolean, java.util.Date, int, kotlin.jvm.internal.f):void");
    }
}
