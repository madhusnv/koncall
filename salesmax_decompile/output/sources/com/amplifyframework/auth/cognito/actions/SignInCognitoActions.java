package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.SignInActions;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignInCognitoActions implements SignInActions {
    public static final SignInCognitoActions INSTANCE = new SignInCognitoActions();
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action autoSignInAction(SignInEvent.EventType.InitiateAutoSignIn initiateAutoSignIn) {
        sq8.m48649h(initiateAutoSignIn, "event");
        Action.Companion companion = Action.Companion;
        return new SignInCognitoActions$autoSignInAction$$inlined$invoke$1("AutoSignIn", initiateAutoSignIn);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action confirmDevice(SignInEvent.EventType.ConfirmDevice confirmDevice) {
        sq8.m48649h(confirmDevice, "event");
        Action.Companion companion = Action.Companion;
        return new SignInCognitoActions$confirmDevice$$inlined$invoke$1("ConfirmDevice", confirmDevice);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initResolveChallenge(final SignInEvent.EventType.ReceivedChallenge receivedChallenge) {
        sq8.m48649h(receivedChallenge, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitResolveChallenge";
        return new Action(str, receivedChallenge) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initResolveChallenge$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.ReceivedChallenge $event$inlined;
            private final String id;

            {
                this.$event$inlined = receivedChallenge;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInChallengeEvent signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.WaitForAnswer(this.$event$inlined.getChallenge(), this.$event$inlined.getSignInMethod(), true), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInChallengeEvent.getType());
                eventDispatcher.send(signInChallengeEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initiateTOTPSetupAction(final SignInEvent.EventType.InitiateTOTPSetup initiateTOTPSetup) {
        sq8.m48649h(initiateTOTPSetup, "event");
        Action.Companion companion = Action.Companion;
        final String str = "initiateTOTPSetup";
        return new Action(str, initiateTOTPSetup) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initiateTOTPSetupAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateTOTPSetup $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateTOTPSetup;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SetupTOTPEvent setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.SetupTOTP(this.$event$inlined.getSignInTOTPSetupData(), this.$event$inlined.getChallengeParams(), this.$event$inlined.getSignInMethod()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                eventDispatcher.send(setupTOTPEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initiateWebAuthnSignInAction(final SignInEvent.EventType.InitiateWebAuthnSignIn initiateWebAuthnSignIn) {
        sq8.m48649h(initiateWebAuthnSignIn, "event");
        Action.Companion companion = Action.Companion;
        final String str = "initiateWebAuthnSignIn";
        return new Action(str, initiateWebAuthnSignIn) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initiateWebAuthnSignInAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateWebAuthnSignIn $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateWebAuthnSignIn;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting excution");
                WebAuthnSignInContext signInContext = this.$event$inlined.getSignInContext();
                WebAuthnEvent webAuthnEvent = signInContext.getRequestJson() == null ? new WebAuthnEvent(new WebAuthnEvent.EventType.FetchCredentialOptions(signInContext), null, 2, null) : new WebAuthnEvent(new WebAuthnEvent.EventType.AssertCredentialOptions(signInContext), null, 2, null);
                authEnvironment.getLogger().verbose(id + " sending event " + webAuthnEvent.getType());
                eventDispatcher.send(webAuthnEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthAction(final SignInEvent.EventType.InitiateSignInWithCustom initiateSignInWithCustom) {
        sq8.m48649h(initiateSignInWithCustom, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomAuth";
        return new Action(str, initiateSignInWithCustom) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithCustom $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateSignInWithCustom;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                CustomSignInEvent customSignInEvent = new CustomSignInEvent(new CustomSignInEvent.EventType.InitiateCustomSignIn(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                eventDispatcher.send(customSignInEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthWithSRPAction(final SignInEvent.EventType.InitiateCustomSignInWithSRP initiateCustomSignInWithSRP) {
        sq8.m48649h(initiateCustomSignInWithSRP, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomSRPAuth";
        return new Action(str, initiateCustomSignInWithSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthWithSRPAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateCustomSignInWithSRP $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateCustomSignInWithSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRPWithCustom(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                eventDispatcher.send(sRPEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startDeviceSRPAuthAction(final SignInEvent.EventType.InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP) {
        sq8.m48649h(initiateSignInWithDeviceSRP, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartDeviceSRPAuth";
        return new Action(str, initiateSignInWithDeviceSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startDeviceSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithDeviceSRP $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateSignInWithDeviceSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                DeviceSRPSignInEvent deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + deviceSRPSignInEvent.getType());
                eventDispatcher.send(deviceSRPSignInEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startHostedUIAuthAction(final SignInEvent.EventType.InitiateHostedUISignIn initiateHostedUISignIn) {
        sq8.m48649h(initiateHostedUISignIn, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartHostedUIAuth";
        return new Action(str, initiateHostedUISignIn) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startHostedUIAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateHostedUISignIn $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateHostedUISignIn;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ShowHostedUI(this.$event$inlined.getHostedUISignInData()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                eventDispatcher.send(hostedUIEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startMigrationAuthAction(final SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        sq8.m48649h(initiateMigrateAuth, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartMigrationAuth";
        return new Action(str, initiateMigrateAuth) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startMigrationAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateMigrateAuth;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata(), this.$event$inlined.getAuthFlowType(), null, 16, null), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
                eventDispatcher.send(signInEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startSRPAuthAction(final SignInEvent.EventType.InitiateSignInWithSRP initiateSignInWithSRP) {
        sq8.m48649h(initiateSignInWithSRP, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartSRPAuth";
        return new Action(str, initiateSignInWithSRP) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithSRP $event$inlined;
            private final String id;

            {
                this.$event$inlined = initiateSignInWithSRP;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRP(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata(), this.$event$inlined.getAuthFlowType(), this.$event$inlined.getRespondToAuthChallenge()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                eventDispatcher.send(sRPEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
