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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthState implements State {
    private AuthenticationState authNState;
    private SignUpState authSignUpState;
    private AuthorizationState authZState;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder implements com.amplifyframework.statemachine.Builder<AuthState> {
        private AuthenticationState authNState;
        private SignUpState authSignUpState;
        private final AuthState authState;
        private AuthorizationState authZState;

        public Builder(AuthState authState) {
            AbstractC4154l.m8923f(authState, "authState");
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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

        public static /* synthetic */ Configured copy$default(Configured configured, AuthenticationState authenticationState, AuthorizationState authorizationState, SignUpState signUpState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authenticationState = configured.authNState;
            }
            if ((i10 & 2) != 0) {
                authorizationState = configured.authZState;
            }
            if ((i10 & 4) != 0) {
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
            return AbstractC4154l.m8918a(this.authNState, configured.authNState) && AbstractC4154l.m8918a(this.authZState, configured.authZState) && AbstractC4154l.m8918a(this.authSignUpState, configured.authSignUpState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ConfiguringAuth extends AuthState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43797id;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfiguringAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConfiguringAuth copy$default(ConfiguringAuth configuringAuth, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configuringAuth.f43797id;
            }
            return configuringAuth.copy(str);
        }

        public final String component1() {
            return this.f43797id;
        }

        public final ConfiguringAuth copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new ConfiguringAuth(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguringAuth) && AbstractC4154l.m8918a(this.f43797id, ((ConfiguringAuth) obj).f43797id);
        }

        public final String getId() {
            return this.f43797id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43797id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("ConfiguringAuth(id=", this.f43797id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfiguringAuth(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43797id = id2;
        }

        public /* synthetic */ ConfiguringAuth(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ConfiguringAuthentication extends AuthState {
        private AuthenticationState authNState;

        public ConfiguringAuthentication(AuthenticationState authenticationState) {
            super(null);
            this.authNState = authenticationState;
        }

        public static /* synthetic */ ConfiguringAuthentication copy$default(ConfiguringAuthentication configuringAuthentication, AuthenticationState authenticationState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
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
            return (obj instanceof ConfiguringAuthentication) && AbstractC4154l.m8918a(this.authNState, ((ConfiguringAuthentication) obj).authNState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ConfiguringAuthorization extends AuthState {
        private AuthenticationState authNState;
        private AuthorizationState authZState;

        public ConfiguringAuthorization(AuthenticationState authenticationState, AuthorizationState authorizationState) {
            super(null);
            this.authNState = authenticationState;
            this.authZState = authorizationState;
        }

        public static /* synthetic */ ConfiguringAuthorization copy$default(ConfiguringAuthorization configuringAuthorization, AuthenticationState authenticationState, AuthorizationState authorizationState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authenticationState = configuringAuthorization.authNState;
            }
            if ((i10 & 2) != 0) {
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
            return AbstractC4154l.m8918a(this.authNState, configuringAuthorization.authNState) && AbstractC4154l.m8918a(this.authZState, configuringAuthorization.authZState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends AuthState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            return new Error(exception);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.exception, ((Error) obj).exception);
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
            return AbstractC5601a.m11237h("Error(exception=", ")", this.exception);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotConfigured extends AuthState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43798id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notConfigured.f43798id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.f43798id;
        }

        public final NotConfigured copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotConfigured(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && AbstractC4154l.m8918a(this.f43798id, ((NotConfigured) obj).f43798id);
        }

        public final String getId() {
            return this.f43798id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43798id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotConfigured(id=", this.f43798id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43798id = id2;
        }

        public /* synthetic */ NotConfigured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<AuthState> {
        private final AuthActions authActions;
        private final StateMachineResolver<AuthenticationState> authNResolver;
        private final StateMachineResolver<SignUpState> authSignUpResolver;
        private final StateMachineResolver<AuthorizationState> authZResolver;
        private final NotConfigured defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<AuthenticationState> authNResolver, StateMachineResolver<AuthorizationState> authZResolver, AuthActions authActions, StateMachineResolver<SignUpState> authSignUpResolver) {
            AbstractC4154l.m8923f(authNResolver, "authNResolver");
            AbstractC4154l.m8923f(authZResolver, "authZResolver");
            AbstractC4154l.m8923f(authActions, "authActions");
            AbstractC4154l.m8923f(authSignUpResolver, "authSignUpResolver");
            this.authNResolver = authNResolver;
            this.authZResolver = authZResolver;
            this.authActions = authActions;
            this.authSignUpResolver = authSignUpResolver;
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
            int i10 = 1;
            if (authState instanceof NotConfigured) {
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuth) {
                    return new StateResolution<>(new ConfiguringAuth(str, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.authActions.initializeAuthConfigurationAction((AuthEvent.EventType.ConfigureAuth) eventTypeIsAuthEvent)));
                }
            } else if (authState instanceof ConfiguringAuth) {
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthentication) {
                    return new StateResolution<>(new ConfiguringAuthentication(new AuthenticationState.NotConfigured(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0)), pe.m10833h(this.authActions.initializeAuthenticationConfigurationAction((AuthEvent.EventType.ConfigureAuthentication) eventTypeIsAuthEvent)));
                }
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfigureAuthorization) {
                    return new StateResolution<>(new ConfiguringAuthorization(new AuthenticationState.NotConfigured(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), new AuthorizationState.NotConfigured(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0)), pe.m10833h(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent)));
                }
            } else if (authState instanceof ConfiguringAuthentication) {
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthentication) {
                    return new StateResolution<>(new ConfiguringAuthorization(((ConfiguringAuthentication) authState).getAuthNState(), new AuthorizationState.NotConfigured(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0)), pe.m10833h(this.authActions.initializeAuthorizationConfigurationAction(eventTypeIsAuthEvent)));
                }
            } else if ((authState instanceof ConfiguringAuthorization) && (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ConfiguredAuthorization)) {
                ConfiguringAuthorization configuringAuthorization = (ConfiguringAuthorization) authState;
                return new StateResolution<>(new Configured(configuringAuthorization.getAuthNState(), configuringAuthorization.getAuthZState(), authState.getAuthSignUpState()), null, 2, null);
            }
            return stateResolution;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthState, StateMachineResolver<AuthState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthState> resolve(AuthState oldState, StateMachineEvent event) {
            StateResolution<StateType> stateResolutionResolve;
            StateResolution<StateType> stateResolutionResolve2;
            StateResolution<StateType> stateResolutionResolve3;
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            StateResolution<AuthState> stateResolutionResolveAuthEvent = resolveAuthEvent(oldState, event);
            ArrayList arrayListD0 = AbstractC6663m.d0(stateResolutionResolveAuthEvent.getActions());
            Builder builder = new Builder((AuthState) stateResolutionResolveAuthEvent.getNewState());
            AuthenticationState authNState = oldState.getAuthNState();
            if (authNState != null && (stateResolutionResolve3 = this.authNResolver.resolve(authNState, event)) != 0) {
                builder.setAuthNState((AuthenticationState) stateResolutionResolve3.getNewState());
                AbstractC6663m.m12765x(arrayListD0, stateResolutionResolve3.getActions());
            }
            AuthorizationState authZState = oldState.getAuthZState();
            if (authZState != null && (stateResolutionResolve2 = this.authZResolver.resolve(authZState, event)) != 0) {
                builder.setAuthZState((AuthorizationState) stateResolutionResolve2.getNewState());
                AbstractC6663m.m12765x(arrayListD0, stateResolutionResolve2.getActions());
            }
            SignUpState authSignUpState = oldState.getAuthSignUpState();
            if (authSignUpState != null && (stateResolutionResolve = this.authSignUpResolver.resolve(authSignUpState, event)) != 0) {
                builder.setAuthSignUpState((SignUpState) stateResolutionResolve.getNewState());
                AbstractC6663m.m12765x(arrayListD0, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), arrayListD0);
        }
    }

    public /* synthetic */ AuthState(AbstractC4148f abstractC4148f) {
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
        return super.getType();
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
        int i10 = 1;
        this.authNState = new AuthenticationState.NotConfigured(null, i10, 0 == true ? 1 : 0);
        this.authZState = new AuthorizationState.NotConfigured(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.authSignUpState = new SignUpState.NotStarted(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }
}
