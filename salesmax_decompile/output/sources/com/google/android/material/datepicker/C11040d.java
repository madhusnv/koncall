package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p001o.gqi;
import p001o.n9e;
import p001o.rs1;
import p001o.wz4;
import p001o.zs1;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes3.dex */
public class C11040d extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final MaterialCalendar f12536a;

    /* renamed from: com.google.android.material.datepicker.d$a */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f12537a;

        public a(int i) {
            this.f12537a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C11040d.this.f12536a.a1(C11040d.this.f12536a.R0().m14451f(Month.m14504c(this.f12537a, C11040d.this.f12536a.T0().f12482b)));
            C11040d.this.f12536a.b1(MaterialCalendar.EnumC11024l.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.d$b */
    public static class b extends RecyclerView.d0 {

        /* renamed from: u */
        public final TextView f12539u;

        public b(TextView textView) {
            super(textView);
            this.f12539u = textView;
        }
    }

    public C11040d(MaterialCalendar materialCalendar) {
        this.f12536a = materialCalendar;
    }

    /* renamed from: e */
    public final View.OnClickListener m14573e(int i) {
        return new a(i);
    }

    /* renamed from: f */
    public int m14574f(int i) {
        return i - this.f12536a.R0().m14457l().f12483c;
    }

    /* renamed from: g */
    public int m14575g(int i) {
        return this.f12536a.R0().m14457l().f12483c + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f12536a.R0().m14458m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        int iM14575g = m14575g(i);
        bVar.f12539u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iM14575g)));
        TextView textView = bVar.f12539u;
        textView.setContentDescription(wz4.m55440k(textView.getContext(), iM14575g));
        zs1 zs1VarS0 = this.f12536a.S0();
        Calendar calendarM29325k = gqi.m29325k();
        rs1 rs1Var = calendarM29325k.get(1) == iM14575g ? zs1VarS0.f57591f : zs1VarS0.f57589d;
        Iterator it = this.f12536a.U0().K2().iterator();
        while (it.hasNext()) {
            calendarM29325k.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM29325k.get(1) == iM14575g) {
                rs1Var = zs1VarS0.f57590e;
            }
        }
        rs1Var.m47130d(bVar.f12539u);
        bVar.f12539u.setSelected(rs1Var == zs1VarS0.f57590e);
        bVar.f12539u.setOnClickListener(m14573e(iM14575g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(n9e.mtrl_calendar_year, viewGroup, false));
    }
}
