package jh;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jh.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC3766a implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f19646a;

    /* renamed from: b */
    public final int f19647b;

    /* renamed from: c */
    public final int f19648c;

    /* renamed from: d */
    public final int f19649d;

    public ViewOnTouchListenerC3766a(Dialog dialog, Rect rect) {
        this.f19646a = dialog;
        this.f19647b = rect.left;
        this.f19648c = rect.top;
        this.f19649d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f19647b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f19648c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f19649d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f19646a.onTouchEvent(motionEventObtain);
    }
}
