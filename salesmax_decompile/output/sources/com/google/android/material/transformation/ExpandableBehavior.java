package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p001o.lo6;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f13252a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC11179a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f13253a;

        /* renamed from: b */
        public final /* synthetic */ int f13254b;

        /* renamed from: c */
        public final /* synthetic */ lo6 f13255c;

        public ViewTreeObserverOnPreDrawListenerC11179a(View view, int i, lo6 lo6Var) {
            this.f13253a = view;
            this.f13254b = i;
            this.f13255c = lo6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f13253a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f13252a == this.f13254b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                lo6 lo6Var = this.f13255c;
                expandableBehavior.mo15591L((View) lo6Var, this.f13253a, lo6Var.mo14635a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f13252a = 0;
    }

    /* renamed from: J */
    public final boolean m15589J(boolean z) {
        if (!z) {
            return this.f13252a == 1;
        }
        int i = this.f13252a;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public lo6 m15590K(CoordinatorLayout coordinatorLayout, View view) {
        List listM5755v = coordinatorLayout.m5755v(view);
        int size = listM5755v.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) listM5755v.get(i);
            if (mo5772i(coordinatorLayout, view, view2)) {
                return (lo6) view2;
            }
        }
        return null;
    }

    /* renamed from: L */
    public abstract boolean mo15591L(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public abstract boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo5775l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        lo6 lo6Var = (lo6) view2;
        if (!m15589J(lo6Var.mo14635a())) {
            return false;
        }
        this.f13252a = lo6Var.mo14635a() ? 1 : 2;
        return mo15591L((View) lo6Var, view, lo6Var.mo14635a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        lo6 lo6VarM15590K;
        if (view.isLaidOut() || (lo6VarM15590K = m15590K(coordinatorLayout, view)) == null || !m15589J(lo6VarM15590K.mo14635a())) {
            return false;
        }
        int i2 = lo6VarM15590K.mo14635a() ? 1 : 2;
        this.f13252a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC11179a(view, i2, lo6VarM15590K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13252a = 0;
    }
}
