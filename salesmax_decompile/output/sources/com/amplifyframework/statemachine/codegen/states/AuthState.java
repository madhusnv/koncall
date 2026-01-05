package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthActions;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.amplifyframework.statemachine.codegen.states.AuthorizationState;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.hh3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class AuthState implements State {
    private AuthenticationState authNState;
    private SignUpState authSignUpState;
    private AuthorizationState authZState;

    public static final class Builder implements com.amplifyframework.statemachine.Builder<AuthState> {
        private AuthenticationState authNState;
        private SignUpState authSignUpState;
        private final AuthState authState;
        private AuthorizationState authZState;

        public Builder(AuthState authState) {
            sq8.m48649h(authState, "authState");
            this.authState = authState;
        }

        public final AuthenticationState getAuthNState() {
            return this.authNState;
        }

        public final SignUpState getAuthSignUpState() {
            return this.authSignUpState;
        }

        public final AuthorizationState getAuthZState() {
            return this.authZState;
        }

        public final void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        public final void setAuthSignUpState(SignUpState signUpState) {
            this.authSignUpState = signUpState;
        }

        public final void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amplifyframework.statemachine.Builder
        public AuthState build() {
            AuthState authState = this.authState;
            return authState instanceof ConfiguringAuthentication ? new ConfiguringAuthentication(this.authNState) : authState instanceof ConfiguringAuthorization ? new ConfiguringAuthorization(this.authNState, this.authZState) : authState instanceof Configured ? new Configured(this.authNState, this.authZState, this.authSignUpState) : authState;
        }
    }

    public static final class Configured extends AuthState {
        private AuthenticationState authNState;
        private SignUpState authSignUpState;
        private AuthorizationState authZState;

        public Configured(AuthenticationState authenticationState, AuthorizationState authorizationState, SignUpState signUpState) {
            super(null);
            this.authNState = authenticationState;
            this.authZState = authorizationState;
            this.authSignUpState = signUpState;
        }

        public static /* synthetic */ Configured copy$default(Configured configured, AuthenticationState authenticationState, AuthorizationState authorizationState, SignUpState signUpState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configured.authNState;
            }
            if ((i & 2) != 0) {
                authorizationState = configured.authZState;
            }
            if ((i & 4) != 0) {
                signUpState = configured.authSignUpState;
            }
            return configured.copy(authenticationState, authorizationState, signUpState);
        }

        public final AuthenticationState component1() {
            return this.authNState;
        }

        public final AuthorizationState component2() {
            return this.authZState;
        }

        public final SignUpState component3() {
            return this.authSignUpState;
        }

        public final Configured copy(AuthenticationState authenticationState, AuthorizationState authorizationState, SignUpState signUpState) {
            return new Configured(authenticationState, authorizationState, signUpState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configured)) {
                return false;
            }
            Configured configured = (Configured) obj;
            return sq8.m48644c(this.authNState, configured.authNState) && sq8.m48644c(this.authZState, configured.authZState) && sq8.m48644c(this.authSignUpState, configured.authSignUpState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public SignUpState getAuthSignUpState() {
            return this.authSignUpState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthorizationState getAuthZState() {
            return this.authZState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            int iHashCode = (authenticationState == null ? 0 : authenticationState.hashCode()) * 31;
            AuthorizationState authorizationState = this.authZState;
            int iHashCode2 = (iHashCode + (authorizationState == null ? 0 : authorizationState.hashCode())) * 31;
            SignUpState signUpState = this.authSignUpState;
            return iHashCode2 + (signUpState != null ? signUpState.hashCode() : 0);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthSignUpState(SignUpState signUpState) {
            this.authSignUpState = signUpState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Configured(authNState=" + this.authNState + ", authZState=" + this.authZState + ", authSignUpState=" + this.authSignUpState + ")";
        }
    }

    public static final class ConfiguringAuth extends AuthState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfiguringAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConfiguringAuth copy$default(ConfiguringAuth configuringAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configuringAuth.id;
            }
            return configuringAuth.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final ConfiguringAuth copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new ConfiguringAuth(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguringAuth) && sq8.m48644c(this.id, ((ConfiguringAuth) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuth(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfiguringAuth(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ ConfiguringAuth(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class ConfiguringAuthentication extends AuthState {
        private AuthenticationState authNState;

        public ConfiguringAuthentication(AuthenticationState authenticationState) {
            super(null);
            this.authNState = authenticationState;
        }

        public static /* synthetic */ ConfiguringAuthentication copy$default(ConfiguringAuthentication configuringAuthentication, AuthenticationState authenticationState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configuringAuthentication.authNState;
            }
            return configuringAuthentication.copy(authenticationState);
        }

        public final AuthenticationState component1() {
            return this.authNState;
        }

        public final ConfiguringAuthentication copy(AuthenticationState authenticationState) {
            return new ConfiguringAuthentication(authenticationState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguringAuthentication) && sq8.m48644c(this.authNState, ((ConfiguringAuthentication) obj).authNState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            if (authenticationState == null) {
                return 0;
            }
            return authenticationState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuthentication(authNState=" + this.authNState + ")";
        }
    }

    public static final class ConfiguringAuthorization extends AuthState {
        private AuthenticationState authNState;
        private AuthorizationState authZState;

        public ConfiguringAuthorization(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            super(null);
            this.authNState = authenticationState;
            this.authZState = authorizationState;
        }

        public static /* synthetic */ ConfiguringAuthorization copy$default(ConfiguringAuthorization configuringAuthorization, AuthenticationState authenticationState, AuthorizationState authorizationState, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = configuringAuthorization.authNState;
            }
            if ((i & 2) != 0) {
                authorizationState = configuringAuthorization.authZState;
            }
            return configuringAuthorization.copy(authenticationState, authorizationState);
        }

        public final AuthenticationState component1() {
            return this.authNState;
        }

        public final AuthorizationState component2() {
            return this.authZState;
        }

        public final ConfiguringAuthorization copy(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            return new ConfiguringAuthorization(authenticationState, authorizationState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfiguringAuthorization)) {
                return false;
            }
            ConfiguringAuthorization configuringAuthorization = (ConfiguringAuthorization) obj;
            return sq8.m48644c(this.authNState, configuringAuthorization.authNState) && sq8.m48644c(this.authZState, configuringAuthorization.authZState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthenticationState getAuthNState() {
            return this.authNState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public AuthorizationState getAuthZState() {
            return this.authZState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            AuthenticationState authenticationState = this.authNState;
            int iHashCode = (authenticationState == null ? 0 : authenticationState.hashCode()) * 31;
            AuthorizationState authorizationState = this.authZState;
            return iHashCode + (authorizationState != null ? authorizationState.hashCode() : 0);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthNState(AuthenticationState authenticationState) {
            this.authNState = authenticationState;
        }

        @Override // com.amplifyframework.statemachine.codegen.states.AuthState
        public void setAuthZState(AuthorizationState authorizationState) {
            this.authZState = authorizationState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfiguringAuthorization(authNState=" + this.authNState + ", authZState=" + this.authZState + ")";
        }
    }

    public static final class Error extends AuthState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            sq8.m48649h(exc, "exception");
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exc) {
            sq8.m48649h(exc, "exception");
            return new Error(exc);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && sq8.m48644c(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }
    }

    public static final class NotConfigured extends AuthState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notConfigured.id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotConfigured copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotConfigured(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && sq8.m48644c(this.id, ((NotConfigured) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotConfigured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotConfigured(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<AuthState> {
        private final AuthActions authActions;
        private final StateMachineResolver<AuthenticationState> authNResolver;
        private final StateMachineResolver<SignUpState> authSignUpResolver;
        private final StateMachineResolver<AuthorizationState> authZResolver;
        private final NotConfigured defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<AuthenticationState> stateMachineResolver, StateMachineResolver<AuthorizationState> stateMachineResolver2, AuthActions authActions, StateMachineResolver<SignUpState> stateMachineResolver3) {
            sq8.m48649h(stateMachineResolver, "authNResolver");
            sq8.m48649h(stateMachineResolver2, "authZResolver");
            sq8.m48649h(authActions, "authActions");
            sq8.m48649h(stateMachineResolver3, "authSignUpResolver");
            this.authNResolver = stateMachineResolver;
            this.authZResolver = stateMachineResolver2;
            this.authActions = authActions;
            this.authSignUpResolver = stateMachineResolver3;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final StateResolution<AuthState> resolveAuthEvent(AuthState authState, StateMachineEvent stateMachineEvent) {
            AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            StateResolution<AuthState> stateResolution = new StateResolution<>(authState, null, 2, null);
            int i = 1;
            return authState instanceof NotConfigured ? eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuth ? new StateResolution<>(new ConfiguringAuth(str, i, objArr9 == true ? 1 : 0), bh3.m18963e(this.authActions.initializeAuthConfigurationAction((AuthEvent.EventType.ConfigureAuth) eventTypeIsAuthEvent))) : stateResolution : authState instanceof ConfiguringAuth ? eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthentication ? new StateResolution<>(new ConfiguringAuthentication(new AuthenticationState.NotConfigured(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0)), bh3.m18963e(this.authActions.initializeAuthenticationConfigurationAction((AuthEvent.EventType.ConfigureAuthentication) eventTypeIsAuthEvent))) : eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthorization ? new StateResolution<>(new ConfiguringAuthorization(new AuthenticationState.NotConfigured(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), new AuthorizationState.NotConfigured(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0)), bh3.m18963e(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent))) : stateResolution : authState instanceof ConfiguringAuthentication ? eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthentication ? new StateResolution<>(new ConfiguringAuthorization(authState.getAuthNState(), new AuthorizationState.NotConfigured(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0)), bh3.m18963e(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent))) : stateResolution : ((authState instanceof ConfiguringAuthorization) && (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthorization)) ? new StateResolution<>(new Configured(authState.getAuthNState(), authState.getAuthZState(), authState.getAuthSignUpState()), null, 2, null) : stateResolution;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthState, StateMachineResolver<AuthState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthState> resolve(AuthState authState, StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            StateResolution<StateType> stateResolutionResolve2;
            StateResolution<StateType> stateResolutionResolve3;
            sq8.m48649h(authState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            StateResolution<AuthState> stateResolutionResolveAuthEvent = resolveAuthEvent(authState, stateMachineEvent);
            List listT0 = kh3.T0(stateResolutionResolveAuthEvent.getActions());
            Builder builder = new Builder((AuthState) stateResolutionResolveAuthEvent.getNewState());
            AuthenticationState authNState = authState.getAuthNState();
            if (authNState != null && (stateResolutionResolve3 = this.authNResolver.resolve(authNState, stateMachineEvent)) != 0) {
                builder.setAuthNState((AuthenticationState) stateResolutionResolve3.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve3.getActions());
            }
            AuthorizationState authZState = authState.getAuthZState();
            if (authZState != null && (stateResolutionResolve2 = this.authZResolver.resolve(authZState, stateMachineEvent)) != 0) {
                builder.setAuthZState((AuthorizationState) stateResolutionResolve2.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve2.getActions());
            }
            SignUpState authSignUpState = authState.getAuthSignUpState();
            if (authSignUpState != null && (stateResolutionResolve = this.authSignUpResolver.resolve(authSignUpState, stateMachineEvent)) != 0) {
                builder.setAuthSignUpState((SignUpState) stateResolutionResolve.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listT0);
        }
    }

    public /* synthetic */ AuthState(id5 id5Var) {
        this();
    }

    public AuthenticationState getAuthNState() {
        return this.authNState;
    }

    public SignUpState getAuthSignUpState() {
        return this.authSignUpState;
    }

    public AuthorizationState getAuthZState() {
        return this.authZState;
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public void setAuthNState(AuthenticationState authenticationState) {
        this.authNState = authenticationState;
    }

    public void setAuthSignUpState(SignUpState signUpState) {
        this.authSignUpState = signUpState;
    }

    public void setAuthZState(AuthorizationState authorizationState) {
        this.authZState = authorizationState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AuthState() {
        int i = 1;
        this.authNState = new AuthenticationState.NotConfigured(null, i, 0 == true ? 1 : 0);
        this.authZState = new AuthorizationState.NotConfigured(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.authSignUpState = new SignUpState.NotStarted(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }
}
