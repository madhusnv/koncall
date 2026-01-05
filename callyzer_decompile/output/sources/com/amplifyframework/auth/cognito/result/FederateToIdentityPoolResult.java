package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AWSTemporaryCredentials;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FederateToIdentityPoolResult {
    private final AWSTemporaryCredentials credentials;
    private final String identityId;

    public FederateToIdentityPoolResult(String identityId, AWSTemporaryCredentials credentials) {
        AbstractC4154l.m8923f(identityId, "identityId");
        AbstractC4154l.m8923f(credentials, "credentials");
        this.identityId = identityId;
        this.credentials = credentials;
    }

    public static /* synthetic */ FederateToIdentityPoolResult copy$aws_auth_cognito_release$default(FederateToIdentityPoolResult federateToIdentityPoolResult, String str, AWSTemporaryCredentials aWSTemporaryCredentials, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = federateToIdentityPoolResult.identityId;
        }
        if ((i10 & 2) != 0) {
            aWSTemporaryCredentials = federateToIdentityPoolResult.credentials;
        }
        return federateToIdentityPoolResult.copy$aws_auth_cognito_release(str, aWSTemporaryCredentials);
    }

    public final String component1() {
        return this.identityId;
    }

    public final AWSTemporaryCredentials component2() {
        return this.credentials;
    }

    public final FederateToIdentityPoolResult copy$aws_auth_cognito_release(String identityId, AWSTemporaryCredentials credentials) {
        AbstractC4154l.m8923f(identityId, "identityId");
        AbstractC4154l.m8923f(credentials, "credentials");
        return new FederateToIdentityPoolResult(identityId, credentials);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederateToIdentityPoolResult)) {
            return false;
        }
        FederateToIdentityPoolResult federateToIdentityPoolResult = (FederateToIdentityPoolResult) obj;
        return AbstractC4154l.m8918a(this.identityId, federateToIdentityPoolResult.identityId) && AbstractC4154l.m8918a(this.credentials, federateToIdentityPoolResult.credentials);
    }

    public final AWSTemporaryCredentials getCredentials() {
        return this.credentials;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return this.credentials.hashCode() + (this.identityId.hashCode() * 31);
    }

    public String toString() {
        return "FederateToIdentityPoolResult(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
    }
}
