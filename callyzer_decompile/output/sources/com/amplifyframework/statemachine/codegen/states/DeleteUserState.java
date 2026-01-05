package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class DeleteUserState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DeletingUser extends DeleteUserState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43815id;

        /* JADX WARN: Multi-variable type inference failed */
        public DeletingUser() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deletingUser.f43815id;
            }
            return deletingUser.copy(str);
        }

        public final String component1() {
            return this.f43815id;
        }

        public final DeletingUser copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new DeletingUser(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletingUser) && AbstractC4154l.m8918a(this.f43815id, ((DeletingUser) obj).f43815id);
        }

        public final String getId() {
            return this.f43815id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43815id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("DeletingUser(id=", this.f43815id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43815id = id2;
        }

        public /* synthetic */ DeletingUser(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends DeleteUserState {
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
    public static final class NotStarted extends DeleteUserState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43816id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43816id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43816id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43816id, ((NotStarted) obj).f43816id);
        }

        public final String getId() {
            return this.f43816id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43816id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43816id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43816id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<DeleteUserState> {
        private final NotStarted defaultState;
        private final DeleteUserActions deleteUserActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(DeleteUserActions deleteUserActions) {
            AbstractC4154l.m8923f(deleteUserActions, "deleteUserActions");
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
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<DeleteUserState, StateMachineResolver<DeleteUserState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<DeleteUserState> resolve(DeleteUserState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            DeleteUserEvent.EventType eventTypeAsDeleteUserEvent = asDeleteUserEvent(event);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (eventTypeAsDeleteUserEvent == null) {
                return new StateResolution<>(oldState, null, 2, null);
            }
            int i10 = 1;
            if ((oldState instanceof NotStarted) || (oldState instanceof Error)) {
                if (!(eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser)) {
                    return new StateResolution<>(oldState, null, 2, null);
                }
                return new StateResolution<>(new DeletingUser(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.deleteUserActions.initDeleteUserAction(((DeleteUserEvent.EventType.DeleteUser) eventTypeAsDeleteUserEvent).getAccessToken())));
            }
            if (!(oldState instanceof DeletingUser)) {
                return new StateResolution<>(oldState, null, 2, null);
            }
            if (eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.UserDeleted) {
                return new StateResolution<>(new UserDeleted(str, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.deleteUserActions.initiateSignOut()));
            }
            if (!(eventTypeAsDeleteUserEvent instanceof DeleteUserEvent.EventType.ThrowError)) {
                return new StateResolution<>(oldState, null, 2, null);
            }
            DeleteUserEvent.EventType.ThrowError throwError = (DeleteUserEvent.EventType.ThrowError) eventTypeAsDeleteUserEvent;
            if (!throwError.getSignOutUser()) {
                return new StateResolution<>(new Error(throwError.getException()), null, 2, null);
            }
            return new StateResolution<>(new UserDeleted(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.deleteUserActions.initiateSignOut()));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class UserDeleted extends DeleteUserState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43817id;

        /* JADX WARN: Multi-variable type inference failed */
        public UserDeleted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userDeleted.f43817id;
            }
            return userDeleted.copy(str);
        }

        public final String component1() {
            return this.f43817id;
        }

        public final UserDeleted copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new UserDeleted(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserDeleted) && AbstractC4154l.m8918a(this.f43817id, ((UserDeleted) obj).f43817id);
        }

        public final String getId() {
            return this.f43817id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43817id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("UserDeleted(id=", this.f43817id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDeleted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43817id = id2;
        }

        public /* synthetic */ UserDeleted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ DeleteUserState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private DeleteUserState() {
    }
}
