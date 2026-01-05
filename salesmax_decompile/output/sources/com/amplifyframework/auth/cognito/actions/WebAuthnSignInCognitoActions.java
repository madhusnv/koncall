package com.amplifyframework.auth.cognito.actions;

import android.app.Activity;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.helpers.WebAuthnHelper;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContextKt;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;
import java.lang.ref.WeakReference;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.bb4;
import p001o.cg2;
import p001o.gi6;
import p001o.hi6;
import p001o.isa;
import p001o.jgg;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.vyh;
import p001o.wqe;
import p001o.wre;
import p001o.xqe;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class WebAuthnSignInCognitoActions implements WebAuthnSignInActions {
    public static final WebAuthnSignInCognitoActions INSTANCE = new WebAuthnSignInCognitoActions();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChallengeResponse {
        private static final /* synthetic */ gi6 $ENTRIES;
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
            $ENTRIES = hi6.m30609a(challengeResponseArr$values);
        }

        private ChallengeResponse(String str, int i, String str2) {
            this.key = str2;
        }

        public static gi6 getEntries() {
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

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$assertCredentials$1", m36648f = "WebAuthnSignInCognitoActions.kt", m36649l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$assertCredentials$1 */
    public static final class C105121 extends jgg implements nl7 {
        final /* synthetic */ WebAuthnEvent.EventType.AssertCredentialOptions $event;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105121(WebAuthnEvent.EventType.AssertCredentialOptions assertCredentialOptions, n64 n64Var) {
            super(2, n64Var);
            this.$event = assertCredentialOptions;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C105121 c105121 = new C105121(this.$event, n64Var);
            c105121.L$0 = obj;
            return c105121;
        }

        @Override // p001o.nl7
        public final Object invoke(AuthEnvironment authEnvironment, n64 n64Var) {
            return ((C105121) create(authEnvironment, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            int i2 = 2;
            bb4 bb4Var = null;
            Object[] objArr = 0;
            if (i == 0) {
                wre.m54934b(obj);
                WebAuthnHelper webAuthnHelper = new WebAuthnHelper(((AuthEnvironment) this.L$0).getContext(), bb4Var, i2, objArr == true ? 1 : 0);
                String strRequireRequestJson = WebAuthnSignInContextKt.requireRequestJson(this.$event.getSignInContext());
                WeakReference<Activity> callingActivity = this.$event.getSignInContext().getCallingActivity();
                this.label = 1;
                obj = webAuthnHelper.getCredential(strRequireRequestJson, callingActivity, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return new WebAuthnEvent(new WebAuthnEvent.EventType.VerifyCredentialsAndSignIn(WebAuthnSignInContext.copy$default(this.$event.getSignInContext(), null, null, null, null, (String) obj, 15, null)), null, 2, null);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1", m36648f = "WebAuthnSignInCognitoActions.kt", m36649l = {um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 122}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$fetchCredentialOptions$1 */
    public static final class C105131 extends jgg implements nl7 {
        final /* synthetic */ WebAuthnEvent.EventType.FetchCredentialOptions $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105131(WebAuthnEvent.EventType.FetchCredentialOptions fetchCredentialOptions, n64 n64Var) {
            super(2, n64Var);
            this.$event = fetchCredentialOptions;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C105131 c105131 = new C105131(this.$event, n64Var);
            c105131.L$0 = obj;
            return c105131;
        }

        @Override // p001o.nl7
        public final Object invoke(AuthEnvironment authEnvironment, n64 n64Var) {
            return ((C105131) create(authEnvironment, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            AuthEnvironment authEnvironment;
            kg3 kg3VarRequireIdentityProviderClient;
            WebAuthnSignInContext webAuthnSignInContext;
            WebAuthnSignInContext webAuthnSignInContext2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                authEnvironment = (AuthEnvironment) this.L$0;
                WebAuthnSignInContext signInContext = this.$event.getSignInContext();
                kg3VarRequireIdentityProviderClient = AuthEnvironmentKt.requireIdentityProviderClient(authEnvironment);
                String username = signInContext.getUsername();
                this.L$0 = authEnvironment;
                this.L$1 = signInContext;
                this.L$2 = kg3VarRequireIdentityProviderClient;
                this.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, this);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                webAuthnSignInContext = signInContext;
                obj = userContextData;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webAuthnSignInContext2 = (WebAuthnSignInContext) this.L$0;
                    wre.m54934b(obj);
                    xqe xqeVar = (xqe) obj;
                    return SignInChallengeHelper.INSTANCE.evaluateNextStep(webAuthnSignInContext2.getUsername(), xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH));
                }
                kg3VarRequireIdentityProviderClient = (kg3) this.L$2;
                webAuthnSignInContext = (WebAuthnSignInContext) this.L$1;
                authEnvironment = (AuthEnvironment) this.L$0;
                wre.m54934b(obj);
            }
            String str = (String) obj;
            String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
            wqe.C17950a c17950a = new wqe.C17950a();
            c17950a.m54876j(cg2.C12668m.f18075c);
            UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
            c17950a.m54878l(userPool != null ? userPool.getAppClient() : null);
            c17950a.m54877k(isa.m32684k(vyh.m53620a(ChallengeResponse.USERNAME.getKey(), webAuthnSignInContext.getUsername()), vyh.m53620a(ChallengeResponse.ANSWER.getKey(), cg2.C12673r.f18085c.mo21138a())));
            c17950a.m54880n(webAuthnSignInContext.getSession());
            if (pinpointEndpointId != null) {
                c17950a.m54867a(new C10514x89fa76e(pinpointEndpointId));
            }
            if (str != null) {
                c17950a.m54881o(new C10515x89fab2f(str));
            }
            wqe wqeVarM54868b = c17950a.m54868b();
            this.L$0 = webAuthnSignInContext;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = kg3VarRequireIdentityProviderClient.j2(wqeVarM54868b, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            webAuthnSignInContext2 = webAuthnSignInContext;
            xqe xqeVar2 = (xqe) obj;
            return SignInChallengeHelper.INSTANCE.evaluateNextStep(webAuthnSignInContext2.getUsername(), xqeVar2.m56662b(), xqeVar2.m56664d(), (80 & 8) != 0 ? null : xqeVar2.m56663c(), (80 & 16) != 0 ? null : null, xqeVar2.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH));
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1", m36648f = "WebAuthnSignInCognitoActions.kt", m36649l = {Opcodes.CASTORE, 122}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$verifyCredentialAndSignIn$1 */
    public static final class C105161 extends jgg implements nl7 {
        final /* synthetic */ WebAuthnEvent.EventType.VerifyCredentialsAndSignIn $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105161(WebAuthnEvent.EventType.VerifyCredentialsAndSignIn verifyCredentialsAndSignIn, n64 n64Var) {
            super(2, n64Var);
            this.$event = verifyCredentialsAndSignIn;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C105161 c105161 = new C105161(this.$event, n64Var);
            c105161.L$0 = obj;
            return c105161;
        }

        @Override // p001o.nl7
        public final Object invoke(AuthEnvironment authEnvironment, n64 n64Var) {
            return ((C105161) create(authEnvironment, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws InvalidStateException {
            AuthEnvironment authEnvironment;
            kg3 kg3VarRequireIdentityProviderClient;
            WebAuthnSignInContext webAuthnSignInContext;
            WebAuthnSignInContext webAuthnSignInContext2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                authEnvironment = (AuthEnvironment) this.L$0;
                WebAuthnSignInContext signInContext = this.$event.getSignInContext();
                kg3VarRequireIdentityProviderClient = AuthEnvironmentKt.requireIdentityProviderClient(authEnvironment);
                String username = signInContext.getUsername();
                this.L$0 = authEnvironment;
                this.L$1 = signInContext;
                this.L$2 = kg3VarRequireIdentityProviderClient;
                this.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, this);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                webAuthnSignInContext = signInContext;
                obj = userContextData;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webAuthnSignInContext2 = (WebAuthnSignInContext) this.L$0;
                    wre.m54934b(obj);
                    xqe xqeVar = (xqe) obj;
                    return SignInChallengeHelper.INSTANCE.evaluateNextStep(webAuthnSignInContext2.getUsername(), cg2.C12673r.f18085c, webAuthnSignInContext2.getSession(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH));
                }
                kg3VarRequireIdentityProviderClient = (kg3) this.L$2;
                webAuthnSignInContext = (WebAuthnSignInContext) this.L$1;
                authEnvironment = (AuthEnvironment) this.L$0;
                wre.m54934b(obj);
            }
            String str = (String) obj;
            String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
            wqe.C17950a c17950a = new wqe.C17950a();
            c17950a.m54876j(cg2.C12673r.f18085c);
            UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
            c17950a.m54878l(userPool != null ? userPool.getAppClient() : null);
            c17950a.m54877k(isa.m32684k(vyh.m53620a(ChallengeResponse.USERNAME.getKey(), webAuthnSignInContext.getUsername()), vyh.m53620a(ChallengeResponse.CREDENTIAL.getKey(), WebAuthnSignInContextKt.requireResponseJson(webAuthnSignInContext))));
            c17950a.m54880n(webAuthnSignInContext.getSession());
            if (pinpointEndpointId != null) {
                c17950a.m54867a(new C10517xdc43ff3a(pinpointEndpointId));
            }
            if (str != null) {
                c17950a.m54881o(new C10518xdc4402fb(str));
            }
            wqe wqeVarM54868b = c17950a.m54868b();
            this.L$0 = webAuthnSignInContext;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = kg3VarRequireIdentityProviderClient.j2(wqeVarM54868b, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            webAuthnSignInContext2 = webAuthnSignInContext;
            xqe xqeVar2 = (xqe) obj;
            return SignInChallengeHelper.INSTANCE.evaluateNextStep(webAuthnSignInContext2.getUsername(), cg2.C12673r.f18085c, webAuthnSignInContext2.getSession(), (80 & 8) != 0 ? null : xqeVar2.m56663c(), (80 & 16) != 0 ? null : null, xqeVar2.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : webAuthnSignInContext2.getCallingActivity(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH));
        }
    }

    private WebAuthnSignInCognitoActions() {
    }

    private final Action safeAction(WebAuthnSignInContext webAuthnSignInContext, nl7 nl7Var) {
        Action.Companion companion = Action.Companion;
        return new C10511xb51bce42(null, nl7Var, webAuthnSignInContext);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action assertCredentials(WebAuthnEvent.EventType.AssertCredentialOptions assertCredentialOptions) {
        sq8.m48649h(assertCredentialOptions, "event");
        return safeAction(assertCredentialOptions.getSignInContext(), new C105121(assertCredentialOptions, null));
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action fetchCredentialOptions(WebAuthnEvent.EventType.FetchCredentialOptions fetchCredentialOptions) {
        sq8.m48649h(fetchCredentialOptions, "event");
        return safeAction(fetchCredentialOptions.getSignInContext(), new C105131(fetchCredentialOptions, null));
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions
    public Action verifyCredentialAndSignIn(WebAuthnEvent.EventType.VerifyCredentialsAndSignIn verifyCredentialsAndSignIn) {
        sq8.m48649h(verifyCredentialsAndSignIn, "event");
        return safeAction(verifyCredentialsAndSignIn.getSignInContext(), new C105161(verifyCredentialsAndSignIn, null));
    }
}
