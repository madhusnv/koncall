package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class FaceTargetChallenge implements FaceLivenessSessionChallenge {
    private final FaceTargetMatchingParameters faceTargetMatching;
    private final float targetCenterX;
    private final float targetCenterY;
    private final float targetHeight;
    private final float targetWidth;

    public FaceTargetChallenge(float f, float f2, float f3, float f4, FaceTargetMatchingParameters faceTargetMatchingParameters) {
        sq8.m48649h(faceTargetMatchingParameters, "faceTargetMatching");
        this.targetWidth = f;
        this.targetHeight = f2;
        this.targetCenterX = f3;
        this.targetCenterY = f4;
        this.faceTargetMatching = faceTargetMatchingParameters;
    }

    public static /* synthetic */ FaceTargetChallenge copy$default(FaceTargetChallenge faceTargetChallenge, float f, float f2, float f3, float f4, FaceTargetMatchingParameters faceTargetMatchingParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceTargetChallenge.targetWidth;
        }
        if ((i & 2) != 0) {
            f2 = faceTargetChallenge.targetHeight;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = faceTargetChallenge.targetCenterX;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            f4 = faceTargetChallenge.targetCenterY;
        }
        float f7 = f4;
        if ((i & 16) != 0) {
            faceTargetMatchingParameters = faceTargetChallenge.faceTargetMatching;
        }
        return faceTargetChallenge.copy(f, f5, f6, f7, faceTargetMatchingParameters);
    }

    public final float component1() {
        return this.targetWidth;
    }

    public final float component2() {
        return this.targetHeight;
    }

    public final float component3() {
        return this.targetCenterX;
    }

    public final float component4() {
        return this.targetCenterY;
    }

    public final FaceTargetMatchingParameters component5() {
        return this.faceTargetMatching;
    }

    public final FaceTargetChallenge copy(float f, float f2, float f3, float f4, FaceTargetMatchingParameters faceTargetMatchingParameters) {
        sq8.m48649h(faceTargetMatchingParameters, "faceTargetMatching");
        return new FaceTargetChallenge(f, f2, f3, f4, faceTargetMatchingParameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceTargetChallenge)) {
            return false;
        }
        FaceTargetChallenge faceTargetChallenge = (FaceTargetChallenge) obj;
        return Float.compare(this.targetWidth, faceTargetChallenge.targetWidth) == 0 && Float.compare(this.targetHeight, faceTargetChallenge.targetHeight) == 0 && Float.compare(this.targetCenterX, faceTargetChallenge.targetCenterX) == 0 && Float.compare(this.targetCenterY, faceTargetChallenge.targetCenterY) == 0 && sq8.m48644c(this.faceTargetMatching, faceTargetChallenge.faceTargetMatching);
    }

    public final FaceTargetMatchingParameters getFaceTargetMatching() {
        return this.faceTargetMatching;
    }

    public final float getTargetCenterX() {
        return this.targetCenterX;
    }

    public final float getTargetCenterY() {
        return this.targetCenterY;
    }

    public final float getTargetHeight() {
        return this.targetHeight;
    }

    public final float getTargetWidth() {
        return this.targetWidth;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.targetWidth) * 31) + Float.hashCode(this.targetHeight)) * 31) + Float.hashCode(this.targetCenterX)) * 31) + Float.hashCode(this.targetCenterY)) * 31) + this.faceTargetMatching.hashCode();
    }

    public String toString() {
        return "FaceTargetChallenge(targetWidth=" + this.targetWidth + ", targetHeight=" + this.targetHeight + ", targetCenterX=" + this.targetCenterX + ", targetCenterY=" + this.targetCenterY + ", faceTargetMatching=" + this.faceTargetMatching + ")";
    }
}
