package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.result.AuthWebAuthnCredential;
import j$.time.Instant;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CognitoWebAuthnCredential implements AuthWebAuthnCredential {
    private final Instant createdAt;
    private final String credentialId;
    private final String friendlyName;
    private final String relyingPartyId;

    public CognitoWebAuthnCredential(String str, String str2, String str3, Instant instant) {
        sq8.m48649h(str, "credentialId");
        sq8.m48649h(str3, "relyingPartyId");
        sq8.m48649h(instant, "createdAt");
        this.credentialId = str;
        this.friendlyName = str2;
        this.relyingPartyId = str3;
        this.createdAt = instant;
    }

    public static /* synthetic */ CognitoWebAuthnCredential copy$default(CognitoWebAuthnCredential cognitoWebAuthnCredential, String str, String str2, String str3, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cognitoWebAuthnCredential.credentialId;
        }
        if ((i & 2) != 0) {
            str2 = cognitoWebAuthnCredential.friendlyName;
        }
        if ((i & 4) != 0) {
            str3 = cognitoWebAuthnCredential.relyingPartyId;
        }
        if ((i & 8) != 0) {
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

    public final CognitoWebAuthnCredential copy(String str, String str2, String str3, Instant instant) {
        sq8.m48649h(str, "credentialId");
        sq8.m48649h(str3, "relyingPartyId");
        sq8.m48649h(instant, "createdAt");
        return new CognitoWebAuthnCredential(str, str2, str3, instant);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CognitoWebAuthnCredential)) {
            return false;
        }
        CognitoWebAuthnCredential cognitoWebAuthnCredential = (CognitoWebAuthnCredential) obj;
        return sq8.m48644c(this.credentialId, cognitoWebAuthnCredential.credentialId) && sq8.m48644c(this.friendlyName, cognitoWebAuthnCredential.friendlyName) && sq8.m48644c(this.relyingPartyId, cognitoWebAuthnCredential.relyingPartyId) && sq8.m48644c(this.createdAt, cognitoWebAuthnCredential.createdAt);
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
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.relyingPartyId.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "CognitoWebAuthnCredential(credentialId=" + this.credentialId + ", friendlyName=" + this.friendlyName + ", relyingPartyId=" + this.relyingPartyId + ", createdAt=" + this.createdAt + ")";
    }
}
