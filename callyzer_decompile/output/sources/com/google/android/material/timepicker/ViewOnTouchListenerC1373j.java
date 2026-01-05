package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.j */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1373j implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f7016a;

    public ViewOnTouchListenerC1373j(GestureDetector gestureDetector) {
        this.f7016a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f7016a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
