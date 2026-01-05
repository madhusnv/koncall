package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.actions.AuthorizationActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthorizationCognitoActions implements AuthorizationActions {
    public static final AuthorizationCognitoActions INSTANCE = new AuthorizationCognitoActions();

    private AuthorizationCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action configureAuthorizationAction() {
        Action.Companion companion = Action.Companion;
        final String str = "ConfigureAuthZ";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$configureAuthorizationAction$$inlined$invoke$1

            /* renamed from: id, reason: collision with root package name */
            private final String f43723id;

            {
                this.f43723id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                AuthEvent authEvent = new AuthEvent(AuthEvent.EventType.ConfiguredAuthorization.INSTANCE, null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43723id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action initializeFederationToIdentityPool(final FederatedToken federatedToken, final String str) {
        AbstractC4154l.m8923f(federatedToken, "federatedToken");
        Action.Companion companion = Action.Companion;
        final String str2 = "InitializeFederationToIdentityPool";
        return new Action(str2, federatedToken, str) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$initializeFederationToIdentityPool$$inlined$invoke$1
            final /* synthetic */ String $developerProvidedIdentityId$inlined;
            final /* synthetic */ FederatedToken $federatedToken$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43724id;

            {
                this.$federatedToken$inlined = federatedToken;
                this.$developerProvidedIdentityId$inlined = str;
                this.f43724id = str2 == null ? super.getId() : str2;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                LoginsMapProvider.AuthProviderLogins authProviderLogins = new LoginsMapProvider.AuthProviderLogins(this.$federatedToken$inlined);
                String str3 = this.$developerProvidedIdentityId$inlined;
                FetchAuthSessionEvent fetchAuthSessionEvent = str3 != null ? new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchAwsCredentials(str3, authProviderLogins), null, 2, null) : new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(authProviderLogins), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", fetchAuthSessionEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(fetchAuthSessionEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43724id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action initializeFetchAuthSession(final SignedInData signedInData) {
        AbstractC4154l.m8923f(signedInData, "signedInData");
        Action.Companion companion = Action.Companion;
        final String str = "InitFetchAuthSession";
        return new Action(str, signedInData) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$initializeFetchAuthSession$$inlined$invoke$1
            final /* synthetic */ SignedInData $signedInData$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43725id;

            {
                this.$signedInData$inlined = signedInData;
                this.f43725id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                StateMachineEvent authorizationEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                if ((userPool != null ? userPool.getPoolId() : null) == null) {
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new ConfigurationException("User Pool not configured.", "Please check amplifyconfiguration.json file.", null, 4, null)), null, 2, null);
                } else {
                    IdentityPoolConfiguration identityPool = authEnvironment.getConfiguration().getIdentityPool();
                    authorizationEvent = (identityPool != null ? identityPool.getPoolId() : null) == null ? new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new ConfigurationException("Identity Pool not configured.", "Please check amplifyconfiguration.json file.", null, 4, null)), null, 2, null) : this.$signedInData$inlined.getCognitoUserPoolTokens().getIdToken() == null ? new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new ConfigurationException("Identity token is null.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null)), null, 2, null) : new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(new LoginsMapProvider.CognitoUserPoolLogins(authEnvironment.getConfiguration().getUserPool().getRegion(), authEnvironment.getConfiguration().getUserPool().getPoolId(), this.$signedInData$inlined.getCognitoUserPoolTokens().getIdToken())), null, 2, null);
                }
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43725id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action initializeFetchUnAuthSession() {
        Action.Companion companion = Action.Companion;
        final String str = "InitFetchUnAuthSession";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$initializeFetchUnAuthSession$$inlined$invoke$1

            /* renamed from: id, reason: collision with root package name */
            private final String f43726id;

            {
                this.f43726id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                IdentityPoolConfiguration identityPool = authEnvironment.getConfiguration().getIdentityPool();
                StateMachineEvent authorizationEvent = (identityPool == null || identityPool.getPoolId() == null) ? new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new ConfigurationException("Identity Pool not configured.", "Please check amplifyconfiguration.json file.", null, 4, null)), null, 2, null) : new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchIdentity(new LoginsMapProvider.UnAuthLogins(null, 1, null)), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", authorizationEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(authorizationEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43726id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action initiateDeleteUser(final DeleteUserEvent.EventType.DeleteUser event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitiateDeleteUser";
        return new Action(str, event) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$initiateDeleteUser$$inlined$invoke$1
            final /* synthetic */ DeleteUserEvent.EventType.DeleteUser $event$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43727id;

            {
                this.$event$inlined = event;
                this.f43727id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id2 + " Starting execution");
                DeleteUserEvent deleteUserEvent = new DeleteUserEvent(new DeleteUserEvent.EventType.DeleteUser(this.$event$inlined.getAccessToken()), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", deleteUserEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(deleteUserEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43727id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action initiateRefreshSessionAction(final AmplifyCredential amplifyCredential) {
        AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
        Action.Companion companion = Action.Companion;
        final String str = "InitiateRefreshSession";
        return new Action(str, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$initiateRefreshSessionAction$$inlined$invoke$1
            final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43728id;

            {
                this.$amplifyCredential$inlined = amplifyCredential;
                this.f43728id = str == null ? super.getId() : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", authEnvironment.getLogger());
                Object obj = this.$amplifyCredential$inlined;
                StateMachineEvent refreshSessionEvent = obj instanceof AmplifyCredential.UserPoolTypeCredential ? new RefreshSessionEvent(new RefreshSessionEvent.EventType.RefreshUserPoolTokens(((AmplifyCredential.UserPoolTypeCredential) obj).getSignedInData()), null, 2, null) : obj instanceof AmplifyCredential.IdentityPool ? new RefreshSessionEvent(new RefreshSessionEvent.EventType.RefreshUnAuthSession(((AmplifyCredential.IdentityPool) obj).getIdentityId(), new LoginsMapProvider.UnAuthLogins(null, 1, null)), null, 2, null) : obj instanceof AmplifyCredential.IdentityPoolFederated ? new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new Exception("Refreshing credentials from federationToIdentityPool is not supported.")), null, 2, null) : new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new Exception("Credentials empty, cannot refresh.")), null, 2, null);
                AbstractC0030c.m132w(id2, " Sending event ", refreshSessionEvent.getType(), authEnvironment.getLogger());
                eventDispatcher.send(refreshSessionEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43728id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthorizationActions
    public Action persistCredentials(AmplifyCredential amplifyCredential) {
        AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
        Action.Companion companion = Action.Companion;
        return new AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1("PersistCredentials", amplifyCredential);
    }
}
