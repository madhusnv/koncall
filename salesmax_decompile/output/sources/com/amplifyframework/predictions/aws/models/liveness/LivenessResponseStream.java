package com.amplifyframework.predictions.aws.models.liveness;

import java.lang.annotation.Annotation;
import p001o.cj9;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.gi9;
import p001o.id5;
import p001o.kf9;
import p001o.kge;
import p001o.l8f;
import p001o.lo3;
import p001o.ob9;
import p001o.si9;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;
import p001o.uk7;

@dff
/* loaded from: classes5.dex */
public abstract class LivenessResponseStream {
    public static final Companion Companion = new Companion(null);
    private static final gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C106141.INSTANCE);

    public static final class Companion {

        /* renamed from: com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream$Companion$1 */
        public static final class C106141 extends kf9 implements uk7 {
            public static final C106141 INSTANCE = new C106141();

            public C106141() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new l8f("com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream", kge.m35689b(LivenessResponseStream.class), new ob9[]{kge.m35689b(Event.class), kge.m35689b(Exception.class)}, new dc9[]{LivenessResponseStream$Event$$serializer.INSTANCE, LivenessResponseStream$Exception$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) LivenessResponseStream.$cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class Event extends LivenessResponseStream {
        public static final Companion Companion = new Companion(null);
        private final DisconnectionEvent disconnectionEvent;
        private final ServerSessionInformationEvent serverSessionInformationEvent;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return LivenessResponseStream$Event$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Event() {
            this((ServerSessionInformationEvent) null, (DisconnectionEvent) (0 == true ? 1 : 0), 3, (id5) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Event copy$default(Event event, ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                serverSessionInformationEvent = event.serverSessionInformationEvent;
            }
            if ((i & 2) != 0) {
                disconnectionEvent = event.disconnectionEvent;
            }
            return event.copy(serverSessionInformationEvent, disconnectionEvent);
        }

        public static /* synthetic */ void getDisconnectionEvent$annotations() {
        }

        public static /* synthetic */ void getServerSessionInformationEvent$annotations() {
        }

        public static final /* synthetic */ void write$Self(Event event, lo3 lo3Var, uef uefVar) {
            LivenessResponseStream.write$Self(event, lo3Var, uefVar);
            if (lo3Var.mo37569r(uefVar, 0) || event.serverSessionInformationEvent != null) {
                lo3Var.mo37571z(uefVar, 0, ServerSessionInformationEvent$$serializer.INSTANCE, event.serverSessionInformationEvent);
            }
            if (lo3Var.mo37569r(uefVar, 1) || event.disconnectionEvent != null) {
                lo3Var.mo37571z(uefVar, 1, DisconnectionEvent$$serializer.INSTANCE, event.disconnectionEvent);
            }
        }

        public final ServerSessionInformationEvent component1() {
            return this.serverSessionInformationEvent;
        }

        public final DisconnectionEvent component2() {
            return this.disconnectionEvent;
        }

        public final Event copy(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent) {
            return new Event(serverSessionInformationEvent, disconnectionEvent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return sq8.m48644c(this.serverSessionInformationEvent, event.serverSessionInformationEvent) && sq8.m48644c(this.disconnectionEvent, event.disconnectionEvent);
        }

        public final DisconnectionEvent getDisconnectionEvent() {
            return this.disconnectionEvent;
        }

        public final ServerSessionInformationEvent getServerSessionInformationEvent() {
            return this.serverSessionInformationEvent;
        }

        public int hashCode() {
            ServerSessionInformationEvent serverSessionInformationEvent = this.serverSessionInformationEvent;
            int iHashCode = (serverSessionInformationEvent == null ? 0 : serverSessionInformationEvent.hashCode()) * 31;
            DisconnectionEvent disconnectionEvent = this.disconnectionEvent;
            return iHashCode + (disconnectionEvent != null ? disconnectionEvent.hashCode() : 0);
        }

        public String toString() {
            return "Event(serverSessionInformationEvent=" + this.serverSessionInformationEvent + ", disconnectionEvent=" + this.disconnectionEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Event(int i, ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, fff fffVar) {
            super(i, fffVar);
            if ((i & 0) != 0) {
                tbd.m49692a(i, 0, LivenessResponseStream$Event$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.serverSessionInformationEvent = null;
            } else {
                this.serverSessionInformationEvent = serverSessionInformationEvent;
            }
            if ((i & 2) == 0) {
                this.disconnectionEvent = null;
            } else {
                this.disconnectionEvent = disconnectionEvent;
            }
        }

        public /* synthetic */ Event(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : serverSessionInformationEvent, (i & 2) != 0 ? null : disconnectionEvent);
        }

        public Event(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent) {
            super(null);
            this.serverSessionInformationEvent = serverSessionInformationEvent;
            this.disconnectionEvent = disconnectionEvent;
        }
    }

    @dff
    public static final class Exception extends LivenessResponseStream {
        public static final Companion Companion = new Companion(null);
        private final AccessDeniedException accessDeniedException;
        private final InternalServerException internalServerException;
        private final InvalidSignatureException invalidSignatureException;
        private final ServiceQuotaExceededException serviceQuotaExceededException;
        private final ServiceUnavailableException serviceUnavailableException;
        private final SessionNotFoundException sessionNotFoundException;
        private final ThrottlingException throttlingException;
        private final UnrecognizedClientException unrecognizedClientException;
        private final ValidationException validationException;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return LivenessResponseStream$Exception$$serializer.INSTANCE;
            }
        }

        public Exception() {
            this((ValidationException) null, (InternalServerException) null, (ThrottlingException) null, (ServiceQuotaExceededException) null, (ServiceUnavailableException) null, (SessionNotFoundException) null, (AccessDeniedException) null, (InvalidSignatureException) null, (UnrecognizedClientException) null, 511, (id5) null);
        }

        public static /* synthetic */ void getAccessDeniedException$annotations() {
        }

        public static /* synthetic */ void getInternalServerException$annotations() {
        }

        public static /* synthetic */ void getInvalidSignatureException$annotations() {
        }

        public static /* synthetic */ void getServiceQuotaExceededException$annotations() {
        }

        public static /* synthetic */ void getServiceUnavailableException$annotations() {
        }

        public static /* synthetic */ void getSessionNotFoundException$annotations() {
        }

        public static /* synthetic */ void getThrottlingException$annotations() {
        }

        public static /* synthetic */ void getUnrecognizedClientException$annotations() {
        }

        public static /* synthetic */ void getValidationException$annotations() {
        }

        public static final /* synthetic */ void write$Self(Exception exception, lo3 lo3Var, uef uefVar) {
            LivenessResponseStream.write$Self(exception, lo3Var, uefVar);
            if (lo3Var.mo37569r(uefVar, 0) || exception.validationException != null) {
                lo3Var.mo37571z(uefVar, 0, ValidationException$$serializer.INSTANCE, exception.validationException);
            }
            if (lo3Var.mo37569r(uefVar, 1) || exception.internalServerException != null) {
                lo3Var.mo37571z(uefVar, 1, InternalServerException$$serializer.INSTANCE, exception.internalServerException);
            }
            if (lo3Var.mo37569r(uefVar, 2) || exception.throttlingException != null) {
                lo3Var.mo37571z(uefVar, 2, ThrottlingException$$serializer.INSTANCE, exception.throttlingException);
            }
            if (lo3Var.mo37569r(uefVar, 3) || exception.serviceQuotaExceededException != null) {
                lo3Var.mo37571z(uefVar, 3, ServiceQuotaExceededException$$serializer.INSTANCE, exception.serviceQuotaExceededException);
            }
            if (lo3Var.mo37569r(uefVar, 4) || exception.serviceUnavailableException != null) {
                lo3Var.mo37571z(uefVar, 4, ServiceUnavailableException$$serializer.INSTANCE, exception.serviceUnavailableException);
            }
            if (lo3Var.mo37569r(uefVar, 5) || exception.sessionNotFoundException != null) {
                lo3Var.mo37571z(uefVar, 5, SessionNotFoundException$$serializer.INSTANCE, exception.sessionNotFoundException);
            }
            if (lo3Var.mo37569r(uefVar, 6) || exception.accessDeniedException != null) {
                lo3Var.mo37571z(uefVar, 6, AccessDeniedException$$serializer.INSTANCE, exception.accessDeniedException);
            }
            if (lo3Var.mo37569r(uefVar, 7) || exception.invalidSignatureException != null) {
                lo3Var.mo37571z(uefVar, 7, InvalidSignatureException$$serializer.INSTANCE, exception.invalidSignatureException);
            }
            if (lo3Var.mo37569r(uefVar, 8) || exception.unrecognizedClientException != null) {
                lo3Var.mo37571z(uefVar, 8, UnrecognizedClientException$$serializer.INSTANCE, exception.unrecognizedClientException);
            }
        }

        public final ValidationException component1() {
            return this.validationException;
        }

        public final InternalServerException component2() {
            return this.internalServerException;
        }

        public final ThrottlingException component3() {
            return this.throttlingException;
        }

        public final ServiceQuotaExceededException component4() {
            return this.serviceQuotaExceededException;
        }

        public final ServiceUnavailableException component5() {
            return this.serviceUnavailableException;
        }

        public final SessionNotFoundException component6() {
            return this.sessionNotFoundException;
        }

        public final AccessDeniedException component7() {
            return this.accessDeniedException;
        }

        public final InvalidSignatureException component8() {
            return this.invalidSignatureException;
        }

        public final UnrecognizedClientException component9() {
            return this.unrecognizedClientException;
        }

        public final Exception copy(ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException) {
            return new Exception(validationException, internalServerException, throttlingException, serviceQuotaExceededException, serviceUnavailableException, sessionNotFoundException, accessDeniedException, invalidSignatureException, unrecognizedClientException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Exception)) {
                return false;
            }
            Exception exception = (Exception) obj;
            return sq8.m48644c(this.validationException, exception.validationException) && sq8.m48644c(this.internalServerException, exception.internalServerException) && sq8.m48644c(this.throttlingException, exception.throttlingException) && sq8.m48644c(this.serviceQuotaExceededException, exception.serviceQuotaExceededException) && sq8.m48644c(this.serviceUnavailableException, exception.serviceUnavailableException) && sq8.m48644c(this.sessionNotFoundException, exception.sessionNotFoundException) && sq8.m48644c(this.accessDeniedException, exception.accessDeniedException) && sq8.m48644c(this.invalidSignatureException, exception.invalidSignatureException) && sq8.m48644c(this.unrecognizedClientException, exception.unrecognizedClientException);
        }

        public final AccessDeniedException getAccessDeniedException() {
            return this.accessDeniedException;
        }

        public final InternalServerException getInternalServerException() {
            return this.internalServerException;
        }

        public final InvalidSignatureException getInvalidSignatureException() {
            return this.invalidSignatureException;
        }

        public final ServiceQuotaExceededException getServiceQuotaExceededException() {
            return this.serviceQuotaExceededException;
        }

        public final ServiceUnavailableException getServiceUnavailableException() {
            return this.serviceUnavailableException;
        }

        public final SessionNotFoundException getSessionNotFoundException() {
            return this.sessionNotFoundException;
        }

        public final ThrottlingException getThrottlingException() {
            return this.throttlingException;
        }

        public final UnrecognizedClientException getUnrecognizedClientException() {
            return this.unrecognizedClientException;
        }

        public final ValidationException getValidationException() {
            return this.validationException;
        }

        public int hashCode() {
            ValidationException validationException = this.validationException;
            int iHashCode = (validationException == null ? 0 : validationException.hashCode()) * 31;
            InternalServerException internalServerException = this.internalServerException;
            int iHashCode2 = (iHashCode + (internalServerException == null ? 0 : internalServerException.hashCode())) * 31;
            ThrottlingException throttlingException = this.throttlingException;
            int iHashCode3 = (iHashCode2 + (throttlingException == null ? 0 : throttlingException.hashCode())) * 31;
            ServiceQuotaExceededException serviceQuotaExceededException = this.serviceQuotaExceededException;
            int iHashCode4 = (iHashCode3 + (serviceQuotaExceededException == null ? 0 : serviceQuotaExceededException.hashCode())) * 31;
            ServiceUnavailableException serviceUnavailableException = this.serviceUnavailableException;
            int iHashCode5 = (iHashCode4 + (serviceUnavailableException == null ? 0 : serviceUnavailableException.hashCode())) * 31;
            SessionNotFoundException sessionNotFoundException = this.sessionNotFoundException;
            int iHashCode6 = (iHashCode5 + (sessionNotFoundException == null ? 0 : sessionNotFoundException.hashCode())) * 31;
            AccessDeniedException accessDeniedException = this.accessDeniedException;
            int iHashCode7 = (iHashCode6 + (accessDeniedException == null ? 0 : accessDeniedException.hashCode())) * 31;
            InvalidSignatureException invalidSignatureException = this.invalidSignatureException;
            int iHashCode8 = (iHashCode7 + (invalidSignatureException == null ? 0 : invalidSignatureException.hashCode())) * 31;
            UnrecognizedClientException unrecognizedClientException = this.unrecognizedClientException;
            return iHashCode8 + (unrecognizedClientException != null ? unrecognizedClientException.hashCode() : 0);
        }

        public String toString() {
            return "Exception(validationException=" + this.validationException + ", internalServerException=" + this.internalServerException + ", throttlingException=" + this.throttlingException + ", serviceQuotaExceededException=" + this.serviceQuotaExceededException + ", serviceUnavailableException=" + this.serviceUnavailableException + ", sessionNotFoundException=" + this.sessionNotFoundException + ", accessDeniedException=" + this.accessDeniedException + ", invalidSignatureException=" + this.invalidSignatureException + ", unrecognizedClientException=" + this.unrecognizedClientException + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Exception(int i, ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException, fff fffVar) {
            super(i, fffVar);
            if ((i & 0) != 0) {
                tbd.m49692a(i, 0, LivenessResponseStream$Exception$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.validationException = null;
            } else {
                this.validationException = validationException;
            }
            if ((i & 2) == 0) {
                this.internalServerException = null;
            } else {
                this.internalServerException = internalServerException;
            }
            if ((i & 4) == 0) {
                this.throttlingException = null;
            } else {
                this.throttlingException = throttlingException;
            }
            if ((i & 8) == 0) {
                this.serviceQuotaExceededException = null;
            } else {
                this.serviceQuotaExceededException = serviceQuotaExceededException;
            }
            if ((i & 16) == 0) {
                this.serviceUnavailableException = null;
            } else {
                this.serviceUnavailableException = serviceUnavailableException;
            }
            if ((i & 32) == 0) {
                this.sessionNotFoundException = null;
            } else {
                this.sessionNotFoundException = sessionNotFoundException;
            }
            if ((i & 64) == 0) {
                this.accessDeniedException = null;
            } else {
                this.accessDeniedException = accessDeniedException;
            }
            if ((i & 128) == 0) {
                this.invalidSignatureException = null;
            } else {
                this.invalidSignatureException = invalidSignatureException;
            }
            if ((i & 256) == 0) {
                this.unrecognizedClientException = null;
            } else {
                this.unrecognizedClientException = unrecognizedClientException;
            }
        }

        public /* synthetic */ Exception(ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : validationException, (i & 2) != 0 ? null : internalServerException, (i & 4) != 0 ? null : throttlingException, (i & 8) != 0 ? null : serviceQuotaExceededException, (i & 16) != 0 ? null : serviceUnavailableException, (i & 32) != 0 ? null : sessionNotFoundException, (i & 64) != 0 ? null : accessDeniedException, (i & 128) != 0 ? null : invalidSignatureException, (i & 256) == 0 ? unrecognizedClientException : null);
        }

        public Exception(ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException) {
            super(null);
            this.validationException = validationException;
            this.internalServerException = internalServerException;
            this.throttlingException = throttlingException;
            this.serviceQuotaExceededException = serviceQuotaExceededException;
            this.serviceUnavailableException = serviceUnavailableException;
            this.sessionNotFoundException = sessionNotFoundException;
            this.accessDeniedException = accessDeniedException;
            this.invalidSignatureException = invalidSignatureException;
            this.unrecognizedClientException = unrecognizedClientException;
        }
    }

    public /* synthetic */ LivenessResponseStream(int i, fff fffVar) {
    }

    public /* synthetic */ LivenessResponseStream(id5 id5Var) {
        this();
    }

    public static final /* synthetic */ void write$Self(LivenessResponseStream livenessResponseStream, lo3 lo3Var, uef uefVar) {
    }

    private LivenessResponseStream() {
    }
}
