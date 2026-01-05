package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.result.AuthListWebAuthnCredentialsResult;
import com.amplifyframework.auth.result.AuthWebAuthnCredential;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthListWebAuthnCredentialsResult implements AuthListWebAuthnCredentialsResult {
    private final List<AuthWebAuthnCredential> credentials;
    private final String nextToken;

    /* JADX WARN: Multi-variable type inference failed */
    public AWSCognitoAuthListWebAuthnCredentialsResult(List<? extends AuthWebAuthnCredential> list, String str) {
        sq8.m48649h(list, "credentials");
        this.credentials = list;
        this.nextToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsResult copy$default(AWSCognitoAuthListWebAuthnCredentialsResult aWSCognitoAuthListWebAuthnCredentialsResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aWSCognitoAuthListWebAuthnCredentialsResult.credentials;
        }
        if ((i & 2) != 0) {
            str = aWSCognitoAuthListWebAuthnCredentialsResult.nextToken;
        }
        return aWSCognitoAuthListWebAuthnCredentialsResult.copy(list, str);
    }

    public final List<AuthWebAuthnCredential> component1() {
        return this.credentials;
    }

    public final String component2() {
        return this.nextToken;
    }

    public final AWSCognitoAuthListWebAuthnCredentialsResult copy(List<? extends AuthWebAuthnCredential> list, String str) {
        sq8.m48649h(list, "credentials");
        return new AWSCognitoAuthListWebAuthnCredentialsResult(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthListWebAuthnCredentialsResult)) {
            return false;
        }
        AWSCognitoAuthListWebAuthnCredentialsResult aWSCognitoAuthListWebAuthnCredentialsResult = (AWSCognitoAuthListWebAuthnCredentialsResult) obj;
        return sq8.m48644c(this.credentials, aWSCognitoAuthListWebAuthnCredentialsResult.credentials) && sq8.m48644c(this.nextToken, aWSCognitoAuthListWebAuthnCredentialsResult.nextToken);
    }

    @Override // com.amplifyframework.auth.result.AuthListWebAuthnCredentialsResult
    public List<AuthWebAuthnCredential> getCredentials() {
        return this.credentials;
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int iHashCode = this.credentials.hashCode() * 31;
        String str = this.nextToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AWSCognitoAuthListWebAuthnCredentialsResult(credentials=" + this.credentials + ", nextToken=" + this.nextToken + ")";
    }
}
