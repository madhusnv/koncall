package com.skydoves.balloon.overlay;

import kotlin.jvm.internal.AbstractC4148f;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonOverlayRoundRect extends BalloonOverlayShape {
    private final C6361k radiusPair;
    private final C6361k radiusResPair;

    public /* synthetic */ BalloonOverlayRoundRect(C6361k c6361k, C6361k c6361k2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : c6361k, (i10 & 2) != 0 ? null : c6361k2);
    }

    public final C6361k getRadiusPair() {
        return this.radiusPair;
    }

    public final C6361k getRadiusResPair() {
        return this.radiusResPair;
    }

    private BalloonOverlayRoundRect(C6361k c6361k, C6361k c6361k2) {
        super(null);
        this.radiusPair = c6361k;
        this.radiusResPair = c6361k2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalloonOverlayRoundRect(float f6, float f10) {
        this(new C6361k(Float.valueOf(f6), Float.valueOf(f10)), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalloonOverlayRoundRect(int i10, int i11) {
        this(null, new C6361k(Integer.valueOf(i10), Integer.valueOf(i11)), 1, 0 == true ? 1 : 0);
    }
}
