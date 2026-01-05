package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.ChallengeParameter;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.cg2;
import p001o.gk8;
import p001o.id5;
import p001o.isa;
import p001o.jub;
import p001o.k16;
import p001o.m16;
import p001o.o16;
import p001o.q01;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignInChallengeHelper {
    public static final SignInChallengeHelper INSTANCE = new SignInChallengeHelper();

    private SignInChallengeHelper() {
    }

    private final Set<AuthFactorType> getAvailableFactors(List<String> list) throws UnknownException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list == null) {
            throw new UnknownException(null, new Exception("Tried to parse available factors but found none."), 1, null);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(AuthFactorType.valueOf((String) it.next()));
            } catch (IllegalArgumentException unused) {
                throw new UnknownException(null, new Exception("Tried to parse an unrecognized AuthFactorType"), 1, null);
            }
        }
        return linkedHashSet;
    }

    public final StateMachineEvent evaluateNextStep(String str, cg2 cg2Var, String str2, Map<String, String> map, List<String> list, q01 q01Var, WeakReference<Activity> weakReference, SignInMethod signInMethod) {
        SignInEvent signInEvent;
        String userSub;
        sq8.m48649h(str, "username");
        sq8.m48649h(weakReference, "callingActivity");
        sq8.m48649h(signInMethod, "signInMethod");
        if (q01Var != null) {
            String strM44573a = q01Var.m44573a();
            String str3 = (strM44573a == null || (userSub = SessionHelper.INSTANCE.getUserSub(strM44573a)) == null) ? "" : userSub;
            gk8 gk8VarM28963g = gk8.f25374b.m28963g();
            k16.C14700a c14700a = k16.f31358b;
            SignedInData signedInData = new SignedInData(str3, str, new Date(), signInMethod, new CognitoUserPoolTokens(q01Var.m44575c(), q01Var.m44573a(), q01Var.m44577e(), Long.valueOf(gk8VarM28963g.m28956m(m16.m38175s(q01Var.m44574b(), o16.SECONDS)).m28952e())));
            jub jubVarM44576d = q01Var.m44576d();
            if (jubVarM44576d == null) {
                return new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), null, 2, null);
            }
            String strM34519b = jubVarM44576d.m34519b();
            if (strM34519b == null) {
                strM34519b = "";
            }
            String strM34518a = jubVarM44576d.m34518a();
            return new SignInEvent(new SignInEvent.EventType.ConfirmDevice(new DeviceMetadata.Metadata(strM34519b, strM34518a != null ? strM34518a : "", (String) null, 4, (id5) null), signedInData), null, 2, null);
        }
        if ((cg2Var instanceof cg2.C12670o) || (cg2Var instanceof cg2.C12658c) || (cg2Var instanceof cg2.C12663h) || (cg2Var instanceof cg2.C12672q) || (cg2Var instanceof cg2.C12669n) || (cg2Var instanceof cg2.C12671p) || (cg2Var instanceof cg2.C12661f)) {
            return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(cg2Var.mo21138a(), str, str2, map, (List) null, 16, (id5) null), signInMethod), null, 2, null);
        }
        if (!(cg2Var instanceof cg2.C12662g)) {
            if (cg2Var instanceof cg2.C12660e) {
                return new SignInEvent(new SignInEvent.EventType.InitiateSignInWithDeviceSRP(str, isa.m32681h()), null, 2, null);
            }
            if (cg2Var instanceof cg2.C12668m) {
                return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(cg2.C12668m.f18075c.mo21138a(), str, str2, null, list), signInMethod), null, 2, null);
            }
            if (cg2Var instanceof cg2.C12673r) {
                return new SignInEvent(new SignInEvent.EventType.InitiateWebAuthnSignIn(new WebAuthnSignInContext(str, weakReference, str2, map != null ? map.get(ChallengeParameter.CredentialRequestOptions.getKey()) : null, null, 16, null)), null, 2, null);
            }
            return new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Response did not contain sign in info.")), null, 2, null);
        }
        Set<MFAType> allowedMFASetupTypesFromChallengeParameters = MFAHelperKt.getAllowedMFASetupTypesFromChallengeParameters(map);
        AuthChallenge authChallenge = new AuthChallenge(((cg2.C12662g) cg2Var).mo21138a(), str, str2, map, (List) null, 16, (id5) null);
        if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
            signInEvent = new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(authChallenge, signInMethod), null, 2, null);
        } else {
            if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.TOTP)) {
                return new SignInEvent(new SignInEvent.EventType.InitiateTOTPSetup(new SignInTOTPSetupData("", str2, str), authChallenge.getParameters(), signInMethod), null, 2, null);
            }
            signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Cannot initiate MFA setup from available Types: " + allowedMFASetupTypesFromChallengeParameters)), null, 2, null);
        }
        return signInEvent;
    }

    public final void getNextStep(AuthChallenge authChallenge, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, SignInTOTPSetupData signInTOTPSetupData, Set<? extends MFAType> set) {
        sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        Map<String, String> parameters = authChallenge.getParameters();
        if (parameters == null) {
            parameters = isa.m32681h();
        }
        Map<String, String> map = parameters;
        cg2 challengeNameType = AuthChallengeKt.getChallengeNameType(authChallenge);
        if (challengeNameType instanceof cg2.C12670o ? true : sq8.m48644c(challengeNameType, cg2.C12661f.f18062c) ? true : sq8.m48644c(challengeNameType, cg2.C12671p.f18081c)) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(sq8.m48644c(AuthChallengeKt.getChallengeNameType(authChallenge), cg2.C12670o.f18079c) ? AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE : AuthSignInStep.CONFIRM_SIGN_IN_WITH_OTP, isa.m32681h(), new AuthCodeDeliveryDetails((String) isa.m32682i(map, ChallengeParameter.CodeDeliveryDestination.getKey()), AuthCodeDeliveryDetails.DeliveryMedium.fromString((String) isa.m32682i(map, ChallengeParameter.CodeDeliveryMedium.getKey()))), null, null, null)));
        } else if (challengeNameType instanceof cg2.C12663h) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD, map, null, null, null, null)));
        } else if (challengeNameType instanceof cg2.C12658c) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE, map, null, null, null, null)));
        } else if (challengeNameType instanceof cg2.C12672q) {
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_TOTP_CODE, isa.m32681h(), null, null, null, null)));
        } else if (challengeNameType instanceof cg2.C12662g) {
            Set<MFAType> allowedMFASetupTypesFromChallengeParameters = MFAHelperKt.getAllowedMFASetupTypesFromChallengeParameters(map);
            MFAType mFAType = MFAType.TOTP;
            if (allowedMFASetupTypesFromChallengeParameters.contains(mFAType) && allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
                consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SETUP_SELECTION, isa.m32681h(), null, null, allowedMFASetupTypesFromChallengeParameters, null)));
            } else if (allowedMFASetupTypesFromChallengeParameters.contains(mFAType) && signInTOTPSetupData != null) {
                consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_TOTP_SETUP, map, null, new TOTPSetupDetails(signInTOTPSetupData.getSecretCode(), signInTOTPSetupData.getUsername()), set, null)));
            } else if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
                consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_EMAIL_MFA_SETUP, isa.m32681h(), null, null, set, null)));
            } else {
                consumer2.accept(new UnknownException(null, new Exception("Challenge type not supported."), 1, null));
            }
        } else {
            if (!(challengeNameType instanceof cg2.C12669n)) {
                if (challengeNameType instanceof cg2.C12668m) {
                    consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_FIRST_FACTOR_SELECTION, isa.m32681h(), null, null, null, getAvailableFactors(authChallenge.getAvailableChallenges()))));
                    return;
                } else {
                    consumer2.accept(new UnknownException(null, new Exception("Challenge type not supported."), 1, null));
                    return;
                }
            }
            consumer.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SELECTION, isa.m32681h(), null, null, MFAHelperKt.getAllowedMFATypesFromChallengeParameters(map), null)));
        }
    }
}
