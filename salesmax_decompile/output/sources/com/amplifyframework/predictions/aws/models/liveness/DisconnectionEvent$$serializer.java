package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.qla;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class DisconnectionEvent$$serializer implements yn7 {
    public static final DisconnectionEvent$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        DisconnectionEvent$$serializer disconnectionEvent$$serializer = new DisconnectionEvent$$serializer();
        INSTANCE = disconnectionEvent$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent", disconnectionEvent$$serializer, 1);
        ubdVar.m51338k("TimestampMillis", false);
        descriptor = ubdVar;
    }

    private DisconnectionEvent$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{qla.f42120a};
    }

    @Override // p001o.bn5
    public DisconnectionEvent deserialize(w75 w75Var) {
        long jMo17220H;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i = 1;
        if (jo3VarMo20420b.mo17245n()) {
            jMo17220H = jo3VarMo20420b.mo17220H(descriptor2, 0);
        } else {
            long jMo17220H2 = 0;
            int i2 = 0;
            while (i != 0) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    i = 0;
                } else {
                    if (iMo16814k != 0) {
                        throw new i4i(iMo16814k);
                    }
                    jMo17220H2 = jo3VarMo20420b.mo17220H(descriptor2, 0);
                    i2 |= 1;
                }
            }
            i = i2;
            jMo17220H = jMo17220H2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new DisconnectionEvent(i, jMo17220H, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, DisconnectionEvent disconnectionEvent) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(disconnectionEvent, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        lo3VarMo29876b.mo37565k(descriptor2, 0, disconnectionEvent.timestampMillis);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
