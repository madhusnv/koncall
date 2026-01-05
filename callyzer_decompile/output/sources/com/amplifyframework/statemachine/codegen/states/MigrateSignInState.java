package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class MigrateSignInState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends MigrateSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43827id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43827id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43827id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43827id, ((NotStarted) obj).f43827id);
        }

        public final String getId() {
            return this.f43827id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43827id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43827id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43827id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<MigrateSignInState> {
        private final NotStarted defaultState;
        private final MigrateAuthActions migrateAuthActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(MigrateAuthActions migrateAuthActions) {
            AbstractC4154l.m8923f(migrateAuthActions, "migrateAuthActions");
            this.migrateAuthActions = migrateAuthActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final SignInEvent.EventType asSignInEvent(StateMachineEvent stateMachineEvent) {
            SignInEvent signInEvent = stateMachineEvent instanceof SignInEvent ? (SignInEvent) stateMachineEvent : null;
            if (signInEvent != null) {
                return signInEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<MigrateSignInState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<MigrateSignInState, StateMachineResolver<MigrateSignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<MigrateSignInState> resolve(MigrateSignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<MigrateSignInState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            SignInEvent.EventType eventTypeAsSignInEvent = asSignInEvent(event);
            int i10 = 1;
            if (oldState instanceof NotStarted) {
                if (eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateMigrateAuth) {
                    return new StateResolution<>(new SigningIn(str, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.migrateAuthActions.initiateMigrateAuthAction((SignInEvent.EventType.InitiateMigrateAuth) eventTypeAsSignInEvent)));
                }
            } else if ((oldState instanceof SigningIn) && (eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn)) {
                return new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), null, 2, null);
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends MigrateSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43828id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signedIn.f43828id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.f43828id;
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
            return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43828id, ((SignedIn) obj).f43828id);
        }

        public final String getId() {
            return this.f43828id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43828id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SignedIn(id=", this.f43828id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43828id = id2;
        }

        public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningIn extends MigrateSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43829id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signingIn.f43829id;
            }
            return signingIn.copy(str);
        }

        public final String component1() {
            return this.f43829id;
        }

        public final SigningIn copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SigningIn(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && AbstractC4154l.m8918a(this.f43829id, ((SigningIn) obj).f43829id);
        }

        public final String getId() {
            return this.f43829id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43829id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SigningIn(id=", this.f43829id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43829id = id2;
        }

        public /* synthetic */ SigningIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ MigrateSignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private MigrateSignInState() {
    }
}
