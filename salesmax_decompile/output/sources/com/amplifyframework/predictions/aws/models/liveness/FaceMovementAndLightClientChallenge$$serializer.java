package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.fff;
import p001o.h76;
import p001o.i4i;
import p001o.jo3;
import p001o.lo3;
import p001o.p8g;
import p001o.qla;
import p001o.sm1;
import p001o.sq8;
import p001o.ubd;
import p001o.uef;
import p001o.w75;
import p001o.yn7;

/* loaded from: classes5.dex */
public final class FaceMovementAndLightClientChallenge$$serializer implements yn7 {
    public static final FaceMovementAndLightClientChallenge$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        FaceMovementAndLightClientChallenge$$serializer faceMovementAndLightClientChallenge$$serializer = new FaceMovementAndLightClientChallenge$$serializer();
        INSTANCE = faceMovementAndLightClientChallenge$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightClientChallenge", faceMovementAndLightClientChallenge$$serializer, 6);
        ubdVar.m51338k("ChallengeId", false);
        ubdVar.m51338k("VideoStartTimestamp", true);
        ubdVar.m51338k("VideoEndTimestamp", true);
        ubdVar.m51338k("InitialFace", true);
        ubdVar.m51338k("TargetFace", true);
        ubdVar.m51338k("ColorDisplayed", true);
        descriptor = ubdVar;
    }

    private FaceMovementAndLightClientChallenge$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        qla qlaVar = qla.f42120a;
        return new dc9[]{p8g.f39602a, sm1.m48521p(qlaVar), sm1.m48521p(qlaVar), sm1.m48521p(InitialFace$$serializer.INSTANCE), sm1.m48521p(TargetFace$$serializer.INSTANCE), sm1.m48521p(ColorDisplayed$$serializer.INSTANCE)};
    }

    @Override // p001o.bn5
    public FaceMovementAndLightClientChallenge deserialize(w75 w75Var) {
        TargetFace targetFace;
        ColorDisplayed colorDisplayed;
        Long l;
        InitialFace initialFace;
        String str;
        Long l2;
        int i;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        String strMo17247p = null;
        if (jo3VarMo20420b.mo17245n()) {
            String strMo17247p2 = jo3VarMo20420b.mo17247p(descriptor2, 0);
            qla qlaVar = qla.f42120a;
            Long l3 = (Long) jo3VarMo20420b.mo17244m(descriptor2, 1, qlaVar, null);
            Long l4 = (Long) jo3VarMo20420b.mo17244m(descriptor2, 2, qlaVar, null);
            InitialFace initialFace2 = (InitialFace) jo3VarMo20420b.mo17244m(descriptor2, 3, InitialFace$$serializer.INSTANCE, null);
            TargetFace targetFace2 = (TargetFace) jo3VarMo20420b.mo17244m(descriptor2, 4, TargetFace$$serializer.INSTANCE, null);
            str = strMo17247p2;
            colorDisplayed = (ColorDisplayed) jo3VarMo20420b.mo17244m(descriptor2, 5, ColorDisplayed$$serializer.INSTANCE, null);
            initialFace = initialFace2;
            targetFace = targetFace2;
            l = l4;
            l2 = l3;
            i = 63;
        } else {
            boolean z = true;
            int i2 = 0;
            Long l5 = null;
            Long l6 = null;
            InitialFace initialFace3 = null;
            TargetFace targetFace3 = null;
            ColorDisplayed colorDisplayed2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                switch (iMo16814k) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strMo17247p = jo3VarMo20420b.mo17247p(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        l5 = (Long) jo3VarMo20420b.mo17244m(descriptor2, 1, qla.f42120a, l5);
                        i2 |= 2;
                        break;
                    case 2:
                        l6 = (Long) jo3VarMo20420b.mo17244m(descriptor2, 2, qla.f42120a, l6);
                        i2 |= 4;
                        break;
                    case 3:
                        initialFace3 = (InitialFace) jo3VarMo20420b.mo17244m(descriptor2, 3, InitialFace$$serializer.INSTANCE, initialFace3);
                        i2 |= 8;
                        break;
                    case 4:
                        targetFace3 = (TargetFace) jo3VarMo20420b.mo17244m(descriptor2, 4, TargetFace$$serializer.INSTANCE, targetFace3);
                        i2 |= 16;
                        break;
                    case 5:
                        colorDisplayed2 = (ColorDisplayed) jo3VarMo20420b.mo17244m(descriptor2, 5, ColorDisplayed$$serializer.INSTANCE, colorDisplayed2);
                        i2 |= 32;
                        break;
                    default:
                        throw new i4i(iMo16814k);
                }
            }
            targetFace = targetFace3;
            colorDisplayed = colorDisplayed2;
            l = l6;
            initialFace = initialFace3;
            str = strMo17247p;
            l2 = l5;
            i = i2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new FaceMovementAndLightClientChallenge(i, str, l2, l, initialFace, targetFace, colorDisplayed, (fff) null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(faceMovementAndLightClientChallenge, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        FaceMovementAndLightClientChallenge.write$Self(faceMovementAndLightClientChallenge, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
