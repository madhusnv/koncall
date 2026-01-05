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
public final class OvalParameters {
    public static final Companion Companion = new Companion(null);
    private final float centerX;
    private final float centerY;
    private final float height;
    private final float width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return OvalParameters$$serializer.INSTANCE;
        }
    }

    public OvalParameters(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.centerX = f3;
        this.centerY = f4;
    }

    public static /* synthetic */ OvalParameters copy$default(OvalParameters ovalParameters, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ovalParameters.width;
        }
        if ((i & 2) != 0) {
            f2 = ovalParameters.height;
        }
        if ((i & 4) != 0) {
            f3 = ovalParameters.centerX;
        }
        if ((i & 8) != 0) {
            f4 = ovalParameters.centerY;
        }
        return ovalParameters.copy(f, f2, f3, f4);
    }

    public static /* synthetic */ void getCenterX$annotations() {
    }

    public static /* synthetic */ void getCenterY$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static final /* synthetic */ void write$Self(OvalParameters ovalParameters, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37558C(uefVar, 0, ovalParameters.width);
        lo3Var.mo37558C(uefVar, 1, ovalParameters.height);
        lo3Var.mo37558C(uefVar, 2, ovalParameters.centerX);
        lo3Var.mo37558C(uefVar, 3, ovalParameters.centerY);
    }

    public final float component1() {
        return this.width;
    }

    public final float component2() {
        return this.height;
    }

    public final float component3() {
        return this.centerX;
    }

    public final float component4() {
        return this.centerY;
    }

    public final OvalParameters copy(float f, float f2, float f3, float f4) {
        return new OvalParameters(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OvalParameters)) {
            return false;
        }
        OvalParameters ovalParameters = (OvalParameters) obj;
        return Float.compare(this.width, ovalParameters.width) == 0 && Float.compare(this.height, ovalParameters.height) == 0 && Float.compare(this.centerX, ovalParameters.centerX) == 0 && Float.compare(this.centerY, ovalParameters.centerY) == 0;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.width) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.centerX)) * 31) + Float.hashCode(this.centerY);
    }

    public String toString() {
        return "OvalParameters(width=" + this.width + ", height=" + this.height + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ")";
    }

    public /* synthetic */ OvalParameters(int i, float f, float f2, float f3, float f4, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, OvalParameters$$serializer.INSTANCE.getDescriptor());
        }
        this.width = f;
        this.height = f2;
        this.centerX = f3;
        this.centerY = f4;
    }
}
