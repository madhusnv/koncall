package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.ChallengeParameter;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p001o.cg2;
import p001o.f9g;
import p001o.mge;
import p001o.mif;
import p001o.nif;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public final class MFAHelperKt {

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

    public static final Set<MFAType> getAllowedMFASetupTypesFromChallengeParameters(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get(ChallengeParameter.MfasCanSetup.getKey())) == null) {
            return nif.m40664e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : f9g.D0(new mge("\\[|\\]|\"").m38996h(str, ""), new String[]{","}, false, 0, 6, null)) {
            if (sq8.m48644c(str2, "SOFTWARE_TOKEN_MFA")) {
                linkedHashSet.add(MFAType.TOTP);
            } else if (sq8.m48644c(str2, "EMAIL_OTP")) {
                linkedHashSet.add(MFAType.EMAIL);
            }
        }
        return linkedHashSet;
    }

    public static final Set<MFAType> getAllowedMFATypesFromChallengeParameters(Map<String, String> map) throws UnknownException {
        String str;
        if (map == null || (str = map.get(ChallengeParameter.MfasCanChoose.getKey())) == null) {
            return nif.m40664e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : f9g.D0(new mge("\\[|\\]|\"").m38996h(str, ""), new String[]{","}, false, 0, 6, null)) {
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

    public static final MFAType getMFASetupTypeOrNull(String str) {
        sq8.m48649h(str, "value");
        if (sq8.m48644c(str, "SOFTWARE_TOKEN_MFA")) {
            return MFAType.TOTP;
        }
        if (sq8.m48644c(str, "EMAIL_OTP")) {
            return MFAType.EMAIL;
        }
        return null;
    }

    public static final MFAType getMFAType(String str) {
        sq8.m48649h(str, "value");
        int iHashCode = str.hashCode();
        if (iHashCode != -1362602558) {
            if (iHashCode != 161754570) {
                if (iHashCode == 613324744 && str.equals("EMAIL_OTP")) {
                    return MFAType.EMAIL;
                }
            } else if (str.equals("SOFTWARE_TOKEN_MFA")) {
                return MFAType.TOTP;
            }
        } else if (str.equals("SMS_MFA")) {
            return MFAType.SMS;
        }
        throw new IllegalArgumentException("Unsupported MFA type");
    }

    public static final MFAType getMFATypeOrNull(String str) {
        sq8.m48649h(str, "value");
        int iHashCode = str.hashCode();
        if (iHashCode != -1362602558) {
            if (iHashCode != 161754570) {
                if (iHashCode == 613324744 && str.equals("EMAIL_OTP")) {
                    return MFAType.EMAIL;
                }
            } else if (str.equals("SOFTWARE_TOKEN_MFA")) {
                return MFAType.TOTP;
            }
        } else if (str.equals("SMS_MFA")) {
            return MFAType.SMS;
        }
        return null;
    }

    public static final String getValue(MFAType mFAType) {
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

    public static final boolean isEmailMfaSetupChallenge(AuthChallenge authChallenge) {
        sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
        return sq8.m48644c(AuthChallengeKt.getChallengeNameType(authChallenge), cg2.C12662g.f18064c) && sq8.m48644c(getAllowedMFASetupTypesFromChallengeParameters(authChallenge.getParameters()), mif.m39137d(MFAType.EMAIL));
    }

    public static final boolean isMfaSetupSelectionChallenge(AuthChallenge authChallenge) {
        sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
        return sq8.m48644c(AuthChallengeKt.getChallengeNameType(authChallenge), cg2.C12662g.f18064c) && getAllowedMFASetupTypesFromChallengeParameters(authChallenge.getParameters()).size() > 1;
    }
}
