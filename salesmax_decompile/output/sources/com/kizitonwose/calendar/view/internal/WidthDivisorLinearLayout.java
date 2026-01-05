package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import p001o.lwi;
import p001o.sq8;

/* loaded from: classes6.dex */
final class WidthDivisorLinearLayout extends LinearLayout {

    /* renamed from: a */
    public int f13499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(Context context) {
        super(context);
        sq8.m48649h(context, "context");
    }

    /* renamed from: a */
    public final void m15881a(int i) {
        this.f13499a = i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = lwi.m38080a(this).iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            if (((View) it.next()).getVisibility() != 8) {
                z2 = false;
            }
            if (z2) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            throw new IllegalStateException("Use `View.INVISIBLE` to hide any unneeded day content instead of `View.GONE`".toString());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f13499a > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) / this.f13499a, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
    }
}
