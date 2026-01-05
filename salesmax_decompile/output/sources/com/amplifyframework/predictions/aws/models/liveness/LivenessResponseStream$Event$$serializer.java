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
public final class LivenessResponseStream$Event$$serializer implements yn7 {
    public static final LivenessResponseStream$Event$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        LivenessResponseStream$Event$$serializer livenessResponseStream$Event$$serializer = new LivenessResponseStream$Event$$serializer();
        INSTANCE = livenessResponseStream$Event$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream.Event", livenessResponseStream$Event$$serializer, 2);
        ubdVar.m51338k("ServerSessionInformationEvent", true);
        ubdVar.m51338k("DisconnectionEvent", true);
        descriptor = ubdVar;
    }

    private LivenessResponseStream$Event$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{sm1.m48521p(ServerSessionInformationEvent$$serializer.INSTANCE), sm1.m48521p(DisconnectionEvent$$serializer.INSTANCE)};
    }

    @Override // p001o.bn5
    public LivenessResponseStream.Event deserialize(w75 w75Var) {
        ServerSessionInformationEvent serverSessionInformationEvent;
        DisconnectionEvent disconnectionEvent;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            serverSessionInformationEvent = (ServerSessionInformationEvent) jo3VarMo20420b.mo17244m(descriptor2, 0, ServerSessionInformationEvent$$serializer.INSTANCE, null);
            disconnectionEvent = (DisconnectionEvent) jo3VarMo20420b.mo17244m(descriptor2, 1, DisconnectionEvent$$serializer.INSTANCE, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            serverSessionInformationEvent = null;
            DisconnectionEvent disconnectionEvent2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    serverSessionInformationEvent = (ServerSessionInformationEvent) jo3VarMo20420b.mo17244m(descriptor2, 0, ServerSessionInformationEvent$$serializer.INSTANCE, serverSessionInformationEvent);
                    i2 |= 1;
                } else {
                    if (iMo16814k != 1) {
                        throw new i4i(iMo16814k);
                    }
                    disconnectionEvent2 = (DisconnectionEvent) jo3VarMo20420b.mo17244m(descriptor2, 1, DisconnectionEvent$$serializer.INSTANCE, disconnectionEvent2);
                    i2 |= 2;
                }
            }
            disconnectionEvent = disconnectionEvent2;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new LivenessResponseStream.Event(i, serverSessionInformationEvent, disconnectionEvent, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, LivenessResponseStream.Event event) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(event, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        LivenessResponseStream.Event.write$Self(event, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
