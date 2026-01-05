package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.m37;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class BoundingBox$$serializer implements yn7 {
    public static final BoundingBox$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        BoundingBox$$serializer boundingBox$$serializer = new BoundingBox$$serializer();
        INSTANCE = boundingBox$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.BoundingBox", boundingBox$$serializer, 4);
        ubdVar.m51338k("Width", false);
        ubdVar.m51338k("Height", false);
        ubdVar.m51338k("Left", false);
        ubdVar.m51338k("Top", false);
        descriptor = ubdVar;
    }

    private BoundingBox$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        m37 m37Var = m37.f34693a;
        return new dc9[]{m37Var, m37Var, m37Var, m37Var};
    }

    @Override // p001o.bn5
    public BoundingBox deserialize(w75 w75Var) {
        float f;
        float fMo17217E;
        float f2;
        float f3;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            float fMo17217E2 = jo3VarMo20420b.mo17217E(descriptor2, 0);
            float fMo17217E3 = jo3VarMo20420b.mo17217E(descriptor2, 1);
            float fMo17217E4 = jo3VarMo20420b.mo17217E(descriptor2, 2);
            f = fMo17217E2;
            fMo17217E = jo3VarMo20420b.mo17217E(descriptor2, 3);
            f2 = fMo17217E4;
            f3 = fMo17217E3;
            i = 15;
        } else {
            float fMo17217E5 = 0.0f;
            float fMo17217E6 = 0.0f;
            float fMo17217E7 = 0.0f;
            float fMo17217E8 = 0.0f;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    fMo17217E5 = jo3VarMo20420b.mo17217E(descriptor2, 0);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    fMo17217E8 = jo3VarMo20420b.mo17217E(descriptor2, 1);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    fMo17217E7 = jo3VarMo20420b.mo17217E(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iMo16814k != 3) {
                        throw new i4i(iMo16814k);
                    }
                    fMo17217E6 = jo3VarMo20420b.mo17217E(descriptor2, 3);
                    i2 |= 8;
                }
            }
            f = fMo17217E5;
            fMo17217E = fMo17217E6;
            f2 = fMo17217E7;
            f3 = fMo17217E8;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new BoundingBox(i, f, f3, f2, fMo17217E, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, BoundingBox boundingBox) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(boundingBox, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        BoundingBox.write$Self(boundingBox, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
