package com.kizitonwose.calendar.view.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C2406l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import p001o.msa;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class CalendarLayoutManager<IndexData, DayData> extends LinearLayoutManager {
    public final RecyclerView w0;

    /* renamed from: com.kizitonwose.calendar.view.internal.CalendarLayoutManager$a */
    public final class C11561a extends C2406l {

        /* renamed from: q */
        public final Object f13497q;

        public C11561a(int i, Object obj) {
            super(CalendarLayoutManager.this.w0.getContext());
            this.f13497q = obj;
            m9335p(i);
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: B */
        public int mo9608B() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: t */
        public int mo9611t(View view, int i) {
            sq8.m48649h(view, "view");
            int iMo9611t = super.mo9611t(view, i);
            Object obj = this.f13497q;
            return obj == null ? iMo9611t : iMo9611t - CalendarLayoutManager.this.e3(obj, view);
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: u */
        public int mo9612u(View view, int i) {
            sq8.m48649h(view, "view");
            int iMo9612u = super.mo9612u(view, i);
            Object obj = this.f13497q;
            return obj == null ? iMo9612u : iMo9612u - CalendarLayoutManager.this.e3(obj, view);
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: z */
        public int mo9617z() {
            return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarLayoutManager(RecyclerView recyclerView, int i) {
        super(recyclerView.getContext(), i, false);
        sq8.m48649h(recyclerView, "calView");
        this.w0 = recyclerView;
    }

    public static final void m3(CalendarLayoutManager calendarLayoutManager) {
        sq8.m48649h(calendarLayoutManager, "this$0");
        calendarLayoutManager.j3();
    }

    public static final void n3(final CalendarLayoutManager calendarLayoutManager, int i, Object obj) {
        View view;
        sq8.m48649h(calendarLayoutManager, "this$0");
        RecyclerView.d0 d0VarC0 = calendarLayoutManager.w0.c0(i);
        if (d0VarC0 == null || (view = d0VarC0.f9794a) == null) {
            return;
        }
        calendarLayoutManager.M2(i, -calendarLayoutManager.e3(obj, view));
        calendarLayoutManager.w0.post(new Runnable() { // from class: o.vs1
            @Override // java.lang.Runnable
            public final void run() {
                CalendarLayoutManager.o3(this.f50804a);
            }
        });
    }

    public static final void o3(CalendarLayoutManager calendarLayoutManager) {
        sq8.m48649h(calendarLayoutManager, "this$0");
        calendarLayoutManager.j3();
    }

    public static final void q3(CalendarLayoutManager calendarLayoutManager) {
        sq8.m48649h(calendarLayoutManager, "this$0");
        calendarLayoutManager.j3();
    }

    public final int e3(Object obj, View view) {
        int i;
        int iM39615c;
        View viewFindViewWithTag = view.findViewWithTag(Integer.valueOf(f3(obj)));
        if (viewFindViewWithTag == null) {
            return 0;
        }
        Rect rect = new Rect();
        viewFindViewWithTag.getDrawingRect(rect);
        sq8.m48647f(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewWithTag, rect);
        boolean z = y2() == 1;
        msa msaVarG3 = g3();
        if (z) {
            i = rect.top;
            iM39615c = msaVarG3.m39616d();
        } else {
            i = rect.left;
            iM39615c = msaVarG3.m39615c();
        }
        return i + iM39615c;
    }

    public abstract int f3(Object obj);

    public abstract msa g3();

    public abstract int h3(Object obj);

    public abstract int i3(Object obj);

    public abstract void j3();

    public abstract boolean k3();

    public final void l3(final Object obj) {
        final int iH3 = h3(obj);
        if (iH3 == -1) {
            return;
        }
        M2(iH3, 0);
        if (k3()) {
            this.w0.post(new Runnable() { // from class: o.ts1
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarLayoutManager.m3(this.f47662a);
                }
            });
        } else {
            this.w0.post(new Runnable() { // from class: o.us1
                @Override // java.lang.Runnable
                public final void run() {
                    CalendarLayoutManager.n3(this.f49420a, iH3, obj);
                }
            });
        }
    }

    public final void p3(Object obj) {
        int iI3 = i3(obj);
        if (iI3 == -1) {
            return;
        }
        M2(iI3, 0);
        this.w0.post(new Runnable() { // from class: o.ss1
            @Override // java.lang.Runnable
            public final void run() {
                CalendarLayoutManager.q3(this.f45855a);
            }
        });
    }

    public final void r3(Object obj) {
        int iI3 = i3(obj);
        if (iI3 == -1) {
            return;
        }
        W1(new C11561a(iI3, null));
    }
}
