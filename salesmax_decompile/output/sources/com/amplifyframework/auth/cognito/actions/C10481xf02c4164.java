package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthFlowTypeHelperKt;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
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
import p001o.wre;
import p001o.xi8;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10481xf02c4164 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRPWithCustom $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1", m36648f = "SRPCognitoActions.kt", m36649l = {Opcodes.BASTORE, Opcodes.CASTORE, Opcodes.DUP_X1}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return C10481xf02c4164.this.execute(null, null, this);
        }
    }

    public C10481xf02c4164(String str, SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom) {
        this.$event$inlined = initiateSRPWithCustom;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182 A[Catch: Exception -> 0x0266, TryCatch #4 {Exception -> 0x0266, blocks: (B:52:0x017e, B:54:0x0182, B:55:0x0189, B:57:0x0197, B:59:0x01af, B:61:0x01b5, B:63:0x01c6, B:65:0x01d0, B:66:0x01d8), top: B:111:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197 A[Catch: Exception -> 0x0266, TryCatch #4 {Exception -> 0x0266, blocks: (B:52:0x017e, B:54:0x0182, B:55:0x0189, B:57:0x0197, B:59:0x01af, B:61:0x01b5, B:63:0x01c6, B:65:0x01d0, B:66:0x01d8), top: B:111:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c A[Catch: Exception -> 0x0204, TryCatch #5 {Exception -> 0x0204, blocks: (B:70:0x01fb, B:75:0x020c, B:77:0x0212, B:79:0x021a, B:82:0x0222, B:84:0x0228, B:88:0x0234, B:89:0x024c, B:90:0x025d, B:91:0x025e, B:92:0x0265), top: B:113:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a A[Catch: Exception -> 0x0204, TryCatch #5 {Exception -> 0x0204, blocks: (B:70:0x01fb, B:75:0x020c, B:77:0x0212, B:79:0x021a, B:82:0x0222, B:84:0x0228, B:88:0x0234, B:89:0x024c, B:90:0x025d, B:91:0x025e, B:92:0x0265), top: B:113:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e A[Catch: Exception -> 0x0204, TryCatch #5 {Exception -> 0x0204, blocks: (B:70:0x01fb, B:75:0x020c, B:77:0x0212, B:79:0x021a, B:82:0x0222, B:84:0x0228, B:88:0x0234, B:89:0x024c, B:90:0x025d, B:91:0x025e, B:92:0x0265), top: B:113:0x01fb }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws Exception {
        AnonymousClass1 anonymousClass1;
        EventDispatcher eventDispatcher2;
        String str;
        AuthEnvironment authEnvironment;
        Map mapM32685l;
        String username;
        C10481xf02c4164 c10481xf02c4164;
        Map map;
        String str2;
        Object deviceMetadata;
        Map map2;
        String str3;
        String str4;
        AuthEnvironment authEnvironment2;
        DeviceMetadata.Metadata metadata;
        kg3 cognitoIdentityProviderClient;
        xi8 xi8Var;
        C10481xf02c4164 c10481xf02c41642;
        DeviceMetadata.Metadata metadata2;
        StateMachineEvent authenticationEvent;
        String deviceKey;
        Map mapM32688o;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object obj = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment3 = (AuthEnvironment) environment;
            authEnvironment3.getLogger().verbose(id + " Starting execution");
            try {
                authEnvironment3.setSrpHelper$aws_auth_cognito_release(new SRPHelper(this.$event$inlined.getPassword()));
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username2 = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment3.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment3.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username2, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", this.$event$inlined.getUsername()), vyh.m53620a("SRP_A", authEnvironment3.getSrpHelper$aws_auth_cognito_release().getPublicA()), vyh.m53620a("CHALLENGE_NAME", "SRP_A"));
                if (secretHash != null) {
                    mapM32685l.put("SECRET_HASH", secretHash);
                }
                username = this.$event$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            }
            try {
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = id;
                anonymousClass1.L$3 = authEnvironment3;
                anonymousClass1.L$4 = mapM32685l;
                anonymousClass1.label = 1;
                Object userContextData = authEnvironment3.getUserContextData(username, anonymousClass1);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                c10481xf02c4164 = this;
                obj = userContextData;
                map = mapM32685l;
                authEnvironment = authEnvironment3;
                str2 = id;
                String str5 = (String) obj;
                String username3 = c10481xf02c4164.$event$inlined.getUsername();
                anonymousClass1.L$0 = c10481xf02c4164;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.L$4 = map;
                anonymousClass1.L$5 = str5;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment.getDeviceMetadata(username3, anonymousClass1);
                if (deviceMetadata != objM51918f) {
                }
            } catch (Exception e2) {
                e = e2;
                str = id;
                authEnvironment = authEnvironment3;
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent.getType());
                eventDispatcher2.send(sRPEvent);
                SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent.getType());
                eventDispatcher2.send(signInEvent);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                return y3i.f54824a;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                str3 = (String) anonymousClass1.L$5;
                map2 = (Map) anonymousClass1.L$4;
                authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                String str6 = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                C10481xf02c4164 c10481xf02c41643 = (C10481xf02c4164) anonymousClass1.L$0;
                try {
                    wre.m54934b(obj);
                    str4 = str6;
                    eventDispatcher2 = eventDispatcher3;
                    c10481xf02c4164 = c10481xf02c41643;
                    try {
                        metadata = (DeviceMetadata.Metadata) obj;
                        if (metadata != null) {
                            map2.put("DEVICE_KEY", metadata.getDeviceKey());
                        }
                        String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                        cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient == null) {
                            wi8.C17918a c17918a = new wi8.C17918a();
                            c17918a.m54591j(AuthFlowTypeHelperKt.toCognitoType(AuthFlowType.CUSTOM_AUTH));
                            UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                            c17918a.m54593l(userPool3 != null ? userPool3.getAppClient() : null);
                            c17918a.m54592k(map2);
                            c17918a.m54594m(c10481xf02c4164.$event$inlined.getMetadata());
                            if (pinpointEndpointId != null) {
                                c17918a.m54582a(new C10485x395c18fb(pinpointEndpointId));
                            }
                            if (str3 != null) {
                                c17918a.m54596o(new C10486x395c1cbc(str3));
                            }
                            wi8 wi8VarM54583b = c17918a.m54583b();
                            anonymousClass1.L$0 = c10481xf02c4164;
                            anonymousClass1.L$1 = eventDispatcher2;
                            anonymousClass1.L$2 = str4;
                            anonymousClass1.L$3 = authEnvironment2;
                            anonymousClass1.L$4 = metadata;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 3;
                            Object objI0 = cognitoIdentityProviderClient.i0(wi8VarM54583b, anonymousClass1);
                            if (objI0 == objM51918f) {
                                return objM51918f;
                            }
                            authEnvironment = authEnvironment2;
                            c10481xf02c41642 = c10481xf02c4164;
                            str = str4;
                            obj = objI0;
                            metadata2 = metadata;
                            xi8 xi8Var2 = (xi8) obj;
                            c10481xf02c4164 = c10481xf02c41642;
                            metadata = metadata2;
                            xi8Var = xi8Var2;
                            if (!sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12666k.f18072c)) {
                            }
                        } else {
                            authEnvironment = authEnvironment2;
                            str = str4;
                            xi8Var = null;
                            if (!sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12666k.f18072c)) {
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        authEnvironment = authEnvironment2;
                        str = str4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    authEnvironment = authEnvironment2;
                    str = str6;
                    eventDispatcher2 = eventDispatcher3;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                metadata2 = (DeviceMetadata.Metadata) anonymousClass1.L$4;
                authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                c10481xf02c41642 = (C10481xf02c4164) anonymousClass1.L$0;
                try {
                    wre.m54934b(obj);
                    eventDispatcher2 = eventDispatcher4;
                    try {
                        xi8 xi8Var22 = (xi8) obj;
                        c10481xf02c4164 = c10481xf02c41642;
                        metadata = metadata2;
                        xi8Var = xi8Var22;
                        if (!sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12666k.f18072c)) {
                            throw new Exception("Not yet implemented.");
                        }
                        Map mapM56337d = xi8Var.m56337d();
                        if (mapM56337d == null) {
                            throw new ServiceException("Auth challenge parameters are empty.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                        }
                        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null && (mapM32688o = isa.m32688o(mapM56337d, vyh.m53620a("DEVICE_KEY", deviceKey))) != null) {
                            mapM56337d = mapM32688o;
                        }
                        authenticationEvent = new SRPEvent(new SRPEvent.EventType.RespondPasswordVerifier(mapM56337d, c10481xf02c4164.$event$inlined.getMetadata(), xi8Var.m56338e()), null, 2, null);
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    eventDispatcher2 = eventDispatcher4;
                }
            }
            SRPEvent sRPEvent2 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
            authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2.getType());
            eventDispatcher2.send(sRPEvent2);
            SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2.getType());
            eventDispatcher2.send(signInEvent2);
            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
        } else {
            map = (Map) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str2 = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            c10481xf02c4164 = (C10481xf02c4164) anonymousClass1.L$0;
            try {
                wre.m54934b(obj);
                String str52 = (String) obj;
                String username32 = c10481xf02c4164.$event$inlined.getUsername();
                anonymousClass1.L$0 = c10481xf02c4164;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.L$4 = map;
                anonymousClass1.L$5 = str52;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment.getDeviceMetadata(username32, anonymousClass1);
                if (deviceMetadata != objM51918f) {
                    return objM51918f;
                }
                AuthEnvironment authEnvironment4 = authEnvironment;
                map2 = map;
                str3 = str52;
                obj = deviceMetadata;
                str4 = str2;
                authEnvironment2 = authEnvironment4;
                metadata = (DeviceMetadata.Metadata) obj;
                if (metadata != null) {
                }
                String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                }
            } catch (Exception e7) {
                e = e7;
                str = str2;
            }
        }
        authEnvironment.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
