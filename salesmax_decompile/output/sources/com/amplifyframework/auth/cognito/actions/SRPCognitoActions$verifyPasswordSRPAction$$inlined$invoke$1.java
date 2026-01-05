package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.cg2;
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

/* loaded from: classes5.dex */
public final class SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ Map $challengeParameters$inlined;
    final /* synthetic */ Map $metadata$inlined;
    final /* synthetic */ String $session$inlined;
    final /* synthetic */ SignInMethod $signInMethod$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1", m36648f = "SRPCognitoActions.kt", m36649l = {Opcodes.DUP2_X2, Opcodes.FADD, 126}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1$1 */
    public static final class C104821 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C104821(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1(String str, Map map, SignInMethod signInMethod, Map map2, String str2) {
        this.$challengeParameters$inlined = map;
        this.$signInMethod$inlined = signInMethod;
        this.$metadata$inlined = map2;
        this.$session$inlined = str2;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(4:13|85|87|88)(2:14|15))(9:16|101|17|18|89|58|59|105|(3:64|87|88)(2:65|66)))(4:22|103|23|24))(14:28|93|29|(3:91|31|32)(1:35)|36|37|95|38|(1:40)|41|42|97|43|(1:45)(1:46))|99|47|(5:49|(1:51)|(1:53)|54|(1:56)(6:57|89|58|59|105|(0)(0)))(3:62|105|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0265, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0266, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229 A[Catch: Exception -> 0x0261, TRY_ENTER, TryCatch #8 {Exception -> 0x0261, blocks: (B:64:0x0229, B:65:0x024f, B:66:0x0260), top: B:105:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f A[Catch: Exception -> 0x0261, TryCatch #8 {Exception -> 0x0261, blocks: (B:64:0x0229, B:65:0x024f, B:66:0x0260), top: B:105:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c3  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException {
        C104821 c104821;
        String id;
        AuthEnvironment authEnvironment;
        String str;
        EventDispatcher eventDispatcher2;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String poolId;
        String secretHash;
        hwc[] hwcVarArr;
        Map mapM32685l;
        Object userContextData;
        String str7;
        EventDispatcher eventDispatcher3;
        Map map;
        String str8;
        String str9;
        EventDispatcher eventDispatcher4;
        xqe xqeVar;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
        String str10;
        StateMachineEvent authenticationEvent;
        Map mapM32696w;
        AuthEnvironment authEnvironment2;
        EventDispatcher eventDispatcher5;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13;
        String str11;
        if (n64Var instanceof C104821) {
            c104821 = (C104821) n64Var;
            int i = c104821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104821.label = i - Integer.MIN_VALUE;
            } else {
                c104821 = new C104821(n64Var);
            }
        }
        Object objJ2 = c104821.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104821.label;
        if (i2 == 0) {
            wre.m54934b(objJ2);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                str2 = (String) isa.m32682i(this.$challengeParameters$inlined, "SALT");
                str3 = (String) isa.m32682i(this.$challengeParameters$inlined, "SECRET_BLOCK");
                str4 = (String) isa.m32682i(this.$challengeParameters$inlined, "SRP_B");
                str5 = (String) isa.m32682i(this.$challengeParameters$inlined, "USERNAME");
                String str12 = (String) isa.m32682i(this.$challengeParameters$inlined, "USER_ID_FOR_SRP");
                str6 = (String) this.$challengeParameters$inlined.getOrDefault("DEVICE_KEY", "");
                SRPHelper srpHelper$aws_auth_cognito_release = authEnvironment.getSrpHelper$aws_auth_cognito_release();
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                if (userPool != null) {
                    try {
                        poolId = userPool.getPoolId();
                    } catch (Exception e) {
                        e = e;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                        str = " Sending event ";
                        eventDispatcher2 = eventDispatcher;
                        if (e instanceof soe) {
                        }
                    }
                } else {
                    poolId = null;
                }
                sq8.m48646e(poolId);
                srpHelper$aws_auth_cognito_release.setUserPoolParams(str12, poolId);
                secretHash = AuthHelper.Companion.getSecretHash(str5, authEnvironment.getConfiguration().getUserPool().getAppClient(), authEnvironment.getConfiguration().getUserPool().getAppClientSecret());
                hwcVarArr = new hwc[4];
                hwcVarArr[0] = vyh.m53620a("USERNAME", str5);
                hwcVarArr[1] = vyh.m53620a("PASSWORD_CLAIM_SECRET_BLOCK", str3);
                str = " Sending event ";
            } catch (Exception e2) {
                e = e2;
                str = " Sending event ";
            }
            try {
                hwcVarArr[2] = vyh.m53620a("PASSWORD_CLAIM_SIGNATURE", authEnvironment.getSrpHelper$aws_auth_cognito_release().getSignature(str2, str4, str3));
                hwcVarArr[3] = vyh.m53620a("TIMESTAMP", authEnvironment.getSrpHelper$aws_auth_cognito_release().getDateString());
                mapM32685l = isa.m32685l(hwcVarArr);
                if (secretHash != null) {
                    mapM32685l.put("SECRET_HASH", secretHash);
                }
                mapM32685l.put("DEVICE_KEY", str6);
                c104821.L$0 = this;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
                sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                if (e instanceof soe) {
                }
            }
            try {
                c104821.L$1 = eventDispatcher2;
                c104821.L$2 = id;
                c104821.L$3 = authEnvironment;
                c104821.L$4 = str5;
                c104821.L$5 = mapM32685l;
                c104821.label = 1;
                userContextData = authEnvironment.getUserContextData(str5, c104821);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                str7 = id;
                eventDispatcher3 = eventDispatcher2;
                map = mapM32685l;
                str8 = str5;
            } catch (Exception e4) {
                e = e4;
                sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                if (e instanceof soe) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mapM32696w = (Map) c104821.L$4;
                    authEnvironment2 = (AuthEnvironment) c104821.L$3;
                    str11 = (String) c104821.L$2;
                    eventDispatcher5 = (EventDispatcher) c104821.L$1;
                    sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) c104821.L$0;
                    wre.m54934b(objJ2);
                    str = " Sending event ";
                    authenticationEvent = new SRPEvent(new SRPEvent.EventType.RetryRespondPasswordVerifier(mapM32696w, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$metadata$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$session$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$signInMethod$inlined), null, 2, null);
                    str7 = str11;
                    eventDispatcher4 = eventDispatcher5;
                    str10 = str;
                    authEnvironment = authEnvironment2;
                    authEnvironment.getLogger().verbose(str7 + str10 + authenticationEvent.getType());
                    eventDispatcher4.send(authenticationEvent);
                    return y3i.f54824a;
                }
                str8 = (String) c104821.L$4;
                authEnvironment = (AuthEnvironment) c104821.L$3;
                str7 = (String) c104821.L$2;
                eventDispatcher4 = (EventDispatcher) c104821.L$1;
                sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) c104821.L$0;
                try {
                    wre.m54934b(objJ2);
                    str = " Sending event ";
                    try {
                        xqeVar = (xqe) objJ2;
                        str9 = str8;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                    } catch (Exception e5) {
                        e = e5;
                        id = str7;
                        eventDispatcher2 = eventDispatcher4;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                        if (e instanceof soe) {
                            SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowPasswordVerifierError(e), null, 2, null);
                            Logger logger = authEnvironment.getLogger();
                            String type2 = sRPEvent.getType();
                            StringBuilder sb = new StringBuilder();
                            sb.append(id);
                            str10 = str;
                            sb.append(str10);
                            sb.append(type2);
                            logger.verbose(sb.toString());
                            eventDispatcher2.send(sRPEvent);
                            SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                            authEnvironment.getLogger().verbose(id + str10 + sRPEvent.getType());
                            eventDispatcher2.send(signInEvent);
                            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                            str7 = id;
                            eventDispatcher4 = eventDispatcher2;
                            authEnvironment.getLogger().verbose(str7 + str10 + authenticationEvent.getType());
                            eventDispatcher4.send(authenticationEvent);
                            return y3i.f54824a;
                        }
                        mapM32696w = isa.m32696w(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$challengeParameters$inlined);
                        mapM32696w.remove("DEVICE_KEY");
                        StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                        CredentialType.Device device = new CredentialType.Device((String) isa.m32682i(mapM32696w, "USERNAME"));
                        c104821.L$0 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
                        c104821.L$1 = eventDispatcher2;
                        c104821.L$2 = id;
                        c104821.L$3 = authEnvironment;
                        c104821.L$4 = mapM32696w;
                        c104821.L$5 = null;
                        c104821.label = 3;
                        if (credentialStoreClient.clearCredentials(device, c104821) == objM51918f) {
                            return objM51918f;
                        }
                        authEnvironment2 = authEnvironment;
                        eventDispatcher5 = eventDispatcher2;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
                        str11 = id;
                        authenticationEvent = new SRPEvent(new SRPEvent.EventType.RetryRespondPasswordVerifier(mapM32696w, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$metadata$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$session$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$signInMethod$inlined), null, 2, null);
                        str7 = str11;
                        eventDispatcher4 = eventDispatcher5;
                        str10 = str;
                        authEnvironment = authEnvironment2;
                        authEnvironment.getLogger().verbose(str7 + str10 + authenticationEvent.getType());
                        eventDispatcher4.send(authenticationEvent);
                        return y3i.f54824a;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str = " Sending event ";
                    id = str7;
                    eventDispatcher2 = eventDispatcher4;
                    sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                    if (e instanceof soe) {
                    }
                }
                try {
                } catch (Exception e7) {
                    e = e7;
                    id = str7;
                    eventDispatcher2 = eventDispatcher4;
                    if (e instanceof soe) {
                    }
                }
                if (xqeVar == null) {
                    throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                }
                authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(str9, xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$signInMethod$inlined);
                str10 = str;
                authEnvironment.getLogger().verbose(str7 + str10 + authenticationEvent.getType());
                eventDispatcher4.send(authenticationEvent);
                return y3i.f54824a;
            }
            Map map2 = (Map) c104821.L$5;
            String str13 = (String) c104821.L$4;
            AuthEnvironment authEnvironment3 = (AuthEnvironment) c104821.L$3;
            String str14 = (String) c104821.L$2;
            eventDispatcher3 = (EventDispatcher) c104821.L$1;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) c104821.L$0;
            try {
                wre.m54934b(objJ2);
                userContextData = objJ2;
                str = " Sending event ";
                map = map2;
                str8 = str13;
                authEnvironment = authEnvironment3;
                str7 = str14;
            } catch (Exception e8) {
                e = e8;
                str = " Sending event ";
                authEnvironment = authEnvironment3;
                id = str14;
                eventDispatcher2 = eventDispatcher3;
                if (e instanceof soe) {
                }
            }
        }
        String str15 = (String) userContextData;
        String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
        kg3 cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
            wqe.C17950a c17950a = new wqe.C17950a();
            c17950a.m54876j(cg2.C12666k.f18072c);
            c17950a.m54878l(authEnvironment.getConfiguration().getUserPool().getAppClient());
            c17950a.m54877k(map);
            c17950a.m54879m(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$metadata$inlined);
            c17950a.m54880n(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$session$inlined);
            if (pinpointEndpointId != null) {
                c17950a.m54867a(new SRPCognitoActions$verifyPasswordSRPAction$1$evt$response$1$1$1(pinpointEndpointId));
            }
            if (str15 != null) {
                c17950a.m54881o(new SRPCognitoActions$verifyPasswordSRPAction$1$evt$response$1$2$1(str15));
            }
            wqe wqeVarM54868b = c17950a.m54868b();
            c104821.L$0 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            c104821.L$1 = eventDispatcher3;
            c104821.L$2 = str7;
            c104821.L$3 = authEnvironment;
            c104821.L$4 = str8;
            c104821.L$5 = null;
            c104821.label = 2;
            objJ2 = cognitoIdentityProviderClient.j2(wqeVarM54868b, c104821);
            if (objJ2 == objM51918f) {
                return objM51918f;
            }
            eventDispatcher4 = eventDispatcher3;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            xqeVar = (xqe) objJ2;
            str9 = str8;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
            if (xqeVar == null) {
            }
        } else {
            str9 = str8;
            eventDispatcher4 = eventDispatcher3;
            xqeVar = null;
            if (xqeVar == null) {
            }
        }
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
