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
public final class BoundingBox {
    public static final Companion Companion = new Companion(null);
    private final float height;
    private final float left;
    private final float top;
    private final float width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return BoundingBox$$serializer.INSTANCE;
        }
    }

    public BoundingBox(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
    }

    public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = boundingBox.width;
        }
        if ((i & 2) != 0) {
            f2 = boundingBox.height;
        }
        if ((i & 4) != 0) {
            f3 = boundingBox.left;
        }
        if ((i & 8) != 0) {
            f4 = boundingBox.top;
        }
        return boundingBox.copy(f, f2, f3, f4);
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static final /* synthetic */ void write$Self(BoundingBox boundingBox, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37558C(uefVar, 0, boundingBox.width);
        lo3Var.mo37558C(uefVar, 1, boundingBox.height);
        lo3Var.mo37558C(uefVar, 2, boundingBox.left);
        lo3Var.mo37558C(uefVar, 3, boundingBox.top);
    }

    public final float component1() {
        return this.width;
    }

    public final float component2() {
        return this.height;
    }

    public final float component3() {
        return this.left;
    }

    public final float component4() {
        return this.top;
    }

    public final BoundingBox copy(float f, float f2, float f3, float f4) {
        return new BoundingBox(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return Float.compare(this.width, boundingBox.width) == 0 && Float.compare(this.height, boundingBox.height) == 0 && Float.compare(this.left, boundingBox.left) == 0 && Float.compare(this.top, boundingBox.top) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.width) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.left)) * 31) + Float.hashCode(this.top);
    }

    public String toString() {
        return "BoundingBox(width=" + this.width + ", height=" + this.height + ", left=" + this.left + ", top=" + this.top + ")";
    }

    public /* synthetic */ BoundingBox(int i, float f, float f2, float f3, float f4, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, BoundingBox$$serializer.INSTANCE.getDescriptor());
        }
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
    }
}
