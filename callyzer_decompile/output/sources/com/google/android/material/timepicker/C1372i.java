package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.i */
/* loaded from: classes.dex */
public final class C1372i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f7015a;

    public C1372i(TimePickerView timePickerView) {
        this.f7015a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
        int i10 = TimePickerView.f7005s;
        this.f7015a.getClass();
        return zOnDoubleTap;
    }
}
