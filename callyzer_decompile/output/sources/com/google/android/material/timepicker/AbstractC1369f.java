package com.google.android.material.timepicker;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import m5.C4656j;
import m5.C4657k;
import m5.C4661o;
import mb.o3;
import ph.C5952g;
import ph.C5953h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.f */
/* loaded from: classes.dex */
public abstract class AbstractC1369f extends ConstraintLayout {

    /* renamed from: r */
    public final RunnableC1368e f7011r;

    /* renamed from: s */
    public int f7012s;

    /* renamed from: t */
    public final C5952g f7013t;

    public AbstractC1369f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C5952g c5952g = new C5952g();
        this.f7013t = c5952g;
        C5953h c5953h = new C5953h(0.5f);
        o3 o3VarM11996e = c5952g.f29152a.f29135a.m11996e();
        o3VarM11996e.f23376e = c5953h;
        o3VarM11996e.f23377f = c5953h;
        o3VarM11996e.f23378g = c5953h;
        o3VarM11996e.f23379h = c5953h;
        c5952g.setShapeAppearanceModel(o3VarM11996e.m9582a());
        this.f7013t.m11988i(ColorStateList.valueOf(-1));
        C5952g c5952g2 = this.f7013t;
        Field field = v0.f5527a;
        setBackground(c5952g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f469r, R.attr.materialClockStyle, 0);
        this.f7012s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7011r = new RunnableC1368e(this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            Field field = v0.f5527a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1368e runnableC1368e = this.f7011r;
            handler.removeCallbacks(runnableC1368e);
            handler.post(runnableC1368e);
        }
    }

    /* renamed from: e */
    public final void m4146e() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        C4661o c4661o = new C4661o();
        c4661o.m9544b(this);
        float f6 = DefinitionKt.NO_Float_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i13 = this.f7012s;
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map = c4661o.f23053c;
                if (!map.containsKey(numValueOf)) {
                    map.put(Integer.valueOf(id2), new C4656j());
                }
                C4657k c4657k = ((C4656j) map.get(Integer.valueOf(id2))).f22972d;
                c4657k.f23023w = R.id.circle_center;
                c4657k.f23024x = i13;
                c4657k.f23025y = f6;
                f6 = (360.0f / (childCount - i10)) + f6;
            }
        }
        c4661o.m9543a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m4146e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1368e runnableC1368e = this.f7011r;
            handler.removeCallbacks(runnableC1368e);
            handler.post(runnableC1368e);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f7013t.m11988i(ColorStateList.valueOf(i10));
    }
}
