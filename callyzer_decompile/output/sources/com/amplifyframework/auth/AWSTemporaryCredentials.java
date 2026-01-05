package com.amplifyframework.auth;

import a2.AbstractC0030c;
import j$.time.Instant;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSTemporaryCredentials extends AWSCredentials {
    private final String accessKeyId;
    private final C7126c expiration;
    private final Instant expiresAt;
    private final String secretAccessKey;
    private final String sessionToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTemporaryCredentials(String accessKeyId, String secretAccessKey, String sessionToken, C7126c expiration) {
        super(accessKeyId, secretAccessKey);
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        AbstractC4154l.m8923f(sessionToken, "sessionToken");
        AbstractC4154l.m8923f(expiration, "expiration");
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.sessionToken = sessionToken;
        this.expiration = expiration;
        this.expiresAt = expiration.f34346a;
    }

    public static /* synthetic */ AWSTemporaryCredentials copy$default(AWSTemporaryCredentials aWSTemporaryCredentials, String str, String str2, String str3, C7126c c7126c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aWSTemporaryCredentials.accessKeyId;
        }
        if ((i10 & 2) != 0) {
            str2 = aWSTemporaryCredentials.secretAccessKey;
        }
        if ((i10 & 4) != 0) {
            str3 = aWSTemporaryCredentials.sessionToken;
        }
        if ((i10 & 8) != 0) {
            c7126c = aWSTemporaryCredentials.expiration;
        }
        return aWSTemporaryCredentials.copy(str, str2, str3, c7126c);
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

    public final C7126c component4() {
        return this.expiration;
    }

    public final AWSTemporaryCredentials copy(String accessKeyId, String secretAccessKey, String sessionToken, C7126c expiration) {
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        AbstractC4154l.m8923f(sessionToken, "sessionToken");
        AbstractC4154l.m8923f(expiration, "expiration");
        return new AWSTemporaryCredentials(accessKeyId, secretAccessKey, sessionToken, expiration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSTemporaryCredentials)) {
            return false;
        }
        AWSTemporaryCredentials aWSTemporaryCredentials = (AWSTemporaryCredentials) obj;
        return AbstractC4154l.m8918a(this.accessKeyId, aWSTemporaryCredentials.accessKeyId) && AbstractC4154l.m8918a(this.secretAccessKey, aWSTemporaryCredentials.secretAccessKey) && AbstractC4154l.m8918a(this.sessionToken, aWSTemporaryCredentials.sessionToken) && AbstractC4154l.m8918a(this.expiration, aWSTemporaryCredentials.expiration);
    }

    @Override // com.amplifyframework.auth.AWSCredentials
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final C7126c getExpiration() {
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
        return this.expiration.f34346a.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(this.accessKeyId.hashCode() * 31, 31, this.secretAccessKey), 31, this.sessionToken);
    }

    public String toString() {
        String str = this.accessKeyId;
        String str2 = this.secretAccessKey;
        String str3 = this.sessionToken;
        C7126c c7126c = this.expiration;
        StringBuilder sbM127r = AbstractC0030c.m127r("AWSTemporaryCredentials(accessKeyId=", str, ", secretAccessKey=", str2, ", sessionToken=");
        sbM127r.append(str3);
        sbM127r.append(", expiration=");
        sbM127r.append(c7126c);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    @InterfaceC6353c
    public static /* synthetic */ void getExpiration$annotations() {
    }
}
