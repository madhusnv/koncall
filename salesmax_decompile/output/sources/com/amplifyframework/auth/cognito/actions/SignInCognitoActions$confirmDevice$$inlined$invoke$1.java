package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.CognitoDeviceHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.er3;
import p001o.fr3;
import p001o.id5;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignInCognitoActions$confirmDevice$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.ConfirmDevice $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1", m36648f = "SignInCognitoActions.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, Opcodes.POP}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1$1 */
    public static final class C104961 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C104961(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignInCognitoActions$confirmDevice$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignInCognitoActions$confirmDevice$$inlined$invoke$1(String str, SignInEvent.EventType.ConfirmDevice confirmDevice) {
        this.$event$inlined = confirmDevice;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106 A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #4 {Exception -> 0x0081, blocks: (B:20:0x007b, B:33:0x0102, B:35:0x0106), top: B:61:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException {
        C104961 c104961;
        EventDispatcher eventDispatcher2;
        ?? r5;
        StateMachineEvent signInEvent;
        String str;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher3;
        SignInCognitoActions$confirmDevice$$inlined$invoke$1 signInCognitoActions$confirmDevice$$inlined$invoke$1;
        DeviceMetadata.Metadata metadata;
        String str2;
        Map<String, String> map;
        String str3;
        AuthEnvironment authEnvironment2;
        String str4;
        String str5;
        String str6;
        AuthEnvironment authEnvironment3;
        String str7;
        SignInCognitoActions$confirmDevice$$inlined$invoke$1 signInCognitoActions$confirmDevice$$inlined$invoke$12;
        if (n64Var instanceof C104961) {
            c104961 = (C104961) n64Var;
            int i = c104961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104961.label = i - Integer.MIN_VALUE;
            } else {
                c104961 = new C104961(n64Var);
            }
        }
        Object obj = c104961.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104961.label;
        ?? r6 = 1;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
                authEnvironment4.getLogger().verbose(id + " Starting execution");
                DeviceMetadata.Metadata deviceMetadata = this.$event$inlined.getDeviceMetadata();
                String deviceKey = deviceMetadata.getDeviceKey();
                String deviceGroupKey = deviceMetadata.getDeviceGroupKey();
                try {
                    Map<String, String> mapGenerateVerificationParameters = CognitoDeviceHelper.INSTANCE.generateVerificationParameters(deviceKey, deviceGroupKey);
                    kg3 cognitoIdentityProviderClient = authEnvironment4.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                    }
                    er3 er3VarM25461a = er3.f22056e.m25461a(new SignInCognitoActions$confirmDevice$1$evt$1(this.$event$inlined, deviceKey, mapGenerateVerificationParameters));
                    c104961.L$0 = this;
                    eventDispatcher3 = eventDispatcher;
                    try {
                        c104961.L$1 = eventDispatcher3;
                        c104961.L$2 = id;
                        c104961.L$3 = authEnvironment4;
                        c104961.L$4 = deviceMetadata;
                        c104961.L$5 = deviceKey;
                        c104961.L$6 = deviceGroupKey;
                        c104961.L$7 = mapGenerateVerificationParameters;
                        c104961.label = 1;
                        Object objK1 = cognitoIdentityProviderClient.K1(er3VarM25461a, c104961);
                        if (objK1 == objM51918f) {
                            return objM51918f;
                        }
                        signInCognitoActions$confirmDevice$$inlined$invoke$1 = this;
                        eventDispatcher2 = eventDispatcher3;
                        metadata = deviceMetadata;
                        str2 = deviceKey;
                        map = mapGenerateVerificationParameters;
                        str3 = id;
                        obj = objK1;
                        authEnvironment2 = authEnvironment4;
                        str4 = deviceGroupKey;
                        if (((fr3) obj) != null) {
                        }
                    } catch (Exception e) {
                        e = e;
                        r6 = id;
                        eventDispatcher2 = eventDispatcher3;
                        r5 = authEnvironment4;
                        signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                        authEnvironment = r5;
                        str = r6;
                        authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
                        eventDispatcher2.send(signInEvent);
                        return y3i.f54824a;
                    }
                } catch (Exception e2) {
                    e = e2;
                    eventDispatcher3 = eventDispatcher;
                }
            } else if (i2 == 1) {
                map = (Map) c104961.L$7;
                str4 = (String) c104961.L$6;
                str2 = (String) c104961.L$5;
                DeviceMetadata.Metadata metadata2 = (DeviceMetadata.Metadata) c104961.L$4;
                authEnvironment2 = (AuthEnvironment) c104961.L$3;
                str3 = (String) c104961.L$2;
                eventDispatcher2 = (EventDispatcher) c104961.L$1;
                signInCognitoActions$confirmDevice$$inlined$invoke$1 = (SignInCognitoActions$confirmDevice$$inlined$invoke$1) c104961.L$0;
                try {
                    wre.m54934b(obj);
                    metadata = metadata2;
                    if (((fr3) obj) != null) {
                        throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                    }
                    DeviceMetadata.Metadata metadataCopy$default = DeviceMetadata.Metadata.copy$default(metadata, null, null, map.get("secret"), 3, null);
                    StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
                    CredentialType.Device device = new CredentialType.Device(signInCognitoActions$confirmDevice$$inlined$invoke$1.$event$inlined.getSignedInData().getUsername());
                    AmplifyCredential.DeviceData deviceData = new AmplifyCredential.DeviceData(metadataCopy$default);
                    c104961.L$0 = signInCognitoActions$confirmDevice$$inlined$invoke$1;
                    c104961.L$1 = eventDispatcher2;
                    c104961.L$2 = str3;
                    c104961.L$3 = authEnvironment2;
                    c104961.L$4 = str2;
                    c104961.L$5 = str4;
                    c104961.L$6 = null;
                    c104961.L$7 = null;
                    c104961.label = 2;
                    if (credentialStoreClient.storeCredentials(device, deviceData, c104961) == objM51918f) {
                        return objM51918f;
                    }
                    str5 = str4;
                    str6 = str2;
                    authEnvironment3 = authEnvironment2;
                    str7 = str3;
                    signInCognitoActions$confirmDevice$$inlined$invoke$12 = signInCognitoActions$confirmDevice$$inlined$invoke$1;
                    signInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signInCognitoActions$confirmDevice$$inlined$invoke$12.$event$inlined.getSignedInData(), new DeviceMetadata.Metadata(str6, str5, (String) null, 4, (id5) null)), null, 2, null);
                    authEnvironment = authEnvironment3;
                    str = str7;
                } catch (Exception e3) {
                    e = e3;
                    r5 = authEnvironment2;
                    r6 = str3;
                    signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment = r5;
                    str = r6;
                    authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
                    eventDispatcher2.send(signInEvent);
                    return y3i.f54824a;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str8 = (String) c104961.L$5;
                String str9 = (String) c104961.L$4;
                AuthEnvironment authEnvironment5 = (AuthEnvironment) c104961.L$3;
                String str10 = (String) c104961.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) c104961.L$1;
                signInCognitoActions$confirmDevice$$inlined$invoke$12 = (SignInCognitoActions$confirmDevice$$inlined$invoke$1) c104961.L$0;
                try {
                    wre.m54934b(obj);
                    str5 = str8;
                    str6 = str9;
                    eventDispatcher2 = eventDispatcher4;
                    authEnvironment3 = authEnvironment5;
                    str7 = str10;
                    signInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signInCognitoActions$confirmDevice$$inlined$invoke$12.$event$inlined.getSignedInData(), new DeviceMetadata.Metadata(str6, str5, (String) null, 4, (id5) null)), null, 2, null);
                    authEnvironment = authEnvironment3;
                    str = str7;
                } catch (Exception e4) {
                    e = e4;
                    eventDispatcher2 = eventDispatcher4;
                    r5 = authEnvironment5;
                    r6 = str10;
                    signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment = r5;
                    str = r6;
                    authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
                    eventDispatcher2.send(signInEvent);
                    return y3i.f54824a;
                }
            }
        } catch (Exception e5) {
            e = e5;
            r5 = i2;
        }
        authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
        eventDispatcher2.send(signInEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
