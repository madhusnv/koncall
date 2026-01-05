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
public final class InitialFace$$serializer implements yn7 {
    public static final InitialFace$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        InitialFace$$serializer initialFace$$serializer = new InitialFace$$serializer();
        INSTANCE = initialFace$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.InitialFace", initialFace$$serializer, 2);
        ubdVar.m51338k("BoundingBox", false);
        ubdVar.m51338k("InitialFaceDetectedTimestamp", false);
        descriptor = ubdVar;
    }

    private InitialFace$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        return new dc9[]{BoundingBox$$serializer.INSTANCE, qla.f42120a};
    }

    @Override // p001o.bn5
    public InitialFace deserialize(w75 w75Var) {
        BoundingBox boundingBox;
        int i;
        long jMo17220H;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            boundingBox = (BoundingBox) jo3VarMo20420b.mo17252u(descriptor2, 0, BoundingBox$$serializer.INSTANCE, null);
            jMo17220H = jo3VarMo20420b.mo17220H(descriptor2, 1);
            i = 3;
        } else {
            long jMo17220H2 = 0;
            boolean z = true;
            BoundingBox boundingBox2 = null;
            int i2 = 0;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    boundingBox2 = (BoundingBox) jo3VarMo20420b.mo17252u(descriptor2, 0, BoundingBox$$serializer.INSTANCE, boundingBox2);
                    i2 |= 1;
                } else {
                    if (iMo16814k != 1) {
                        throw new i4i(iMo16814k);
                    }
                    jMo17220H2 = jo3VarMo20420b.mo17220H(descriptor2, 1);
                    i2 |= 2;
                }
            }
            boundingBox = boundingBox2;
            i = i2;
            jMo17220H = jMo17220H2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new InitialFace(i, boundingBox, jMo17220H, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, InitialFace initialFace) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(initialFace, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        InitialFace.write$Self(initialFace, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
