package com.amplifyframework.auth;

import j$.time.Instant;
import p001o.c74;
import p001o.gk8;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSTemporaryCredentials extends AWSCredentials {
    private final String accessKeyId;
    private final gk8 expiration;
    private final Instant expiresAt;
    private final String secretAccessKey;
    private final String sessionToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTemporaryCredentials(String str, String str2, String str3, gk8 gk8Var) {
        super(str, str2);
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        sq8.m48649h(str3, "sessionToken");
        sq8.m48649h(gk8Var, "expiration");
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = gk8Var;
        this.expiresAt = c74.m20362a(gk8Var);
    }

    public static /* synthetic */ AWSTemporaryCredentials copy$default(AWSTemporaryCredentials aWSTemporaryCredentials, String str, String str2, String str3, gk8 gk8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSTemporaryCredentials.accessKeyId;
        }
        if ((i & 2) != 0) {
            str2 = aWSTemporaryCredentials.secretAccessKey;
        }
        if ((i & 4) != 0) {
            str3 = aWSTemporaryCredentials.sessionToken;
        }
        if ((i & 8) != 0) {
            gk8Var = aWSTemporaryCredentials.expiration;
        }
        return aWSTemporaryCredentials.copy(str, str2, str3, gk8Var);
    }

    public static /* synthetic */ void getExpiration$annotations() {
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

    public final gk8 component4() {
        return this.expiration;
    }

    public final AWSTemporaryCredentials copy(String str, String str2, String str3, gk8 gk8Var) {
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        sq8.m48649h(str3, "sessionToken");
        sq8.m48649h(gk8Var, "expiration");
        return new AWSTemporaryCredentials(str, str2, str3, gk8Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSTemporaryCredentials)) {
            return false;
        }
        AWSTemporaryCredentials aWSTemporaryCredentials = (AWSTemporaryCredentials) obj;
        return sq8.m48644c(this.accessKeyId, aWSTemporaryCredentials.accessKeyId) && sq8.m48644c(this.secretAccessKey, aWSTemporaryCredentials.secretAccessKey) && sq8.m48644c(this.sessionToken, aWSTemporaryCredentials.sessionToken) && sq8.m48644c(this.expiration, aWSTemporaryCredentials.expiration);
    }

    @Override // com.amplifyframework.auth.AWSCredentials
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final gk8 getExpiration() {
        return this.expiration;
    }

    public final Instant getExpiresAt() {
        return this.expiresAt;
    }

    @Override // com.amplifyframework.auth.AWSCredentials
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        return (((((this.accessKeyId.hashCode() * 31) + this.secretAccessKey.hashCode()) * 31) + this.sessionToken.hashCode()) * 31) + this.expiration.hashCode();
    }

    public String toString() {
        return "AWSTemporaryCredentials(accessKeyId=" + this.accessKeyId + ", secretAccessKey=" + this.secretAccessKey + ", sessionToken=" + this.sessionToken + ", expiration=" + this.expiration + ")";
    }
}
