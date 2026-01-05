package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
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
import p001o.sz0;
import p001o.uq8;
import p001o.vyh;
import p001o.wi8;
import p001o.wre;
import p001o.xi8;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10500xc349ee6d implements Action {
    final /* synthetic */ CustomSignInEvent.EventType.InitiateCustomSignIn $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1", m36648f = "SignInCustomCognitoActions.kt", m36649l = {78, Opcodes.IASTORE, Opcodes.BASTORE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return C10500xc349ee6d.this.execute(null, null, this);
        }
    }

    public C10500xc349ee6d(String str, CustomSignInEvent.EventType.InitiateCustomSignIn initiateCustomSignIn) {
        this.$event$inlined = initiateCustomSignIn;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f A[Catch: Exception -> 0x0252, TryCatch #5 {Exception -> 0x0252, blocks: (B:52:0x015b, B:54:0x015f, B:55:0x0168, B:57:0x0176, B:59:0x018a, B:61:0x0190, B:63:0x01a1, B:65:0x01ab, B:66:0x01b3), top: B:112:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176 A[Catch: Exception -> 0x0252, TryCatch #5 {Exception -> 0x0252, blocks: (B:52:0x015b, B:54:0x015f, B:55:0x0168, B:57:0x0176, B:59:0x018a, B:61:0x0190, B:63:0x01a1, B:65:0x01ab, B:66:0x01b3), top: B:112:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da A[Catch: Exception -> 0x01d2, TryCatch #6 {Exception -> 0x01d2, blocks: (B:70:0x01cf, B:75:0x01da, B:77:0x01e0, B:79:0x01e8, B:81:0x01ee, B:83:0x01fc, B:85:0x0204, B:87:0x020a, B:89:0x0214, B:90:0x0240, B:91:0x0251), top: B:114:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e8 A[Catch: Exception -> 0x01d2, TryCatch #6 {Exception -> 0x01d2, blocks: (B:70:0x01cf, B:75:0x01da, B:77:0x01e0, B:79:0x01e8, B:81:0x01ee, B:83:0x01fc, B:85:0x0204, B:87:0x020a, B:89:0x0214, B:90:0x0240, B:91:0x0251), top: B:114:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        Map mapM32685l;
        String username;
        C10500xc349ee6d c10500xc349ee6d;
        Map map;
        String str;
        AuthEnvironment authEnvironment2;
        String str2;
        Object deviceMetadata;
        Map map2;
        C10500xc349ee6d c10500xc349ee6d2;
        String str3;
        AuthEnvironment authEnvironment3;
        DeviceMetadata.Metadata metadata;
        kg3 cognitoIdentityProviderClient;
        xi8 xi8Var;
        StateMachineEvent authenticationEvent;
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
        if (i2 == 0) {
            wre.m54934b(objI0);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
            authEnvironment4.getLogger().verbose(id + " Starting execution");
            try {
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username2 = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment4.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment4.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username2, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", this.$event$inlined.getUsername()));
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
                anonymousClass1.L$3 = authEnvironment4;
                anonymousClass1.L$4 = mapM32685l;
                anonymousClass1.label = 1;
                Object userContextData = authEnvironment4.getUserContextData(username, anonymousClass1);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                c10500xc349ee6d = this;
                objI0 = userContextData;
                map = mapM32685l;
                str = id;
                authEnvironment2 = authEnvironment4;
                str2 = (String) objI0;
                String username3 = c10500xc349ee6d.$event$inlined.getUsername();
                anonymousClass1.L$0 = c10500xc349ee6d;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = authEnvironment2;
                anonymousClass1.L$4 = map;
                anonymousClass1.L$5 = str2;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment2.getDeviceMetadata(username3, anonymousClass1);
                if (deviceMetadata != objM51918f) {
                }
            } catch (Exception e2) {
                e = e2;
                authEnvironment = authEnvironment4;
                SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
                eventDispatcher2.send(signInEvent);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                return y3i.f54824a;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                String str4 = (String) anonymousClass1.L$5;
                map2 = (Map) anonymousClass1.L$4;
                authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                String str5 = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                C10500xc349ee6d c10500xc349ee6d3 = (C10500xc349ee6d) anonymousClass1.L$0;
                try {
                    wre.m54934b(objI0);
                    str2 = str4;
                    c10500xc349ee6d2 = c10500xc349ee6d3;
                    deviceMetadata = objI0;
                    str3 = str5;
                    eventDispatcher2 = eventDispatcher3;
                    try {
                        metadata = (DeviceMetadata.Metadata) deviceMetadata;
                        if (metadata != null) {
                            map2.put("DEVICE_KEY", metadata.getDeviceKey());
                        }
                        String pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                        cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient != null) {
                            xi8Var = null;
                            authEnvironment = authEnvironment3;
                            id = str3;
                            if (sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12658c.f18056c)) {
                            }
                            throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                        }
                        wi8.C17918a c17918a = new wi8.C17918a();
                        c17918a.m54591j(sz0.C16938d.f46133c);
                        UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                        c17918a.m54593l(userPool3 != null ? userPool3.getAppClient() : null);
                        c17918a.m54592k(map2);
                        c17918a.m54594m(c10500xc349ee6d2.$event$inlined.getMetadata());
                        if (pinpointEndpointId != null) {
                            c17918a.m54582a(new C10501xa9af98d2(pinpointEndpointId));
                        }
                        if (str2 != null) {
                            c17918a.m54596o(new C10502xa9af9c93(str2));
                        }
                        wi8 wi8VarM54583b = c17918a.m54583b();
                        anonymousClass1.L$0 = c10500xc349ee6d2;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str3;
                        anonymousClass1.L$3 = authEnvironment3;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 3;
                        objI0 = cognitoIdentityProviderClient.i0(wi8VarM54583b, anonymousClass1);
                        if (objI0 == objM51918f) {
                            return objM51918f;
                        }
                        authEnvironment = authEnvironment3;
                        id = str3;
                        xi8Var = (xi8) objI0;
                        if (sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12658c.f18056c)) {
                        }
                        throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                    } catch (Exception e3) {
                        e = e3;
                        authEnvironment = authEnvironment3;
                        id = str3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    authEnvironment = authEnvironment3;
                    id = str5;
                    eventDispatcher2 = eventDispatcher3;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
                id = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                c10500xc349ee6d2 = (C10500xc349ee6d) anonymousClass1.L$0;
                try {
                    wre.m54934b(objI0);
                    eventDispatcher2 = eventDispatcher4;
                    try {
                        xi8Var = (xi8) objI0;
                        if (sq8.m48644c(xi8Var != null ? xi8Var.m56336c() : null, cg2.C12658c.f18056c) || xi8Var.m56337d() == null) {
                            throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                        }
                        AuthHelper.Companion companion2 = AuthHelper.Companion;
                        String username4 = c10500xc349ee6d2.$event$inlined.getUsername();
                        Map mapM56337d = xi8Var.m56337d();
                        String str6 = mapM56337d != null ? (String) mapM56337d.get("USERNAME") : null;
                        Map mapM56337d2 = xi8Var.m56337d();
                        authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(companion2.getActiveUsername(username4, str6, mapM56337d2 != null ? (String) mapM56337d2.get("USER_ID_FOR_SRP") : null), xi8Var.m56336c(), xi8Var.m56338e(), (80 & 8) != 0 ? null : xi8Var.m56337d(), (80 & 16) != 0 ? null : null, xi8Var.m56334a(), (80 & 64) != 0 ? new WeakReference(null) : null, new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH));
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    eventDispatcher2 = eventDispatcher4;
                }
            }
            SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent2.getType());
            eventDispatcher2.send(signInEvent2);
            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
        } else {
            map = (Map) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            c10500xc349ee6d = (C10500xc349ee6d) anonymousClass1.L$0;
            try {
                wre.m54934b(objI0);
                str2 = (String) objI0;
                String username32 = c10500xc349ee6d.$event$inlined.getUsername();
                anonymousClass1.L$0 = c10500xc349ee6d;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = authEnvironment2;
                anonymousClass1.L$4 = map;
                anonymousClass1.L$5 = str2;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment2.getDeviceMetadata(username32, anonymousClass1);
                if (deviceMetadata != objM51918f) {
                    return objM51918f;
                }
                AuthEnvironment authEnvironment5 = authEnvironment2;
                map2 = map;
                c10500xc349ee6d2 = c10500xc349ee6d;
                str3 = str;
                authEnvironment3 = authEnvironment5;
                metadata = (DeviceMetadata.Metadata) deviceMetadata;
                if (metadata != null) {
                }
                String pinpointEndpointId2 = authEnvironment3.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                }
            } catch (Exception e7) {
                e = e7;
                authEnvironment = authEnvironment2;
                id = str;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
