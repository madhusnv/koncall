package ai.salesmax.ui.home;

import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrices;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.home.LeaderboardFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.AbstractC2338a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import p001o.am7;
import p001o.ck6;
import p001o.hae;
import p001o.hy9;
import p001o.iuf;
import p001o.kf9;
import p001o.n9c;
import p001o.p9e;
import p001o.pz7;
import p001o.q5g;
import p001o.rd9;
import p001o.sq8;
import p001o.tl7;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes.dex */
public final class LeaderboardFragment extends BaseFragment {

    /* renamed from: h */
    public hy9 f1571h;

    /* renamed from: q */
    public pz7 f1572q;

    /* renamed from: s */
    public String f1573s;

    /* renamed from: ai.salesmax.ui.home.LeaderboardFragment$a */
    public static final class C0624a extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.home.LeaderboardFragment$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1575a;

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
                f1575a = iArr;
            }
        }

        public C0624a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1410a(yne yneVar) {
            if (yneVar != null) {
                LeaderboardFragment leaderboardFragment = LeaderboardFragment.this;
                int i = a.f1575a[yneVar.m58025c().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        leaderboardFragment.v1().z0.m13584d();
                        leaderboardFragment.v1().z0.setVisibility(8);
                        return;
                    } else {
                        if (i != 3) {
                            return;
                        }
                        leaderboardFragment.v1().z0.m13583c();
                        return;
                    }
                }
                if (yneVar.m58023a() != null) {
                    Collection<LeaderboardActivityMetrics> leaderboards = ((LeaderboardActivityMetrices) yneVar.m58023a()).getLeaderboards();
                    sq8.m48646e(leaderboards);
                    Object objCollect = leaderboards.stream().collect(Collectors.toList());
                    sq8.m48647f(objCollect, "null cannot be cast to non-null type java.util.ArrayList<@[EnhancedNullability] @[FlexibleNullability] ai.salesmax.services.model.LeaderboardActivityMetrics?>");
                    leaderboardFragment.D1((ArrayList) objCollect);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1410a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.home.LeaderboardFragment$b */
    public static final class C0625b implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f1576a;

        public C0625b(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f1576a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f1576a;
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
            this.f1576a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.home.LeaderboardFragment$c */
    public static final class C0626c extends iuf {

        /* renamed from: g */
        public final /* synthetic */ ArrayList f1577g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0626c(ArrayList arrayList, C0627d c0627d) {
            super(c0627d, null, false, null, 14, null);
            this.f1577g = arrayList;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_performer;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = this.f1577g.get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f1577g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.home.LeaderboardFragment$d */
    public static final class C0627d implements ck6 {
        public C0627d() {
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
            if (obj instanceof LeaderboardActivityMetrics) {
                Bundle bundle = new Bundle();
                bundle.putString(LeaderboardFragment.this.getString(hae.argumentUser), ((LeaderboardActivityMetrics) obj).getLeadUser().getId());
                if (LeaderboardFragment.this.getContext() != null) {
                    Context contextRequireContext = LeaderboardFragment.this.requireContext();
                    sq8.m48648g(contextRequireContext, "requireContext(...)");
                    rd9.m46558b(contextRequireContext);
                }
                LeaderboardFragment leaderboardFragment = LeaderboardFragment.this;
                leaderboardFragment.d1(AbstractC2338a.m8705a(leaderboardFragment), z8e.leaderboard, z8e.action_leaderboard_to_userDetails, bundle);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    public static final void A1(LeaderboardFragment leaderboardFragment, View view) {
        sq8.m48649h(leaderboardFragment, "this$0");
        leaderboardFragment.B1(ActivityMetrics.Period.MONTH);
    }

    public static /* synthetic */ void C1(LeaderboardFragment leaderboardFragment, ActivityMetrics.Period period, int i, Object obj) {
        if ((i & 1) != 0) {
            period = ActivityMetrics.Period.DAY;
        }
        leaderboardFragment.B1(period);
    }

    public static final void x1(LeaderboardFragment leaderboardFragment, View view) {
        sq8.m48649h(leaderboardFragment, "this$0");
        AbstractC2338a.m8705a(leaderboardFragment).f0();
    }

    public static final void y1(LeaderboardFragment leaderboardFragment, View view) {
        sq8.m48649h(leaderboardFragment, "this$0");
        leaderboardFragment.B1(ActivityMetrics.Period.DAY);
    }

    public static final void z1(LeaderboardFragment leaderboardFragment, View view) {
        sq8.m48649h(leaderboardFragment, "this$0");
        leaderboardFragment.B1(ActivityMetrics.Period.WEEK);
    }

    public final void B1(ActivityMetrics.Period period) {
        pz7 pz7Var = this.f1572q;
        if (pz7Var == null) {
            sq8.m48667z("viewModel");
            pz7Var = null;
        }
        pz7Var.t0(this.f1573s, period).observe(getViewLifecycleOwner(), new C0625b(new C0624a()));
    }

    public final void D1(ArrayList arrayList) {
        C0626c c0626c = new C0626c(arrayList, new C0627d());
        v1().y0.setItemAnimator(null);
        v1().y0.setAdapter(c0626c);
        v1().z0.m13584d();
        v1().z0.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        if (getArguments() != null) {
            this.f1573s = requireArguments().getString(getString(hae.argumentLeaderboardID), null);
        }
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f1572q = (pz7) new b0(fragmentActivityRequireActivity).m6505a(pz7.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f1571h == null) {
            hy9 hy9VarH0 = hy9.h0(layoutInflater, viewGroup, false);
            hy9VarH0.u0.setOnClickListener(new View.OnClickListener() { // from class: o.dy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeaderboardFragment.x1(this.f20645a, view);
                }
            });
            hy9VarH0.v0.setText(getString(hae.leaderboard));
            hy9VarH0.o0.setOnClickListener(new View.OnClickListener() { // from class: o.ey9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeaderboardFragment.y1(this.f22394a, view);
                }
            });
            hy9VarH0.p0.setOnClickListener(new View.OnClickListener() { // from class: o.fy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeaderboardFragment.z1(this.f24255a, view);
                }
            });
            hy9VarH0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.gy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeaderboardFragment.A1(this.f25941a, view);
                }
            });
            this.f1571h = hy9VarH0;
        }
        View viewM25689B = v1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f1571h = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        w1();
    }

    public final hy9 v1() {
        hy9 hy9Var = this.f1571h;
        sq8.m48646e(hy9Var);
        return hy9Var;
    }

    public final void w1() {
        C1(this, null, 1, null);
    }
}
