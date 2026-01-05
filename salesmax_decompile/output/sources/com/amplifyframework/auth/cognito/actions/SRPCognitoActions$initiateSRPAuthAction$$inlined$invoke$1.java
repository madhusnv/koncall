package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthFlowTypeHelperKt;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.cg2;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.vyh;
import p001o.wi8;
import p001o.wqe;
import p001o.wre;
import p001o.xi8;
import p001o.xqe;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRP $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1", m36648f = "SRPCognitoActions.kt", m36649l = {80, Opcodes.FASTORE, Opcodes.DUP_X1, 100, 122, Opcodes.LXOR}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1$1 */
    public static final class C104801 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C104801(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1(String str, SRPEvent.EventType.InitiateSRP initiateSRP) {
        this.$event$inlined = initiateSRP;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00f4: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:245), block:B:35:0x00f3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0270: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:625), block:B:83:0x0270 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c7 A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d2 A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dd A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5 A[Catch: Exception -> 0x03f7, TRY_ENTER, TryCatch #4 {Exception -> 0x03f7, blocks: (B:58:0x01c9, B:60:0x01cd, B:61:0x01d6, B:63:0x01e2, B:66:0x01ea, B:68:0x01ff, B:70:0x020e, B:72:0x0216, B:74:0x0239, B:76:0x0243, B:77:0x024b, B:114:0x02f5, B:116:0x02ff, B:117:0x0306, B:119:0x0310, B:121:0x032c, B:123:0x0332, B:125:0x0343, B:127:0x034d, B:128:0x0355), top: B:176:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0386 A[Catch: Exception -> 0x026f, TryCatch #0 {Exception -> 0x026f, blocks: (B:132:0x0371, B:134:0x037c, B:136:0x0386, B:138:0x038c, B:141:0x0396, B:143:0x039c, B:145:0x03a4, B:81:0x0267, B:85:0x0276, B:87:0x0280, B:89:0x0286, B:92:0x0290, B:94:0x0296, B:96:0x029e), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cd A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d8 A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e3 A[Catch: Exception -> 0x02f2, TryCatch #7 {Exception -> 0x02f2, blocks: (B:149:0x03c5, B:151:0x03cd, B:154:0x03d8, B:157:0x03e3, B:159:0x03ec, B:100:0x02bf, B:102:0x02c7, B:105:0x02d2, B:108:0x02dd, B:110:0x02e6), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd A[Catch: Exception -> 0x03f7, TryCatch #4 {Exception -> 0x03f7, blocks: (B:58:0x01c9, B:60:0x01cd, B:61:0x01d6, B:63:0x01e2, B:66:0x01ea, B:68:0x01ff, B:70:0x020e, B:72:0x0216, B:74:0x0239, B:76:0x0243, B:77:0x024b, B:114:0x02f5, B:116:0x02ff, B:117:0x0306, B:119:0x0310, B:121:0x032c, B:123:0x0332, B:125:0x0343, B:127:0x034d, B:128:0x0355), top: B:176:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2 A[Catch: Exception -> 0x03f7, TryCatch #4 {Exception -> 0x03f7, blocks: (B:58:0x01c9, B:60:0x01cd, B:61:0x01d6, B:63:0x01e2, B:66:0x01ea, B:68:0x01ff, B:70:0x020e, B:72:0x0216, B:74:0x0239, B:76:0x0243, B:77:0x024b, B:114:0x02f5, B:116:0x02ff, B:117:0x0306, B:119:0x0310, B:121:0x032c, B:123:0x0332, B:125:0x0343, B:127:0x034d, B:128:0x0355), top: B:176:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea A[Catch: Exception -> 0x03f7, TryCatch #4 {Exception -> 0x03f7, blocks: (B:58:0x01c9, B:60:0x01cd, B:61:0x01d6, B:63:0x01e2, B:66:0x01ea, B:68:0x01ff, B:70:0x020e, B:72:0x0216, B:74:0x0239, B:76:0x0243, B:77:0x024b, B:114:0x02f5, B:116:0x02ff, B:117:0x0306, B:119:0x0310, B:121:0x032c, B:123:0x0332, B:125:0x0343, B:127:0x034d, B:128:0x0355), top: B:176:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0280 A[Catch: Exception -> 0x026f, TryCatch #0 {Exception -> 0x026f, blocks: (B:132:0x0371, B:134:0x037c, B:136:0x0386, B:138:0x038c, B:141:0x0396, B:143:0x039c, B:145:0x03a4, B:81:0x0267, B:85:0x0276, B:87:0x0280, B:89:0x0286, B:92:0x0290, B:94:0x0296, B:96:0x029e), top: B:171:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b9  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104801 c104801;
        Object obj;
        EventDispatcher eventDispatcher2;
        Object obj2;
        StateMachineEvent authenticationEvent;
        EventDispatcher eventDispatcher3;
        String str;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher4;
        Map mapM32685l;
        String username;
        Object userContextData;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
        Map map;
        String str2;
        AuthEnvironment authEnvironment2;
        EventDispatcher eventDispatcher5;
        String str3;
        Object deviceMetadata;
        Map map2;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
        String str4;
        AuthEnvironment authEnvironment3;
        EventDispatcher eventDispatcher6;
        DeviceMetadata.Metadata metadata;
        String pinpointEndpointId;
        AuthChallenge respondToAuthChallenge;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
        String str5;
        xi8 xi8Var;
        String str6;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14;
        String str7;
        xqe xqeVar;
        String str8;
        EventDispatcher eventDispatcher7;
        Object deviceMetadata2;
        AuthEnvironment authEnvironment4;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15;
        Map mapM56663c;
        Map mapM56663c2;
        EventDispatcher eventDispatcher8;
        EventDispatcher eventDispatcher9;
        String str9;
        EventDispatcher eventDispatcher10;
        Object deviceMetadata3;
        AuthEnvironment authEnvironment5;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$16;
        Map mapM56337d;
        Map mapM56337d2;
        EventDispatcher eventDispatcher11;
        EventDispatcher eventDispatcher12;
        String str10;
        if (n64Var instanceof C104801) {
            c104801 = (C104801) n64Var;
            int i = c104801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104801.label = i - Integer.MIN_VALUE;
            } else {
                c104801 = new C104801(n64Var);
            }
        }
        Object objI0 = c104801.result;
        AuthEnvironment authEnvironmentM51918f = uq8.m51918f();
        String id = c104801.label;
        try {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        authEnvironmentM51918f = obj2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    eventDispatcher2 = "USER_ID_FOR_SRP";
                }
            } catch (Exception e3) {
                e = e3;
                authEnvironmentM51918f = id;
                id = obj;
            }
        } catch (Exception e4) {
            e = e4;
        }
        switch (id) {
            case 0:
                wre.m54934b(objI0);
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                id = getId();
                AuthEnvironment authEnvironment6 = (AuthEnvironment) environment;
                authEnvironment6.getLogger().verbose(((String) id) + " Starting execution");
                try {
                    authEnvironment6.setSrpHelper$aws_auth_cognito_release(new SRPHelper(this.$event$inlined.getPassword()));
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    String username2 = this.$event$inlined.getUsername();
                    UserPoolConfiguration userPool = authEnvironment6.getConfiguration().getUserPool();
                    String appClient = userPool != null ? userPool.getAppClient() : null;
                    UserPoolConfiguration userPool2 = authEnvironment6.getConfiguration().getUserPool();
                    String secretHash = companion.getSecretHash(username2, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                    mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", this.$event$inlined.getUsername()), vyh.m53620a("SRP_A", authEnvironment6.getSrpHelper$aws_auth_cognito_release().getPublicA()));
                    if (secretHash != null) {
                        mapM32685l.put("SECRET_HASH", secretHash);
                    }
                    username = this.$event$inlined.getUsername();
                    c104801.L$0 = this;
                    eventDispatcher4 = eventDispatcher;
                } catch (Exception e5) {
                    e = e5;
                    eventDispatcher4 = eventDispatcher;
                }
                try {
                    c104801.L$1 = eventDispatcher4;
                    c104801.L$2 = id;
                    c104801.L$3 = authEnvironment6;
                    c104801.L$4 = mapM32685l;
                    c104801.label = 1;
                    userContextData = authEnvironment6.getUserContextData(username, c104801);
                } catch (Exception e6) {
                    e = e6;
                    authEnvironmentM51918f = authEnvironment6;
                    eventDispatcher2 = eventDispatcher4;
                    SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironmentM51918f.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                    eventDispatcher2.send(sRPEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment = authEnvironmentM51918f;
                    str = id;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
                if (userContextData == authEnvironmentM51918f) {
                    return authEnvironmentM51918f;
                }
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 = this;
                objI0 = userContextData;
                map = mapM32685l;
                str2 = id;
                authEnvironment2 = authEnvironment6;
                eventDispatcher5 = eventDispatcher4;
                str3 = (String) objI0;
                String username3 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
                c104801.L$1 = eventDispatcher5;
                c104801.L$2 = str2;
                c104801.L$3 = authEnvironment2;
                c104801.L$4 = map;
                c104801.L$5 = str3;
                c104801.label = 2;
                deviceMetadata = authEnvironment2.getDeviceMetadata(username3, c104801);
                if (deviceMetadata != authEnvironmentM51918f) {
                    return authEnvironmentM51918f;
                }
                AuthEnvironment authEnvironment7 = authEnvironment2;
                map2 = map;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
                str4 = str2;
                authEnvironment3 = authEnvironment7;
                eventDispatcher6 = eventDispatcher5;
                try {
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                        map2.put("DEVICE_KEY", metadata.getDeviceKey());
                    }
                    pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                    respondToAuthChallenge = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getRespondToAuthChallenge();
                } catch (Exception e7) {
                    e = e7;
                    authEnvironmentM51918f = authEnvironment3;
                    id = str4;
                    eventDispatcher2 = eventDispatcher6;
                    SRPEvent sRPEvent2 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironmentM51918f.getLogger().verbose(id + " Sending event " + sRPEvent2.getType());
                    eventDispatcher2.send(sRPEvent2);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment = authEnvironmentM51918f;
                    str = id;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
                if ((respondToAuthChallenge == null ? respondToAuthChallenge.getSession() : null) == null) {
                    map2.put("ANSWER", cg2.C12665j.f18070c.mo21138a());
                    kg3 cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                        str7 = str4;
                        xqeVar = null;
                        eventDispatcher7 = eventDispatcher6;
                        if (xqeVar == null) {
                            if (xqeVar != null) {
                                String activeUsername = AuthHelper.Companion.getActiveUsername(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14.$event$inlined.getUsername(), (xqeVar == null || (mapM56663c2 = xqeVar.m56663c()) == null) ? null : (String) mapM56663c2.get("USERNAME"), (xqeVar != null || (mapM56663c = xqeVar.m56663c()) == null) ? null : (String) mapM56663c.get("USER_ID_FOR_SRP"));
                                c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14;
                                c104801.L$1 = eventDispatcher7;
                                c104801.L$2 = str7;
                                c104801.L$3 = authEnvironment3;
                                c104801.L$4 = xqeVar;
                                c104801.L$5 = null;
                                c104801.label = 4;
                                deviceMetadata2 = authEnvironment3.getDeviceMetadata(activeUsername, c104801);
                                if (deviceMetadata2 != authEnvironmentM51918f) {
                                }
                            }
                        }
                        authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                        eventDispatcher3.send(authenticationEvent);
                        return y3i.f54824a;
                    }
                    wqe.C17950a c17950a = new wqe.C17950a();
                    UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                    c17950a.m54878l(userPool3 != null ? userPool3.getAppClient() : null);
                    c17950a.m54876j(cg2.C12668m.f18075c);
                    c17950a.m54877k(map2);
                    c17950a.m54880n(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getRespondToAuthChallenge().getSession());
                    c17950a.m54879m(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getMetadata());
                    if (pinpointEndpointId != null) {
                        c17950a.m54867a(new SRPCognitoActions$initiateSRPAuthAction$1$evt$response$1$1$1(pinpointEndpointId));
                    }
                    if (str3 != null) {
                        c17950a.m54881o(new SRPCognitoActions$initiateSRPAuthAction$1$evt$response$1$2$1(str3));
                    }
                    wqe wqeVarM54868b = c17950a.m54868b();
                    c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                    c104801.L$1 = eventDispatcher6;
                    c104801.L$2 = str4;
                    c104801.L$3 = authEnvironment3;
                    c104801.L$4 = null;
                    c104801.L$5 = null;
                    c104801.label = 3;
                    objI0 = cognitoIdentityProviderClient.j2(wqeVarM54868b, c104801);
                    if (objI0 == authEnvironmentM51918f) {
                        return authEnvironmentM51918f;
                    }
                    str8 = str4;
                    eventDispatcher8 = eventDispatcher6;
                    xqe xqeVar2 = (xqe) objI0;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                    xqeVar = xqeVar2;
                    str7 = str8;
                    eventDispatcher7 = eventDispatcher8;
                    String activeUsername2 = AuthHelper.Companion.getActiveUsername(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14.$event$inlined.getUsername(), (xqeVar == null || (mapM56663c2 = xqeVar.m56663c()) == null) ? null : (String) mapM56663c2.get("USERNAME"), (xqeVar != null || (mapM56663c = xqeVar.m56663c()) == null) ? null : (String) mapM56663c.get("USER_ID_FOR_SRP"));
                    c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14;
                    c104801.L$1 = eventDispatcher7;
                    c104801.L$2 = str7;
                    c104801.L$3 = authEnvironment3;
                    c104801.L$4 = xqeVar;
                    c104801.L$5 = null;
                    c104801.label = 4;
                    deviceMetadata2 = authEnvironment3.getDeviceMetadata(activeUsername2, c104801);
                    if (deviceMetadata2 != authEnvironmentM51918f) {
                        return authEnvironmentM51918f;
                    }
                    authEnvironment4 = authEnvironment3;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14;
                    objI0 = deviceMetadata2;
                    str9 = str7;
                    eventDispatcher9 = eventDispatcher7;
                    authenticationEvent = SRPCognitoActions.INSTANCE.parseResponseChallenge(xqeVar == null ? xqeVar.m56662b() : null, xqeVar == null ? xqeVar.m56663c() : null, xqeVar == null ? xqeVar.m56664d() : null, (DeviceMetadata.Metadata) objI0, sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15.$event$inlined.getMetadata());
                    authEnvironment = authEnvironment4;
                    str = str9;
                    eventDispatcher3 = eventDispatcher9;
                    authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
                if (sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getAuthFlowType() == AuthFlowType.USER_AUTH) {
                    map2.put("PREFERRED_CHALLENGE", "PASSWORD_SRP");
                }
                kg3 cognitoIdentityProviderClient2 = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient2 == null) {
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                    str5 = str4;
                    xi8Var = null;
                    eventDispatcher10 = eventDispatcher6;
                    if (xi8Var == null) {
                        if (xi8Var != null) {
                            String activeUsername3 = AuthHelper.Companion.getActiveUsername(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13.$event$inlined.getUsername(), (xi8Var == null || (mapM56337d2 = xi8Var.m56337d()) == null) ? null : (String) mapM56337d2.get("USERNAME"), (xi8Var != null || (mapM56337d = xi8Var.m56337d()) == null) ? null : (String) mapM56337d.get("USER_ID_FOR_SRP"));
                            c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
                            c104801.L$1 = eventDispatcher10;
                            c104801.L$2 = str5;
                            c104801.L$3 = authEnvironment3;
                            c104801.L$4 = xi8Var;
                            c104801.L$5 = null;
                            c104801.label = 6;
                            deviceMetadata3 = authEnvironment3.getDeviceMetadata(activeUsername3, c104801);
                            if (deviceMetadata3 != authEnvironmentM51918f) {
                            }
                        }
                    }
                    authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
                wi8.C17918a c17918a = new wi8.C17918a();
                c17918a.m54591j(AuthFlowTypeHelperKt.toCognitoType(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getAuthFlowType()));
                UserPoolConfiguration userPool4 = authEnvironment3.getConfiguration().getUserPool();
                c17918a.m54593l(userPool4 != null ? userPool4.getAppClient() : null);
                c17918a.m54592k(map2);
                c17918a.m54594m(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getMetadata());
                if (pinpointEndpointId != null) {
                    c17918a.m54582a(new C10483xe9faa412(pinpointEndpointId));
                }
                if (str3 != null) {
                    c17918a.m54596o(new C10484xe9faa7d3(str3));
                }
                wi8 wi8VarM54583b = c17918a.m54583b();
                c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                c104801.L$1 = eventDispatcher6;
                c104801.L$2 = str4;
                c104801.L$3 = authEnvironment3;
                c104801.L$4 = null;
                c104801.L$5 = null;
                c104801.label = 5;
                objI0 = cognitoIdentityProviderClient2.i0(wi8VarM54583b, c104801);
                if (objI0 == authEnvironmentM51918f) {
                    return authEnvironmentM51918f;
                }
                str6 = str4;
                eventDispatcher11 = eventDispatcher6;
                xi8 xi8Var2 = (xi8) objI0;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                xi8Var = xi8Var2;
                str5 = str6;
                eventDispatcher10 = eventDispatcher11;
                String activeUsername32 = AuthHelper.Companion.getActiveUsername(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13.$event$inlined.getUsername(), (xi8Var == null || (mapM56337d2 = xi8Var.m56337d()) == null) ? null : (String) mapM56337d2.get("USERNAME"), (xi8Var != null || (mapM56337d = xi8Var.m56337d()) == null) ? null : (String) mapM56337d.get("USER_ID_FOR_SRP"));
                c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
                c104801.L$1 = eventDispatcher10;
                c104801.L$2 = str5;
                c104801.L$3 = authEnvironment3;
                c104801.L$4 = xi8Var;
                c104801.L$5 = null;
                c104801.label = 6;
                deviceMetadata3 = authEnvironment3.getDeviceMetadata(activeUsername32, c104801);
                if (deviceMetadata3 != authEnvironmentM51918f) {
                    return authEnvironmentM51918f;
                }
                authEnvironment5 = authEnvironment3;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$16 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
                objI0 = deviceMetadata3;
                str10 = str5;
                eventDispatcher12 = eventDispatcher10;
                authenticationEvent = SRPCognitoActions.INSTANCE.parseResponseChallenge(xi8Var == null ? xi8Var.m56336c() : null, xi8Var == null ? xi8Var.m56337d() : null, xi8Var == null ? xi8Var.m56338e() : null, (DeviceMetadata.Metadata) objI0, sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$16.$event$inlined.getMetadata());
                authEnvironment = authEnvironment5;
                str = str10;
                eventDispatcher3 = eventDispatcher12;
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            case 1:
                map = (Map) c104801.L$4;
                authEnvironment2 = (AuthEnvironment) c104801.L$3;
                str2 = (String) c104801.L$2;
                EventDispatcher eventDispatcher13 = (EventDispatcher) c104801.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                wre.m54934b(objI0);
                eventDispatcher5 = eventDispatcher13;
                str3 = (String) objI0;
                String username32 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                c104801.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
                c104801.L$1 = eventDispatcher5;
                c104801.L$2 = str2;
                c104801.L$3 = authEnvironment2;
                c104801.L$4 = map;
                c104801.L$5 = str3;
                c104801.label = 2;
                deviceMetadata = authEnvironment2.getDeviceMetadata(username32, c104801);
                if (deviceMetadata != authEnvironmentM51918f) {
                }
                break;
            case 2:
                String str11 = (String) c104801.L$5;
                map2 = (Map) c104801.L$4;
                authEnvironment3 = (AuthEnvironment) c104801.L$3;
                String str12 = (String) c104801.L$2;
                EventDispatcher eventDispatcher14 = (EventDispatcher) c104801.L$1;
                SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$17 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                try {
                    wre.m54934b(objI0);
                    str3 = str11;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$17;
                    deviceMetadata = objI0;
                    str4 = str12;
                    eventDispatcher6 = eventDispatcher14;
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                    }
                    pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                    respondToAuthChallenge = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getRespondToAuthChallenge();
                    if ((respondToAuthChallenge == null ? respondToAuthChallenge.getSession() : null) == null) {
                    }
                } catch (Exception e8) {
                    e = e8;
                    authEnvironmentM51918f = authEnvironment3;
                    id = str12;
                    eventDispatcher2 = eventDispatcher14;
                    SRPEvent sRPEvent22 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironmentM51918f.getLogger().verbose(id + " Sending event " + sRPEvent22.getType());
                    eventDispatcher2.send(sRPEvent22);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment = authEnvironmentM51918f;
                    str = id;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
                break;
            case 3:
                AuthEnvironment authEnvironment8 = (AuthEnvironment) c104801.L$3;
                String str13 = (String) c104801.L$2;
                EventDispatcher eventDispatcher15 = (EventDispatcher) c104801.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                wre.m54934b(objI0);
                authEnvironment3 = authEnvironment8;
                str8 = str13;
                eventDispatcher8 = eventDispatcher15;
                xqe xqeVar22 = (xqe) objI0;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                xqeVar = xqeVar22;
                str7 = str8;
                eventDispatcher7 = eventDispatcher8;
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            case 4:
                xqeVar = (xqe) c104801.L$4;
                AuthEnvironment authEnvironment9 = (AuthEnvironment) c104801.L$3;
                String str14 = (String) c104801.L$2;
                EventDispatcher eventDispatcher16 = (EventDispatcher) c104801.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                wre.m54934b(objI0);
                eventDispatcher9 = eventDispatcher16;
                authEnvironment4 = authEnvironment9;
                str9 = str14;
                authenticationEvent = SRPCognitoActions.INSTANCE.parseResponseChallenge(xqeVar == null ? xqeVar.m56662b() : null, xqeVar == null ? xqeVar.m56663c() : null, xqeVar == null ? xqeVar.m56664d() : null, (DeviceMetadata.Metadata) objI0, sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15.$event$inlined.getMetadata());
                authEnvironment = authEnvironment4;
                str = str9;
                eventDispatcher3 = eventDispatcher9;
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            case 5:
                AuthEnvironment authEnvironment10 = (AuthEnvironment) c104801.L$3;
                String str15 = (String) c104801.L$2;
                EventDispatcher eventDispatcher17 = (EventDispatcher) c104801.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                wre.m54934b(objI0);
                authEnvironment3 = authEnvironment10;
                str6 = str15;
                eventDispatcher11 = eventDispatcher17;
                xi8 xi8Var22 = (xi8) objI0;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                xi8Var = xi8Var22;
                str5 = str6;
                eventDispatcher10 = eventDispatcher11;
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            case 6:
                xi8Var = (xi8) c104801.L$4;
                AuthEnvironment authEnvironment11 = (AuthEnvironment) c104801.L$3;
                String str16 = (String) c104801.L$2;
                EventDispatcher eventDispatcher18 = (EventDispatcher) c104801.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$16 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) c104801.L$0;
                wre.m54934b(objI0);
                eventDispatcher12 = eventDispatcher18;
                authEnvironment5 = authEnvironment11;
                str10 = str16;
                authenticationEvent = SRPCognitoActions.INSTANCE.parseResponseChallenge(xi8Var == null ? xi8Var.m56336c() : null, xi8Var == null ? xi8Var.m56337d() : null, xi8Var == null ? xi8Var.m56338e() : null, (DeviceMetadata.Metadata) objI0, sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$16.$event$inlined.getMetadata());
                authEnvironment = authEnvironment5;
                str = str10;
                eventDispatcher3 = eventDispatcher12;
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
