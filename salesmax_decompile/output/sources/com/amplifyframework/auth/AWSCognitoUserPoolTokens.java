package com.amplifyframework.auth;

import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoUserPoolTokens {
    private final String accessToken;
    private final String idToken;
    private final String refreshToken;

    public AWSCognitoUserPoolTokens(String str, String str2, String str3) {
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
    }

    public static /* synthetic */ AWSCognitoUserPoolTokens copy$default(AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCognitoUserPoolTokens.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = aWSCognitoUserPoolTokens.idToken;
        }
        if ((i & 4) != 0) {
            str3 = aWSCognitoUserPoolTokens.refreshToken;
        }
        return aWSCognitoUserPoolTokens.copy(str, str2, str3);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.idToken;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final AWSCognitoUserPoolTokens copy(String str, String str2, String str3) {
        return new AWSCognitoUserPoolTokens(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoUserPoolTokens)) {
            return false;
        }
        AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens = (AWSCognitoUserPoolTokens) obj;
        return sq8.m48644c(this.accessToken, aWSCognitoUserPoolTokens.accessToken) && sq8.m48644c(this.idToken, aWSCognitoUserPoolTokens.idToken) && sq8.m48644c(this.refreshToken, aWSCognitoUserPoolTokens.refreshToken);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AWSCognitoUserPoolTokens(accessToken=" + this.accessToken + ", idToken=" + this.idToken + ", refreshToken=" + this.refreshToken + ")";
    }
}
