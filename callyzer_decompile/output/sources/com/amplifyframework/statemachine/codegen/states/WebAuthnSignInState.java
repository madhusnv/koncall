package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignInActions;
import com.amplifyframework.statemachine.codegen.actions.WebAuthnSignInActions;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class WebAuthnSignInState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AssertingCredentials extends WebAuthnSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43854id;

        /* JADX WARN: Multi-variable type inference failed */
        public AssertingCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AssertingCredentials copy$default(AssertingCredentials assertingCredentials, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = assertingCredentials.f43854id;
            }
            return assertingCredentials.copy(str);
        }

        public final String component1() {
            return this.f43854id;
        }

        public final AssertingCredentials copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new AssertingCredentials(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssertingCredentials) && AbstractC4154l.m8918a(this.f43854id, ((AssertingCredentials) obj).f43854id);
        }

        public final String getId() {
            return this.f43854id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43854id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("AssertingCredentials(id=", this.f43854id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssertingCredentials(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43854id = id2;
        }

        public /* synthetic */ AssertingCredentials(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends WebAuthnSignInState {
        private final WebAuthnSignInContext context;
        private final Exception exception;
        private boolean hasNewResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception, WebAuthnSignInContext context, boolean z6) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(context, "context");
            this.exception = exception;
            this.context = context;
            this.hasNewResponse = z6;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, WebAuthnSignInContext webAuthnSignInContext, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            if ((i10 & 2) != 0) {
                webAuthnSignInContext = error.context;
            }
            if ((i10 & 4) != 0) {
                z6 = error.hasNewResponse;
            }
            return error.copy(exc, webAuthnSignInContext, z6);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final WebAuthnSignInContext component2() {
            return this.context;
        }

        public final boolean component3() {
            return this.hasNewResponse;
        }

        public final Error copy(Exception exception, WebAuthnSignInContext context, boolean z6) {
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(context, "context");
            return new Error(exception, context, z6);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return AbstractC4154l.m8918a(this.exception, error.exception) && AbstractC4154l.m8918a(this.context, error.context) && this.hasNewResponse == error.hasNewResponse;
        }

        public final WebAuthnSignInContext getContext() {
            return this.context;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return Boolean.hashCode(this.hasNewResponse) + ((this.context.hashCode() + (this.exception.hashCode() * 31)) * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            Exception exc = this.exception;
            WebAuthnSignInContext webAuthnSignInContext = this.context;
            boolean z6 = this.hasNewResponse;
            StringBuilder sb2 = new StringBuilder("Error(exception=");
            sb2.append(exc);
            sb2.append(", context=");
            sb2.append(webAuthnSignInContext);
            sb2.append(", hasNewResponse=");
            return AbstractC5601a.m11242m(sb2, z6, ")");
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingCredentialOptions extends WebAuthnSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43855id;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchingCredentialOptions() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FetchingCredentialOptions copy$default(FetchingCredentialOptions fetchingCredentialOptions, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchingCredentialOptions.f43855id;
            }
            return fetchingCredentialOptions.copy(str);
        }

        public final String component1() {
            return this.f43855id;
        }

        public final FetchingCredentialOptions copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new FetchingCredentialOptions(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingCredentialOptions) && AbstractC4154l.m8918a(this.f43855id, ((FetchingCredentialOptions) obj).f43855id);
        }

        public final String getId() {
            return this.f43855id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43855id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("FetchingCredentialOptions(id=", this.f43855id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingCredentialOptions(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43855id = id2;
        }

        public /* synthetic */ FetchingCredentialOptions(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends WebAuthnSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43856id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43856id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43856id;
        }

        public final NotStarted copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotStarted(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43856id, ((NotStarted) obj).f43856id);
        }

        public final String getId() {
            return this.f43856id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43856id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43856id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43856id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<WebAuthnSignInState> {
        private final WebAuthnSignInActions actions;
        private final NotStarted defaultState;
        private final SignInActions signInActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(WebAuthnSignInActions actions, SignInActions signInActions) {
            AbstractC4154l.m8923f(actions, "actions");
            AbstractC4154l.m8923f(signInActions, "signInActions");
            this.actions = actions;
            this.signInActions = signInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final WebAuthnEvent.EventType asWebAuthnSignInEvent(StateMachineEvent stateMachineEvent) {
            WebAuthnEvent webAuthnEvent = stateMachineEvent instanceof WebAuthnEvent ? (WebAuthnEvent) stateMachineEvent : null;
            if (webAuthnEvent != null) {
                return webAuthnEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<WebAuthnSignInState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<WebAuthnSignInState, StateMachineResolver<WebAuthnSignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<WebAuthnSignInState> resolve(WebAuthnSignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
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
            StateResolution<WebAuthnSignInState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            WebAuthnEvent.EventType eventTypeAsWebAuthnSignInEvent = asWebAuthnSignInEvent(event);
            int i10 = 1;
            if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.ThrowError) {
                WebAuthnEvent.EventType.ThrowError throwError = (WebAuthnEvent.EventType.ThrowError) eventTypeAsWebAuthnSignInEvent;
                return new StateResolution<>(new Error(throwError.getException(), throwError.getSignInContext(), true), null, 2, null);
            }
            if (oldState instanceof NotStarted) {
                if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.AssertCredentialOptions) {
                    return new StateResolution<>(new AssertingCredentials(str, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.actions.assertCredentials((WebAuthnEvent.EventType.AssertCredentialOptions) eventTypeAsWebAuthnSignInEvent)));
                }
                if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.FetchCredentialOptions) {
                    return new StateResolution<>(new FetchingCredentialOptions(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), pe.m10833h(this.actions.fetchCredentialOptions((WebAuthnEvent.EventType.FetchCredentialOptions) eventTypeAsWebAuthnSignInEvent)));
                }
            } else if (oldState instanceof FetchingCredentialOptions) {
                if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.AssertCredentialOptions) {
                    return new StateResolution<>(new AssertingCredentials(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.actions.assertCredentials((WebAuthnEvent.EventType.AssertCredentialOptions) eventTypeAsWebAuthnSignInEvent)));
                }
            } else if (oldState instanceof AssertingCredentials) {
                if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.VerifyCredentialsAndSignIn) {
                    return new StateResolution<>(new VerifyingCredentialsAndSigningIn(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.actions.verifyCredentialAndSignIn((WebAuthnEvent.EventType.VerifyCredentialsAndSignIn) eventTypeAsWebAuthnSignInEvent)));
                }
            } else {
                if ((oldState instanceof VerifyingCredentialsAndSigningIn) || (oldState instanceof SignedIn)) {
                    return stateResolution;
                }
                if (!(oldState instanceof Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (event instanceof SignInEvent) {
                    SignInEvent signInEvent = (SignInEvent) event;
                    if (signInEvent.getEventType() instanceof SignInEvent.EventType.InitiateWebAuthnSignIn) {
                        return new StateResolution<>(new NotStarted(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.signInActions.initiateWebAuthnSignInAction((SignInEvent.EventType.InitiateWebAuthnSignIn) signInEvent.getEventType())));
                    }
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends WebAuthnSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43857id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signedIn.f43857id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.f43857id;
        }

        public final SignedIn copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SignedIn(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43857id, ((SignedIn) obj).f43857id);
        }

        public final String getId() {
            return this.f43857id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43857id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SignedIn(id=", this.f43857id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43857id = id2;
        }

        public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class VerifyingCredentialsAndSigningIn extends WebAuthnSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43858id;

        /* JADX WARN: Multi-variable type inference failed */
        public VerifyingCredentialsAndSigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ VerifyingCredentialsAndSigningIn copy$default(VerifyingCredentialsAndSigningIn verifyingCredentialsAndSigningIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verifyingCredentialsAndSigningIn.f43858id;
            }
            return verifyingCredentialsAndSigningIn.copy(str);
        }

        public final String component1() {
            return this.f43858id;
        }

        public final VerifyingCredentialsAndSigningIn copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new VerifyingCredentialsAndSigningIn(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerifyingCredentialsAndSigningIn) && AbstractC4154l.m8918a(this.f43858id, ((VerifyingCredentialsAndSigningIn) obj).f43858id);
        }

        public final String getId() {
            return this.f43858id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43858id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("VerifyingCredentialsAndSigningIn(id=", this.f43858id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyingCredentialsAndSigningIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43858id = id2;
        }

        public /* synthetic */ VerifyingCredentialsAndSigningIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ WebAuthnSignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private WebAuthnSignInState() {
    }
}
