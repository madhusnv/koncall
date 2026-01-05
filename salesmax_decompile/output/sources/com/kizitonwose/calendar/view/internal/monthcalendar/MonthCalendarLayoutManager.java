package com.kizitonwose.calendar.view.internal.monthcalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import j$.time.YearMonth;
import p001o.msa;
import p001o.nri;
import p001o.ps1;
import p001o.sq8;
import p001o.ulb;

/* loaded from: classes6.dex */
public final class MonthCalendarLayoutManager extends CalendarLayoutManager<YearMonth, ps1> {
    public final CalendarView x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthCalendarLayoutManager(CalendarView calendarView) {
        super(calendarView, calendarView.getOrientation());
        sq8.m48649h(calendarView, "calView");
        this.x0 = calendarView;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public msa g3() {
        return this.x0.getMonthMargins();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public void j3() {
        s3().m51723p();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public boolean k3() {
        return this.x0.getScrollPaged();
    }

    public final ulb s3() {
        RecyclerView.AbstractC2371h adapter = this.x0.getAdapter();
        sq8.m48647f(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarAdapter");
        return (ulb) adapter;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public int f3(ps1 ps1Var) {
        sq8.m48649h(ps1Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return nri.m41012a(ps1Var.m44102a());
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public int h3(ps1 ps1Var) {
        sq8.m48649h(ps1Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return s3().m51719l(ps1Var);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public int i3(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return s3().m51718k(yearMonth);
    }
}
