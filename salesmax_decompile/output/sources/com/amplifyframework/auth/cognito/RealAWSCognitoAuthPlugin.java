package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSTemporaryCredentials;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import com.amplifyframework.auth.cognito.UserMFAPreference;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.invalidstate.SignedInException;
import com.amplifyframework.auth.cognito.exceptions.service.HostedUISignOutException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidAccountTypeException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.HostedUIHelper;
import com.amplifyframework.auth.cognito.helpers.MFAHelperKt;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendSignUpCodeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignOutOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.cognito.result.GlobalSignOutError;
import com.amplifyframework.auth.cognito.result.HostedUIError;
import com.amplifyframework.auth.cognito.result.RevokeTokenError;
import com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.errors.SessionError;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState;
import com.google.android.gms.cast.CastStatusCodes;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.a0f;
import p001o.as7;
import p001o.br0;
import p001o.bs7;
import p001o.cg2;
import p001o.ch3;
import p001o.cr0;
import p001o.e47;
import p001o.fti;
import p001o.gge;
import p001o.gne;
import p001o.gti;
import p001o.h84;
import p001o.hc0;
import p001o.hg2;
import p001o.hne;
import p001o.hti;
import p001o.hwc;
import p001o.id5;
import p001o.isa;
import p001o.jgg;
import p001o.kf9;
import p001o.kg3;
import p001o.kr3;
import p001o.kt7;
import p001o.l75;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.o64;
import p001o.rm1;
import p001o.sq8;
import p001o.szb;
import p001o.tq8;
import p001o.uk7;
import p001o.uq8;
import p001o.vre;
import p001o.vyh;
import p001o.wre;
import p001o.xk7;
import p001o.xl5;
import p001o.y3i;
import p001o.z37;
import p001o.ze3;

