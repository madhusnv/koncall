package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ValidationException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.actions.AuthenticationActions;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import p001o.n64;
import p001o.sq8;
import p001o.szb;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AuthenticationCognitoActions implements AuthenticationActions {
    public static final AuthenticationCognitoActions INSTANCE = new AuthenticationCognitoActions();

    private AuthenticationCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action configureAuthenticationAction(AuthenticationEvent.EventType.Configure configure) {
        sq8.m48649h(configure, "event");
        Action.Companion companion = Action.Companion;
        return new C10441xab1a6752("ConfigureAuthN", configure);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignInAction(final AuthenticationEvent.EventType.SignInRequested signInRequested) {
        sq8.m48649h(signInRequested, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitiateSignInAction";
        return new Action(str, signInRequested) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignInAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignInRequested $event$inlined;
            private final String id;

            {
                this.$event$inlined = signInRequested;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                StateMachineEvent signInEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignInData signInData = this.$event$inlined.getSignInData();
                if (signInData instanceof SignInData.SRPSignInData) {
                    SignInData.SRPSignInData sRPSignInData = (SignInData.SRPSignInData) signInData;
                    signInEvent = (sRPSignInData.getUsername() == null || sRPSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateSignInWithSRP(sRPSignInData.getUsername(), sRPSignInData.getPassword(), sRPSignInData.getMetadata(), sRPSignInData.getAuthFlowType(), null, 16, null), null, 2, null);
                } else if (signInData instanceof SignInData.CustomAuthSignInData) {
                    SignInData.CustomAuthSignInData customAuthSignInData = (SignInData.CustomAuthSignInData) signInData;
                    signInEvent = customAuthSignInData.getUsername() != null ? new SignInEvent(new SignInEvent.EventType.InitiateSignInWithCustom(customAuthSignInData.getUsername(), customAuthSignInData.getMetadata()), null, 2, null) : new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null);
                } else if (signInData instanceof SignInData.CustomSRPAuthSignInData) {
                    SignInData.CustomSRPAuthSignInData customSRPAuthSignInData = (SignInData.CustomSRPAuthSignInData) signInData;
                    signInEvent = (customSRPAuthSignInData.getUsername() == null || customSRPAuthSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username can not be empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateCustomSignInWithSRP(customSRPAuthSignInData.getUsername(), customSRPAuthSignInData.getPassword(), customSRPAuthSignInData.getMetadata()), null, 2, null);
                } else if (signInData instanceof SignInData.HostedUISignInData) {
                    signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateHostedUISignIn((SignInData.HostedUISignInData) signInData), null, 2, null);
                } else if (signInData instanceof SignInData.MigrationAuthSignInData) {
                    SignInData.MigrationAuthSignInData migrationAuthSignInData = (SignInData.MigrationAuthSignInData) signInData;
                    signInEvent = (migrationAuthSignInData.getUsername() == null || migrationAuthSignInData.getPassword() == null) ? new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username or password empty", null, 4, null)), null, 2, null) : new SignInEvent(new SignInEvent.EventType.InitiateMigrateAuth(migrationAuthSignInData.getUsername(), migrationAuthSignInData.getPassword(), migrationAuthSignInData.getMetadata(), migrationAuthSignInData.getAuthFlowType(), null, 16, null), null, 2, null);
                } else if (signInData instanceof SignInData.UserAuthSignInData) {
                    SignInData.UserAuthSignInData userAuthSignInData = (SignInData.UserAuthSignInData) signInData;
                    signInEvent = userAuthSignInData.getUsername() != null ? new SignInEvent(new SignInEvent.EventType.InitiateUserAuth(userAuthSignInData.getUsername(), userAuthSignInData.getPreferredChallenge(), userAuthSignInData.getCallingActivity(), userAuthSignInData.getMetadata()), null, 2, null) : new AuthenticationEvent(new AuthenticationEvent.EventType.ThrowError(new ValidationException("Sign in failed.", "username cannot be empty", null, 4, null)), null, 2, null);
                } else {
                    if (!(signInData instanceof SignInData.AutoSignInData)) {
                        throw new szb();
                    }
                    signInEvent = new SignInEvent(new SignInEvent.EventType.InitiateAutoSignIn((SignInData.AutoSignInData) signInData), null, 2, null);
                }
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

    @Override // com.amplifyframework.statemachine.codegen.actions.AuthenticationActions
    public Action initiateSignOutAction(final AuthenticationEvent.EventType.SignOutRequested signOutRequested, final SignedInData signedInData) {
        sq8.m48649h(signOutRequested, "event");
        Action.Companion companion = Action.Companion;
        final String str = "InitSignOut";
        return new Action(str, signedInData, signOutRequested) { // from class: com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions$initiateSignOutAction$$inlined$invoke$1
            final /* synthetic */ AuthenticationEvent.EventType.SignOutRequested $event$inlined;
            final /* synthetic */ SignedInData $signedInData$inlined;
            private final String id;

            {
                this.$signedInData$inlined = signedInData;
                this.$event$inlined = signOutRequested;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                SignOutEvent signOutEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                SignedInData signedInData2 = this.$signedInData$inlined;
                if (signedInData2 == null || !(signedInData2.getSignInMethod() instanceof SignInMethod.HostedUI)) {
                    SignedInData signedInData3 = this.$signedInData$inlined;
                    signOutEvent = (signedInData3 == null || !sq8.m48644c(signedInData3.getSignInMethod(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN)) || authEnvironment.getHostedUIClient() == null) ? (this.$signedInData$inlined == null || !this.$event$inlined.getSignOutData().getGlobalSignOut()) ? (this.$signedInData$inlined == null || this.$event$inlined.getSignOutData().getGlobalSignOut()) ? new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$signedInData$inlined, null, null, null, 14, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.RevokeToken(this.$signedInData$inlined, null, null, 6, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.SignOutGlobally(this.$signedInData$inlined, null, 2, null), null, 2, null) : new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                } else {
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.InvokeHostedUISignOut(this.$event$inlined.getSignOutData(), this.$signedInData$inlined), null, 2, null);
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher.send(signOutEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
