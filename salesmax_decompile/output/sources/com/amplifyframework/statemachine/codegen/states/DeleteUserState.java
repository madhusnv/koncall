package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class DeleteUserState implements State {

    public static final class DeletingUser extends DeleteUserState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public DeletingUser() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deletingUser.id;
            }
            return deletingUser.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final DeletingUser copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new DeletingUser(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletingUser) && sq8.m48644c(this.id, ((DeletingUser) obj).id);
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
            return "DeletingUser(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ DeletingUser(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends DeleteUserState {
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

    public static final class NotStarted extends DeleteUserState {
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

    public static final class Resolver implements StateMachineResolver<DeleteUserState> {
        private final NotStarted defaultState;
        private final DeleteUserActions deleteUserActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(DeleteUserActions deleteUserActions) {
            sq8.m48649h(deleteUserActions, "deleteUserActions");
            this.deleteUserActions = deleteUserActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final DeleteUserEvent.EventType asDeleteUserEvent(StateMachineEvent stateMachineEvent) {
            DeleteUserEvent deleteUserEvent = stateMachineEvent instanceof DeleteUserEvent ? (DeleteUserEvent) stateMachineEvent : null;
            if (deleteUserEvent != null) {
                return deleteUserEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<DeleteUserState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeleteUserState, StateMachineResolver<DeleteUserState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeleteUserState> resolve(DeleteUserState deleteUserState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(deleteUserState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            DeleteUserEvent.EventType eventTypeAsDeleteUserEvent = asDeleteUserEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (eventTypeAsDeleteUserEvent == null) {
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            int i = 1;
            if (deleteUserState instanceof NotStarted ? true : deleteUserState instanceof Error) {
                if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                    return new StateResolution<>(new DeletingUser(str, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.deleteUserActions.initDeleteUserAction(((DeleteUserEvent.EventType.DeleteUser) eventTypeAsDeleteUserEvent).getAccessToken())));
                }
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            if (!(deleteUserState instanceof DeletingUser)) {
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.UserDeleted) {
                return new StateResolution<>(new UserDeleted(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.deleteUserActions.initiateSignOut()));
            }
            if (!(eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.ThrowError)) {
                return new StateResolution<>(deleteUserState, null, 2, null);
            }
            DeleteUserEvent.EventType.ThrowError throwError = (DeleteUserEvent.EventType.ThrowError) eventTypeAsDeleteUserEvent;
            if (throwError.getSignOutUser()) {
                return new StateResolution<>(new UserDeleted(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.deleteUserActions.initiateSignOut()));
            }
            return new StateResolution<>(new Error(throwError.getException()), null, 2, null);
        }
    }

    public static final class UserDeleted extends DeleteUserState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public UserDeleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userDeleted.id;
            }
            return userDeleted.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final UserDeleted copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new UserDeleted(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserDeleted) && sq8.m48644c(this.id, ((UserDeleted) obj).id);
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
            return "UserDeleted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDeleted(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ UserDeleted(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private DeleteUserState() {
    }

    public /* synthetic */ DeleteUserState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
