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
public final class InitialFace {
    public static final Companion Companion = new Companion(null);
    private final BoundingBox boundingBox;
    private final long initialFaceDetectedTimestamp;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return InitialFace$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitialFace(int i, BoundingBox boundingBox, long j, fff fffVar) {
        if (3 != (i & 3)) {
            tbd.m49692a(i, 3, InitialFace$$serializer.INSTANCE.getDescriptor());
        }
        this.boundingBox = boundingBox;
        this.initialFaceDetectedTimestamp = j;
    }

    public static /* synthetic */ InitialFace copy$default(InitialFace initialFace, BoundingBox boundingBox, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            boundingBox = initialFace.boundingBox;
        }
        if ((i & 2) != 0) {
            j = initialFace.initialFaceDetectedTimestamp;
        }
        return initialFace.copy(boundingBox, j);
    }

    public static /* synthetic */ void getBoundingBox$annotations() {
    }

    public static /* synthetic */ void getInitialFaceDetectedTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self(InitialFace initialFace, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37566l(uefVar, 0, BoundingBox$$serializer.INSTANCE, initialFace.boundingBox);
        lo3Var.mo37565k(uefVar, 1, initialFace.initialFaceDetectedTimestamp);
    }

    public final BoundingBox component1() {
        return this.boundingBox;
    }

    public final long component2() {
        return this.initialFaceDetectedTimestamp;
    }

    public final InitialFace copy(BoundingBox boundingBox, long j) {
        sq8.m48649h(boundingBox, "boundingBox");
        return new InitialFace(boundingBox, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialFace)) {
            return false;
        }
        InitialFace initialFace = (InitialFace) obj;
        return sq8.m48644c(this.boundingBox, initialFace.boundingBox) && this.initialFaceDetectedTimestamp == initialFace.initialFaceDetectedTimestamp;
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final long getInitialFaceDetectedTimestamp() {
        return this.initialFaceDetectedTimestamp;
    }

    public int hashCode() {
        return (this.boundingBox.hashCode() * 31) + Long.hashCode(this.initialFaceDetectedTimestamp);
    }

    public String toString() {
        return "InitialFace(boundingBox=" + this.boundingBox + ", initialFaceDetectedTimestamp=" + this.initialFaceDetectedTimestamp + ")";
    }

    public InitialFace(BoundingBox boundingBox, long j) {
        sq8.m48649h(boundingBox, "boundingBox");
        this.boundingBox = boundingBox;
        this.initialFaceDetectedTimestamp = j;
    }
}
