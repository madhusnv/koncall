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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public abstract class WebAuthnSignInState implements State {

    public static final class AssertingCredentials extends WebAuthnSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public AssertingCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AssertingCredentials copy$default(AssertingCredentials assertingCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assertingCredentials.id;
            }
            return assertingCredentials.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final AssertingCredentials copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new AssertingCredentials(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssertingCredentials) && sq8.m48644c(this.id, ((AssertingCredentials) obj).id);
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
            return "AssertingCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssertingCredentials(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ AssertingCredentials(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends WebAuthnSignInState {
        private final WebAuthnSignInContext context;
        private final Exception exception;
        private boolean hasNewResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc, WebAuthnSignInContext webAuthnSignInContext, boolean z) {
            super(null);
            sq8.m48649h(exc, "exception");
            sq8.m48649h(webAuthnSignInContext, "context");
            this.exception = exc;
            this.context = webAuthnSignInContext;
            this.hasNewResponse = z;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, WebAuthnSignInContext webAuthnSignInContext, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                webAuthnSignInContext = error.context;
            }
            if ((i & 4) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, webAuthnSignInContext, z);
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

        public final Error copy(Exception exc, WebAuthnSignInContext webAuthnSignInContext, boolean z) {
            sq8.m48649h(exc, "exception");
            sq8.m48649h(webAuthnSignInContext, "context");
            return new Error(exc, webAuthnSignInContext, z);
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
            return sq8.m48644c(this.exception, error.exception) && sq8.m48644c(this.context, error.context) && this.hasNewResponse == error.hasNewResponse;
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = ((this.exception.hashCode() * 31) + this.context.hashCode()) * 31;
            boolean z = this.hasNewResponse;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", context=" + this.context + ", hasNewResponse=" + this.hasNewResponse + ")";
        }
    }

    public static final class FetchingCredentialOptions extends WebAuthnSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchingCredentialOptions() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FetchingCredentialOptions copy$default(FetchingCredentialOptions fetchingCredentialOptions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchingCredentialOptions.id;
            }
            return fetchingCredentialOptions.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final FetchingCredentialOptions copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new FetchingCredentialOptions(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingCredentialOptions) && sq8.m48644c(this.id, ((FetchingCredentialOptions) obj).id);
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
            return "FetchingCredentialOptions(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingCredentialOptions(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ FetchingCredentialOptions(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotStarted extends WebAuthnSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotStarted copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotStarted(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && sq8.m48644c(this.id, ((NotStarted) obj).id);
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
            return "NotStarted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotStarted(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<WebAuthnSignInState> {
        private final WebAuthnSignInActions actions;
        private final NotStarted defaultState;
        private final SignInActions signInActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(WebAuthnSignInActions webAuthnSignInActions, SignInActions signInActions) {
            sq8.m48649h(webAuthnSignInActions, "actions");
            sq8.m48649h(signInActions, "signInActions");
            this.actions = webAuthnSignInActions;
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
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<WebAuthnSignInState, StateMachineResolver<WebAuthnSignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<WebAuthnSignInState> resolve(WebAuthnSignInState webAuthnSignInState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(webAuthnSignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
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
            StateResolution<WebAuthnSignInState> stateResolution = new StateResolution<>(webAuthnSignInState, null, 2, null);
            WebAuthnEvent.EventType eventTypeAsWebAuthnSignInEvent = asWebAuthnSignInEvent(stateMachineEvent);
            int i = 1;
            if (eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.ThrowError) {
                WebAuthnEvent.EventType.ThrowError throwError = (WebAuthnEvent.EventType.ThrowError) eventTypeAsWebAuthnSignInEvent;
                return new StateResolution<>(new Error(throwError.getException(), throwError.getSignInContext(), true), null, 2, null);
            }
            if (webAuthnSignInState instanceof NotStarted) {
                return eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.AssertCredentialOptions ? new StateResolution<>(new AssertingCredentials(str, i, objArr9 == true ? 1 : 0), bh3.m18963e(this.actions.assertCredentials((WebAuthnEvent.EventType.AssertCredentialOptions) eventTypeAsWebAuthnSignInEvent))) : eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.FetchCredentialOptions ? new StateResolution<>(new FetchingCredentialOptions(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), bh3.m18963e(this.actions.fetchCredentialOptions((WebAuthnEvent.EventType.FetchCredentialOptions) eventTypeAsWebAuthnSignInEvent))) : stateResolution;
            }
            if (webAuthnSignInState instanceof FetchingCredentialOptions) {
                return eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.AssertCredentialOptions ? new StateResolution<>(new AssertingCredentials(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.actions.assertCredentials((WebAuthnEvent.EventType.AssertCredentialOptions) eventTypeAsWebAuthnSignInEvent))) : stateResolution;
            }
            if (webAuthnSignInState instanceof AssertingCredentials) {
                return eventTypeAsWebAuthnSignInEvent instanceof WebAuthnEvent.EventType.VerifyCredentialsAndSignIn ? new StateResolution<>(new VerifyingCredentialsAndSigningIn(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.actions.verifyCredentialAndSignIn((WebAuthnEvent.EventType.VerifyCredentialsAndSignIn) eventTypeAsWebAuthnSignInEvent))) : stateResolution;
            }
            if ((webAuthnSignInState instanceof VerifyingCredentialsAndSigningIn) || (webAuthnSignInState instanceof SignedIn)) {
                return stateResolution;
            }
            if (!(webAuthnSignInState instanceof Error)) {
                throw new szb();
            }
            if (!(stateMachineEvent instanceof SignInEvent)) {
                return stateResolution;
            }
            SignInEvent signInEvent = (SignInEvent) stateMachineEvent;
            return signInEvent.getEventType() instanceof SignInEvent.EventType.InitiateWebAuthnSignIn ? new StateResolution<>(new NotStarted(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.signInActions.initiateWebAuthnSignInAction((SignInEvent.EventType.InitiateWebAuthnSignIn) signInEvent.getEventType()))) : stateResolution;
        }
    }

    public static final class SignedIn extends WebAuthnSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signedIn.id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SignedIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SignedIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && sq8.m48644c(this.id, ((SignedIn) obj).id);
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
            return "SignedIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SignedIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class VerifyingCredentialsAndSigningIn extends WebAuthnSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public VerifyingCredentialsAndSigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ VerifyingCredentialsAndSigningIn copy$default(VerifyingCredentialsAndSigningIn verifyingCredentialsAndSigningIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifyingCredentialsAndSigningIn.id;
            }
            return verifyingCredentialsAndSigningIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final VerifyingCredentialsAndSigningIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new VerifyingCredentialsAndSigningIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerifyingCredentialsAndSigningIn) && sq8.m48644c(this.id, ((VerifyingCredentialsAndSigningIn) obj).id);
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
            return "VerifyingCredentialsAndSigningIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyingCredentialsAndSigningIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ VerifyingCredentialsAndSigningIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private WebAuthnSignInState() {
    }

    public /* synthetic */ WebAuthnSignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
