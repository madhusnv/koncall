package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeviceSRPSignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FinalizeSignIn extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43790id;

            /* JADX WARN: Multi-variable type inference failed */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = finalizeSignIn.f43790id;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.f43790id;
            }

            public final FinalizeSignIn copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new FinalizeSignIn(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && AbstractC4154l.m8918a(this.f43790id, ((FinalizeSignIn) obj).f43790id);
            }

            public final String getId() {
                return this.f43790id;
            }

            public int hashCode() {
                return this.f43790id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("FinalizeSignIn(id=", this.f43790id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43790id = id2;
            }

            public /* synthetic */ FinalizeSignIn(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RespondDevicePasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDevicePasswordVerifier(Map<String, String> challengeParameters, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.challengeParameters = challengeParameters;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDevicePasswordVerifier copy$default(RespondDevicePasswordVerifier respondDevicePasswordVerifier, Map map, Map map2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = respondDevicePasswordVerifier.challengeParameters;
                }
                if ((i10 & 2) != 0) {
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

            public final RespondDevicePasswordVerifier copy(Map<String, String> challengeParameters, Map<String, String> metadata) {
                AbstractC4154l.m8923f(challengeParameters, "challengeParameters");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new RespondDevicePasswordVerifier(challengeParameters, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDevicePasswordVerifier)) {
                    return false;
                }
                RespondDevicePasswordVerifier respondDevicePasswordVerifier = (RespondDevicePasswordVerifier) obj;
                return AbstractC4154l.m8918a(this.challengeParameters, respondDevicePasswordVerifier.challengeParameters) && AbstractC4154l.m8918a(this.metadata, respondDevicePasswordVerifier.metadata);
            }

            public final Map<String, String> getChallengeParameters() {
                return this.challengeParameters;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public int hashCode() {
                return this.metadata.hashCode() + (this.challengeParameters.hashCode() * 31);
            }

            public String toString() {
                return "RespondDevicePasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class RespondDeviceSRPChallenge extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDeviceSRPChallenge(String username, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDeviceSRPChallenge copy$default(RespondDeviceSRPChallenge respondDeviceSRPChallenge, String str, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = respondDeviceSRPChallenge.username;
                }
                if ((i10 & 2) != 0) {
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

            public final RespondDeviceSRPChallenge copy(String username, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new RespondDeviceSRPChallenge(username, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDeviceSRPChallenge)) {
                    return false;
                }
                RespondDeviceSRPChallenge respondDeviceSRPChallenge = (RespondDeviceSRPChallenge) obj;
                return AbstractC4154l.m8918a(this.username, respondDeviceSRPChallenge.username) && AbstractC4154l.m8918a(this.metadata, respondDeviceSRPChallenge.metadata);
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
                return "RespondDeviceSRPChallenge(username=" + this.username + ", metadata=" + this.metadata + ")";
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowPasswordVerifiedError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifiedError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowPasswordVerifiedError copy$default(ThrowPasswordVerifiedError throwPasswordVerifiedError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwPasswordVerifiedError.exception;
                }
                return throwPasswordVerifiedError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowPasswordVerifiedError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowPasswordVerifiedError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifiedError) && AbstractC4154l.m8918a(this.exception, ((ThrowPasswordVerifiedError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowPasswordVerifiedError(exception=", ")", this.exception);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public DeviceSRPSignInEvent(EventType eventType, Date date) {
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

    public /* synthetic */ DeviceSRPSignInEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
