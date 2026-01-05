package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p001o.pza;
import p001o.r9j;

/* loaded from: classes3.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    public final Rect f12020d;

    /* renamed from: e */
    public final Rect f12021e;

    /* renamed from: f */
    public int f12022f;

    /* renamed from: g */
    public int f12023g;

    public HeaderScrollingViewBehavior() {
        this.f12020d = new Rect();
        this.f12021e = new Rect();
        this.f12022f = 0;
    }

    /* renamed from: R */
    public static int m13918R(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    /* renamed from: J */
    public void mo13919J(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewMo13880L = mo13880L(coordinatorLayout.m5755v(view));
        if (viewMo13880L == null) {
            super.mo13919J(coordinatorLayout, view, i);
            this.f12022f = 0;
            return;
        }
        CoordinatorLayout.C2012e c2012e = (CoordinatorLayout.C2012e) view.getLayoutParams();
        Rect rect = this.f12020d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2012e).leftMargin, viewMo13880L.getBottom() + ((ViewGroup.MarginLayoutParams) c2012e).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin, ((coordinatorLayout.getHeight() + viewMo13880L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin);
        r9j lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.m46395j();
            rect.right -= lastWindowInsets.m46396k();
        }
        Rect rect2 = this.f12021e;
        Gravity.apply(m13918R(c2012e.f7097c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM13920M = m13920M(viewMo13880L);
        view.layout(rect2.left, rect2.top - iM13920M, rect2.right, rect2.bottom - iM13920M);
        this.f12022f = rect2.top - viewMo13880L.getBottom();
    }

    /* renamed from: L */
    public abstract View mo13880L(List list);

    /* renamed from: M */
    public final int m13920M(View view) {
        if (this.f12023g == 0) {
            return 0;
        }
        float fMo13881N = mo13881N(view);
        int i = this.f12023g;
        return pza.m44556b((int) (fMo13881N * i), 0, i);
    }

    /* renamed from: N */
    public float mo13881N(View view) {
        return 1.0f;
    }

    /* renamed from: O */
    public final int m13921O() {
        return this.f12023g;
    }

    /* renamed from: P */
    public int mo13882P(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: Q */
    public final int m13922Q() {
        return this.f12022f;
    }

    /* renamed from: S */
    public final void m13923S(int i) {
        this.f12023g = i;
    }

    /* renamed from: T */
    public boolean mo13924T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: q */
    public boolean mo5780q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewMo13880L;
        r9j lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewMo13880L = mo13880L(coordinatorLayout.m5755v(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewMo13880L.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m46397l() + lastWindowInsets.m46394i();
        }
        int iMo13882P = size + mo13882P(viewMo13880L);
        int measuredHeight = viewMo13880L.getMeasuredHeight();
        if (mo13924T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo13882P -= measuredHeight;
        }
        coordinatorLayout.m5738N(view, i, i2, View.MeasureSpec.makeMeasureSpec(iMo13882P, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12020d = new Rect();
        this.f12021e = new Rect();
        this.f12022f = 0;
    }
}
