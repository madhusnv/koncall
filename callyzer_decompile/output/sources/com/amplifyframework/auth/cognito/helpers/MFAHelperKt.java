package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.ChallengeParameter;
import eb.C1998v;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.qe;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MFAHelperKt {

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

    public static final Set<MFAType> getAllowedMFASetupTypesFromChallengeParameters(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get(ChallengeParameter.MfasCanSetup.getKey())) == null) {
            return C6670t.f31945a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Pattern patternCompile = Pattern.compile("\\[|\\]|\"");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        for (String str2 : AbstractC5178p.m10112W(strReplaceAll, new String[]{","}, 6)) {
            if (AbstractC4154l.m8918a(str2, "SOFTWARE_TOKEN_MFA")) {
                linkedHashSet.add(MFAType.TOTP);
            } else if (AbstractC4154l.m8918a(str2, "EMAIL_OTP")) {
                linkedHashSet.add(MFAType.EMAIL);
            }
        }
        return linkedHashSet;
    }

    public static final Set<MFAType> getAllowedMFATypesFromChallengeParameters(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get(ChallengeParameter.MfasCanChoose.getKey())) == null) {
            return C6670t.f31945a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Pattern patternCompile = Pattern.compile("\\[|\\]|\"");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        for (String str2 : AbstractC5178p.m10112W(strReplaceAll, new String[]{","}, 6)) {
            int iHashCode = str2.hashCode();
            if (iHashCode == -1362602558) {
                if (!str2.equals("SMS_MFA")) {
                    throw new UnknownException(null, new Exception("MFA type not supported."), 1, null);
                }
                linkedHashSet.add(MFAType.SMS);
            } else if (iHashCode != 161754570) {
                if (iHashCode != 613324744 || !str2.equals("EMAIL_OTP")) {
                    throw new UnknownException(null, new Exception("MFA type not supported."), 1, null);
                }
                linkedHashSet.add(MFAType.EMAIL);
            } else {
                if (!str2.equals("SOFTWARE_TOKEN_MFA")) {
                    throw new UnknownException(null, new Exception("MFA type not supported."), 1, null);
                }
                linkedHashSet.add(MFAType.TOTP);
            }
        }
        return linkedHashSet;
    }

    public static final MFAType getMFASetupTypeOrNull(String value) {
        AbstractC4154l.m8923f(value, "value");
        if (value.equals("SOFTWARE_TOKEN_MFA")) {
            return MFAType.TOTP;
        }
        if (value.equals("EMAIL_OTP")) {
            return MFAType.EMAIL;
        }
        return null;
    }

    public static final MFAType getMFAType(String value) {
        AbstractC4154l.m8923f(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode != -1362602558) {
            if (iHashCode != 161754570) {
                if (iHashCode == 613324744 && value.equals("EMAIL_OTP")) {
                    return MFAType.EMAIL;
                }
            } else if (value.equals("SOFTWARE_TOKEN_MFA")) {
                return MFAType.TOTP;
            }
        } else if (value.equals("SMS_MFA")) {
            return MFAType.SMS;
        }
        throw new IllegalArgumentException("Unsupported MFA type");
    }

    public static final MFAType getMFATypeOrNull(String value) {
        AbstractC4154l.m8923f(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode == -1362602558) {
            if (value.equals("SMS_MFA")) {
                return MFAType.SMS;
            }
            return null;
        }
        if (iHashCode == 161754570) {
            if (value.equals("SOFTWARE_TOKEN_MFA")) {
                return MFAType.TOTP;
            }
            return null;
        }
        if (iHashCode == 613324744 && value.equals("EMAIL_OTP")) {
            return MFAType.EMAIL;
        }
        return null;
    }

    public static final String getValue(MFAType mFAType) {
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

    public static final boolean isEmailMfaSetupChallenge(AuthChallenge challenge) {
        AbstractC4154l.m8923f(challenge, "challenge");
        return AbstractC4154l.m8918a(AuthChallengeKt.getChallengeNameType(challenge), C1998v.f9480b) && AbstractC4154l.m8918a(getAllowedMFASetupTypesFromChallengeParameters(challenge.getParameters()), qe.m10862h(MFAType.EMAIL));
    }

    public static final boolean isMfaSetupSelectionChallenge(AuthChallenge challenge) {
        AbstractC4154l.m8923f(challenge, "challenge");
        return AbstractC4154l.m8918a(AuthChallengeKt.getChallengeNameType(challenge), C1998v.f9480b) && getAllowedMFASetupTypesFromChallengeParameters(challenge.getParameters()).size() > 1;
    }
}
