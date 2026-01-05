package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class ColorDisplayInformation {
    private final RgbColor color;
    private final float duration;
    private final boolean shouldScroll;

    public ColorDisplayInformation(RgbColor rgbColor, float f, boolean z) {
        sq8.m48649h(rgbColor, "color");
        this.color = rgbColor;
        this.duration = f;
        this.shouldScroll = z;
    }

    public static /* synthetic */ ColorDisplayInformation copy$default(ColorDisplayInformation colorDisplayInformation, RgbColor rgbColor, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rgbColor = colorDisplayInformation.color;
        }
        if ((i & 2) != 0) {
            f = colorDisplayInformation.duration;
        }
        if ((i & 4) != 0) {
            z = colorDisplayInformation.shouldScroll;
        }
        return colorDisplayInformation.copy(rgbColor, f, z);
    }

    public final RgbColor component1() {
        return this.color;
    }

    public final float component2() {
        return this.duration;
    }

    public final boolean component3() {
        return this.shouldScroll;
    }

    public final ColorDisplayInformation copy(RgbColor rgbColor, float f, boolean z) {
        sq8.m48649h(rgbColor, "color");
        return new ColorDisplayInformation(rgbColor, f, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDisplayInformation)) {
            return false;
        }
        ColorDisplayInformation colorDisplayInformation = (ColorDisplayInformation) obj;
        return sq8.m48644c(this.color, colorDisplayInformation.color) && Float.compare(this.duration, colorDisplayInformation.duration) == 0 && this.shouldScroll == colorDisplayInformation.shouldScroll;
    }

    public final RgbColor getColor() {
        return this.color;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final boolean getShouldScroll() {
        return this.shouldScroll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.color.hashCode() * 31) + Float.hashCode(this.duration)) * 31;
        boolean z = this.shouldScroll;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        return "ColorDisplayInformation(color=" + this.color + ", duration=" + this.duration + ", shouldScroll=" + this.shouldScroll + ")";
    }
}
