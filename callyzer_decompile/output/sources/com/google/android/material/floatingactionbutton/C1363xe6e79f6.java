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
/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C1363xe6e79f6<T> extends AbstractC5292a {
    public C1363xe6e79f6() {
    }

    @Override // o5.AbstractC5292a
    /* renamed from: a */
    public final /* synthetic */ boolean mo4114a(View view) {
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

    public C1363xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f457f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
