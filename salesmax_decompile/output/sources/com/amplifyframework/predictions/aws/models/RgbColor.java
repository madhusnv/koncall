package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class RgbColor {
    private final int blue;
    private final int green;
    private final int red;

    public RgbColor(int i, int i2, int i3) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
    }

    public static /* synthetic */ RgbColor copy$default(RgbColor rgbColor, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rgbColor.red;
        }
        if ((i4 & 2) != 0) {
            i2 = rgbColor.green;
        }
        if ((i4 & 4) != 0) {
            i3 = rgbColor.blue;
        }
        return rgbColor.copy(i, i2, i3);
    }

    public final int component1() {
        return this.red;
    }

    public final int component2() {
        return this.green;
    }

    public final int component3() {
        return this.blue;
    }

    public final RgbColor copy(int i, int i2, int i3) {
        return new RgbColor(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RgbColor)) {
            return false;
        }
        RgbColor rgbColor = (RgbColor) obj;
        return this.red == rgbColor.red && this.green == rgbColor.green && this.blue == rgbColor.blue;
    }

    public final int getBlue() {
        return this.blue;
    }

    public final int getGreen() {
        return this.green;
    }

    public final int getRed() {
        return this.red;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.red) * 31) + Integer.hashCode(this.green)) * 31) + Integer.hashCode(this.blue);
    }

    public String toString() {
        return "RgbColor(red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ")";
    }
}
