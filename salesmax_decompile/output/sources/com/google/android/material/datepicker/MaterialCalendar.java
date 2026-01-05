package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C2409o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p001o.b9e;
import p001o.cc;
import p001o.db;
import p001o.f05;
import p001o.gcc;
import p001o.gqi;
import p001o.iwc;
import p001o.n8e;
import p001o.n9e;
import p001o.qwf;
import p001o.v9e;
import p001o.wvi;
import p001o.x6e;
import p001o.zs1;

/* loaded from: classes3.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: M */
    public static final Object f12398M = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: Q */
    public static final Object f12399Q = "NAVIGATION_PREV_TAG";

    /* renamed from: X */
    public static final Object f12400X = "NAVIGATION_NEXT_TAG";

    /* renamed from: Y */
    public static final Object f12401Y = "SELECTOR_TOGGLE_TAG";

    /* renamed from: H */
    public View f12402H;

    /* renamed from: L */
    public View f12403L;

    /* renamed from: b */
    public int f12404b;

    /* renamed from: c */
    public DateSelector f12405c;

    /* renamed from: d */
    public CalendarConstraints f12406d;

    /* renamed from: e */
    public DayViewDecorator f12407e;

    /* renamed from: f */
    public Month f12408f;

    /* renamed from: g */
    public EnumC11024l f12409g;

    /* renamed from: h */
    public zs1 f12410h;

    /* renamed from: q */
    public RecyclerView f12411q;

    /* renamed from: s */
    public RecyclerView f12412s;

    /* renamed from: x */
    public View f12413x;

    /* renamed from: y */
    public View f12414y;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class ViewOnClickListenerC11013a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C11039c f12415a;

        public ViewOnClickListenerC11013a(C11039c c11039c) {
            this.f12415a = c11039c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.a1(this.f12415a.m14567e(MaterialCalendar.this.X0().n2() - 1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class RunnableC11014b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f12417a;

        public RunnableC11014b(int i) {
            this.f12417a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f12412s.B1(this.f12417a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C11015c extends db {
        public C11015c() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.q0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public class C11016d extends qwf {
        public final /* synthetic */ int w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11016d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.w0 = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Z1(RecyclerView.C2389z c2389z, int[] iArr) {
            if (this.w0 == 0) {
                iArr[0] = MaterialCalendar.this.f12412s.getWidth();
                iArr[1] = MaterialCalendar.this.f12412s.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f12412s.getHeight();
                iArr[1] = MaterialCalendar.this.f12412s.getHeight();
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    public class C11017e implements InterfaceC11025m {
        public C11017e() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.InterfaceC11025m
        /* renamed from: a */
        public void mo14488a(long j) {
            if (MaterialCalendar.this.f12406d.m14452g().L0(j)) {
                MaterialCalendar.this.f12405c.i3(j);
                Iterator it = MaterialCalendar.this.f12488a.iterator();
                while (it.hasNext()) {
                    ((gcc) it.next()).mo14495b(MaterialCalendar.this.f12405c.Q2());
                }
                MaterialCalendar.this.f12412s.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f12411q != null) {
                    MaterialCalendar.this.f12411q.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    public class C11018f extends db {
        public C11018f() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.P0(false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    public class C11019g extends RecyclerView.AbstractC2378o {

        /* renamed from: a */
        public final Calendar f12422a = gqi.m29327m();

        /* renamed from: b */
        public final Calendar f12423b = gqi.m29327m();

        public C11019g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
        /* renamed from: i */
        public void mo9228i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
            if ((recyclerView.getAdapter() instanceof C11040d) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C11040d c11040d = (C11040d) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (iwc iwcVar : MaterialCalendar.this.f12405c.G1()) {
                    Object obj = iwcVar.f29291a;
                    if (obj != null && iwcVar.f29292b != null) {
                        this.f12422a.setTimeInMillis(((Long) obj).longValue());
                        this.f12423b.setTimeInMillis(((Long) iwcVar.f29292b).longValue());
                        int iM14574f = c11040d.m14574f(this.f12422a.get(1));
                        int iM14574f2 = c11040d.m14574f(this.f12423b.get(1));
                        View viewMo9033S = gridLayoutManager.mo9033S(iM14574f);
                        View viewMo9033S2 = gridLayoutManager.mo9033S(iM14574f2);
                        int iI3 = iM14574f / gridLayoutManager.i3();
                        int iI32 = iM14574f2 / gridLayoutManager.i3();
                        int i = iI3;
                        while (i <= iI32) {
                            if (gridLayoutManager.mo9033S(gridLayoutManager.i3() * i) != null) {
                                canvas.drawRect((i != iI3 || viewMo9033S == null) ? 0 : viewMo9033S.getLeft() + (viewMo9033S.getWidth() / 2), r9.getTop() + MaterialCalendar.this.f12410h.f57589d.m47129c(), (i != iI32 || viewMo9033S2 == null) ? recyclerView.getWidth() : viewMo9033S2.getLeft() + (viewMo9033S2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.f12410h.f57589d.m47128b(), MaterialCalendar.this.f12410h.f57593h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    public class C11020h extends db {
        public C11020h() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.B0(MaterialCalendar.this.f12403L.getVisibility() == 0 ? MaterialCalendar.this.getString(v9e.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(v9e.mtrl_picker_toggle_to_day_selection));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    public class C11021i extends RecyclerView.AbstractC2383t {

        /* renamed from: a */
        public final /* synthetic */ C11039c f12426a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f12427b;

        public C11021i(C11039c c11039c, MaterialButton materialButton) {
            this.f12426a = c11039c;
            this.f12427b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: a */
        public void mo9260a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f12427b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            int iL2 = i < 0 ? MaterialCalendar.this.X0().l2() : MaterialCalendar.this.X0().n2();
            Month monthM14567e = this.f12426a.m14567e(iL2);
            MaterialCalendar.this.f12408f = monthM14567e;
            this.f12427b.setText(this.f12426a.m14568f(iL2));
            MaterialCalendar.this.e1(this.f12426a.m14569g(monthM14567e));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    public class ViewOnClickListenerC11022j implements View.OnClickListener {
        public ViewOnClickListenerC11022j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.d1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    public class ViewOnClickListenerC11023k implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C11039c f12430a;

        public ViewOnClickListenerC11023k(C11039c c11039c) {
            this.f12430a = c11039c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.a1(this.f12430a.m14567e(MaterialCalendar.this.X0().l2() + 1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$l */
    public enum EnumC11024l {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$m */
    public interface InterfaceC11025m {
        /* renamed from: a */
        void mo14488a(long j);
    }

    public static int V0(Context context) {
        return context.getResources().getDimensionPixelSize(x6e.mtrl_calendar_day_height);
    }

    public static int W0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(x6e.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(x6e.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(x6e.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(x6e.mtrl_calendar_days_of_week_height);
        int i = C11038b.f12519g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(x6e.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(x6e.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(x6e.mtrl_calendar_bottom_padding);
    }

    public static MaterialCalendar Y0(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m14456k());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean F0(gcc gccVar) {
        return super.F0(gccVar);
    }

    public final void P0(View view, C11039c c11039c) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(n8e.month_navigation_fragment_toggle);
        materialButton.setTag(f12401Y);
        wvi.m0(materialButton, new C11020h());
        View viewFindViewById = view.findViewById(n8e.month_navigation_previous);
        this.f12413x = viewFindViewById;
        viewFindViewById.setTag(f12399Q);
        View viewFindViewById2 = view.findViewById(n8e.month_navigation_next);
        this.f12414y = viewFindViewById2;
        viewFindViewById2.setTag(f12400X);
        this.f12402H = view.findViewById(n8e.mtrl_calendar_year_selector_frame);
        this.f12403L = view.findViewById(n8e.mtrl_calendar_day_selector_frame);
        b1(EnumC11024l.DAY);
        materialButton.setText(this.f12408f.m14511m());
        this.f12412s.m9090l(new C11021i(c11039c, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC11022j());
        this.f12414y.setOnClickListener(new ViewOnClickListenerC11023k(c11039c));
        this.f12413x.setOnClickListener(new ViewOnClickListenerC11013a(c11039c));
        e1(c11039c.m14569g(this.f12408f));
    }

    public final RecyclerView.AbstractC2378o Q0() {
        return new C11019g();
    }

    public CalendarConstraints R0() {
        return this.f12406d;
    }

    public zs1 S0() {
        return this.f12410h;
    }

    public Month T0() {
        return this.f12408f;
    }

    public DateSelector U0() {
        return this.f12405c;
    }

    public LinearLayoutManager X0() {
        return (LinearLayoutManager) this.f12412s.getLayoutManager();
    }

    public final void Z0(int i) {
        this.f12412s.post(new RunnableC11014b(i));
    }

    public void a1(Month month) {
        C11039c c11039c = (C11039c) this.f12412s.getAdapter();
        int iM14569g = c11039c.m14569g(month);
        int iM14569g2 = iM14569g - c11039c.m14569g(this.f12408f);
        boolean z = Math.abs(iM14569g2) > 3;
        boolean z2 = iM14569g2 > 0;
        this.f12408f = month;
        if (z && z2) {
            this.f12412s.s1(iM14569g - 3);
            Z0(iM14569g);
        } else if (z) {
            this.f12412s.s1(iM14569g + 3);
            Z0(iM14569g);
        } else {
            Z0(iM14569g);
        }
        e1(iM14569g);
    }

    public void b1(EnumC11024l enumC11024l) {
        this.f12409g = enumC11024l;
        if (enumC11024l == EnumC11024l.YEAR) {
            this.f12411q.getLayoutManager().K1(((C11040d) this.f12411q.getAdapter()).m14574f(this.f12408f.f12483c));
            this.f12402H.setVisibility(0);
            this.f12403L.setVisibility(8);
            this.f12413x.setVisibility(8);
            this.f12414y.setVisibility(8);
            return;
        }
        if (enumC11024l == EnumC11024l.DAY) {
            this.f12402H.setVisibility(8);
            this.f12403L.setVisibility(0);
            this.f12413x.setVisibility(0);
            this.f12414y.setVisibility(0);
            a1(this.f12408f);
        }
    }

    public final void c1() {
        wvi.m0(this.f12412s, new C11018f());
    }

    public void d1() {
        EnumC11024l enumC11024l = this.f12409g;
        EnumC11024l enumC11024l2 = EnumC11024l.YEAR;
        if (enumC11024l == enumC11024l2) {
            b1(EnumC11024l.DAY);
            this.f12412s.announceForAccessibility(getString(v9e.mtrl_picker_toggled_to_day_selection));
        } else if (enumC11024l == EnumC11024l.DAY) {
            b1(enumC11024l2);
            this.f12411q.announceForAccessibility(getString(v9e.mtrl_picker_toggled_to_year_selection));
        }
    }

    public final void e1(int i) {
        this.f12414y.setEnabled(i + 1 < this.f12412s.getAdapter().getItemCount());
        this.f12413x.setEnabled(i - 1 >= 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f12404b = bundle.getInt("THEME_RES_ID_KEY");
        this.f12405c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f12406d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12407e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f12408f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f12404b);
        this.f12410h = new zs1(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthM14457l = this.f12406d.m14457l();
        if (MaterialDatePicker.Y0(contextThemeWrapper)) {
            i = n9e.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = n9e.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(W0(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(n8e.mtrl_calendar_days_of_week);
        wvi.m0(gridView, new C11015c());
        int iM14454i = this.f12406d.m14454i();
        gridView.setAdapter((ListAdapter) (iM14454i > 0 ? new f05(iM14454i) : new f05()));
        gridView.setNumColumns(monthM14457l.f12484d);
        gridView.setEnabled(false);
        this.f12412s = (RecyclerView) viewInflate.findViewById(n8e.mtrl_calendar_months);
        this.f12412s.setLayoutManager(new C11016d(getContext(), i2, false, i2));
        this.f12412s.setTag(f12398M);
        C11039c c11039c = new C11039c(contextThemeWrapper, this.f12405c, this.f12406d, this.f12407e, new C11017e());
        this.f12412s.setAdapter(c11039c);
        int integer = contextThemeWrapper.getResources().getInteger(b9e.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(n8e.mtrl_calendar_year_selector_frame);
        this.f12411q = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f12411q.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f12411q.setAdapter(new C11040d(this));
            this.f12411q.m9086h(Q0());
        }
        if (viewInflate.findViewById(n8e.month_navigation_fragment_toggle) != null) {
            P0(viewInflate, c11039c);
        }
        if (!MaterialDatePicker.Y0(contextThemeWrapper)) {
            new C2409o().mo9681b(this.f12412s);
        }
        this.f12412s.s1(c11039c.m14569g(this.f12408f));
        c1();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f12404b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f12405c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12406d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f12407e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12408f);
    }
}
