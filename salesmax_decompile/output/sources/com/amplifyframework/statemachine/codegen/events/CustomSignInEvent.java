package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CustomSignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58123type;

    public static abstract class EventType {

        public static final class FinalizeSignIn extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = finalizeSignIn.id;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final FinalizeSignIn copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new FinalizeSignIn(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && sq8.m48644c(this.id, ((FinalizeSignIn) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "FinalizeSignIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ FinalizeSignIn(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class InitiateCustomSignIn extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateCustomSignIn(String str, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateCustomSignIn copy$default(InitiateCustomSignIn initiateCustomSignIn, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateCustomSignIn.username;
                }
                if ((i & 2) != 0) {
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

            public final InitiateCustomSignIn copy(String str, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                return new InitiateCustomSignIn(str, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateCustomSignIn)) {
                    return false;
                }
                InitiateCustomSignIn initiateCustomSignIn = (InitiateCustomSignIn) obj;
                return sq8.m48644c(this.username, initiateCustomSignIn.username) && sq8.m48644c(this.metadata, initiateCustomSignIn.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (this.username.hashCode() * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateCustomSignIn(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class ThrowAuthError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                return throwAuthError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowAuthError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowAuthError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowAuthError) && sq8.m48644c(this.exception, ((ThrowAuthError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowAuthError(exception=" + this.exception + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public CustomSignInEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58123type = simpleName;
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
        return this.f58123type;
    }

    public /* synthetic */ CustomSignInEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
