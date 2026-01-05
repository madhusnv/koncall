package com.amplifyframework.auth.plugins.core.data;

import p001o.dc9;
import p001o.dff;
import p001o.f9g;
import p001o.fff;
import p001o.id5;
import p001o.kl8;
import p001o.lo3;
import p001o.p8g;
import p001o.qla;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class AWSCredentialsInternal {
    public static final Companion Companion = new Companion(null);
    private final String accessKeyId;
    private final Long expiration;
    private final String secretAccessKey;
    private final String sessionToken;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return AWSCredentialsInternal$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AWSCredentialsInternal(int i, String str, String str2, String str3, Long l, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, AWSCredentialsInternal$$serializer.INSTANCE.getDescriptor());
        }
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l;
    }

    public static /* synthetic */ AWSCredentialsInternal copy$default(AWSCredentialsInternal aWSCredentialsInternal, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCredentialsInternal.accessKeyId;
        }
        if ((i & 2) != 0) {
            str2 = aWSCredentialsInternal.secretAccessKey;
        }
        if ((i & 4) != 0) {
            str3 = aWSCredentialsInternal.sessionToken;
        }
        if ((i & 8) != 0) {
            l = aWSCredentialsInternal.expiration;
        }
        return aWSCredentialsInternal.copy(str, str2, str3, l);
    }

    public static final /* synthetic */ void write$Self(AWSCredentialsInternal aWSCredentialsInternal, lo3 lo3Var, uef uefVar) {
        p8g p8gVar = p8g.f39602a;
        lo3Var.mo37571z(uefVar, 0, p8gVar, aWSCredentialsInternal.accessKeyId);
        lo3Var.mo37571z(uefVar, 1, p8gVar, aWSCredentialsInternal.secretAccessKey);
        lo3Var.mo37571z(uefVar, 2, p8gVar, aWSCredentialsInternal.sessionToken);
        lo3Var.mo37571z(uefVar, 3, qla.f42120a, aWSCredentialsInternal.expiration);
    }

    public final String component1() {
        return this.accessKeyId;
    }

    public final String component2() {
        return this.secretAccessKey;
    }

    public final String component3() {
        return this.sessionToken;
    }

    public final Long component4() {
        return this.expiration;
    }

    public final AWSCredentialsInternal copy(String str, String str2, String str3, Long l) {
        return new AWSCredentialsInternal(str, str2, str3, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCredentialsInternal)) {
            return false;
        }
        AWSCredentialsInternal aWSCredentialsInternal = (AWSCredentialsInternal) obj;
        return sq8.m48644c(this.accessKeyId, aWSCredentialsInternal.accessKeyId) && sq8.m48644c(this.secretAccessKey, aWSCredentialsInternal.secretAccessKey) && sq8.m48644c(this.sessionToken, aWSCredentialsInternal.sessionToken) && sq8.m48644c(this.expiration, aWSCredentialsInternal.expiration);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final Long getExpiration() {
        return this.expiration;
    }

    public final String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        String str = this.accessKeyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretAccessKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expiration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.accessKeyId;
        String strL0 = str != null ? f9g.L0(str, new kl8(0, 4)) : null;
        String str2 = this.secretAccessKey;
        String strL02 = str2 != null ? f9g.L0(str2, new kl8(0, 4)) : null;
        String str3 = this.sessionToken;
        return "AWSCredentials(accessKeyId = " + strL0 + "***, secretAccessKey = " + strL02 + "***, sessionToken = " + (str3 != null ? f9g.L0(str3, new kl8(0, 4)) : null) + "***, expiration = " + this.expiration + ")";
    }

    public AWSCredentialsInternal(String str, String str2, String str3, Long l) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l;
    }
}
