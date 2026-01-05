package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.CustomSignInActions;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CustomSignInState implements State {
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends CustomSignInState {
        private final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception error) {
            super(null);
            AbstractC4154l.m8923f(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.error;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.error;
        }

        public final Error copy(Exception error) {
            AbstractC4154l.m8923f(error, "error");
            return new Error(error);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.error, ((Error) obj).error);
        }

        public final Exception getError() {
            return this.error;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11237h("Error(error=", ")", this.error);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Initiating extends CustomSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43812id;

        /* JADX WARN: Multi-variable type inference failed */
        public Initiating() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Initiating copy$default(Initiating initiating, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initiating.f43812id;
            }
            return initiating.copy(str);
        }

        public final String component1() {
            return this.f43812id;
        }

        public final Initiating copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Initiating(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initiating) && AbstractC4154l.m8918a(this.f43812id, ((Initiating) obj).f43812id);
        }

        public final String getId() {
            return this.f43812id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43812id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Initiating(id=", this.f43812id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initiating(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43812id = id2;
        }

        public /* synthetic */ Initiating(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends CustomSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43813id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43813id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43813id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43813id, ((NotStarted) obj).f43813id);
        }

        public final String getId() {
            return this.f43813id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43813id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43813id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43813id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<CustomSignInState> {
        private final NotStarted defaultState;
        private final CustomSignInActions signInCustomActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(CustomSignInActions signInCustomActions) {
            AbstractC4154l.m8923f(signInCustomActions, "signInCustomActions");
            this.signInCustomActions = signInCustomActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final CustomSignInEvent.EventType asCustomSignInEvent(StateMachineEvent stateMachineEvent) {
            CustomSignInEvent customSignInEvent = stateMachineEvent instanceof CustomSignInEvent ? (CustomSignInEvent) stateMachineEvent : null;
            if (customSignInEvent != null) {
                return customSignInEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<CustomSignInState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<CustomSignInState, StateMachineResolver<CustomSignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<CustomSignInState> resolve(CustomSignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<CustomSignInState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            CustomSignInEvent.EventType eventTypeAsCustomSignInEvent = asCustomSignInEvent(event);
            int i10 = 1;
            if (oldState instanceof NotStarted) {
                if (eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.InitiateCustomSignIn) {
                    return new StateResolution<>(new Initiating(str, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.signInCustomActions.initiateCustomSignInAuthAction((CustomSignInEvent.EventType.InitiateCustomSignIn) eventTypeAsCustomSignInEvent)));
                }
                if (eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.ThrowAuthError) {
                    return new StateResolution<>(new Error(((CustomSignInEvent.EventType.ThrowAuthError) eventTypeAsCustomSignInEvent).getException()), null, 2, null);
                }
            } else if (oldState instanceof Initiating) {
                if (eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.FinalizeSignIn) {
                    return new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.ThrowAuthError) {
                    return new StateResolution<>(new Error(((CustomSignInEvent.EventType.ThrowAuthError) eventTypeAsCustomSignInEvent).getException()), null, 2, null);
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends CustomSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43814id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signedIn.f43814id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.f43814id;
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
            return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43814id, ((SignedIn) obj).f43814id);
        }

        public final String getId() {
            return this.f43814id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43814id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SignedIn(id=", this.f43814id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43814id = id2;
        }

        public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ CustomSignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.type;
    }

    private CustomSignInState() {
        this.type = toString();
    }
}
