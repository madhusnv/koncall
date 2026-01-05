package com.skydoves.balloon.internals;

import com.skydoves.balloon.annotations.InternalBalloonApi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DefinitionKt {
    public static final int LTR = 1;
    public static final float NO_Float_VALUE = 0.0f;
    public static final int NO_INT_VALUE = Integer.MIN_VALUE;
    public static final long NO_LONG_VALUE = -1;
    public static final int SIZE_ARROW_BOUNDARY = 1;

    public static final /* synthetic */ Integer takeIfNotNoIntValue(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }

    public static final /* synthetic */ int unaryMinus(int i10, boolean z6) {
        return z6 ? -i10 : i10;
    }

    @InternalBalloonApi
    public static /* synthetic */ void getNO_Float_VALUE$annotations() {
    }
}
