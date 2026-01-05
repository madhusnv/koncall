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
public final class ColorSequence$$serializer implements yn7 {
    public static final ColorSequence$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        ColorSequence$$serializer colorSequence$$serializer = new ColorSequence$$serializer();
        INSTANCE = colorSequence$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.ColorSequence", colorSequence$$serializer, 3);
        ubdVar.m51338k("FreshnessColor", false);
        ubdVar.m51338k("DownscrollDuration", false);
        ubdVar.m51338k("FlatDisplayDuration", false);
        descriptor = ubdVar;
    }

    private ColorSequence$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        m37 m37Var = m37.f34693a;
        return new dc9[]{FreshnessColor$$serializer.INSTANCE, m37Var, m37Var};
    }

    @Override // p001o.bn5
    public ColorSequence deserialize(w75 w75Var) {
        float fMo17217E;
        float f;
        int i;
        FreshnessColor freshnessColor;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            FreshnessColor freshnessColor2 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, null);
            float fMo17217E2 = jo3VarMo20420b.mo17217E(descriptor2, 1);
            freshnessColor = freshnessColor2;
            fMo17217E = jo3VarMo20420b.mo17217E(descriptor2, 2);
            f = fMo17217E2;
            i = 7;
        } else {
            float fMo17217E3 = 0.0f;
            boolean z = true;
            int i2 = 0;
            FreshnessColor freshnessColor3 = null;
            float fMo17217E4 = 0.0f;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    freshnessColor3 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, freshnessColor3);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    fMo17217E4 = jo3VarMo20420b.mo17217E(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (iMo16814k != 2) {
                        throw new i4i(iMo16814k);
                    }
                    fMo17217E3 = jo3VarMo20420b.mo17217E(descriptor2, 2);
                    i2 |= 4;
                }
            }
            fMo17217E = fMo17217E3;
            f = fMo17217E4;
            i = i2;
            freshnessColor = freshnessColor3;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new ColorSequence(i, freshnessColor, f, fMo17217E, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, ColorSequence colorSequence) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(colorSequence, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        ColorSequence.write$Self(colorSequence, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
