package p001o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.internal.C11562a;
import com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class v6j extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final WeekCalendarView f49934a;

    /* renamed from: b */
    public LocalDate f49935b;

    /* renamed from: c */
    public LocalDate f49936c;

    /* renamed from: d */
    public DayOfWeek f49937d;

    /* renamed from: e */
    public z6j f49938e;

    /* renamed from: f */
    public int f49939f;

    /* renamed from: g */
    public final jz4 f49940g;

    /* renamed from: h */
    public s6j f49941h;

    /* renamed from: o.v6j$a */
    public static final class C17519a extends kf9 implements xk7 {
        public C17519a() {
            super(1);
        }

        /* renamed from: a */
        public final s6j m52391a(int i) {
            return y6j.m57322b(v6j.this.m52384m(), i, v6j.this.f49935b, v6j.this.f49936c).m55753b();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m52391a(((Number) obj).intValue());
        }
    }

    public v6j(WeekCalendarView weekCalendarView, LocalDate localDate, LocalDate localDate2, DayOfWeek dayOfWeek) {
        sq8.m48649h(weekCalendarView, "calView");
        sq8.m48649h(localDate, "startDate");
        sq8.m48649h(localDate2, "endDate");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        this.f49934a = weekCalendarView;
        this.f49935b = localDate;
        this.f49936c = localDate2;
        this.f49937d = dayOfWeek;
        z6j z6jVarM57321a = y6j.m57321a(localDate, localDate2, dayOfWeek);
        this.f49938e = z6jVarM57321a;
        this.f49939f = y6j.m57324d(z6jVarM57321a.m58855b(), this.f49938e.m58854a());
        this.f49940g = new jz4(new C17519a());
        setHasStableIds(true);
    }

    /* renamed from: p */
    public static final void m52378p(v6j v6jVar) {
        sq8.m48649h(v6jVar, "this$0");
        v6jVar.m52386o();
    }

    /* renamed from: q */
    public static final void m52379q(v6j v6jVar) {
        sq8.m48649h(v6jVar, "this$0");
        v6jVar.m52386o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f49939f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public long getItemId(int i) {
        return ((a7j) kh3.f0(m52382k(i).m47918a())).m16579a().hashCode();
    }

    /* renamed from: i */
    public final int m52380i() {
        return m52383l().l2();
    }

    /* renamed from: j */
    public final int m52381j(LocalDate localDate) {
        sq8.m48649h(localDate, "date");
        return y6j.m57323c(m52384m(), localDate);
    }

    /* renamed from: k */
    public final s6j m52382k(int i) {
        return (s6j) this.f49940g.get(Integer.valueOf(i));
    }

    /* renamed from: l */
    public final WeekCalendarLayoutManager m52383l() {
        RecyclerView.AbstractC2379p layoutManager = this.f49934a.getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager");
        return (WeekCalendarLayoutManager) layoutManager;
    }

    /* renamed from: m */
    public final LocalDate m52384m() {
        return this.f49938e.m58855b();
    }

    /* renamed from: n */
    public final boolean m52385n() {
        return this.f49934a.getAdapter() == this;
    }

    /* renamed from: o */
    public final void m52386o() {
        if (m52385n()) {
            if (this.f49934a.A0()) {
                RecyclerView.AbstractC2376m itemAnimator = this.f49934a.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m9214q(new RecyclerView.AbstractC2376m.a() { // from class: o.t6j
                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m.a
                        /* renamed from: a */
                        public final void mo9221a() {
                            v6j.m52378p(this.f46548a);
                        }
                    });
                    return;
                }
                return;
            }
            int iM52380i = m52380i();
            if (iM52380i != -1) {
                s6j s6jVar = (s6j) this.f49940g.get(Integer.valueOf(iM52380i));
                if (sq8.m48644c(s6jVar, this.f49941h)) {
                    return;
                }
                this.f49941h = s6jVar;
                xk7 weekScrollListener = this.f49934a.getWeekScrollListener();
                if (weekScrollListener != null) {
                    weekScrollListener.invoke(s6jVar);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        sq8.m48649h(recyclerView, "recyclerView");
        this.f49934a.post(new Runnable() { // from class: o.u6j
            @Override // java.lang.Runnable
            public final void run() {
                v6j.m52379q(this.f48438a);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e7j e7jVar, int i) {
        sq8.m48649h(e7jVar, "holder");
        e7jVar.m24500O(m52382k(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e7j e7jVar, int i, List list) {
        sq8.m48649h(e7jVar, "holder");
        sq8.m48649h(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(e7jVar, i, list);
            return;
        }
        for (Object obj : list) {
            sq8.m48647f(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.WeekDay");
            e7jVar.m24501P((a7j) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e7j onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        msa weekMargins = this.f49934a.getWeekMargins();
        e05 daySize = this.f49934a.getDaySize();
        Context context = this.f49934a.getContext();
        sq8.m48648g(context, "calView.context");
        int dayViewResource = this.f49934a.getDayViewResource();
        int weekHeaderResource = this.f49934a.getWeekHeaderResource();
        int weekFooterResource = this.f49934a.getWeekFooterResource();
        String weekViewClass = this.f49934a.getWeekViewClass();
        b7j dayBinder = this.f49934a.getDayBinder();
        sq8.m48647f(dayBinder, "null cannot be cast to non-null type com.kizitonwose.calendar.view.WeekDayBinder<*>");
        sx8 sx8VarM41013b = nri.m41013b(weekMargins, daySize, context, dayViewResource, weekHeaderResource, weekFooterResource, 1, weekViewClass, dayBinder);
        ViewGroup viewGroupM49074c = sx8VarM41013b.m49074c();
        View viewM49073b = sx8VarM41013b.m49073b();
        View viewM49072a = sx8VarM41013b.m49072a();
        C11562a c11562a = (C11562a) kh3.f0(sx8VarM41013b.m49075d());
        this.f49934a.getWeekHeaderBinder();
        this.f49934a.getWeekFooterBinder();
        return new e7j(viewGroupM49074c, viewM49073b, viewM49072a, c11562a, null, null);
    }

    /* renamed from: u */
    public final void m52390u(LocalDate localDate) {
        sq8.m48649h(localDate, "date");
        int iM52381j = m52381j(localDate);
        if (iM52381j != -1) {
            for (Object obj : ((s6j) this.f49940g.get(Integer.valueOf(iM52381j))).m47918a()) {
                if (sq8.m48644c(((a7j) obj).m16579a(), localDate)) {
                    notifyItemChanged(iM52381j, obj);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
