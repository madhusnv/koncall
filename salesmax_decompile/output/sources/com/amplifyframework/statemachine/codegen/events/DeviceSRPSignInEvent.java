package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Date;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class DeviceSRPSignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58125type;

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

        public static final class RespondDevicePasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDevicePasswordVerifier(Map<String, String> map, Map<String, String> map2) {
                super(null);
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                this.challengeParameters = map;
                this.metadata = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDevicePasswordVerifier copy$default(RespondDevicePasswordVerifier respondDevicePasswordVerifier, Map map, Map map2, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = respondDevicePasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = respondDevicePasswordVerifier.metadata;
                }
                return respondDevicePasswordVerifier.copy(map, map2);
            }

            public final Map<String, String> component1() {
                return this.challengeParameters;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final RespondDevicePasswordVerifier copy(Map<String, String> map, Map<String, String> map2) {
                sq8.m48649h(map, "challengeParameters");
                sq8.m48649h(map2, "metadata");
                return new RespondDevicePasswordVerifier(map, map2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDevicePasswordVerifier)) {
                    return false;
                }
                RespondDevicePasswordVerifier respondDevicePasswordVerifier = (RespondDevicePasswordVerifier) obj;
                return sq8.m48644c(this.challengeParameters, respondDevicePasswordVerifier.challengeParameters) && sq8.m48644c(this.metadata, respondDevicePasswordVerifier.metadata);
            }

            public final Map<String, String> getChallengeParameters() {
                return this.challengeParameters;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public int hashCode() {
                return (this.challengeParameters.hashCode() * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "RespondDevicePasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class RespondDeviceSRPChallenge extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDeviceSRPChallenge(String str, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDeviceSRPChallenge copy$default(RespondDeviceSRPChallenge respondDeviceSRPChallenge, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = respondDeviceSRPChallenge.username;
                }
                if ((i & 2) != 0) {
                    map = respondDeviceSRPChallenge.metadata;
                }
                return respondDeviceSRPChallenge.copy(str, map);
            }

            public final String component1() {
                return this.username;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final RespondDeviceSRPChallenge copy(String str, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                return new RespondDeviceSRPChallenge(str, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDeviceSRPChallenge)) {
                    return false;
                }
                RespondDeviceSRPChallenge respondDeviceSRPChallenge = (RespondDeviceSRPChallenge) obj;
                return sq8.m48644c(this.username, respondDeviceSRPChallenge.username) && sq8.m48644c(this.metadata, respondDeviceSRPChallenge.metadata);
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
                return "RespondDeviceSRPChallenge(username=" + this.username + ", metadata=" + this.metadata + ")";
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

        public static final class ThrowPasswordVerifiedError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifiedError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowPasswordVerifiedError copy$default(ThrowPasswordVerifiedError throwPasswordVerifiedError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwPasswordVerifiedError.exception;
                }
                return throwPasswordVerifiedError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowPasswordVerifiedError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowPasswordVerifiedError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifiedError) && sq8.m48644c(this.exception, ((ThrowPasswordVerifiedError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowPasswordVerifiedError(exception=" + this.exception + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public DeviceSRPSignInEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58125type = simpleName;
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
        return this.f58125type;
    }

    public /* synthetic */ DeviceSRPSignInEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
