package com.amplifyframework.auth.cognito.actions;

import ab.C0087e;
import ab.InterfaceC0086d;
import android.app.Activity;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.helpers.WebAuthnHelper;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContextKt;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;
import eb.C1977a;
import eb.b0;
import eb.g0;
import eb.k3;
import eb.p2;
import eb.q2;
import eb.r2;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.b8;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6674x;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnSignInCognitoActions implements WebAuthnSignInActions {
    public static final WebAuthnSignInCognitoActions INSTANCE = new WebAuthnSignInCognitoActions();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ChallengeResponse {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ ChallengeResponse[] $VALUES;
        private final String key;
        public static final ChallengeResponse USERNAME = new ChallengeResponse("USERNAME", 0, "USERNAME");
        public static final ChallengeResponse CREDENTIAL = new ChallengeResponse("CREDENTIAL", 1, "CREDENTIAL");
        public static final ChallengeResponse ANSWER = new ChallengeResponse("ANSWER", 2, "ANSWER");

        private static final /* synthetic */ ChallengeResponse[] $values() {
            return new ChallengeResponse[]{USERNAME, CREDENTIAL, ANSWER};
        }

        static {
            ChallengeResponse[] challengeResponseArr$values = $values();
            $VALUES = challengeResponseArr$values;
            $ENTRIES = b8.m11548b(challengeResponseArr$values);
        }

        private ChallengeResponse(String str, int i10, String str2) {
            this.key = str2;
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static ChallengeResponse valueOf(String str) {
            return (ChallengeResponse) Enum.valueOf(ChallengeResponse.class, str);
        }

        public static ChallengeResponse[] values() {
            return (ChallengeResponse[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$assertCredentials$1", m15344f = "WebAuthnSignInCognitoActions.kt", m15345l = {73}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$assertCredentials$1 */
    public static final class C11281 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ WebAuthnEvent.EventType.AssertCredentialOptions $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11281(WebAuthnEvent.EventType.AssertCredentialOptions assertCredentialOptions, InterfaceC7559c<? super C11281> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$event = assertCredentialOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C11281 c11281 = new C11281(this.$event, interfaceC7559c);
            c11281.L$0 = obj;
            return c11281;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(AuthEnvironment authEnvironment, InterfaceC7559c<? super StateMachineEvent> interfaceC7559c) {
            return ((C11281) create(authEnvironment, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            AuthEnvironment authEnvironment = (AuthEnvironment) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                WebAuthnHelper webAuthnHelper = new WebAuthnHelper(authEnvironment.getContext(), null, 2, null);
                String strRequireRequestJson = WebAuthnSignInContextKt.requireRequestJson(this.$event.getSignInContext());
                WeakReference<Activity> callingActivity = this.$event.getSignInContext().getCallingActivity();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = webAuthnHelper.getCredential(strRequireRequestJson, callingActivity, this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return new WebAuthnEvent(new WebAuthnEvent.EventType.VerifyCredentialsAndSignIn(WebAuthnSignInContext.copy$default(this.$event.getSignInContext(), null, null, null, null, (String) obj, 15, null)), null, 2, null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1", m15344f = "WebAuthnSignInCognitoActions.kt", m15345l = {44, 122}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1 */
    public static final class C11291 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ WebAuthnEvent.EventType.FetchCredentialOptions $event;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11291(WebAuthnEvent.EventType.FetchCredentialOptions fetchCredentialOptions, InterfaceC7559c<? super C11291> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$event = fetchCredentialOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C11291 c11291 = new C11291(this.$event, interfaceC7559c);
            c11291.L$0 = obj;
            return c11291;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(AuthEnvironment authEnvironment, InterfaceC7559c<? super StateMachineEvent> interfaceC7559c) {
            return ((C11291) create(authEnvironment, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            InterfaceC0086d interfaceC0086dRequireIdentityProviderClient;
            WebAuthnSignInContext webAuthnSignInContext;
            WebAuthnSignInContext webAuthnSignInContext2;
            AuthEnvironment authEnvironment = (AuthEnvironment) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                WebAuthnSignInContext signInContext = this.$event.getSignInContext();
                interfaceC0086dRequireIdentityProviderClient = AuthEnvironmentKt.requireIdentityProviderClient(authEnvironment);
                String username = signInContext.getUsername();
                this.L$0 = authEnvironment;
                this.L$1 = signInContext;
                this.L$2 = interfaceC0086dRequireIdentityProviderClient;
                this.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, this);
                if (userContextData != enumC7794a) {
                    webAuthnSignInContext = signInContext;
                    obj = userContextData;
                }
                return enumC7794a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webAuthnSignInContext2 = (WebAuthnSignInContext) this.L$1;
                od.m10798c(obj);
                r2 r2Var = (r2) obj;
                return SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, webAuthnSignInContext2.getUsername(), r2Var.f9434b, r2Var.f9436d, r2Var.f9435c, null, r2Var.f9433a, webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH), 16, null);
            }
            interfaceC0086dRequireIdentityProviderClient = (InterfaceC0086d) this.L$2;
            webAuthnSignInContext = (WebAuthnSignInContext) this.L$1;
            od.m10798c(obj);
            final String str = (String) obj;
            final String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
            p2 p2Var = new p2();
            p2Var.f9412b = b0.f9274b;
            UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
            p2Var.f9414d = userPool != null ? userPool.getAppClient() : null;
            C6361k c6361k = new C6361k(ChallengeResponse.USERNAME.getKey(), webAuthnSignInContext.getUsername());
            String key = ChallengeResponse.ANSWER.getKey();
            g0 g0Var = g0.f9318b;
            p2Var.f9413c = AbstractC6674x.m12778f(c6361k, new C6361k(key, "WEB_AUTHN"));
            p2Var.f9416f = webAuthnSignInContext.getSession();
            if (pinpointEndpointId != null) {
                p2Var.m5732a(new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1$response$1$1$1
                    @Override // ex.InterfaceC2139c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((C1977a) obj2);
                        return a0.f30746a;
                    }

                    public final void invoke(C1977a analyticsMetadata) {
                        AbstractC4154l.m8923f(analyticsMetadata, "$this$analyticsMetadata");
                        analyticsMetadata.f9268a = pinpointEndpointId;
                    }
                });
            }
            if (str != null) {
                p2Var.m5733b(new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1$response$1$2$1
                    @Override // ex.InterfaceC2139c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((k3) obj2);
                        return a0.f30746a;
                    }

                    public final void invoke(k3 userContextData2) {
                        AbstractC4154l.m8923f(userContextData2, "$this$userContextData");
                        userContextData2.f9353a = str;
                    }
                });
            }
            q2 q2Var = new q2(p2Var);
            this.L$0 = null;
            this.L$1 = webAuthnSignInContext;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = 0;
            this.label = 2;
            obj = ((C0087e) interfaceC0086dRequireIdentityProviderClient).m251H(q2Var, this);
            if (obj != enumC7794a) {
                webAuthnSignInContext2 = webAuthnSignInContext;
                r2 r2Var2 = (r2) obj;
                return SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, webAuthnSignInContext2.getUsername(), r2Var2.f9434b, r2Var2.f9436d, r2Var2.f9435c, null, r2Var2.f9433a, webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH), 16, null);
            }
            return enumC7794a;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1", m15344f = "WebAuthnSignInCognitoActions.kt", m15345l = {85, 122}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1 */
    public static final class C11321 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ WebAuthnEvent.EventType.VerifyCredentialsAndSignIn $event;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11321(WebAuthnEvent.EventType.VerifyCredentialsAndSignIn verifyCredentialsAndSignIn, InterfaceC7559c<? super C11321> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$event = verifyCredentialsAndSignIn;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C11321 c11321 = new C11321(this.$event, interfaceC7559c);
            c11321.L$0 = obj;
            return c11321;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(AuthEnvironment authEnvironment, InterfaceC7559c<? super StateMachineEvent> interfaceC7559c) {
            return ((C11321) create(authEnvironment, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            InterfaceC0086d interfaceC0086dRequireIdentityProviderClient;
            WebAuthnSignInContext webAuthnSignInContext;
            WebAuthnSignInContext webAuthnSignInContext2;
            AuthEnvironment authEnvironment = (AuthEnvironment) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                WebAuthnSignInContext signInContext = this.$event.getSignInContext();
                interfaceC0086dRequireIdentityProviderClient = AuthEnvironmentKt.requireIdentityProviderClient(authEnvironment);
                String username = signInContext.getUsername();
                this.L$0 = authEnvironment;
                this.L$1 = signInContext;
                this.L$2 = interfaceC0086dRequireIdentityProviderClient;
                this.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, this);
                if (userContextData != enumC7794a) {
                    webAuthnSignInContext = signInContext;
                    obj = userContextData;
                }
                return enumC7794a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webAuthnSignInContext2 = (WebAuthnSignInContext) this.L$1;
                od.m10798c(obj);
                r2 r2Var = (r2) obj;
                return SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, webAuthnSignInContext2.getUsername(), g0.f9318b, webAuthnSignInContext2.getSession(), r2Var.f9435c, null, r2Var.f9433a, webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH), 16, null);
            }
            interfaceC0086dRequireIdentityProviderClient = (InterfaceC0086d) this.L$2;
            webAuthnSignInContext = (WebAuthnSignInContext) this.L$1;
            od.m10798c(obj);
            final String str = (String) obj;
            final String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
            p2 p2Var = new p2();
            p2Var.f9412b = g0.f9318b;
            UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
            p2Var.f9414d = userPool != null ? userPool.getAppClient() : null;
            p2Var.f9413c = AbstractC6674x.m12778f(new C6361k(ChallengeResponse.USERNAME.getKey(), webAuthnSignInContext.getUsername()), new C6361k(ChallengeResponse.CREDENTIAL.getKey(), WebAuthnSignInContextKt.requireResponseJson(webAuthnSignInContext)));
            p2Var.f9416f = webAuthnSignInContext.getSession();
            if (pinpointEndpointId != null) {
                p2Var.m5732a(new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1$response$1$1$1
                    @Override // ex.InterfaceC2139c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((C1977a) obj2);
                        return a0.f30746a;
                    }

                    public final void invoke(C1977a analyticsMetadata) {
                        AbstractC4154l.m8923f(analyticsMetadata, "$this$analyticsMetadata");
                        analyticsMetadata.f9268a = pinpointEndpointId;
                    }
                });
            }
            if (str != null) {
                p2Var.m5733b(new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1$response$1$2$1
                    @Override // ex.InterfaceC2139c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((k3) obj2);
                        return a0.f30746a;
                    }

                    public final void invoke(k3 userContextData2) {
                        AbstractC4154l.m8923f(userContextData2, "$this$userContextData");
                        userContextData2.f9353a = str;
                    }
                });
            }
            q2 q2Var = new q2(p2Var);
            this.L$0 = null;
            this.L$1 = webAuthnSignInContext;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = 0;
            this.label = 2;
            obj = ((C0087e) interfaceC0086dRequireIdentityProviderClient).m251H(q2Var, this);
            if (obj != enumC7794a) {
                webAuthnSignInContext2 = webAuthnSignInContext;
                r2 r2Var2 = (r2) obj;
                return SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, webAuthnSignInContext2.getUsername(), g0.f9318b, webAuthnSignInContext2.getSession(), r2Var2.f9435c, null, r2Var2.f9433a, webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH), 16, null);
            }
            return enumC7794a;
        }
    }

    private WebAuthnSignInCognitoActions() {
    }

    private final Action safeAction(WebAuthnSignInContext webAuthnSignInContext, InterfaceC2141e interfaceC2141e) {
        Action.Companion companion = Action.Companion;
        return new C1127xb51bce42(null, interfaceC2141e, webAuthnSignInContext);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action assertCredentials(WebAuthnEvent.EventType.AssertCredentialOptions event) {
        AbstractC4154l.m8923f(event, "event");
        return safeAction(event.getSignInContext(), new C11281(event, null));
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action fetchCredentialOptions(WebAuthnEvent.EventType.FetchCredentialOptions event) {
        AbstractC4154l.m8923f(event, "event");
        return safeAction(event.getSignInContext(), new C11291(event, null));
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action verifyCredentialAndSignIn(WebAuthnEvent.EventType.VerifyCredentialsAndSignIn event) {
        AbstractC4154l.m8923f(event, "event");
        return safeAction(event.getSignInContext(), new C11321(event, null));
    }
}
