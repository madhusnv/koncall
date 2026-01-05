package com.skydoves.balloon.overlay;

import kotlin.jvm.internal.AbstractC4148f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonOverlayCircle extends BalloonOverlayShape {
    private final Float radius;
    private final Integer radiusRes;

    public /* synthetic */ BalloonOverlayCircle(Float f6, Integer num, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : f6, (i10 & 2) != 0 ? null : num);
    }

    public final Float getRadius() {
        return this.radius;
    }

    public final Integer getRadiusRes() {
        return this.radiusRes;
    }

    private BalloonOverlayCircle(Float f6, Integer num) {
        super(null);
        this.radius = f6;
        this.radiusRes = num;
    }

    public BalloonOverlayCircle(float f6) {
        this(Float.valueOf(f6), null);
    }

    public BalloonOverlayCircle(int i10) {
        this(null, Integer.valueOf(i10));
    }
}
