package com.amplifyframework.predictions.aws.models.liveness;

import com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream;
import p001o.dc9;
import p001o.fff;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class LivenessResponseStream$Exception$$serializer implements yn7 {
    public static final LivenessResponseStream$Exception$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        LivenessResponseStream$Exception$$serializer livenessResponseStream$Exception$$serializer = new LivenessResponseStream$Exception$$serializer();
        INSTANCE = livenessResponseStream$Exception$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream.Exception", livenessResponseStream$Exception$$serializer, 9);
        ubdVar.m51338k("ValidationException", true);
        ubdVar.m51338k("InternalServerException", true);
        ubdVar.m51338k("ThrottlingException", true);
        ubdVar.m51338k("ServiceQuotaExceededException", true);
        ubdVar.m51338k("ServiceUnavailableException", true);
        ubdVar.m51338k("SessionNotFoundException", true);
        ubdVar.m51338k("AccessDeniedException", true);
        ubdVar.m51338k("InvalidSignatureException", true);
        ubdVar.m51338k("UnrecognizedClientException", true);
        descriptor = ubdVar;
    }

    private LivenessResponseStream$Exception$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{sm1.m48521p(ValidationException$$serializer.INSTANCE), sm1.m48521p(InternalServerException$$serializer.INSTANCE), sm1.m48521p(ThrottlingException$$serializer.INSTANCE), sm1.m48521p(ServiceQuotaExceededException$$serializer.INSTANCE), sm1.m48521p(ServiceUnavailableException$$serializer.INSTANCE), sm1.m48521p(SessionNotFoundException$$serializer.INSTANCE), sm1.m48521p(AccessDeniedException$$serializer.INSTANCE), sm1.m48521p(InvalidSignatureException$$serializer.INSTANCE), sm1.m48521p(UnrecognizedClientException$$serializer.INSTANCE)};
    }

    @Override // p001o.bn5
    public LivenessResponseStream.Exception deserialize(w75 w75Var) {
        int i;
        UnrecognizedClientException unrecognizedClientException;
        ValidationException validationException;
        ServiceUnavailableException serviceUnavailableException;
        ServiceQuotaExceededException serviceQuotaExceededException;
        InvalidSignatureException invalidSignatureException;
        AccessDeniedException accessDeniedException;
        InternalServerException internalServerException;
        SessionNotFoundException sessionNotFoundException;
        ThrottlingException throttlingException;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i2 = 7;
        ValidationException validationException2 = null;
        if (jo3VarMo20420b.mo17245n()) {
            ValidationException validationException3 = (ValidationException) jo3VarMo20420b.mo17244m(descriptor2, 0, ValidationException$$serializer.INSTANCE, null);
            InternalServerException internalServerException2 = (InternalServerException) jo3VarMo20420b.mo17244m(descriptor2, 1, InternalServerException$$serializer.INSTANCE, null);
            ThrottlingException throttlingException2 = (ThrottlingException) jo3VarMo20420b.mo17244m(descriptor2, 2, ThrottlingException$$serializer.INSTANCE, null);
            ServiceQuotaExceededException serviceQuotaExceededException2 = (ServiceQuotaExceededException) jo3VarMo20420b.mo17244m(descriptor2, 3, ServiceQuotaExceededException$$serializer.INSTANCE, null);
            ServiceUnavailableException serviceUnavailableException2 = (ServiceUnavailableException) jo3VarMo20420b.mo17244m(descriptor2, 4, ServiceUnavailableException$$serializer.INSTANCE, null);
            SessionNotFoundException sessionNotFoundException2 = (SessionNotFoundException) jo3VarMo20420b.mo17244m(descriptor2, 5, SessionNotFoundException$$serializer.INSTANCE, null);
            AccessDeniedException accessDeniedException2 = (AccessDeniedException) jo3VarMo20420b.mo17244m(descriptor2, 6, AccessDeniedException$$serializer.INSTANCE, null);
            invalidSignatureException = (InvalidSignatureException) jo3VarMo20420b.mo17244m(descriptor2, 7, InvalidSignatureException$$serializer.INSTANCE, null);
            accessDeniedException = accessDeniedException2;
            sessionNotFoundException = sessionNotFoundException2;
            unrecognizedClientException = (UnrecognizedClientException) jo3VarMo20420b.mo17244m(descriptor2, 8, UnrecognizedClientException$$serializer.INSTANCE, null);
            serviceUnavailableException = serviceUnavailableException2;
            i = 511;
            validationException = validationException3;
            serviceQuotaExceededException = serviceQuotaExceededException2;
            throttlingException = throttlingException2;
            internalServerException = internalServerException2;
        } else {
            boolean z = true;
            int i3 = 0;
            InvalidSignatureException invalidSignatureException2 = null;
            UnrecognizedClientException unrecognizedClientException2 = null;
            AccessDeniedException accessDeniedException3 = null;
            SessionNotFoundException sessionNotFoundException3 = null;
            ServiceUnavailableException serviceUnavailableException3 = null;
            InternalServerException internalServerException3 = null;
            ThrottlingException throttlingException3 = null;
            ServiceQuotaExceededException serviceQuotaExceededException3 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        validationException2 = (ValidationException) jo3VarMo20420b.mo17244m(descriptor2, 0, ValidationException$$serializer.INSTANCE, validationException2);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        internalServerException3 = (InternalServerException) jo3VarMo20420b.mo17244m(descriptor2, 1, InternalServerException$$serializer.INSTANCE, internalServerException3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        throttlingException3 = (ThrottlingException) jo3VarMo20420b.mo17244m(descriptor2, 2, ThrottlingException$$serializer.INSTANCE, throttlingException3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        serviceQuotaExceededException3 = (ServiceQuotaExceededException) jo3VarMo20420b.mo17244m(descriptor2, 3, ServiceQuotaExceededException$$serializer.INSTANCE, serviceQuotaExceededException3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        serviceUnavailableException3 = (ServiceUnavailableException) jo3VarMo20420b.mo17244m(descriptor2, 4, ServiceUnavailableException$$serializer.INSTANCE, serviceUnavailableException3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        sessionNotFoundException3 = (SessionNotFoundException) jo3VarMo20420b.mo17244m(descriptor2, 5, SessionNotFoundException$$serializer.INSTANCE, sessionNotFoundException3);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        accessDeniedException3 = (AccessDeniedException) jo3VarMo20420b.mo17244m(descriptor2, 6, AccessDeniedException$$serializer.INSTANCE, accessDeniedException3);
                        i3 |= 64;
                    case 7:
                        invalidSignatureException2 = (InvalidSignatureException) jo3VarMo20420b.mo17244m(descriptor2, i2, InvalidSignatureException$$serializer.INSTANCE, invalidSignatureException2);
                        i3 |= 128;
                    case 8:
                        unrecognizedClientException2 = (UnrecognizedClientException) jo3VarMo20420b.mo17244m(descriptor2, 8, UnrecognizedClientException$$serializer.INSTANCE, unrecognizedClientException2);
                        i3 |= 256;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            i = i3;
            unrecognizedClientException = unrecognizedClientException2;
            validationException = validationException2;
            serviceUnavailableException = serviceUnavailableException3;
            serviceQuotaExceededException = serviceQuotaExceededException3;
            invalidSignatureException = invalidSignatureException2;
            ThrottlingException throttlingException4 = throttlingException3;
            accessDeniedException = accessDeniedException3;
            internalServerException = internalServerException3;
            sessionNotFoundException = sessionNotFoundException3;
            throttlingException = throttlingException4;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new LivenessResponseStream.Exception(i, validationException, internalServerException, throttlingException, serviceQuotaExceededException, serviceUnavailableException, sessionNotFoundException, accessDeniedException, invalidSignatureException, unrecognizedClientException, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, LivenessResponseStream.Exception exception) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(exception, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        LivenessResponseStream.Exception.write$Self(exception, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
