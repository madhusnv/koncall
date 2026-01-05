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
public final class ColorDisplayed {
    public static final Companion Companion = new Companion(null);
    private final FreshnessColor currentColor;
    private final long currentColorStartTimestamp;
    private final FreshnessColor previousColor;
    private final int sequenceNumber;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ColorDisplayed$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ColorDisplayed(int i, FreshnessColor freshnessColor, FreshnessColor freshnessColor2, int i2, long j, fff fffVar) {
        if (15 != (i & 15)) {
            tbd.m49692a(i, 15, ColorDisplayed$$serializer.INSTANCE.getDescriptor());
        }
        this.currentColor = freshnessColor;
        this.previousColor = freshnessColor2;
        this.sequenceNumber = i2;
        this.currentColorStartTimestamp = j;
    }

    public static /* synthetic */ ColorDisplayed copy$default(ColorDisplayed colorDisplayed, FreshnessColor freshnessColor, FreshnessColor freshnessColor2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            freshnessColor = colorDisplayed.currentColor;
        }
        if ((i2 & 2) != 0) {
            freshnessColor2 = colorDisplayed.previousColor;
        }
        FreshnessColor freshnessColor3 = freshnessColor2;
        if ((i2 & 4) != 0) {
            i = colorDisplayed.sequenceNumber;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = colorDisplayed.currentColorStartTimestamp;
        }
        return colorDisplayed.copy(freshnessColor, freshnessColor3, i3, j);
    }

    public static /* synthetic */ void getCurrentColor$annotations() {
    }

    public static /* synthetic */ void getCurrentColorStartTimestamp$annotations() {
    }

    public static /* synthetic */ void getPreviousColor$annotations() {
    }

    public static /* synthetic */ void getSequenceNumber$annotations() {
    }

    public static final /* synthetic */ void write$Self(ColorDisplayed colorDisplayed, lo3 lo3Var, uef uefVar) {
        FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
        lo3Var.mo37566l(uefVar, 0, freshnessColor$$serializer, colorDisplayed.currentColor);
        lo3Var.mo37566l(uefVar, 1, freshnessColor$$serializer, colorDisplayed.previousColor);
        lo3Var.mo37562f(uefVar, 2, colorDisplayed.sequenceNumber);
        lo3Var.mo37565k(uefVar, 3, colorDisplayed.currentColorStartTimestamp);
    }

    public final FreshnessColor component1() {
        return this.currentColor;
    }

    public final FreshnessColor component2() {
        return this.previousColor;
    }

    public final int component3() {
        return this.sequenceNumber;
    }

    public final long component4() {
        return this.currentColorStartTimestamp;
    }

    public final ColorDisplayed copy(FreshnessColor freshnessColor, FreshnessColor freshnessColor2, int i, long j) {
        sq8.m48649h(freshnessColor, "currentColor");
        sq8.m48649h(freshnessColor2, "previousColor");
        return new ColorDisplayed(freshnessColor, freshnessColor2, i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDisplayed)) {
            return false;
        }
        ColorDisplayed colorDisplayed = (ColorDisplayed) obj;
        return sq8.m48644c(this.currentColor, colorDisplayed.currentColor) && sq8.m48644c(this.previousColor, colorDisplayed.previousColor) && this.sequenceNumber == colorDisplayed.sequenceNumber && this.currentColorStartTimestamp == colorDisplayed.currentColorStartTimestamp;
    }

    public final FreshnessColor getCurrentColor() {
        return this.currentColor;
    }

    public final long getCurrentColorStartTimestamp() {
        return this.currentColorStartTimestamp;
    }

    public final FreshnessColor getPreviousColor() {
        return this.previousColor;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        return (((((this.currentColor.hashCode() * 31) + this.previousColor.hashCode()) * 31) + Integer.hashCode(this.sequenceNumber)) * 31) + Long.hashCode(this.currentColorStartTimestamp);
    }

    public String toString() {
        return "ColorDisplayed(currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", sequenceNumber=" + this.sequenceNumber + ", currentColorStartTimestamp=" + this.currentColorStartTimestamp + ")";
    }

    public ColorDisplayed(FreshnessColor freshnessColor, FreshnessColor freshnessColor2, int i, long j) {
        sq8.m48649h(freshnessColor, "currentColor");
        sq8.m48649h(freshnessColor2, "previousColor");
        this.currentColor = freshnessColor;
        this.previousColor = freshnessColor2;
        this.sequenceNumber = i;
        this.currentColorStartTimestamp = j;
    }
}
