package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class TargetFace {
    public static final Companion Companion = new Companion(null);
    private final BoundingBox boundingBox;
    private final long faceDetectedInTargetPositionEndTimestamp;
    private final long faceDetectedInTargetPositionStartTimestamp;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return TargetFace$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TargetFace(int i, BoundingBox boundingBox, long j, long j2, fff fffVar) {
        if (7 != (i & 7)) {
            tbd.m49692a(i, 7, TargetFace$$serializer.INSTANCE.getDescriptor());
        }
        this.boundingBox = boundingBox;
        this.faceDetectedInTargetPositionStartTimestamp = j;
        this.faceDetectedInTargetPositionEndTimestamp = j2;
    }

    public static /* synthetic */ TargetFace copy$default(TargetFace targetFace, BoundingBox boundingBox, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            boundingBox = targetFace.boundingBox;
        }
        if ((i & 2) != 0) {
            j = targetFace.faceDetectedInTargetPositionStartTimestamp;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = targetFace.faceDetectedInTargetPositionEndTimestamp;
        }
        return targetFace.copy(boundingBox, j3, j2);
    }

    public static /* synthetic */ void getBoundingBox$annotations() {
    }

    public static /* synthetic */ void getFaceDetectedInTargetPositionEndTimestamp$annotations() {
    }

    public static /* synthetic */ void getFaceDetectedInTargetPositionStartTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self(TargetFace targetFace, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37566l(uefVar, 0, BoundingBox$$serializer.INSTANCE, targetFace.boundingBox);
        lo3Var.mo37565k(uefVar, 1, targetFace.faceDetectedInTargetPositionStartTimestamp);
        lo3Var.mo37565k(uefVar, 2, targetFace.faceDetectedInTargetPositionEndTimestamp);
    }

    public final BoundingBox component1() {
        return this.boundingBox;
    }

    public final long component2() {
        return this.faceDetectedInTargetPositionStartTimestamp;
    }

    public final long component3() {
        return this.faceDetectedInTargetPositionEndTimestamp;
    }

    public final TargetFace copy(BoundingBox boundingBox, long j, long j2) {
        sq8.m48649h(boundingBox, "boundingBox");
        return new TargetFace(boundingBox, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetFace)) {
            return false;
        }
        TargetFace targetFace = (TargetFace) obj;
        return sq8.m48644c(this.boundingBox, targetFace.boundingBox) && this.faceDetectedInTargetPositionStartTimestamp == targetFace.faceDetectedInTargetPositionStartTimestamp && this.faceDetectedInTargetPositionEndTimestamp == targetFace.faceDetectedInTargetPositionEndTimestamp;
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final long getFaceDetectedInTargetPositionEndTimestamp() {
        return this.faceDetectedInTargetPositionEndTimestamp;
    }

    public final long getFaceDetectedInTargetPositionStartTimestamp() {
        return this.faceDetectedInTargetPositionStartTimestamp;
    }

    public int hashCode() {
        return (((this.boundingBox.hashCode() * 31) + Long.hashCode(this.faceDetectedInTargetPositionStartTimestamp)) * 31) + Long.hashCode(this.faceDetectedInTargetPositionEndTimestamp);
    }

    public String toString() {
        return "TargetFace(boundingBox=" + this.boundingBox + ", faceDetectedInTargetPositionStartTimestamp=" + this.faceDetectedInTargetPositionStartTimestamp + ", faceDetectedInTargetPositionEndTimestamp=" + this.faceDetectedInTargetPositionEndTimestamp + ")";
    }

    public TargetFace(BoundingBox boundingBox, long j, long j2) {
        sq8.m48649h(boundingBox, "boundingBox");
        this.boundingBox = boundingBox;
        this.faceDetectedInTargetPositionStartTimestamp = j;
        this.faceDetectedInTargetPositionEndTimestamp = j2;
    }
}
