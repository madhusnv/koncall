package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class DeviceSRPSignInState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends DeviceSRPSignInState {
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
    public static final class InitiatingDeviceSRP extends DeviceSRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43818id;

        /* JADX WARN: Multi-variable type inference failed */
        public InitiatingDeviceSRP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InitiatingDeviceSRP copy$default(InitiatingDeviceSRP initiatingDeviceSRP, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initiatingDeviceSRP.f43818id;
            }
            return initiatingDeviceSRP.copy(str);
        }

        public final String component1() {
            return this.f43818id;
        }

        public final InitiatingDeviceSRP copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new InitiatingDeviceSRP(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingDeviceSRP) && AbstractC4154l.m8918a(this.f43818id, ((InitiatingDeviceSRP) obj).f43818id);
        }

        public final String getId() {
            return this.f43818id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43818id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("InitiatingDeviceSRP(id=", this.f43818id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingDeviceSRP(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43818id = id2;
        }

        public /* synthetic */ InitiatingDeviceSRP(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends DeviceSRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43819id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43819id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43819id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43819id, ((NotStarted) obj).f43819id);
        }

        public final String getId() {
            return this.f43819id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43819id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43819id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43819id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<DeviceSRPSignInState> {
        private final NotStarted defaultState;
        private final DeviceSRPSignInActions deviceSRPSignInActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(DeviceSRPSignInActions deviceSRPSignInActions) {
            AbstractC4154l.m8923f(deviceSRPSignInActions, "deviceSRPSignInActions");
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
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeviceSRPSignInState, StateMachineResolver<DeviceSRPSignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeviceSRPSignInState> resolve(DeviceSRPSignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            DeviceSRPSignInEvent.EventType eventTypeAsDeviceSRPSignInEvent = asDeviceSRPSignInEvent(event);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (eventTypeAsDeviceSRPSignInEvent == null) {
                return new StateResolution<>(oldState, null, 2, null);
            }
            int i10 = 1;
            if (oldState instanceof NotStarted) {
                if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) {
                    return new StateResolution<>(new InitiatingDeviceSRP(str, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.deviceSRPSignInActions.respondDeviceSRP((DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge) eventTypeAsDeviceSRPSignInEvent)));
                }
                return eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null) : new StateResolution<>(oldState, null, 2, null);
            }
            if (!(oldState instanceof InitiatingDeviceSRP)) {
                return oldState instanceof RespondingDevicePasswordVerifier ? eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.FinalizeSignIn ? new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), null, 2, null) : new StateResolution<>(oldState, null, 2, null) : new StateResolution<>(oldState, null, 2, null);
            }
            if (eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) {
                return new StateResolution<>(new RespondingDevicePasswordVerifier(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.deviceSRPSignInActions.respondDevicePasswordVerifier((DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier) eventTypeAsDeviceSRPSignInEvent)));
            }
            return eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError ? new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null) : eventTypeAsDeviceSRPSignInEvent instanceof DeviceSRPSignInEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((DeviceSRPSignInEvent.EventType.ThrowAuthError) eventTypeAsDeviceSRPSignInEvent).getException()), null, 2, null) : new StateResolution<>(oldState, null, 2, null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RespondingDevicePasswordVerifier extends DeviceSRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43820id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingDevicePasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingDevicePasswordVerifier copy$default(RespondingDevicePasswordVerifier respondingDevicePasswordVerifier, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = respondingDevicePasswordVerifier.f43820id;
            }
            return respondingDevicePasswordVerifier.copy(str);
        }

        public final String component1() {
            return this.f43820id;
        }

        public final RespondingDevicePasswordVerifier copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new RespondingDevicePasswordVerifier(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingDevicePasswordVerifier) && AbstractC4154l.m8918a(this.f43820id, ((RespondingDevicePasswordVerifier) obj).f43820id);
        }

        public final String getId() {
            return this.f43820id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43820id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("RespondingDevicePasswordVerifier(id=", this.f43820id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingDevicePasswordVerifier(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43820id = id2;
        }

        public /* synthetic */ RespondingDevicePasswordVerifier(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends DeviceSRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43821id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signedIn.f43821id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.f43821id;
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
            return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43821id, ((SignedIn) obj).f43821id);
        }

        public final String getId() {
            return this.f43821id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43821id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SignedIn(id=", this.f43821id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43821id = id2;
        }

        public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ DeviceSRPSignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private DeviceSRPSignInState() {
    }
}
