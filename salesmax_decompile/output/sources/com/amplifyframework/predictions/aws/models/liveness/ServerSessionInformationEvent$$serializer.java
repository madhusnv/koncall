package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class ServerSessionInformationEvent$$serializer implements yn7 {
    public static final ServerSessionInformationEvent$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        ServerSessionInformationEvent$$serializer serverSessionInformationEvent$$serializer = new ServerSessionInformationEvent$$serializer();
        INSTANCE = serverSessionInformationEvent$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent", serverSessionInformationEvent$$serializer, 1);
        ubdVar.m51338k("SessionInformation", false);
        descriptor = ubdVar;
    }

    private ServerSessionInformationEvent$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{SessionInformation$$serializer.INSTANCE};
    }

    @Override // p001o.bn5
    public ServerSessionInformationEvent deserialize(w75 w75Var) {
        SessionInformation sessionInformation;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i = 1;
        if (jo3VarMo20420b.mo17245n()) {
            sessionInformation = (SessionInformation) jo3VarMo20420b.mo17252u(descriptor2, 0, SessionInformation$$serializer.INSTANCE, null);
        } else {
            int i2 = 0;
            sessionInformation = null;
            while (i != 0) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    i = 0;
                } else {
                    if (iMo16814k != 0) {
                        throw new i4i(iMo16814k);
                    }
                    sessionInformation = (SessionInformation) jo3VarMo20420b.mo17252u(descriptor2, 0, SessionInformation$$serializer.INSTANCE, sessionInformation);
                    i2 |= 1;
                }
            }
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new ServerSessionInformationEvent(i, sessionInformation, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, ServerSessionInformationEvent serverSessionInformationEvent) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(serverSessionInformationEvent, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        lo3VarMo29876b.mo37566l(descriptor2, 0, SessionInformation$$serializer.INSTANCE, serverSessionInformationEvent.sessionInformation);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
