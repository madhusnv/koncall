package com.kizitonwose.calendar.view.internal.weekcalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import j$.time.LocalDate;
import p001o.msa;
import p001o.nri;
import p001o.sq8;
import p001o.v6j;

/* loaded from: classes6.dex */
public final class WeekCalendarLayoutManager extends CalendarLayoutManager<LocalDate, LocalDate> {
    public final WeekCalendarView x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarLayoutManager(WeekCalendarView weekCalendarView) {
        super(weekCalendarView, 0);
        sq8.m48649h(weekCalendarView, "calView");
        this.x0 = weekCalendarView;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public msa g3() {
        return this.x0.getWeekMargins();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public void j3() {
        s3().m52386o();
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    public boolean k3() {
        return this.x0.getScrollPaged();
    }

    public final v6j s3() {
        RecyclerView.AbstractC2371h adapter = this.x0.getAdapter();
        sq8.m48647f(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarAdapter");
        return (v6j) adapter;
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public int f3(LocalDate localDate) {
        sq8.m48649h(localDate, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return nri.m41012a(localDate);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public int h3(LocalDate localDate) {
        sq8.m48649h(localDate, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return s3().m52381j(localDate);
    }

    @Override // com.kizitonwose.calendar.view.internal.CalendarLayoutManager
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public int i3(LocalDate localDate) {
        sq8.m48649h(localDate, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return s3().m52381j(localDate);
    }
}
