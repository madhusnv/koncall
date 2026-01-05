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
import eb.C1992p;
import eb.C1994r;
import eb.C1996t;
import eb.C1997u;
import eb.C1998v;
import eb.C1999w;
import eb.b0;
import eb.c0;
import eb.d0;
import eb.e0;
import eb.f0;
import eb.g0;
import eb.h0;
import eb.m2;
import j$.time.format.DateTimeFormatter;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import rw.AbstractC6674x;
import rw.C6669s;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInChallengeHelper {
    public static final SignInChallengeHelper INSTANCE = new SignInChallengeHelper();

    private SignInChallengeHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StateMachineEvent evaluateNextStep$default(SignInChallengeHelper signInChallengeHelper, String str, h0 h0Var, String str2, Map map, List list, C1992p c1992p, WeakReference weakReference, SignInMethod signInMethod, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        if ((i10 & 64) != 0) {
            weakReference = new WeakReference(null);
        }
        return signInChallengeHelper.evaluateNextStep(str, h0Var, str2, map, list, c1992p, weakReference, signInMethod);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<AuthFactorType> getAvailableFactors(List<String> list) throws UnknownException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (list == null) {
            throw new UnknownException(objArr2 == true ? 1 : 0, new Exception("Tried to parse available factors but found none."), i10, objArr == true ? 1 : 0);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(AuthFactorType.valueOf((String) it.next()));
            } catch (IllegalArgumentException unused) {
                throw new UnknownException(str, new Exception("Tried to parse an unrecognized AuthFactorType"), i10, objArr3 == true ? 1 : 0);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNextStep$default(SignInChallengeHelper signInChallengeHelper, AuthChallenge authChallenge, Consumer consumer, Consumer consumer2, SignInTOTPSetupData signInTOTPSetupData, Set set, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            signInTOTPSetupData = null;
        }
        if ((i10 & 16) != 0) {
            set = null;
        }
        signInChallengeHelper.getNextStep(authChallenge, consumer, consumer2, signInTOTPSetupData, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StateMachineEvent evaluateNextStep(String username, h0 h0Var, String str, Map<String, String> map, List<String> list, C1992p c1992p, WeakReference<Activity> callingActivity, SignInMethod signInMethod) {
        String userSub;
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(signInMethod, "signInMethod");
        int i10 = 2;
        Date date = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        if (c1992p != null) {
            String str2 = c1992p.f9399a;
            String str3 = (str2 == null || (userSub = SessionHelper.INSTANCE.getUserSub(str2)) == null) ? "" : userSub;
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            C7126c c7126cM13407e = C7124a.m13407e();
            int i11 = C5770a.f28335d;
            SignedInData signedInData = new SignedInData(str3, username, new Date(), signInMethod, new CognitoUserPoolTokens(c1992p.f9401c, str2, c1992p.f9403e, Long.valueOf(c7126cM13407e.m13410c(bb.m10551g(c1992p.f9400b, EnumC5772c.SECONDS)).f34346a.getEpochSecond())));
            m2 m2Var = c1992p.f9402d;
            if (m2Var == null) {
                return new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), objArr18 == true ? 1 : 0, i10, objArr17 == true ? 1 : 0);
            }
            String str4 = m2Var.f9372b;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = m2Var.f9371a;
            return new SignInEvent(new SignInEvent.EventType.ConfirmDevice(new DeviceMetadata.Metadata(str4, str5 != null ? str5 : "", (String) null, 4, (AbstractC4148f) null), signedInData), date, i10, objArr19 == true ? 1 : 0);
        }
        if ((h0Var instanceof d0) || (h0Var instanceof C1994r) || (h0Var instanceof C1999w) || (h0Var instanceof f0) || (h0Var instanceof c0) || (h0Var instanceof e0) || (h0Var instanceof C1997u)) {
            return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(h0Var.mo5713a(), username, str, map, (List) null, 16, (AbstractC4148f) null), signInMethod), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        if (!(h0Var instanceof C1998v)) {
            if (h0Var instanceof C1996t) {
                return new SignInEvent(new SignInEvent.EventType.InitiateSignInWithDeviceSRP(username, C6669s.f31944a), objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0);
            }
            if (h0Var instanceof b0) {
                b0 b0Var = b0.f9274b;
                return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge("SELECT_CHALLENGE", username, str, null, list), signInMethod), objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0);
            }
            if (h0Var instanceof g0) {
                return new SignInEvent(new SignInEvent.EventType.InitiateWebAuthnSignIn(new WebAuthnSignInContext(username, callingActivity, str, map != null ? map.get(ChallengeParameter.CredentialRequestOptions.getKey()) : null, null, 16, null)), objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0);
            }
            return new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Response did not contain sign in info.")), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
        }
        Set<MFAType> allowedMFASetupTypesFromChallengeParameters = MFAHelperKt.getAllowedMFASetupTypesFromChallengeParameters(map);
        AuthChallenge authChallenge = new AuthChallenge("MFA_SETUP", username, str, map, (List) null, 16, (AbstractC4148f) null);
        if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
            return new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(authChallenge, signInMethod), objArr16 == true ? 1 : 0, i10, objArr15 == true ? 1 : 0);
        }
        if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.TOTP)) {
            return new SignInEvent(new SignInEvent.EventType.InitiateTOTPSetup(new SignInTOTPSetupData("", str, username), authChallenge.getParameters(), signInMethod), objArr14 == true ? 1 : 0, i10, objArr13 == true ? 1 : 0);
        }
        return new SignInEvent(new SignInEvent.EventType.ThrowError(new Exception("Cannot initiate MFA setup from available Types: " + allowedMFASetupTypesFromChallengeParameters)), objArr12 == true ? 1 : 0, i10, objArr11 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getNextStep(AuthChallenge challenge, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError, SignInTOTPSetupData signInTOTPSetupData, Set<? extends MFAType> set) {
        AbstractC4154l.m8923f(challenge, "challenge");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        Map<String, String> parameters = challenge.getParameters();
        C6669s c6669s = C6669s.f31944a;
        Map<String, String> map = parameters == null ? c6669s : parameters;
        h0 challengeNameType = AuthChallengeKt.getChallengeNameType(challenge);
        if ((challengeNameType instanceof d0) || AbstractC4154l.m8918a(challengeNameType, C1997u.f9478b) || AbstractC4154l.m8918a(challengeNameType, e0.f9299b)) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AbstractC4154l.m8918a(AuthChallengeKt.getChallengeNameType(challenge), d0.f9287b) ? AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE : AuthSignInStep.CONFIRM_SIGN_IN_WITH_OTP, c6669s, new AuthCodeDeliveryDetails((String) AbstractC6674x.m12774b(map, ChallengeParameter.CodeDeliveryDestination.getKey()), AuthCodeDeliveryDetails.DeliveryMedium.fromString((String) AbstractC6674x.m12774b(map, ChallengeParameter.CodeDeliveryMedium.getKey()))), null, null, null)));
            return;
        }
        if (challengeNameType instanceof C1999w) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD, map, null, null, null, null)));
            return;
        }
        if (challengeNameType instanceof C1994r) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE, map, null, null, null, null)));
            return;
        }
        if (challengeNameType instanceof f0) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONFIRM_SIGN_IN_WITH_TOTP_CODE, c6669s, null, null, null, null)));
            return;
        }
        int i10 = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!(challengeNameType instanceof C1998v)) {
            if (challengeNameType instanceof c0) {
                onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SELECTION, c6669s, null, null, MFAHelperKt.getAllowedMFATypesFromChallengeParameters(map), null)));
                return;
            } else if (challengeNameType instanceof b0) {
                onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_FIRST_FACTOR_SELECTION, c6669s, null, null, null, getAvailableFactors(challenge.getAvailableChallenges()))));
                return;
            } else {
                onError.accept(new UnknownException(objArr2 == true ? 1 : 0, new Exception("Challenge type not supported."), i10, objArr == true ? 1 : 0));
                return;
            }
        }
        Map<String, String> map2 = map;
        Set<MFAType> allowedMFASetupTypesFromChallengeParameters = MFAHelperKt.getAllowedMFASetupTypesFromChallengeParameters(map2);
        MFAType mFAType = MFAType.TOTP;
        if (allowedMFASetupTypesFromChallengeParameters.contains(mFAType) && allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SETUP_SELECTION, c6669s, null, null, allowedMFASetupTypesFromChallengeParameters, null)));
            return;
        }
        if (allowedMFASetupTypesFromChallengeParameters.contains(mFAType) && signInTOTPSetupData != null) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_TOTP_SETUP, map2, null, new TOTPSetupDetails(signInTOTPSetupData.getSecretCode(), signInTOTPSetupData.getUsername()), set, null)));
        } else if (allowedMFASetupTypesFromChallengeParameters.contains(MFAType.EMAIL)) {
            onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(AuthSignInStep.CONTINUE_SIGN_IN_WITH_EMAIL_MFA_SETUP, c6669s, null, null, set, null)));
        } else {
            onError.accept(new UnknownException(str, new Exception("Challenge type not supported."), i10, objArr3 == true ? 1 : 0));
        }
    }
}
