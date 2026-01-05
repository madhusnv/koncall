package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.MFAType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MFATypeUtil {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final /* synthetic */ class WhenMappings {
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
        AbstractC4154l.m8923f(mFAType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[mFAType.ordinal()];
        if (i10 == 1) {
            return "SMS_MFA";
        }
        if (i10 == 2) {
            return "SOFTWARE_TOKEN_MFA";
        }
        if (i10 == 3) {
            return "EMAIL_OTP";
        }
        throw new NoWhenBranchMatchedException();
    }
}
