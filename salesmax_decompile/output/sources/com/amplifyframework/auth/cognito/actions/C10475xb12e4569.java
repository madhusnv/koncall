package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthFlowTypeHelperKt;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.lang.ref.WeakReference;
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

/* renamed from: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10475xb12e4569 implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1", m36648f = "MigrateAuthCognitoActions.kt", m36649l = {78, Opcodes.CASTORE, 110}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10475xb12e4569.this.execute(null, null, this);
        }
    }

    public C10475xb12e4569(String str, SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        this.$event$inlined = initiateMigrateAuth;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140 A[Catch: Exception -> 0x0305, TryCatch #2 {Exception -> 0x0305, blocks: (B:46:0x0132, B:48:0x0140, B:51:0x0148, B:53:0x015d, B:55:0x016c, B:57:0x0172, B:59:0x0195, B:61:0x019f, B:62:0x01a7, B:76:0x020d, B:78:0x0217, B:79:0x021c, B:81:0x0226, B:83:0x0242, B:85:0x0248, B:87:0x0259, B:89:0x0263, B:90:0x026b), top: B:128:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148 A[Catch: Exception -> 0x0305, TryCatch #2 {Exception -> 0x0305, blocks: (B:46:0x0132, B:48:0x0140, B:51:0x0148, B:53:0x015d, B:55:0x016c, B:57:0x0172, B:59:0x0195, B:61:0x019f, B:62:0x01a7, B:76:0x020d, B:78:0x0217, B:79:0x021c, B:81:0x0226, B:83:0x0242, B:85:0x0248, B:87:0x0259, B:89:0x0263, B:90:0x026b), top: B:128:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb A[Catch: Exception -> 0x01c3, TryCatch #4 {Exception -> 0x01c3, blocks: (B:94:0x0285, B:97:0x028d, B:99:0x029b, B:101:0x02a3, B:103:0x02a9, B:105:0x02b3, B:107:0x02c1, B:109:0x02d0, B:108:0x02c9, B:112:0x02f3, B:113:0x0304, B:66:0x01c0, B:71:0x01cb, B:74:0x01fc, B:75:0x020c), top: B:131:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020d A[Catch: Exception -> 0x0305, TRY_ENTER, TryCatch #2 {Exception -> 0x0305, blocks: (B:46:0x0132, B:48:0x0140, B:51:0x0148, B:53:0x015d, B:55:0x016c, B:57:0x0172, B:59:0x0195, B:61:0x019f, B:62:0x01a7, B:76:0x020d, B:78:0x0217, B:79:0x021c, B:81:0x0226, B:83:0x0242, B:85:0x0248, B:87:0x0259, B:89:0x0263, B:90:0x026b), top: B:128:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d A[Catch: Exception -> 0x01c3, TryCatch #4 {Exception -> 0x01c3, blocks: (B:94:0x0285, B:97:0x028d, B:99:0x029b, B:101:0x02a3, B:103:0x02a9, B:105:0x02b3, B:107:0x02c1, B:109:0x02d0, B:108:0x02c9, B:112:0x02f3, B:113:0x0304, B:66:0x01c0, B:71:0x01cb, B:74:0x01fc, B:75:0x020c), top: B:131:0x0030 }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException {
        AnonymousClass1 anonymousClass1;
        EventDispatcher eventDispatcher2;
        String str;
        AuthEnvironment authEnvironment;
        StateMachineEvent authenticationEvent;
        EventDispatcher eventDispatcher3;
        String str2;
        AuthEnvironment authEnvironment2;
        EventDispatcher eventDispatcher4;
        Map mapM32685l;
        String username;
        String str3;
        AuthEnvironment authEnvironment3;
        C10475xb12e4569 c10475xb12e4569;
        EventDispatcher eventDispatcher5;
        String str4;
        AuthEnvironment authEnvironment4;
        xi8 xi8Var;
        EventDispatcher eventDispatcher6;
        String str5;
        AuthEnvironment authEnvironment5;
        EventDispatcher eventDispatcher7;
        String str6;
        AuthEnvironment authEnvironment6;
        xqe xqeVar;
        EventDispatcher eventDispatcher8;
        String str7;
        AuthEnvironment authEnvironment7;
        EventDispatcher eventDispatcher9;
        AuthChallenge respondToAuthChallenge;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object objI0 = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        try {
        } catch (Exception e) {
            e = e;
            authEnvironment = objM51918f;
            str = i2;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                try {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AuthEnvironment authEnvironment8 = (AuthEnvironment) anonymousClass1.L$3;
                        String str8 = (String) anonymousClass1.L$2;
                        EventDispatcher eventDispatcher10 = (EventDispatcher) anonymousClass1.L$1;
                        c10475xb12e4569 = (C10475xb12e4569) anonymousClass1.L$0;
                        wre.m54934b(objI0);
                        eventDispatcher6 = eventDispatcher10;
                        authEnvironment5 = authEnvironment8;
                        str5 = str8;
                        xi8Var = (xi8) objI0;
                        authEnvironment4 = authEnvironment5;
                        str4 = str5;
                        eventDispatcher5 = eventDispatcher6;
                        if (xi8Var != null) {
                            AuthHelper.Companion companion = AuthHelper.Companion;
                            String username2 = c10475xb12e4569.$event$inlined.getUsername();
                            Map mapM56337d = xi8Var.m56337d();
                            String str9 = mapM56337d != null ? (String) mapM56337d.get("USERNAME") : null;
                            Map mapM56337d2 = xi8Var.m56337d();
                            authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(companion.getActiveUsername(username2, str9, mapM56337d2 != null ? (String) mapM56337d2.get("USER_ID_FOR_SRP") : null), xi8Var.m56336c(), xi8Var.m56338e(), (80 & 8) != 0 ? null : xi8Var.m56337d(), (80 & 16) != 0 ? null : null, xi8Var.m56334a(), (80 & 64) != 0 ? new WeakReference(null) : null, c10475xb12e4569.$event$inlined.getAuthFlowType() == AuthFlowType.USER_AUTH ? new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH) : new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH));
                            if (authenticationEvent != null) {
                                authEnvironment2 = authEnvironment4;
                                str2 = str4;
                                eventDispatcher3 = eventDispatcher5;
                            }
                        }
                        throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                    }
                    AuthEnvironment authEnvironment9 = (AuthEnvironment) anonymousClass1.L$3;
                    String str10 = (String) anonymousClass1.L$2;
                    EventDispatcher eventDispatcher11 = (EventDispatcher) anonymousClass1.L$1;
                    c10475xb12e4569 = (C10475xb12e4569) anonymousClass1.L$0;
                    wre.m54934b(objI0);
                    eventDispatcher8 = eventDispatcher11;
                    authEnvironment7 = authEnvironment9;
                    str7 = str10;
                    xqeVar = (xqe) objI0;
                    authEnvironment6 = authEnvironment7;
                    str6 = str7;
                    eventDispatcher7 = eventDispatcher8;
                    if (xqeVar != null || (authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(c10475xb12e4569.$event$inlined.getUsername(), xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH))) == null) {
                        throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                    }
                    authEnvironment2 = authEnvironment6;
                    str2 = str6;
                    eventDispatcher3 = eventDispatcher7;
                } catch (Exception e2) {
                    e = e2;
                    eventDispatcher2 = "PASSWORD";
                    authEnvironment = objM51918f;
                    str = i2;
                }
            } else {
                Map map = (Map) anonymousClass1.L$4;
                authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                String str11 = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher12 = (EventDispatcher) anonymousClass1.L$1;
                C10475xb12e4569 c10475xb12e45692 = (C10475xb12e4569) anonymousClass1.L$0;
                try {
                    wre.m54934b(objI0);
                    mapM32685l = map;
                    c10475xb12e4569 = c10475xb12e45692;
                    str3 = str11;
                    eventDispatcher9 = eventDispatcher12;
                    try {
                        String str12 = (String) objI0;
                        String pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                        respondToAuthChallenge = c10475xb12e4569.$event$inlined.getRespondToAuthChallenge();
                        if ((respondToAuthChallenge == null ? respondToAuthChallenge.getSession() : null) == null) {
                            mapM32685l.put("ANSWER", cg2.C12664i.f18068c.mo21138a());
                            kg3 cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                            if (cognitoIdentityProviderClient == null) {
                                authEnvironment6 = authEnvironment3;
                                xqeVar = null;
                                str6 = str3;
                                eventDispatcher7 = eventDispatcher9;
                                if (xqeVar != null) {
                                }
                                throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                            }
                            wqe.C17950a c17950a = new wqe.C17950a();
                            UserPoolConfiguration userPool = authEnvironment3.getConfiguration().getUserPool();
                            c17950a.m54878l(userPool != null ? userPool.getAppClient() : null);
                            c17950a.m54876j(cg2.C12668m.f18075c);
                            c17950a.m54877k(mapM32685l);
                            c17950a.m54880n(c10475xb12e4569.$event$inlined.getRespondToAuthChallenge().getSession());
                            c17950a.m54879m(c10475xb12e4569.$event$inlined.getMetadata());
                            if (pinpointEndpointId != null) {
                                c17950a.m54867a(new C10476x2029e795(pinpointEndpointId));
                            }
                            if (str12 != null) {
                                c17950a.m54881o(new C10477x2029eb56(str12));
                            }
                            wqe wqeVarM54868b = c17950a.m54868b();
                            anonymousClass1.L$0 = c10475xb12e4569;
                            anonymousClass1.L$1 = eventDispatcher9;
                            anonymousClass1.L$2 = str3;
                            anonymousClass1.L$3 = authEnvironment3;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.label = 2;
                            objI0 = cognitoIdentityProviderClient.j2(wqeVarM54868b, anonymousClass1);
                            if (objI0 == objM51918f) {
                                return objM51918f;
                            }
                            authEnvironment7 = authEnvironment3;
                            str7 = str3;
                            eventDispatcher8 = eventDispatcher9;
                            xqeVar = (xqe) objI0;
                            authEnvironment6 = authEnvironment7;
                            str6 = str7;
                            eventDispatcher7 = eventDispatcher8;
                            if (xqeVar != null) {
                            }
                            throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                        }
                        if (c10475xb12e4569.$event$inlined.getAuthFlowType() == AuthFlowType.USER_AUTH) {
                            mapM32685l.put("PREFERRED_CHALLENGE", "PASSWORD");
                        }
                        kg3 cognitoIdentityProviderClient2 = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient2 == null) {
                            authEnvironment4 = authEnvironment3;
                            xi8Var = null;
                            str4 = str3;
                            eventDispatcher5 = eventDispatcher9;
                            if (xi8Var != null) {
                            }
                            throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                        }
                        wi8.C17918a c17918a = new wi8.C17918a();
                        c17918a.m54591j(AuthFlowTypeHelperKt.toCognitoType(c10475xb12e4569.$event$inlined.getAuthFlowType()));
                        UserPoolConfiguration userPool2 = authEnvironment3.getConfiguration().getUserPool();
                        c17918a.m54593l(userPool2 != null ? userPool2.getAppClient() : null);
                        c17918a.m54592k(mapM32685l);
                        c17918a.m54594m(c10475xb12e4569.$event$inlined.getMetadata());
                        if (pinpointEndpointId != null) {
                            c17918a.m54582a(new C10478x2037ff16(pinpointEndpointId));
                        }
                        if (str12 != null) {
                            c17918a.m54596o(new C10479x203802d7(str12));
                        }
                        wi8 wi8VarM54583b = c17918a.m54583b();
                        anonymousClass1.L$0 = c10475xb12e4569;
                        anonymousClass1.L$1 = eventDispatcher9;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = authEnvironment3;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 3;
                        objI0 = cognitoIdentityProviderClient2.i0(wi8VarM54583b, anonymousClass1);
                        if (objI0 == objM51918f) {
                            return objM51918f;
                        }
                        authEnvironment5 = authEnvironment3;
                        str5 = str3;
                        eventDispatcher6 = eventDispatcher9;
                        xi8Var = (xi8) objI0;
                        authEnvironment4 = authEnvironment5;
                        str4 = str5;
                        eventDispatcher5 = eventDispatcher6;
                        if (xi8Var != null) {
                        }
                        throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                    } catch (Exception e3) {
                        e = e3;
                        authEnvironment = authEnvironment3;
                        str = str3;
                        eventDispatcher2 = eventDispatcher9;
                    }
                } catch (Exception e4) {
                    e = e4;
                    authEnvironment = authEnvironment3;
                    str = str11;
                    eventDispatcher2 = eventDispatcher12;
                }
            }
            SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
            eventDispatcher2.send(signInEvent);
            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
            authEnvironment2 = authEnvironment;
            str2 = str;
            eventDispatcher3 = eventDispatcher2;
        } else {
            wre.m54934b(objI0);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment10 = (AuthEnvironment) environment;
            authEnvironment10.getLogger().verbose(id + " Starting execution");
            try {
                AuthHelper.Companion companion2 = AuthHelper.Companion;
                String username3 = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool3 = authEnvironment10.getConfiguration().getUserPool();
                String appClient = userPool3 != null ? userPool3.getAppClient() : null;
                UserPoolConfiguration userPool4 = authEnvironment10.getConfiguration().getUserPool();
                String secretHash = companion2.getSecretHash(username3, appClient, userPool4 != null ? userPool4.getAppClientSecret() : null);
                mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", this.$event$inlined.getUsername()), vyh.m53620a("PASSWORD", this.$event$inlined.getPassword()));
                if (secretHash != null) {
                    mapM32685l.put("SECRET_HASH", secretHash);
                }
                username = this.$event$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher4 = eventDispatcher;
            } catch (Exception e5) {
                e = e5;
                eventDispatcher4 = eventDispatcher;
            }
            try {
                anonymousClass1.L$1 = eventDispatcher4;
                anonymousClass1.L$2 = id;
                anonymousClass1.L$3 = authEnvironment10;
                anonymousClass1.L$4 = mapM32685l;
                anonymousClass1.label = 1;
                Object userContextData = authEnvironment10.getUserContextData(username, anonymousClass1);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                str3 = id;
                authEnvironment3 = authEnvironment10;
                objI0 = userContextData;
                c10475xb12e4569 = this;
                eventDispatcher9 = eventDispatcher4;
                String str122 = (String) objI0;
                String pinpointEndpointId2 = authEnvironment3.getPinpointEndpointId();
                respondToAuthChallenge = c10475xb12e4569.$event$inlined.getRespondToAuthChallenge();
                if ((respondToAuthChallenge == null ? respondToAuthChallenge.getSession() : null) == null) {
                }
            } catch (Exception e6) {
                e = e6;
                authEnvironment = authEnvironment10;
                str = id;
                eventDispatcher2 = eventDispatcher4;
                SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent2.getType());
                eventDispatcher2.send(signInEvent2);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment2 = authEnvironment;
                str2 = str;
                eventDispatcher3 = eventDispatcher2;
                authEnvironment2.getLogger().verbose(str2 + " Sending event " + authenticationEvent.getType());
                eventDispatcher3.send(authenticationEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment2.getLogger().verbose(str2 + " Sending event " + authenticationEvent.getType());
        eventDispatcher3.send(authenticationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
