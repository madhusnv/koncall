package com.amplifyframework.auth;

import a2.AbstractC0030c;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TOTPSetupDetails {
    private final String sharedSecret;
    private final String username;

    public TOTPSetupDetails(String sharedSecret, String username) {
        AbstractC4154l.m8923f(sharedSecret, "sharedSecret");
        AbstractC4154l.m8923f(username, "username");
        this.sharedSecret = sharedSecret;
        this.username = username;
    }

    public static /* synthetic */ TOTPSetupDetails copy$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tOTPSetupDetails.sharedSecret;
        }
        if ((i10 & 2) != 0) {
            str2 = tOTPSetupDetails.username;
        }
        return tOTPSetupDetails.copy(str, str2);
    }

    public static /* synthetic */ Uri getSetupURI$default(TOTPSetupDetails tOTPSetupDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
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

    public final TOTPSetupDetails copy(String sharedSecret, String username) {
        AbstractC4154l.m8923f(sharedSecret, "sharedSecret");
        AbstractC4154l.m8923f(username, "username");
        return new TOTPSetupDetails(sharedSecret, username);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOTPSetupDetails)) {
            return false;
        }
        TOTPSetupDetails tOTPSetupDetails = (TOTPSetupDetails) obj;
        return AbstractC4154l.m8918a(this.sharedSecret, tOTPSetupDetails.sharedSecret) && AbstractC4154l.m8918a(this.username, tOTPSetupDetails.username);
    }

    public final Uri getSetupURI(String appName) {
        AbstractC4154l.m8923f(appName, "appName");
        return getSetupURI$default(this, appName, null, 2, null);
    }

    public final String getSharedSecret() {
        return this.sharedSecret;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.username.hashCode() + (this.sharedSecret.hashCode() * 31);
    }

    public String toString() {
        return a1.m14333m("TOTPSetupDetails(sharedSecret=", this.sharedSecret, ", username=", this.username, ")");
    }

    public final Uri getSetupURI(String appName, String accountName) {
        AbstractC4154l.m8923f(appName, "appName");
        AbstractC4154l.m8923f(accountName, "accountName");
        String str = this.sharedSecret;
        StringBuilder sbM127r = AbstractC0030c.m127r("otpauth://totp/", appName, ":", accountName, "?secret=");
        sbM127r.append(str);
        sbM127r.append("&issuer=");
        sbM127r.append(appName);
        Uri uri = Uri.parse(sbM127r.toString());
        AbstractC4154l.m8922e(uri, "parse(...)");
        return uri;
    }
}
