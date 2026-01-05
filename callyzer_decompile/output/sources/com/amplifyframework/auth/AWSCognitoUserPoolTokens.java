package com.amplifyframework.auth;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoUserPoolTokens {
    private final String accessToken;
    private final String idToken;
    private final String refreshToken;

    public AWSCognitoUserPoolTokens(String str, String str2, String str3) {
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
    }

    public static /* synthetic */ AWSCognitoUserPoolTokens copy$default(AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aWSCognitoUserPoolTokens.accessToken;
        }
        if ((i10 & 2) != 0) {
            str2 = aWSCognitoUserPoolTokens.idToken;
        }
        if ((i10 & 4) != 0) {
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
        return AbstractC4154l.m8918a(this.accessToken, aWSCognitoUserPoolTokens.accessToken) && AbstractC4154l.m8918a(this.idToken, aWSCognitoUserPoolTokens.idToken) && AbstractC4154l.m8918a(this.refreshToken, aWSCognitoUserPoolTokens.refreshToken);
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
        String str = this.accessToken;
        String str2 = this.idToken;
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("AWSCognitoUserPoolTokens(accessToken=", str, ", idToken=", str2, ", refreshToken="), this.refreshToken, ")");
    }
}
