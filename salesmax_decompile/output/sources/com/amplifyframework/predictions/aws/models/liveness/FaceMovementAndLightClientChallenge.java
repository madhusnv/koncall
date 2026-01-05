package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.qla;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class FaceMovementAndLightClientChallenge {
    public static final Companion Companion = new Companion(null);
    private final String challengeId;
    private final ColorDisplayed colorDisplayed;
    private final InitialFace initialFace;
    private final TargetFace targetFace;
    private final Long videoEndTimestamp;
    private final Long videoStartTimestamp;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return FaceMovementAndLightClientChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceMovementAndLightClientChallenge(int i, String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, FaceMovementAndLightClientChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.challengeId = str;
        if ((i & 2) == 0) {
            this.videoStartTimestamp = null;
        } else {
            this.videoStartTimestamp = l;
        }
        if ((i & 4) == 0) {
            this.videoEndTimestamp = null;
        } else {
            this.videoEndTimestamp = l2;
        }
        if ((i & 8) == 0) {
            this.initialFace = null;
        } else {
            this.initialFace = initialFace;
        }
        if ((i & 16) == 0) {
            this.targetFace = null;
        } else {
            this.targetFace = targetFace;
        }
        if ((i & 32) == 0) {
            this.colorDisplayed = null;
        } else {
            this.colorDisplayed = colorDisplayed;
        }
    }

    public static /* synthetic */ FaceMovementAndLightClientChallenge copy$default(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceMovementAndLightClientChallenge.challengeId;
        }
        if ((i & 2) != 0) {
            l = faceMovementAndLightClientChallenge.videoStartTimestamp;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = faceMovementAndLightClientChallenge.videoEndTimestamp;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            initialFace = faceMovementAndLightClientChallenge.initialFace;
        }
        InitialFace initialFace2 = initialFace;
        if ((i & 16) != 0) {
            targetFace = faceMovementAndLightClientChallenge.targetFace;
        }
        TargetFace targetFace2 = targetFace;
        if ((i & 32) != 0) {
            colorDisplayed = faceMovementAndLightClientChallenge.colorDisplayed;
        }
        return faceMovementAndLightClientChallenge.copy(str, l3, l4, initialFace2, targetFace2, colorDisplayed);
    }

    public static /* synthetic */ void getChallengeId$annotations() {
    }

    public static /* synthetic */ void getColorDisplayed$annotations() {
    }

    public static /* synthetic */ void getInitialFace$annotations() {
    }

    public static /* synthetic */ void getTargetFace$annotations() {
    }

    public static /* synthetic */ void getVideoEndTimestamp$annotations() {
    }

    public static /* synthetic */ void getVideoStartTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37568p(uefVar, 0, faceMovementAndLightClientChallenge.challengeId);
        if (lo3Var.mo37569r(uefVar, 1) || faceMovementAndLightClientChallenge.videoStartTimestamp != null) {
            lo3Var.mo37571z(uefVar, 1, qla.f42120a, faceMovementAndLightClientChallenge.videoStartTimestamp);
        }
        if (lo3Var.mo37569r(uefVar, 2) || faceMovementAndLightClientChallenge.videoEndTimestamp != null) {
            lo3Var.mo37571z(uefVar, 2, qla.f42120a, faceMovementAndLightClientChallenge.videoEndTimestamp);
        }
        if (lo3Var.mo37569r(uefVar, 3) || faceMovementAndLightClientChallenge.initialFace != null) {
            lo3Var.mo37571z(uefVar, 3, InitialFace$$serializer.INSTANCE, faceMovementAndLightClientChallenge.initialFace);
        }
        if (lo3Var.mo37569r(uefVar, 4) || faceMovementAndLightClientChallenge.targetFace != null) {
            lo3Var.mo37571z(uefVar, 4, TargetFace$$serializer.INSTANCE, faceMovementAndLightClientChallenge.targetFace);
        }
        if (lo3Var.mo37569r(uefVar, 5) || faceMovementAndLightClientChallenge.colorDisplayed != null) {
            lo3Var.mo37571z(uefVar, 5, ColorDisplayed$$serializer.INSTANCE, faceMovementAndLightClientChallenge.colorDisplayed);
        }
    }

    public final String component1() {
        return this.challengeId;
    }

    public final Long component2() {
        return this.videoStartTimestamp;
    }

    public final Long component3() {
        return this.videoEndTimestamp;
    }

    public final InitialFace component4() {
        return this.initialFace;
    }

    public final TargetFace component5() {
        return this.targetFace;
    }

    public final ColorDisplayed component6() {
        return this.colorDisplayed;
    }

    public final FaceMovementAndLightClientChallenge copy(String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed) {
        sq8.m48649h(str, "challengeId");
        return new FaceMovementAndLightClientChallenge(str, l, l2, initialFace, targetFace, colorDisplayed);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceMovementAndLightClientChallenge)) {
            return false;
        }
        FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge = (FaceMovementAndLightClientChallenge) obj;
        return sq8.m48644c(this.challengeId, faceMovementAndLightClientChallenge.challengeId) && sq8.m48644c(this.videoStartTimestamp, faceMovementAndLightClientChallenge.videoStartTimestamp) && sq8.m48644c(this.videoEndTimestamp, faceMovementAndLightClientChallenge.videoEndTimestamp) && sq8.m48644c(this.initialFace, faceMovementAndLightClientChallenge.initialFace) && sq8.m48644c(this.targetFace, faceMovementAndLightClientChallenge.targetFace) && sq8.m48644c(this.colorDisplayed, faceMovementAndLightClientChallenge.colorDisplayed);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final ColorDisplayed getColorDisplayed() {
        return this.colorDisplayed;
    }

    public final InitialFace getInitialFace() {
        return this.initialFace;
    }

    public final TargetFace getTargetFace() {
        return this.targetFace;
    }

    public final Long getVideoEndTimestamp() {
        return this.videoEndTimestamp;
    }

    public final Long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    public int hashCode() {
        int iHashCode = this.challengeId.hashCode() * 31;
        Long l = this.videoStartTimestamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoEndTimestamp;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        InitialFace initialFace = this.initialFace;
        int iHashCode4 = (iHashCode3 + (initialFace == null ? 0 : initialFace.hashCode())) * 31;
        TargetFace targetFace = this.targetFace;
        int iHashCode5 = (iHashCode4 + (targetFace == null ? 0 : targetFace.hashCode())) * 31;
        ColorDisplayed colorDisplayed = this.colorDisplayed;
        return iHashCode5 + (colorDisplayed != null ? colorDisplayed.hashCode() : 0);
    }

    public String toString() {
        return "FaceMovementAndLightClientChallenge(challengeId=" + this.challengeId + ", videoStartTimestamp=" + this.videoStartTimestamp + ", videoEndTimestamp=" + this.videoEndTimestamp + ", initialFace=" + this.initialFace + ", targetFace=" + this.targetFace + ", colorDisplayed=" + this.colorDisplayed + ")";
    }

    public FaceMovementAndLightClientChallenge(String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed) {
        sq8.m48649h(str, "challengeId");
        this.challengeId = str;
        this.videoStartTimestamp = l;
        this.videoEndTimestamp = l2;
        this.initialFace = initialFace;
        this.targetFace = targetFace;
        this.colorDisplayed = colorDisplayed;
    }

    public /* synthetic */ FaceMovementAndLightClientChallenge(String str, Long l, Long l2, InitialFace initialFace, TargetFace targetFace, ColorDisplayed colorDisplayed, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : initialFace, (i & 16) != 0 ? null : targetFace, (i & 32) == 0 ? colorDisplayed : null);
    }
}
