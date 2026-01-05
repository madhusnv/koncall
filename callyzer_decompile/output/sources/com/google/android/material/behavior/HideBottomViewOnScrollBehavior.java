package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bh.AbstractC0659a;
import dh.C1723a;
import o5.AbstractC5292a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC5292a {

    /* renamed from: a */
    public int f6724a = 0;

    /* renamed from: b */
    public int f6725b = 2;

    /* renamed from: c */
    public ViewPropertyAnimator f6726c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f6724a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: k */
    public final void mo4038k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 > 0) {
            if (this.f6725b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f6726c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f6725b = 1;
            this.f6726c = view.animate().translationY(this.f6724a).setInterpolator(AbstractC0659a.f4205c).setDuration(175L).setListener(new C1723a(0, this));
            return;
        }
        if (i10 >= 0 || this.f6725b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f6726c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f6725b = 2;
        this.f6726c = view.animate().translationY(0).setInterpolator(AbstractC0659a.f4206d).setDuration(225L).setListener(new C1723a(0, this));
    }

    @Override // o5.AbstractC5292a
    /* renamed from: o */
    public boolean mo4041o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
