package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import p001o.cc;
import p001o.db;
import p001o.gqi;
import p001o.iwc;
import p001o.n8e;
import p001o.wvi;
import p001o.xzi;
import p001o.zs1;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f12432a;

    /* renamed from: b */
    public final boolean f12433b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C11026a extends db {
        public C11026a() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.q0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public static int m14489d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m14490e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    public final void m14491a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().m14560m());
        } else if (i == 130) {
            setSelection(getAdapter().m14549b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11038b getAdapter() {
        return (C11038b) super.getAdapter();
    }

    /* renamed from: c */
    public final View m14493c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM14548a;
        int iM14489d;
        int iM14548a2;
        int iM14489d2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C11038b adapter = getAdapter();
        DateSelector dateSelector = adapter.f12522b;
        zs1 zs1Var = adapter.f12524d;
        int iMax = Math.max(adapter.m14549b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.m14560m(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator it = dateSelector.G1().iterator();
        while (it.hasNext()) {
            iwc iwcVar = (iwc) it.next();
            Object obj = iwcVar.f29291a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (iwcVar.f29292b != null) {
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) iwcVar.f29292b).longValue();
                if (!m14490e(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                    boolean zM57079o = xzi.m57079o(this);
                    if (jLongValue < item.longValue()) {
                        iM14489d = adapter.m14555h(iMax) ? 0 : !zM57079o ? materialCalendarGridView.m14493c(iMax - 1).getRight() : materialCalendarGridView.m14493c(iMax - 1).getLeft();
                        iM14548a = iMax;
                    } else {
                        materialCalendarGridView.f12432a.setTimeInMillis(jLongValue);
                        iM14548a = adapter.m14548a(materialCalendarGridView.f12432a.get(5));
                        iM14489d = m14489d(materialCalendarGridView.m14493c(iM14548a));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iM14489d2 = adapter.m14556i(iMin) ? getWidth() : !zM57079o ? materialCalendarGridView.m14493c(iMin).getRight() : materialCalendarGridView.m14493c(iMin).getLeft();
                        iM14548a2 = iMin;
                    } else {
                        materialCalendarGridView.f12432a.setTimeInMillis(jLongValue2);
                        iM14548a2 = adapter.m14548a(materialCalendarGridView.f12432a.get(5));
                        iM14489d2 = m14489d(materialCalendarGridView.m14493c(iM14548a2));
                    }
                    int itemId = (int) adapter.getItemId(iM14548a);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iM14548a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewM14493c = materialCalendarGridView.m14493c(numColumns);
                        int top = viewM14493c.getTop() + zs1Var.f57586a.m47129c();
                        C11038b c11038b = adapter;
                        int bottom = viewM14493c.getBottom() - zs1Var.f57586a.m47128b();
                        if (zM57079o) {
                            int i4 = iM14548a2 > numColumns2 ? 0 : iM14489d2;
                            width = numColumns > iM14548a ? getWidth() : iM14489d;
                            i = i4;
                        } else {
                            i = numColumns > iM14548a ? 0 : iM14489d;
                            width = iM14548a2 > numColumns2 ? getWidth() : iM14489d2;
                        }
                        canvas.drawRect(i, top, width, bottom, zs1Var.f57593h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = c11038b;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m14491a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().m14549b() && selectedItemPosition <= getAdapter().m14560m())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m14549b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f12433b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().m14549b()) {
            super.setSelection(getAdapter().m14549b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12432a = gqi.m29327m();
        if (MaterialDatePicker.Y0(getContext())) {
            setNextFocusLeftId(n8e.cancel_button);
            setNextFocusRightId(n8e.confirm_button);
        }
        this.f12433b = MaterialDatePicker.a1(getContext());
        wvi.m0(this, new C11026a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C11038b)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C11038b.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
