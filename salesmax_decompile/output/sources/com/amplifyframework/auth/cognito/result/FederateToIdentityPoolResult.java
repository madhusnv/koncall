package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AWSTemporaryCredentials;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class FederateToIdentityPoolResult {
    private final AWSTemporaryCredentials credentials;
    private final String identityId;

    public FederateToIdentityPoolResult(String str, AWSTemporaryCredentials aWSTemporaryCredentials) {
        sq8.m48649h(str, "identityId");
        sq8.m48649h(aWSTemporaryCredentials, "credentials");
        this.identityId = str;
        this.credentials = aWSTemporaryCredentials;
    }

    public static /* synthetic */ FederateToIdentityPoolResult copy$default(FederateToIdentityPoolResult federateToIdentityPoolResult, String str, AWSTemporaryCredentials aWSTemporaryCredentials, int i, Object obj) {
        if ((i & 1) != 0) {
            str = federateToIdentityPoolResult.identityId;
        }
        if ((i & 2) != 0) {
            aWSTemporaryCredentials = federateToIdentityPoolResult.credentials;
        }
        return federateToIdentityPoolResult.copy(str, aWSTemporaryCredentials);
    }

    public final String component1() {
        return this.identityId;
    }

    public final AWSTemporaryCredentials component2() {
        return this.credentials;
    }

    public final FederateToIdentityPoolResult copy(String str, AWSTemporaryCredentials aWSTemporaryCredentials) {
        sq8.m48649h(str, "identityId");
        sq8.m48649h(aWSTemporaryCredentials, "credentials");
        return new FederateToIdentityPoolResult(str, aWSTemporaryCredentials);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederateToIdentityPoolResult)) {
            return false;
        }
        FederateToIdentityPoolResult federateToIdentityPoolResult = (FederateToIdentityPoolResult) obj;
        return sq8.m48644c(this.identityId, federateToIdentityPoolResult.identityId) && sq8.m48644c(this.credentials, federateToIdentityPoolResult.credentials);
    }

    public final AWSTemporaryCredentials getCredentials() {
        return this.credentials;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return (this.identityId.hashCode() * 31) + this.credentials.hashCode();
    }

    public String toString() {
        return "FederateToIdentityPoolResult(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
    }
}
