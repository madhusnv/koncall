package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.m0c;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.vyh;
import p001o.wqe;
import p001o.wre;
import p001o.xqe;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10456x75b0e9b implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1", m36648f = "DeviceSRPCognitoSignInActions.kt", m36649l = {77, Opcodes.FADD, Opcodes.LSHL}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10456x75b0e9b.this.execute(null, null, this);
        }
    }

    public C10456x75b0e9b(String str, DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier) {
        this.$event$inlined = respondDevicePasswordVerifier;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0199 A[Catch: Exception -> 0x0247, TryCatch #4 {Exception -> 0x0247, blocks: (B:34:0x013e, B:36:0x0199, B:38:0x019f, B:40:0x01a9, B:42:0x01af, B:44:0x01b5, B:45:0x01ba, B:47:0x01c4), top: B:86:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9 A[Catch: Exception -> 0x0247, TryCatch #4 {Exception -> 0x0247, blocks: (B:34:0x013e, B:36:0x0199, B:38:0x019f, B:40:0x01a9, B:42:0x01af, B:44:0x01b5, B:45:0x01ba, B:47:0x01c4), top: B:86:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b5 A[Catch: Exception -> 0x0247, TryCatch #4 {Exception -> 0x0247, blocks: (B:34:0x013e, B:36:0x0199, B:38:0x019f, B:40:0x01a9, B:42:0x01af, B:44:0x01b5, B:45:0x01ba, B:47:0x01c4), top: B:86:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4 A[Catch: Exception -> 0x0247, TRY_LEAVE, TryCatch #4 {Exception -> 0x0247, blocks: (B:34:0x013e, B:36:0x0199, B:38:0x019f, B:40:0x01a9, B:42:0x01af, B:44:0x01b5, B:45:0x01ba, B:47:0x01c4), top: B:86:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Date, o.id5] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws InvalidUserPoolConfigurationException {
        AnonymousClass1 anonymousClass1;
        String str;
        EventDispatcher eventDispatcher2;
        EventDispatcher eventDispatcher3;
        AuthEnvironment authEnvironment;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object userContextData;
        C10456x75b0e9b c10456x75b0e9b;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String secretHash;
        kg3 cognitoIdentityProviderClient;
        String str13;
        String str14;
        EventDispatcher eventDispatcher4;
        AuthEnvironment authEnvironment2;
        ?? r6;
        AuthEnvironment authEnvironment3;
        boolean z;
        EventDispatcher eventDispatcher5;
        StateMachineEvent stateMachineEventEvaluateNextStep;
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
        if (i2 == 0) {
            wre.m54934b(objJ2);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
            authEnvironment4.getLogger().verbose(id + " Starting execution");
            Map<String, String> challengeParameters = this.$event$inlined.getChallengeParameters();
            str = (String) isa.m32682i(challengeParameters, "USERNAME");
            try {
                str3 = (String) isa.m32682i(challengeParameters, "SALT");
                str4 = (String) isa.m32682i(challengeParameters, "SECRET_BLOCK");
                str5 = (String) isa.m32682i(challengeParameters, "SRP_B");
                str6 = (String) isa.m32682i(challengeParameters, "DEVICE_KEY");
                str7 = (String) isa.m32682i(challengeParameters, "DEVICE_GROUP_KEY");
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
                anonymousClass1.L$4 = str;
                anonymousClass1.L$5 = str3;
                anonymousClass1.L$6 = str4;
                anonymousClass1.L$7 = str5;
                anonymousClass1.L$8 = str6;
                anonymousClass1.L$9 = str7;
                anonymousClass1.label = 1;
                userContextData = authEnvironment4.getUserContextData(str, anonymousClass1);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                c10456x75b0e9b = this;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                str11 = id;
                authEnvironment = authEnvironment4;
                str12 = str6;
                eventDispatcher3 = eventDispatcher2;
                String str15 = (String) userContextData;
                String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
                authEnvironment.getSrpHelper$aws_auth_cognito_release().setUserPoolParams(str12, str7);
                Map mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", str), vyh.m53620a("PASSWORD_CLAIM_SECRET_BLOCK", str9), vyh.m53620a("TIMESTAMP", authEnvironment.getSrpHelper$aws_auth_cognito_release().getDateString()), vyh.m53620a("PASSWORD_CLAIM_SIGNATURE", authEnvironment.getSrpHelper$aws_auth_cognito_release().getSignature(str8, str10, str9)), vyh.m53620a("DEVICE_KEY", str12));
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                if (userPool == null) {
                }
                UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
                secretHash = companion.getSecretHash(str, appClient, userPool2 == null ? userPool2.getAppClientSecret() : null);
                if (secretHash != null) {
                }
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher3 = eventDispatcher2;
                authEnvironment = authEnvironment4;
                str2 = id;
                if (!(e instanceof m0c)) {
                }
            }
        } else if (i2 == 1) {
            String str16 = (String) anonymousClass1.L$9;
            str12 = (String) anonymousClass1.L$8;
            String str17 = (String) anonymousClass1.L$7;
            String str18 = (String) anonymousClass1.L$6;
            String str19 = (String) anonymousClass1.L$5;
            String str20 = (String) anonymousClass1.L$4;
            AuthEnvironment authEnvironment5 = (AuthEnvironment) anonymousClass1.L$3;
            String str21 = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            C10456x75b0e9b c10456x75b0e9b2 = (C10456x75b0e9b) anonymousClass1.L$0;
            try {
                wre.m54934b(objJ2);
                str8 = str19;
                str9 = str18;
                str10 = str17;
                str11 = str21;
                authEnvironment = authEnvironment5;
                str = str20;
                userContextData = objJ2;
                c10456x75b0e9b = c10456x75b0e9b2;
                str7 = str16;
            } catch (Exception e3) {
                e = e3;
                str2 = str21;
                authEnvironment = authEnvironment5;
                str = str20;
                if (!(e instanceof m0c)) {
                    r6 = 0;
                    str14 = str2;
                    eventDispatcher4 = eventDispatcher3;
                    authEnvironment3 = authEnvironment;
                    DeviceSRPSignInEvent deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r6, 2, r6);
                    authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher4.send(deviceSRPSignInEvent);
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher4.send(signInEvent);
                    stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment2 = authEnvironment3;
                    authEnvironment2.getLogger().verbose(str14 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
                    eventDispatcher4.send(stateMachineEventEvaluateNextStep);
                    return y3i.f54824a;
                }
                StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                CredentialType.Device device = new CredentialType.Device(str);
                anonymousClass1.L$0 = eventDispatcher3;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = authEnvironment;
                anonymousClass1.L$3 = e;
                z = false;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.L$7 = null;
                anonymousClass1.L$8 = null;
                anonymousClass1.L$9 = null;
                anonymousClass1.label = 3;
                if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objM51918f) {
                    return objM51918f;
                }
                eventDispatcher5 = eventDispatcher3;
                authEnvironment3 = authEnvironment;
                eventDispatcher4 = eventDispatcher5;
                str14 = str2;
                r6 = z;
                DeviceSRPSignInEvent deviceSRPSignInEvent2 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r6, 2, r6);
                authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent2.getType());
                eventDispatcher4.send(deviceSRPSignInEvent2);
                SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent2.getType());
                eventDispatcher4.send(signInEvent2);
                stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment2 = authEnvironment3;
                authEnvironment2.getLogger().verbose(str14 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
                eventDispatcher4.send(stateMachineEventEvaluateNextStep);
                return y3i.f54824a;
            }
            try {
                String str152 = (String) userContextData;
                String pinpointEndpointId2 = authEnvironment.getPinpointEndpointId();
                authEnvironment.getSrpHelper$aws_auth_cognito_release().setUserPoolParams(str12, str7);
                Map mapM32685l2 = isa.m32685l(vyh.m53620a("USERNAME", str), vyh.m53620a("PASSWORD_CLAIM_SECRET_BLOCK", str9), vyh.m53620a("TIMESTAMP", authEnvironment.getSrpHelper$aws_auth_cognito_release().getDateString()), vyh.m53620a("PASSWORD_CLAIM_SIGNATURE", authEnvironment.getSrpHelper$aws_auth_cognito_release().getSignature(str8, str10, str9)), vyh.m53620a("DEVICE_KEY", str12));
                AuthHelper.Companion companion2 = AuthHelper.Companion;
                UserPoolConfiguration userPool3 = authEnvironment.getConfiguration().getUserPool();
                String appClient = userPool3 == null ? userPool3.getAppClient() : null;
                UserPoolConfiguration userPool22 = authEnvironment.getConfiguration().getUserPool();
                secretHash = companion2.getSecretHash(str, appClient, userPool22 == null ? userPool22.getAppClientSecret() : null);
                if (secretHash != null) {
                    mapM32685l2.put("SECRET_HASH", secretHash);
                }
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    str13 = str;
                    str14 = str11;
                    eventDispatcher4 = eventDispatcher3;
                    throw new InvalidUserPoolConfigurationException();
                }
                wqe wqeVarM54882a = wqe.f52518h.m54882a(new C10458x93f0dec5(authEnvironment, mapM32685l2, c10456x75b0e9b.$event$inlined, pinpointEndpointId2, str152));
                anonymousClass1.L$0 = eventDispatcher3;
                anonymousClass1.L$1 = str11;
                anonymousClass1.L$2 = authEnvironment;
                anonymousClass1.L$3 = str;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.L$7 = null;
                anonymousClass1.L$8 = null;
                anonymousClass1.L$9 = null;
                anonymousClass1.label = 2;
                objJ2 = cognitoIdentityProviderClient.j2(wqeVarM54882a, anonymousClass1);
                if (objJ2 == objM51918f) {
                    return objM51918f;
                }
                str13 = str;
                authEnvironment2 = authEnvironment;
                str14 = str11;
                eventDispatcher4 = eventDispatcher3;
                xqe xqeVar = (xqe) objJ2;
                new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.FinalizeSignIn(null, 1, null), null, 2, null);
                stateMachineEventEvaluateNextStep = SignInChallengeHelper.INSTANCE.evaluateNextStep(str13, xqeVar.m56662b(), xqeVar.m56664d(), (80 & 8) != 0 ? null : xqeVar.m56663c(), (80 & 16) != 0 ? null : null, xqeVar.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH));
                if (stateMachineEventEvaluateNextStep == null) {
                }
            } catch (Exception e4) {
                e = e4;
                str2 = str11;
                if (!(e instanceof m0c)) {
                }
            }
        } else if (i2 == 2) {
            str13 = (String) anonymousClass1.L$3;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$2;
            str14 = (String) anonymousClass1.L$1;
            eventDispatcher4 = (EventDispatcher) anonymousClass1.L$0;
            try {
                wre.m54934b(objJ2);
                xqe xqeVar2 = (xqe) objJ2;
                new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.FinalizeSignIn(null, 1, null), null, 2, null);
                stateMachineEventEvaluateNextStep = SignInChallengeHelper.INSTANCE.evaluateNextStep(str13, xqeVar2.m56662b(), xqeVar2.m56664d(), (80 & 8) != 0 ? null : xqeVar2.m56663c(), (80 & 16) != 0 ? null : null, xqeVar2.m56661a(), (80 & 64) != 0 ? new WeakReference(null) : null, new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH));
                if (stateMachineEventEvaluateNextStep == null) {
                    authEnvironment = authEnvironment2;
                    try {
                        throw new InvalidUserPoolConfigurationException();
                    } catch (Exception e5) {
                        e = e5;
                        str = str13;
                        str2 = str14;
                        eventDispatcher3 = eventDispatcher4;
                        if (!(e instanceof m0c)) {
                        }
                    }
                }
            } catch (Exception e6) {
                e = e6;
                str = str13;
                authEnvironment = authEnvironment2;
                str2 = str14;
                eventDispatcher3 = eventDispatcher4;
                if (!(e instanceof m0c)) {
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e = (Exception) anonymousClass1.L$3;
            authEnvironment3 = (AuthEnvironment) anonymousClass1.L$2;
            str2 = (String) anonymousClass1.L$1;
            eventDispatcher5 = (EventDispatcher) anonymousClass1.L$0;
            wre.m54934b(objJ2);
            z = false;
            eventDispatcher4 = eventDispatcher5;
            str14 = str2;
            r6 = z;
            DeviceSRPSignInEvent deviceSRPSignInEvent22 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r6, 2, r6);
            authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent22.getType());
            eventDispatcher4.send(deviceSRPSignInEvent22);
            SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment3.getLogger().verbose(str14 + " Sending event " + deviceSRPSignInEvent22.getType());
            eventDispatcher4.send(signInEvent22);
            stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
            authEnvironment2 = authEnvironment3;
        }
        authEnvironment2.getLogger().verbose(str14 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
        eventDispatcher4.send(stateMachineEventEvaluateNextStep);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
