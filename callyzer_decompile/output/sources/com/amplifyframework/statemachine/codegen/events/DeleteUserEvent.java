package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeleteUserEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class DeleteUser extends EventType {
            private final String accessToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteUser(String accessToken) {
                super(null);
                AbstractC4154l.m8923f(accessToken, "accessToken");
                this.accessToken = accessToken;
            }

            public static /* synthetic */ DeleteUser copy$default(DeleteUser deleteUser, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = deleteUser.accessToken;
                }
                return deleteUser.copy(str);
            }

            public final String component1() {
                return this.accessToken;
            }

            public final DeleteUser copy(String accessToken) {
                AbstractC4154l.m8923f(accessToken, "accessToken");
                return new DeleteUser(accessToken);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeleteUser) && AbstractC4154l.m8918a(this.accessToken, ((DeleteUser) obj).accessToken);
            }

            public final String getAccessToken() {
                return this.accessToken;
            }

            public int hashCode() {
                return this.accessToken.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("DeleteUser(accessToken=", this.accessToken, ")");
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;
            private final boolean signOutUser;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception, boolean z6) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
                this.signOutUser = z6;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i10 & 2) != 0) {
                    z6 = throwError.signOutUser;
                }
                return throwError.copy(exc, z6);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final boolean component2() {
                return this.signOutUser;
            }

            public final ThrowError copy(Exception exception, boolean z6) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowError(exception, z6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return AbstractC4154l.m8918a(this.exception, throwError.exception) && this.signOutUser == throwError.signOutUser;
            }

            public final Exception getException() {
                return this.exception;
            }

            public final boolean getSignOutUser() {
                return this.signOutUser;
            }

            public int hashCode() {
                return Boolean.hashCode(this.signOutUser) + (this.exception.hashCode() * 31);
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ", signOutUser=" + this.signOutUser + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class UserDeleted extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43789id;

            /* JADX WARN: Multi-variable type inference failed */
            public UserDeleted() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userDeleted.f43789id;
                }
                return userDeleted.copy(str);
            }

            public final String component1() {
                return this.f43789id;
            }

            public final UserDeleted copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new UserDeleted(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDeleted) && AbstractC4154l.m8918a(this.f43789id, ((UserDeleted) obj).f43789id);
            }

            public final String getId() {
                return this.f43789id;
            }

            public int hashCode() {
                return this.f43789id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("UserDeleted(id=", this.f43789id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserDeleted(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43789id = id2;
            }

            public /* synthetic */ UserDeleted(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public DeleteUserEvent(EventType eventType, Date date) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        this.type = eventType.getClass().getSimpleName();
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return super.getId();
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public /* synthetic */ DeleteUserEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
