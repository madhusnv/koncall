package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import d6.C1613c;
import dh.C1724b;
import java.lang.reflect.Field;
import m6.C4669e;
import nf.C5047i;
import o5.AbstractC5292a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC5292a {

    /* renamed from: a */
    public C4669e f6727a;

    /* renamed from: b */
    public boolean f6728b;

    /* renamed from: c */
    public int f6729c = 2;

    /* renamed from: d */
    public float f6730d = DefinitionKt.NO_Float_VALUE;

    /* renamed from: e */
    public float f6731e = 0.5f;

    /* renamed from: f */
    public final C1724b f6732f = new C1724b(this);

    @Override // o5.AbstractC5292a
    /* renamed from: f */
    public boolean mo4035f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM745n = this.f6728b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM745n = coordinatorLayout.m745n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6728b = zM745n;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6728b = false;
        }
        if (!zM745n) {
            return false;
        }
        if (this.f6727a == null) {
            this.f6727a = new C4669e(coordinatorLayout.getContext(), coordinatorLayout, this.f6732f);
        }
        return this.f6727a.m9569o(motionEvent);
    }

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public final boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        Field field = v0.f5527a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            v0.m2525g(1048576, view);
            v0.m2523e(0, view);
            if (mo4048r(view)) {
                v0.m2526h(view, C1613c.f8050l, new C5047i(9, this));
            }
        }
        return false;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: q */
    public final boolean mo4043q(View view, MotionEvent motionEvent) {
        C4669e c4669e = this.f6727a;
        if (c4669e == null) {
            return false;
        }
        c4669e.m9563i(motionEvent);
        return true;
    }

    /* renamed from: r */
    public boolean mo4048r(View view) {
        return true;
    }
}
