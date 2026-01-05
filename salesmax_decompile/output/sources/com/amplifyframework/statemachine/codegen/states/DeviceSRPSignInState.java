package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class DeviceSRPSignInState implements State {

    public static final class Error extends DeviceSRPSignInState {
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

    public static final class InitiatingDeviceSRP extends DeviceSRPSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public InitiatingDeviceSRP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InitiatingDeviceSRP copy$default(InitiatingDeviceSRP initiatingDeviceSRP, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initiatingDeviceSRP.id;
            }
            return initiatingDeviceSRP.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final InitiatingDeviceSRP copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new InitiatingDeviceSRP(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingDeviceSRP) && sq8.m48644c(this.id, ((InitiatingDeviceSRP) obj).id);
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
            return "InitiatingDeviceSRP(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingDeviceSRP(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ InitiatingDeviceSRP(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotStarted extends DeviceSRPSignInState {
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

    public static final class Resolver implements StateMachineResolver<DeviceSRPSignInState> {
        private final NotStarted defaultState;
        private final DeviceSRPSignInActions deviceSRPSignInActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(DeviceSRPSignInActions deviceSRPSignInActions) {
            sq8.m48649h(deviceSRPSignInActions, "deviceSRPSignInActions");
            this.deviceSRPSignInActions = deviceSRPSignInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final DeviceSRPSignInEvent.EventType asDeviceSRPSignInEvent(StateMachineEvent stateMachineEvent) {
            DeviceSRPSignInEvent deviceSRPSignInEvent = stateMachineEvent instanceof DeviceSRPSignInEvent ? (DeviceSRPSignInEvent) stateMachineEvent : null;
            if (deviceSRPSignInEvent != null) {
                return deviceSRPSignInEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<DeviceSRPSignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeviceSRPSignInState, StateMachineResolver<DeviceSRPSignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeviceSRPSignInState> resolve(DeviceSRPSignInState deviceSRPSignInState, StateMachineEvent stateMachineEvent) {
            StateResolution<DeviceSRPSignInState> stateResolution;
            sq8.m48649h(deviceSRPSignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            DeviceSRPSignInEvent.EventType eventTypeAsDeviceSRPSignInEvent = asDeviceSRPSignInEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (eventTypeAsDeviceSRPSignInEvent == null) {
                return new StateResolution<>(deviceSRPSignInState, null, 2, null);
            }
            int i = 1;
            if (deviceSRPSignInState instanceof NotStarted) {
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) {
                    return new StateResolution<>(new InitiatingDeviceSRP(str, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.deviceSRPSignInActions.respondDeviceSRP((DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) eventTypeAsDeviceSRPSignInEvent)));
                }
                if (!(eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError)) {
                    return new StateResolution<>(deviceSRPSignInState, null, 2, null);
                }
                stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
            } else {
                if (!(deviceSRPSignInState instanceof InitiatingDeviceSRP)) {
                    return deviceSRPSignInState instanceof RespondingDevicePasswordVerifier ? eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.FinalizeSignIn ? new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 2, null) : new StateResolution<>(deviceSRPSignInState, null, 2, null) : new StateResolution<>(deviceSRPSignInState, null, 2, null);
                }
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) {
                    return new StateResolution<>(new RespondingDevicePasswordVerifier(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.deviceSRPSignInActions.respondDevicePasswordVerifier((DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) eventTypeAsDeviceSRPSignInEvent)));
                }
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError) {
                    stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
                } else {
                    if (!(eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError)) {
                        return new StateResolution<>(deviceSRPSignInState, null, 2, null);
                    }
                    stateResolution = new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null);
                }
            }
            return stateResolution;
        }
    }

    public static final class RespondingDevicePasswordVerifier extends DeviceSRPSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingDevicePasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingDevicePasswordVerifier copy$default(RespondingDevicePasswordVerifier respondingDevicePasswordVerifier, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingDevicePasswordVerifier.id;
            }
            return respondingDevicePasswordVerifier.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final RespondingDevicePasswordVerifier copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new RespondingDevicePasswordVerifier(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingDevicePasswordVerifier) && sq8.m48644c(this.id, ((RespondingDevicePasswordVerifier) obj).id);
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
            return "RespondingDevicePasswordVerifier(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingDevicePasswordVerifier(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ RespondingDevicePasswordVerifier(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SignedIn extends DeviceSRPSignInState {
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

    private DeviceSRPSignInState() {
    }

    public /* synthetic */ DeviceSRPSignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
