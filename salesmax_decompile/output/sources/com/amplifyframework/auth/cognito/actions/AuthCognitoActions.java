package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.AuthActions;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AuthCognitoActions implements AuthActions {
    public static final AuthCognitoActions INSTANCE = new AuthCognitoActions();

    private AuthCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthConfigurationAction(AuthEvent.EventType.ConfigureAuth configureAuth) {
        sq8.m48649h(configureAuth, "event");
        Action.Companion companion = Action.Companion;
        return new C10437x22220602("InitAuthConfig");
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthenticationConfigurationAction(final AuthEvent.EventType.ConfigureAuthentication configureAuthentication) {
        sq8.m48649h(configureAuthentication, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthNConfig";
        return new Action(str, configureAuthentication) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthenticationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType.ConfigureAuthentication $event$inlined;
            private final String id;

            {
                this.$event$inlined = configureAuthentication;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.Configure(this.$event$inlined.getConfiguration(), this.$event$inlined.getStoredCredentials()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthActions
    public Action initializeAuthorizationConfigurationAction(final AuthEvent.EventType eventType) {
        sq8.m48649h(eventType, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitAuthZConfig";
        return new Action(str, eventType) { // from class: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$$inlined$invoke$1
            final /* synthetic */ AuthEvent.EventType $event$inlined;
            private final String id;

            {
                this.$event$inlined = eventType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                AuthorizationEvent authorizationEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                C10440xf03b8d3b c10440xf03b8d3b = C10440xf03b8d3b.INSTANCE;
                AuthEvent.EventType eventType2 = this.$event$inlined;
                if (eventType2 instanceof AuthEvent.EventType.ConfiguredAuthentication) {
                    authorizationEvent = (AuthorizationEvent) c10440xf03b8d3b.invoke((Object) ((AuthEvent.EventType.ConfiguredAuthentication) eventType2).getStoredCredentials());
                } else if (eventType2 instanceof AuthEvent.EventType.ConfigureAuthorization) {
                    authorizationEvent = (AuthorizationEvent) c10440xf03b8d3b.invoke((Object) ((AuthEvent.EventType.ConfigureAuthorization) eventType2).getStoredCredentials());
                } else {
                    authorizationEvent = new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, 2, 0 == true ? 1 : 0);
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher.send(authorizationEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
