package p001o;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public class rj8 implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f43712a;

    /* renamed from: b */
    public final int f43713b;

    /* renamed from: c */
    public final int f43714c;

    /* renamed from: d */
    public final int f43715d;

    public rj8(Dialog dialog, Rect rect) {
        this.f43712a = dialog;
        this.f43713b = rect.left;
        this.f43714c = rect.top;
        this.f43715d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f43713b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f43714c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f43715d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f43712a.onTouchEvent(motionEventObtain);
    }
}
