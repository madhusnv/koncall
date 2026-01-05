package com.google.android.material.datepicker;

import a1.C0005d;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.v0;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import y7.C8588w;
import y7.w0;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C1350n<S> extends AbstractC1358v {

    /* renamed from: b */
    public int f6872b;

    /* renamed from: c */
    public C1338b f6873c;

    /* renamed from: d */
    public C1353q f6874d;

    /* renamed from: e */
    public a f6875e;

    /* renamed from: f */
    public C0005d f6876f;

    /* renamed from: g */
    public RecyclerView f6877g;

    /* renamed from: h */
    public RecyclerView f6878h;

    /* renamed from: j */
    public View f6879j;

    /* renamed from: k */
    public View f6880k;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.google.android.material.datepicker.n$a */
    public enum a {
        DAY,
        YEAR
    }

    /* renamed from: i */
    public final void m4097i(C1353q c1353q) {
        C1357u c1357u = (C1357u) this.f6878h.getAdapter();
        int iM4106f = c1357u.f6912d.f6839a.m4106f(c1353q);
        int iM4106f2 = iM4106f - c1357u.f6912d.f6839a.m4106f(this.f6874d);
        boolean z6 = Math.abs(iM4106f2) > 3;
        boolean z10 = iM4106f2 > 0;
        this.f6874d = c1353q;
        if (z6 && z10) {
            this.f6878h.m1340X(iM4106f - 3);
            this.f6878h.post(new RunnableC1342f(this, iM4106f, 0));
        } else if (!z6) {
            this.f6878h.post(new RunnableC1342f(this, iM4106f, 0));
        } else {
            this.f6878h.m1340X(iM4106f + 3);
            this.f6878h.post(new RunnableC1342f(this, iM4106f, 0));
        }
    }

    /* renamed from: j */
    public final void m4098j(a aVar) {
        this.f6875e = aVar;
        if (aVar == a.YEAR) {
            this.f6877g.getLayoutManager().i0(this.f6874d.f6898c - ((a0) this.f6877g.getAdapter()).f6838c.f6873c.f6839a.f6898c);
            this.f6879j.setVisibility(0);
            this.f6880k.setVisibility(8);
            return;
        }
        if (aVar == a.DAY) {
            this.f6879j.setVisibility(8);
            this.f6880k.setVisibility(0);
            m4097i(this.f6874d);
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6872b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6873c = (C1338b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6874d = (C1353q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        C8588w c8588w;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f6872b);
        this.f6876f = new C0005d(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C1353q c1353q = this.f6873c.f6839a;
        if (C1351o.m4100n(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.websoptimization.callyzerbiz.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.websoptimization.callyzerbiz.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.mtrl_calendar_days_of_week);
        v0.m2528j(gridView, new C1343g(0));
        gridView.setAdapter((ListAdapter) new C1341e());
        gridView.setNumColumns(c1353q.f6899d);
        gridView.setEnabled(false);
        this.f6878h = (RecyclerView) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.mtrl_calendar_months);
        getContext();
        this.f6878h.setLayoutManager(new C1344h(this, i11, i11));
        this.f6878h.setTag("MONTHS_VIEW_GROUP_TAG");
        C1357u c1357u = new C1357u(contextThemeWrapper, this.f6873c, new C8989c(7, this));
        this.f6878h.setAdapter(c1357u);
        int integer = contextThemeWrapper.getResources().getInteger(com.websoptimization.callyzerbiz.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.mtrl_calendar_year_selector_frame);
        this.f6877g = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f6877g.setLayoutManager(new GridLayoutManager(integer));
            this.f6877g.setAdapter(new a0(this));
            RecyclerView recyclerView4 = this.f6877g;
            C1345i c1345i = new C1345i();
            AbstractC1361y.m4113c(null);
            AbstractC1361y.m4113c(null);
            recyclerView4.m1344f(c1345i);
        }
        if (viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            v0.m2528j(materialButton, new C1346j(0, this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f6879j = viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.mtrl_calendar_year_selector_frame);
            this.f6880k = viewInflate.findViewById(com.websoptimization.callyzerbiz.R.id.mtrl_calendar_day_selector_frame);
            m4098j(a.DAY);
            materialButton.setText(this.f6874d.m4105e(viewInflate.getContext()));
            this.f6878h.m1345g(new C1347k(this, c1357u, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC1348l(0, this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC1349m(this, c1357u, 0));
            materialButton2.setOnClickListener(new ViewOnClickListenerC1349m(this, c1357u, 1));
        }
        if (!C1351o.m4100n(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c8588w = new C8588w()).f41818a) != (recyclerView = this.f6878h)) {
            w0 w0Var = c8588w.f41819b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f43701k1;
                if (arrayList != null) {
                    arrayList.remove(w0Var);
                }
                c8588w.f41818a.setOnFlingListener(null);
            }
            c8588w.f41818a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c8588w.f41818a.m1345g(w0Var);
                c8588w.f41818a.setOnFlingListener(c8588w);
                new Scroller(c8588w.f41818a.getContext(), new DecelerateInterpolator());
                c8588w.m15945f();
            }
        }
        this.f6878h.m1340X(c1357u.f6912d.f6839a.m4106f(this.f6874d));
        return viewInflate;
    }

    @Override // androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6872b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6873c);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6874d);
    }
}
