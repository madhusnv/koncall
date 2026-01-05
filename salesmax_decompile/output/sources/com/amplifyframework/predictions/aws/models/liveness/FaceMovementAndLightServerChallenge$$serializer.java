package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
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
public final class FaceMovementAndLightServerChallenge$$serializer implements yn7 {
    public static final FaceMovementAndLightServerChallenge$$serializer INSTANCE;
    private static final /* synthetic */ ubd descriptor;

    static {
        FaceMovementAndLightServerChallenge$$serializer faceMovementAndLightServerChallenge$$serializer = new FaceMovementAndLightServerChallenge$$serializer();
        INSTANCE = faceMovementAndLightServerChallenge$$serializer;
        ubd ubdVar = new ubd("com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge", faceMovementAndLightServerChallenge$$serializer, 4);
        ubdVar.m51338k("OvalParameters", false);
        ubdVar.m51338k("LightChallengeType", false);
        ubdVar.m51338k("ChallengeConfig", false);
        ubdVar.m51338k("ColorSequences", false);
        descriptor = ubdVar;
    }

    private FaceMovementAndLightServerChallenge$$serializer() {
    }

    @Override // p001o.yn7
    public dc9[] childSerializers() {
        dc9[] dc9VarArr = FaceMovementAndLightServerChallenge.$childSerializers;
        return new dc9[]{OvalParameters$$serializer.INSTANCE, dc9VarArr[1], ChallengeConfig$$serializer.INSTANCE, dc9VarArr[3]};
    }

    @Override // p001o.bn5
    public FaceMovementAndLightServerChallenge deserialize(w75 w75Var) {
        int i;
        OvalParameters ovalParameters;
        LightChallengeType lightChallengeType;
        ChallengeConfig challengeConfig;
        List list;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor2 = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor2);
        dc9[] dc9VarArr = FaceMovementAndLightServerChallenge.$childSerializers;
        OvalParameters ovalParameters2 = null;
        if (jo3VarMo20420b.mo17245n()) {
            OvalParameters ovalParameters3 = (OvalParameters) jo3VarMo20420b.mo17252u(descriptor2, 0, OvalParameters$$serializer.INSTANCE, null);
            LightChallengeType lightChallengeType2 = (LightChallengeType) jo3VarMo20420b.mo17252u(descriptor2, 1, dc9VarArr[1], null);
            ChallengeConfig challengeConfig2 = (ChallengeConfig) jo3VarMo20420b.mo17252u(descriptor2, 2, ChallengeConfig$$serializer.INSTANCE, null);
            list = (List) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], null);
            ovalParameters = ovalParameters3;
            challengeConfig = challengeConfig2;
            i = 15;
            lightChallengeType = lightChallengeType2;
        } else {
            boolean z = true;
            int i2 = 0;
            LightChallengeType lightChallengeType3 = null;
            ChallengeConfig challengeConfig3 = null;
            List list2 = null;
            while (z) {
                int iMo16814k = jo3VarMo20420b.mo16814k(descriptor2);
                if (iMo16814k == -1) {
                    z = false;
                } else if (iMo16814k == 0) {
                    ovalParameters2 = (OvalParameters) jo3VarMo20420b.mo17252u(descriptor2, 0, OvalParameters$$serializer.INSTANCE, ovalParameters2);
                    i2 |= 1;
                } else if (iMo16814k == 1) {
                    lightChallengeType3 = (LightChallengeType) jo3VarMo20420b.mo17252u(descriptor2, 1, dc9VarArr[1], lightChallengeType3);
                    i2 |= 2;
                } else if (iMo16814k == 2) {
                    challengeConfig3 = (ChallengeConfig) jo3VarMo20420b.mo17252u(descriptor2, 2, ChallengeConfig$$serializer.INSTANCE, challengeConfig3);
                    i2 |= 4;
                } else {
                    if (iMo16814k != 3) {
                        throw new i4i(iMo16814k);
                    }
                    list2 = (List) jo3VarMo20420b.mo17252u(descriptor2, 3, dc9VarArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            ovalParameters = ovalParameters2;
            lightChallengeType = lightChallengeType3;
            challengeConfig = challengeConfig3;
            list = list2;
        }
        jo3VarMo20420b.mo18548c(descriptor2);
        return new FaceMovementAndLightServerChallenge(i, ovalParameters, lightChallengeType, challengeConfig, list, null);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(faceMovementAndLightServerChallenge, "value");
        uef descriptor2 = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor2);
        FaceMovementAndLightServerChallenge.write$Self(faceMovementAndLightServerChallenge, lo3VarMo29876b, descriptor2);
        lo3VarMo29876b.mo37560c(descriptor2);
    }

    @Override // p001o.yn7
    public dc9[] typeParametersSerializers() {
        return yn7.C18436a.m58011a(this);
    }
}
