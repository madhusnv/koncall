package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidOauthConfigurationException;
import com.amplifyframework.auth.cognito.helpers.JWTParser;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.HostedUIActions;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import java.util.Date;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class HostedUICognitoActions implements HostedUIActions {
    public static final HostedUICognitoActions INSTANCE = new HostedUICognitoActions();

    private HostedUICognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action fetchHostedUISignInToken(final HostedUIEvent.EventType.FetchToken fetchToken, final String str) {
        sq8.m48649h(fetchToken, "event");
        Action.Companion companion = Action.Companion;
        final String str2 = "InitHostedUITokenFetch";
        return new Action(str2, fetchToken, str) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$fetchHostedUISignInToken$$inlined$invoke$1
            final /* synthetic */ String $browserPackage$inlined;
            final /* synthetic */ HostedUIEvent.EventType.FetchToken $event$inlined;
            private final String id;

            {
                this.$event$inlined = fetchToken;
                this.$browserPackage$inlined = str;
                this.id = str2 == null ? Action.DefaultImpls.getId(this) : str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws InvalidOauthConfigurationException {
                AuthenticationEvent authenticationEvent;
                String claim;
                String claim2;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                int i = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                try {
                } catch (Exception e) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                    eventDispatcher.send(hostedUIEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(objArr4 == true ? 1 : 0, 1, objArr3 == true ? 1 : 0), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                CognitoUserPoolTokens cognitoUserPoolTokensFetchToken = authEnvironment.getHostedUIClient().fetchToken(this.$event$inlined.getUri());
                String accessToken = cognitoUserPoolTokensFetchToken.getAccessToken();
                String str3 = (accessToken == null || (claim2 = JWTParser.INSTANCE.getClaim(accessToken, "sub")) == null) ? "" : claim2;
                String accessToken2 = cognitoUserPoolTokensFetchToken.getAccessToken();
                SignedInData signedInData = new SignedInData(str3, (accessToken2 == null || (claim = JWTParser.INSTANCE.getClaim(accessToken2, "username")) == null) ? "" : claim, new Date(), new SignInMethod.HostedUI(this.$browserPackage$inlined), cognitoUserPoolTokensFetchToken);
                HostedUIEvent hostedUIEvent2 = new HostedUIEvent(HostedUIEvent.EventType.TokenFetched.INSTANCE, null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent2.getType());
                eventDispatcher.send(hostedUIEvent2);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), date, i, objArr5 == true ? 1 : 0);
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

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action showHostedUI(final HostedUIEvent.EventType.ShowHostedUI showHostedUI) {
        sq8.m48649h(showHostedUI, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitHostedUIAuth";
        return new Action(str, showHostedUI) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$showHostedUI$$inlined$invoke$1
            final /* synthetic */ HostedUIEvent.EventType.ShowHostedUI $event$inlined;
            private final String id;

            {
                this.$event$inlined = showHostedUI;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws InvalidOauthConfigurationException {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                } catch (Exception e) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + hostedUIEvent.getType());
                    eventDispatcher.send(hostedUIEvent);
                    AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher.send(authenticationEvent);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                authEnvironment.getHostedUIClient().launchCustomTabsSignIn(this.$event$inlined.getHostedUISignInData().getHostedUIOptions());
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
