package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import p001o.gqi;
import p001o.iwc;
import p001o.n9e;
import p001o.rs1;
import p001o.wz4;
import p001o.zs1;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes3.dex */
public class C11038b extends BaseAdapter {

    /* renamed from: g */
    public static final int f12519g = gqi.m29327m().getMaximum(4);

    /* renamed from: h */
    public static final int f12520h = (gqi.m29327m().getMaximum(5) + gqi.m29327m().getMaximum(7)) - 1;

    /* renamed from: a */
    public final Month f12521a;

    /* renamed from: b */
    public final DateSelector f12522b;

    /* renamed from: c */
    public Collection f12523c;

    /* renamed from: d */
    public zs1 f12524d;

    /* renamed from: e */
    public final CalendarConstraints f12525e;

    /* renamed from: f */
    public final DayViewDecorator f12526f;

    public C11038b(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f12521a = month;
        this.f12522b = dateSelector;
        this.f12525e = calendarConstraints;
        this.f12526f = dayViewDecorator;
        this.f12523c = dateSelector.K2();
    }

    /* renamed from: a */
    public int m14548a(int i) {
        return m14549b() + (i - 1);
    }

    /* renamed from: b */
    public int m14549b() {
        return this.f12521a.m14508g(this.f12525e.m14454i());
    }

    /* renamed from: c */
    public final String m14550c(Context context, long j) {
        return wz4.m55434e(context, j, m14559l(j), m14558k(j), m14554g(j));
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < m14549b() || i > m14560m()) {
            return null;
        }
        return Long.valueOf(this.f12521a.m14509h(m14561n(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        m14553f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(n9e.mtrl_calendar_day, viewGroup, false);
        }
        int iM14549b = i - m14549b();
        if (iM14549b >= 0) {
            Month month = this.f12521a;
            if (iM14549b >= month.f12485e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iM14549b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        m14562o(textView, item.longValue(), i2);
        return textView;
    }

    /* renamed from: f */
    public final void m14553f(Context context) {
        if (this.f12524d == null) {
            this.f12524d = new zs1(context);
        }
    }

    /* renamed from: g */
    public boolean m14554g(long j) {
        Iterator it = this.f12522b.G1().iterator();
        while (it.hasNext()) {
            Object obj = ((iwc) it.next()).f29292b;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f12520h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f12521a.f12484d;
    }

    /* renamed from: h */
    public boolean m14555h(int i) {
        return i % this.f12521a.f12484d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public boolean m14556i(int i) {
        return (i + 1) % this.f12521a.f12484d == 0;
    }

    /* renamed from: j */
    public final boolean m14557j(long j) {
        Iterator it = this.f12522b.K2().iterator();
        while (it.hasNext()) {
            if (gqi.m29315a(j) == gqi.m29315a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m14558k(long j) {
        Iterator it = this.f12522b.G1().iterator();
        while (it.hasNext()) {
            Object obj = ((iwc) it.next()).f29291a;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m14559l(long j) {
        return gqi.m29325k().getTimeInMillis() == j;
    }

    /* renamed from: m */
    public int m14560m() {
        return (m14549b() + this.f12521a.f12485e) - 1;
    }

    /* renamed from: n */
    public int m14561n(int i) {
        return (i - m14549b()) + 1;
    }

    /* renamed from: o */
    public final void m14562o(TextView textView, long j, int i) {
        boolean z;
        rs1 rs1Var;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strM14550c = m14550c(context, j);
        textView.setContentDescription(strM14550c);
        boolean zL0 = this.f12525e.m14452g().L0(j);
        if (zL0) {
            textView.setEnabled(true);
            boolean zM14557j = m14557j(j);
            textView.setSelected(zM14557j);
            rs1Var = zM14557j ? this.f12524d.f57587b : m14559l(j) ? this.f12524d.f57588c : this.f12524d.f57586a;
            z = zM14557j;
        } else {
            textView.setEnabled(false);
            z = false;
            rs1Var = this.f12524d.f57592g;
        }
        DayViewDecorator dayViewDecorator = this.f12526f;
        if (dayViewDecorator == null || i == -1) {
            rs1Var.m47130d(textView);
            return;
        }
        Month month = this.f12521a;
        int i2 = month.f12483c;
        int i3 = month.f12482b;
        ColorStateList colorStateListM14480a = dayViewDecorator.m14480a(context, i2, i3, i, zL0, z);
        boolean z2 = z;
        rs1Var.m47131e(textView, colorStateListM14480a, this.f12526f.m14486g(context, i2, i3, i, zL0, z2));
        Drawable drawableM14482c = this.f12526f.m14482c(context, i2, i3, i, zL0, z2);
        Drawable drawableM14484e = this.f12526f.m14484e(context, i2, i3, i, zL0, z2);
        Drawable drawableM14483d = this.f12526f.m14483d(context, i2, i3, i, zL0, z2);
        boolean z3 = z;
        textView.setCompoundDrawables(drawableM14482c, drawableM14484e, drawableM14483d, this.f12526f.m14481b(context, i2, i3, i, zL0, z3));
        textView.setContentDescription(this.f12526f.m14485f(context, i2, i3, i, zL0, z3, strM14550c));
    }

    /* renamed from: p */
    public final void m14563p(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m14505d(j).equals(this.f12521a)) {
            int iM14510j = this.f12521a.m14510j(j);
            m14562o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m14548a(iM14510j) - materialCalendarGridView.getFirstVisiblePosition()), j, iM14510j);
        }
    }

    /* renamed from: q */
    public void m14564q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f12523c.iterator();
        while (it.hasNext()) {
            m14563p(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f12522b;
        if (dateSelector != null) {
            Iterator it2 = dateSelector.K2().iterator();
            while (it2.hasNext()) {
                m14563p(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f12523c = this.f12522b.K2();
        }
    }

    /* renamed from: r */
    public boolean m14565r(int i) {
        return i >= m14549b() && i <= m14560m();
    }
}
