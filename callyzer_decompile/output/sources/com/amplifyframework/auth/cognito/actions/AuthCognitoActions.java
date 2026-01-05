package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.AuthActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthCognitoActions implements AuthActions {
    public static final AuthCognitoActions INSTANCE = new AuthCognitoActions();

    private AuthCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthConfigurationAction(AuthEvent.EventType.ConfigureAuth event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1053x22220602("InitAuthConfig");
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthenticationConfigurationAction(final AuthEvent.EventType.ConfigureAuthentication event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthNConfig";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthenticationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType.ConfigureAuthentication $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43718id;

            {
                this.$event$inlined = event;
                this.f43718id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.Configure(this.$event$inlined.getConfiguration(), this.$event$inlined.getStoredCredentials()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authenticationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authenticationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43718id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthorizationConfigurationAction(final AuthEvent.EventType event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthZConfig";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43719id;

            {
                this.$event$inlined = event;
                this.f43719id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AuthorizationEvent authorizationEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                C1056xf03b8d3b c1056xf03b8d3b = new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // ex.InterfaceC2139c
                    public final AuthorizationEvent invoke(AmplifyCredential credentials) {
                        AbstractC4154l.m8923f(credentials, "credentials");
                        int i10 = 2;
                        return credentials.equals(AmplifyCredential.Empty.INSTANCE) ? new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, i10, 0 == true ? 1 : 0) : new AuthorizationEvent(new AuthorizationEvent.EventType.CachedCredentialsAvailable(credentials), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
                    }
                };
                AuthEvent.EventType eventType = this.$event$inlined;
                if (eventType instanceof AuthEvent.EventType.ConfiguredAuthentication) {
                    authorizationEvent = (AuthorizationEvent) c1056xf03b8d3b.invoke((Object) ((AuthEvent.EventType.ConfiguredAuthentication) eventType).getStoredCredentials());
                } else if (eventType instanceof AuthEvent.EventType.ConfigureAuthorization) {
                    authorizationEvent = (AuthorizationEvent) c1056xf03b8d3b.invoke((Object) ((AuthEvent.EventType.ConfigureAuthorization) eventType).getStoredCredentials());
                } else {
                    authorizationEvent = new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, 2, 0 == true ? 1 : 0);
                }
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43719id;
            }
        };
    }
}
