package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.amplifyframework.statemachine.util.MaskUtilKt;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInTOTPSetupData {
    private final String secretCode;
    private final String session;
    private final String username;

    public SignInTOTPSetupData(String secretCode, String str, String username) {
        AbstractC4154l.m8923f(secretCode, "secretCode");
        AbstractC4154l.m8923f(username, "username");
        this.secretCode = secretCode;
        this.session = str;
        this.username = username;
    }

    public static /* synthetic */ SignInTOTPSetupData copy$default(SignInTOTPSetupData signInTOTPSetupData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signInTOTPSetupData.secretCode;
        }
        if ((i10 & 2) != 0) {
            str2 = signInTOTPSetupData.session;
        }
        if ((i10 & 4) != 0) {
            str3 = signInTOTPSetupData.username;
        }
        return signInTOTPSetupData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.secretCode;
    }

    public final String component2() {
        return this.session;
    }

    public final String component3() {
        return this.username;
    }

    public final SignInTOTPSetupData copy(String secretCode, String str, String username) {
        AbstractC4154l.m8923f(secretCode, "secretCode");
        AbstractC4154l.m8923f(username, "username");
        return new SignInTOTPSetupData(secretCode, str, username);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTOTPSetupData)) {
            return false;
        }
        SignInTOTPSetupData signInTOTPSetupData = (SignInTOTPSetupData) obj;
        return AbstractC4154l.m8918a(this.secretCode, signInTOTPSetupData.secretCode) && AbstractC4154l.m8918a(this.session, signInTOTPSetupData.session) && AbstractC4154l.m8918a(this.username, signInTOTPSetupData.username);
    }

    public final String getSecretCode() {
        return this.secretCode;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.secretCode.hashCode() * 31;
        String str = this.session;
        return this.username.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String strMask = MaskUtilKt.mask(this.secretCode);
        String strMask2 = MaskUtilKt.mask(this.session);
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("SignInTOTPSetupData(secretCode = ", strMask, ", session = ", strMask2, ", username = "), this.username, "})");
    }
}
