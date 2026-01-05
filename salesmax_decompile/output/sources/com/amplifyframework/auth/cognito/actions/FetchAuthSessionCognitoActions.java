package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class FetchAuthSessionCognitoActions implements FetchAuthSessionActions {
    public static final FetchAuthSessionCognitoActions INSTANCE = new FetchAuthSessionCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_REFRESH_TOKEN = "REFRESH_TOKEN";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";

    private FetchAuthSessionCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchAWSCredentialsAction(String str, LoginsMapProvider loginsMapProvider) {
        sq8.m48649h(str, "identityId");
        sq8.m48649h(loginsMapProvider, "loginsMap");
        Action.Companion companion = Action.Companion;
        return new C10464xcb8663a9("FetchAWSCredentials", str, loginsMapProvider);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchIdentityAction(LoginsMapProvider loginsMapProvider) {
        sq8.m48649h(loginsMapProvider, "loginsMap");
        Action.Companion companion = Action.Companion;
        return new C10465xdf16f428("FetchIdentity", loginsMapProvider);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionEstablishedAction(final String str, final AWSCredentials aWSCredentials) {
        sq8.m48649h(str, "identityId");
        sq8.m48649h(aWSCredentials, "awsCredentials");
        Action.Companion companion = Action.Companion;
        final String str2 = "NotifySessionEstablished";
        return new Action(str2, str, aWSCredentials) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionEstablishedAction$$inlined$invoke$1
            final /* synthetic */ AWSCredentials $awsCredentials$inlined;
            final /* synthetic */ String $identityId$inlined;
            private final String id;

            {
                this.$identityId$inlined = str;
                this.$awsCredentials$inlined = aWSCredentials;
                this.id = str2 == null ? Action.DefaultImpls.getId(this) : str2;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Fetched(this.$identityId$inlined, this.$awsCredentials$inlined), null, 2, null);
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

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionRefreshedAction(final AmplifyCredential amplifyCredential) {
        sq8.m48649h(amplifyCredential, "amplifyCredential");
        Action.Companion companion = Action.Companion;
        final String str = "NotifySessionRefreshed";
        return new Action(str, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionRefreshedAction$$inlined$invoke$1
            final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;
            private final String id;

            {
                this.$amplifyCredential$inlined = amplifyCredential;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Refreshed(this.$amplifyCredential$inlined), null, 2, null);
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

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshAuthSessionAction(final LoginsMapProvider loginsMapProvider) {
        sq8.m48649h(loginsMapProvider, "logins");
        Action.Companion companion = Action.Companion;
        final String str = "RefreshAuthSession";
        return new Action(str, loginsMapProvider) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshAuthSessionAction$$inlined$invoke$1
            final /* synthetic */ LoginsMapProvider $logins$inlined;
            private final String id;

            {
                this.$logins$inlined = loginsMapProvider;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                FetchAuthSessionEvent fetchAuthSessionEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(this.$logins$inlined), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + fetchAuthSessionEvent.getType());
                eventDispatcher.send(fetchAuthSessionEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshUserPoolTokensAction(SignedInData signedInData) {
        sq8.m48649h(signedInData, "signedInData");
        Action.Companion companion = Action.Companion;
        return new C10469xf78af94c("RefreshUserPoolTokens", signedInData);
    }
}
