package ai.salesmax.ui.user;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.ui.user.TeamActivityFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import p001o.am7;
import p001o.ck6;
import p001o.id5;
import p001o.iuf;
import p001o.ji7;
import p001o.kf9;
import p001o.kh3;
import p001o.n9c;
import p001o.nz7;
import p001o.p9e;
import p001o.pz7;
import p001o.q5g;
import p001o.sq8;
import p001o.tl7;
import p001o.wi0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;

/* loaded from: classes2.dex */
public final class TeamActivityFragment extends Fragment {

    /* renamed from: f */
    public static final C1595a f4672f = new C1595a(null);

    /* renamed from: g */
    public static final int f4673g = 8;

    /* renamed from: a */
    public LeadsTeam f4674a;

    /* renamed from: b */
    public String f4675b;

    /* renamed from: c */
    public pz7 f4676c;

    /* renamed from: d */
    public ji7 f4677d;

    /* renamed from: e */
    public nz7 f4678e;

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$a */
    public static final class C1595a {
        public C1595a() {
        }

        public /* synthetic */ C1595a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final TeamActivityFragment m3129a(String str) {
            TeamActivityFragment teamActivityFragment = new TeamActivityFragment();
            Bundle bundle = new Bundle();
            bundle.putString("TEAM_ARGUMENT", str);
            teamActivityFragment.setArguments(bundle);
            return teamActivityFragment;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$b */
    public static final class C1596b extends kf9 implements xk7 {
        public C1596b() {
            super(1);
        }

        /* renamed from: a */
        public final void m3130a(nz7 nz7Var) {
            sq8.m48649h(nz7Var, "it");
            nz7Var.m41311i().removeObservers(TeamActivityFragment.this.getViewLifecycleOwner());
            nz7Var.m41309g();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3130a((nz7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$c */
    public static final class C1597c extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ ActivityMetrics.Period f4681b;

        /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4682a;

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
                f4682a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1597c(ActivityMetrics.Period period) {
            super(1);
            this.f4681b = period;
        }

        /* renamed from: a */
        public final void m3131a(yne yneVar) {
            if (yneVar != null) {
                TeamActivityFragment teamActivityFragment = TeamActivityFragment.this;
                ActivityMetrics.Period period = this.f4681b;
                if (a.f4682a[yneVar.m58025c().ordinal()] == 1 && yneVar.m58023a() != null) {
                    teamActivityFragment.O0().j0(period);
                    teamActivityFragment.V0((nz7) yneVar.m58023a());
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3131a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$d */
    public static final class C1598d implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4683a;

        public C1598d(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4683a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4683a;
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
            this.f4683a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$e */
    public static final class C1599e extends iuf {

        /* renamed from: g */
        public final /* synthetic */ Object f4684g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1599e(Object obj, C1600f c1600f) {
            super(c1600f, null, false, null, 14, null);
            this.f4684g = obj;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_home_activity;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = ((ArrayList) this.f4684g).get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((ArrayList) this.f4684g).size();
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$f */
    public static final class C1600f implements ck6 {
        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$g */
    public static final class C1601g extends kf9 implements xk7 {
        public C1601g() {
            super(1);
        }

        /* renamed from: a */
        public final void m3132a(nz7 nz7Var) {
            sq8.m48649h(nz7Var, "it");
            nz7Var.m41311i().removeObservers(TeamActivityFragment.this.getViewLifecycleOwner());
            nz7Var.m41309g();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3132a((nz7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamActivityFragment$h */
    public static final class C1602h extends kf9 implements xk7 {
        public C1602h() {
            super(1);
        }

        /* renamed from: a */
        public final void m3133a(HomeTasksStatus homeTasksStatus) {
            TeamActivityFragment teamActivityFragment = TeamActivityFragment.this;
            teamActivityFragment.U0(teamActivityFragment.O0().r0, kh3.x0(kh3.x0(kh3.x0(homeTasksStatus.getCalls(), homeTasksStatus.getUniqueCalls()), homeTasksStatus.getVisits()), homeTasksStatus.getActivities()));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3133a((HomeTasksStatus) obj);
            return y3i.f54824a;
        }
    }

    public static final void N0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void R0(TeamActivityFragment teamActivityFragment, View view) {
        sq8.m48649h(teamActivityFragment, "this$0");
        String str = teamActivityFragment.f4675b;
        if (str == null) {
            sq8.m48667z("teamId");
            str = null;
        }
        teamActivityFragment.P0(str, ActivityMetrics.Period.DAY);
    }

    public static final void S0(TeamActivityFragment teamActivityFragment, View view) {
        sq8.m48649h(teamActivityFragment, "this$0");
        String str = teamActivityFragment.f4675b;
        if (str == null) {
            sq8.m48667z("teamId");
            str = null;
        }
        teamActivityFragment.P0(str, ActivityMetrics.Period.WEEK);
    }

    public static final void T0(TeamActivityFragment teamActivityFragment, View view) {
        sq8.m48649h(teamActivityFragment, "this$0");
        String str = teamActivityFragment.f4675b;
        if (str == null) {
            sq8.m48667z("teamId");
            str = null;
        }
        teamActivityFragment.P0(str, ActivityMetrics.Period.MONTH);
    }

    public static final void W0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public final void M0() {
        Optional optionalOfNullable = Optional.ofNullable(this.f4678e);
        final C1596b c1596b = new C1596b();
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.b3h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TeamActivityFragment.N0(c1596b, obj);
            }
        });
        this.f4678e = null;
    }

    public final ji7 O0() {
        ji7 ji7Var = this.f4677d;
        sq8.m48646e(ji7Var);
        return ji7Var;
    }

    public final void P0(String str, ActivityMetrics.Period period) {
        pz7 pz7Var = this.f4676c;
        if (pz7Var == null) {
            sq8.m48667z("viewModel");
            pz7Var = null;
        }
        pz7Var.q0(str, period).observe(getViewLifecycleOwner(), new C1598d(new C1597c(period)));
    }

    public final void Q0(boolean z) {
        String str = this.f4675b;
        if (str == null) {
            sq8.m48667z("teamId");
            str = null;
        }
        P0(str, ActivityMetrics.Period.DAY);
    }

    public final void U0(RecyclerView recyclerView, Object obj) {
        if (recyclerView == null || obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        recyclerView.setAdapter(new C1599e(obj, new C1600f()));
    }

    public final void V0(nz7 nz7Var) {
        Optional optionalOfNullable = Optional.ofNullable(this.f4678e);
        final C1601g c1601g = new C1601g();
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.c3h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TeamActivityFragment.W0(c1601g, obj);
            }
        });
        this.f4678e = nz7Var;
        if (nz7Var != null) {
            nz7Var.m41311i().observe(getViewLifecycleOwner(), new C1598d(new C1602h()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f4675b = String.valueOf(requireArguments().getString("TEAM_ARGUMENT"));
        }
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f4676c = (pz7) new b0(fragmentActivityRequireActivity).m6505a(pz7.class);
            String str = this.f4675b;
            if (str == null) {
                sq8.m48667z("teamId");
                str = null;
            }
            this.f4674a = wi0.n0(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4677d == null) {
            this.f4677d = ji7.h0(layoutInflater, viewGroup, false);
        }
        return O0().m25689B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        M0();
        if (this.f4677d != null) {
            O0().r0.setAdapter(null);
        }
        this.f4677d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        O0().o0.setOnClickListener(new View.OnClickListener() { // from class: o.d3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TeamActivityFragment.R0(this.f19078a, view2);
            }
        });
        O0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.e3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TeamActivityFragment.S0(this.f20936a, view2);
            }
        });
        O0().n0.setOnClickListener(new View.OnClickListener() { // from class: o.f3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TeamActivityFragment.T0(this.f22637a, view2);
            }
        });
    }
}
