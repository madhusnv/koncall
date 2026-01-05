package com.skydoves.balloon.compose;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonLayoutInfo {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    /* renamed from: x */
    private final float f7214x;

    /* renamed from: y */
    private final float f7215y;

    public BalloonLayoutInfo(float f6, float f10, int i10, int i11) {
        this.f7214x = f6;
        this.f7215y = f10;
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ BalloonLayoutInfo copy$default(BalloonLayoutInfo balloonLayoutInfo, float f6, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f6 = balloonLayoutInfo.f7214x;
        }
        if ((i12 & 2) != 0) {
            f10 = balloonLayoutInfo.f7215y;
        }
        if ((i12 & 4) != 0) {
            i10 = balloonLayoutInfo.width;
        }
        if ((i12 & 8) != 0) {
            i11 = balloonLayoutInfo.height;
        }
        return balloonLayoutInfo.copy(f6, f10, i10, i11);
    }

    public final float component1() {
        return this.f7214x;
    }

    public final float component2() {
        return this.f7215y;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final BalloonLayoutInfo copy(float f6, float f10, int i10, int i11) {
        return new BalloonLayoutInfo(f6, f10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalloonLayoutInfo)) {
            return false;
        }
        BalloonLayoutInfo balloonLayoutInfo = (BalloonLayoutInfo) obj;
        return Float.compare(this.f7214x, balloonLayoutInfo.f7214x) == 0 && Float.compare(this.f7215y, balloonLayoutInfo.f7215y) == 0 && this.width == balloonLayoutInfo.width && this.height == balloonLayoutInfo.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f7214x;
    }

    public final float getY() {
        return this.f7215y;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + AbstractC1452a.m4556c(this.width, AbstractC1452a.m4555b(this.f7215y, Float.hashCode(this.f7214x) * 31, 31), 31);
    }

    public String toString() {
        return "BalloonLayoutInfo(x=" + this.f7214x + ", y=" + this.f7215y + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
