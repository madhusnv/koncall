package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1365b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f7008a;

    public ViewTreeObserverOnPreDrawListenerC1365b(ClockFaceView clockFaceView) {
        this.f7008a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f7008a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6990v.f6996b) - clockFaceView.f6983D;
        if (height != clockFaceView.f7012s) {
            clockFaceView.f7012s = height;
            clockFaceView.m4146e();
            ClockHandView clockHandView = clockFaceView.f6990v;
            clockHandView.f7004k = clockFaceView.f7012s;
            clockHandView.invalidate();
        }
        return true;
    }
}