/* loaded from: classes5.dex */
public final class RealAWSCognitoAuthPlugin {
    private final AuthEnvironment authEnvironment;
    private final AuthStateMachine authStateMachine;
    private final AuthConfiguration configuration;
    private final AtomicReference<String> lastPublishedHubEventName;
    private final Logger logger;

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_autoSignIn$2 */
    public static final class C103902 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103902(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthException> consumer, Consumer<AuthSignInResult> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onError = consumer;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (authNState instanceof AuthenticationState.SigningIn) {
                SignInState signInState = ((AuthenticationState.SigningIn) authNState).getSignInState();
                if (signInState instanceof SignInState.Error) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState).getException(), "Sign in failed."));
                    return;
                }
                return;
            }
            if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onSuccess.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, isa.m32681h(), null, null, null, null)));
                RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_autoSignIn$3 */
    public static final class C103913 extends kf9 implements uk7 {
        final /* synthetic */ SignUpData $signUpData;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103913(SignUpData signUpData, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(0);
            this.$signUpData = signUpData;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68719invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68719invoke() {
            String username = this.$signUpData.getUsername();
            String session = this.$signUpData.getSession();
            Map<String, String> clientMetadata = this.$signUpData.getClientMetadata();
            if (clientMetadata == null) {
                clientMetadata = isa.m32681h();
            }
            this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(new SignInData.AutoSignInData(username, session, clientMetadata, this.$signUpData.getUserId())), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignIn$1 */
    public static final class C103921 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103921(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws UnknownException {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(AuthState authState) throws UnknownException {
            AuthSignInStep authSignInStep;
            AuthSignInStep authSignInStep2;
            Set<MFAType> allowedMFATypesFromChallengeParameters;
            AuthCodeDeliveryDetails authCodeDeliveryDetails;
            String str;
            String str2;
            Map<String, String> parameters;
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            AuthenticationState.SigningIn signingIn = authNState instanceof AuthenticationState.SigningIn ? (AuthenticationState.SigningIn) authNState : null;
            SignInState signInState = signingIn != null ? signingIn.getSignInState() : null;
            boolean z = signInState instanceof SignInState.ResolvingTOTPSetup;
            SignInState.ResolvingTOTPSetup resolvingTOTPSetup = z ? (SignInState.ResolvingTOTPSetup) signInState : null;
            SetupTOTPState setupTOTPState = resolvingTOTPSetup != null ? resolvingTOTPSetup.getSetupTOTPState() : null;
            if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onSuccess.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, isa.m32681h(), null, null, null, null)));
                RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                return;
            }
            if (signInState instanceof SignInState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState).getException(), "Confirm Sign in failed."));
                return;
            }
            boolean z2 = signInState instanceof SignInState.ResolvingChallenge;
            if (z2) {
                SignInState.ResolvingChallenge resolvingChallenge = (SignInState.ResolvingChallenge) signInState;
                if (resolvingChallenge.getChallengeState() instanceof SignInChallengeState.WaitingForAnswer) {
                    SignInChallengeState challengeState = resolvingChallenge.getChallengeState();
                    sq8.m48647f(challengeState, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer");
                    if (((SignInChallengeState.WaitingForAnswer) challengeState).getHasNewResponse()) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                        SignInChallengeState challengeState2 = resolvingChallenge.getChallengeState();
                        sq8.m48647f(challengeState2, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer");
                        SignInChallengeState.WaitingForAnswer waitingForAnswer = (SignInChallengeState.WaitingForAnswer) challengeState2;
                        if (!sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer.getChallenge()), cg2.C12662g.f18064c)) {
                            cg2 challengeNameType = AuthChallengeKt.getChallengeNameType(waitingForAnswer.getChallenge());
                            cg2.C12661f c12661f = cg2.C12661f.f18062c;
                            if (!sq8.m48644c(challengeNameType, c12661f)) {
                                cg2 challengeNameType2 = AuthChallengeKt.getChallengeNameType(waitingForAnswer.getChallenge());
                                cg2.C12671p c12671p = cg2.C12671p.f18081c;
                                if (!sq8.m48644c(challengeNameType2, c12671p)) {
                                    cg2 challengeNameType3 = AuthChallengeKt.getChallengeNameType(waitingForAnswer.getChallenge());
                                    if (sq8.m48644c(challengeNameType3, cg2.C12670o.f18079c)) {
                                        authSignInStep = AuthSignInStep.CONFIRM_SIGN_IN_WITH_SMS_MFA_CODE;
                                    } else if (sq8.m48644c(challengeNameType3, cg2.C12663h.f18066c)) {
                                        authSignInStep = AuthSignInStep.CONFIRM_SIGN_IN_WITH_NEW_PASSWORD;
                                    } else {
                                        if (!sq8.m48644c(challengeNameType3, cg2.C12672q.f18083c)) {
                                            if (sq8.m48644c(challengeNameType3, cg2.C12669n.f18077c)) {
                                                allowedMFATypesFromChallengeParameters = MFAHelperKt.getAllowedMFATypesFromChallengeParameters(waitingForAnswer.getChallenge().getParameters());
                                                authSignInStep2 = AuthSignInStep.CONTINUE_SIGN_IN_WITH_MFA_SELECTION;
                                                authCodeDeliveryDetails = null;
                                            } else {
                                                if (sq8.m48644c(challengeNameType3, c12661f) ? true : sq8.m48644c(challengeNameType3, c12671p)) {
                                                    Map<String, String> parameters2 = waitingForAnswer.getChallenge().getParameters();
                                                    AuthCodeDeliveryDetails authCodeDeliveryDetails2 = (parameters2 == null || (str = parameters2.get("CODE_DELIVERY_DELIVERY_MEDIUM")) == null || (str2 = waitingForAnswer.getChallenge().getParameters().get("CODE_DELIVERY_DESTINATION")) == null) ? null : new AuthCodeDeliveryDetails(str2, AuthCodeDeliveryDetails.DeliveryMedium.fromString(str));
                                                    authSignInStep2 = AuthSignInStep.CONFIRM_SIGN_IN_WITH_OTP;
                                                    allowedMFATypesFromChallengeParameters = null;
                                                    authCodeDeliveryDetails = authCodeDeliveryDetails2;
                                                } else {
                                                    authSignInStep = sq8.m48644c(challengeNameType3, cg2.C12664i.f18068c) ? true : sq8.m48644c(challengeNameType3, cg2.C12665j.f18070c) ? AuthSignInStep.CONFIRM_SIGN_IN_WITH_PASSWORD : AuthSignInStep.CONFIRM_SIGN_IN_WITH_CUSTOM_CHALLENGE;
                                                }
                                            }
                                            parameters = waitingForAnswer.getChallenge().getParameters();
                                            if (parameters == null) {
                                                parameters = isa.m32681h();
                                            }
                                            this.$onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(authSignInStep2, parameters, authCodeDeliveryDetails, null, allowedMFATypesFromChallengeParameters, null)));
                                            SignInChallengeState challengeState3 = resolvingChallenge.getChallengeState();
                                            sq8.m48647f(challengeState3, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer");
                                            ((SignInChallengeState.WaitingForAnswer) challengeState3).setHasNewResponse(false);
                                            return;
                                        }
                                        authSignInStep = AuthSignInStep.CONFIRM_SIGN_IN_WITH_TOTP_CODE;
                                    }
                                    authSignInStep2 = authSignInStep;
                                    authCodeDeliveryDetails = null;
                                    allowedMFATypesFromChallengeParameters = null;
                                    parameters = waitingForAnswer.getChallenge().getParameters();
                                    if (parameters == null) {
                                    }
                                    this.$onSuccess.accept(new AuthSignInResult(false, new AuthNextSignInStep(authSignInStep2, parameters, authCodeDeliveryDetails, null, allowedMFATypesFromChallengeParameters, null)));
                                    SignInChallengeState challengeState32 = resolvingChallenge.getChallengeState();
                                    sq8.m48647f(challengeState32, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer");
                                    ((SignInChallengeState.WaitingForAnswer) challengeState32).setHasNewResponse(false);
                                    return;
                                }
                            }
                        }
                        SignInChallengeHelper.INSTANCE.getNextStep(waitingForAnswer.getChallenge(), this.$onSuccess, this.$onError, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
                        SignInChallengeState challengeState4 = resolvingChallenge.getChallengeState();
                        sq8.m48647f(challengeState4, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.WaitingForAnswer");
                        ((SignInChallengeState.WaitingForAnswer) challengeState4).setHasNewResponse(false);
                        return;
                    }
                }
            }
            if (z && (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer)) {
                SetupTOTPState.WaitingForAnswer waitingForAnswer2 = (SetupTOTPState.WaitingForAnswer) setupTOTPState;
                if (waitingForAnswer2.getHasNewResponse()) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    SignInChallengeHelper.INSTANCE.getNextStep(new AuthChallenge(cg2.C12662g.f18064c.mo21138a(), (String) null, (String) null, waitingForAnswer2.getChallengeParams(), (List) null, 16, (id5) null), this.$onSuccess, this.$onError, (24 & 8) != 0 ? null : waitingForAnswer2.getSignInTOTPSetupData(), (24 & 16) != 0 ? null : null);
                    waitingForAnswer2.setHasNewResponse(false);
                    return;
                }
            }
            if (z && (setupTOTPState instanceof SetupTOTPState.Error)) {
                SetupTOTPState.Error error = (SetupTOTPState.Error) setupTOTPState;
                if (error.getHasNewResponse()) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(error.getException(), "Confirm Sign in failed."));
                    error.setHasNewResponse(false);
                    return;
                }
            }
            if (z2) {
                SignInState.ResolvingChallenge resolvingChallenge2 = (SignInState.ResolvingChallenge) signInState;
                if (resolvingChallenge2.getChallengeState() instanceof SignInChallengeState.Error) {
                    SignInChallengeState challengeState5 = resolvingChallenge2.getChallengeState();
                    sq8.m48647f(challengeState5, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Error");
                    if (((SignInChallengeState.Error) challengeState5).getHasNewResponse()) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                        Consumer<AuthException> consumer = this.$onError;
                        CognitoAuthExceptionConverter.Companion companion = CognitoAuthExceptionConverter.Companion;
                        SignInChallengeState challengeState6 = resolvingChallenge2.getChallengeState();
                        sq8.m48647f(challengeState6, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Error");
                        consumer.accept(companion.lookup(((SignInChallengeState.Error) challengeState6).getException(), "Confirm Sign in failed."));
                        SignInChallengeState challengeState7 = resolvingChallenge2.getChallengeState();
                        sq8.m48647f(challengeState7, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SignInChallengeState.Error");
                        ((SignInChallengeState.Error) challengeState7).setHasNewResponse(false);
                        return;
                    }
                }
            }
            if (signInState instanceof SignInState.SigningInWithWebAuthn) {
                SignInState.SigningInWithWebAuthn signingInWithWebAuthn = (SignInState.SigningInWithWebAuthn) signInState;
                if (signingInWithWebAuthn.getWebAuthnSignInState() instanceof WebAuthnSignInState.Error) {
                    WebAuthnSignInState webAuthnSignInState = signingInWithWebAuthn.getWebAuthnSignInState();
                    sq8.m48647f(webAuthnSignInState, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState.Error");
                    if (((WebAuthnSignInState.Error) webAuthnSignInState).getHasNewResponse()) {
                        WebAuthnSignInState webAuthnSignInState2 = signingInWithWebAuthn.getWebAuthnSignInState();
                        sq8.m48647f(webAuthnSignInState2, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState.Error");
                        WebAuthnSignInState.Error error2 = (WebAuthnSignInState.Error) webAuthnSignInState2;
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                        this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(error2.getException(), "Confirm Sign in failed."));
                        error2.setHasNewResponse(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignIn$2 */
    public static final class C103932 extends kf9 implements uk7 {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ AuthConfirmSignInOptions $options;
        final /* synthetic */ SignInState $signInState;
        final /* synthetic */ StateChangeListenerToken $token;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103932(AuthConfirmSignInOptions authConfirmSignInOptions, SignInState signInState, String str, Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken) {
            super(0);
            this.$options = authConfirmSignInOptions;
            this.$signInState = signInState;
            this.$challengeResponse = str;
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$token = stateChangeListenerToken;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68720invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68720invoke() {
            Map<String, String> mapM32681h;
            List<AuthUserAttribute> listM21246k;
            WeakReference<Activity> weakReference;
            AuthConfirmSignInOptions authConfirmSignInOptions = this.$options;
            AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = authConfirmSignInOptions instanceof AWSCognitoAuthConfirmSignInOptions ? (AWSCognitoAuthConfirmSignInOptions) authConfirmSignInOptions : null;
            if (aWSCognitoAuthConfirmSignInOptions == null || (mapM32681h = aWSCognitoAuthConfirmSignInOptions.getMetadata()) == null) {
                mapM32681h = isa.m32681h();
            }
            Map<String, String> map = mapM32681h;
            if (aWSCognitoAuthConfirmSignInOptions == null || (listM21246k = aWSCognitoAuthConfirmSignInOptions.getUserAttributes()) == null) {
                listM21246k = ch3.m21246k();
            }
            SignInState signInState = this.$signInState;
            if (!(signInState instanceof SignInState.ResolvingChallenge)) {
                if (!(signInState instanceof SignInState.ResolvingTOTPSetup)) {
                    if (!(signInState instanceof SignInState.SigningInWithWebAuthn)) {
                        this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                        this.this$0.authStateMachine.cancel(this.$token);
                        return;
                    } else if (!(signInState.getWebAuthnSignInState() instanceof WebAuthnSignInState.Error) || !sq8.m48644c(this.$challengeResponse, AuthFactorType.WEB_AUTHN.getChallengeResponse())) {
                        this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                        this.this$0.authStateMachine.cancel(this.$token);
                        return;
                    } else {
                        WebAuthnSignInState webAuthnSignInState = this.$signInState.getWebAuthnSignInState();
                        sq8.m48647f(webAuthnSignInState, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState.Error");
                        this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.InitiateWebAuthnSignIn(((WebAuthnSignInState.Error) webAuthnSignInState).getContext()), null, 2, null));
                        return;
                    }
                }
                SetupTOTPState setupTOTPState = signInState.getSetupTOTPState();
                if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) {
                    SetupTOTPState setupTOTPState2 = this.$signInState.getSetupTOTPState();
                    sq8.m48647f(setupTOTPState2, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SetupTOTPState.WaitingForAnswer");
                    SetupTOTPState.WaitingForAnswer waitingForAnswer = (SetupTOTPState.WaitingForAnswer) setupTOTPState2;
                    this.this$0.authStateMachine.send(new SetupTOTPEvent(new SetupTOTPEvent.EventType.VerifyChallengeAnswer(this.$challengeResponse, waitingForAnswer.getSignInTOTPSetupData().getUsername(), waitingForAnswer.getSignInTOTPSetupData().getSession(), aWSCognitoAuthConfirmSignInOptions != null ? aWSCognitoAuthConfirmSignInOptions.getFriendlyDeviceName() : null, waitingForAnswer.getSignInMethod()), null, 2, null));
                    return;
                }
                if (!(setupTOTPState instanceof SetupTOTPState.Error)) {
                    this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                    this.this$0.authStateMachine.cancel(this.$token);
                    return;
                }
                SetupTOTPState setupTOTPState3 = this.$signInState.getSetupTOTPState();
                sq8.m48647f(setupTOTPState3, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Error");
                String username = ((SetupTOTPState.Error) setupTOTPState3).getUsername();
                SetupTOTPState setupTOTPState4 = this.$signInState.getSetupTOTPState();
                sq8.m48647f(setupTOTPState4, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Error");
                String session = ((SetupTOTPState.Error) setupTOTPState4).getSession();
                SetupTOTPState setupTOTPState5 = this.$signInState.getSetupTOTPState();
                sq8.m48647f(setupTOTPState5, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Error");
                this.this$0.authStateMachine.send(new SetupTOTPEvent(new SetupTOTPEvent.EventType.VerifyChallengeAnswer(this.$challengeResponse, username, session, aWSCognitoAuthConfirmSignInOptions != null ? aWSCognitoAuthConfirmSignInOptions.getFriendlyDeviceName() : null, ((SetupTOTPState.Error) setupTOTPState5).getSignInMethod()), null, 2, null));
                return;
            }
            SignInChallengeState challengeState = signInState.getChallengeState();
            boolean z = challengeState instanceof SignInChallengeState.WaitingForAnswer;
            if (z && sq8.m48644c(AuthChallengeKt.getChallengeNameType(((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge()), cg2.C12669n.f18077c) && MFAHelperKt.getMFATypeOrNull(this.$challengeResponse) == null) {
                this.$onError.accept(new InvalidParameterException("Value for challengeResponse must be one of SMS_MFA, EMAIL_OTP or SOFTWARE_TOKEN_MFA", null, 2, null));
                this.this$0.authStateMachine.cancel(this.$token);
                return;
            }
            if (z && MFAHelperKt.isMfaSetupSelectionChallenge(((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge()) && MFAHelperKt.getMFASetupTypeOrNull(this.$challengeResponse) == null) {
                this.$onError.accept(new InvalidParameterException("Value for challengeResponse must be one of EMAIL_OTP or SOFTWARE_TOKEN_MFA", null, 2, null));
                this.this$0.authStateMachine.cancel(this.$token);
                return;
            }
            if (z) {
                SignInChallengeState.WaitingForAnswer waitingForAnswer2 = (SignInChallengeState.WaitingForAnswer) challengeState;
                if (sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer2.getChallenge()), cg2.C12668m.f18075c) && sq8.m48644c(this.$challengeResponse, AuthFactorType.WEB_AUTHN.getChallengeResponse())) {
                    String username2 = waitingForAnswer2.getChallenge().getUsername();
                    sq8.m48646e(username2);
                    String session2 = waitingForAnswer2.getChallenge().getSession();
                    if (aWSCognitoAuthConfirmSignInOptions == null || (weakReference = aWSCognitoAuthConfirmSignInOptions.getCallingActivity()) == null) {
                        weakReference = new WeakReference<>(null);
                    }
                    this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.InitiateWebAuthnSignIn(new WebAuthnSignInContext(username2, weakReference, session2, null, null, 24, null)), null, 2, null));
                    return;
                }
            }
            if (z) {
                SignInChallengeState.WaitingForAnswer waitingForAnswer3 = (SignInChallengeState.WaitingForAnswer) challengeState;
                if (sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer3.getChallenge()), cg2.C12668m.f18075c)) {
                    String str = this.$challengeResponse;
                    cg2.C12664i c12664i = cg2.C12664i.f18068c;
                    if (sq8.m48644c(str, c12664i.mo21138a())) {
                        this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(c12664i.mo21138a(), waitingForAnswer3.getChallenge().getUsername(), waitingForAnswer3.getChallenge().getSession(), waitingForAnswer3.getChallenge().getParameters(), (List) null, 16, (id5) null), waitingForAnswer3.getSignInMethod()), null, 2, null));
                        return;
                    }
                }
            }
            if (z) {
                SignInChallengeState.WaitingForAnswer waitingForAnswer4 = (SignInChallengeState.WaitingForAnswer) challengeState;
                if (sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer4.getChallenge()), cg2.C12668m.f18075c)) {
                    String str2 = this.$challengeResponse;
                    cg2.C12665j c12665j = cg2.C12665j.f18070c;
                    if (sq8.m48644c(str2, c12665j.mo21138a())) {
                        this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.ReceivedChallenge(new AuthChallenge(c12665j.mo21138a(), waitingForAnswer4.getChallenge().getUsername(), waitingForAnswer4.getChallenge().getSession(), waitingForAnswer4.getChallenge().getParameters(), (List) null, 16, (id5) null), waitingForAnswer4.getSignInMethod()), null, 2, null));
                        return;
                    }
                }
            }
            if (z) {
                SignInChallengeState.WaitingForAnswer waitingForAnswer5 = (SignInChallengeState.WaitingForAnswer) challengeState;
                if (sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer5.getChallenge()), cg2.C12664i.f18068c)) {
                    String username3 = waitingForAnswer5.getChallenge().getUsername();
                    sq8.m48646e(username3);
                    String str3 = this.$challengeResponse;
                    AuthFlowType authFlowType = AuthFlowType.USER_AUTH;
                    String strMo21138a = cg2.C12668m.f18075c.mo21138a();
                    String username4 = waitingForAnswer5.getChallenge().getUsername();
                    String session3 = waitingForAnswer5.getChallenge().getSession();
                    sq8.m48646e(session3);
                    this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(username3, str3, map, authFlowType, new AuthChallenge(strMo21138a, username4, session3, (Map) null, (List) null, 16, (id5) null)), null, 2, null));
                    return;
                }
            }
            if (z) {
                SignInChallengeState.WaitingForAnswer waitingForAnswer6 = (SignInChallengeState.WaitingForAnswer) challengeState;
                if (sq8.m48644c(AuthChallengeKt.getChallengeNameType(waitingForAnswer6.getChallenge()), cg2.C12665j.f18070c)) {
                    String username5 = waitingForAnswer6.getChallenge().getUsername();
                    sq8.m48646e(username5);
                    String str4 = this.$challengeResponse;
                    AuthFlowType authFlowType2 = AuthFlowType.USER_AUTH;
                    String strMo21138a2 = cg2.C12668m.f18075c.mo21138a();
                    String username6 = waitingForAnswer6.getChallenge().getUsername();
                    String session4 = waitingForAnswer6.getChallenge().getSession();
                    sq8.m48646e(session4);
                    this.this$0.authStateMachine.send(new SignInEvent(new SignInEvent.EventType.InitiateSignInWithSRP(username5, str4, map, authFlowType2, new AuthChallenge(strMo21138a2, username6, session4, (Map) null, (List) null, 16, (id5) null)), null, 2, null));
                    return;
                }
            }
            this.this$0.authStateMachine.send(new SignInChallengeEvent(new SignInChallengeEvent.EventType.VerifyChallengeAnswer(this.$challengeResponse, map, listM21246k), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignUp$2 */
    public static final class C103942 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103942(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthException> consumer, Consumer<AuthSignUpResult> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onError = consumer;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            SignUpState authSignUpState = authState.getAuthSignUpState();
            if (!(authSignUpState instanceof SignUpState.Error)) {
                if (authSignUpState instanceof SignUpState.SignedUp) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onSuccess.accept(((SignUpState.SignedUp) authSignUpState).getSignUpResult());
                    return;
                }
                return;
            }
            SignUpState.Error error = (SignUpState.Error) authSignUpState;
            if (error.getHasNewResponse()) {
                error.setHasNewResponse(false);
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(error.getException(), "Sign up failed."));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_confirmSignUp$3 */
    public static final class C103953 extends kf9 implements uk7 {
        final /* synthetic */ SignUpState $authSignUpState;
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ AuthConfirmSignUpOptions $options;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103953(SignUpState signUpState, String str, AuthConfirmSignUpOptions authConfirmSignUpOptions, String str2, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(0);
            this.$authSignUpState = signUpState;
            this.$username = str;
            this.$options = authConfirmSignUpOptions;
            this.$confirmationCode = str2;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68721invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68721invoke() {
            String session;
            String userId;
            SignUpState signUpState = this.$authSignUpState;
            if ((signUpState instanceof SignUpState.AwaitingUserConfirmation) && sq8.m48644c(((SignUpState.AwaitingUserConfirmation) signUpState).getSignUpData().getUsername(), this.$username)) {
                session = ((SignUpState.AwaitingUserConfirmation) this.$authSignUpState).getSignUpData().getSession();
                userId = ((SignUpState.AwaitingUserConfirmation) this.$authSignUpState).getSignUpResult().getUserId();
            } else {
                session = null;
                userId = null;
            }
            AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
            AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions = authConfirmSignUpOptions instanceof AWSCognitoAuthConfirmSignUpOptions ? (AWSCognitoAuthConfirmSignUpOptions) authConfirmSignUpOptions : null;
            this.this$0.authStateMachine.send(new SignUpEvent(new SignUpEvent.EventType.ConfirmSignUp(new SignUpData(this.$username, null, aWSCognitoAuthConfirmSignUpOptions != null ? aWSCognitoAuthConfirmSignUpOptions.getClientMetadata() : null, session, userId), this.$confirmationCode), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_deleteUser$1 */
    public static final class C103961 extends kf9 implements xk7 {
        final /* synthetic */ gge $deleteUserException;
        final /* synthetic */ StateChangeListenerToken $listenerToken;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103961(gge ggeVar, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Action action, Consumer<AuthException> consumer) {
            super(1);
            this.$deleteUserException = ggeVar;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$listenerToken = stateChangeListenerToken;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState instanceof AuthState.Configured) {
                AuthState.Configured configured = (AuthState.Configured) authState;
                AuthenticationState authenticationStateComponent1 = configured.component1();
                AuthorizationState authorizationStateComponent2 = configured.component2();
                Exception exc = (Exception) this.$deleteUserException.f25106a;
                if (authorizationStateComponent2 instanceof AuthorizationState.DeletingUser) {
                    AuthorizationState.DeletingUser deletingUser = (AuthorizationState.DeletingUser) authorizationStateComponent2;
                    if (deletingUser.getDeleteUserState() instanceof DeleteUserState.Error) {
                        this.$deleteUserException.f25106a = ((DeleteUserState.Error) deletingUser.getDeleteUserState()).getException();
                        return;
                    }
                }
                if ((authenticationStateComponent1 instanceof AuthenticationState.SignedOut) && (authorizationStateComponent2 instanceof AuthorizationState.Configured)) {
                    this.this$0.sendHubEvent(AuthChannelEventName.USER_DELETED.toString());
                    this.this$0.authStateMachine.cancel(this.$listenerToken);
                    this.$onSuccess.call();
                } else {
                    if (!(authorizationStateComponent2 instanceof AuthorizationState.SessionEstablished) || exc == null) {
                        return;
                    }
                    this.this$0.authStateMachine.cancel(this.$listenerToken);
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(exc, "Request to delete user may have failed. Please check exception stack"));
                }
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_deleteUser$2 */
    public static final class C103972 extends kf9 implements uk7 {
        final /* synthetic */ String $token;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103972(String str, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(0);
            this.$token = str;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68722invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68722invoke() {
            this.this$0.authStateMachine.send(new DeleteUserEvent(new DeleteUserEvent.EventType.DeleteUser(this.$token), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_federateToIdentityPool$1 */
    public static final class C103981 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<FederateToIdentityPoolResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103981(StateChangeListenerToken stateChangeListenerToken, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (!(authNState instanceof AuthenticationState.FederatedToIdentityPool) || !(authZState instanceof AuthorizationState.SessionEstablished)) {
                if ((authNState instanceof AuthenticationState.Error) && (authZState instanceof AuthorizationState.Error)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((AuthorizationState.Error) authZState).getException(), "Federation could not be completed."));
                    return;
                }
                return;
            }
            RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
            AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
            AmplifyCredential.IdentityPoolFederated identityPoolFederated = amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated ? (AmplifyCredential.IdentityPoolFederated) amplifyCredential : null;
            String identityId = identityPoolFederated != null ? identityPoolFederated.getIdentityId() : null;
            AWSCredentials credentials = identityPoolFederated != null ? identityPoolFederated.getCredentials() : null;
            com.amplifyframework.auth.AWSCredentials aWSCredentialsCreateAWSCredentials = com.amplifyframework.auth.AWSCredentials.Factory.createAWSCredentials(credentials != null ? credentials.getAccessKeyId() : null, credentials != null ? credentials.getSecretAccessKey() : null, credentials != null ? credentials.getSessionToken() : null, credentials != null ? credentials.getExpiration() : null);
            AWSTemporaryCredentials aWSTemporaryCredentials = aWSCredentialsCreateAWSCredentials instanceof AWSTemporaryCredentials ? (AWSTemporaryCredentials) aWSCredentialsCreateAWSCredentials : null;
            if (identityId == null || aWSTemporaryCredentials == null) {
                this.$onError.accept(new UnknownException("Unable to parse credentials to expected output.", null, 2, null));
            } else {
                this.$onSuccess.accept(new FederateToIdentityPoolResult(identityId, aWSTemporaryCredentials));
                RealAWSCognitoAuthPlugin.this.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATED_TO_IDENTITY_POOL.toString());
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_federateToIdentityPool$2 */
    public static final class C103992 extends kf9 implements uk7 {
        public static final C103992 INSTANCE = new C103992();

        public C103992() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68723invoke() {
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68723invoke();
            return y3i.f54824a;
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_fetchAuthSession$1 */
    public static final class C104001 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthSession> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104001(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthSession> consumer) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onSuccess = consumer;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthorizationState authZState = authState.getAuthZState();
            if (authZState instanceof AuthorizationState.SessionEstablished) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential(), null, 1, null));
                return;
            }
            if (authZState instanceof AuthorizationState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                Exception exception = ((AuthorizationState.Error) authZState).getException();
                if (!(exception instanceof SessionError)) {
                    if (exception instanceof ConfigurationException) {
                        this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new InvalidAccountTypeException(exception)));
                        return;
                    } else {
                        this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new UnknownException("Fetch auth session failed.", exception)));
                        return;
                    }
                }
                SessionError sessionError = (SessionError) exception;
                Exception exception2 = sessionError.getException();
                if (exception2 instanceof SignedOutException) {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                    return;
                }
                if (exception2 instanceof SessionExpiredException) {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SESSION_EXPIRED.toString());
                } else if (exception2 instanceof ServiceException) {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                } else if (exception2 instanceof NotAuthorizedException) {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                } else {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), new UnknownException("Fetch auth session failed.", exception2)));
                }
            }
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {478, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "_resendSignUpCode")
    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_resendSignUpCode$1 */
    public static final class C104011 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C104011(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealAWSCognitoAuthPlugin.this._resendSignUpCode(null, null, null, null, this);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signIn$1 */
    public static final class C104021 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104021(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthException> consumer, Consumer<AuthSignInResult> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onError = consumer;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (!(authNState instanceof AuthenticationState.SigningIn)) {
                if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onSuccess.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, isa.m32681h(), null, null, null, null)));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                    return;
                } else {
                    if (authNState instanceof AuthenticationState.Error) {
                        RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                        AuthenticationState.Error error = (AuthenticationState.Error) authNState;
                        this.$onError.accept(error.getException() instanceof AuthException ? (AuthException) error.getException() : new UnknownException(null, error.getException(), 1, null));
                        return;
                    }
                    return;
                }
            }
            SignInState signInState = ((AuthenticationState.SigningIn) authNState).getSignInState();
            SignInState.SigningInWithSRP signingInWithSRP = signInState instanceof SignInState.SigningInWithSRP ? (SignInState.SigningInWithSRP) signInState : null;
            SRPSignInState srpSignInState = signingInWithSRP != null ? signingInWithSRP.getSrpSignInState() : null;
            SignInState.ResolvingChallenge resolvingChallenge = signInState instanceof SignInState.ResolvingChallenge ? (SignInState.ResolvingChallenge) signInState : null;
            SignInChallengeState challengeState = resolvingChallenge != null ? resolvingChallenge.getChallengeState() : null;
            SignInState.ResolvingTOTPSetup resolvingTOTPSetup = signInState instanceof SignInState.ResolvingTOTPSetup ? (SignInState.ResolvingTOTPSetup) signInState : null;
            SetupTOTPState setupTOTPState = resolvingTOTPSetup != null ? resolvingTOTPSetup.getSetupTOTPState() : null;
            SignInState.SigningInWithWebAuthn signingInWithWebAuthn = signInState instanceof SignInState.SigningInWithWebAuthn ? (SignInState.SigningInWithWebAuthn) signInState : null;
            WebAuthnSignInState webAuthnSignInState = signingInWithWebAuthn != null ? signingInWithWebAuthn.getWebAuthnSignInState() : null;
            if (srpSignInState instanceof SRPSignInState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((SRPSignInState.Error) srpSignInState).getException(), "Sign in failed."));
                return;
            }
            if (signInState instanceof SignInState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState).getException(), "Sign in failed."));
                return;
            }
            if (challengeState instanceof SignInChallengeState.WaitingForAnswer) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                SignInChallengeHelper.INSTANCE.getNextStep(((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge(), this.$onSuccess, this.$onError, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
            } else if (webAuthnSignInState instanceof WebAuthnSignInState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((WebAuthnSignInState.Error) webAuthnSignInState).getException(), "Sign in failed"));
            } else if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                SetupTOTPState.WaitingForAnswer waitingForAnswer = (SetupTOTPState.WaitingForAnswer) setupTOTPState;
                SignInChallengeHelper.INSTANCE.getNextStep(new AuthChallenge(cg2.C12662g.f18064c.mo21138a(), (String) null, (String) null, waitingForAnswer.getChallengeParams(), (List) null, 16, (id5) null), this.$onSuccess, this.$onError, (24 & 8) != 0 ? null : waitingForAnswer.getSignInTOTPSetupData(), (24 & 16) != 0 ? null : null);
                waitingForAnswer.setHasNewResponse(false);
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signIn$2 */
    public static final class C104032 extends kf9 implements uk7 {
        final /* synthetic */ AWSCognitoAuthSignInOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signIn$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[AuthFactorType.values().length];
                try {
                    iArr[AuthFactorType.PASSWORD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AuthFactorType.PASSWORD_SRP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AuthFlowType.values().length];
                try {
                    iArr2[AuthFlowType.USER_SRP_AUTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[AuthFlowType.CUSTOM_AUTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[AuthFlowType.CUSTOM_AUTH_WITHOUT_SRP.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[AuthFlowType.CUSTOM_AUTH_WITH_SRP.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[AuthFlowType.USER_PASSWORD_AUTH.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[AuthFlowType.USER_AUTH.ordinal()] = 6;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104032(AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2) {
            super(0);
            this.$options = aWSCognitoAuthSignInOptions;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$username = str;
            this.$password = str2;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68724invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68724invoke() {
            SignInData sRPSignInData;
            AuthFlowType authFlowType = this.$options.getAuthFlowType();
            if (authFlowType == null) {
                authFlowType = this.this$0.getConfiguration().getAuthFlowType();
            }
            switch (WhenMappings.$EnumSwitchMapping$1[authFlowType.ordinal()]) {
                case 1:
                    String str = this.$username;
                    String str2 = this.$password;
                    Map<String, String> metadata = this.$options.getMetadata();
                    sq8.m48648g(metadata, "getMetadata(...)");
                    sRPSignInData = new SignInData.SRPSignInData(str, str2, metadata, AuthFlowType.USER_SRP_AUTH);
                    break;
                case 2:
                case 3:
                    String str3 = this.$username;
                    Map<String, String> metadata2 = this.$options.getMetadata();
                    sq8.m48648g(metadata2, "getMetadata(...)");
                    sRPSignInData = new SignInData.CustomAuthSignInData(str3, metadata2);
                    break;
                case 4:
                    String str4 = this.$username;
                    String str5 = this.$password;
                    Map<String, String> metadata3 = this.$options.getMetadata();
                    sq8.m48648g(metadata3, "getMetadata(...)");
                    sRPSignInData = new SignInData.CustomSRPAuthSignInData(str4, str5, metadata3);
                    break;
                case 5:
                    String str6 = this.$username;
                    String str7 = this.$password;
                    Map<String, String> metadata4 = this.$options.getMetadata();
                    sq8.m48648g(metadata4, "getMetadata(...)");
                    sRPSignInData = new SignInData.MigrationAuthSignInData(str6, str7, metadata4, AuthFlowType.USER_PASSWORD_AUTH);
                    break;
                case 6:
                    AuthFactorType preferredFirstFactor = this.$options.getPreferredFirstFactor();
                    int i = preferredFirstFactor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preferredFirstFactor.ordinal()];
                    if (i == 1) {
                        String str8 = this.$username;
                        String str9 = this.$password;
                        Map<String, String> metadata5 = this.$options.getMetadata();
                        sq8.m48648g(metadata5, "getMetadata(...)");
                        sRPSignInData = new SignInData.MigrationAuthSignInData(str8, str9, metadata5, AuthFlowType.USER_AUTH);
                        break;
                    } else if (i == 2) {
                        String str10 = this.$username;
                        String str11 = this.$password;
                        Map<String, String> metadata6 = this.$options.getMetadata();
                        sq8.m48648g(metadata6, "getMetadata(...)");
                        sRPSignInData = new SignInData.SRPSignInData(str10, str11, metadata6, AuthFlowType.USER_AUTH);
                        break;
                    } else {
                        String str12 = this.$username;
                        AuthFactorType preferredFirstFactor2 = this.$options.getPreferredFirstFactor();
                        WeakReference<Activity> callingActivity = this.$options.getCallingActivity();
                        sq8.m48648g(callingActivity, "getCallingActivity(...)");
                        Map<String, String> metadata7 = this.$options.getMetadata();
                        sq8.m48648g(metadata7, "getMetadata(...)");
                        sRPSignInData = new SignInData.UserAuthSignInData(str12, preferredFirstFactor2, callingActivity, metadata7);
                        break;
                    }
                default:
                    throw new szb();
            }
            this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(sRPSignInData), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signInWithHostedUI$1 */
    public static final class C104041 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104041(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthException> consumer, Consumer<AuthSignInResult> consumer2) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onError = consumer;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (!(authNState instanceof AuthenticationState.SigningIn)) {
                if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onSuccess.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, isa.m32681h(), null, null, null, null)));
                    RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
                    return;
                }
                return;
            }
            HostedUISignInState hostedUISignInState = ((AuthenticationState.SigningIn) authNState).getSignInState().getHostedUISignInState();
            if (hostedUISignInState instanceof HostedUISignInState.Error) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                Exception exception = ((HostedUISignInState.Error) hostedUISignInState).getException();
                this.$onError.accept(exception instanceof AuthException ? (AuthException) exception : new UnknownException("Sign in failed", exception));
                RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signInWithHostedUI$2 */
    public static final class C104052 extends kf9 implements uk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthWebUISignInOptions $options;
        final /* synthetic */ AuthProvider $provider;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104052(Activity activity, AuthProvider authProvider, AuthWebUISignInOptions authWebUISignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(0);
            this.$callingActivity = activity;
            this.$provider = authProvider;
            this.$options = authWebUISignInOptions;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68725invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68725invoke() {
            this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(new SignInData.HostedUISignInData(HostedUIHelper.INSTANCE.createHostedUIOptions(this.$callingActivity, this.$provider, this.$options))), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signOut$1 */
    public static final class C104061 extends kf9 implements xk7 {
        final /* synthetic */ gge $cancellationException;
        final /* synthetic */ Consumer<AuthSignOutResult> $onComplete;
        final /* synthetic */ boolean $sendHubEvent;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104061(StateChangeListenerToken stateChangeListenerToken, Consumer<AuthSignOutResult> consumer, boolean z, gge ggeVar) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$onComplete = consumer;
            this.$sendHubEvent = z;
            this.$cancellationException = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState instanceof AuthState.Configured) {
                AuthState.Configured configured = (AuthState.Configured) authState;
                AuthenticationState authenticationStateComponent1 = configured.component1();
                AuthorizationState authorizationStateComponent2 = configured.component2();
                if ((authenticationStateComponent1 instanceof AuthenticationState.SignedOut) && (authorizationStateComponent2 instanceof AuthorizationState.Configured)) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    AuthenticationState.SignedOut signedOut = (AuthenticationState.SignedOut) authenticationStateComponent1;
                    if (!signedOut.getSignedOutData().getHasError()) {
                        this.$onComplete.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
                        if (this.$sendHubEvent) {
                            RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                            return;
                        }
                        return;
                    }
                    SignedOutData signedOutData = signedOut.getSignedOutData();
                    Consumer<AuthSignOutResult> consumer = this.$onComplete;
                    HostedUIErrorData hostedUIErrorData = signedOutData.getHostedUIErrorData();
                    HostedUIError hostedUIError = hostedUIErrorData != null ? new HostedUIError(hostedUIErrorData) : null;
                    GlobalSignOutErrorData globalSignOutErrorData = signedOutData.getGlobalSignOutErrorData();
                    GlobalSignOutError globalSignOutError = globalSignOutErrorData != null ? new GlobalSignOutError(globalSignOutErrorData) : null;
                    RevokeTokenErrorData revokeTokenErrorData = signedOutData.getRevokeTokenErrorData();
                    consumer.accept(new AWSCognitoAuthSignOutResult.PartialSignOut(hostedUIError, globalSignOutError, revokeTokenErrorData != null ? new RevokeTokenError(revokeTokenErrorData) : null));
                    if (this.$sendHubEvent) {
                        RealAWSCognitoAuthPlugin.this.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                        return;
                    }
                    return;
                }
                if (authenticationStateComponent1 instanceof AuthenticationState.Error) {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                    this.$onComplete.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(CognitoAuthExceptionConverter.Companion.lookup(((AuthenticationState.Error) authenticationStateComponent1).getException(), "Sign out failed.")));
                    return;
                }
                if (authenticationStateComponent1 instanceof AuthenticationState.SigningOut) {
                    SignOutState signOutState = ((AuthenticationState.SigningOut) authenticationStateComponent1).getSignOutState();
                    if (signOutState instanceof SignOutState.Error) {
                        SignOutState.Error error = (SignOutState.Error) signOutState;
                        if (error.getException() instanceof UserCancelledException) {
                            this.$cancellationException.f25106a = error.getException();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(authenticationStateComponent1 instanceof AuthenticationState.SignedIn) || this.$cancellationException.f25106a == null) {
                    return;
                }
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                UserCancelledException userCancelledException = (UserCancelledException) this.$cancellationException.f25106a;
                if (userCancelledException != null) {
                    this.$onComplete.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(userCancelledException));
                }
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signOut$2 */
    public static final class C104072 extends kf9 implements uk7 {
        public static final C104072 INSTANCE = new C104072();

        public C104072() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68726invoke() {
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68726invoke();
            return y3i.f54824a;
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$2", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$2 */
    public static final class C104082 extends jgg implements nl7 {
        final /* synthetic */ AuthSignUpOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104082(AuthSignUpOptions authSignUpOptions, String str, String str2, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, n64 n64Var) {
            super(2, n64Var);
            this.$options = authSignUpOptions;
            this.$username = str;
            this.$password = str2;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C104082(this.$options, this.$username, this.$password, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            AuthSignUpOptions authSignUpOptions = this.$options;
            AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = authSignUpOptions instanceof AWSCognitoAuthSignUpOptions ? (AWSCognitoAuthSignUpOptions) authSignUpOptions : null;
            Map<String, String> validationData = aWSCognitoAuthSignUpOptions != null ? aWSCognitoAuthSignUpOptions.getValidationData() : null;
            AuthSignUpOptions authSignUpOptions2 = this.$options;
            AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions2 = authSignUpOptions2 instanceof AWSCognitoAuthSignUpOptions ? (AWSCognitoAuthSignUpOptions) authSignUpOptions2 : null;
            this.this$0.authStateMachine.send(new SignUpEvent(new SignUpEvent.EventType.InitiateSignUp(new SignUpData(this.$username, validationData, aWSCognitoAuthSignUpOptions2 != null ? aWSCognitoAuthSignUpOptions2.getClientMetadata() : null, (String) null, (String) null, 24, (id5) null), this.$password, this.$options.getUserAttributes()), null, 2, null));
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C104082) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_signUp$3 */
    public static final class C104093 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104093(Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
            super(1);
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.xk7
        public final Boolean invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            SignUpState authSignUpState = authState.getAuthSignUpState();
            boolean z = false;
            if (authSignUpState instanceof SignUpState.AwaitingUserConfirmation) {
                this.$onSuccess.accept(((SignUpState.AwaitingUserConfirmation) authSignUpState).getSignUpResult());
            } else if (authSignUpState instanceof SignUpState.SignedUp) {
                this.$onSuccess.accept(((SignUpState.SignedUp) authSignUpState).getSignUpResult());
            } else if (authSignUpState instanceof SignUpState.Error) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignUpState.Error) authSignUpState).getException(), "Sign up failed."));
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_updatePassword$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {1606, 1614}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_updatePassword$1 */
    public static final class C104101 extends jgg implements nl7 {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104101(Action action, Consumer<AuthException> consumer, String str, String str2, n64 n64Var) {
            super(2, n64Var);
            this.$onSuccess = action;
            this.$onError = consumer;
            this.$oldPassword = str;
            this.$newPassword = str2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return RealAWSCognitoAuthPlugin.this.new C104101(this.$onSuccess, this.$onError, this.$oldPassword, this.$newPassword, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
            } catch (Exception e) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, e.toString()));
            }
            if (i == 0) {
                wre.m54934b(obj);
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = RealAWSCognitoAuthPlugin.this;
                this.label = 1;
                obj = realAWSCognitoAuthPlugin.getSession(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    this.$onSuccess.call();
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            hg2 hg2VarM30414a = hg2.f26826d.m30414a(new C10411x37d79dc6(this.$oldPassword, this.$newPassword, ((AWSCognitoAuthSession) obj).getUserPoolTokensResult()));
            kg3 cognitoIdentityProviderClient = RealAWSCognitoAuthPlugin.this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient != null) {
                this.label = 2;
                obj = cognitoIdentityProviderClient.mo35647R(hg2VarM30414a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            }
            this.$onSuccess.call();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C104101) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$addAuthStateChangeListener$1 */
    public static final class C104121 extends kf9 implements xk7 {
        public C104121() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            RealAWSCognitoAuthPlugin.this.logger.verbose("Auth State Change: " + authState);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1 */
    public static final class C104131 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {353}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ AuthState $authState;
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AuthState authState, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.$authState = authState;
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$authState, this.this$0, this.$onSuccess, this.$onError, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    SignUpState authSignUpState = this.$authState.getAuthSignUpState();
                    if (authSignUpState instanceof SignUpState.SignedUp) {
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        SignUpData signUpData = ((SignUpState.SignedUp) authSignUpState).getSignUpData();
                        Consumer<AuthSignInResult> consumer = this.$onSuccess;
                        Consumer<AuthException> consumer2 = this.$onError;
                        this.label = 1;
                        if (realAWSCognitoAuthPlugin._autoSignIn(signUpData, consumer, consumer2, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends kf9 implements xk7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
            final /* synthetic */ StateChangeListenerToken $token;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$2$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {368}, m36650m = "invokeSuspend")
            /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends jgg implements nl7 {
                final /* synthetic */ Consumer<AuthException> $onError;
                final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
                final /* synthetic */ SignUpState $signUpState;
                int label;
                final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, SignUpState signUpState, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
                    super(2, n64Var);
                    this.this$0 = realAWSCognitoAuthPlugin;
                    this.$signUpState = signUpState;
                    this.$onSuccess = consumer;
                    this.$onError = consumer2;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new AnonymousClass1(this.this$0, this.$signUpState, this.$onSuccess, this.$onError, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    Object objM51918f = uq8.m51918f();
                    int i = this.label;
                    if (i == 0) {
                        wre.m54934b(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        SignUpData signUpData = ((SignUpState.SignedUp) this.$signUpState).getSignUpData();
                        Consumer<AuthSignInResult> consumer = this.$onSuccess;
                        Consumer<AuthException> consumer2 = this.$onError;
                        this.label = 1;
                        if (realAWSCognitoAuthPlugin._autoSignIn(signUpData, consumer, consumer2, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer<AuthException> consumer, Consumer<AuthSignInResult> consumer2) {
                super(1);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$token = stateChangeListenerToken;
                this.$onError = consumer;
                this.$onSuccess = consumer2;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AuthState) obj);
                return y3i.f54824a;
            }

            public final void invoke(AuthState authState) {
                sq8.m48649h(authState, "authState");
                if (authState.getAuthNState() instanceof AuthenticationState.SignedOut) {
                    this.this$0.authStateMachine.cancel(this.$token);
                    SignUpState authSignUpState = authState.getAuthSignUpState();
                    if (authSignUpState instanceof SignUpState.SignedUp) {
                        rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, authSignUpState, this.$onSuccess, this.$onError, null), 3, null);
                    } else {
                        this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                    }
                }
            }
        }

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$autoSignIn$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends kf9 implements uk7 {
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
                super(0);
                this.this$0 = realAWSCognitoAuthPlugin;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68727invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68727invoke() {
                this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104131(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthSignInResult> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
                return;
            }
            if (authNState instanceof AuthenticationState.SignedIn) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                return;
            }
            if (authNState instanceof AuthenticationState.SignedOut) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(authState, this.this$0, this.$onSuccess, this.$onError, null), 3, null);
            } else if (!(authNState instanceof AuthenticationState.SigningIn)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            } else {
                StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.this$0.authStateMachine.listen(stateChangeListenerToken, new AnonymousClass2(this.this$0, stateChangeListenerToken, this.$onError, this.$onSuccess), new AnonymousClass3(this.this$0));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$clearFederationToIdentityPool$1 */
    public static final class C104141 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104141(Action action, Consumer<AuthException> consumer) {
            super(1);
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if ((((com.amplifyframework.statemachine.codegen.errors.SessionError) r1.getException()).getAmplifyCredential() instanceof com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolFederated) != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (!(authState instanceof AuthState.Configured) || !(authNState instanceof AuthenticationState.FederatedToIdentityPool) || !(authZState instanceof AuthorizationState.SessionEstablished)) {
                if (authZState instanceof AuthorizationState.Error) {
                    AuthorizationState.Error error = (AuthorizationState.Error) authZState;
                    if (error.getException() instanceof SessionError) {
                    }
                }
                this.$onError.accept(new InvalidStateException("Clearing of federation failed.", null, null, 6, null));
                return;
            }
            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.ClearFederationToIdentityPool(null, 1, null), null, 2, null));
            RealAWSCognitoAuthPlugin.this._clearFederationToIdentityPool(this.$onSuccess, this.$onError);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$configureAuthStates$1 */
    public static final class C104151 extends kf9 implements xk7 {
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104151(StateChangeListenerToken stateChangeListenerToken) {
            super(1);
            this.$token = stateChangeListenerToken;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState instanceof AuthState.Configured) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$configureAuthStates$2 */
    public static final class C104162 extends kf9 implements uk7 {
        public C104162() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68728invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68728invoke() {
            RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthEvent(new AuthEvent.EventType.ConfigureAuth(RealAWSCognitoAuthPlugin.this.getConfiguration()), null, 2, null));
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1 */
    public static final class C104171 extends kf9 implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ AuthConfirmResetPasswordOptions $options;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {1540, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmResetPassword$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ String $confirmationCode;
            final /* synthetic */ String $newPassword;
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Action $onSuccess;
            final /* synthetic */ AuthConfirmResetPasswordOptions $options;
            final /* synthetic */ String $username;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, Consumer<AuthException> consumer, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$username = str;
                this.$onError = consumer;
                this.$confirmationCode = str2;
                this.$newPassword = str3;
                this.$options = authConfirmResetPasswordOptions;
                this.$onSuccess = action;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$username, this.$onError, this.$confirmationCode, this.$newPassword, this.$options, this.$onSuccess, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Map<String, String> mapM32681h;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                try {
                } catch (Exception e) {
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION));
                }
                if (i == 0) {
                    wre.m54934b(obj);
                    AuthEnvironment authEnvironment = this.this$0.authEnvironment;
                    String str = this.$username;
                    this.label = 1;
                    obj = authEnvironment.getUserContextData(str, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        this.$onSuccess.call();
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                }
                String str2 = (String) obj;
                String pinpointEndpointId = this.this$0.authEnvironment.getPinpointEndpointId();
                kg3 cognitoIdentityProviderClient = this.this$0.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                sq8.m48646e(cognitoIdentityProviderClient);
                String str3 = this.$username;
                String str4 = this.$confirmationCode;
                String str5 = this.$newPassword;
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions = this.$options;
                kr3.C14905a c14905a = new kr3.C14905a();
                c14905a.m36115p(str3);
                c14905a.m36112m(str4);
                c14905a.m36113n(str5);
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
                c14905a.m36114o(companion.getSecretHash(str3, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null));
                AWSCognitoAuthConfirmResetPasswordOptions aWSCognitoAuthConfirmResetPasswordOptions = authConfirmResetPasswordOptions instanceof AWSCognitoAuthConfirmResetPasswordOptions ? (AWSCognitoAuthConfirmResetPasswordOptions) authConfirmResetPasswordOptions : null;
                if (aWSCognitoAuthConfirmResetPasswordOptions == null || (mapM32681h = aWSCognitoAuthConfirmResetPasswordOptions.getMetadata()) == null) {
                    mapM32681h = isa.m32681h();
                }
                c14905a.m36111l(mapM32681h);
                UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
                c14905a.m36110k(userPool3 != null ? userPool3.getAppClient() : null);
                if (str2 != null) {
                    c14905a.m36116q(new RealAWSCognitoAuthPlugin$confirmResetPassword$1$1$1$1$1(str2));
                }
                if (pinpointEndpointId != null) {
                    c14905a.m36109j(hc0.f26603b.m30167a(new RealAWSCognitoAuthPlugin$confirmResetPassword$1$1$1$2$1(pinpointEndpointId)));
                }
                kr3 kr3VarM36100a = c14905a.m36100a();
                this.label = 2;
                obj = cognitoIdentityProviderClient.s1(kr3VarM36100a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                this.$onSuccess.call();
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104171(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$username = str;
            this.$confirmationCode = str2;
            this.$newPassword = str3;
            this.$options = authConfirmResetPasswordOptions;
            this.$onSuccess = action;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new ConfigurationException("Confirm Reset Password failed.", "Cognito User Pool not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            } else {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$username, this.$onError, this.$confirmationCode, this.$newPassword, this.$options, this.$onSuccess, null), 3, null);
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmSignIn$1 */
    public static final class C104181 extends kf9 implements xk7 {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthConfirmSignInOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104181(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
            super(1);
            this.$challengeResponse = str;
            this.$options = authConfirmSignInOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthenticationState.SigningIn signingIn = authNState instanceof AuthenticationState.SigningIn ? (AuthenticationState.SigningIn) authNState : null;
            SignInState signInState = signingIn != null ? signingIn.getSignInState() : null;
            if (signInState instanceof SignInState.ResolvingChallenge) {
                SignInChallengeState challengeState = ((SignInState.ResolvingChallenge) signInState).getChallengeState();
                if (challengeState instanceof SignInChallengeState.WaitingForAnswer ? true : challengeState instanceof SignInChallengeState.Error) {
                    RealAWSCognitoAuthPlugin.this._confirmSignIn(signInState, this.$challengeResponse, this.$options, this.$onSuccess, this.$onError);
                    return;
                } else {
                    this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                    return;
                }
            }
            if (signInState instanceof SignInState.ResolvingTOTPSetup) {
                SetupTOTPState setupTOTPState = ((SignInState.ResolvingTOTPSetup) signInState).getSetupTOTPState();
                if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer ? true : setupTOTPState instanceof SetupTOTPState.Error) {
                    RealAWSCognitoAuthPlugin.this._confirmSignIn(signInState, this.$challengeResponse, this.$options, this.$onSuccess, this.$onError);
                    return;
                } else {
                    this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                    return;
                }
            }
            if (!(signInState instanceof SignInState.SigningInWithWebAuthn)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            } else if (((SignInState.SigningInWithWebAuthn) signInState).getWebAuthnSignInState() instanceof WebAuthnSignInState.Error) {
                RealAWSCognitoAuthPlugin.this._confirmSignIn(signInState, this.$challengeResponse, this.$options, this.$onSuccess, this.$onError);
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmSignUp$1 */
    public static final class C104191 extends kf9 implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ AuthConfirmSignUpOptions $options;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmSignUp$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {288}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$confirmSignUp$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ AuthState $authState;
            final /* synthetic */ String $confirmationCode;
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
            final /* synthetic */ AuthConfirmSignUpOptions $options;
            final /* synthetic */ String $username;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthState authState, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$username = str;
                this.$confirmationCode = str2;
                this.$authState = authState;
                this.$options = authConfirmSignUpOptions;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$username, this.$confirmationCode, this.$authState, this.$options, this.$onSuccess, this.$onError, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    String str = this.$username;
                    String str2 = this.$confirmationCode;
                    SignUpState authSignUpState = this.$authState.getAuthSignUpState();
                    AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
                    Consumer<AuthSignUpResult> consumer = this.$onSuccess;
                    Consumer<AuthException> consumer2 = this.$onError;
                    this.label = 1;
                    if (realAWSCognitoAuthPlugin._confirmSignUp(str, str2, authSignUpState, authConfirmSignUpOptions, consumer, consumer2, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104191(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$username = str;
            this.$confirmationCode = str2;
            this.$options = authConfirmSignUpOptions;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
            } else {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$username, this.$confirmationCode, authState, this.$options, this.$onSuccess, this.$onError, null), 3, null);
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$deleteUser$1 */
    public static final class C104201 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$deleteUser$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {1738}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$deleteUser$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Action $onSuccess;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Action action, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$onError = consumer;
                this.$onSuccess = action;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                try {
                    if (i == 0) {
                        wre.m54934b(obj);
                        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                        this.label = 1;
                        obj = realAWSCognitoAuthPlugin.getSession(this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                    y3i y3iVar = null;
                    String accessToken = value != null ? value.getAccessToken() : null;
                    if (accessToken != null) {
                        this.this$0._deleteUser(accessToken, this.$onSuccess, this.$onError);
                        y3iVar = y3i.f54824a;
                    }
                    if (y3iVar == null) {
                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                    }
                } catch (Exception unused) {
                    this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104201(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Action action) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onSuccess = action;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.SignedIn) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, null), 3, null);
            } else if (authNState instanceof AuthenticationState.SignedOut) {
                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$federateToIdentityPool$1 */
    public static final class C104211 extends kf9 implements xk7 {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<FederateToIdentityPoolResult> $onSuccess;
        final /* synthetic */ FederateToIdentityPoolOptions $options;
        final /* synthetic */ String $providerToken;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104211(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer<FederateToIdentityPoolResult> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$providerToken = str;
            this.$authProvider = authProvider;
            this.$options = federateToIdentityPoolOptions;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(AuthState authState) {
            AmplifyCredential amplifyCredential;
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            AuthorizationState authZState = authState.getAuthZState();
            if (!(authState instanceof AuthState.Configured)) {
                this.$onError.accept(new InvalidStateException("Federation could not be completed.", null, null, 6, null));
                return;
            }
            if ((!(authNState instanceof AuthenticationState.SignedOut) && !(authNState instanceof AuthenticationState.Error) && !(authNState instanceof AuthenticationState.NotConfigured) && !(authNState instanceof AuthenticationState.FederatedToIdentityPool)) || (!(authZState instanceof AuthorizationState.Configured) && !(authZState instanceof AuthorizationState.SessionEstablished) && !(authZState instanceof AuthorizationState.Error))) {
                this.$onError.accept(new InvalidStateException("Federation could not be completed.", null, null, 6, null));
                return;
            }
            if (authZState instanceof AuthorizationState.SessionEstablished) {
                amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
            } else if (authZState instanceof AuthorizationState.Error) {
                Exception exception = ((AuthorizationState.Error) authZState).getException();
                SessionError sessionError = exception instanceof SessionError ? (SessionError) exception : null;
                amplifyCredential = sessionError != null ? sessionError.getAmplifyCredential() : null;
            }
            AuthStateMachine authStateMachine = this.this$0.authStateMachine;
            FederatedToken federatedToken = new FederatedToken(this.$providerToken, CodegenExtensionsKt.getIdentityProviderName(this.$authProvider));
            FederateToIdentityPoolOptions federateToIdentityPoolOptions = this.$options;
            authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(federatedToken, federateToIdentityPoolOptions != null ? federateToIdentityPoolOptions.getDeveloperProvidedIdentityId() : null, amplifyCredential), null, 2, null));
            this.this$0._federateToIdentityPool(this.$onSuccess, this.$onError);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchAuthSession$1 */
    public static final class C104221 extends kf9 implements xk7 {
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSession> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104221(Consumer<AuthSession> consumer, boolean z, Consumer<AuthException> consumer2) {
            super(1);
            this.$onSuccess = consumer;
            this.$forceRefresh = z;
            this.$onError = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthorizationState authZState = authState.getAuthZState();
            if (authZState instanceof AuthorizationState.Configured) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(AuthorizationEvent.EventType.FetchUnAuthSession.INSTANCE, null, 2, null));
                RealAWSCognitoAuthPlugin.this._fetchAuthSession(this.$onSuccess);
                return;
            }
            if (authZState instanceof AuthorizationState.SessionEstablished) {
                AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
                if (AWSCognitoAuthSessionKt.isValid(amplifyCredential) && !this.$forceRefresh) {
                    this.$onSuccess.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(amplifyCredential, null, 1, null));
                    return;
                }
                if (amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated) {
                    AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
                    RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated.getFederatedToken(), identityPoolFederated.getIdentityId(), amplifyCredential), null, 2, null));
                } else {
                    RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential), null, 2, null));
                }
                RealAWSCognitoAuthPlugin.this._fetchAuthSession(this.$onSuccess);
                return;
            }
            if (!(authZState instanceof AuthorizationState.Error)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                return;
            }
            Exception exception = ((AuthorizationState.Error) authZState).getException();
            if (!(exception instanceof SessionError)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
                return;
            }
            AmplifyCredential amplifyCredential2 = ((SessionError) exception).getAmplifyCredential();
            if (amplifyCredential2 instanceof AmplifyCredential.IdentityPoolFederated) {
                AmplifyCredential.IdentityPoolFederated identityPoolFederated2 = (AmplifyCredential.IdentityPoolFederated) amplifyCredential2;
                RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated2.getFederatedToken(), identityPoolFederated2.getIdentityId(), amplifyCredential2), null, 2, null));
            } else {
                RealAWSCognitoAuthPlugin.this.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential2), null, 2, null));
            }
            RealAWSCognitoAuthPlugin.this._fetchAuthSession(this.$onSuccess);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchMFAPreference$1 */
    public static final class C104231 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<UserMFAPreference> $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchMFAPreference$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$fetchMFAPreference$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<UserMFAPreference> $onSuccess;
            Object L$0;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Consumer<UserMFAPreference> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$onError = consumer;
                this.$onSuccess = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, n64Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0013, B:30:0x0074, B:32:0x0078, B:34:0x007e, B:39:0x0088, B:41:0x0093, B:42:0x0097, B:44:0x009d, B:46:0x00ac, B:48:0x00b2, B:49:0x00b6, B:51:0x00c1, B:11:0x001f, B:19:0x0034, B:21:0x0042, B:24:0x004a, B:26:0x005c, B:16:0x0029), top: B:56:0x0009 }] */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Consumer<UserMFAPreference> consumer;
                bs7 bs7Var;
                LinkedHashSet linkedHashSet;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                boolean z = true;
                try {
                } catch (Exception e) {
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Cannot update the MFA preferences"));
                }
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    this.label = 1;
                    obj = realAWSCognitoAuthPlugin.getSession(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        consumer = (Consumer) this.L$0;
                        wre.m54934b(obj);
                        bs7Var = (bs7) obj;
                        if (bs7Var != 0) {
                            List listM19681c = bs7Var.m19681c();
                            if (listM19681c != null && !listM19681c.isEmpty()) {
                                z = false;
                            }
                            if (z) {
                                linkedHashSet = null;
                            } else {
                                linkedHashSet = new LinkedHashSet();
                                List listM19681c2 = bs7Var.m19681c();
                                if (listM19681c2 != null) {
                                    Iterator it = listM19681c2.iterator();
                                    while (it.hasNext()) {
                                        linkedHashSet.add(MFAHelperKt.getMFAType((String) it.next()));
                                    }
                                }
                            }
                            String strM19679a = bs7Var.m19679a();
                            consumer.accept(new UserMFAPreference(linkedHashSet, strM19679a != null ? MFAHelperKt.getMFAType(strM19679a) : null));
                            mFAType = bs7Var;
                        }
                        if (mFAType == null) {
                            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            y3i y3iVar = y3i.f54824a;
                        }
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                }
                AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                String accessToken = value != null ? value.getAccessToken() : null;
                if (accessToken != null) {
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                    Consumer<UserMFAPreference> consumer2 = this.$onSuccess;
                    kg3 cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        as7.C12243a c12243a = new as7.C12243a();
                        c12243a.m17763c(accessToken);
                        as7 as7VarM17761a = c12243a.m17761a();
                        this.L$0 = consumer2;
                        this.label = 2;
                        obj = cognitoIdentityProviderClient.U1(as7VarM17761a, this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        consumer = consumer2;
                        bs7Var = (bs7) obj;
                        if (bs7Var != 0) {
                        }
                    }
                    if (mFAType == null) {
                    }
                    return y3i.f54824a;
                }
                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                y3i y3iVar2 = y3i.f54824a;
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104231(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<UserMFAPreference> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, null), 3, null);
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$handleWebUISignInResponse$1 */
    public static final class C104241 extends kf9 implements xk7 {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104241(Intent intent, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(1);
            this.$intent = intent;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            HostedUIErrorData hostedUIErrorData;
            Uri uriCreateSignOutUri$aws_auth_cognito_release;
            sq8.m48649h(authState, "it");
            Intent intent = this.$intent;
            Uri data = intent != null ? intent.getData() : null;
            AuthenticationState authNState = authState.getAuthNState();
            if (!(authNState instanceof AuthenticationState.SigningOut)) {
                if (!(authNState instanceof AuthenticationState.SigningIn)) {
                    this.this$0.logger.warn("Received handleWebUIResponse but ignoring because the user is not currently signing in or signing out");
                    return;
                } else if (data == null) {
                    this.this$0.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(new UserCancelledException("The user cancelled the sign-in attempt, so it did not complete.", "To recover: catch this error, and show the sign-in screen again.", null, 4, null)), null, 2, null));
                    return;
                } else {
                    this.this$0.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.FetchToken(data), null, 2, null));
                    return;
                }
            }
            SignOutState signOutState = ((AuthenticationState.SigningOut) authNState).getSignOutState();
            SignOutState.SigningOutHostedUI signingOutHostedUI = signOutState instanceof SignOutState.SigningOutHostedUI ? (SignOutState.SigningOutHostedUI) signOutState : null;
            if (signingOutHostedUI != null) {
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                if (data == null && !signingOutHostedUI.getBypassCancel() && !sq8.m48644c(signingOutHostedUI.getSignedInData().getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN))) {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.UserCancelled(signingOutHostedUI.getSignedInData()), null, 2, null));
                    return;
                }
                if (data == null) {
                    HostedUIClient hostedUIClient = realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient();
                    hostedUIErrorData = new HostedUIErrorData((hostedUIClient == null || (uriCreateSignOutUri$aws_auth_cognito_release = hostedUIClient.createSignOutUri$aws_auth_cognito_release()) == null) ? null : uriCreateSignOutUri$aws_auth_cognito_release.toString(), new HostedUISignOutException(realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient() != null));
                } else {
                    hostedUIErrorData = null;
                }
                if (signingOutHostedUI.getGlobalSignOut()) {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(signingOutHostedUI.getSignedInData(), hostedUIErrorData), null, 2, null));
                } else {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signingOutHostedUI.getSignedInData(), hostedUIErrorData, null, 4, null), null, 2, null));
                }
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$initialize$1 */
    public static final class C104251 extends kf9 implements xk7 {
        final /* synthetic */ CountDownLatch $latch;
        final /* synthetic */ StateChangeListenerToken $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104251(StateChangeListenerToken stateChangeListenerToken, CountDownLatch countDownLatch) {
            super(1);
            this.$token = stateChangeListenerToken;
            this.$latch = countDownLatch;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState instanceof AuthState.Configured) {
                RealAWSCognitoAuthPlugin.this.authStateMachine.cancel(this.$token);
                this.$latch.countDown();
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$initialize$2 */
    public static final class C104262 extends kf9 implements uk7 {
        public static final C104262 INSTANCE = new C104262();

        public C104262() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68729invoke() {
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68729invoke();
            return y3i.f54824a;
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendSignUpCode$1 */
    public static final class C104271 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
        final /* synthetic */ AuthResendSignUpCodeOptions $options;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendSignUpCode$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {462}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resendSignUpCode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthCodeDeliveryDetails> $onSuccess;
            final /* synthetic */ AuthResendSignUpCodeOptions $options;
            final /* synthetic */ String $username;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$username = str;
                this.$options = authResendSignUpCodeOptions;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$username, this.$options, this.$onSuccess, this.$onError, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    String str = this.$username;
                    AuthResendSignUpCodeOptions authResendSignUpCodeOptions = this.$options;
                    Consumer<AuthCodeDeliveryDetails> consumer = this.$onSuccess;
                    Consumer<AuthException> consumer2 = this.$onError;
                    this.label = 1;
                    if (realAWSCognitoAuthPlugin._resendSignUpCode(str, authResendSignUpCodeOptions, consumer, consumer2, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104271(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$username = str;
            this.$options = authResendSignUpCodeOptions;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
                return;
            }
            if (authNState instanceof AuthenticationState.SignedIn ? true : authNState instanceof AuthenticationState.SignedOut) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$username, this.$options, this.$onSuccess, this.$onError, null), 3, null);
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resetPassword$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {1490, 1497}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$resetPassword$1 */
    public static final class C104281 extends jgg implements nl7 {
        final /* synthetic */ String $appClient;
        final /* synthetic */ kg3 $cognitoIdentityProviderClient;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ AuthResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104281(String str, kg3 kg3Var, String str2, AuthResetPasswordOptions authResetPasswordOptions, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
            super(2, n64Var);
            this.$username = str;
            this.$cognitoIdentityProviderClient = kg3Var;
            this.$appClient = str2;
            this.$options = authResetPasswordOptions;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return RealAWSCognitoAuthPlugin.this.new C104281(this.$username, this.$cognitoIdentityProviderClient, this.$appClient, this.$options, this.$onSuccess, this.$onError, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AuthEnvironment authEnvironment = RealAWSCognitoAuthPlugin.this.authEnvironment;
                String str = this.$username;
                this.label = 1;
                obj = authEnvironment.getUserContextData(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            String str2 = (String) obj;
            String pinpointEndpointId = RealAWSCognitoAuthPlugin.this.authEnvironment.getPinpointEndpointId();
            kg3 kg3Var = this.$cognitoIdentityProviderClient;
            String str3 = this.$appClient;
            UserPoolConfiguration userPool = RealAWSCognitoAuthPlugin.this.getConfiguration().getUserPool();
            ResetPasswordUseCase resetPasswordUseCase = new ResetPasswordUseCase(kg3Var, str3, userPool != null ? userPool.getAppClientSecret() : null);
            String str4 = this.$username;
            AuthResetPasswordOptions authResetPasswordOptions = this.$options;
            Consumer<AuthResetPasswordResult> consumer = this.$onSuccess;
            Consumer<AuthException> consumer2 = this.$onError;
            this.label = 2;
            if (resetPasswordUseCase.execute(str4, authResetPasswordOptions, str2, pinpointEndpointId, consumer, consumer2, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C104281) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$setUpTOTP$1 */
    public static final class C104291 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<TOTPSetupDetails> $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$setUpTOTP$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {1957, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$setUpTOTP$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<TOTPSetupDetails> $onSuccess;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, Consumer<TOTPSetupDetails> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$onError = consumer;
                this.$onSuccess = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, n64Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x0017, B:32:0x0083, B:34:0x0087, B:36:0x008d, B:39:0x0098, B:11:0x0023, B:19:0x0038, B:21:0x0046, B:24:0x004e, B:26:0x005a, B:28:0x0068, B:16:0x002d), top: B:44:0x0009 }] */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                kg3 cognitoIdentityProviderClient;
                Consumer<TOTPSetupDetails> consumer;
                String str;
                cr0 cr0Var;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                cr0 cr0Var2 = null;
                try {
                } catch (Exception e) {
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Cannot find a multi-factor authentication (MFA) method."));
                }
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    this.label = 1;
                    obj = realAWSCognitoAuthPlugin.getSession(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$1;
                        consumer = (Consumer) this.L$0;
                        wre.m54934b(obj);
                        cr0Var = (cr0) obj;
                        if (cr0Var != null) {
                            String strM21595a = cr0Var.m21595a();
                            if (strM21595a != null) {
                                consumer.accept(new TOTPSetupDetails(strM21595a, str));
                            }
                            cr0Var2 = cr0Var;
                        }
                        if (cr0Var2 == null) {
                            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            y3i y3iVar = y3i.f54824a;
                        }
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                }
                AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                String accessToken = value != null ? value.getAccessToken() : null;
                if (accessToken != null) {
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                    Consumer<TOTPSetupDetails> consumer2 = this.$onSuccess;
                    String username = SessionHelper.INSTANCE.getUsername(accessToken);
                    if (username != null && (cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient()) != null) {
                        br0.C12477a c12477a = new br0.C12477a();
                        c12477a.m19615d(accessToken);
                        br0 br0VarM19612a = c12477a.m19612a();
                        this.L$0 = consumer2;
                        this.L$1 = username;
                        this.label = 2;
                        obj = cognitoIdentityProviderClient.D0(br0VarM19612a, this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        consumer = consumer2;
                        str = username;
                        cr0Var = (cr0) obj;
                        if (cr0Var != null) {
                        }
                    }
                    if (cr0Var2 == null) {
                    }
                    return y3i.f54824a;
                }
                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                y3i y3iVar2 = y3i.f54824a;
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104291(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<TOTPSetupDetails> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$onError, this.$onSuccess, null), 3, null);
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signIn$1 */
    public static final class C104301 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthSignInOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signIn$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
            final /* synthetic */ String $password;
            final /* synthetic */ AWSCognitoAuthSignInOptions $signInOptions;
            final /* synthetic */ StateChangeListenerToken $token;
            final /* synthetic */ String $username;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, String str, String str2, AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
                super(1);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$token = stateChangeListenerToken;
                this.$username = str;
                this.$password = str2;
                this.$signInOptions = aWSCognitoAuthSignInOptions;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AuthState) obj);
                return y3i.f54824a;
            }

            public final void invoke(AuthState authState) {
                sq8.m48649h(authState, "authState");
                if (authState.getAuthNState() instanceof AuthenticationState.SignedOut) {
                    this.this$0.authStateMachine.cancel(this.$token);
                    this.this$0._signIn(this.$username, this.$password, this.$signInOptions, this.$onSuccess, this.$onError);
                }
            }
        }

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signIn$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends kf9 implements uk7 {
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
                super(0);
                this.this$0 = realAWSCognitoAuthPlugin;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68730invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68730invoke() {
                this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104301(AuthSignInOptions authSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, String str, String str2, Consumer<AuthSignInResult> consumer2) {
            super(1);
            this.$options = authSignInOptions;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onError = consumer;
            this.$username = str;
            this.$password = str2;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthSignInOptions authSignInOptions = this.$options;
            AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptionsBuild = authSignInOptions instanceof AWSCognitoAuthSignInOptions ? (AWSCognitoAuthSignInOptions) authSignInOptions : null;
            if (aWSCognitoAuthSignInOptionsBuild == null) {
                aWSCognitoAuthSignInOptionsBuild = AWSCognitoAuthSignInOptions.builder().authFlowType(this.this$0.getConfiguration().getAuthFlowType()).build();
                sq8.m48648g(aWSCognitoAuthSignInOptionsBuild, "build(...)");
            }
            AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = aWSCognitoAuthSignInOptionsBuild;
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
                return;
            }
            if (authNState instanceof AuthenticationState.SignedOut ? true : authNState instanceof AuthenticationState.Configured) {
                this.this$0._signIn(this.$username, this.$password, aWSCognitoAuthSignInOptions, this.$onSuccess, this.$onError);
                return;
            }
            if (authNState instanceof AuthenticationState.SignedIn) {
                this.$onError.accept(new SignedInException(null, null, 3, null));
            } else if (!(authNState instanceof AuthenticationState.SigningIn)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            } else {
                StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.this$0.authStateMachine.listen(stateChangeListenerToken, new AnonymousClass1(this.this$0, stateChangeListenerToken, this.$username, this.$password, aWSCognitoAuthSignInOptions, this.$onSuccess, this.$onError), new AnonymousClass2(this.this$0));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signInWithHostedUI$1 */
    public static final class C104311 extends kf9 implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
        final /* synthetic */ AuthWebUISignInOptions $options;
        final /* synthetic */ AuthProvider $provider;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signInWithHostedUI$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ Activity $callingActivity;
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignInResult> $onSuccess;
            final /* synthetic */ AuthWebUISignInOptions $options;
            final /* synthetic */ AuthProvider $provider;
            final /* synthetic */ StateChangeListenerToken $token;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, AuthProvider authProvider) {
                super(1);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$token = stateChangeListenerToken;
                this.$callingActivity = activity;
                this.$options = authWebUISignInOptions;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
                this.$provider = authProvider;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AuthState) obj);
                return y3i.f54824a;
            }

            public final void invoke(AuthState authState) {
                sq8.m48649h(authState, "authState");
                if (authState.getAuthNState() instanceof AuthenticationState.SignedOut) {
                    this.this$0.authStateMachine.cancel(this.$token);
                    this.this$0._signInWithHostedUI(this.$callingActivity, this.$options, this.$onSuccess, this.$onError, this.$provider);
                }
            }
        }

        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signInWithHostedUI$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends kf9 implements uk7 {
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
                super(0);
                this.this$0 = realAWSCognitoAuthPlugin;
            }

            @Override // p001o.uk7
            public /* bridge */ /* synthetic */ Object invoke() {
                m68731invoke();
                return y3i.f54824a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68731invoke() {
                this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104311(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer2, AuthProvider authProvider) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
            this.$onSuccess = consumer2;
            this.$provider = authProvider;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
                return;
            }
            if (authNState instanceof AuthenticationState.SignedOut) {
                if (this.this$0.getConfiguration().getOauth() == null) {
                    this.$onError.accept(new InvalidOauthConfigurationException());
                    return;
                } else {
                    this.this$0._signInWithHostedUI(this.$callingActivity, this.$options, this.$onSuccess, this.$onError, this.$provider);
                    return;
                }
            }
            if (authNState instanceof AuthenticationState.SignedIn) {
                this.$onError.accept(new SignedInException(null, null, 3, null));
            } else if (!(authNState instanceof AuthenticationState.SigningIn)) {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            } else {
                StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
                this.this$0.authStateMachine.listen(stateChangeListenerToken, new AnonymousClass1(this.this$0, stateChangeListenerToken, this.$callingActivity, this.$options, this.$onSuccess, this.$onError, this.$provider), new AnonymousClass2(this.this$0));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signOut$1 */
    public static final class C104321 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthSignOutResult> $onComplete;
        final /* synthetic */ AuthSignOutOptions $options;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104321(Consumer<AuthSignOutResult> consumer, AuthSignOutOptions authSignOutOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
            super(1);
            this.$onComplete = consumer;
            this.$options = authSignOutOptions;
            this.this$0 = realAWSCognitoAuthPlugin;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.NotConfigured) {
                this.$onComplete.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
                return;
            }
            if (!(authNState instanceof AuthenticationState.SignedIn ? true : authNState instanceof AuthenticationState.SignedOut)) {
                if (authNState instanceof AuthenticationState.FederatedToIdentityPool) {
                    this.$onComplete.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException("The user is currently federated to identity pool. You must call clearFederationToIdentityPool to clear credentials.", null, null, 6, null)));
                    return;
                } else {
                    this.$onComplete.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException(null, null, null, 7, null)));
                    return;
                }
            }
            boolean zIsGlobalSignOut = this.$options.isGlobalSignOut();
            AuthSignOutOptions authSignOutOptions = this.$options;
            AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = authSignOutOptions instanceof AWSCognitoAuthSignOutOptions ? (AWSCognitoAuthSignOutOptions) authSignOutOptions : null;
            this.this$0.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(zIsGlobalSignOut, aWSCognitoAuthSignOutOptions != null ? aWSCognitoAuthSignOutOptions.getBrowserPackage() : null, false, 4, null)), null, 2, null));
            RealAWSCognitoAuthPlugin._signOut$default(this.this$0, false, this.$onComplete, 1, null);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signUp$1 */
    public static final class C104331 extends kf9 implements xk7 {
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
        final /* synthetic */ AuthSignUpOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signUp$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {226}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$signUp$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Consumer<AuthSignUpResult> $onSuccess;
            final /* synthetic */ AuthSignUpOptions $options;
            final /* synthetic */ String $password;
            final /* synthetic */ String $username;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$username = str;
                this.$password = str2;
                this.$options = authSignUpOptions;
                this.$onSuccess = consumer;
                this.$onError = consumer2;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$username, this.$password, this.$options, this.$onSuccess, this.$onError, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    String str = this.$username;
                    String str2 = this.$password;
                    AuthSignUpOptions authSignUpOptions = this.$options;
                    Consumer<AuthSignUpResult> consumer = this.$onSuccess;
                    Consumer<AuthException> consumer2 = this.$onError;
                    this.label = 1;
                    if (realAWSCognitoAuthPlugin._signUp(str, str2, authSignUpOptions, consumer, consumer2, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104331(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer2) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$username = str;
            this.$password = str2;
            this.$options = authSignUpOptions;
            this.$onSuccess = consumer2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.NotConfigured) {
                this.$onError.accept(new InvalidUserPoolConfigurationException());
            } else {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$username, this.$password, this.$options, this.$onSuccess, this.$onError, null), 3, null);
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updatePassword$1 */
    public static final class C104351 extends kf9 implements xk7 {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104351(String str, String str2, Action action, Consumer<AuthException> consumer) {
            super(1);
            this.$oldPassword = str;
            this.$newPassword = str2;
            this.$onSuccess = action;
            this.$onError = consumer;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState instanceof AuthenticationState.SignedIn) {
                RealAWSCognitoAuthPlugin.this._updatePassword(this.$oldPassword, this.$newPassword, this.$onSuccess, this.$onError);
            } else if (authNState instanceof AuthenticationState.SignedOut) {
                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$verifyTotp$1 */
    public static final class C104361 extends kf9 implements xk7 {
        final /* synthetic */ String $code;
        final /* synthetic */ String $friendlyDeviceName;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$verifyTotp$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {2145, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$verifyTotp$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ String $code;
            final /* synthetic */ String $friendlyDeviceName;
            final /* synthetic */ Consumer<AuthException> $onError;
            final /* synthetic */ Action $onSuccess;
            Object L$0;
            int label;
            final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, String str, String str2, Action action, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = realAWSCognitoAuthPlugin;
                this.$onError = consumer;
                this.$code = str;
                this.$friendlyDeviceName = str2;
                this.$onSuccess = action;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, this.$onError, this.$code, this.$friendlyDeviceName, this.$onSuccess, n64Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0013, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x008f, B:36:0x009c, B:38:0x009f, B:11:0x001f, B:19:0x0034, B:21:0x0042, B:24:0x004a, B:26:0x0060, B:16:0x0029), top: B:43:0x0009 }] */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Action action;
                gti gtiVar;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                gti gtiVar2 = null;
                try {
                } catch (Exception e) {
                    this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Amazon Cognito cannot find a multi-factor authentication (MFA) method."));
                }
                if (i == 0) {
                    wre.m54934b(obj);
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                    this.label = 1;
                    obj = realAWSCognitoAuthPlugin.getSession(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        action = (Action) this.L$0;
                        wre.m54934b(obj);
                        gtiVar = (gti) obj;
                        if (gtiVar != null) {
                            if (!(gtiVar.m29483b() instanceof hti.C14077d)) {
                                throw new ServiceException("An unknown service error has occurred", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                            }
                            action.call();
                            gtiVar2 = gtiVar;
                        }
                        if (gtiVar2 == null) {
                            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                            y3i y3iVar = y3i.f54824a;
                        }
                        return y3i.f54824a;
                    }
                    wre.m54934b(obj);
                }
                AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) obj).getUserPoolTokensResult().getValue();
                String accessToken = value != null ? value.getAccessToken() : null;
                if (accessToken != null) {
                    RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                    String str = this.$code;
                    String str2 = this.$friendlyDeviceName;
                    Action action2 = this.$onSuccess;
                    kg3 cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        fti.C13554a c13554a = new fti.C13554a();
                        c13554a.m27485i(str);
                        c13554a.m27483g(str2);
                        c13554a.m27482f(accessToken);
                        fti ftiVarM27477a = c13554a.m27477a();
                        this.L$0 = action2;
                        this.label = 2;
                        obj = cognitoIdentityProviderClient.x0(ftiVarM27477a, this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        action = action2;
                        gtiVar = (gti) obj;
                        if (gtiVar != null) {
                        }
                    }
                    if (gtiVar2 == null) {
                    }
                    return y3i.f54824a;
                }
                this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                y3i y3iVar2 = y3i.f54824a;
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104361(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2, Action action) {
            super(1);
            this.$onError = consumer;
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$code = str;
            this.$friendlyDeviceName = str2;
            this.$onSuccess = action;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthState) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthState authState) {
            sq8.m48649h(authState, "authState");
            if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
                rm1.m46952d(kt7.f32697a, null, null, new AnonymousClass1(this.this$0, this.$onError, this.$code, this.$friendlyDeviceName, this.$onSuccess, null), 3, null);
            } else {
                this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
    }

    public RealAWSCognitoAuthPlugin(AuthConfiguration authConfiguration, AuthEnvironment authEnvironment, AuthStateMachine authStateMachine, Logger logger) {
        sq8.m48649h(authConfiguration, "configuration");
        sq8.m48649h(authEnvironment, "authEnvironment");
        sq8.m48649h(authStateMachine, "authStateMachine");
        sq8.m48649h(logger, "logger");
        this.configuration = authConfiguration;
        this.authEnvironment = authEnvironment;
        this.authStateMachine = authStateMachine;
        this.logger = logger;
        this.lastPublishedHubEventName = new AtomicReference<>();
        addAuthStateChangeListener();
        configureAuthStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object _autoSignIn(SignUpData signUpData, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C103902(stateChangeListenerToken, consumer2, consumer), new C103913(signUpData, this));
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _clearFederationToIdentityPool(final Action action, final Consumer<AuthException> consumer) {
        _signOut(false, new Consumer() { // from class: o.tce
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RealAWSCognitoAuthPlugin._clearFederationToIdentityPool$lambda$7(consumer, action, this, (AuthSignOutResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _clearFederationToIdentityPool$lambda$7(Consumer consumer, Action action, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthSignOutResult authSignOutResult) {
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(action, "$onSuccess");
        sq8.m48649h(realAWSCognitoAuthPlugin, "this$0");
        sq8.m48649h(authSignOutResult, "it");
        if (authSignOutResult instanceof AWSCognitoAuthSignOutResult.FailedSignOut) {
            consumer.accept(((AWSCognitoAuthSignOutResult.FailedSignOut) authSignOutResult).getException());
        } else {
            action.call();
            realAWSCognitoAuthPlugin.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATION_TO_IDENTITY_POOL_CLEARED.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _confirmSignIn(SignInState signInState, String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C103921(stateChangeListenerToken, consumer, consumer2), new C103932(authConfirmSignInOptions, signInState, str, consumer2, this, stateChangeListenerToken));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object _confirmSignUp(String str, String str2, SignUpState signUpState, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C103942(stateChangeListenerToken, consumer2, consumer), new C103953(signUpState, str, authConfirmSignUpOptions, str2, this));
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _deleteUser(String str, Action action, Consumer<AuthException> consumer) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C103961(new gge(), this, stateChangeListenerToken, action, consumer), new C103972(str, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _federateToIdentityPool(Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C103981(stateChangeListenerToken, consumer, consumer2), C103992.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _fetchAuthSession(Consumer<AuthSession> consumer) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C104001(stateChangeListenerToken, consumer), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146 A[Catch: Exception -> 0x0063, TRY_ENTER, TryCatch #2 {Exception -> 0x0063, blocks: (B:13:0x003e, B:62:0x0138, B:67:0x0146, B:69:0x014c, B:71:0x0160, B:73:0x0166, B:75:0x017e, B:77:0x0182, B:81:0x018e, B:83:0x0196, B:85:0x019c, B:86:0x01a3, B:18:0x005f, B:39:0x00a5, B:41:0x00b9, B:43:0x00c8, B:45:0x00ce, B:47:0x00e0, B:49:0x00e8, B:51:0x00f2, B:53:0x00fa, B:55:0x0106, B:57:0x0116, B:58:0x011e), top: B:100:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:13:0x003e, B:62:0x0138, B:67:0x0146, B:69:0x014c, B:71:0x0160, B:73:0x0166, B:75:0x017e, B:77:0x0182, B:81:0x018e, B:83:0x0196, B:85:0x019c, B:86:0x01a3, B:18:0x005f, B:39:0x00a5, B:41:0x00b9, B:43:0x00c8, B:45:0x00ce, B:47:0x00e0, B:49:0x00e8, B:51:0x00f2, B:53:0x00fa, B:55:0x0106, B:57:0x0116, B:58:0x011e), top: B:100:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:13:0x003e, B:62:0x0138, B:67:0x0146, B:69:0x014c, B:71:0x0160, B:73:0x0166, B:75:0x017e, B:77:0x0182, B:81:0x018e, B:83:0x0196, B:85:0x019c, B:86:0x01a3, B:18:0x005f, B:39:0x00a5, B:41:0x00b9, B:43:0x00c8, B:45:0x00ce, B:47:0x00e0, B:49:0x00e8, B:51:0x00f2, B:53:0x00fa, B:55:0x0106, B:57:0x0116, B:58:0x011e), top: B:100:0x002b }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amplifyframework.core.Consumer] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object _resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
        C104011 c104011;
        Consumer<AuthException> consumer3;
        AWSCognitoAuthResendSignUpCodeOptions aWSCognitoAuthResendSignUpCodeOptions;
        Map<String, String> metadata;
        AuthEnvironment authEnvironment;
        Consumer<AuthCodeDeliveryDetails> consumer4;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin;
        String str2;
        Map<String, String> map;
        Consumer<AuthException> consumer5;
        hne hneVar;
        Consumer<AuthCodeDeliveryDetails> consumer6;
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2;
        Map mapM32684k;
        ze3 ze3VarM30853a;
        Consumer<AuthException> consumer7;
        ?? r2 = authResendSignUpCodeOptions;
        if (n64Var instanceof C104011) {
            c104011 = (C104011) n64Var;
            int i = c104011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104011.label = i - Integer.MIN_VALUE;
            } else {
                c104011 = new C104011(n64Var);
            }
        }
        Object userContextData = c104011.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104011.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i2 == 0) {
            wre.m54934b(userContextData);
            this.logger.verbose("ResendSignUpCode Starting execution");
            try {
                if (r2 instanceof AWSCognitoAuthResendSignUpCodeOptions) {
                    try {
                        aWSCognitoAuthResendSignUpCodeOptions = (AWSCognitoAuthResendSignUpCodeOptions) r2;
                    } catch (Exception e2) {
                        e = e2;
                        r2 = consumer2;
                        r2.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Resend sign up code failed."));
                        return y3i.f54824a;
                    }
                } else {
                    aWSCognitoAuthResendSignUpCodeOptions = null;
                }
                metadata = aWSCognitoAuthResendSignUpCodeOptions != null ? aWSCognitoAuthResendSignUpCodeOptions.getMetadata() : null;
                authEnvironment = this.authEnvironment;
                c104011.L$0 = this;
                c104011.L$1 = str;
                consumer4 = consumer;
                c104011.L$2 = consumer4;
                consumer3 = consumer2;
            } catch (Exception e3) {
                e = e3;
                consumer3 = consumer2;
            }
            try {
                c104011.L$3 = consumer3;
                c104011.L$4 = metadata;
                c104011.label = 1;
                userContextData = authEnvironment.getUserContextData(str, c104011);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                realAWSCognitoAuthPlugin = this;
                str2 = str;
                map = metadata;
                consumer5 = consumer3;
            } catch (Exception e4) {
                e = e4;
                r2 = consumer3;
                r2.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Resend sign up code failed."));
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Consumer<AuthException> consumer8 = (Consumer) c104011.L$2;
                consumer6 = (Consumer) c104011.L$1;
                realAWSCognitoAuthPlugin2 = (RealAWSCognitoAuthPlugin) c104011.L$0;
                wre.m54934b(userContextData);
                consumer7 = consumer8;
                hneVar = (hne) userContextData;
                consumer4 = consumer6;
                realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
                r2 = consumer7;
                if (hneVar == null || (ze3VarM30853a = hneVar.m30853a()) == null) {
                    mapM32684k = null;
                } else {
                    hwc[] hwcVarArr = new hwc[3];
                    hwcVarArr[0] = vyh.m53620a("DESTINATION", ze3VarM30853a.m59325c());
                    xl5 xl5VarM59324b = ze3VarM30853a.m59324b();
                    hwcVarArr[1] = vyh.m53620a("MEDIUM", xl5VarM59324b != null ? xl5VarM59324b.mo56446a() : null);
                    hwcVarArr[2] = vyh.m53620a("ATTRIBUTE", ze3VarM30853a.m59323a());
                    mapM32684k = isa.m32684k(hwcVarArr);
                }
                if (mapM32684k != null || (str = (String) isa.m32682i(mapM32684k, "DESTINATION")) == null) {
                    String str3 = "";
                }
                consumer4.accept(new AuthCodeDeliveryDetails(str3, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapM32684k == null ? (String) isa.m32682i(mapM32684k, "MEDIUM") : null), mapM32684k != null ? (String) isa.m32682i(mapM32684k, "ATTRIBUTE") : null));
                realAWSCognitoAuthPlugin.logger.verbose("ResendSignUpCode Execution complete");
                return y3i.f54824a;
            }
            map = (Map) c104011.L$4;
            Consumer<AuthException> consumer9 = (Consumer) c104011.L$3;
            consumer4 = (Consumer) c104011.L$2;
            str2 = (String) c104011.L$1;
            realAWSCognitoAuthPlugin = (RealAWSCognitoAuthPlugin) c104011.L$0;
            wre.m54934b(userContextData);
            consumer5 = consumer9;
        }
        String str4 = (String) userContextData;
        String pinpointEndpointId = realAWSCognitoAuthPlugin.authEnvironment.getPinpointEndpointId();
        kg3 cognitoIdentityProviderClient = realAWSCognitoAuthPlugin.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
            hneVar = null;
            r2 = consumer5;
            if (hneVar == null) {
            }
            return y3i.f54824a;
        }
        gne.C13795a c13795a = new gne.C13795a();
        UserPoolConfiguration userPool = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
        c13795a.m29174i(userPool != null ? userPool.getAppClient() : null);
        c13795a.m29177l(str2);
        AuthHelper.Companion companion = AuthHelper.Companion;
        UserPoolConfiguration userPool2 = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
        String appClient = userPool2 != null ? userPool2.getAppClient() : null;
        UserPoolConfiguration userPool3 = realAWSCognitoAuthPlugin.getConfiguration().getUserPool();
        c13795a.m29176k(companion.getSecretHash(str2, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
        c13795a.m29175j(map);
        if (pinpointEndpointId != null) {
            c13795a.m29173h(hc0.f26603b.m30167a(new RealAWSCognitoAuthPlugin$_resendSignUpCode$response$1$1$1(pinpointEndpointId)));
        }
        if (str4 != null) {
            c13795a.m29178m(new RealAWSCognitoAuthPlugin$_resendSignUpCode$response$1$2$1(str4));
        }
        gne gneVarM29166a = c13795a.m29166a();
        c104011.L$0 = realAWSCognitoAuthPlugin;
        c104011.L$1 = consumer4;
        c104011.L$2 = consumer5;
        c104011.L$3 = null;
        c104011.L$4 = null;
        c104011.label = 2;
        userContextData = cognitoIdentityProviderClient.s0(gneVarM29166a, c104011);
        if (userContextData == objM51918f) {
            return objM51918f;
        }
        consumer6 = consumer4;
        realAWSCognitoAuthPlugin2 = realAWSCognitoAuthPlugin;
        consumer7 = consumer5;
        hneVar = (hne) userContextData;
        consumer4 = consumer6;
        realAWSCognitoAuthPlugin = realAWSCognitoAuthPlugin2;
        r2 = consumer7;
        if (hneVar == null) {
            mapM32684k = null;
            if (mapM32684k != null) {
                String str32 = "";
                consumer4.accept(new AuthCodeDeliveryDetails(str32, AuthCodeDeliveryDetails.DeliveryMedium.fromString(mapM32684k == null ? (String) isa.m32682i(mapM32684k, "MEDIUM") : null), mapM32684k != null ? (String) isa.m32682i(mapM32684k, "ATTRIBUTE") : null));
                realAWSCognitoAuthPlugin.logger.verbose("ResendSignUpCode Execution complete");
            }
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _signIn(String str, String str2, AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C104021(stateChangeListenerToken, consumer2, consumer), new C104032(aWSCognitoAuthSignInOptions, this, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _signInWithHostedUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, AuthProvider authProvider) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C104041(stateChangeListenerToken, consumer2, consumer), new C104052(activity, authProvider, authWebUISignInOptions, this));
    }

    public static /* synthetic */ void _signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, AuthProvider authProvider, int i, Object obj) {
        if ((i & 16) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin._signInWithHostedUI(activity, authWebUISignInOptions, consumer, consumer2, authProvider);
    }

    private final void _signOut(boolean z, Consumer<AuthSignOutResult> consumer) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C104061(stateChangeListenerToken, consumer, z, new gge()), C104072.INSTANCE);
    }

    public static /* synthetic */ void _signOut$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, boolean z, Consumer consumer, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        realAWSCognitoAuthPlugin._signOut(z, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object _signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
        Object objCollectWhile = FlowExtensionsKt.collectWhile(e47.m24275i(e47.m24284r(this.authStateMachine.getState(), new C104082(authSignUpOptions, str, str2, this, null)), 1), new C104093(consumer, consumer2), n64Var);
        return objCollectWhile == uq8.m51918f() ? objCollectWhile : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _updatePassword(String str, String str2, Action action, Consumer<AuthException> consumer) {
        rm1.m46950b(kt7.f32697a, null, null, new C104101(action, consumer, str, str2, null), 3, null);
    }

    private final void addAuthStateChangeListener() {
        this.authStateMachine.listen(new StateChangeListenerToken(), new C104121(), null);
    }

    private final void configureAuthStates() {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C104151(stateChangeListenerToken), new C104162());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSession(n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                sq8.m48649h(authSession, "authSession");
                if (authSession instanceof AWSCognitoAuthSession) {
                    a0fVar.resumeWith(vre.m53351b(authSession));
                    return;
                }
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(new UnknownException("fetchAuthSession did not return a type of AWSCognitoAuthSession", null, 2, null))));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHubEvent(String str) {
        if (sq8.m48644c(this.lastPublishedHubEventName.get(), str)) {
            return;
        }
        this.lastPublishedHubEventName.set(str);
        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(str));
    }

    private final void signInWithHostedUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        this.authStateMachine.getCurrentState(new C104311(consumer2, this, activity, authWebUISignInOptions, consumer, authProvider));
    }

    public static /* synthetic */ void signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, int i, Object obj) {
        if ((i & 1) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin.signInWithHostedUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMFAPreference$lambda$5(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer consumer, MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, boolean z, Action action, UserMFAPreference userMFAPreference) {
        sq8.m48649h(realAWSCognitoAuthPlugin, "this$0");
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(action, "$onSuccess");
        sq8.m48649h(userMFAPreference, "userPreference");
        realAWSCognitoAuthPlugin.authStateMachine.getCurrentState(new RealAWSCognitoAuthPlugin$updateMFAPreference$1$1(consumer, realAWSCognitoAuthPlugin, mFAPreference, mFAPreference2, mFAPreference3, z, userMFAPreference, action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMFAPreference$lambda$6(Consumer consumer, AuthException authException) {
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(authException, "it");
        consumer.accept(new AuthException("Failed to fetch current MFA preferences which is a pre-requisite to update MFA preferences", "Sorry, we don’t have a recovery suggestion for this error.", authException));
    }

    private final void verifyTotp(String str, String str2, Action action, Consumer<AuthException> consumer) {
        this.authStateMachine.getCurrentState(new C104361(consumer, this, str, str2, action));
    }

    @InternalAmplifyApi
    public final void addToUserAgent(AWSCognitoAuthMetadataType aWSCognitoAuthMetadataType, String str) {
        sq8.m48649h(aWSCognitoAuthMetadataType, "type");
        sq8.m48649h(str, "value");
        this.authEnvironment.getCognitoAuthService().getCustomUserAgentPairs().put(aWSCognitoAuthMetadataType.getKey(), str);
    }

    public final void autoSignIn(Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104131(consumer2, this, consumer));
    }

    public final void clearFederationToIdentityPool(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.authStateMachine.getCurrentState(new C104141(action, consumer));
    }

    public final void confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(str3, "confirmationCode");
        sq8.m48649h(authConfirmResetPasswordOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.authStateMachine.getCurrentState(new C104171(consumer, this, str, str3, str2, authConfirmResetPasswordOptions, action));
    }

    public final void confirmSignIn(String str, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "challengeResponse");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthConfirmSignInOptions.DefaultAuthConfirmSignInOptions defaultAuthConfirmSignInOptionsDefaults = AuthConfirmSignInOptions.defaults();
        sq8.m48648g(defaultAuthConfirmSignInOptionsDefaults, "defaults(...)");
        confirmSignIn(str, defaultAuthConfirmSignInOptionsDefaults, consumer, consumer2);
    }

    public final void confirmSignUp(String str, String str2, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "confirmationCode");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthConfirmSignUpOptions.DefaultAuthConfirmSignUpOptions defaultAuthConfirmSignUpOptionsDefaults = AuthConfirmSignUpOptions.defaults();
        sq8.m48648g(defaultAuthConfirmSignUpOptionsDefaults, "defaults(...)");
        confirmSignUp(str, str2, defaultAuthConfirmSignUpOptionsDefaults, consumer, consumer2);
    }

    public final void deleteUser(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.authStateMachine.getCurrentState(new C104201(consumer, this, action));
    }

    public final AWSCognitoAuthService escapeHatch() {
        return this.authEnvironment.getCognitoAuthService();
    }

    public final void federateToIdentityPool(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "providerToken");
        sq8.m48649h(authProvider, "authProvider");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104211(consumer2, this, str, authProvider, federateToIdentityPoolOptions, consumer));
    }

    public final void fetchAuthSession(Consumer<AuthSession> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        fetchAuthSession(AuthFetchSessionOptions.Companion.defaults(), consumer, consumer2);
    }

    public final void fetchMFAPreference(Consumer<UserMFAPreference> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104231(consumer2, this, consumer));
    }

    public final AuthConfiguration getConfiguration() {
        return this.configuration;
    }

    public final void handleWebUISignInResponse(Intent intent) {
        this.authStateMachine.getCurrentState(new C104241(intent, this));
    }

    public final void initialize() {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.authStateMachine.listen(stateChangeListenerToken, new C104251(stateChangeListenerToken, countDownLatch), C104262.INSTANCE);
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            throw new AmplifyException("Failed to configure auth plugin.", "Make sure your amplifyconfiguration.json is valid");
        }
    }

    public final void resendSignUpCode(String str, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthResendSignUpCodeOptions.DefaultAuthResendSignUpCodeOptions defaultAuthResendSignUpCodeOptionsDefaults = AuthResendSignUpCodeOptions.defaults();
        sq8.m48648g(defaultAuthResendSignUpCodeOptionsDefaults, "defaults(...)");
        resendSignUpCode(str, defaultAuthResendSignUpCodeOptionsDefaults, consumer, consumer2);
    }

    public final void resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authResetPasswordOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        try {
            kg3 cognitoIdentityProviderClient = this.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            UserPoolConfiguration userPool = this.configuration.getUserPool();
            String appClient = userPool != null ? userPool.getAppClient() : null;
            if (appClient == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            rm1.m46952d(kt7.f32697a, null, null, new C104281(str, cognitoIdentityProviderClient, appClient, authResetPasswordOptions, consumer, consumer2, null), 3, null);
        } catch (Exception unused) {
            consumer2.accept(new InvalidUserPoolConfigurationException());
        }
    }

    public final void setUpTOTP(Consumer<TOTPSetupDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104291(consumer2, this, consumer));
    }

    public final void signIn(String str, String str2, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthSignInOptions.DefaultAuthSignInOptions defaultAuthSignInOptionsDefaults = AuthSignInOptions.defaults();
        sq8.m48648g(defaultAuthSignInOptionsDefaults, "defaults(...)");
        signIn(str, str2, defaultAuthSignInOptionsDefaults, consumer, consumer2);
    }

    public final void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptionsBuild = AWSCognitoAuthWebUISignInOptions.builder().build();
        sq8.m48648g(aWSCognitoAuthWebUISignInOptionsBuild, "build(...)");
        signInWithSocialWebUI(authProvider, activity, aWSCognitoAuthWebUISignInOptionsBuild, consumer, consumer2);
    }

    public final void signInWithWebUI(Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthWebUISignInOptions authWebUISignInOptionsBuild = AuthWebUISignInOptions.builder().build();
        sq8.m48648g(authWebUISignInOptionsBuild, "build(...)");
        signInWithWebUI(activity, authWebUISignInOptionsBuild, consumer, consumer2);
    }

    public final void signOut(Consumer<AuthSignOutResult> consumer) {
        sq8.m48649h(consumer, "onComplete");
        AuthSignOutOptions authSignOutOptionsBuild = AuthSignOutOptions.builder().build();
        sq8.m48648g(authSignOutOptionsBuild, "build(...)");
        signOut(authSignOutOptionsBuild, consumer);
    }

    public final void signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authSignUpOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104331(consumer2, this, str, str2, authSignUpOptions, consumer));
    }

    public final Object suspendWhileConfiguring$aws_auth_cognito_release(n64 n64Var) {
        Object objM24272f = e47.m24272f(e47.m24287u(this.authStateMachine.getState(), new RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(null)), n64Var);
        return objM24272f == uq8.m51918f() ? objM24272f : y3i.f54824a;
    }

    public final void updateMFAPreference(final MFAPreference mFAPreference, final MFAPreference mFAPreference2, final MFAPreference mFAPreference3, final Action action, final Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        if (mFAPreference == null && mFAPreference2 == null && mFAPreference3 == null) {
            consumer.accept(new InvalidParameterException("No mfa settings given", null, 2, null));
            return;
        }
        boolean z = false;
        if (!(mFAPreference != null ? sq8.m48644c(mFAPreference.getMfaPreferred$aws_auth_cognito_release(), Boolean.TRUE) : false)) {
            if (!(mFAPreference2 != null ? sq8.m48644c(mFAPreference2.getMfaPreferred$aws_auth_cognito_release(), Boolean.TRUE) : false)) {
                z = true;
            }
        }
        final boolean z2 = z;
        fetchMFAPreference(new Consumer() { // from class: o.uce
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RealAWSCognitoAuthPlugin.updateMFAPreference$lambda$5(this.f48715a, consumer, mFAPreference, mFAPreference2, mFAPreference3, z2, action, (UserMFAPreference) obj);
            }
        }, new Consumer() { // from class: o.vce
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RealAWSCognitoAuthPlugin.updateMFAPreference$lambda$6(consumer, (AuthException) obj);
            }
        });
    }

    public final void updatePassword(String str, String str2, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "oldPassword");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        this.authStateMachine.getCurrentState(new C104351(str, str2, action, consumer));
    }

    public final void verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "code");
        sq8.m48649h(authVerifyTOTPSetupOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        AWSCognitoAuthVerifyTOTPSetupOptions aWSCognitoAuthVerifyTOTPSetupOptions = authVerifyTOTPSetupOptions instanceof AWSCognitoAuthVerifyTOTPSetupOptions ? (AWSCognitoAuthVerifyTOTPSetupOptions) authVerifyTOTPSetupOptions : null;
        verifyTotp(str, aWSCognitoAuthVerifyTOTPSetupOptions != null ? aWSCognitoAuthVerifyTOTPSetupOptions.getFriendlyDeviceName() : null, action, consumer);
    }

    public final void confirmResetPassword(String str, String str2, String str3, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(str3, "confirmationCode");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        AuthConfirmResetPasswordOptions.DefaultAuthConfirmResetPasswordOptions defaultAuthConfirmResetPasswordOptionsDefaults = AuthConfirmResetPasswordOptions.defaults();
        sq8.m48648g(defaultAuthConfirmResetPasswordOptionsDefaults, "defaults(...)");
        confirmResetPassword(str, str2, str3, defaultAuthConfirmResetPasswordOptionsDefaults, action, consumer);
    }

    public final void confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "challengeResponse");
        sq8.m48649h(authConfirmSignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104181(str, authConfirmSignInOptions, consumer, consumer2));
    }

    public final void confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "confirmationCode");
        sq8.m48649h(authConfirmSignUpOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104191(consumer2, this, str, str2, authConfirmSignUpOptions, consumer));
    }

    public final void fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, Consumer<AuthSession> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authFetchSessionOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104221(consumer, authFetchSessionOptions.getForceRefresh(), consumer2));
    }

    public final void resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authResendSignUpCodeOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104271(consumer2, this, str, authResendSignUpCodeOptions, consumer));
    }

    public final void signIn(String str, String str2, AuthSignInOptions authSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authSignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        this.authStateMachine.getCurrentState(new C104301(authSignInOptions, this, consumer2, str, str2, consumer));
    }

    public final void signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authWebUISignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        signInWithHostedUI$default(this, null, activity, authWebUISignInOptions, consumer, consumer2, 1, null);
    }

    public final void signOut(AuthSignOutOptions authSignOutOptions, Consumer<AuthSignOutResult> consumer) {
        sq8.m48649h(authSignOutOptions, "options");
        sq8.m48649h(consumer, "onComplete");
        this.authStateMachine.getCurrentState(new C104321(consumer, authSignOutOptions, this));
    }

    public final void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authWebUISignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        signInWithHostedUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    public final void resetPassword(String str, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        AuthResetPasswordOptions.DefaultAuthResetPasswordOptions defaultAuthResetPasswordOptionsDefaults = AuthResetPasswordOptions.defaults();
        sq8.m48648g(defaultAuthResetPasswordOptionsDefaults, "defaults(...)");
        resetPassword(str, defaultAuthResetPasswordOptionsDefaults, consumer, consumer2);
    }
}
