package com.skydoves.balloon;

import android.view.View;
import com.skydoves.balloon.annotations.InternalBalloonApi;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalBalloonApi
/* loaded from: classes.dex */
public final class BalloonPlacement {
    private final BalloonAlign align;
    private final View anchor;
    private final int height;
    private final List<View> subAnchors;
    private final PlacementType type;
    private final int width;
    private final int xOff;
    private final int yOff;

    /* JADX WARN: Multi-variable type inference failed */
    public BalloonPlacement(View anchor, List<? extends View> subAnchors, BalloonAlign align, int i10, int i11, PlacementType type, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        AbstractC4154l.m8923f(subAnchors, "subAnchors");
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(type, "type");
        this.anchor = anchor;
        this.subAnchors = subAnchors;
        this.align = align;
        this.xOff = i10;
        this.yOff = i11;
        this.type = type;
        this.width = i12;
        this.height = i13;
    }

    public static /* synthetic */ BalloonPlacement copy$default(BalloonPlacement balloonPlacement, View view, List list, BalloonAlign balloonAlign, int i10, int i11, PlacementType placementType, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            view = balloonPlacement.anchor;
        }
        if ((i14 & 2) != 0) {
            list = balloonPlacement.subAnchors;
        }
        if ((i14 & 4) != 0) {
            balloonAlign = balloonPlacement.align;
        }
        if ((i14 & 8) != 0) {
            i10 = balloonPlacement.xOff;
        }
        if ((i14 & 16) != 0) {
            i11 = balloonPlacement.yOff;
        }
        if ((i14 & 32) != 0) {
            placementType = balloonPlacement.type;
        }
        if ((i14 & 64) != 0) {
            i12 = balloonPlacement.width;
        }
        if ((i14 & 128) != 0) {
            i13 = balloonPlacement.height;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i11;
        PlacementType placementType2 = placementType;
        return balloonPlacement.copy(view, list, balloonAlign, i10, i17, placementType2, i15, i16);
    }

    public final View component1() {
        return this.anchor;
    }

    public final List<View> component2() {
        return this.subAnchors;
    }

    public final BalloonAlign component3() {
        return this.align;
    }

    public final int component4() {
        return this.xOff;
    }

    public final int component5() {
        return this.yOff;
    }

    public final PlacementType component6() {
        return this.type;
    }

    public final int component7() {
        return this.width;
    }

    public final int component8() {
        return this.height;
    }

    public final BalloonPlacement copy(View anchor, List<? extends View> subAnchors, BalloonAlign align, int i10, int i11, PlacementType type, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        AbstractC4154l.m8923f(subAnchors, "subAnchors");
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(type, "type");
        return new BalloonPlacement(anchor, subAnchors, align, i10, i11, type, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalloonPlacement)) {
            return false;
        }
        BalloonPlacement balloonPlacement = (BalloonPlacement) obj;
        return AbstractC4154l.m8918a(this.anchor, balloonPlacement.anchor) && AbstractC4154l.m8918a(this.subAnchors, balloonPlacement.subAnchors) && this.align == balloonPlacement.align && this.xOff == balloonPlacement.xOff && this.yOff == balloonPlacement.yOff && this.type == balloonPlacement.type && this.width == balloonPlacement.width && this.height == balloonPlacement.height;
    }

    public final BalloonAlign getAlign() {
        return this.align;
    }

    public final View getAnchor() {
        return this.anchor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List<View> getSubAnchors() {
        return this.subAnchors;
    }

    public final PlacementType getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getXOff() {
        return this.xOff;
    }

    public final int getYOff() {
        return this.yOff;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + AbstractC1452a.m4556c(this.width, (this.type.hashCode() + AbstractC1452a.m4556c(this.yOff, AbstractC1452a.m4556c(this.xOff, (this.align.hashCode() + AbstractC1452a.m4559f(this.subAnchors, this.anchor.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31);
    }

    public String toString() {
        return "BalloonPlacement(anchor=" + this.anchor + ", subAnchors=" + this.subAnchors + ", align=" + this.align + ", xOff=" + this.xOff + ", yOff=" + this.yOff + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public /* synthetic */ BalloonPlacement(View view, List list, BalloonAlign balloonAlign, int i10, int i11, PlacementType placementType, int i12, int i13, int i14, AbstractC4148f abstractC4148f) {
        this(view, (i14 & 2) != 0 ? C6668r.f31943a : list, (i14 & 4) != 0 ? BalloonAlign.TOP : balloonAlign, (i14 & 8) != 0 ? 0 : i10, (i14 & 16) != 0 ? 0 : i11, (i14 & 32) != 0 ? PlacementType.ALIGNMENT : placementType, (i14 & 64) != 0 ? 0 : i12, (i14 & 128) != 0 ? 0 : i13);
    }
}
