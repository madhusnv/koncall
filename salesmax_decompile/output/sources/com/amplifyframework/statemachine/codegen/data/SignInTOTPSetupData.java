package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignInTOTPSetupData {
    private final String secretCode;
    private final String session;
    private final String username;

    public SignInTOTPSetupData(String str, String str2, String str3) {
        sq8.m48649h(str, "secretCode");
        sq8.m48649h(str3, "username");
        this.secretCode = str;
        this.session = str2;
        this.username = str3;
    }

    public static /* synthetic */ SignInTOTPSetupData copy$default(SignInTOTPSetupData signInTOTPSetupData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signInTOTPSetupData.secretCode;
        }
        if ((i & 2) != 0) {
            str2 = signInTOTPSetupData.session;
        }
        if ((i & 4) != 0) {
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

    public final SignInTOTPSetupData copy(String str, String str2, String str3) {
        sq8.m48649h(str, "secretCode");
        sq8.m48649h(str3, "username");
        return new SignInTOTPSetupData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTOTPSetupData)) {
            return false;
        }
        SignInTOTPSetupData signInTOTPSetupData = (SignInTOTPSetupData) obj;
        return sq8.m48644c(this.secretCode, signInTOTPSetupData.secretCode) && sq8.m48644c(this.session, signInTOTPSetupData.session) && sq8.m48644c(this.username, signInTOTPSetupData.username);
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
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.username.hashCode();
    }

    public String toString() {
        return "SignInTOTPSetupData(secretCode = " + MaskUtilKt.mask(this.secretCode) + ", session = " + MaskUtilKt.mask(this.session) + ", username = " + this.username + "})";
    }
}
