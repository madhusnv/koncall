package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import p001o.pza;

/* loaded from: classes3.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: d */
    public Runnable f12010d;

    /* renamed from: e */
    public OverScroller f12011e;

    /* renamed from: f */
    public boolean f12012f;

    /* renamed from: g */
    public int f12013g;

    /* renamed from: h */
    public int f12014h;

    /* renamed from: q */
    public int f12015q;

    /* renamed from: s */
    public VelocityTracker f12016s;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class RunnableC10934a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f12017a;

        /* renamed from: b */
        public final View f12018b;

        public RunnableC10934a(CoordinatorLayout coordinatorLayout, View view) {
            this.f12017a = coordinatorLayout;
            this.f12018b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f12018b == null || (overScroller = HeaderBehavior.this.f12011e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.mo13863R(this.f12017a, this.f12018b);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.m13917T(this.f12017a, this.f12018b, headerBehavior.f12011e.getCurrY());
            this.f12018b.postOnAnimation(this);
        }
    }

    public HeaderBehavior() {
        this.f12013g = -1;
        this.f12015q = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f12016s;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f12016s.computeCurrentVelocity(1000);
                m13915N(coordinatorLayout, view, -mo13861P(view), 0, this.f12016s.getYVelocity(this.f12013g));
                z = true;
            }
            this.f12012f = false;
            this.f12013g = -1;
            velocityTracker = this.f12016s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12016s = null;
            }
            velocityTracker2 = this.f12016s;
            if (velocityTracker2 != null) {
            }
            if (this.f12012f) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f12013g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int i = this.f12014h - y;
            this.f12014h = y;
            m13916S(coordinatorLayout, view, i, mo13860O(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f12013g = motionEvent.getPointerId(i2);
                this.f12014h = (int) (motionEvent.getY(i2) + 0.5f);
            }
        }
        z = false;
        velocityTracker2 = this.f12016s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f12012f || z;
        z = false;
        this.f12012f = false;
        this.f12013g = -1;
        velocityTracker = this.f12016s;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f12016s;
        if (velocityTracker2 != null) {
        }
        if (this.f12012f) {
        }
    }

    /* renamed from: L */
    public boolean mo13859L(View view) {
        return false;
    }

    /* renamed from: M */
    public final void m13914M() {
        if (this.f12016s == null) {
            this.f12016s = VelocityTracker.obtain();
        }
    }

    /* renamed from: N */
    public final boolean m13915N(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        Runnable runnable = this.f12010d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f12010d = null;
        }
        if (this.f12011e == null) {
            this.f12011e = new OverScroller(view.getContext());
        }
        this.f12011e.fling(0, mo13870I(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f12011e.computeScrollOffset()) {
            mo13863R(coordinatorLayout, view);
            return false;
        }
        RunnableC10934a runnableC10934a = new RunnableC10934a(coordinatorLayout, view);
        this.f12010d = runnableC10934a;
        view.postOnAnimation(runnableC10934a);
        return true;
    }

    /* renamed from: O */
    public int mo13860O(View view) {
        return -view.getHeight();
    }

    /* renamed from: P */
    public int mo13861P(View view) {
        return view.getHeight();
    }

    /* renamed from: Q */
    public int mo13862Q() {
        return mo13870I();
    }

    /* renamed from: R */
    public void mo13863R(CoordinatorLayout coordinatorLayout, View view) {
    }

    /* renamed from: S */
    public final int m13916S(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo13864U(coordinatorLayout, view, mo13862Q() - i, i2, i3);
    }

    /* renamed from: T */
    public int m13917T(CoordinatorLayout coordinatorLayout, View view, int i) {
        return mo13864U(coordinatorLayout, view, i, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: U */
    public int mo13864U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int iM44556b;
        int iMo13870I = mo13870I();
        if (i2 == 0 || iMo13870I < i2 || iMo13870I > i3 || iMo13870I == (iM44556b = pza.m44556b(i, i2, i3))) {
            return 0;
        }
        mo13871K(iM44556b);
        return iMo13870I - iM44556b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: o */
    public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f12015q < 0) {
            this.f12015q = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f12012f) {
            int i = this.f12013g;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f12014h) > this.f12015q) {
                this.f12014h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f12013g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo13859L(view) && coordinatorLayout.m5730F(view, x, y2);
            this.f12012f = z;
            if (z) {
                this.f12014h = y2;
                this.f12013g = motionEvent.getPointerId(0);
                m13914M();
                OverScroller overScroller = this.f12011e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f12011e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f12016s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12013g = -1;
        this.f12015q = -1;
    }
}
