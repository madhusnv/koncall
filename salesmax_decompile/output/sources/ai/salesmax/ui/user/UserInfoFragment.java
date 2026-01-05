package ai.salesmax.ui.user;

import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.ui.user.UserInfoFragment;
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
import java.util.List;
import p001o.am7;
import p001o.ck6;
import p001o.dj7;
import p001o.hae;
import p001o.id5;
import p001o.idh;
import p001o.iuf;
import p001o.j0f;
import p001o.kf9;
import p001o.n9c;
import p001o.p9e;
import p001o.q5g;
import p001o.spi;
import p001o.sq8;
import p001o.tl7;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes2.dex */
public final class UserInfoFragment extends Fragment {

    /* renamed from: f */
    public static final C1656a f4855f = new C1656a(null);

    /* renamed from: g */
    public static final int f4856g = 8;

    /* renamed from: a */
    public LeadsUser f4857a;

    /* renamed from: b */
    public String f4858b;

    /* renamed from: c */
    public spi f4859c;

    /* renamed from: d */
    public idh f4860d;

    /* renamed from: e */
    public dj7 f4861e;

    /* renamed from: ai.salesmax.ui.user.UserInfoFragment$a */
    public static final class C1656a {
        public C1656a() {
        }

        public /* synthetic */ C1656a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final UserInfoFragment m3205a(String str) {
            UserInfoFragment userInfoFragment = new UserInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("USER_ARGUMENT", str);
            userInfoFragment.setArguments(bundle);
            return userInfoFragment;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserInfoFragment$b */
    public static final class C1657b extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.user.UserInfoFragment$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4863a;

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
                f4863a = iArr;
            }
        }

        public C1657b() {
            super(1);
        }

        /* renamed from: a */
        public final void m3206a(yne yneVar) {
            if (yneVar != null) {
                UserInfoFragment userInfoFragment = UserInfoFragment.this;
                if (a.f4863a[yneVar.m58025c().ordinal()] == 1 && yneVar.m58023a() != null) {
                    userInfoFragment.N0((List) yneVar.m58023a());
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3206a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserInfoFragment$c */
    public static final class C1658c implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4864a;

        public C1658c(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4864a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4864a;
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
            this.f4864a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserInfoFragment$d */
    public static final class C1659d extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f4865g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1659d(List list, C1660e c1660e) {
            super(c1660e, null, false, null, 14, null);
            this.f4865g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_team_membership;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f4865g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f4865g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.user.UserInfoFragment$e */
    public static final class C1660e implements ck6 {
        public C1660e() {
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
            if (obj != null && view.getId() == z8e.itemLeadRoot && (obj instanceof LeadTeamMember)) {
                Bundle bundle = new Bundle();
                bundle.putString(UserInfoFragment.this.getString(hae.argumentTeam), ((LeadTeamMember) obj).getTeamID());
                UserInfoFragment userInfoFragment = UserInfoFragment.this;
                userInfoFragment.L0(AbstractC2338a.m8705a(userInfoFragment), z8e.userDetails, z8e.action_userDetail_to_teamDetails, bundle);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    public static /* synthetic */ void K0(UserInfoFragment userInfoFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        userInfoFragment.J0(z);
    }

    public static final void M0(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public final dj7 H0() {
        dj7 dj7Var = this.f4861e;
        sq8.m48646e(dj7Var);
        return dj7Var;
    }

    public final void I0() {
        idh idhVar = this.f4860d;
        String str = null;
        if (idhVar == null) {
            sq8.m48667z("teamViewModel");
            idhVar = null;
        }
        String str2 = this.f4858b;
        if (str2 == null) {
            sq8.m48667z("userId");
        } else {
            str = str2;
        }
        idhVar.m31955t(str).observe(getViewLifecycleOwner(), new C1658c(new C1657b()));
    }

    public final void J0(boolean z) {
        H0().j0(this.f4857a);
        I0();
    }

    public final void L0(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.mei
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserInfoFragment.M0(abstractC2333d, i2, bundle);
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

    public final void N0(List list) {
        H0().n0.setAdapter(new C1659d(list, new C1660e()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f4858b = String.valueOf(requireArguments().getString("USER_ARGUMENT"));
        }
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f4859c = (spi) new b0(fragmentActivityRequireActivity).m6505a(spi.class);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity2, "requireActivity(...)");
            this.f4860d = (idh) new b0(fragmentActivityRequireActivity2).m6505a(idh.class);
            spi spiVar = this.f4859c;
            String str = null;
            if (spiVar == null) {
                sq8.m48667z("viewModel");
                spiVar = null;
            }
            String str2 = this.f4858b;
            if (str2 == null) {
                sq8.m48667z("userId");
            } else {
                str = str2;
            }
            this.f4857a = spiVar.m48621j(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4861e == null) {
            this.f4861e = dj7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = H0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f4861e = null;
    }
}
