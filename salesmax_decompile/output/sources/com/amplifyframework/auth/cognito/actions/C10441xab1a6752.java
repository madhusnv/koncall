package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import org.objectweb.asm.TypeReference;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10441xab1a6752 implements Action {
    final /* synthetic */ AuthenticationEvent.EventType.Configure $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1", m36648f = "AuthenticationCognitoActions.kt", m36649l = {TypeReference.CAST}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$configureAuthenticationAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return C10441xab1a6752.this.execute(null, null, this);
        }
    }

    public C10441xab1a6752(String str, AuthenticationEvent.EventType.Configure configure) {
        this.$event$inlined = configure;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        AuthenticationEvent authenticationEvent;
        C10441xab1a6752 c10441xab1a6752;
        AuthEnvironment authEnvironment2;
        Object obj;
        EventDispatcher eventDispatcher3;
        DeviceMetadata deviceMetadata;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object obj2 = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(obj2);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            Object storedCredentials = this.$event$inlined.getStoredCredentials();
            if (!(storedCredentials instanceof AmplifyCredential.UserPoolTypeCredential)) {
                eventDispatcher2 = eventDispatcher;
                authenticationEvent = storedCredentials instanceof AmplifyCredential.IdentityPoolFederated ? new AuthenticationEvent(AuthenticationEvent.EventType.InitializedFederated.INSTANCE, null, 2, null) : new AuthenticationEvent(new AuthenticationEvent.EventType.InitializedSignedOut(new SignedOutData(null, null, null, null, 15, null)), null, 2, null);
                c10441xab1a6752 = this;
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                AuthEvent authEvent = new AuthEvent(new AuthEvent.EventType.ConfiguredAuthentication(c10441xab1a6752.$event$inlined.getConfiguration(), c10441xab1a6752.$event$inlined.getStoredCredentials()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
                eventDispatcher2.send(authEvent);
                return y3i.f54824a;
            }
            StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
            CredentialType.Device device = new CredentialType.Device(((AmplifyCredential.UserPoolTypeCredential) storedCredentials).getSignedInData().getUsername());
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = eventDispatcher;
            anonymousClass1.L$2 = id;
            anonymousClass1.L$3 = authEnvironment;
            anonymousClass1.L$4 = storedCredentials;
            anonymousClass1.label = 1;
            Object objLoadCredentials = credentialStoreClient.loadCredentials(device, anonymousClass1);
            if (objLoadCredentials == objM51918f) {
                return objM51918f;
            }
            authEnvironment2 = authEnvironment;
            obj = storedCredentials;
            obj2 = objLoadCredentials;
            eventDispatcher3 = eventDispatcher;
            c10441xab1a6752 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = (AmplifyCredential) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            c10441xab1a6752 = (C10441xab1a6752) anonymousClass1.L$0;
            wre.m54934b(obj2);
        }
        AmplifyCredential.DeviceData deviceData = obj2 instanceof AmplifyCredential.DeviceData ? (AmplifyCredential.DeviceData) obj2 : null;
        if (deviceData == null || (deviceMetadata = deviceData.getDeviceMetadata()) == null) {
            deviceMetadata = DeviceMetadata.Empty.INSTANCE;
        }
        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.InitializedSignedIn(((AmplifyCredential.UserPoolTypeCredential) obj).getSignedInData(), deviceMetadata), null, 2, null);
        authEnvironment = authEnvironment2;
        eventDispatcher2 = eventDispatcher3;
        authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        AuthEvent authEvent2 = new AuthEvent(new AuthEvent.EventType.ConfiguredAuthentication(c10441xab1a6752.$event$inlined.getConfiguration(), c10441xab1a6752.$event$inlined.getStoredCredentials()), null, 2, null);
        authEnvironment.getLogger().verbose(id + " Sending event " + authEvent2.getType());
        eventDispatcher2.send(authEvent2);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
