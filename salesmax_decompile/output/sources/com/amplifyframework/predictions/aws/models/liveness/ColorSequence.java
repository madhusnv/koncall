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
public final class ColorSequence {
    public static final Companion Companion = new Companion(null);
    private final float downscrollDuration;
    private final float flatDisplayDuration;
    private final FreshnessColor freshnessColor;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ColorSequence$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ColorSequence(int i, FreshnessColor freshnessColor, float f, float f2, fff fffVar) {
        if (7 != (i & 7)) {
            tbd.m49692a(i, 7, ColorSequence$$serializer.INSTANCE.getDescriptor());
        }
        this.freshnessColor = freshnessColor;
        this.downscrollDuration = f;
        this.flatDisplayDuration = f2;
    }

    public static /* synthetic */ ColorSequence copy$default(ColorSequence colorSequence, FreshnessColor freshnessColor, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            freshnessColor = colorSequence.freshnessColor;
        }
        if ((i & 2) != 0) {
            f = colorSequence.downscrollDuration;
        }
        if ((i & 4) != 0) {
            f2 = colorSequence.flatDisplayDuration;
        }
        return colorSequence.copy(freshnessColor, f, f2);
    }

    public static /* synthetic */ void getDownscrollDuration$annotations() {
    }

    public static /* synthetic */ void getFlatDisplayDuration$annotations() {
    }

    public static /* synthetic */ void getFreshnessColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(ColorSequence colorSequence, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37566l(uefVar, 0, FreshnessColor$$serializer.INSTANCE, colorSequence.freshnessColor);
        lo3Var.mo37558C(uefVar, 1, colorSequence.downscrollDuration);
        lo3Var.mo37558C(uefVar, 2, colorSequence.flatDisplayDuration);
    }

    public final FreshnessColor component1() {
        return this.freshnessColor;
    }

    public final float component2() {
        return this.downscrollDuration;
    }

    public final float component3() {
        return this.flatDisplayDuration;
    }

    public final ColorSequence copy(FreshnessColor freshnessColor, float f, float f2) {
        sq8.m48649h(freshnessColor, "freshnessColor");
        return new ColorSequence(freshnessColor, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorSequence)) {
            return false;
        }
        ColorSequence colorSequence = (ColorSequence) obj;
        return sq8.m48644c(this.freshnessColor, colorSequence.freshnessColor) && Float.compare(this.downscrollDuration, colorSequence.downscrollDuration) == 0 && Float.compare(this.flatDisplayDuration, colorSequence.flatDisplayDuration) == 0;
    }

    public final float getDownscrollDuration() {
        return this.downscrollDuration;
    }

    public final float getFlatDisplayDuration() {
        return this.flatDisplayDuration;
    }

    public final FreshnessColor getFreshnessColor() {
        return this.freshnessColor;
    }

    public int hashCode() {
        return (((this.freshnessColor.hashCode() * 31) + Float.hashCode(this.downscrollDuration)) * 31) + Float.hashCode(this.flatDisplayDuration);
    }

    public String toString() {
        return "ColorSequence(freshnessColor=" + this.freshnessColor + ", downscrollDuration=" + this.downscrollDuration + ", flatDisplayDuration=" + this.flatDisplayDuration + ")";
    }

    public ColorSequence(FreshnessColor freshnessColor, float f, float f2) {
        sq8.m48649h(freshnessColor, "freshnessColor");
        this.freshnessColor = freshnessColor;
        this.downscrollDuration = f;
        this.flatDisplayDuration = f2;
    }
}
