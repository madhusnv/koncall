package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
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
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FetchAuthSessionCognitoActions implements FetchAuthSessionActions {
    public static final FetchAuthSessionCognitoActions INSTANCE = new FetchAuthSessionCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_REFRESH_TOKEN = "REFRESH_TOKEN";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";

    private FetchAuthSessionCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchAWSCredentialsAction(String identityId, LoginsMapProvider loginsMap) {
        AbstractC4154l.m8923f(identityId, "identityId");
        AbstractC4154l.m8923f(loginsMap, "loginsMap");
        Action.Companion companion = Action.Companion;
        return new C1080xcb8663a9("FetchAWSCredentials", identityId, loginsMap);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action fetchIdentityAction(LoginsMapProvider loginsMap) {
        AbstractC4154l.m8923f(loginsMap, "loginsMap");
        Action.Companion companion = Action.Companion;
        return new C1081xdf16f428("FetchIdentity", loginsMap);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionEstablishedAction(final String identityId, final AWSCredentials awsCredentials) {
        AbstractC4154l.m8923f(identityId, "identityId");
        AbstractC4154l.m8923f(awsCredentials, "awsCredentials");
        Action.Companion companion = Action.Companion;
        final String str = "NotifySessionEstablished";
        return new Action(str, identityId, awsCredentials) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionEstablishedAction$$inlined$invoke$1
            final /* synthetic */ AWSCredentials $awsCredentials$inlined;
            final /* synthetic */ String $identityId$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43741id;

            {
                this.$identityId$inlined = identityId;
                this.$awsCredentials$inlined = awsCredentials;
                this.f43741id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Fetched(this.$identityId$inlined, this.$awsCredentials$inlined), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43741id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action notifySessionRefreshedAction(final AmplifyCredential amplifyCredential) {
        AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
        Action.Companion companion = Action.Companion;
        final String str = "NotifySessionRefreshed";
        return new Action(str, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$notifySessionRefreshedAction$$inlined$invoke$1
            final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43742id;

            {
                this.$amplifyCredential$inlined = amplifyCredential;
                this.f43742id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.Refreshed(this.$amplifyCredential$inlined), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43742id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshAuthSessionAction(final LoginsMapProvider logins) {
        AbstractC4154l.m8923f(logins, "logins");
        Action.Companion companion = Action.Companion;
        final String str = "RefreshAuthSession";
        return new Action(str, logins) { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshAuthSessionAction$$inlined$invoke$1
            final /* synthetic */ LoginsMapProvider $logins$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43743id;

            {
                this.$logins$inlined = logins;
                this.f43743id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                FetchAuthSessionEvent fetchAuthSessionEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(this.$logins$inlined), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", fetchAuthSessionEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(fetchAuthSessionEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43743id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions
    public Action refreshUserPoolTokensAction(SignedInData signedInData) {
        AbstractC4154l.m8923f(signedInData, "signedInData");
        Action.Companion companion = Action.Companion;
        return new C1085xf78af94c("RefreshUserPoolTokens", signedInData);
    }
}
