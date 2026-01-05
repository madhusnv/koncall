package com.amplifyframework.auth.cognito.result;

import a2.AbstractC0030c;
import com.amplifyframework.auth.result.AuthWebAuthnCredential;
import j$.time.Instant;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoWebAuthnCredential implements AuthWebAuthnCredential {
    private final Instant createdAt;
    private final String credentialId;
    private final String friendlyName;
    private final String relyingPartyId;

    public CognitoWebAuthnCredential(String credentialId, String str, String relyingPartyId, Instant createdAt) {
        AbstractC4154l.m8923f(credentialId, "credentialId");
        AbstractC4154l.m8923f(relyingPartyId, "relyingPartyId");
        AbstractC4154l.m8923f(createdAt, "createdAt");
        this.credentialId = credentialId;
        this.friendlyName = str;
        this.relyingPartyId = relyingPartyId;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ CognitoWebAuthnCredential copy$default(CognitoWebAuthnCredential cognitoWebAuthnCredential, String str, String str2, String str3, Instant instant, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cognitoWebAuthnCredential.credentialId;
        }
        if ((i10 & 2) != 0) {
            str2 = cognitoWebAuthnCredential.friendlyName;
        }
        if ((i10 & 4) != 0) {
            str3 = cognitoWebAuthnCredential.relyingPartyId;
        }
        if ((i10 & 8) != 0) {
            instant = cognitoWebAuthnCredential.createdAt;
        }
        return cognitoWebAuthnCredential.copy(str, str2, str3, instant);
    }

    public final String component1() {
        return this.credentialId;
    }

    public final String component2() {
        return this.friendlyName;
    }

    public final String component3() {
        return this.relyingPartyId;
    }

    public final Instant component4() {
        return this.createdAt;
    }

    public final CognitoWebAuthnCredential copy(String credentialId, String str, String relyingPartyId, Instant createdAt) {
        AbstractC4154l.m8923f(credentialId, "credentialId");
        AbstractC4154l.m8923f(relyingPartyId, "relyingPartyId");
        AbstractC4154l.m8923f(createdAt, "createdAt");
        return new CognitoWebAuthnCredential(credentialId, str, relyingPartyId, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CognitoWebAuthnCredential)) {
            return false;
        }
        CognitoWebAuthnCredential cognitoWebAuthnCredential = (CognitoWebAuthnCredential) obj;
        return AbstractC4154l.m8918a(this.credentialId, cognitoWebAuthnCredential.credentialId) && AbstractC4154l.m8918a(this.friendlyName, cognitoWebAuthnCredential.friendlyName) && AbstractC4154l.m8918a(this.relyingPartyId, cognitoWebAuthnCredential.relyingPartyId) && AbstractC4154l.m8918a(this.createdAt, cognitoWebAuthnCredential.createdAt);
    }

    @Override // com.amplifyframework.auth.result.AuthWebAuthnCredential
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @Override // com.amplifyframework.auth.result.AuthWebAuthnCredential
    public String getCredentialId() {
        return this.credentialId;
    }

    @Override // com.amplifyframework.auth.result.AuthWebAuthnCredential
    public String getFriendlyName() {
        return this.friendlyName;
    }

    @Override // com.amplifyframework.auth.result.AuthWebAuthnCredential
    public String getRelyingPartyId() {
        return this.relyingPartyId;
    }

    public int hashCode() {
        int iHashCode = this.credentialId.hashCode() * 31;
        String str = this.friendlyName;
        return this.createdAt.hashCode() + AbstractC0030c.m113d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.relyingPartyId);
    }

    public String toString() {
        String str = this.credentialId;
        String str2 = this.friendlyName;
        String str3 = this.relyingPartyId;
        Instant instant = this.createdAt;
        StringBuilder sbM127r = AbstractC0030c.m127r("CognitoWebAuthnCredential(credentialId=", str, ", friendlyName=", str2, ", relyingPartyId=");
        sbM127r.append(str3);
        sbM127r.append(", createdAt=");
        sbM127r.append(instant);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
