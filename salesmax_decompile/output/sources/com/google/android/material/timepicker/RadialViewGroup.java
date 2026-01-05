package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.ebe;
import p001o.n8e;
import p001o.n9e;
import p001o.whe;
import p001o.zya;

/* loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {
    public final Runnable q0;
    public int r0;
    public zya s0;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: H */
    public static boolean m15517H(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: C */
    public final void m15518C(List list, C2005b c2005b, int i) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c2005b.m5686s(((View) it.next()).getId(), n8e.circle_center, i, size);
            size += 360.0f / list.size();
        }
    }

    /* renamed from: D */
    public final Drawable m15519D() {
        zya zyaVar = new zya();
        this.s0 = zyaVar;
        zyaVar.d0(new whe(0.5f));
        this.s0.g0(ColorStateList.valueOf(-1));
        return this.s0;
    }

    /* renamed from: E */
    public int m15520E(int i) {
        return i == 2 ? Math.round(this.r0 * 0.66f) : this.r0;
    }

    /* renamed from: F */
    public int m15521F() {
        return this.r0;
    }

    /* renamed from: G */
    public void mo15469G(int i) {
        this.r0 = i;
        mo15470I();
    }

    /* renamed from: I */
    public void mo15470I() {
        C2005b c2005b = new C2005b();
        c2005b.m5682o(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != n8e.circle_center && !m15517H(childAt)) {
                int i2 = (Integer) childAt.getTag(n8e.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            m15518C((List) entry.getValue(), c2005b, m15520E(((Integer) entry.getKey()).intValue()));
        }
        c2005b.m5677i(this);
    }

    /* renamed from: J */
    public final void m15522J() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.q0);
            handler.post(this.q0);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        m15522J();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo15470I();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m15522J();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.s0.g0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(n9e.material_radial_view_group, this);
        setBackground(m15519D());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.RadialViewGroup, i, 0);
        this.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.RadialViewGroup_materialCircleRadius, 0);
        this.q0 = new Runnable() { // from class: com.google.android.material.timepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f13216a.mo15470I();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
