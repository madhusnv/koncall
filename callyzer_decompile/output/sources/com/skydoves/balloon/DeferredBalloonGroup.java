package com.skydoves.balloon;

import com.skydoves.balloon.annotations.InternalBalloonApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalBalloonApi
/* loaded from: classes.dex */
public final class DeferredBalloonGroup {
    private final List<DeferredBalloon> balloons;
    private final boolean dismissSequentially;

    public DeferredBalloonGroup(List<DeferredBalloon> balloons, boolean z6) {
        AbstractC4154l.m8923f(balloons, "balloons");
        this.balloons = balloons;
        this.dismissSequentially = z6;
    }

    public final List<DeferredBalloon> getBalloons() {
        return this.balloons;
    }

    public final boolean getDismissSequentially() {
        return this.dismissSequentially;
    }
}
