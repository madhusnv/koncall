package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import p001o.b7j;
import p001o.d7j;
import p001o.e05;
import p001o.gbe;
import p001o.msa;
import p001o.ori;
import p001o.sq8;
import p001o.v6j;
import p001o.xk7;
import p001o.xs1;

/* loaded from: classes6.dex */
public class WeekCalendarView extends RecyclerView {
    public b7j B1;
    public xk7 C1;
    public int D1;
    public int E1;
    public int F1;
    public String G1;
    public boolean H1;
    public e05 I1;
    public msa J1;
    public final C11560a K1;
    public final xs1 L1;
    public LocalDate M1;
    public LocalDate N1;
    public DayOfWeek O1;

    /* renamed from: com.kizitonwose.calendar.view.WeekCalendarView$a */
    public static final class C11560a extends RecyclerView.AbstractC2383t {
        public C11560a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: a */
        public void mo9260a(RecyclerView recyclerView, int i) {
            sq8.m48649h(recyclerView, "recyclerView");
            if (i == 0) {
                WeekCalendarView.this.getCalendarAdapter().m52386o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            sq8.m48649h(recyclerView, "recyclerView");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.H1 = true;
        this.I1 = e05.Square;
        this.J1 = new msa(0, 0, 0, 0, 15, null);
        this.K1 = new C11560a();
        this.L1 = new xs1();
    }

    public static final void O1(WeekCalendarView weekCalendarView) {
        sq8.m48649h(weekCalendarView, "this$0");
        weekCalendarView.getCalendarAdapter().m52386o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v6j getCalendarAdapter() {
        RecyclerView.AbstractC2371h adapter = getAdapter();
        sq8.m48647f(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarAdapter");
        return (v6j) adapter;
    }

    private final WeekCalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.AbstractC2379p layoutManager = getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager");
        return (WeekCalendarLayoutManager) layoutManager;
    }

    public final void M1(AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        setItemAnimator(null);
        setHasFixedSize(true);
        Context context = getContext();
        sq8.m48648g(context, "context");
        int[] iArr = gbe.WeekCalendarView;
        sq8.m48648g(iArr, "WeekCalendarView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setDayViewResource(typedArrayObtainStyledAttributes.getResourceId(gbe.WeekCalendarView_cv_dayViewResource, this.D1));
        setWeekHeaderResource(typedArrayObtainStyledAttributes.getResourceId(gbe.WeekCalendarView_cv_weekHeaderResource, this.E1));
        setWeekFooterResource(typedArrayObtainStyledAttributes.getResourceId(gbe.WeekCalendarView_cv_weekFooterResource, this.F1));
        setScrollPaged(typedArrayObtainStyledAttributes.getBoolean(gbe.WeekCalendarView_cv_scrollPaged, this.H1));
        setDaySize(e05.values()[typedArrayObtainStyledAttributes.getInt(gbe.WeekCalendarView_cv_daySize, this.I1.ordinal())]);
        setWeekViewClass(typedArrayObtainStyledAttributes.getString(gbe.WeekCalendarView_cv_weekViewClass));
        typedArrayObtainStyledAttributes.recycle();
        if (this.H1) {
            this.L1.mo9681b(this);
        }
        if (!(this.D1 != 0)) {
            throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
        }
    }

    public final void N1() {
        if (getAdapter() == null || getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC2379p layoutManager = getLayoutManager();
        Parcelable parcelableP1 = layoutManager != null ? layoutManager.p1() : null;
        setAdapter(getAdapter());
        RecyclerView.AbstractC2379p layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.o1(parcelableP1);
        }
        post(new Runnable() { // from class: o.w6j
            @Override // java.lang.Runnable
            public final void run() {
                WeekCalendarView.O1(this.f51549a);
            }
        });
    }

    public final void P1(LocalDate localDate) {
        sq8.m48649h(localDate, "date");
        getCalendarAdapter().m52390u(localDate);
    }

    public final void Q1(LocalDate localDate) {
        sq8.m48649h(localDate, "date");
        getCalendarLayoutManager().l3(localDate);
    }

    public final b7j getDayBinder() {
        return this.B1;
    }

    public final e05 getDaySize() {
        return this.I1;
    }

    public final int getDayViewResource() {
        return this.D1;
    }

    public final boolean getScrollPaged() {
        return this.H1;
    }

    public final d7j getWeekFooterBinder() {
        return null;
    }

    public final int getWeekFooterResource() {
        return this.F1;
    }

    public final d7j getWeekHeaderBinder() {
        return null;
    }

    public final int getWeekHeaderResource() {
        return this.E1;
    }

    public final msa getWeekMargins() {
        return this.J1;
    }

    public final xk7 getWeekScrollListener() {
        return this.C1;
    }

    public final String getWeekViewClass() {
        return this.G1;
    }

    public final void setDayBinder(b7j b7jVar) {
        this.B1 = b7jVar;
        N1();
    }

    public final void setDaySize(e05 e05Var) {
        sq8.m48649h(e05Var, "value");
        if (this.I1 != e05Var) {
            this.I1 = e05Var;
            N1();
        }
    }

    public final void setDayViewResource(int i) {
        if (this.D1 != i) {
            if (!(i != 0)) {
                throw new IllegalStateException("Invalid 'dayViewResource' value.".toString());
            }
            this.D1 = i;
            N1();
        }
    }

    public final void setScrollPaged(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            this.L1.mo9681b(z ? this : null);
        }
    }

    public final void setWeekFooterBinder(d7j d7jVar) {
        N1();
    }

    public final void setWeekFooterResource(int i) {
        if (this.F1 != i) {
            this.F1 = i;
            N1();
        }
    }

    public final void setWeekHeaderBinder(d7j d7jVar) {
        N1();
    }

    public final void setWeekHeaderResource(int i) {
        if (this.E1 != i) {
            this.E1 = i;
            N1();
        }
    }

    public final void setWeekMargins(msa msaVar) {
        sq8.m48649h(msaVar, "value");
        if (sq8.m48644c(this.J1, msaVar)) {
            return;
        }
        this.J1 = msaVar;
        N1();
    }

    public final void setWeekScrollListener(xk7 xk7Var) {
        this.C1 = xk7Var;
    }

    public final void setWeekViewClass(String str) {
        if (sq8.m48644c(this.G1, str)) {
            return;
        }
        this.G1 = str;
        N1();
    }

    public final void setup(LocalDate localDate, LocalDate localDate2, DayOfWeek dayOfWeek) {
        sq8.m48649h(localDate, "startDate");
        sq8.m48649h(localDate2, "endDate");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        ori.m42608a(localDate, localDate2);
        this.M1 = localDate;
        this.N1 = localDate2;
        this.O1 = dayOfWeek;
        j1(this.K1);
        m9090l(this.K1);
        setLayoutManager(new WeekCalendarLayoutManager(this));
        setAdapter(new v6j(this, localDate, localDate2, dayOfWeek));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.H1 = true;
        this.I1 = e05.Square;
        this.J1 = new msa(0, 0, 0, 0, 15, null);
        this.K1 = new C11560a();
        this.L1 = new xs1();
        M1(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.H1 = true;
        this.I1 = e05.Square;
        this.J1 = new msa(0, 0, 0, 0, 15, null);
        this.K1 = new C11560a();
        this.L1 = new xs1();
        M1(attributeSet, i, i);
    }
}
