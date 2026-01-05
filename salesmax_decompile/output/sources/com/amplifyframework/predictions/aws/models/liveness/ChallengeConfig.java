package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class ChallengeConfig {
    public static final Companion Companion = new Companion(null);
    private final float blazeFaceDetectionThreshold;
    private final float faceDistanceThreshold;
    private final float faceDistanceThresholdMax;
    private final float faceDistanceThresholdMin;
    private final float faceIouHeightThreshold;
    private final float faceIouWidthThreshold;
    private final int ovalFitTimeout;
    private final float ovalHeightWidthRatio;
    private final float ovalIouHeightThreshold;
    private final float ovalIouThreshold;
    private final float ovalIouWidthThreshold;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ChallengeConfig$$serializer.INSTANCE;
        }
    }

    public ChallengeConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i) {
        this.blazeFaceDetectionThreshold = f;
        this.faceDistanceThresholdMin = f2;
        this.faceDistanceThreshold = f3;
        this.faceDistanceThresholdMax = f4;
        this.ovalIouThreshold = f5;
        this.ovalHeightWidthRatio = f6;
        this.ovalIouWidthThreshold = f7;
        this.ovalIouHeightThreshold = f8;
        this.faceIouWidthThreshold = f9;
        this.faceIouHeightThreshold = f10;
        this.ovalFitTimeout = i;
    }

    public static /* synthetic */ void getBlazeFaceDetectionThreshold$annotations() {
    }

    public static /* synthetic */ void getFaceDistanceThreshold$annotations() {
    }

    public static /* synthetic */ void getFaceDistanceThresholdMax$annotations() {
    }

    public static /* synthetic */ void getFaceDistanceThresholdMin$annotations() {
    }

    public static /* synthetic */ void getFaceIouHeightThreshold$annotations() {
    }

    public static /* synthetic */ void getFaceIouWidthThreshold$annotations() {
    }

    public static /* synthetic */ void getOvalFitTimeout$annotations() {
    }

    public static /* synthetic */ void getOvalHeightWidthRatio$annotations() {
    }

    public static /* synthetic */ void getOvalIouHeightThreshold$annotations() {
    }

    public static /* synthetic */ void getOvalIouThreshold$annotations() {
    }

    public static /* synthetic */ void getOvalIouWidthThreshold$annotations() {
    }

    public static final /* synthetic */ void write$Self(ChallengeConfig challengeConfig, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37558C(uefVar, 0, challengeConfig.blazeFaceDetectionThreshold);
        lo3Var.mo37558C(uefVar, 1, challengeConfig.faceDistanceThresholdMin);
        lo3Var.mo37558C(uefVar, 2, challengeConfig.faceDistanceThreshold);
        lo3Var.mo37558C(uefVar, 3, challengeConfig.faceDistanceThresholdMax);
        lo3Var.mo37558C(uefVar, 4, challengeConfig.ovalIouThreshold);
        lo3Var.mo37558C(uefVar, 5, challengeConfig.ovalHeightWidthRatio);
        lo3Var.mo37558C(uefVar, 6, challengeConfig.ovalIouWidthThreshold);
        lo3Var.mo37558C(uefVar, 7, challengeConfig.ovalIouHeightThreshold);
        lo3Var.mo37558C(uefVar, 8, challengeConfig.faceIouWidthThreshold);
        lo3Var.mo37558C(uefVar, 9, challengeConfig.faceIouHeightThreshold);
        lo3Var.mo37562f(uefVar, 10, challengeConfig.ovalFitTimeout);
    }

    public final float component1() {
        return this.blazeFaceDetectionThreshold;
    }

    public final float component10() {
        return this.faceIouHeightThreshold;
    }

    public final int component11() {
        return this.ovalFitTimeout;
    }

    public final float component2() {
        return this.faceDistanceThresholdMin;
    }

    public final float component3() {
        return this.faceDistanceThreshold;
    }

    public final float component4() {
        return this.faceDistanceThresholdMax;
    }

    public final float component5() {
        return this.ovalIouThreshold;
    }

    public final float component6() {
        return this.ovalHeightWidthRatio;
    }

    public final float component7() {
        return this.ovalIouWidthThreshold;
    }

    public final float component8() {
        return this.ovalIouHeightThreshold;
    }

    public final float component9() {
        return this.faceIouWidthThreshold;
    }

    public final ChallengeConfig copy(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i) {
        return new ChallengeConfig(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeConfig)) {
            return false;
        }
        ChallengeConfig challengeConfig = (ChallengeConfig) obj;
        return Float.compare(this.blazeFaceDetectionThreshold, challengeConfig.blazeFaceDetectionThreshold) == 0 && Float.compare(this.faceDistanceThresholdMin, challengeConfig.faceDistanceThresholdMin) == 0 && Float.compare(this.faceDistanceThreshold, challengeConfig.faceDistanceThreshold) == 0 && Float.compare(this.faceDistanceThresholdMax, challengeConfig.faceDistanceThresholdMax) == 0 && Float.compare(this.ovalIouThreshold, challengeConfig.ovalIouThreshold) == 0 && Float.compare(this.ovalHeightWidthRatio, challengeConfig.ovalHeightWidthRatio) == 0 && Float.compare(this.ovalIouWidthThreshold, challengeConfig.ovalIouWidthThreshold) == 0 && Float.compare(this.ovalIouHeightThreshold, challengeConfig.ovalIouHeightThreshold) == 0 && Float.compare(this.faceIouWidthThreshold, challengeConfig.faceIouWidthThreshold) == 0 && Float.compare(this.faceIouHeightThreshold, challengeConfig.faceIouHeightThreshold) == 0 && this.ovalFitTimeout == challengeConfig.ovalFitTimeout;
    }

    public final float getBlazeFaceDetectionThreshold() {
        return this.blazeFaceDetectionThreshold;
    }

    public final float getFaceDistanceThreshold() {
        return this.faceDistanceThreshold;
    }

    public final float getFaceDistanceThresholdMax() {
        return this.faceDistanceThresholdMax;
    }

    public final float getFaceDistanceThresholdMin() {
        return this.faceDistanceThresholdMin;
    }

    public final float getFaceIouHeightThreshold() {
        return this.faceIouHeightThreshold;
    }

    public final float getFaceIouWidthThreshold() {
        return this.faceIouWidthThreshold;
    }

    public final int getOvalFitTimeout() {
        return this.ovalFitTimeout;
    }

    public final float getOvalHeightWidthRatio() {
        return this.ovalHeightWidthRatio;
    }

    public final float getOvalIouHeightThreshold() {
        return this.ovalIouHeightThreshold;
    }

    public final float getOvalIouThreshold() {
        return this.ovalIouThreshold;
    }

    public final float getOvalIouWidthThreshold() {
        return this.ovalIouWidthThreshold;
    }

    public int hashCode() {
        return (((((((((((((((((((Float.hashCode(this.blazeFaceDetectionThreshold) * 31) + Float.hashCode(this.faceDistanceThresholdMin)) * 31) + Float.hashCode(this.faceDistanceThreshold)) * 31) + Float.hashCode(this.faceDistanceThresholdMax)) * 31) + Float.hashCode(this.ovalIouThreshold)) * 31) + Float.hashCode(this.ovalHeightWidthRatio)) * 31) + Float.hashCode(this.ovalIouWidthThreshold)) * 31) + Float.hashCode(this.ovalIouHeightThreshold)) * 31) + Float.hashCode(this.faceIouWidthThreshold)) * 31) + Float.hashCode(this.faceIouHeightThreshold)) * 31) + Integer.hashCode(this.ovalFitTimeout);
    }

    public String toString() {
        return "ChallengeConfig(blazeFaceDetectionThreshold=" + this.blazeFaceDetectionThreshold + ", faceDistanceThresholdMin=" + this.faceDistanceThresholdMin + ", faceDistanceThreshold=" + this.faceDistanceThreshold + ", faceDistanceThresholdMax=" + this.faceDistanceThresholdMax + ", ovalIouThreshold=" + this.ovalIouThreshold + ", ovalHeightWidthRatio=" + this.ovalHeightWidthRatio + ", ovalIouWidthThreshold=" + this.ovalIouWidthThreshold + ", ovalIouHeightThreshold=" + this.ovalIouHeightThreshold + ", faceIouWidthThreshold=" + this.faceIouWidthThreshold + ", faceIouHeightThreshold=" + this.faceIouHeightThreshold + ", ovalFitTimeout=" + this.ovalFitTimeout + ")";
    }

    public /* synthetic */ ChallengeConfig(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i2, fff fffVar) {
        if (2047 != (i & 2047)) {
            tbd.m49692a(i, 2047, ChallengeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.blazeFaceDetectionThreshold = f;
        this.faceDistanceThresholdMin = f2;
        this.faceDistanceThreshold = f3;
        this.faceDistanceThresholdMax = f4;
        this.ovalIouThreshold = f5;
        this.ovalHeightWidthRatio = f6;
        this.ovalIouWidthThreshold = f7;
        this.ovalIouHeightThreshold = f8;
        this.faceIouWidthThreshold = f9;
        this.faceIouHeightThreshold = f10;
        this.ovalFitTimeout = i2;
    }
}
