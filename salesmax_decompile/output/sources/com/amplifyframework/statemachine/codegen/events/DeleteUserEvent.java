package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class DeleteUserEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58124type;

    public static abstract class EventType {

        public static final class DeleteUser extends EventType {
            private final String accessToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteUser(String str) {
                super(null);
                sq8.m48649h(str, "accessToken");
                this.accessToken = str;
            }

            public static /* synthetic */ DeleteUser copy$default(DeleteUser deleteUser, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deleteUser.accessToken;
                }
                return deleteUser.copy(str);
            }

            public final String component1() {
                return this.accessToken;
            }

            public final DeleteUser copy(String str) {
                sq8.m48649h(str, "accessToken");
                return new DeleteUser(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeleteUser) && sq8.m48644c(this.accessToken, ((DeleteUser) obj).accessToken);
            }

            public final String getAccessToken() {
                return this.accessToken;
            }

            public int hashCode() {
                return this.accessToken.hashCode();
            }

            public String toString() {
                return "DeleteUser(accessToken=" + this.accessToken + ")";
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;
            private final boolean signOutUser;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc, boolean z) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
                this.signOutUser = z;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i & 2) != 0) {
                    z = throwError.signOutUser;
                }
                return throwError.copy(exc, z);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final boolean component2() {
                return this.signOutUser;
            }

            public final ThrowError copy(Exception exc, boolean z) {
                sq8.m48649h(exc, "exception");
                return new ThrowError(exc, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return sq8.m48644c(this.exception, throwError.exception) && this.signOutUser == throwError.signOutUser;
            }

            public final Exception getException() {
                return this.exception;
            }

            public final boolean getSignOutUser() {
                return this.signOutUser;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = this.exception.hashCode() * 31;
                boolean z = this.signOutUser;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return iHashCode + i;
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ", signOutUser=" + this.signOutUser + ")";
            }
        }

        public static final class UserDeleted extends EventType {
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

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDeleted) && sq8.m48644c(this.id, ((UserDeleted) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

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

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public DeleteUserEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58124type = simpleName;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.f58124type;
    }

    public /* synthetic */ DeleteUserEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
