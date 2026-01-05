package ai.salesmax.ui.user;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.ui.user.UserActivityFragment;
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
import p001o.kf9;
import p001o.kh3;
import p001o.n9c;
import p001o.nz7;
import p001o.p9e;
import p001o.pz7;
import p001o.q5g;
import p001o.sq8;
import p001o.tl7;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.zi7;

/* loaded from: classes2.dex */
public final class UserActivityFragment extends Fragment {

    /* renamed from: f */
    public static final C1629a f4783f = new C1629a(null);

    /* renamed from: g */
    public static final int f4784g = 8;

    /* renamed from: a */
    public LeadsUser f4785a;

    /* renamed from: b */
    public String f4786b;

    /* renamed from: c */
    public pz7 f4787c;

    /* renamed from: d */
    public zi7 f4788d;

    /* renamed from: e */
    public nz7 f4789e;

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$a */
    public static final class C1629a {
        public C1629a() {
        }

        public /* synthetic */ C1629a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final UserActivityFragment m3164a(String str) {
            UserActivityFragment userActivityFragment = new UserActivityFragment();
            Bundle bundle = new Bundle();
            bundle.putString("USER_ARGUMENT", str);
            userActivityFragment.setArguments(bundle);
            return userActivityFragment;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$b */
    public static final class C1630b extends kf9 implements xk7 {
        public C1630b() {
            super(1);
        }

        /* renamed from: a */
        public final void m3165a(nz7 nz7Var) {
            sq8.m48649h(nz7Var, "it");
            nz7Var.m41311i().removeObservers(UserActivityFragment.this.getViewLifecycleOwner());
            nz7Var.m41309g();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3165a((nz7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$c */
    public static final class C1631c extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ ActivityMetrics.Period f4792b;

        /* renamed from: ai.salesmax.ui.user.UserActivityFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4793a;

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
                f4793a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1631c(ActivityMetrics.Period period) {
            super(1);
            this.f4792b = period;
        }

        /* renamed from: a */
        public final void m3166a(yne yneVar) {
            if (yneVar != null) {
                UserActivityFragment userActivityFragment = UserActivityFragment.this;
                ActivityMetrics.Period period = this.f4792b;
                if (a.f4793a[yneVar.m58025c().ordinal()] == 1 && yneVar.m58023a() != null) {
                    userActivityFragment.O0().j0(period);
                    userActivityFragment.V0((nz7) yneVar.m58023a());
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3166a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$d */
    public static final class C1632d implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4794a;

        public C1632d(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4794a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4794a;
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
            this.f4794a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$e */
    public static final class C1633e extends iuf {

        /* renamed from: g */
        public final /* synthetic */ Object f4795g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1633e(Object obj, C1634f c1634f) {
            super(c1634f, null, false, null, 14, null);
            this.f4795g = obj;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_home_activity;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            Object obj = ((ArrayList) this.f4795g).get(i);
            sq8.m48648g(obj, "get(...)");
            return obj;
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((ArrayList) this.f4795g).size();
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$f */
    public static final class C1634f implements ck6 {
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

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$g */
    public static final class C1635g extends kf9 implements xk7 {
        public C1635g() {
            super(1);
        }

        /* renamed from: a */
        public final void m3167a(nz7 nz7Var) {
            sq8.m48649h(nz7Var, "it");
            nz7Var.m41311i().removeObservers(UserActivityFragment.this.getViewLifecycleOwner());
            nz7Var.m41309g();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3167a((nz7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserActivityFragment$h */
    public static final class C1636h extends kf9 implements xk7 {
        public C1636h() {
            super(1);
        }

        /* renamed from: a */
        public final void m3168a(HomeTasksStatus homeTasksStatus) {
            UserActivityFragment userActivityFragment = UserActivityFragment.this;
            userActivityFragment.U0(userActivityFragment.O0().r0, kh3.x0(kh3.x0(kh3.x0(homeTasksStatus.getCalls(), homeTasksStatus.getUniqueCalls()), homeTasksStatus.getVisits()), homeTasksStatus.getActivities()));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3168a((HomeTasksStatus) obj);
            return y3i.f54824a;
        }
    }

    public static final void N0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void R0(UserActivityFragment userActivityFragment, View view) {
        sq8.m48649h(userActivityFragment, "this$0");
        String str = userActivityFragment.f4786b;
        if (str == null) {
            sq8.m48667z("userId");
            str = null;
        }
        userActivityFragment.P0(str, ActivityMetrics.Period.DAY);
    }

    public static final void S0(UserActivityFragment userActivityFragment, View view) {
        sq8.m48649h(userActivityFragment, "this$0");
        String str = userActivityFragment.f4786b;
        if (str == null) {
            sq8.m48667z("userId");
            str = null;
        }
        userActivityFragment.P0(str, ActivityMetrics.Period.WEEK);
    }

    public static final void T0(UserActivityFragment userActivityFragment, View view) {
        sq8.m48649h(userActivityFragment, "this$0");
        String str = userActivityFragment.f4786b;
        if (str == null) {
            sq8.m48667z("userId");
            str = null;
        }
        userActivityFragment.P0(str, ActivityMetrics.Period.MONTH);
    }

    public static final void W0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public final void M0() {
        Optional optionalOfNullable = Optional.ofNullable(this.f4789e);
        final C1630b c1630b = new C1630b();
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.z9i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                UserActivityFragment.N0(c1630b, obj);
            }
        });
        this.f4789e = null;
    }

    public final zi7 O0() {
        zi7 zi7Var = this.f4788d;
        sq8.m48646e(zi7Var);
        return zi7Var;
    }

    public final void P0(String str, ActivityMetrics.Period period) {
        pz7 pz7Var = this.f4787c;
        if (pz7Var == null) {
            sq8.m48667z("viewModel");
            pz7Var = null;
        }
        pz7Var.w0(str, period).observe(getViewLifecycleOwner(), new C1632d(new C1631c(period)));
    }

    public final void Q0(boolean z) {
        String str = this.f4786b;
        if (str == null) {
            sq8.m48667z("userId");
            str = null;
        }
        P0(str, ActivityMetrics.Period.DAY);
    }

    public final void U0(RecyclerView recyclerView, Object obj) {
        if (recyclerView == null || obj == null || !(obj instanceof ArrayList)) {
            return;
        }
        recyclerView.setAdapter(new C1633e(obj, new C1634f()));
    }

    public final void V0(nz7 nz7Var) {
        Optional optionalOfNullable = Optional.ofNullable(this.f4789e);
        final C1635g c1635g = new C1635g();
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.aai
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                UserActivityFragment.W0(c1635g, obj);
            }
        });
        this.f4789e = nz7Var;
        if (nz7Var != null) {
            nz7Var.m41311i().observe(getViewLifecycleOwner(), new C1632d(new C1636h()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f4786b = String.valueOf(requireArguments().getString("USER_ARGUMENT"));
        }
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            pz7 pz7Var = (pz7) new b0(fragmentActivityRequireActivity).m6505a(pz7.class);
            this.f4787c = pz7Var;
            String str = null;
            if (pz7Var == null) {
                sq8.m48667z("viewModel");
                pz7Var = null;
            }
            String str2 = this.f4786b;
            if (str2 == null) {
                sq8.m48667z("userId");
            } else {
                str = str2;
            }
            this.f4785a = pz7Var.x0(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4788d == null) {
            this.f4788d = zi7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = O0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        M0();
        if (this.f4788d != null) {
            O0().r0.setAdapter(null);
        }
        this.f4788d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        O0().o0.setOnClickListener(new View.OnClickListener() { // from class: o.w9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserActivityFragment.R0(this.f51667a, view2);
            }
        });
        O0().p0.setOnClickListener(new View.OnClickListener() { // from class: o.x9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserActivityFragment.S0(this.f53406a, view2);
            }
        });
        O0().n0.setOnClickListener(new View.OnClickListener() { // from class: o.y9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserActivityFragment.T0(this.f55122a, view2);
            }
        });
    }
}
