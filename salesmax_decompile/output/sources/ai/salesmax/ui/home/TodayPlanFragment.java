package ai.salesmax.ui.home;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import ai.salesmax.ui.home.TodayPlanFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.fragment.AbstractC2338a;
import androidx.recyclerview.widget.RecyclerView;
import p001o.am7;
import p001o.ck6;
import p001o.hae;
import p001o.iuf;
import p001o.j0f;
import p001o.kf9;
import p001o.l2h;
import p001o.n9c;
import p001o.p9e;
import p001o.pz7;
import p001o.q5g;
import p001o.sq8;
import p001o.tl7;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes.dex */
public final class TodayPlanFragment extends Fragment {

    /* renamed from: a */
    public l2h f2243a;

    /* renamed from: b */
    public pz7 f2244b;

    /* renamed from: c */
    public boolean f2245c = true;

    /* renamed from: d */
    public boolean f2246d = true;

    /* renamed from: ai.salesmax.ui.home.TodayPlanFragment$a */
    public static final class C0821a extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.home.TodayPlanFragment$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f2248a;

            static {
                int[] iArr = new int[q5g.values().length];
                try {
                    iArr[q5g.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q5g.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q5g.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2248a = iArr;
            }
        }

        public C0821a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1775a(yne yneVar) {
            if (yneVar != null) {
                TodayPlanFragment todayPlanFragment = TodayPlanFragment.this;
                int i = a.f2248a[yneVar.m58025c().ordinal()];
                if (i == 1) {
                    if (yneVar.m58023a() != null) {
                        todayPlanFragment.S0((PaginatedDataModel) yneVar.m58023a());
                    }
                } else if (i == 2) {
                    todayPlanFragment.M0().r0.m13584d();
                    todayPlanFragment.M0().r0.setVisibility(8);
                } else {
                    if (i != 3) {
                        return;
                    }
                    todayPlanFragment.M0().r0.m13583c();
                    todayPlanFragment.M0().r0.setVisibility(0);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1775a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.home.TodayPlanFragment$b */
    public static final class C0822b implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f2249a;

        public C0822b(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f2249a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f2249a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f2249a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.home.TodayPlanFragment$c */
    public static final class C0823c extends iuf {

        /* renamed from: g */
        public final /* synthetic */ PaginatedDataModel f2250g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0823c(PaginatedDataModel paginatedDataModel, C0824d c0824d) {
            super(c0824d, null, false, null, 14, null);
            this.f2250g = paginatedDataModel;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_tasks;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = this.f2250g.get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f2250g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.home.TodayPlanFragment$d */
    public static final class C0824d implements ck6 {
        public C0824d() {
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            if (obj != null) {
                Bundle bundle = new Bundle();
                bundle.putString(TodayPlanFragment.this.getString(hae.argumentEngagementID), ((Tasks) obj).getId());
                TodayPlanFragment todayPlanFragment = TodayPlanFragment.this;
                todayPlanFragment.Q0(AbstractC2338a.m8705a(todayPlanFragment), z8e.todayPlan, z8e.action_today_plan_to_taskDetails, bundle);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    public static final void P0(TodayPlanFragment todayPlanFragment, View view) {
        sq8.m48649h(todayPlanFragment, "this$0");
        AbstractC2338a.m8705a(todayPlanFragment).f0();
    }

    public static final void R0(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public static final void T0(final TodayPlanFragment todayPlanFragment, final C0823c c0823c, final ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(todayPlanFragment, "this$0");
        sq8.m48649h(c0823c, "$adapter");
        j0f.m33008i(new Runnable() { // from class: o.knh
            @Override // java.lang.Runnable
            public final void run() {
                TodayPlanFragment.U0(this.f32487a, c0823c, resultsChangedEvent);
            }
        });
    }

    public static final void U0(TodayPlanFragment todayPlanFragment, C0823c c0823c, ResultsChangedEvent resultsChangedEvent) {
        sq8.m48649h(todayPlanFragment, "this$0");
        sq8.m48649h(c0823c, "$adapter");
        if (todayPlanFragment.f2245c) {
            todayPlanFragment.M0().r0.m13584d();
            todayPlanFragment.M0().r0.setVisibility(8);
            todayPlanFragment.M0().q0.setAdapter(c0823c);
        }
        todayPlanFragment.f2245c = false;
        RecyclerView.AbstractC2371h adapter = todayPlanFragment.M0().q0.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeInserted(resultsChangedEvent.start(), resultsChangedEvent.count());
        }
    }

    public final void L0() {
        if (this.f2245c) {
            N0();
        }
    }

    public final l2h M0() {
        l2h l2hVar = this.f2243a;
        sq8.m48646e(l2hVar);
        return l2hVar;
    }

    public final void N0() {
        boolean z = this.f2246d;
        pz7.l0(O0(), null, 1, null).observe(getViewLifecycleOwner(), new C0822b(new C0821a()));
    }

    public final pz7 O0() {
        pz7 pz7Var = this.f2244b;
        if (pz7Var != null) {
            return pz7Var;
        }
        sq8.m48667z("viewModel");
        return null;
    }

    public final void Q0(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.jnh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TodayPlanFragment.R0(abstractC2333d, i2, bundle);
                    }
                });
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Navigation failed: ");
                sb.append(message);
            }
        }
    }

    public final void S0(PaginatedDataModel paginatedDataModel) {
        final C0823c c0823c = new C0823c(paginatedDataModel, new C0824d());
        paginatedDataModel.addResultsChangedListener(getViewLifecycleOwner(), new ResultsChangeListener() { // from class: o.inh
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                TodayPlanFragment.T0(this.f29013a, c0823c, resultsChangedEvent);
            }
        });
    }

    public final void V0(pz7 pz7Var) {
        sq8.m48649h(pz7Var, "<set-?>");
        this.f2244b = pz7Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        this.f2246d = requireArguments().getBoolean(getString(hae.argumentIsMyDashBoard), true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            V0((pz7) new b0(fragmentActivityRequireActivity).m6505a(pz7.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f2243a == null) {
            l2h l2hVarH0 = l2h.h0(layoutInflater, viewGroup, false);
            l2hVarH0.j0(true);
            this.f2245c = true;
            l2hVarH0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.hnh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TodayPlanFragment.P0(this.f27226a, view);
                }
            });
            l2hVarH0.o0.setText(getString(hae.today_s_plan));
            this.f2243a = l2hVarH0;
        }
        View viewM25689B = M0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f2243a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        L0();
    }
}
