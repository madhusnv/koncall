package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import p001o.d05;
import p001o.e05;
import p001o.gbe;
import p001o.msa;
import p001o.ori;
import p001o.ps1;
import p001o.sq8;
import p001o.ulb;
import p001o.ws1;
import p001o.xfc;
import p001o.xk7;
import p001o.xs1;
import p001o.ylb;
import p001o.zlb;

/* loaded from: classes6.dex */
public class CalendarView extends RecyclerView {
    public ylb B1;
    public zlb C1;
    public zlb D1;
    public xk7 E1;
    public int F1;
    public int G1;
    public int H1;
    public String I1;
    public int J1;
    public boolean K1;
    public xfc L1;
    public e05 M1;
    public msa N1;
    public final C11559a O1;
    public final xs1 P1;
    public YearMonth Q1;
    public YearMonth R1;
    public DayOfWeek S1;

    /* renamed from: com.kizitonwose.calendar.view.CalendarView$a */
    public static final class C11559a extends RecyclerView.AbstractC2383t {
        public C11559a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: a */
        public void mo9260a(RecyclerView recyclerView, int i) {
            sq8.m48649h(recyclerView, "recyclerView");
            if (i == 0) {
                CalendarView.this.getCalendarAdapter().m51723p();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            sq8.m48649h(recyclerView, "recyclerView");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.L1 = xfc.EndOfRow;
        this.M1 = e05.Square;
        this.N1 = new msa(0, 0, 0, 0, 15, null);
        this.O1 = new C11559a();
        this.P1 = new xs1();
    }

    public static final void Q1(CalendarView calendarView) {
        sq8.m48649h(calendarView, "this$0");
        calendarView.getCalendarAdapter().m51723p();
    }

    public static /* synthetic */ void S1(CalendarView calendarView, LocalDate localDate, d05 d05Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyDateChanged");
        }
        if ((i & 2) != 0) {
            d05Var = d05.MonthDate;
        }
        calendarView.R1(localDate, d05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ulb getCalendarAdapter() {
        RecyclerView.AbstractC2371h adapter = getAdapter();
        sq8.m48647f(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarAdapter");
        return (ulb) adapter;
    }

    private final MonthCalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.AbstractC2379p layoutManager = getLayoutManager();
        sq8.m48647f(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager");
        return (MonthCalendarLayoutManager) layoutManager;
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public final ws1 M1() {
        return getCalendarAdapter().m51716i();
    }

    public final IllegalStateException N1(String str) {
        return new IllegalStateException("`" + str + "` is not set. Have you called `setup()`?");
    }

    public final void O1(AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        setItemAnimator(null);
        setHasFixedSize(true);
        Context context = getContext();
        sq8.m48648g(context, "context");
        int[] iArr = gbe.CalendarView;
        sq8.m48648g(iArr, "CalendarView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setDayViewResource(typedArrayObtainStyledAttributes.getResourceId(gbe.CalendarView_cv_dayViewResource, this.F1));
        setMonthHeaderResource(typedArrayObtainStyledAttributes.getResourceId(gbe.CalendarView_cv_monthHeaderResource, this.G1));
        setMonthFooterResource(typedArrayObtainStyledAttributes.getResourceId(gbe.CalendarView_cv_monthFooterResource, this.H1));
        setOrientation(typedArrayObtainStyledAttributes.getInt(gbe.CalendarView_cv_orientation, this.J1));
        setScrollPaged(typedArrayObtainStyledAttributes.getBoolean(gbe.CalendarView_cv_scrollPaged, this.J1 == 0));
        setDaySize(e05.values()[typedArrayObtainStyledAttributes.getInt(gbe.CalendarView_cv_daySize, this.M1.ordinal())]);
        setOutDateStyle(xfc.values()[typedArrayObtainStyledAttributes.getInt(gbe.CalendarView_cv_outDateStyle, this.L1.ordinal())]);
        setMonthViewClass(typedArrayObtainStyledAttributes.getString(gbe.CalendarView_cv_monthViewClass));
        typedArrayObtainStyledAttributes.recycle();
        if (!(this.F1 != 0)) {
            throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
        }
    }

    public final void P1() {
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
        post(new Runnable() { // from class: o.at1
            @Override // java.lang.Runnable
            public final void run() {
                CalendarView.Q1(this.f15212a);
            }
        });
    }

    public final void R1(LocalDate localDate, d05 d05Var) {
        sq8.m48649h(localDate, "date");
        sq8.m48649h(d05Var, "position");
        T1(new ps1(localDate, d05Var));
    }

    public final void T1(ps1 ps1Var) {
        sq8.m48649h(ps1Var, "day");
        getCalendarAdapter().m51727v(ps1Var);
    }

    public final YearMonth U1() {
        YearMonth yearMonth = this.R1;
        if (yearMonth != null) {
            return yearMonth;
        }
        throw N1("endMonth");
    }

    public final DayOfWeek V1() {
        DayOfWeek dayOfWeek = this.S1;
        if (dayOfWeek != null) {
            return dayOfWeek;
        }
        throw N1("firstDayOfWeek");
    }

    public final YearMonth W1() {
        YearMonth yearMonth = this.Q1;
        if (yearMonth != null) {
            return yearMonth;
        }
        throw N1("startMonth");
    }

    public final void X1(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "month");
        getCalendarLayoutManager().p3(yearMonth);
    }

    public final void Y1(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "month");
        getCalendarLayoutManager().r3(yearMonth);
    }

    public final void Z1() {
        getCalendarAdapter().m51728w(W1(), U1(), this.L1, V1());
    }

    public final ylb getDayBinder() {
        return this.B1;
    }

    public final e05 getDaySize() {
        return this.M1;
    }

    public final int getDayViewResource() {
        return this.F1;
    }

    public final zlb getMonthFooterBinder() {
        return this.D1;
    }

    public final int getMonthFooterResource() {
        return this.H1;
    }

    public final zlb getMonthHeaderBinder() {
        return this.C1;
    }

    public final int getMonthHeaderResource() {
        return this.G1;
    }

    public final msa getMonthMargins() {
        return this.N1;
    }

    public final xk7 getMonthScrollListener() {
        return this.E1;
    }

    public final String getMonthViewClass() {
        return this.I1;
    }

    public final int getOrientation() {
        return this.J1;
    }

    public final xfc getOutDateStyle() {
        return this.L1;
    }

    public final boolean getScrollPaged() {
        return this.K1;
    }

    public final void setDayBinder(ylb ylbVar) {
        this.B1 = ylbVar;
        P1();
    }

    public final void setDaySize(e05 e05Var) {
        sq8.m48649h(e05Var, "value");
        if (this.M1 != e05Var) {
            this.M1 = e05Var;
            P1();
        }
    }

    public final void setDayViewResource(int i) {
        if (this.F1 != i) {
            if (!(i != 0)) {
                throw new IllegalStateException("Invalid 'dayViewResource' value.".toString());
            }
            this.F1 = i;
            P1();
        }
    }

    public final void setMonthFooterBinder(zlb zlbVar) {
        this.D1 = zlbVar;
        P1();
    }

    public final void setMonthFooterResource(int i) {
        if (this.H1 != i) {
            this.H1 = i;
            P1();
        }
    }

    public final void setMonthHeaderBinder(zlb zlbVar) {
        this.C1 = zlbVar;
        P1();
    }

    public final void setMonthHeaderResource(int i) {
        if (this.G1 != i) {
            this.G1 = i;
            P1();
        }
    }

    public final void setMonthMargins(msa msaVar) {
        sq8.m48649h(msaVar, "value");
        if (sq8.m48644c(this.N1, msaVar)) {
            return;
        }
        this.N1 = msaVar;
        P1();
    }

    public final void setMonthScrollListener(xk7 xk7Var) {
        this.E1 = xk7Var;
    }

    public final void setMonthViewClass(String str) {
        if (sq8.m48644c(this.I1, str)) {
            return;
        }
        this.I1 = str;
        P1();
    }

    public final void setOrientation(int i) {
        if (this.J1 != i) {
            this.J1 = i;
            RecyclerView.AbstractC2379p layoutManager = getLayoutManager();
            MonthCalendarLayoutManager monthCalendarLayoutManager = layoutManager instanceof MonthCalendarLayoutManager ? (MonthCalendarLayoutManager) layoutManager : null;
            if (monthCalendarLayoutManager == null) {
                return;
            }
            monthCalendarLayoutManager.N2(i);
        }
    }

    public final void setOutDateStyle(xfc xfcVar) {
        sq8.m48649h(xfcVar, "value");
        if (this.L1 != xfcVar) {
            this.L1 = xfcVar;
            if (getAdapter() != null) {
                Z1();
            }
        }
    }

    public final void setScrollPaged(boolean z) {
        if (this.K1 != z) {
            this.K1 = z;
            this.P1.mo9681b(z ? this : null);
        }
    }

    public final void setup(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "endMonth");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        ori.m42609b(yearMonth, yearMonth2);
        this.Q1 = yearMonth;
        this.R1 = yearMonth2;
        this.S1 = dayOfWeek;
        j1(this.O1);
        m9090l(this.O1);
        setLayoutManager(new MonthCalendarLayoutManager(this));
        setAdapter(new ulb(this, this.L1, yearMonth, yearMonth2, dayOfWeek));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.L1 = xfc.EndOfRow;
        this.M1 = e05.Square;
        this.N1 = new msa(0, 0, 0, 0, 15, null);
        this.O1 = new C11559a();
        this.P1 = new xs1();
        O1(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        this.L1 = xfc.EndOfRow;
        this.M1 = e05.Square;
        this.N1 = new msa(0, 0, 0, 0, 15, null);
        this.O1 = new C11559a();
        this.P1 = new xs1();
        O1(attributeSet, i, i);
    }
}
