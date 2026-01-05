package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.b05;
import p001o.ch3;
import p001o.e05;
import p001o.sq8;

/* renamed from: com.kizitonwose.calendar.view.internal.a */
/* loaded from: classes6.dex */
public final class C11562a {

    /* renamed from: a */
    public final e05 f13500a;

    /* renamed from: b */
    public final List f13501b;

    /* renamed from: c */
    public LinearLayout f13502c;

    public C11562a(e05 e05Var, List list) {
        sq8.m48649h(e05Var, "daySize");
        sq8.m48649h(list, "dayHolders");
        this.f13500a = e05Var;
        this.f13501b = list;
    }

    /* renamed from: a */
    public final void m15882a(List list) {
        sq8.m48649h(list, "daysOfWeek");
        LinearLayout linearLayout = this.f13502c;
        if (linearLayout == null) {
            sq8.m48667z("weekContainer");
            linearLayout = null;
        }
        int i = 0;
        linearLayout.setVisibility(list.isEmpty() ? 8 : 0);
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            ((b05) this.f13501b.get(i)).m18073a(obj);
            i = i2;
        }
    }

    /* renamed from: b */
    public final View m15883b(LinearLayout linearLayout) {
        sq8.m48649h(linearLayout, "parent");
        Context context = linearLayout.getContext();
        sq8.m48648g(context, "parent.context");
        WidthDivisorLinearLayout widthDivisorLinearLayout = new WidthDivisorLinearLayout(context);
        this.f13502c = widthDivisorLinearLayout;
        widthDivisorLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.f13500a.getParentDecidesWidth$view_release() ? -1 : -2, this.f13500a.getParentDecidesHeight$view_release() ? -1 : -2, this.f13500a.getParentDecidesHeight$view_release() ? 1.0f : 0.0f));
        widthDivisorLinearLayout.setOrientation(0);
        widthDivisorLinearLayout.setWeightSum(this.f13501b.size());
        widthDivisorLinearLayout.m15881a(this.f13500a == e05.Square ? this.f13501b.size() : 0);
        Iterator it = this.f13501b.iterator();
        while (it.hasNext()) {
            widthDivisorLinearLayout.addView(((b05) it.next()).m18074b(widthDivisorLinearLayout));
        }
        return widthDivisorLinearLayout;
    }

    /* renamed from: c */
    public final boolean m15884c(Object obj) {
        List list = this.f13501b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((b05) it.next()).m18075c(obj)) {
                return true;
            }
        }
        return false;
    }
}
