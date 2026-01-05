package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import p001o.n8e;
import p001o.n9e;
import p001o.wvi;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes3.dex */
public class C11039c extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final CalendarConstraints f12527a;

    /* renamed from: b */
    public final DateSelector f12528b;

    /* renamed from: c */
    public final DayViewDecorator f12529c;

    /* renamed from: d */
    public final MaterialCalendar.InterfaceC11025m f12530d;

    /* renamed from: e */
    public final int f12531e;

    /* renamed from: com.google.android.material.datepicker.c$a */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f12532a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f12532a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.f12532a.getAdapter().m14565r(i)) {
                C11039c.this.f12530d.mo14488a(this.f12532a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$b */
    public static class b extends RecyclerView.d0 {

        /* renamed from: u */
        public final TextView f12534u;

        /* renamed from: v */
        public final MaterialCalendarGridView f12535v;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(n8e.month_title);
            this.f12534u = textView;
            wvi.n0(textView, true);
            this.f12535v = (MaterialCalendarGridView) linearLayout.findViewById(n8e.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C11039c(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.InterfaceC11025m interfaceC11025m) {
        Month monthM14457l = calendarConstraints.m14457l();
        Month monthM14453h = calendarConstraints.m14453h();
        Month monthM14456k = calendarConstraints.m14456k();
        if (monthM14457l.compareTo(monthM14456k) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthM14456k.compareTo(monthM14453h) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f12531e = (C11038b.f12519g * MaterialCalendar.V0(context)) + (MaterialDatePicker.Y0(context) ? MaterialCalendar.V0(context) : 0);
        this.f12527a = calendarConstraints;
        this.f12528b = dateSelector;
        this.f12529c = dayViewDecorator;
        this.f12530d = interfaceC11025m;
        setHasStableIds(true);
    }

    /* renamed from: e */
    public Month m14567e(int i) {
        return this.f12527a.m14457l().m14513o(i);
    }

    /* renamed from: f */
    public CharSequence m14568f(int i) {
        return m14567e(i).m14511m();
    }

    /* renamed from: g */
    public int m14569g(Month month) {
        return this.f12527a.m14457l().m14514r(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f12527a.m14455j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public long getItemId(int i) {
        return this.f12527a.m14457l().m14513o(i).m14512n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        Month monthM14513o = this.f12527a.m14457l().m14513o(i);
        bVar.f12534u.setText(monthM14513o.m14511m());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f12535v.findViewById(n8e.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthM14513o.equals(materialCalendarGridView.getAdapter().f12521a)) {
            C11038b c11038b = new C11038b(monthM14513o, this.f12528b, this.f12527a, this.f12529c);
            materialCalendarGridView.setNumColumns(monthM14513o.f12484d);
            materialCalendarGridView.setAdapter((ListAdapter) c11038b);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m14564q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(n9e.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.Y0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f12531e));
        return new b(linearLayout, true);
    }
}
