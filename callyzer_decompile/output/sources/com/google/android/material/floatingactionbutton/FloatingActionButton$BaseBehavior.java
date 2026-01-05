package com.google.android.material.floatingactionbutton;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o5.AbstractC5292a;
import o5.C5295d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC5292a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // o5.AbstractC5292a
    /* renamed from: a */
    public final boolean mo4114a(View view) {
        throw new ClassCastException();
    }

    @Override // o5.AbstractC5292a
    /* renamed from: c */
    public final void mo4057c(C5295d c5295d) {
        if (c5295d.f25988h == 0) {
            c5295d.f25988h = 80;
        }
    }

    @Override // o5.AbstractC5292a
    /* renamed from: d */
    public final boolean mo4045d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public final boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f458g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
