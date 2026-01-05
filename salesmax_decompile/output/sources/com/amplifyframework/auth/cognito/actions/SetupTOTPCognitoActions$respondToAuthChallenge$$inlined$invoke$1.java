package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.TypeReference;
import p001o.cg2;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wqe;
import p001o.wre;
import p001o.xqe;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.RespondToAuthChallenge $eventType$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1", m36648f = "SetupTOTPCognitoActions.kt", m36649l = {TypeReference.CAST, TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, 78}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1$1 */
    public static final class C104881 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C104881(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge) {
        this.$eventType$inlined = respondToAuthChallenge;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0107 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:21:0x005d, B:43:0x00f7, B:45:0x0107, B:47:0x0127, B:49:0x012d, B:51:0x0132, B:53:0x013c, B:54:0x0144, B:24:0x0072, B:35:0x00d1, B:37:0x00d5, B:39:0x00db, B:40:0x00e0), top: B:73:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:58:0x015b, B:61:0x0163, B:63:0x018e), top: B:79:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:58:0x015b, B:61:0x0163, B:63:0x018e), top: B:79:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104881 c104881;
        SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1;
        EventDispatcher eventDispatcher2;
        StateMachineEvent setupTOTPEvent;
        EventDispatcher eventDispatcher3;
        EventDispatcher eventDispatcher4;
        LinkedHashMap linkedHashMap;
        String username;
        EventDispatcher eventDispatcher5;
        SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
        AuthEnvironment authEnvironment;
        Map map;
        String deviceKey;
        kg3 cognitoIdentityProviderClient;
        xqe xqeVar;
        if (n64Var instanceof C104881) {
            c104881 = (C104881) n64Var;
            int i = c104881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104881.label = i - Integer.MIN_VALUE;
            } else {
                c104881 = new C104881(n64Var);
            }
        }
        Object userContextData = c104881.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104881.label;
        ?? r7 = 1;
        try {
        } catch (Exception e) {
            e = e;
            setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
            eventDispatcher2 = r7;
        }
        if (i2 == 0) {
            wre.m54934b(userContextData);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            try {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("USERNAME", this.$eventType$inlined.getUsername());
                username = this.$eventType$inlined.getUsername();
                c104881.L$0 = this;
                eventDispatcher4 = eventDispatcher;
            } catch (Exception e2) {
                e = e2;
                eventDispatcher4 = eventDispatcher;
            }
            try {
                c104881.L$1 = eventDispatcher4;
                c104881.L$2 = authEnvironment2;
                c104881.L$3 = linkedHashMap;
                c104881.label = 1;
                Object deviceMetadata = authEnvironment2.getDeviceMetadata(username, c104881);
                if (deviceMetadata == objM51918f) {
                    return objM51918f;
                }
                eventDispatcher5 = eventDispatcher4;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = this;
                authEnvironment = authEnvironment2;
                map = linkedHashMap;
                userContextData = deviceMetadata;
            } catch (Exception e3) {
                e = e3;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = this;
                eventDispatcher2 = eventDispatcher4;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                eventDispatcher3 = eventDispatcher2;
                eventDispatcher3.send(setupTOTPEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eventDispatcher3 = (EventDispatcher) c104881.L$1;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) c104881.L$0;
                    try {
                        wre.m54934b(userContextData);
                        xqeVar = (xqe) userContextData;
                        if (xqeVar != null) {
                            setupTOTPEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSignInMethod());
                            if (setupTOTPEvent == null) {
                                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token verification failed"), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        eventDispatcher2 = eventDispatcher3;
                        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                        eventDispatcher3 = eventDispatcher2;
                        eventDispatcher3.send(setupTOTPEvent);
                        return y3i.f54824a;
                    }
                    eventDispatcher3.send(setupTOTPEvent);
                    return y3i.f54824a;
                }
                map = (Map) c104881.L$3;
                authEnvironment = (AuthEnvironment) c104881.L$2;
                EventDispatcher eventDispatcher6 = (EventDispatcher) c104881.L$1;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) c104881.L$0;
                wre.m54934b(userContextData);
                r7 = eventDispatcher6;
                String str = (String) userContextData;
                String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    eventDispatcher3 = r7;
                    xqeVar = null;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                    if (xqeVar != null) {
                    }
                    eventDispatcher3.send(setupTOTPEvent);
                    return y3i.f54824a;
                }
                wqe.C17950a c17950a = new wqe.C17950a();
                c17950a.m54880n(setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12.$eventType$inlined.getSession());
                c17950a.m54877k(map);
                c17950a.m54876j(cg2.C12662g.f18064c);
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                c17950a.m54878l(userPool != null ? userPool.getAppClient() : null);
                if (pinpointEndpointId != null) {
                    c17950a.m54867a(new C10490x6d1a89f1(pinpointEndpointId));
                }
                if (str != null) {
                    c17950a.m54881o(new C10491x6d1a8db2(str));
                }
                wqe wqeVarM54868b = c17950a.m54868b();
                c104881.L$0 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                c104881.L$1 = r7;
                c104881.L$2 = null;
                c104881.L$3 = null;
                c104881.label = 3;
                userContextData = cognitoIdentityProviderClient.j2(wqeVarM54868b, c104881);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                eventDispatcher3 = r7;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                xqeVar = (xqe) userContextData;
                if (xqeVar != null) {
                }
                eventDispatcher3.send(setupTOTPEvent);
                return y3i.f54824a;
            }
            map = (Map) c104881.L$3;
            authEnvironment = (AuthEnvironment) c104881.L$2;
            EventDispatcher eventDispatcher7 = (EventDispatcher) c104881.L$1;
            setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) c104881.L$0;
            wre.m54934b(userContextData);
            eventDispatcher5 = eventDispatcher7;
        }
        DeviceMetadata.Metadata metadata = (DeviceMetadata.Metadata) userContextData;
        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null) {
            map.put("DEVICE_KEY", deviceKey);
        }
        String username2 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12.$eventType$inlined.getUsername();
        c104881.L$0 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
        c104881.L$1 = eventDispatcher5;
        c104881.L$2 = authEnvironment;
        c104881.L$3 = map;
        c104881.label = 2;
        userContextData = authEnvironment.getUserContextData(username2, c104881);
        r7 = eventDispatcher5;
        if (userContextData == objM51918f) {
            return objM51918f;
        }
        String str2 = (String) userContextData;
        String pinpointEndpointId2 = authEnvironment.getPinpointEndpointId();
        cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
        }
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
