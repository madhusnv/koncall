package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CustomSignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FinalizeSignIn extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43788id;

            /* JADX WARN: Multi-variable type inference failed */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = finalizeSignIn.f43788id;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.f43788id;
            }

            public final FinalizeSignIn copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new FinalizeSignIn(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && AbstractC4154l.m8918a(this.f43788id, ((FinalizeSignIn) obj).f43788id);
            }

            public final String getId() {
                return this.f43788id;
            }

            public int hashCode() {
                return this.f43788id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("FinalizeSignIn(id=", this.f43788id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43788id = id2;
            }

            public /* synthetic */ FinalizeSignIn(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateCustomSignIn extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateCustomSignIn(String username, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateCustomSignIn copy$default(InitiateCustomSignIn initiateCustomSignIn, String str, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateCustomSignIn.username;
                }
                if ((i10 & 2) != 0) {
                    map = initiateCustomSignIn.metadata;
                }
                return initiateCustomSignIn.copy(str, map);
            }

            public final String component1() {
                return this.username;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final InitiateCustomSignIn copy(String username, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateCustomSignIn(username, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateCustomSignIn)) {
                    return false;
                }
                InitiateCustomSignIn initiateCustomSignIn = (InitiateCustomSignIn) obj;
                return AbstractC4154l.m8918a(this.username, initiateCustomSignIn.username) && AbstractC4154l.m8918a(this.metadata, initiateCustomSignIn.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.metadata.hashCode() + (this.username.hashCode() * 31);
            }

            public String toString() {
                return "InitiateCustomSignIn(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowAuthError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                return throwAuthError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowAuthError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowAuthError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowAuthError) && AbstractC4154l.m8918a(this.exception, ((ThrowAuthError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowAuthError(exception=", ")", this.exception);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public CustomSignInEvent(EventType eventType, Date date) {
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

    public /* synthetic */ CustomSignInEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
