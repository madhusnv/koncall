package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.ll8;
import p001o.lo3;
import p001o.m37;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class ChallengeConfig$$serializer implements yn7 {
    public static final ChallengeConfig$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        ChallengeConfig$$serializer challengeConfig$$serializer = new ChallengeConfig$$serializer();
        INSTANCE = challengeConfig$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.ChallengeConfig", challengeConfig$$serializer, 11);
        ubdVar.m51338k("BlazeFaceDetectionThreshold", false);
        ubdVar.m51338k("FaceDistanceThresholdMin", false);
        ubdVar.m51338k("FaceDistanceThreshold", false);
        ubdVar.m51338k("FaceDistanceThresholdMax", false);
        ubdVar.m51338k("OvalIouThreshold", false);
        ubdVar.m51338k("OvalHeightWidthRatio", false);
        ubdVar.m51338k("OvalIouWidthThreshold", false);
        ubdVar.m51338k("OvalIouHeightThreshold", false);
        ubdVar.m51338k("FaceIouWidthThreshold", false);
        ubdVar.m51338k("FaceIouHeightThreshold", false);
        ubdVar.m51338k("OvalFitTimeout", false);
        descriptor = ubdVar;
    }

    private ChallengeConfig$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        m37 m37Var = m37.f34693a;
        return new dc9[]{m37Var, m37Var, m37Var, m37Var, m37Var, m37Var, m37Var, m37Var, m37Var, m37Var, ll8.f34006a};
    }

    @Override // p001o.bn5
    public ChallengeConfig deserialize(w75 w75Var) {
        int iMo17218F;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        int i2 = 0;
        if (jo3VarMo20420b.mo17245n()) {
            float fMo17217E = jo3VarMo20420b.mo17217E(descriptor2, 0);
            float fMo17217E2 = jo3VarMo20420b.mo17217E(descriptor2, 1);
            float fMo17217E3 = jo3VarMo20420b.mo17217E(descriptor2, 2);
            float fMo17217E4 = jo3VarMo20420b.mo17217E(descriptor2, 3);
            float fMo17217E5 = jo3VarMo20420b.mo17217E(descriptor2, 4);
            float fMo17217E6 = jo3VarMo20420b.mo17217E(descriptor2, 5);
            float fMo17217E7 = jo3VarMo20420b.mo17217E(descriptor2, 6);
            float fMo17217E8 = jo3VarMo20420b.mo17217E(descriptor2, 7);
            float fMo17217E9 = jo3VarMo20420b.mo17217E(descriptor2, 8);
            float fMo17217E10 = jo3VarMo20420b.mo17217E(descriptor2, 9);
            f2 = fMo17217E;
            iMo17218F = jo3VarMo20420b.mo17218F(descriptor2, 10);
            f = fMo17217E10;
            f3 = fMo17217E8;
            f9 = fMo17217E7;
            f6 = fMo17217E6;
            f7 = fMo17217E4;
            f5 = fMo17217E9;
            f8 = fMo17217E5;
            f10 = fMo17217E3;
            f4 = fMo17217E2;
            i = 2047;
        } else {
            float fMo17217E11 = 0.0f;
            float fMo17217E12 = 0.0f;
            float fMo17217E13 = 0.0f;
            float fMo17217E14 = 0.0f;
            float fMo17217E15 = 0.0f;
            float fMo17217E16 = 0.0f;
            float fMo17217E17 = 0.0f;
            float fMo17217E18 = 0.0f;
            float fMo17217E19 = 0.0f;
            float fMo17217E20 = 0.0f;
            boolean z = true;
            int iMo17218F2 = 0;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        fMo17217E11 = jo3VarMo20420b.mo17217E(descriptor2, 0);
                        continue;
                    case 1:
                        fMo17217E20 = jo3VarMo20420b.mo17217E(descriptor2, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        fMo17217E19 = jo3VarMo20420b.mo17217E(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        fMo17217E16 = jo3VarMo20420b.mo17217E(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        fMo17217E18 = jo3VarMo20420b.mo17217E(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        fMo17217E15 = jo3VarMo20420b.mo17217E(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        fMo17217E14 = jo3VarMo20420b.mo17217E(descriptor2, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        fMo17217E13 = jo3VarMo20420b.mo17217E(descriptor2, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        fMo17217E17 = jo3VarMo20420b.mo17217E(descriptor2, 8);
                        i2 |= 256;
                        break;
                    case 9:
                        fMo17217E12 = jo3VarMo20420b.mo17217E(descriptor2, 9);
                        i2 |= 512;
                        break;
                    case 10:
                        iMo17218F2 = jo3VarMo20420b.mo17218F(descriptor2, 10);
                        i2 |= 1024;
                        break;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            iMo17218F = iMo17218F2;
            f = fMo17217E12;
            f2 = fMo17217E11;
            i = i2;
            float f11 = fMo17217E19;
            f3 = fMo17217E13;
            f4 = fMo17217E20;
            f5 = fMo17217E17;
            f6 = fMo17217E15;
            f7 = fMo17217E16;
            f8 = fMo17217E18;
            f9 = fMo17217E14;
            f10 = f11;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new ChallengeConfig(i, f2, f4, f10, f7, f8, f6, f9, f3, f5, f, iMo17218F, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, ChallengeConfig challengeConfig) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(challengeConfig, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        ChallengeConfig.write$Self(challengeConfig, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
