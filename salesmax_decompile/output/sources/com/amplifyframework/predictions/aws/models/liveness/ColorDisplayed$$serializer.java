package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.ll8;
import p001o.lo3;
import p001o.qla;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class ColorDisplayed$$serializer implements yn7 {
    public static final ColorDisplayed$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        ColorDisplayed$$serializer colorDisplayed$$serializer = new ColorDisplayed$$serializer();
        INSTANCE = colorDisplayed$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed", colorDisplayed$$serializer, 4);
        ubdVar.m51338k("CurrentColor", false);
        ubdVar.m51338k("PreviousColor", false);
        ubdVar.m51338k("SequenceNumber", false);
        ubdVar.m51338k("CurrentColorStartTimestamp", false);
        descriptor = ubdVar;
    }

    private ColorDisplayed$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
        return new dc9[]{freshnessColor$$serializer, freshnessColor$$serializer, ll8.f34006a, qla.f42120a};
    }

    @Override // p001o.bn5
    public ColorDisplayed deserialize(w75 w75Var) {
        int i;
        int iMo17218F;
        FreshnessColor freshnessColor;
        FreshnessColor freshnessColor2;
        long jMo17220H;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        if (jo3VarMo20420b.mo17245n()) {
            FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
            FreshnessColor freshnessColor3 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 0, freshnessColor$$serializer, null);
            freshnessColor2 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 1, freshnessColor$$serializer, null);
            i = 15;
            iMo17218F = jo3VarMo20420b.mo17218F(descriptor2, 2);
            freshnessColor = freshnessColor3;
            jMo17220H = jo3VarMo20420b.mo17220H(descriptor2, 3);
        } else {
            boolean z = true;
            int i2 = 0;
            long jMo17220H2 = 0;
            FreshnessColor freshnessColor4 = null;
            FreshnessColor freshnessColor5 = null;
            int iMo17218F2 = 0;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    freshnessColor4 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 0, FreshnessColor$$serializer.INSTANCE, freshnessColor4);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    freshnessColor5 = (FreshnessColor) jo3VarMo20420b.mo17252u(descriptor2, 1, FreshnessColor$$serializer.INSTANCE, freshnessColor5);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    iMo17218F2 = jo3VarMo20420b.mo17218F(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iMo16814k != 3) {
                        throw new i4i(iMo16814k);
                    }
                    jMo17220H2 = jo3VarMo20420b.mo17220H(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            iMo17218F = iMo17218F2;
            freshnessColor = freshnessColor4;
            freshnessColor2 = freshnessColor5;
            jMo17220H = jMo17220H2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new ColorDisplayed(i, freshnessColor, freshnessColor2, iMo17218F, jMo17220H, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, ColorDisplayed colorDisplayed) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(colorDisplayed, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        ColorDisplayed.write$Self(colorDisplayed, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
