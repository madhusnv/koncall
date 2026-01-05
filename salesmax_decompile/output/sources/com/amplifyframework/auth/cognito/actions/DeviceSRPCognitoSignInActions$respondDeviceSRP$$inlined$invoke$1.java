package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.hwc;
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

/* loaded from: classes5.dex */
public final class DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1", m36648f = "DeviceSRPCognitoSignInActions.kt", m36649l = {TypeReference.METHOD_REFERENCE, TypeReference.CAST, Opcodes.DUP_X1, Opcodes.LSHL}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1$1 */
    public static final class C104571 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C104571(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1(String str, DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge) {
        this.$event$inlined = respondDeviceSRPChallenge;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:43:0x0124, B:46:0x0130, B:51:0x013c, B:53:0x0150, B:56:0x0158, B:58:0x017e, B:60:0x0184, B:62:0x018e, B:64:0x0196, B:66:0x019c, B:67:0x01a1, B:69:0x01ab, B:80:0x0228, B:81:0x022d), top: B:102:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:43:0x0124, B:46:0x0130, B:51:0x013c, B:53:0x0150, B:56:0x0158, B:58:0x017e, B:60:0x0184, B:62:0x018e, B:64:0x0196, B:66:0x019c, B:67:0x01a1, B:69:0x01ab, B:80:0x0228, B:81:0x022d), top: B:102:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:43:0x0124, B:46:0x0130, B:51:0x013c, B:53:0x0150, B:56:0x0158, B:58:0x017e, B:60:0x0184, B:62:0x018e, B:64:0x0196, B:66:0x019c, B:67:0x01a1, B:69:0x01ab, B:80:0x0228, B:81:0x022d), top: B:102:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab A[Catch: Exception -> 0x022e, TRY_LEAVE, TryCatch #0 {Exception -> 0x022e, blocks: (B:43:0x0124, B:46:0x0130, B:51:0x013c, B:53:0x0150, B:56:0x0158, B:58:0x017e, B:60:0x0184, B:62:0x018e, B:64:0x0196, B:66:0x019c, B:67:0x01a1, B:69:0x01ab, B:80:0x0228, B:81:0x022d), top: B:102:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217 A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:18:0x006e, B:73:0x01df, B:76:0x01e9, B:77:0x0203, B:78:0x0217, B:79:0x0227), top: B:109:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0228 A[Catch: Exception -> 0x022e, TRY_ENTER, TryCatch #0 {Exception -> 0x022e, blocks: (B:43:0x0124, B:46:0x0130, B:51:0x013c, B:53:0x0150, B:56:0x0158, B:58:0x017e, B:60:0x0184, B:62:0x018e, B:64:0x0196, B:66:0x019c, B:67:0x01a1, B:69:0x01ab, B:80:0x0228, B:81:0x022d), top: B:102:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0265  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Date, o.id5] */
    /* JADX WARN: Type inference failed for: r2v37 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException, InvalidUserPoolConfigurationException {
        C104571 c104571;
        String id;
        AuthEnvironment authEnvironment;
        String username;
        EventDispatcher eventDispatcher2;
        EventDispatcher eventDispatcher3;
        DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
        String str;
        String str2;
        AuthEnvironment authEnvironment2;
        String str3;
        String str4;
        DeviceMetadata.Metadata metadata;
        String secretHash;
        kg3 cognitoIdentityProviderClient;
        DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12;
        DeviceMetadata.Metadata metadata2;
        AuthEnvironment authEnvironment3;
        String str5;
        String deviceSecret;
        ?? r2;
        boolean z;
        AuthEnvironment authEnvironment4;
        EventDispatcher eventDispatcher4;
        Map mapM56663c;
        StateMachineEvent deviceSRPSignInEvent;
        if (n64Var instanceof C104571) {
            c104571 = (C104571) n64Var;
            int i = c104571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104571.label = i - Integer.MIN_VALUE;
            } else {
                c104571 = new C104571(n64Var);
            }
        }
        Object obj = c104571.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104571.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            username = this.$event$inlined.getUsername();
            try {
                c104571.L$0 = this;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            }
            try {
                c104571.L$1 = eventDispatcher2;
                c104571.L$2 = id;
                c104571.L$3 = authEnvironment;
                c104571.L$4 = username;
                c104571.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, c104571);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                eventDispatcher3 = eventDispatcher2;
                obj = userContextData;
                deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 = this;
            } catch (Exception e2) {
                e = e2;
                eventDispatcher3 = eventDispatcher2;
                str = username;
                str2 = id;
                authEnvironment2 = authEnvironment;
                if (!(e instanceof m0c)) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        metadata2 = (DeviceMetadata.Metadata) c104571.L$5;
                        String str6 = (String) c104571.L$4;
                        authEnvironment3 = (AuthEnvironment) c104571.L$3;
                        str5 = (String) c104571.L$2;
                        eventDispatcher3 = (EventDispatcher) c104571.L$1;
                        deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) c104571.L$0;
                        try {
                            wre.m54934b(obj);
                            mapM56663c = ((xqe) obj).m56663c();
                        } catch (Exception e3) {
                            e = e3;
                            str = str6;
                            str2 = str5;
                            authEnvironment2 = authEnvironment3;
                        }
                        if (mapM56663c != null) {
                            throw new ServiceException("Challenge params are empty.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                        }
                        if (metadata2 != null) {
                            mapM56663c = isa.m32688o(isa.m32688o(mapM56663c, vyh.m53620a("DEVICE_KEY", metadata2.getDeviceKey())), vyh.m53620a("DEVICE_GROUP_KEY", metadata2.getDeviceGroupKey()));
                        }
                        deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier(mapM56663c, deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12.$event$inlined.getMetadata()), null, 2, null);
                        authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent.getType());
                        eventDispatcher3.send(deviceSRPSignInEvent);
                        return y3i.f54824a;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = (Exception) c104571.L$3;
                    authEnvironment4 = (AuthEnvironment) c104571.L$2;
                    str2 = (String) c104571.L$1;
                    eventDispatcher4 = (EventDispatcher) c104571.L$0;
                    wre.m54934b(obj);
                    z = false;
                    eventDispatcher3 = eventDispatcher4;
                    authEnvironment3 = authEnvironment4;
                    r2 = z;
                    str5 = str2;
                    DeviceSRPSignInEvent deviceSRPSignInEvent2 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent2.getType());
                    eventDispatcher3.send(deviceSRPSignInEvent2);
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent2.getType());
                    eventDispatcher3.send(signInEvent);
                    deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher3.send(deviceSRPSignInEvent);
                    return y3i.f54824a;
                }
                String str7 = (String) c104571.L$5;
                username = (String) c104571.L$4;
                authEnvironment2 = (AuthEnvironment) c104571.L$3;
                String str8 = (String) c104571.L$2;
                EventDispatcher eventDispatcher5 = (EventDispatcher) c104571.L$1;
                DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$13 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) c104571.L$0;
                try {
                    wre.m54934b(obj);
                    str3 = str7;
                    deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$13;
                    str4 = str8;
                    eventDispatcher3 = eventDispatcher5;
                    try {
                        metadata = (DeviceMetadata.Metadata) obj;
                        String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                        authEnvironment2.setSrpHelper$aws_auth_cognito_release(new SRPHelper((metadata != null || (deviceSecret = metadata.getDeviceSecret()) == null) ? "" : deviceSecret));
                        hwc[] hwcVarArr = new hwc[3];
                        hwcVarArr[0] = vyh.m53620a("USERNAME", username);
                        if (metadata != null || (deviceKey = metadata.getDeviceKey()) == null) {
                            String deviceKey = "";
                        }
                        hwcVarArr[1] = vyh.m53620a("DEVICE_KEY", deviceKey);
                        hwcVarArr[2] = vyh.m53620a("SRP_A", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getPublicA());
                        Map mapM32685l = isa.m32685l(hwcVarArr);
                        AuthHelper.Companion companion = AuthHelper.Companion;
                        UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                        String appClient = userPool == null ? userPool.getAppClient() : null;
                        UserPoolConfiguration userPool2 = authEnvironment2.getConfiguration().getUserPool();
                        secretHash = companion.getSecretHash(username, appClient, userPool2 == null ? userPool2.getAppClientSecret() : null);
                        if (secretHash != null) {
                            mapM32685l.put("SECRET_HASH", secretHash);
                        }
                        cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient != null) {
                            throw new InvalidUserPoolConfigurationException();
                        }
                        wqe wqeVarM54882a = wqe.f52518h.m54882a(new C10461xbcb3fc3d(authEnvironment2, mapM32685l, deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1.$event$inlined, pinpointEndpointId, str3));
                        c104571.L$0 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
                        c104571.L$1 = eventDispatcher3;
                        c104571.L$2 = str4;
                        c104571.L$3 = authEnvironment2;
                        c104571.L$4 = username;
                        c104571.L$5 = metadata;
                        c104571.label = 3;
                        Object objJ2 = cognitoIdentityProviderClient.j2(wqeVarM54882a, c104571);
                        if (objJ2 == objM51918f) {
                            return objM51918f;
                        }
                        deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
                        metadata2 = metadata;
                        obj = objJ2;
                        authEnvironment3 = authEnvironment2;
                        str5 = str4;
                        mapM56663c = ((xqe) obj).m56663c();
                        if (mapM56663c != null) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str = username;
                        str2 = str4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = username;
                    str2 = str8;
                    eventDispatcher3 = eventDispatcher5;
                }
                if (!(e instanceof m0c)) {
                    r2 = 0;
                    authEnvironment3 = authEnvironment2;
                    str5 = str2;
                    DeviceSRPSignInEvent deviceSRPSignInEvent22 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent22.getType());
                    eventDispatcher3.send(deviceSRPSignInEvent22);
                    SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent22.getType());
                    eventDispatcher3.send(signInEvent2);
                    deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher3.send(deviceSRPSignInEvent);
                    return y3i.f54824a;
                }
                StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
                CredentialType.Device device = new CredentialType.Device(str);
                c104571.L$0 = eventDispatcher3;
                c104571.L$1 = str2;
                c104571.L$2 = authEnvironment2;
                c104571.L$3 = e;
                z = false;
                c104571.L$4 = null;
                c104571.L$5 = null;
                c104571.label = 4;
                if (credentialStoreClient.clearCredentials(device, c104571) == objM51918f) {
                    return objM51918f;
                }
                authEnvironment4 = authEnvironment2;
                eventDispatcher4 = eventDispatcher3;
                eventDispatcher3 = eventDispatcher4;
                authEnvironment3 = authEnvironment4;
                r2 = z;
                str5 = str2;
                DeviceSRPSignInEvent deviceSRPSignInEvent222 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent222.getType());
                eventDispatcher3.send(deviceSRPSignInEvent222);
                SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent222.getType());
                eventDispatcher3.send(signInEvent22);
                deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent.getType());
                eventDispatcher3.send(deviceSRPSignInEvent);
                return y3i.f54824a;
            }
            username = (String) c104571.L$4;
            authEnvironment = (AuthEnvironment) c104571.L$3;
            id = (String) c104571.L$2;
            eventDispatcher3 = (EventDispatcher) c104571.L$1;
            deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) c104571.L$0;
            try {
                wre.m54934b(obj);
            } catch (Exception e6) {
                e = e6;
                str = username;
                str2 = id;
                authEnvironment2 = authEnvironment;
                if (!(e instanceof m0c)) {
                }
            }
        }
        String str9 = (String) obj;
        c104571.L$0 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
        c104571.L$1 = eventDispatcher3;
        c104571.L$2 = id;
        c104571.L$3 = authEnvironment;
        c104571.L$4 = username;
        c104571.L$5 = str9;
        c104571.label = 2;
        Object deviceMetadata = authEnvironment.getDeviceMetadata(username, c104571);
        if (deviceMetadata == objM51918f) {
            return objM51918f;
        }
        str3 = str9;
        obj = deviceMetadata;
        String str10 = id;
        authEnvironment2 = authEnvironment;
        str4 = str10;
        metadata = (DeviceMetadata.Metadata) obj;
        String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
        if (metadata != null) {
            authEnvironment2.setSrpHelper$aws_auth_cognito_release(new SRPHelper((metadata != null || (deviceSecret = metadata.getDeviceSecret()) == null) ? "" : deviceSecret));
            hwc[] hwcVarArr2 = new hwc[3];
            hwcVarArr2[0] = vyh.m53620a("USERNAME", username);
            if (metadata != null) {
                String deviceKey2 = "";
                hwcVarArr2[1] = vyh.m53620a("DEVICE_KEY", deviceKey2);
                hwcVarArr2[2] = vyh.m53620a("SRP_A", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getPublicA());
                Map mapM32685l2 = isa.m32685l(hwcVarArr2);
                AuthHelper.Companion companion2 = AuthHelper.Companion;
                UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                if (userPool3 == null) {
                }
                UserPoolConfiguration userPool22 = authEnvironment2.getConfiguration().getUserPool();
                secretHash = companion2.getSecretHash(username, appClient, userPool22 == null ? userPool22.getAppClientSecret() : null);
                if (secretHash != null) {
                }
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                }
            }
        }
        authEnvironment3.getLogger().verbose(str5 + " Sending event " + deviceSRPSignInEvent.getType());
        eventDispatcher3.send(deviceSRPSignInEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
