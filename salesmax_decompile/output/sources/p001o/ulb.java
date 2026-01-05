package p001o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager;
import j$.time.DayOfWeek;
import j$.time.YearMonth;
import java.util.List;

/* loaded from: classes6.dex */
public final class ulb extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final CalendarView f49070a;

    /* renamed from: b */
    public xfc f49071b;

    /* renamed from: c */
    public YearMonth f49072c;

    /* renamed from: d */
    public YearMonth f49073d;

    /* renamed from: e */
    public DayOfWeek f49074e;

    /* renamed from: f */
    public int f49075f;

    /* renamed from: g */
    public final jz4 f49076g;

    /* renamed from: h */
    public ws1 f49077h;

    /* renamed from: o.ulb$a */
    public static final class C17396a extends kf9 implements xk7 {
        public C17396a() {
            super(1);
        }

        /* renamed from: a */
        public final ws1 m51729a(int i) {
            return xlb.m56450a(ulb.this.f49072c, i, ulb.this.f49074e, ulb.this.f49071b).m54685a();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m51729a(((Number) obj).intValue());
        }
    }

    public ulb(CalendarView calendarView, xfc xfcVar, YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek) {
        sq8.m48649h(calendarView, "calView");
        sq8.m48649h(xfcVar, "outDateStyle");
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "endMonth");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        this.f49070a = calendarView;
        this.f49071b = xfcVar;
        this.f49072c = yearMonth;
        this.f49073d = yearMonth2;
        this.f49074e = dayOfWeek;
        this.f49075f = xlb.m56452c(yearMonth, yearMonth2);
        this.f49076g = new jz4(new C17396a());
        setHasStableIds(true);
    }

    /* renamed from: q */
    public static final void m51714q(ulb ulbVar) {
        sq8.m48649h(ulbVar, "this$0");
        ulbVar.m51723p();
    }

    /* renamed from: r */
    public static final void m51715r(ulb ulbVar) {
        sq8.m48649h(ulbVar, "this$0");
        ulbVar.m51723p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f49075f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public long getItemId(int i) {
        return m51720m(i).m54947b().hashCode();
    }

    /* renamed from: i */
    public final ws1 m51716i() {
        int iM51717j = m51717j();
        if (iM51717j == -1) {
            return null;
        }
        return (ws1) this.f49076g.get(Integer.valueOf(iM51717j));
    }

    /* renamed from: j */
    public final int m51717j() {
        return m51721n().l2();
    }

    /* renamed from: k */
    public final int m51718k(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "month");
        return xlb.m56451b(this.f49072c, yearMonth);
    }

    /* renamed from: l */
    public final int m51719l(ps1 ps1Var) {
        sq8.m48649h(ps1Var, "day");
        return m51718k(vlb.m52914a(ps1Var));
    }

    /* renamed from: m */
    public final ws1 m51720m(int i) {
        return (ws1) this.f49076g.get(Integer.valueOf(i));
    }

    /* renamed from: n */
    public final MonthCalendarLayoutManager m51721n() {
        RecyclerView.AbstractC2379p layoutManager = this.f49070a.getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager");
        return (MonthCalendarLayoutManager) layoutManager;
    }

    /* renamed from: o */
    public final boolean m51722o() {
        return this.f49070a.getAdapter() == this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        sq8.m48649h(recyclerView, "recyclerView");
        this.f49070a.post(new Runnable() { // from class: o.slb
            @Override // java.lang.Runnable
            public final void run() {
                ulb.m51715r(this.f45581a);
            }
        });
    }

    /* renamed from: p */
    public final void m51723p() {
        RecyclerView.d0 d0VarC0;
        if (m51722o()) {
            if (this.f49070a.A0()) {
                RecyclerView.AbstractC2376m itemAnimator = this.f49070a.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m9214q(new RecyclerView.AbstractC2376m.a() { // from class: o.tlb
                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m.a
                        /* renamed from: a */
                        public final void mo9221a() {
                            ulb.m51714q(this.f47371a);
                        }
                    });
                    return;
                }
                return;
            }
            int iM51717j = m51717j();
            if (iM51717j != -1) {
                ws1 ws1Var = (ws1) this.f49076g.get(Integer.valueOf(iM51717j));
                if (sq8.m48644c(ws1Var, this.f49077h)) {
                    return;
                }
                this.f49077h = ws1Var;
                xk7 monthScrollListener = this.f49070a.getMonthScrollListener();
                if (monthScrollListener != null) {
                    monthScrollListener.invoke(ws1Var);
                }
                if (this.f49070a.getScrollPaged() && this.f49070a.getLayoutParams().height == -2 && (d0VarC0 = this.f49070a.c0(iM51717j)) != null) {
                    d0VarC0.f9794a.requestLayout();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(amb ambVar, int i) {
        sq8.m48649h(ambVar, "holder");
        ambVar.m17459O(m51720m(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(amb ambVar, int i, List list) {
        sq8.m48649h(ambVar, "holder");
        sq8.m48649h(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(ambVar, i, list);
            return;
        }
        for (Object obj : list) {
            sq8.m48647f(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.CalendarDay");
            ambVar.m17460P((ps1) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public amb onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        msa monthMargins = this.f49070a.getMonthMargins();
        e05 daySize = this.f49070a.getDaySize();
        Context context = this.f49070a.getContext();
        sq8.m48648g(context, "calView.context");
        int dayViewResource = this.f49070a.getDayViewResource();
        int monthHeaderResource = this.f49070a.getMonthHeaderResource();
        int monthFooterResource = this.f49070a.getMonthFooterResource();
        String monthViewClass = this.f49070a.getMonthViewClass();
        ylb dayBinder = this.f49070a.getDayBinder();
        sq8.m48647f(dayBinder, "null cannot be cast to non-null type com.kizitonwose.calendar.view.MonthDayBinder<*>");
        sx8 sx8VarM41013b = nri.m41013b(monthMargins, daySize, context, dayViewResource, monthHeaderResource, monthFooterResource, 6, monthViewClass, dayBinder);
        return new amb(sx8VarM41013b.m49074c(), sx8VarM41013b.m49073b(), sx8VarM41013b.m49072a(), sx8VarM41013b.m49075d(), this.f49070a.getMonthHeaderBinder(), this.f49070a.getMonthFooterBinder());
    }

    /* renamed from: v */
    public final void m51727v(ps1... ps1VarArr) {
        sq8.m48649h(ps1VarArr, "day");
        for (ps1 ps1Var : ps1VarArr) {
            int iM51719l = m51719l(ps1Var);
            if (iM51719l != -1) {
                notifyItemChanged(iM51719l, ps1Var);
            }
        }
    }

    /* renamed from: w */
    public final void m51728w(YearMonth yearMonth, YearMonth yearMonth2, xfc xfcVar, DayOfWeek dayOfWeek) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "endMonth");
        sq8.m48649h(xfcVar, "outDateStyle");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        this.f49072c = yearMonth;
        this.f49073d = yearMonth2;
        this.f49071b = xfcVar;
        this.f49074e = dayOfWeek;
        this.f49075f = xlb.m56452c(yearMonth, yearMonth2);
        this.f49076g.clear();
        notifyDataSetChanged();
    }
}
