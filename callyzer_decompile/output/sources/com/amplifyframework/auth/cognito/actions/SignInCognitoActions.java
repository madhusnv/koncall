package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
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
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInCognitoActions implements SignInActions {
    public static final SignInCognitoActions INSTANCE = new SignInCognitoActions();
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action autoSignInAction(SignInEvent.EventType.InitiateAutoSignIn event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignInCognitoActions$autoSignInAction$$inlined$invoke$1("AutoSignIn", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action confirmDevice(SignInEvent.EventType.ConfirmDevice event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignInCognitoActions$confirmDevice$$inlined$invoke$1("ConfirmDevice", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initResolveChallenge(final SignInEvent.EventType.ReceivedChallenge event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitResolveChallenge";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initResolveChallenge$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.ReceivedChallenge $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43757id;

            {
                this.$event$inlined = event;
                this.f43757id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SignInChallengeEvent signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.WaitForAnswer(this.$event$inlined.getChallenge(), this.$event$inlined.getSignInMethod(), true), null, 2, 0 == true ? 1 : 0);
                AbstractC0030c.m132w(id2, " Sending event ", signInChallengeEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signInChallengeEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43757id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initiateTOTPSetupAction(final SignInEvent.EventType.InitiateTOTPSetup event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "initiateTOTPSetup";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initiateTOTPSetupAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateTOTPSetup $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43758id;

            {
                this.$event$inlined = event;
                this.f43758id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SetupTOTPEvent setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.SetupTOTP(this.$event$inlined.getSignInTOTPSetupData(), this.$event$inlined.getChallengeParams(), this.$event$inlined.getSignInMethod()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", setupTOTPEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(setupTOTPEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43758id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action initiateWebAuthnSignInAction(final SignInEvent.EventType.InitiateWebAuthnSignIn event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "initiateWebAuthnSignIn";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$initiateWebAuthnSignInAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateWebAuthnSignIn $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43759id;

            {
                this.$event$inlined = event;
                this.f43759id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting excution", authEnvironment.getLogger());
                WebAuthnSignInContext signInContext = this.$event$inlined.getSignInContext();
                WebAuthnEvent webAuthnEvent = signInContext.getRequestJson() == null ? new WebAuthnEvent(new WebAuthnEvent.EventType.FetchCredentialOptions(signInContext), null, 2, null) : new WebAuthnEvent(new WebAuthnEvent.EventType.AssertCredentialOptions(signInContext), null, 2, null);
                AbstractC0030c.m132w(id2, " sending event ", webAuthnEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(webAuthnEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43759id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthAction(final SignInEvent.EventType.InitiateSignInWithCustom event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithCustom $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43760id;

            {
                this.$event$inlined = event;
                this.f43760id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                CustomSignInEvent customSignInEvent = new CustomSignInEvent(new CustomSignInEvent.EventType.InitiateCustomSignIn(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", customSignInEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(customSignInEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43760id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startCustomAuthWithSRPAction(final SignInEvent.EventType.InitiateCustomSignInWithSRP event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartCustomSRPAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startCustomAuthWithSRPAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateCustomSignInWithSRP $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43761id;

            {
                this.$event$inlined = event;
                this.f43761id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRPWithCustom(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", sRPEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(sRPEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43761id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startDeviceSRPAuthAction(final SignInEvent.EventType.InitiateSignInWithDeviceSRP event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartDeviceSRPAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startDeviceSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithDeviceSRP $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43762id;

            {
                this.$event$inlined = event;
                this.f43762id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                DeviceSRPSignInEvent deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge(this.$event$inlined.getUsername(), this.$event$inlined.getMetadata()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", deviceSRPSignInEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(deviceSRPSignInEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43762id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startHostedUIAuthAction(final SignInEvent.EventType.InitiateHostedUISignIn event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartHostedUIAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startHostedUIAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateHostedUISignIn $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43763id;

            {
                this.$event$inlined = event;
                this.f43763id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ShowHostedUI(this.$event$inlined.getHostedUISignInData()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", hostedUIEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(hostedUIEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43763id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startMigrationAuthAction(final SignInEvent.EventType.InitiateMigrateAuth event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartMigrationAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startMigrationAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43764id;

            {
                this.$event$inlined = event;
                this.f43764id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata(), this.$event$inlined.getAuthFlowType(), null, 16, null), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", signInEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signInEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43764id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignInActions
    public Action startSRPAuthAction(final SignInEvent.EventType.InitiateSignInWithSRP event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "StartSRPAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$startSRPAuthAction$$inlined$invoke$1
            final /* synthetic */ SignInEvent.EventType.InitiateSignInWithSRP $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43765id;

            {
                this.$event$inlined = event;
                this.f43765id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.InitiateSRP(this.$event$inlined.getUsername(), this.$event$inlined.getPassword(), this.$event$inlined.getMetadata(), this.$event$inlined.getAuthFlowType(), this.$event$inlined.getRespondToAuthChallenge()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", sRPEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(sRPEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43765id;
            }
        };
    }
}
