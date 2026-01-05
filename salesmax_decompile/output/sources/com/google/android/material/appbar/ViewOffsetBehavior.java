package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p001o.qxi;

/* loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public qxi f12024a;

    /* renamed from: b */
    public int f12025b;

    /* renamed from: c */
    public int f12026c;

    public ViewOffsetBehavior() {
        this.f12025b = 0;
        this.f12026c = 0;
    }

    /* renamed from: I */
    public int mo13870I() {
        qxi qxiVar = this.f12024a;
        if (qxiVar != null) {
            return qxiVar.m45971c();
        }
        return 0;
    }

    /* renamed from: J */
    public void mo13919J(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m5737M(view, i);
    }

    /* renamed from: K */
    public boolean mo13871K(int i) {
        qxi qxiVar = this.f12024a;
        if (qxiVar != null) {
            return qxiVar.m45974f(i);
        }
        this.f12025b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo13919J(coordinatorLayout, view, i);
        if (this.f12024a == null) {
            this.f12024a = new qxi(view);
        }
        this.f12024a.m45972d();
        this.f12024a.m45969a();
        int i2 = this.f12025b;
        if (i2 != 0) {
            this.f12024a.m45974f(i2);
            this.f12025b = 0;
        }
        int i3 = this.f12026c;
        if (i3 == 0) {
            return true;
        }
        this.f12024a.m45973e(i3);
        this.f12026c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12025b = 0;
        this.f12026c = 0;
    }
}
