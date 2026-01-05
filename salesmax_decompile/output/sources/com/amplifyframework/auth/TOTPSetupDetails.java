package com.amplifyframework.auth;

import android.net.Uri;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class TOTPSetupDetails {
    private final String sharedSecret;
    private final String username;

    public TOTPSetupDetails(String str, String str2) {
        sq8.m48649h(str, "sharedSecret");
        sq8.m48649h(str2, "username");
        this.sharedSecret = str;
        this.username = str2;
    }

    public static /* synthetic */ TOTPSetupDetails copy$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tOTPSetupDetails.sharedSecret;
        }
        if ((i & 2) != 0) {
            str2 = tOTPSetupDetails.username;
        }
        return tOTPSetupDetails.copy(str, str2);
    }

    public static /* synthetic */ Uri getSetupURI$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = tOTPSetupDetails.username;
        }
        return tOTPSetupDetails.getSetupURI(str, str2);
    }

    public final String component1() {
        return this.sharedSecret;
    }

    public final String component2() {
        return this.username;
    }

    public final TOTPSetupDetails copy(String str, String str2) {
        sq8.m48649h(str, "sharedSecret");
        sq8.m48649h(str2, "username");
        return new TOTPSetupDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOTPSetupDetails)) {
            return false;
        }
        TOTPSetupDetails tOTPSetupDetails = (TOTPSetupDetails) obj;
        return sq8.m48644c(this.sharedSecret, tOTPSetupDetails.sharedSecret) && sq8.m48644c(this.username, tOTPSetupDetails.username);
    }

    public final Uri getSetupURI(String str) {
        sq8.m48649h(str, "appName");
        return getSetupURI$default(this, str, null, 2, null);
    }

    public final String getSharedSecret() {
        return this.sharedSecret;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (this.sharedSecret.hashCode() * 31) + this.username.hashCode();
    }

    public String toString() {
        return "TOTPSetupDetails(sharedSecret=" + this.sharedSecret + ", username=" + this.username + ")";
    }

    public final Uri getSetupURI(String str, String str2) {
        sq8.m48649h(str, "appName");
        sq8.m48649h(str2, "accountName");
        Uri uri = Uri.parse("otpauth://totp/" + str + ":" + str2 + "?secret=" + this.sharedSecret + "&issuer=" + str);
        sq8.m48648g(uri, "parse(...)");
        return uri;
    }
}
