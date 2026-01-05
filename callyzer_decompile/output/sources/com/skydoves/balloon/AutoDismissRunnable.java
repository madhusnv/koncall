package com.skydoves.balloon;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AutoDismissRunnable implements Runnable {
    private final Balloon balloon;

    public AutoDismissRunnable(Balloon balloon) {
        AbstractC4154l.m8923f(balloon, "balloon");
        this.balloon = balloon;
    }

    public final Balloon getBalloon() {
        return this.balloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.balloon.dismiss();
    }
}
