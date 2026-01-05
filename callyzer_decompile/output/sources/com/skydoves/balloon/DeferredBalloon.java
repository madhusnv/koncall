package com.skydoves.balloon;

import com.skydoves.balloon.annotations.InternalBalloonApi;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalBalloonApi
/* loaded from: classes.dex */
public final class DeferredBalloon {
    private final Balloon balloon;
    private final BalloonPlacement placement;

    public DeferredBalloon(Balloon balloon, BalloonPlacement placement) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(placement, "placement");
        this.balloon = balloon;
        this.placement = placement;
    }

    public static /* synthetic */ DeferredBalloon copy$default(DeferredBalloon deferredBalloon, Balloon balloon, BalloonPlacement balloonPlacement, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            balloon = deferredBalloon.balloon;
        }
        if ((i10 & 2) != 0) {
            balloonPlacement = deferredBalloon.placement;
        }
        return deferredBalloon.copy(balloon, balloonPlacement);
    }

    public final Balloon component1() {
        return this.balloon;
    }

    public final BalloonPlacement component2() {
        return this.placement;
    }

    public final DeferredBalloon copy(Balloon balloon, BalloonPlacement placement) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(placement, "placement");
        return new DeferredBalloon(balloon, placement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeferredBalloon)) {
            return false;
        }
        DeferredBalloon deferredBalloon = (DeferredBalloon) obj;
        return AbstractC4154l.m8918a(this.balloon, deferredBalloon.balloon) && AbstractC4154l.m8918a(this.placement, deferredBalloon.placement);
    }

    public final Balloon getBalloon() {
        return this.balloon;
    }

    public final BalloonPlacement getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return this.placement.hashCode() + (this.balloon.hashCode() * 31);
    }

    public String toString() {
        return "DeferredBalloon(balloon=" + this.balloon + ", placement=" + this.placement + ")";
    }
}
