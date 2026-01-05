package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
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
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUICognitoActions implements HostedUIActions {
    public static final HostedUICognitoActions INSTANCE = new HostedUICognitoActions();

    private HostedUICognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action fetchHostedUISignInToken(final HostedUIEvent.EventType.FetchToken event, final String str) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str2 = "InitHostedUITokenFetch";
        return new Action(str2, event, str) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$fetchHostedUISignInToken$$inlined$invoke$1
            final /* synthetic */ String $browserPackage$inlined;
            final /* synthetic */ HostedUIEvent.EventType.FetchToken $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43745id;

            {
                this.$event$inlined = event;
                this.$browserPackage$inlined = str;
                this.f43745id = str2 == null ? super.getId() : str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) throws InvalidOauthConfigurationException {
                AuthenticationEvent authenticationEvent;
                String claim;
                String claim2;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                int i10 = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                try {
                } catch (Exception e2) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e2), null, 2, null);
                    AbstractC0030c.m132w(id2, " Sending event ", hostedUIEvent.getType(), authEnvironment.getLogger());
                    eventDispatcher.send(hostedUIEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(objArr4 == true ? 1 : 0, 1, objArr3 == true ? 1 : 0), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
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
                authEnvironment.getLogger().verbose(id2 + " Sending event " + hostedUIEvent2.getType());
                eventDispatcher.send(hostedUIEvent2);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signedInData, DeviceMetadata.Empty.INSTANCE), date, i10, objArr5 == true ? 1 : 0);
                AbstractC0030c.m132w(id2, " Sending event ", authenticationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authenticationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43745id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.HostedUIActions
    public Action showHostedUI(final HostedUIEvent.EventType.ShowHostedUI event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitHostedUIAuth";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.HostedUICognitoActions$showHostedUI$$inlined$invoke$1
            final /* synthetic */ HostedUIEvent.EventType.ShowHostedUI $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43746id;

            {
                this.$event$inlined = event;
                this.f43746id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) throws InvalidOauthConfigurationException {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                try {
                } catch (Exception e2) {
                    HostedUIEvent hostedUIEvent = new HostedUIEvent(new HostedUIEvent.EventType.ThrowError(e2), null, 2, null);
                    AbstractC0030c.m132w(id2, " Sending event ", hostedUIEvent.getType(), authEnvironment.getLogger());
                    eventDispatcher.send(hostedUIEvent);
                    AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                    AbstractC0030c.m132w(id2, " Sending event ", authenticationEvent.getType(), authEnvironment.getLogger());
                    eventDispatcher.send(authenticationEvent);
                }
                if (authEnvironment.getHostedUIClient() == null) {
                    throw new InvalidOauthConfigurationException();
                }
                authEnvironment.getHostedUIClient().launchCustomTabsSignIn(this.$event$inlined.getHostedUISignInData().getHostedUIOptions());
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43746id;
            }
        };
    }
}
