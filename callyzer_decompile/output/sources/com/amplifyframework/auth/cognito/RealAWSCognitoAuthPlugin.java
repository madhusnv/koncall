package com.amplifyframework.auth.cognito;

import an.b2;
import an.j2;
import an.o1;
import an.w1;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import aw.C0466f;
import bt.C0765j;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.AWSTemporaryCredentials;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.invalidstate.SignedInException;
import com.amplifyframework.auth.cognito.exceptions.service.HostedUISignOutException;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidAccountTypeException;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.auth.cognito.helpers.HostedUIHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignOutOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.cognito.result.GlobalSignOutError;
import com.amplifyframework.auth.cognito.result.HostedUIError;
import com.amplifyframework.auth.cognito.result.RevokeTokenError;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
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
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.errors.SessionError;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState;
import eb.C1998v;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import og.od;
import pg.n6;
import qw.a0;
import rw.C6669s;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.C8219t;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RealAWSCognitoAuthPlugin {
    private final AuthEnvironment authEnvironment;
    private final AuthStateMachine authStateMachine;
    private final AuthConfiguration configuration;
    private final AtomicReference<String> lastPublishedHubEventName;
    private final Logger logger;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final /* synthetic */ class WhenMappings {
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

    public RealAWSCognitoAuthPlugin(AuthConfiguration configuration, AuthEnvironment authEnvironment, AuthStateMachine authStateMachine, Logger logger) {
        AbstractC4154l.m8923f(configuration, "configuration");
        AbstractC4154l.m8923f(authEnvironment, "authEnvironment");
        AbstractC4154l.m8923f(authStateMachine, "authStateMachine");
        AbstractC4154l.m8923f(logger, "logger");
        this.configuration = configuration;
        this.authEnvironment = authEnvironment;
        this.authStateMachine = authStateMachine;
        this.logger = logger;
        this.lastPublishedHubEventName = new AtomicReference<>();
        addAuthStateChangeListener();
        configureAuthStates();
    }

    private final void _clearFederationToIdentityPool(final Action action, final Consumer<AuthException> consumer) {
        _signOut(false, new Consumer() { // from class: com.amplifyframework.auth.cognito.h
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RealAWSCognitoAuthPlugin._clearFederationToIdentityPool$lambda$36(consumer, action, this, (AuthSignOutResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _clearFederationToIdentityPool$lambda$36(Consumer consumer, Action action, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthSignOutResult it) {
        AbstractC4154l.m8923f(it, "it");
        if (it instanceof AWSCognitoAuthSignOutResult.FailedSignOut) {
            consumer.accept(((AWSCognitoAuthSignOutResult.FailedSignOut) it).getException());
        } else {
            action.call();
            realAWSCognitoAuthPlugin.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATION_TO_IDENTITY_POOL_CLEARED.toString());
        }
    }

    private final void _confirmSignIn(SignInState signInState, String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C1135b(this, stateChangeListenerToken, consumer, consumer2, 1), new C1137d(authConfirmSignInOptions, signInState, str, consumer2, this, stateChangeListenerToken, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final qw.a0 _confirmSignIn$lambda$10(com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r23, com.amplifyframework.statemachine.StateChangeListenerToken r24, com.amplifyframework.core.Consumer r25, com.amplifyframework.core.Consumer r26, com.amplifyframework.statemachine.codegen.states.AuthState r27) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._confirmSignIn$lambda$10(com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin, com.amplifyframework.statemachine.StateChangeListenerToken, com.amplifyframework.core.Consumer, com.amplifyframework.core.Consumer, com.amplifyframework.statemachine.codegen.states.AuthState):qw.a0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final qw.a0 _confirmSignIn$lambda$11(com.amplifyframework.auth.options.AuthConfirmSignInOptions r20, com.amplifyframework.statemachine.codegen.states.SignInState r21, java.lang.String r22, com.amplifyframework.core.Consumer r23, com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r24, com.amplifyframework.statemachine.StateChangeListenerToken r25) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin._confirmSignIn$lambda$11(com.amplifyframework.auth.options.AuthConfirmSignInOptions, com.amplifyframework.statemachine.codegen.states.SignInState, java.lang.String, com.amplifyframework.core.Consumer, com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin, com.amplifyframework.statemachine.StateChangeListenerToken):qw.a0");
    }

    private final void _federateToIdentityPool(Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C1135b(this, stateChangeListenerToken, consumer, consumer2, 3), new C0466f(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 _federateToIdentityPool$lambda$33(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        AuthorizationState authZState = authState.getAuthZState();
        if ((authNState instanceof AuthenticationState.FederatedToIdentityPool) && (authZState instanceof AuthorizationState.SessionEstablished)) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
            Throwable th2 = null;
            Object[] objArr = 0;
            AmplifyCredential.IdentityPoolFederated identityPoolFederated = amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated ? (AmplifyCredential.IdentityPoolFederated) amplifyCredential : null;
            String identityId = identityPoolFederated != null ? identityPoolFederated.getIdentityId() : null;
            AWSCredentials credentials = identityPoolFederated != null ? identityPoolFederated.getCredentials() : null;
            com.amplifyframework.auth.AWSCredentials aWSCredentialsCreateAWSCredentials = com.amplifyframework.auth.AWSCredentials.Factory.createAWSCredentials(credentials != null ? credentials.getAccessKeyId() : null, credentials != null ? credentials.getSecretAccessKey() : null, credentials != null ? credentials.getSessionToken() : null, credentials != null ? credentials.getExpiration() : null);
            AWSTemporaryCredentials aWSTemporaryCredentials = aWSCredentialsCreateAWSCredentials instanceof AWSTemporaryCredentials ? (AWSTemporaryCredentials) aWSCredentialsCreateAWSCredentials : null;
            if (identityId == null || aWSTemporaryCredentials == null) {
                consumer2.accept(new UnknownException("Unable to parse credentials to expected output.", th2, 2, objArr == true ? 1 : 0));
            } else {
                consumer.accept(new FederateToIdentityPoolResult(identityId, aWSTemporaryCredentials));
                realAWSCognitoAuthPlugin.sendHubEvent(AWSCognitoAuthChannelEventName.FEDERATED_TO_IDENTITY_POOL.toString());
            }
        } else if ((authNState instanceof AuthenticationState.Error) && (authZState instanceof AuthorizationState.Error)) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            consumer2.accept(CognitoAuthExceptionConverter.Companion.lookup(((AuthorizationState.Error) authZState).getException(), "Federation could not be completed."));
        }
        return a0.f30746a;
    }

    private final void _fetchAuthSession(Consumer<AuthSession> consumer) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new w1(9, this, stateChangeListenerToken, consumer), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 _fetchAuthSession$lambda$21(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthorizationState authZState = authState.getAuthZState();
        if (authZState instanceof AuthorizationState.SessionEstablished) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential(), null, 1, null));
        } else if (authZState instanceof AuthorizationState.Error) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            Exception exception = ((AuthorizationState.Error) authZState).getException();
            if (exception instanceof SessionError) {
                SessionError sessionError = (SessionError) exception;
                Exception exception2 = sessionError.getException();
                if (exception2 instanceof SignedOutException) {
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                } else if (exception2 instanceof SessionExpiredException) {
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                    realAWSCognitoAuthPlugin.sendHubEvent(AuthChannelEventName.SESSION_EXPIRED.toString());
                } else if ((exception2 instanceof ServiceException) || (exception2 instanceof NotAuthorizedException)) {
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), (AuthException) exception2));
                } else {
                    consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(sessionError.getAmplifyCredential(), new UnknownException("Fetch auth session failed.", exception2)));
                }
            } else if (exception instanceof ConfigurationException) {
                consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new InvalidAccountTypeException(exception)));
            } else {
                consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession(AmplifyCredential.Empty.INSTANCE, new UnknownException("Fetch auth session failed.", exception)));
            }
        }
        return a0.f30746a;
    }

    private final void _signIn(String str, String str2, AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C1135b(this, stateChangeListenerToken, consumer2, consumer, 2), new C0765j(aWSCognitoAuthSignInOptions, this, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.amplifyframework.auth.AuthException] */
    public static final a0 _signIn$lambda$5(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        AuthorizationState authZState = authState.getAuthZState();
        boolean z6 = false;
        boolean z10 = false;
        if (authNState instanceof AuthenticationState.SigningIn) {
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
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                consumer.accept(CognitoAuthExceptionConverter.Companion.lookup(((SRPSignInState.Error) srpSignInState).getException(), "Sign in failed."));
            } else if (signInState instanceof SignInState.Error) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                consumer.accept(CognitoAuthExceptionConverter.Companion.lookup(((SignInState.Error) signInState).getException(), "Sign in failed."));
            } else if (challengeState instanceof SignInChallengeState.WaitingForAnswer) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                SignInChallengeHelper.getNextStep$default(SignInChallengeHelper.INSTANCE, ((SignInChallengeState.WaitingForAnswer) challengeState).getChallenge(), consumer2, consumer, null, null, 24, null);
            } else if (webAuthnSignInState instanceof WebAuthnSignInState.Error) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                consumer.accept(CognitoAuthExceptionConverter.Companion.lookup(((WebAuthnSignInState.Error) webAuthnSignInState).getException(), "Sign in failed"));
            } else if (setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                SignInChallengeHelper signInChallengeHelper = SignInChallengeHelper.INSTANCE;
                C1998v c1998v = C1998v.f9480b;
                SetupTOTPState.WaitingForAnswer waitingForAnswer = (SetupTOTPState.WaitingForAnswer) setupTOTPState;
                SignInChallengeHelper.getNextStep$default(signInChallengeHelper, new AuthChallenge("MFA_SETUP", (String) null, (String) null, waitingForAnswer.getChallengeParams(), (List) null, 16, (AbstractC4148f) null), consumer2, consumer, waitingForAnswer.getSignInTOTPSetupData(), null, 16, null);
                waitingForAnswer.setHasNewResponse(false);
            }
        } else {
            int i10 = 1;
            if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                consumer2.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, C6669s.f31944a, null, null, null, null)));
                realAWSCognitoAuthPlugin.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
            } else if (authNState instanceof AuthenticationState.Error) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                AuthenticationState.Error error = (AuthenticationState.Error) authNState;
                consumer.accept(error.getException() instanceof AuthException ? (AuthException) error.getException() : new UnknownException(z10 ? 1 : 0, error.getException(), i10, z6 ? 1 : 0));
            }
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 _signIn$lambda$6(AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2) {
        SignInData sRPSignInData;
        SignInData customAuthSignInData;
        AuthFlowType authFlowType = aWSCognitoAuthSignInOptions.getAuthFlowType();
        if (authFlowType == null) {
            authFlowType = realAWSCognitoAuthPlugin.configuration.getAuthFlowType();
        }
        int i10 = 2;
        switch (WhenMappings.$EnumSwitchMapping$1[authFlowType.ordinal()]) {
            case 1:
                Map<String, String> metadata = aWSCognitoAuthSignInOptions.getMetadata();
                AbstractC4154l.m8922e(metadata, "getMetadata(...)");
                sRPSignInData = new SignInData.SRPSignInData(str, str2, metadata, AuthFlowType.USER_SRP_AUTH);
                customAuthSignInData = sRPSignInData;
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                return a0.f30746a;
            case 2:
            case 3:
                Map<String, String> metadata2 = aWSCognitoAuthSignInOptions.getMetadata();
                AbstractC4154l.m8922e(metadata2, "getMetadata(...)");
                customAuthSignInData = new SignInData.CustomAuthSignInData(str, metadata2);
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                return a0.f30746a;
            case 4:
                Map<String, String> metadata3 = aWSCognitoAuthSignInOptions.getMetadata();
                AbstractC4154l.m8922e(metadata3, "getMetadata(...)");
                sRPSignInData = new SignInData.CustomSRPAuthSignInData(str, str2, metadata3);
                customAuthSignInData = sRPSignInData;
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                return a0.f30746a;
            case 5:
                Map<String, String> metadata4 = aWSCognitoAuthSignInOptions.getMetadata();
                AbstractC4154l.m8922e(metadata4, "getMetadata(...)");
                sRPSignInData = new SignInData.MigrationAuthSignInData(str, str2, metadata4, AuthFlowType.USER_PASSWORD_AUTH);
                customAuthSignInData = sRPSignInData;
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                return a0.f30746a;
            case 6:
                AuthFactorType preferredFirstFactor = aWSCognitoAuthSignInOptions.getPreferredFirstFactor();
                int i11 = preferredFirstFactor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preferredFirstFactor.ordinal()];
                if (i11 == 1) {
                    Map<String, String> metadata5 = aWSCognitoAuthSignInOptions.getMetadata();
                    AbstractC4154l.m8922e(metadata5, "getMetadata(...)");
                    sRPSignInData = new SignInData.MigrationAuthSignInData(str, str2, metadata5, AuthFlowType.USER_AUTH);
                } else {
                    if (i11 != 2) {
                        AuthFactorType preferredFirstFactor2 = aWSCognitoAuthSignInOptions.getPreferredFirstFactor();
                        WeakReference<Activity> callingActivity = aWSCognitoAuthSignInOptions.getCallingActivity();
                        AbstractC4154l.m8922e(callingActivity, "getCallingActivity(...)");
                        Map<String, String> metadata6 = aWSCognitoAuthSignInOptions.getMetadata();
                        AbstractC4154l.m8922e(metadata6, "getMetadata(...)");
                        customAuthSignInData = new SignInData.UserAuthSignInData(str, preferredFirstFactor2, callingActivity, metadata6);
                        realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                        return a0.f30746a;
                    }
                    Map<String, String> metadata7 = aWSCognitoAuthSignInOptions.getMetadata();
                    AbstractC4154l.m8922e(metadata7, "getMetadata(...)");
                    sRPSignInData = new SignInData.SRPSignInData(str, str2, metadata7, AuthFlowType.USER_AUTH);
                }
                customAuthSignInData = sRPSignInData;
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(customAuthSignInData), null, i10, 0 == true ? 1 : 0));
                return a0.f30746a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void _signInWithHostedUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2, AuthProvider authProvider) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C1135b(this, stateChangeListenerToken, consumer2, consumer, 0), new C0765j(activity, authProvider, authWebUISignInOptions, this, 2));
    }

    public static /* synthetic */ void _signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, AuthProvider authProvider, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin._signInWithHostedUI(activity, authWebUISignInOptions, consumer, consumer2, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 _signInWithHostedUI$lambda$15(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        AuthorizationState authZState = authState.getAuthZState();
        int i10 = 1;
        if (authNState instanceof AuthenticationState.SigningIn) {
            HostedUISignInState hostedUISignInState = ((AuthenticationState.SigningIn) authNState).getSignInState().getHostedUISignInState();
            if (hostedUISignInState instanceof HostedUISignInState.Error) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                Exception exception = ((HostedUISignInState.Error) hostedUISignInState).getException();
                consumer.accept(exception instanceof AuthException ? (AuthException) exception : new UnknownException("Sign in failed", exception));
                realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, i10, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
            }
        } else if ((authNState instanceof AuthenticationState.SignedIn) && (authZState instanceof AuthorizationState.SessionEstablished)) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            consumer2.accept(new AuthSignInResult(true, new AuthNextSignInStep(AuthSignInStep.DONE, C6669s.f31944a, null, null, null, null)));
            realAWSCognitoAuthPlugin.sendHubEvent(AuthChannelEventName.SIGNED_IN.toString());
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 _signInWithHostedUI$lambda$16(Activity activity, AuthProvider authProvider, AuthWebUISignInOptions authWebUISignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignInRequested(new SignInData.HostedUISignInData(HostedUIHelper.INSTANCE.createHostedUIOptions(activity, authProvider, authWebUISignInOptions))), null, 2, 0 == true ? 1 : 0));
        return a0.f30746a;
    }

    private final void _signOut(boolean z6, Consumer<AuthSignOutResult> consumer) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new C1136c(0, this, stateChangeListenerToken, consumer, new C4168z(), z6), new C0466f(2));
    }

    public static /* synthetic */ void _signOut$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, boolean z6, Consumer consumer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        realAWSCognitoAuthPlugin._signOut(z6, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 _signOut$lambda$27(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, boolean z6, C4168z c4168z, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        if (authState instanceof AuthState.Configured) {
            AuthState.Configured configured = (AuthState.Configured) authState;
            AuthenticationState authenticationStateComponent1 = configured.component1();
            AuthorizationState authorizationStateComponent2 = configured.component2();
            if ((authenticationStateComponent1 instanceof AuthenticationState.SignedOut) && (authorizationStateComponent2 instanceof AuthorizationState.Configured)) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                AuthenticationState.SignedOut signedOut = (AuthenticationState.SignedOut) authenticationStateComponent1;
                if (signedOut.getSignedOutData().getHasError()) {
                    SignedOutData signedOutData = signedOut.getSignedOutData();
                    HostedUIErrorData hostedUIErrorData = signedOutData.getHostedUIErrorData();
                    HostedUIError hostedUIError = hostedUIErrorData != null ? new HostedUIError(hostedUIErrorData) : null;
                    GlobalSignOutErrorData globalSignOutErrorData = signedOutData.getGlobalSignOutErrorData();
                    GlobalSignOutError globalSignOutError = globalSignOutErrorData != null ? new GlobalSignOutError(globalSignOutErrorData) : null;
                    RevokeTokenErrorData revokeTokenErrorData = signedOutData.getRevokeTokenErrorData();
                    consumer.accept(new AWSCognitoAuthSignOutResult.PartialSignOut(hostedUIError, globalSignOutError, revokeTokenErrorData != null ? new RevokeTokenError(revokeTokenErrorData) : null));
                    if (z6) {
                        realAWSCognitoAuthPlugin.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                    }
                } else {
                    consumer.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
                    if (z6) {
                        realAWSCognitoAuthPlugin.sendHubEvent(AuthChannelEventName.SIGNED_OUT.toString());
                    }
                }
            } else if (authenticationStateComponent1 instanceof AuthenticationState.Error) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(CognitoAuthExceptionConverter.Companion.lookup(((AuthenticationState.Error) authenticationStateComponent1).getException(), "Sign out failed.")));
            } else if (authenticationStateComponent1 instanceof AuthenticationState.SigningOut) {
                SignOutState signOutState = ((AuthenticationState.SigningOut) authenticationStateComponent1).getSignOutState();
                if (signOutState instanceof SignOutState.Error) {
                    SignOutState.Error error = (SignOutState.Error) signOutState;
                    if (error.getException() instanceof UserCancelledException) {
                        c4168z.f21164a = error.getException();
                    }
                }
            } else if ((authenticationStateComponent1 instanceof AuthenticationState.SignedIn) && c4168z.f21164a != null) {
                realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
                UserCancelledException userCancelledException = (UserCancelledException) c4168z.f21164a;
                if (userCancelledException != null) {
                    consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(userCancelledException));
                }
            }
        }
        return a0.f30746a;
    }

    private final void addAuthStateChangeListener() {
        this.authStateMachine.listen(new StateChangeListenerToken(), new j2(5, this), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 addAuthStateChangeListener$lambda$29(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        realAWSCognitoAuthPlugin.logger.verbose("Auth State Change: " + authState);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final qw.a0 clearFederationToIdentityPool$lambda$35(com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r7, com.amplifyframework.core.Action r8, com.amplifyframework.core.Consumer r9, com.amplifyframework.statemachine.codegen.states.AuthState r10) {
        /*
            java.lang.String r0 = "authState"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r10, r0)
            com.amplifyframework.statemachine.codegen.states.AuthenticationState r0 = r10.getAuthNState()
            com.amplifyframework.statemachine.codegen.states.AuthorizationState r1 = r10.getAuthZState()
            boolean r10 = r10 instanceof com.amplifyframework.statemachine.codegen.states.AuthState.Configured
            if (r10 == 0) goto L19
            boolean r10 = r0 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.FederatedToIdentityPool
            if (r10 == 0) goto L19
            boolean r10 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.SessionEstablished
            if (r10 != 0) goto L35
        L19:
            boolean r10 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.Error
            if (r10 == 0) goto L4b
            com.amplifyframework.statemachine.codegen.states.AuthorizationState$Error r1 = (com.amplifyframework.statemachine.codegen.states.AuthorizationState.Error) r1
            java.lang.Exception r10 = r1.getException()
            boolean r10 = r10 instanceof com.amplifyframework.statemachine.codegen.errors.SessionError
            if (r10 == 0) goto L4b
            java.lang.Exception r10 = r1.getException()
            com.amplifyframework.statemachine.codegen.errors.SessionError r10 = (com.amplifyframework.statemachine.codegen.errors.SessionError) r10
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r10 = r10.getAmplifyCredential()
            boolean r10 = r10 instanceof com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolFederated
            if (r10 == 0) goto L4b
        L35:
            com.amplifyframework.statemachine.codegen.events.AuthenticationEvent r10 = new com.amplifyframework.statemachine.codegen.events.AuthenticationEvent
            com.amplifyframework.statemachine.codegen.events.AuthenticationEvent$EventType$ClearFederationToIdentityPool r0 = new com.amplifyframework.statemachine.codegen.events.AuthenticationEvent$EventType$ClearFederationToIdentityPool
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            r1 = 2
            r10.<init>(r0, r2, r1, r2)
            com.amplifyframework.auth.cognito.AuthStateMachine r0 = r7.authStateMachine
            r0.send(r10)
            r7._clearFederationToIdentityPool(r8, r9)
            goto L59
        L4b:
            com.amplifyframework.auth.exceptions.InvalidStateException r1 = new com.amplifyframework.auth.exceptions.InvalidStateException
            r5 = 6
            r6 = 0
            java.lang.String r2 = "Clearing of federation failed."
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r9.accept(r1)
        L59:
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.clearFederationToIdentityPool$lambda$35(com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin, com.amplifyframework.core.Action, com.amplifyframework.core.Consumer, com.amplifyframework.statemachine.codegen.states.AuthState):qw.a0");
    }

    private final void configureAuthStates() {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.authStateMachine.listen(stateChangeListenerToken, new o1(17, this, stateChangeListenerToken), new C1140g(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 configureAuthStates$lambda$30(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        if (authState instanceof AuthState.Configured) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 configureAuthStates$lambda$31(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        realAWSCognitoAuthPlugin.authStateMachine.send(new AuthEvent(new AuthEvent.EventType.ConfigureAuth(realAWSCognitoAuthPlugin.configuration), null, 2, 0 == true ? 1 : 0));
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 confirmSignIn$lambda$7(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer consumer, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        AuthenticationState.SigningIn signingIn = authNState instanceof AuthenticationState.SigningIn ? (AuthenticationState.SigningIn) authNState : null;
        SignInState signInState = signingIn != null ? signingIn.getSignInState() : null;
        if (signInState instanceof SignInState.ResolvingChallenge) {
            SignInChallengeState challengeState = ((SignInState.ResolvingChallenge) signInState).getChallengeState();
            if ((challengeState instanceof SignInChallengeState.WaitingForAnswer) || (challengeState instanceof SignInChallengeState.Error)) {
                realAWSCognitoAuthPlugin._confirmSignIn(signInState, str, authConfirmSignInOptions, consumer, consumer2);
            } else {
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        } else {
            SignInState signInState2 = signInState;
            if (signInState2 instanceof SignInState.ResolvingTOTPSetup) {
                SetupTOTPState setupTOTPState = ((SignInState.ResolvingTOTPSetup) signInState2).getSetupTOTPState();
                if ((setupTOTPState instanceof SetupTOTPState.WaitingForAnswer) || (setupTOTPState instanceof SetupTOTPState.Error)) {
                    realAWSCognitoAuthPlugin._confirmSignIn(signInState2, str, authConfirmSignInOptions, consumer, consumer2);
                } else {
                    consumer2.accept(new InvalidStateException(null, null, null, 7, null));
                }
            } else if (!(signInState2 instanceof SignInState.SigningInWithWebAuthn)) {
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            } else if (((SignInState.SigningInWithWebAuthn) signInState2).getWebAuthnSignInState() instanceof WebAuthnSignInState.Error) {
                realAWSCognitoAuthPlugin._confirmSignIn(signInState2, str, authConfirmSignInOptions, consumer, consumer2);
            } else {
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final qw.a0 federateToIdentityPool$lambda$32(com.amplifyframework.core.Consumer r8, com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r9, java.lang.String r10, com.amplifyframework.auth.AuthProvider r11, com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions r12, com.amplifyframework.core.Consumer r13, com.amplifyframework.statemachine.codegen.states.AuthState r14) {
        /*
            java.lang.String r0 = "authState"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r14, r0)
            com.amplifyframework.statemachine.codegen.states.AuthenticationState r0 = r14.getAuthNState()
            com.amplifyframework.statemachine.codegen.states.AuthorizationState r1 = r14.getAuthZState()
            boolean r14 = r14 instanceof com.amplifyframework.statemachine.codegen.states.AuthState.Configured
            if (r14 != 0) goto L21
            com.amplifyframework.auth.exceptions.InvalidStateException r2 = new com.amplifyframework.auth.exceptions.InvalidStateException
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Federation could not be completed."
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.accept(r2)
            goto L97
        L21:
            boolean r14 = r0 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedOut
            if (r14 != 0) goto L31
            boolean r14 = r0 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.Error
            if (r14 != 0) goto L31
            boolean r14 = r0 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.NotConfigured
            if (r14 != 0) goto L31
            boolean r14 = r0 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.FederatedToIdentityPool
            if (r14 == 0) goto L3e
        L31:
            boolean r14 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.Configured
            if (r14 != 0) goto L4d
            boolean r14 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.SessionEstablished
            if (r14 != 0) goto L4d
            boolean r14 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.Error
            if (r14 == 0) goto L3e
            goto L4d
        L3e:
            com.amplifyframework.auth.exceptions.InvalidStateException r2 = new com.amplifyframework.auth.exceptions.InvalidStateException
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Federation could not be completed."
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.accept(r2)
            goto L97
        L4d:
            boolean r14 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.SessionEstablished
            r0 = 0
            if (r14 == 0) goto L59
            com.amplifyframework.statemachine.codegen.states.AuthorizationState$SessionEstablished r1 = (com.amplifyframework.statemachine.codegen.states.AuthorizationState.SessionEstablished) r1
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r14 = r1.getAmplifyCredential()
            goto L73
        L59:
            boolean r14 = r1 instanceof com.amplifyframework.statemachine.codegen.states.AuthorizationState.Error
            if (r14 == 0) goto L72
            com.amplifyframework.statemachine.codegen.states.AuthorizationState$Error r1 = (com.amplifyframework.statemachine.codegen.states.AuthorizationState.Error) r1
            java.lang.Exception r14 = r1.getException()
            boolean r1 = r14 instanceof com.amplifyframework.statemachine.codegen.errors.SessionError
            if (r1 == 0) goto L6a
            com.amplifyframework.statemachine.codegen.errors.SessionError r14 = (com.amplifyframework.statemachine.codegen.errors.SessionError) r14
            goto L6b
        L6a:
            r14 = r0
        L6b:
            if (r14 == 0) goto L72
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential r14 = r14.getAmplifyCredential()
            goto L73
        L72:
            r14 = r0
        L73:
            com.amplifyframework.auth.cognito.AuthStateMachine r1 = r9.authStateMachine
            com.amplifyframework.statemachine.codegen.events.AuthorizationEvent r2 = new com.amplifyframework.statemachine.codegen.events.AuthorizationEvent
            com.amplifyframework.statemachine.codegen.events.AuthorizationEvent$EventType$StartFederationToIdentityPool r3 = new com.amplifyframework.statemachine.codegen.events.AuthorizationEvent$EventType$StartFederationToIdentityPool
            com.amplifyframework.statemachine.codegen.data.FederatedToken r4 = new com.amplifyframework.statemachine.codegen.data.FederatedToken
            java.lang.String r11 = com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt.getIdentityProviderName(r11)
            r4.<init>(r10, r11)
            if (r12 == 0) goto L89
            java.lang.String r10 = r12.getDeveloperProvidedIdentityId()
            goto L8a
        L89:
            r10 = r0
        L8a:
            r3.<init>(r4, r10, r14)
            r10 = 2
            r2.<init>(r3, r0, r10, r0)
            r1.send(r2)
            r9._federateToIdentityPool(r13, r8)
        L97:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin.federateToIdentityPool$lambda$32(com.amplifyframework.core.Consumer, com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin, java.lang.String, com.amplifyframework.auth.AuthProvider, com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions, com.amplifyframework.core.Consumer, com.amplifyframework.statemachine.codegen.states.AuthState):qw.a0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 fetchAuthSession$lambda$20(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer consumer, boolean z6, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthorizationState authZState = authState.getAuthZState();
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
        if (authZState instanceof AuthorizationState.Configured) {
            realAWSCognitoAuthPlugin.authStateMachine.send(new AuthorizationEvent(AuthorizationEvent.EventType.FetchUnAuthSession.INSTANCE, date, i10, objArr9 == true ? 1 : 0));
            realAWSCognitoAuthPlugin._fetchAuthSession(consumer);
        } else if (authZState instanceof AuthorizationState.SessionEstablished) {
            AmplifyCredential amplifyCredential = ((AuthorizationState.SessionEstablished) authZState).getAmplifyCredential();
            if (!AWSCognitoAuthSessionKt.isValid(amplifyCredential) || z6) {
                if (amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated) {
                    AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
                    realAWSCognitoAuthPlugin.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated.getFederatedToken(), identityPoolFederated.getIdentityId(), amplifyCredential), objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0));
                } else {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential), objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0));
                }
                realAWSCognitoAuthPlugin._fetchAuthSession(consumer);
            } else {
                consumer.accept(AWSCognitoAuthSessionKt.getCognitoSession$default(amplifyCredential, null, 1, null));
            }
        } else if (authZState instanceof AuthorizationState.Error) {
            Exception exception = ((AuthorizationState.Error) authZState).getException();
            if (exception instanceof SessionError) {
                AmplifyCredential amplifyCredential2 = ((SessionError) exception).getAmplifyCredential();
                if (amplifyCredential2 instanceof AmplifyCredential.IdentityPoolFederated) {
                    AmplifyCredential.IdentityPoolFederated identityPoolFederated2 = (AmplifyCredential.IdentityPoolFederated) amplifyCredential2;
                    realAWSCognitoAuthPlugin.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.StartFederationToIdentityPool(identityPoolFederated2.getFederatedToken(), identityPoolFederated2.getIdentityId(), amplifyCredential2), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0));
                } else {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new AuthorizationEvent(new AuthorizationEvent.EventType.RefreshSession(amplifyCredential2), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0));
                }
                realAWSCognitoAuthPlugin._fetchAuthSession(consumer);
            } else {
                consumer2.accept(new InvalidStateException(null, null, null, 7, null));
            }
        } else {
            consumer2.accept(new InvalidStateException(null, null, null, 7, null));
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSession(InterfaceC7559c<? super AWSCognitoAuthSession> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                AbstractC4154l.m8923f(authSession, "authSession");
                if (authSession instanceof AWSCognitoAuthSession) {
                    c7566j.resumeWith(authSession);
                } else {
                    c7566j.resumeWith(od.m10796a(new UnknownException("fetchAuthSession did not return a type of AWSCognitoAuthSession", null, 2, null)));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$getSession$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 handleWebUISignInResponse$lambda$18(Intent intent, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthState it) {
        HostedUIErrorData hostedUIErrorData;
        Uri uriCreateSignOutUri$aws_auth_cognito_release;
        AbstractC4154l.m8923f(it, "it");
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
        Uri data = intent != null ? intent.getData() : null;
        AuthenticationState authNState = it.getAuthNState();
        int i10 = 2;
        if (authNState instanceof AuthenticationState.SigningOut) {
            SignOutState signOutState = ((AuthenticationState.SigningOut) authNState).getSignOutState();
            SignOutState.SigningOutHostedUI signingOutHostedUI = signOutState instanceof SignOutState.SigningOutHostedUI ? (SignOutState.SigningOutHostedUI) signOutState : null;
            if (signingOutHostedUI != null) {
                if (data != null || signingOutHostedUI.getBypassCancel() || AbstractC4154l.m8918a(signingOutHostedUI.getSignedInData().getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN))) {
                    if (data == null) {
                        HostedUIClient hostedUIClient = realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient();
                        hostedUIErrorData = new HostedUIErrorData((hostedUIClient == null || (uriCreateSignOutUri$aws_auth_cognito_release = hostedUIClient.createSignOutUri$aws_auth_cognito_release()) == null) ? null : uriCreateSignOutUri$aws_auth_cognito_release.toString(), new HostedUISignOutException(realAWSCognitoAuthPlugin.authEnvironment.getHostedUIClient() != null));
                    } else {
                        hostedUIErrorData = null;
                    }
                    if (signingOutHostedUI.getGlobalSignOut()) {
                        realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(signingOutHostedUI.getSignedInData(), hostedUIErrorData), objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0));
                    } else {
                        realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signingOutHostedUI.getSignedInData(), hostedUIErrorData, null, 4, null), objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0));
                    }
                } else {
                    realAWSCognitoAuthPlugin.authStateMachine.send(new SignOutEvent(new SignOutEvent.EventType.UserCancelled(signingOutHostedUI.getSignedInData()), date, i10, objArr9 == true ? 1 : 0));
                }
            }
        } else if (!(authNState instanceof AuthenticationState.SigningIn)) {
            realAWSCognitoAuthPlugin.logger.warn("Received handleWebUIResponse but ignoring because the user is not currently signing in or signing out");
        } else if (data == null) {
            realAWSCognitoAuthPlugin.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(new UserCancelledException("The user cancelled the sign-in attempt, so it did not complete.", "To recover: catch this error, and show the sign-in screen again.", null, 4, null)), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0));
        } else {
            realAWSCognitoAuthPlugin.authStateMachine.send(new HostedUIEvent(new HostedUIEvent.EventType.FetchToken(data), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0));
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 initialize$lambda$0(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, CountDownLatch countDownLatch, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        if (authState instanceof AuthState.Configured) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            countDownLatch.countDown();
        }
        return a0.f30746a;
    }

    private final void sendHubEvent(String str) {
        if (AbstractC4154l.m8918a(this.lastPublishedHubEventName.get(), str)) {
            return;
        }
        this.lastPublishedHubEventName.set(str);
        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 signIn$lambda$4(AuthSignInOptions authSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer consumer, String str, String str2, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptionsBuild = authSignInOptions instanceof AWSCognitoAuthSignInOptions ? (AWSCognitoAuthSignInOptions) authSignInOptions : null;
        if (aWSCognitoAuthSignInOptionsBuild == null) {
            aWSCognitoAuthSignInOptionsBuild = AWSCognitoAuthSignInOptions.builder().authFlowType(realAWSCognitoAuthPlugin.configuration.getAuthFlowType()).build();
            AbstractC4154l.m8922e(aWSCognitoAuthSignInOptionsBuild, "build(...)");
        }
        AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = aWSCognitoAuthSignInOptionsBuild;
        AuthenticationState authNState = authState.getAuthNState();
        if (authNState instanceof AuthenticationState.NotConfigured) {
            consumer.accept(new InvalidUserPoolConfigurationException());
        } else if ((authNState instanceof AuthenticationState.SignedOut) || (authNState instanceof AuthenticationState.Configured)) {
            realAWSCognitoAuthPlugin._signIn(str, str2, aWSCognitoAuthSignInOptions, consumer2, consumer);
        } else if (authNState instanceof AuthenticationState.SignedIn) {
            consumer.accept(new SignedInException(str3, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0));
        } else if (authNState instanceof AuthenticationState.SigningIn) {
            StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
            realAWSCognitoAuthPlugin.authStateMachine.listen(stateChangeListenerToken, new C1139f(realAWSCognitoAuthPlugin, stateChangeListenerToken, str, str2, aWSCognitoAuthSignInOptions, consumer2, consumer), new C1140g(realAWSCognitoAuthPlugin, 2));
        } else {
            consumer.accept(new InvalidStateException(null, null, null, 7, null));
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 signIn$lambda$4$lambda$2(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, String str, String str2, AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, Consumer consumer, Consumer consumer2, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        if (authState.getAuthNState() instanceof AuthenticationState.SignedOut) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            realAWSCognitoAuthPlugin._signIn(str, str2, aWSCognitoAuthSignInOptions, consumer, consumer2);
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 signIn$lambda$4$lambda$3(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        Object[] objArr = 0 == true ? 1 : 0;
        realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0));
        return a0.f30746a;
    }

    private final void signInWithHostedUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        this.authStateMachine.getCurrentState(new C1138e(consumer2, this, activity, authWebUISignInOptions, consumer, authProvider));
    }

    public static /* synthetic */ void signInWithHostedUI$default(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authProvider = null;
        }
        realAWSCognitoAuthPlugin.signInWithHostedUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 signInWithHostedUI$lambda$14(Consumer consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer2, AuthProvider authProvider, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        boolean z6 = authNState instanceof AuthenticationState.NotConfigured;
        a0 a0Var = a0.f30746a;
        if (z6) {
            consumer.accept(new InvalidUserPoolConfigurationException());
            return a0Var;
        }
        if (authNState instanceof AuthenticationState.SignedOut) {
            if (realAWSCognitoAuthPlugin.configuration.getOauth() == null) {
                consumer.accept(new InvalidOauthConfigurationException());
                return a0Var;
            }
            realAWSCognitoAuthPlugin._signInWithHostedUI(activity, authWebUISignInOptions, consumer2, consumer, authProvider);
            return a0Var;
        }
        if (authNState instanceof AuthenticationState.SignedIn) {
            consumer.accept(new SignedInException(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
            return a0Var;
        }
        if (authNState instanceof AuthenticationState.SigningIn) {
            StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
            realAWSCognitoAuthPlugin.authStateMachine.listen(stateChangeListenerToken, new C1139f(realAWSCognitoAuthPlugin, stateChangeListenerToken, activity, authWebUISignInOptions, consumer2, consumer, authProvider, 0), new C1140g(realAWSCognitoAuthPlugin, 0));
            return a0Var;
        }
        consumer.accept(new InvalidStateException(null, null, null, 7, null));
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 signInWithHostedUI$lambda$14$lambda$12(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2, AuthProvider authProvider, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        if (authState.getAuthNState() instanceof AuthenticationState.SignedOut) {
            realAWSCognitoAuthPlugin.authStateMachine.cancel(stateChangeListenerToken);
            realAWSCognitoAuthPlugin._signInWithHostedUI(activity, authWebUISignInOptions, consumer, consumer2, authProvider);
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 signInWithHostedUI$lambda$14$lambda$13(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        Object[] objArr = 0 == true ? 1 : 0;
        realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0));
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 signOut$lambda$22(Consumer consumer, AuthSignOutOptions authSignOutOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, AuthState authState) {
        AbstractC4154l.m8923f(authState, "authState");
        AuthenticationState authNState = authState.getAuthNState();
        if (authNState instanceof AuthenticationState.NotConfigured) {
            consumer.accept(AWSCognitoAuthSignOutResult.CompleteSignOut.INSTANCE);
        } else if ((authNState instanceof AuthenticationState.SignedIn) || (authNState instanceof AuthenticationState.SignedOut)) {
            boolean zIsGlobalSignOut = authSignOutOptions.isGlobalSignOut();
            Date date = null;
            Object[] objArr = 0;
            AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = authSignOutOptions instanceof AWSCognitoAuthSignOutOptions ? (AWSCognitoAuthSignOutOptions) authSignOutOptions : null;
            realAWSCognitoAuthPlugin.authStateMachine.send(new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(zIsGlobalSignOut, aWSCognitoAuthSignOutOptions != null ? aWSCognitoAuthSignOutOptions.getBrowserPackage() : null, false, 4, null)), date, 2, objArr == true ? 1 : 0));
            _signOut$default(realAWSCognitoAuthPlugin, false, consumer, 1, null);
        } else if (authNState instanceof AuthenticationState.FederatedToIdentityPool) {
            consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException("The user is currently federated to identity pool. You must call clearFederationToIdentityPool to clear credentials.", null, null, 6, null)));
        } else {
            consumer.accept(new AWSCognitoAuthSignOutResult.FailedSignOut(new InvalidStateException(null, null, null, 7, null)));
        }
        return a0.f30746a;
    }

    @InternalAmplifyApi
    public final void addToUserAgent(AWSCognitoAuthMetadataType type, String value) {
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(value, "value");
        this.authEnvironment.getCognitoAuthService().getCustomUserAgentPairs().put(type.getKey(), value);
    }

    public final void clearFederationToIdentityPool(Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.authStateMachine.getCurrentState(new w1(10, this, onSuccess, onError));
    }

    public final void confirmSignIn(String challengeResponse, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(challengeResponse, "challengeResponse");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        AuthConfirmSignInOptions.DefaultAuthConfirmSignInOptions defaultAuthConfirmSignInOptionsDefaults = AuthConfirmSignInOptions.defaults();
        AbstractC4154l.m8922e(defaultAuthConfirmSignInOptionsDefaults, "defaults(...)");
        confirmSignIn(challengeResponse, defaultAuthConfirmSignInOptionsDefaults, onSuccess, onError);
    }

    public final AWSCognitoAuthService escapeHatch() {
        return this.authEnvironment.getCognitoAuthService();
    }

    public final void federateToIdentityPool(String providerToken, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer<FederateToIdentityPoolResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(providerToken, "providerToken");
        AbstractC4154l.m8923f(authProvider, "authProvider");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.authStateMachine.getCurrentState(new C1138e(onError, this, providerToken, authProvider, federateToIdentityPoolOptions, onSuccess));
    }

    public final void fetchAuthSession(Consumer<AuthSession> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        fetchAuthSession(AuthFetchSessionOptions.Companion.defaults(), onSuccess, onError);
    }

    public final AuthConfiguration getConfiguration() {
        return this.configuration;
    }

    public final void handleWebUISignInResponse(Intent intent) {
        this.authStateMachine.getCurrentState(new o1(18, intent, this));
    }

    public final void initialize() throws AmplifyException, InterruptedException {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.authStateMachine.listen(stateChangeListenerToken, new w1(8, this, stateChangeListenerToken, countDownLatch), new C0466f(4));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            throw new AmplifyException("Failed to configure auth plugin.", "Make sure your amplifyconfiguration.json is valid");
        }
    }

    public final void signIn(String str, String str2, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        AuthSignInOptions.DefaultAuthSignInOptions defaultAuthSignInOptionsDefaults = AuthSignInOptions.defaults();
        AbstractC4154l.m8922e(defaultAuthSignInOptionsDefaults, "defaults(...)");
        signIn(str, str2, defaultAuthSignInOptionsDefaults, onSuccess, onError);
    }

    public final void signInWithSocialWebUI(AuthProvider provider, Activity callingActivity, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptionsBuild = AWSCognitoAuthWebUISignInOptions.builder().build();
        AbstractC4154l.m8922e(aWSCognitoAuthWebUISignInOptionsBuild, "build(...)");
        signInWithSocialWebUI(provider, callingActivity, aWSCognitoAuthWebUISignInOptionsBuild, onSuccess, onError);
    }

    public final void signInWithWebUI(Activity callingActivity, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        AuthWebUISignInOptions authWebUISignInOptionsBuild = AuthWebUISignInOptions.builder().build();
        AbstractC4154l.m8922e(authWebUISignInOptionsBuild, "build(...)");
        signInWithWebUI(callingActivity, authWebUISignInOptionsBuild, onSuccess, onError);
    }

    public final void signOut(Consumer<AuthSignOutResult> onComplete) {
        AbstractC4154l.m8923f(onComplete, "onComplete");
        AuthSignOutOptions authSignOutOptionsBuild = AuthSignOutOptions.builder().build();
        AbstractC4154l.m8922e(authSignOutOptionsBuild, "build(...)");
        signOut(authSignOutOptionsBuild, onComplete);
    }

    public final Object suspendWhileConfiguring$aws_auth_cognito_release(InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objM15378i = c1.m15378i(new C8219t(this.authStateMachine.getState(), new RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(null), 3), interfaceC7559c);
        return objM15378i == EnumC7794a.COROUTINE_SUSPENDED ? objM15378i : a0.f30746a;
    }

    public final void confirmSignIn(String challengeResponse, AuthConfirmSignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(challengeResponse, "challengeResponse");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.authStateMachine.getCurrentState(new b2(this, challengeResponse, options, onSuccess, onError));
    }

    public final void fetchAuthSession(AuthFetchSessionOptions options, Consumer<AuthSession> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.authStateMachine.getCurrentState(new C1145i(0, this, onSuccess, onError, options.getForceRefresh()));
    }

    public final void signIn(String str, String str2, AuthSignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        this.authStateMachine.getCurrentState(new C1138e(options, this, onError, str, str2, onSuccess));
    }

    public final void signInWithWebUI(Activity callingActivity, AuthWebUISignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        signInWithHostedUI$default(this, null, callingActivity, options, onSuccess, onError, 1, null);
    }

    public final void signOut(AuthSignOutOptions options, Consumer<AuthSignOutResult> onComplete) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onComplete, "onComplete");
        this.authStateMachine.getCurrentState(new w1(7, onComplete, options, this));
    }

    public final void signInWithSocialWebUI(AuthProvider provider, Activity callingActivity, AuthWebUISignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        signInWithHostedUI(provider, callingActivity, options, onSuccess, onError);
    }
}
