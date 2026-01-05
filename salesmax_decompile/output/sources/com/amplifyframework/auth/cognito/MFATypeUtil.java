package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.MFAType;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public final class MFATypeUtil {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MFAType.values().length];
            try {
                iArr[MFAType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MFAType.TOTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MFAType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getChallengeResponse(MFAType mFAType) {
        sq8.m48649h(mFAType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[mFAType.ordinal()];
        if (i == 1) {
            return "SMS_MFA";
        }
        if (i == 2) {
            return "SOFTWARE_TOKEN_MFA";
        }
        if (i == 3) {
            return "EMAIL_OTP";
        }
        throw new szb();
    }
}
