package com.google.android.material.appbar;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.v0;
import ch.AbstractC0971a;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import java.util.ArrayList;
import o5.C5295d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0971a {

    /* renamed from: b */
    public final int f6723b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: s */
    public static void m4044s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override // o5.AbstractC5292a
    /* renamed from: d */
    public final boolean mo4045d(View view, View view2) {
        int i10;
        if (((C5295d) view2.getLayoutParams()).f25981a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i11 = this.f6723b;
            if (i11 == 0 || (i10 = (int) (DefinitionKt.NO_Float_VALUE * i11)) < 0) {
                i11 = 0;
            } else if (i10 <= i11) {
                i11 = i10;
            }
            int i12 = bottom - i11;
            Field field = v0.f5527a;
            view.offsetTopAndBottom(i12);
        }
        return false;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: h */
    public final boolean mo4036h(CoordinatorLayout coordinatorLayout, View view) {
        int i10 = view.getLayoutParams().height;
        if (i10 != -1 && i10 != -2) {
            return false;
        }
        m4044s(coordinatorLayout.m743j(view));
        return false;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: l */
    public final void mo4046l(CoordinatorLayout coordinatorLayout, View view) {
        m4044s(coordinatorLayout.m743j(view));
    }

    @Override // ch.AbstractC0971a
    /* renamed from: r */
    public final void mo2729r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        m4044s(coordinatorLayout.m743j(view));
        coordinatorLayout.m747p(i10, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f470s);
        this.f6723b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
