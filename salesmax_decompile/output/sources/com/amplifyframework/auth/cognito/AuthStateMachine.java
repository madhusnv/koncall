package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.actions.AuthCognitoActions;
import com.amplifyframework.auth.cognito.actions.AuthenticationCognitoActions;
import com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions;
import com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions;
import com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions;
import com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions;
import com.amplifyframework.auth.cognito.actions.HostedUICognitoActions;
import com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions;
import com.amplifyframework.auth.cognito.actions.SRPCognitoActions;
import com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignOutCognitoActions;
import com.amplifyframework.auth.cognito.actions.SignUpCognitoActions;
import com.amplifyframework.auth.cognito.actions.UserAuthSignInCognitoActions;
import com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.StateMachine;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.CustomSignInState;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.DeviceSRPSignInState;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
import com.amplifyframework.statemachine.codegen.states.HostedUISignInState;
import com.amplifyframework.statemachine.codegen.states.MigrateSignInState;
import com.amplifyframework.statemachine.codegen.states.RefreshSessionState;
import com.amplifyframework.statemachine.codegen.states.SRPSignInState;
import com.amplifyframework.statemachine.codegen.states.SetupTOTPState;
import com.amplifyframework.statemachine.codegen.states.SignInChallengeState;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import com.amplifyframework.statemachine.codegen.states.WebAuthnSignInState;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthStateMachine extends StateMachine<AuthState, Environment> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AuthStateMachine logging(Environment environment) {
            sq8.m48649h(environment, "environment");
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default = StateMachineResolver.DefaultImpls.logging$default(new SRPSignInState.Resolver(SRPCognitoActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default2 = StateMachineResolver.DefaultImpls.logging$default(new CustomSignInState.Resolver(SignInCustomCognitoActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default3 = StateMachineResolver.DefaultImpls.logging$default(new MigrateSignInState.Resolver(MigrateAuthCognitoActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default4 = StateMachineResolver.DefaultImpls.logging$default(new SignInChallengeState.Resolver(SignInChallengeCognitoActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default5 = StateMachineResolver.DefaultImpls.logging$default(new HostedUISignInState.Resolver(HostedUICognitoActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default6 = StateMachineResolver.DefaultImpls.logging$default(new DeviceSRPSignInState.Resolver(DeviceSRPCognitoSignInActions.INSTANCE), null, null, 3, null);
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default7 = StateMachineResolver.DefaultImpls.logging$default(new SetupTOTPState.Resolver(SetupTOTPCognitoActions.INSTANCE), null, null, 3, null);
            WebAuthnSignInCognitoActions webAuthnSignInCognitoActions = WebAuthnSignInCognitoActions.INSTANCE;
            SignInCognitoActions signInCognitoActions = SignInCognitoActions.INSTANCE;
            LoggingStateMachineResolver loggingStateMachineResolverLogging$default8 = StateMachineResolver.DefaultImpls.logging$default(new AuthenticationState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new SignInState.Resolver(loggingStateMachineResolverLogging$default, loggingStateMachineResolverLogging$default2, loggingStateMachineResolverLogging$default3, loggingStateMachineResolverLogging$default4, loggingStateMachineResolverLogging$default5, loggingStateMachineResolverLogging$default6, loggingStateMachineResolverLogging$default7, StateMachineResolver.DefaultImpls.logging$default(new WebAuthnSignInState.Resolver(webAuthnSignInCognitoActions, signInCognitoActions), null, null, 3, null), UserAuthSignInCognitoActions.INSTANCE, signInCognitoActions), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new SignOutState.Resolver(SignOutCognitoActions.INSTANCE), null, null, 3, null), AuthenticationCognitoActions.INSTANCE), null, null, 3, null);
            FetchAuthSessionCognitoActions fetchAuthSessionCognitoActions = FetchAuthSessionCognitoActions.INSTANCE;
            return new AuthStateMachine(StateMachineResolver.DefaultImpls.logging$default(new AuthState.Resolver(loggingStateMachineResolverLogging$default8, StateMachineResolver.DefaultImpls.logging$default(new AuthorizationState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), null, null, 3, null), StateMachineResolver.DefaultImpls.logging$default(new RefreshSessionState.Resolver(StateMachineResolver.DefaultImpls.logging$default(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), null, null, 3, null), fetchAuthSessionCognitoActions), null, null, 3, null), new DeleteUserState.Resolver(DeleteUserCognitoActions.INSTANCE), AuthorizationCognitoActions.INSTANCE), null, null, 3, null), AuthCognitoActions.INSTANCE, StateMachineResolver.DefaultImpls.logging$default(new SignUpState.Resolver(SignUpCognitoActions.INSTANCE), null, null, 3, null)), null, null, 3, null), environment, null, 4, null);
        }
    }

    public /* synthetic */ AuthStateMachine(StateMachineResolver stateMachineResolver, Environment environment, AuthState authState, int i, id5 id5Var) {
        this(stateMachineResolver, environment, (i & 4) != 0 ? null : authState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthStateMachine(StateMachineResolver<AuthState> stateMachineResolver, Environment environment, AuthState authState) {
        super(stateMachineResolver, environment, null, null, authState, 12, null);
        sq8.m48649h(stateMachineResolver, "resolver");
        sq8.m48649h(environment, "environment");
    }

    public /* synthetic */ AuthStateMachine(Environment environment, AuthState authState, int i, id5 id5Var) {
        this(environment, (i & 2) != 0 ? null : authState);
    }

    public AuthStateMachine(Environment environment, AuthState authState) {
        sq8.m48649h(environment, "environment");
        SRPSignInState.Resolver resolver = new SRPSignInState.Resolver(SRPCognitoActions.INSTANCE);
        CustomSignInState.Resolver resolver2 = new CustomSignInState.Resolver(SignInCustomCognitoActions.INSTANCE);
        MigrateSignInState.Resolver resolver3 = new MigrateSignInState.Resolver(MigrateAuthCognitoActions.INSTANCE);
        SignInChallengeState.Resolver resolver4 = new SignInChallengeState.Resolver(SignInChallengeCognitoActions.INSTANCE);
        HostedUISignInState.Resolver resolver5 = new HostedUISignInState.Resolver(HostedUICognitoActions.INSTANCE);
        DeviceSRPSignInState.Resolver resolver6 = new DeviceSRPSignInState.Resolver(DeviceSRPCognitoSignInActions.INSTANCE);
        SetupTOTPState.Resolver resolver7 = new SetupTOTPState.Resolver(SetupTOTPCognitoActions.INSTANCE);
        WebAuthnSignInCognitoActions webAuthnSignInCognitoActions = WebAuthnSignInCognitoActions.INSTANCE;
        SignInCognitoActions signInCognitoActions = SignInCognitoActions.INSTANCE;
        AuthenticationState.Resolver resolver8 = new AuthenticationState.Resolver(new SignInState.Resolver(resolver, resolver2, resolver3, resolver4, resolver5, resolver6, resolver7, new WebAuthnSignInState.Resolver(webAuthnSignInCognitoActions, signInCognitoActions), UserAuthSignInCognitoActions.INSTANCE, signInCognitoActions), new SignOutState.Resolver(SignOutCognitoActions.INSTANCE), AuthenticationCognitoActions.INSTANCE);
        FetchAuthSessionCognitoActions fetchAuthSessionCognitoActions = FetchAuthSessionCognitoActions.INSTANCE;
        this(new AuthState.Resolver(resolver8, new AuthorizationState.Resolver(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), new RefreshSessionState.Resolver(new FetchAuthSessionState.Resolver(fetchAuthSessionCognitoActions), fetchAuthSessionCognitoActions), new DeleteUserState.Resolver(DeleteUserCognitoActions.INSTANCE), AuthorizationCognitoActions.INSTANCE), AuthCognitoActions.INSTANCE, new SignUpState.Resolver(SignUpCognitoActions.INSTANCE)), environment, authState);
    }
}
