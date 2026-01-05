package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.MFAHelperKt;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.AuthChallengeKt;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.cg2;
import p001o.dh3;
import p001o.hsa;
import p001o.hwc;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.soe;
import p001o.sq8;
import p001o.uq8;
import p001o.vyh;
import p001o.wqe;
import p001o.wre;
import p001o.xqe;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10492xf83313cf implements Action {
    final /* synthetic */ String $answer$inlined;
    final /* synthetic */ List $attributes$inlined;
    final /* synthetic */ AuthChallenge $challenge$inlined;
    final /* synthetic */ Map $metadata$inlined;
    final /* synthetic */ SignInMethod $signInMethod$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1", m36648f = "SignInChallengeCognitoActions.kt", m36649l = {Opcodes.DDIV, Opcodes.FREM, Opcodes.F2L}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10492xf83313cf.this.execute(null, null, this);
        }
    }

    public C10492xf83313cf(String str, AuthChallenge authChallenge, String str2, SignInMethod signInMethod, List list, Map map) {
        this.$challenge$inlined = authChallenge;
        this.$answer$inlined = str2;
        this.$signInMethod$inlined = signInMethod;
        this.$attributes$inlined = list;
        this.$metadata$inlined = map;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(6:13|112|113|115|116|117)(2:14|15))(9:16|118|17|18|86|87|(6:124|90|(1:92)(1:93)|94|(1:96)|115)(0)|116|117))(4:22|122|23|24))(4:28|126|29|(5:31|(1:33)(1:34)|35|116|117)(15:36|(1:42)(1:41)|(1:44)|45|(1:47)|48|(2:51|49)|127|52|(1:54)(1:55)|56|(1:58)(1:59)|60|(1:62)|(2:64|(1:66)(1:67))(4:70|120|71|(7:73|(1:75)(1:76)|77|(1:79)|(1:81)|82|(1:84)(6:85|86|87|(0)(0)|116|117))(4:88|(0)(0)|116|117))))|68|69|120|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ac, code lost:
    
        r3 = r0;
        r0 = r2;
        r13 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fa A[Catch: Exception -> 0x02ab, TryCatch #1 {Exception -> 0x02ab, blocks: (B:71:0x01ec, B:73:0x01fa, B:75:0x0209, B:77:0x020f, B:79:0x022e, B:81:0x0238, B:82:0x0240), top: B:120:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0290 A[Catch: Exception -> 0x02a5, TRY_LEAVE, TryCatch #3 {Exception -> 0x02a5, blocks: (B:90:0x0265, B:94:0x026e, B:96:0x0290), top: B:124:0x0265 }] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        Exception exc;
        C10492xf83313cf c10492xf83313cf;
        AuthEnvironment authEnvironment2;
        String username;
        LinkedHashMap linkedHashMap;
        String str;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment3;
        String str2;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap2;
        kg3 cognitoIdentityProviderClient;
        EventDispatcher eventDispatcher3;
        xqe xqeVar;
        C10492xf83313cf c10492xf83313cf2;
        StateMachineEvent signInChallengeEvent;
        EventDispatcher eventDispatcher4;
        String str5;
        C10492xf83313cf c10492xf83313cf3;
        EventDispatcher eventDispatcher5 = eventDispatcher;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object objJ2 = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        String str6 = "";
        if (i2 == 0) {
            wre.m54934b(objJ2);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$challenge$inlined.getUsername();
            } catch (Exception e) {
                exc = e;
                c10492xf83313cf = this;
                authEnvironment2 = authEnvironment;
                if (!(exc instanceof soe)) {
                }
            }
            if (MFAHelperKt.isMfaSetupSelectionChallenge(this.$challenge$inlined)) {
                StateMachineEvent stateMachineEventEvaluateNextStep = SignInChallengeHelper.INSTANCE.evaluateNextStep(username == null ? "" : username, cg2.C12662g.f18064c, this.$challenge$inlined.getSession(), (80 & 8) != 0 ? null : hsa.m31056f(vyh.m53620a("MFAS_CAN_SETUP", this.$answer$inlined)), (80 & 16) != 0 ? null : null, null, (80 & 64) != 0 ? new WeakReference(null) : null, this.$signInMethod$inlined);
                authEnvironment.getLogger().verbose(id + " Sending event " + stateMachineEventEvaluateNextStep.getType());
                eventDispatcher5.send(stateMachineEventEvaluateNextStep);
                return y3i.f54824a;
            }
            linkedHashMap = new LinkedHashMap();
            if (!(username == null || username.length() == 0)) {
                linkedHashMap.put("USERNAME", username);
            }
            String challengeResponseKey = SignInChallengeCognitoActions.INSTANCE.getChallengeResponseKey(this.$challenge$inlined);
            if (challengeResponseKey != null) {
                linkedHashMap.put(challengeResponseKey, this.$answer$inlined);
            }
            List<AuthUserAttribute> list = this.$attributes$inlined;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            for (AuthUserAttribute authUserAttribute : list) {
                arrayList.add(new hwc("userAttributes." + authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue()));
                str6 = str6;
            }
            str = str6;
            isa.m32689p(linkedHashMap, arrayList);
            AuthHelper.Companion companion = AuthHelper.Companion;
            UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
            String appClient = userPool != null ? userPool.getAppClient() : null;
            UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
            String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
            if (secretHash != null) {
                linkedHashMap.put("SECRET_HASH", secretHash);
            }
            if (username == null) {
                c10492xf83313cf = this;
                eventDispatcher2 = eventDispatcher5;
                authEnvironment3 = authEnvironment;
                str2 = id;
                str3 = null;
                String pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    eventDispatcher3 = eventDispatcher2;
                    xqeVar = null;
                    if (xqeVar != null) {
                    }
                    return y3i.f54824a;
                }
                wqe.C17950a c17950a = new wqe.C17950a();
                UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                c17950a.m54878l(userPool3 != null ? userPool3.getAppClient() : null);
                c17950a.m54876j(AuthChallengeKt.getChallengeNameType(c10492xf83313cf.$challenge$inlined));
                c17950a.m54877k(linkedHashMap);
                c17950a.m54880n(c10492xf83313cf.$challenge$inlined.getSession());
                c17950a.m54879m(c10492xf83313cf.$metadata$inlined);
                if (pinpointEndpointId != null) {
                    c17950a.m54867a(new C10493xa878b76f(pinpointEndpointId));
                }
                if (str3 != null) {
                    c17950a.m54881o(new C10494xa878bb30(str3));
                }
                wqe wqeVarM54868b = c17950a.m54868b();
                anonymousClass1.L$0 = c10492xf83313cf;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = authEnvironment3;
                anonymousClass1.L$4 = username;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 2;
                objJ2 = cognitoIdentityProviderClient.j2(wqeVarM54868b, anonymousClass1);
                if (objJ2 == objM51918f) {
                    return objM51918f;
                }
                eventDispatcher3 = eventDispatcher2;
                c10492xf83313cf2 = c10492xf83313cf;
                xqeVar = (xqe) objJ2;
                c10492xf83313cf = c10492xf83313cf2;
                if (xqeVar != null) {
                }
                return y3i.f54824a;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = eventDispatcher5;
            anonymousClass1.L$2 = id;
            anonymousClass1.L$3 = authEnvironment;
            anonymousClass1.L$4 = username;
            anonymousClass1.L$5 = linkedHashMap;
            anonymousClass1.label = 1;
            Object userContextData = authEnvironment.getUserContextData(username, anonymousClass1);
            if (userContextData == objM51918f) {
                return objM51918f;
            }
            c10492xf83313cf = this;
            eventDispatcher2 = eventDispatcher5;
            str4 = username;
            linkedHashMap2 = linkedHashMap;
            objJ2 = userContextData;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                    str5 = (String) anonymousClass1.L$2;
                    eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                    c10492xf83313cf3 = (C10492xf83313cf) anonymousClass1.L$0;
                    wre.m54934b(objJ2);
                    id = str5;
                    c10492xf83313cf = c10492xf83313cf3;
                    eventDispatcher5 = eventDispatcher4;
                    str2 = id;
                    eventDispatcher3 = eventDispatcher5;
                    authEnvironment3 = authEnvironment2;
                    signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer(c10492xf83313cf.$answer$inlined, c10492xf83313cf.$metadata$inlined, c10492xf83313cf.$attributes$inlined, c10492xf83313cf.$challenge$inlined), null, 2, null);
                    authEnvironment3.getLogger().verbose(str2 + " Sending event " + signInChallengeEvent.getType());
                    eventDispatcher3.send(signInChallengeEvent);
                    return y3i.f54824a;
                }
                username = (String) anonymousClass1.L$4;
                authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                str2 = (String) anonymousClass1.L$2;
                eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                c10492xf83313cf2 = (C10492xf83313cf) anonymousClass1.L$0;
                try {
                    wre.m54934b(objJ2);
                    str = "";
                    xqeVar = (xqe) objJ2;
                    c10492xf83313cf = c10492xf83313cf2;
                } catch (Exception e2) {
                    exc = e2;
                    authEnvironment2 = authEnvironment3;
                    eventDispatcher5 = eventDispatcher3;
                    c10492xf83313cf = c10492xf83313cf2;
                    id = str2;
                    if (!(exc instanceof soe)) {
                        str2 = id;
                        eventDispatcher3 = eventDispatcher5;
                        authEnvironment3 = authEnvironment2;
                        signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.ThrowError(exc, c10492xf83313cf.$challenge$inlined, true), null, 2, null);
                        authEnvironment3.getLogger().verbose(str2 + " Sending event " + signInChallengeEvent.getType());
                        eventDispatcher3.send(signInChallengeEvent);
                        return y3i.f54824a;
                    }
                    String username2 = c10492xf83313cf.$challenge$inlined.getUsername();
                    if (username2 != null) {
                        StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
                        CredentialType.Device device = new CredentialType.Device(username2);
                        anonymousClass1.L$0 = c10492xf83313cf;
                        anonymousClass1.L$1 = eventDispatcher5;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 3;
                        if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objM51918f) {
                            return objM51918f;
                        }
                        eventDispatcher4 = eventDispatcher5;
                        str5 = id;
                        c10492xf83313cf3 = c10492xf83313cf;
                        id = str5;
                        c10492xf83313cf = c10492xf83313cf3;
                        eventDispatcher5 = eventDispatcher4;
                    }
                    str2 = id;
                    eventDispatcher3 = eventDispatcher5;
                    authEnvironment3 = authEnvironment2;
                    signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer(c10492xf83313cf.$answer$inlined, c10492xf83313cf.$metadata$inlined, c10492xf83313cf.$attributes$inlined, c10492xf83313cf.$challenge$inlined), null, 2, null);
                    authEnvironment3.getLogger().verbose(str2 + " Sending event " + signInChallengeEvent.getType());
                    eventDispatcher3.send(signInChallengeEvent);
                    return y3i.f54824a;
                }
                if (xqeVar != null) {
                    try {
                        signInChallengeEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(username == null ? str : username, xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, c10492xf83313cf.$signInMethod$inlined);
                        if (signInChallengeEvent == null) {
                            signInChallengeEvent = new CustomSignInEvent(new CustomSignInEvent.EventType.ThrowAuthError(new UnknownException("Sign in failed", null, 2, null)), null, 2, null);
                        }
                    } catch (Exception e3) {
                        exc = e3;
                        authEnvironment2 = authEnvironment3;
                        eventDispatcher5 = eventDispatcher3;
                        id = str2;
                        if (!(exc instanceof soe)) {
                        }
                    }
                    authEnvironment3.getLogger().verbose(str2 + " Sending event " + signInChallengeEvent.getType());
                    eventDispatcher3.send(signInChallengeEvent);
                }
                return y3i.f54824a;
            }
            ?? r0 = (Map) anonymousClass1.L$5;
            str4 = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            c10492xf83313cf = (C10492xf83313cf) anonymousClass1.L$0;
            try {
                wre.m54934b(objJ2);
                str = "";
                linkedHashMap2 = r0;
            } catch (Exception e4) {
                exc = e4;
                authEnvironment2 = authEnvironment;
                eventDispatcher5 = eventDispatcher2;
                if (!(exc instanceof soe)) {
                }
            }
        }
        str3 = (String) objJ2;
        linkedHashMap = linkedHashMap2;
        username = str4;
        authEnvironment3 = authEnvironment;
        str2 = id;
        String pinpointEndpointId2 = authEnvironment3.getPinpointEndpointId();
        cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
        }
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
