package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class MigrateSignInState implements State {

    public static final class NotStarted extends MigrateSignInState {
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

    public static final class Resolver implements StateMachineResolver<MigrateSignInState> {
        private final NotStarted defaultState;
        private final MigrateAuthActions migrateAuthActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(MigrateAuthActions migrateAuthActions) {
            sq8.m48649h(migrateAuthActions, "migrateAuthActions");
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
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<MigrateSignInState, StateMachineResolver<MigrateSignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<MigrateSignInState> resolve(MigrateSignInState migrateSignInState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(migrateSignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<MigrateSignInState> stateResolution = new StateResolution<>(migrateSignInState, null, 2, null);
            SignInEvent.EventType eventTypeAsSignInEvent = asSignInEvent(stateMachineEvent);
            int i = 1;
            return migrateSignInState instanceof NotStarted ? eventTypeAsSignInEvent instanceof SignInEvent.EventType.InitiateMigrateAuth ? new StateResolution<>(new SigningIn(str, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.migrateAuthActions.initiateMigrateAuthAction((SignInEvent.EventType.InitiateMigrateAuth) eventTypeAsSignInEvent))) : stateResolution : ((migrateSignInState instanceof SigningIn) && (eventTypeAsSignInEvent instanceof SignInEvent.EventType.FinalizeSignIn)) ? new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 2, null) : stateResolution;
        }
    }

    public static final class SignedIn extends MigrateSignInState {
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

    public static final class SigningIn extends MigrateSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingIn.id;
            }
            return signingIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SigningIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SigningIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && sq8.m48644c(this.id, ((SigningIn) obj).id);
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
            return "SigningIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SigningIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private MigrateSignInState() {
    }

    public /* synthetic */ MigrateSignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
