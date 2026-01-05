package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.v0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import o5.AbstractC5292a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC5292a {
    public ExpandableBehavior() {
    }

    @Override // o5.AbstractC5292a
    /* renamed from: b */
    public abstract void mo4148b(View view);

    @Override // o5.AbstractC5292a
    /* renamed from: d */
    public final boolean mo4045d(View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public final boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        Field field = v0.f5527a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM743j = coordinatorLayout.m743j(view);
            int size = arrayListM743j.size();
            for (int i11 = 0; i11 < size; i11++) {
                mo4148b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
