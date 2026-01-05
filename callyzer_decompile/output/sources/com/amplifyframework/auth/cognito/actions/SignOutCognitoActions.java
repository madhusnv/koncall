package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
import android.net.Uri;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.HostedUIClient;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.SignOutActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignOutCognitoActions implements SignOutActions {
    public static final SignOutCognitoActions INSTANCE = new SignOutCognitoActions();

    private SignOutCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action buildRevokeTokenErrorAction(final SignOutEvent.EventType.SignOutGloballyError event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "BuildRevokeTokenError";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$buildRevokeTokenErrorAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.SignOutGloballyError $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43767id;

            {
                this.$event$inlined = event;
                this.f43767id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SignOutEvent signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$event$inlined.getSignedInData(), this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getRefreshToken(), new Exception("RevokeToken not attempted because GlobalSignOut failed."))), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", signOutEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signOutEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43767id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action globalSignOutAction(SignOutEvent.EventType.SignOutGlobally event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1("GlobalSignOut", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action hostedUISignOutAction(final SignOutEvent.EventType.InvokeHostedUISignOut event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "HostedUISignOut";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$hostedUISignOutAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.InvokeHostedUISignOut $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43769id;

            {
                this.$event$inlined = event;
                this.f43769id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) throws InvalidOauthConfigurationException {
                Uri uriCreateSignOutUri$aws_auth_cognito_release;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                try {
                } catch (Exception e2) {
                    authEnvironment.getLogger().warn("Failed to sign out web ui.", e2);
                    HostedUIClient hostedUIClient = authEnvironment.getHostedUIClient();
                    HostedUIErrorData hostedUIErrorData = new HostedUIErrorData((hostedUIClient == null || (uriCreateSignOutUri$aws_auth_cognito_release = hostedUIClient.createSignOutUri$aws_auth_cognito_release()) == null) ? null : uriCreateSignOutUri$aws_auth_cognito_release.toString(), e2);
                    SignOutEvent signOutEvent = this.$event$inlined.getSignOutData().getGlobalSignOut() ? new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(this.$event$inlined.getSignedInData(), hostedUIErrorData), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.RevokeToken(this.$event$inlined.getSignedInData(), hostedUIErrorData, null, 4, null), null, 2, null);
                    AbstractC0030c.m132w(id2, " Sending event ", signOutEvent.getType(), authEnvironment.getLogger());
                    eventDispatcher.send(signOutEvent);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                String browserPackage = this.$event$inlined.getSignOutData().getBrowserPackage();
                if (browserPackage == null) {
                    SignInMethod signInMethod = this.$event$inlined.getSignedInData().getSignInMethod();
                    SignInMethod.HostedUI hostedUI = signInMethod instanceof SignInMethod.HostedUI ? (SignInMethod.HostedUI) signInMethod : null;
                    browserPackage = hostedUI != null ? hostedUI.getBrowserPackage() : null;
                }
                authEnvironment.getHostedUIClient().launchCustomTabsSignOut(browserPackage);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43769id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action localSignOutAction(final SignOutEvent.EventType.SignOutLocally event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "LocalSignOut";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$localSignOutAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.SignOutLocally $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43770id;

            {
                this.$event$inlined = event;
                this.f43770id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                SignedInData signedInData = this.$event$inlined.getSignedInData();
                SignOutEvent signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignedOutSuccess(new SignedOutData(signedInData != null ? signedInData.getUsername() : null, this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), this.$event$inlined.getRevokeTokenErrorData())), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", signOutEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(signOutEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43770id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action revokeTokenAction(SignOutEvent.EventType.RevokeToken event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1("RevokeTokens", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SignOutActions
    public Action userCancelledAction(final SignOutEvent.EventType.UserCancelled event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "UserCancelledSignOut";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$userCancelledAction$$inlined$invoke$1
            final /* synthetic */ SignOutEvent.EventType.UserCancelled $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43772id;

            {
                this.$event$inlined = event;
                this.f43772id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignOut(this.$event$inlined.getSignedInData(), DeviceMetadata.Empty.INSTANCE), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authenticationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authenticationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43772id;
            }
        };
    }
}
