package com.amplifyframework.predictions.aws.models.liveness;

import java.util.List;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.ni6;
import p001o.sq8;
import p001o.tbd;
import p001o.to0;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class FaceMovementAndLightServerChallenge {
    private final ChallengeConfig challengeConfig;
    private final List<ColorSequence> colorSequences;
    private final LightChallengeType lightChallengeType;
    private final OvalParameters ovalParameters;
    public static final Companion Companion = new Companion(null);
    private static final dc9[] $childSerializers = {null, ni6.m40630b("com.amplifyframework.predictions.aws.models.liveness.LightChallengeType", LightChallengeType.values()), null, new to0(ColorSequence$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return FaceMovementAndLightServerChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceMovementAndLightServerChallenge(int i, OvalParameters ovalParameters, LightChallengeType lightChallengeType, ChallengeConfig challengeConfig, List list, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, FaceMovementAndLightServerChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.ovalParameters = ovalParameters;
        this.lightChallengeType = lightChallengeType;
        this.challengeConfig = challengeConfig;
        this.colorSequences = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceMovementAndLightServerChallenge copy$default(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, OvalParameters ovalParameters, LightChallengeType lightChallengeType, ChallengeConfig challengeConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            ovalParameters = faceMovementAndLightServerChallenge.ovalParameters;
        }
        if ((i & 2) != 0) {
            lightChallengeType = faceMovementAndLightServerChallenge.lightChallengeType;
        }
        if ((i & 4) != 0) {
            challengeConfig = faceMovementAndLightServerChallenge.challengeConfig;
        }
        if ((i & 8) != 0) {
            list = faceMovementAndLightServerChallenge.colorSequences;
        }
        return faceMovementAndLightServerChallenge.copy(ovalParameters, lightChallengeType, challengeConfig, list);
    }

    public static /* synthetic */ void getChallengeConfig$annotations() {
    }

    public static /* synthetic */ void getColorSequences$annotations() {
    }

    public static /* synthetic */ void getLightChallengeType$annotations() {
    }

    public static /* synthetic */ void getOvalParameters$annotations() {
    }

    public static final /* synthetic */ void write$Self(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, lo3 lo3Var, uef uefVar) {
        dc9[] dc9VarArr = $childSerializers;
        lo3Var.mo37566l(uefVar, 0, OvalParameters$$serializer.INSTANCE, faceMovementAndLightServerChallenge.ovalParameters);
        lo3Var.mo37566l(uefVar, 1, dc9VarArr[1], faceMovementAndLightServerChallenge.lightChallengeType);
        lo3Var.mo37566l(uefVar, 2, ChallengeConfig$$serializer.INSTANCE, faceMovementAndLightServerChallenge.challengeConfig);
        lo3Var.mo37566l(uefVar, 3, dc9VarArr[3], faceMovementAndLightServerChallenge.colorSequences);
    }

    public final OvalParameters component1() {
        return this.ovalParameters;
    }

    public final LightChallengeType component2() {
        return this.lightChallengeType;
    }

    public final ChallengeConfig component3() {
        return this.challengeConfig;
    }

    public final List<ColorSequence> component4() {
        return this.colorSequences;
    }

    public final FaceMovementAndLightServerChallenge copy(OvalParameters ovalParameters, LightChallengeType lightChallengeType, ChallengeConfig challengeConfig, List<ColorSequence> list) {
        sq8.m48649h(ovalParameters, "ovalParameters");
        sq8.m48649h(lightChallengeType, "lightChallengeType");
        sq8.m48649h(challengeConfig, "challengeConfig");
        sq8.m48649h(list, "colorSequences");
        return new FaceMovementAndLightServerChallenge(ovalParameters, lightChallengeType, challengeConfig, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceMovementAndLightServerChallenge)) {
            return false;
        }
        FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge = (FaceMovementAndLightServerChallenge) obj;
        return sq8.m48644c(this.ovalParameters, faceMovementAndLightServerChallenge.ovalParameters) && this.lightChallengeType == faceMovementAndLightServerChallenge.lightChallengeType && sq8.m48644c(this.challengeConfig, faceMovementAndLightServerChallenge.challengeConfig) && sq8.m48644c(this.colorSequences, faceMovementAndLightServerChallenge.colorSequences);
    }

    public final ChallengeConfig getChallengeConfig() {
        return this.challengeConfig;
    }

    public final List<ColorSequence> getColorSequences() {
        return this.colorSequences;
    }

    public final LightChallengeType getLightChallengeType() {
        return this.lightChallengeType;
    }

    public final OvalParameters getOvalParameters() {
        return this.ovalParameters;
    }

    public int hashCode() {
        return (((((this.ovalParameters.hashCode() * 31) + this.lightChallengeType.hashCode()) * 31) + this.challengeConfig.hashCode()) * 31) + this.colorSequences.hashCode();
    }

    public String toString() {
        return "FaceMovementAndLightServerChallenge(ovalParameters=" + this.ovalParameters + ", lightChallengeType=" + this.lightChallengeType + ", challengeConfig=" + this.challengeConfig + ", colorSequences=" + this.colorSequences + ")";
    }

    public FaceMovementAndLightServerChallenge(OvalParameters ovalParameters, LightChallengeType lightChallengeType, ChallengeConfig challengeConfig, List<ColorSequence> list) {
        sq8.m48649h(ovalParameters, "ovalParameters");
        sq8.m48649h(lightChallengeType, "lightChallengeType");
        sq8.m48649h(challengeConfig, "challengeConfig");
        sq8.m48649h(list, "colorSequences");
        this.ovalParameters = ovalParameters;
        this.lightChallengeType = lightChallengeType;
        this.challengeConfig = challengeConfig;
        this.colorSequences = list;
    }
}
