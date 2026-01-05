package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.result.AuthListWebAuthnCredentialsResult;
import com.amplifyframework.auth.result.AuthWebAuthnCredential;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthListWebAuthnCredentialsResult implements AuthListWebAuthnCredentialsResult {
    private final List<AuthWebAuthnCredential> credentials;
    private final String nextToken;

    /* JADX WARN: Multi-variable type inference failed */
    public AWSCognitoAuthListWebAuthnCredentialsResult(List<? extends AuthWebAuthnCredential> credentials, String str) {
        AbstractC4154l.m8923f(credentials, "credentials");
        this.credentials = credentials;
        this.nextToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthListWebAuthnCredentialsResult copy$default(AWSCognitoAuthListWebAuthnCredentialsResult aWSCognitoAuthListWebAuthnCredentialsResult, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = aWSCognitoAuthListWebAuthnCredentialsResult.credentials;
        }
        if ((i10 & 2) != 0) {
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

    public final AWSCognitoAuthListWebAuthnCredentialsResult copy(List<? extends AuthWebAuthnCredential> credentials, String str) {
        AbstractC4154l.m8923f(credentials, "credentials");
        return new AWSCognitoAuthListWebAuthnCredentialsResult(credentials, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthListWebAuthnCredentialsResult)) {
            return false;
        }
        AWSCognitoAuthListWebAuthnCredentialsResult aWSCognitoAuthListWebAuthnCredentialsResult = (AWSCognitoAuthListWebAuthnCredentialsResult) obj;
        return AbstractC4154l.m8918a(this.credentials, aWSCognitoAuthListWebAuthnCredentialsResult.credentials) && AbstractC4154l.m8918a(this.nextToken, aWSCognitoAuthListWebAuthnCredentialsResult.nextToken);
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
