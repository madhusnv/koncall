package ai.salesmax.ui.user;

import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsTeam;
import ai.salesmax.ui.user.TeamInfoFragment;
import android.content.Context;
import android.content.DialogInterface;
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
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import p001o.am7;
import p001o.ck6;
import p001o.dh3;
import p001o.hae;
import p001o.id5;
import p001o.idh;
import p001o.iuf;
import p001o.j0f;
import p001o.jm7;
import p001o.kf9;
import p001o.n9c;
import p001o.nta;
import p001o.p9e;
import p001o.q5g;
import p001o.rog;
import p001o.sq8;
import p001o.ti7;
import p001o.tl7;
import p001o.wi0;
import p001o.xk7;
import p001o.y3i;
import p001o.yne;
import p001o.z8e;

/* loaded from: classes2.dex */
public final class TeamInfoFragment extends Fragment {

    /* renamed from: g */
    public static final C1609a f4706g = new C1609a(null);

    /* renamed from: h */
    public static final int f4707h = 8;

    /* renamed from: a */
    public LeadsTeam f4708a;

    /* renamed from: b */
    public String f4709b;

    /* renamed from: c */
    public idh f4710c;

    /* renamed from: d */
    public ti7 f4711d;

    /* renamed from: e */
    public AuthorizationLevel f4712e = wi0.m54445K();

    /* renamed from: f */
    public boolean f4713f = true;

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$a */
    public static final class C1609a {
        public C1609a() {
        }

        public /* synthetic */ C1609a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final TeamInfoFragment m3139a(String str) {
            TeamInfoFragment teamInfoFragment = new TeamInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("TEAM_ARGUMENT", str);
            teamInfoFragment.setArguments(bundle);
            return teamInfoFragment;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$b */
    public static final class C1610b extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4715a;

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
                f4715a = iArr;
            }
        }

        public C1610b() {
            super(1);
        }

        /* renamed from: d */
        public static final void m3142d(TeamInfoFragment teamInfoFragment) {
            sq8.m48649h(teamInfoFragment, "this$0");
            if (teamInfoFragment.getActivity() != null) {
                jm7.v0(teamInfoFragment.requireActivity(), "Team Member Removed Successfully", 0, 0, 12, null);
            }
        }

        /* renamed from: e */
        public static final void m3143e(TeamInfoFragment teamInfoFragment, yne yneVar) {
            sq8.m48649h(teamInfoFragment, "this$0");
            if (teamInfoFragment.getActivity() != null) {
                jm7.v0(teamInfoFragment.requireActivity(), yneVar.m58024b(), 0, 0, 12, null);
            }
        }

        /* renamed from: c */
        public final void m3144c(final yne yneVar) {
            if (yneVar != null) {
                final TeamInfoFragment teamInfoFragment = TeamInfoFragment.this;
                int i = a.f4715a[yneVar.m58025c().ordinal()];
                if (i == 1) {
                    j0f.m33008i(new Runnable() { // from class: o.yah
                        @Override // java.lang.Runnable
                        public final void run() {
                            TeamInfoFragment.C1610b.m3142d(teamInfoFragment);
                        }
                    });
                    teamInfoFragment.O0();
                } else {
                    if (i != 2) {
                        return;
                    }
                    j0f.m33008i(new Runnable() { // from class: o.zah
                        @Override // java.lang.Runnable
                        public final void run() {
                            TeamInfoFragment.C1610b.m3143e(teamInfoFragment, yneVar);
                        }
                    });
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3144c((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$c */
    public static final class C1611c extends kf9 implements xk7 {

        /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4717a;

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
                f4717a = iArr;
            }
        }

        public C1611c() {
            super(1);
        }

        /* renamed from: a */
        public final void m3145a(yne yneVar) {
            if (yneVar != null) {
                TeamInfoFragment teamInfoFragment = TeamInfoFragment.this;
                if (a.f4717a[yneVar.m58025c().ordinal()] != 1) {
                    return;
                }
                if (yneVar.m58023a() != null) {
                    teamInfoFragment.W0((List) yneVar.m58023a());
                } else {
                    teamInfoFragment.N0().k0(true);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3145a((yne) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$d */
    public static final class C1612d implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f4718a;

        public C1612d(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f4718a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f4718a;
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
            this.f4718a.invoke(obj);
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$e */
    public static final class C1613e extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f4719g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1613e(List list, C1614f c1614f, rog rogVar) {
            super(c1614f, null, false, rogVar, 6, null);
            this.f4719g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_team_membership_user_wise;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f4719g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f4719g.size();
        }
    }

    /* renamed from: ai.salesmax.ui.user.TeamInfoFragment$f */
    public static final class C1614f implements ck6 {
        public C1614f() {
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
            if (obj == null || !(obj instanceof LeadTeamMember)) {
                return;
            }
            int id = view.getId();
            if (id == z8e.itemLeadRoot) {
                Bundle bundle = new Bundle();
                bundle.putString(TeamInfoFragment.this.getString(hae.argumentUser), ((LeadTeamMember) obj).getUserId());
                TeamInfoFragment teamInfoFragment = TeamInfoFragment.this;
                teamInfoFragment.U0(AbstractC2338a.m8705a(teamInfoFragment), z8e.teamDetails, z8e.action_teamDetail_to_userDetail, bundle);
                return;
            }
            if (id == z8e.memberRemove) {
                TeamInfoFragment teamInfoFragment2 = TeamInfoFragment.this;
                Context contextRequireContext = teamInfoFragment2.requireContext();
                sq8.m48648g(contextRequireContext, "requireContext(...)");
                teamInfoFragment2.R0(contextRequireContext, (LeadTeamMember) obj);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    public static /* synthetic */ void Q0(TeamInfoFragment teamInfoFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        teamInfoFragment.P0(z);
    }

    public static final void S0(DialogInterface dialogInterface, int i) {
    }

    public static final void T0(TeamInfoFragment teamInfoFragment, LeadTeamMember leadTeamMember, DialogInterface dialogInterface, int i) {
        sq8.m48649h(teamInfoFragment, "this$0");
        sq8.m48649h(leadTeamMember, "$teamMember");
        teamInfoFragment.M0(leadTeamMember);
    }

    public static final void V0(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public final void M0(LeadTeamMember leadTeamMember) {
        idh idhVar = this.f4710c;
        if (idhVar == null) {
            sq8.m48667z("viewModel");
            idhVar = null;
        }
        idhVar.m31957v(leadTeamMember.getId()).observe(getViewLifecycleOwner(), new C1612d(new C1610b()));
    }

    public final ti7 N0() {
        ti7 ti7Var = this.f4711d;
        sq8.m48646e(ti7Var);
        return ti7Var;
    }

    public final void O0() {
        idh idhVar = this.f4710c;
        String str = null;
        if (idhVar == null) {
            sq8.m48667z("viewModel");
            idhVar = null;
        }
        String str2 = this.f4709b;
        if (str2 == null) {
            sq8.m48667z("teamId");
        } else {
            str = str2;
        }
        idhVar.m31956u(str).observe(getViewLifecycleOwner(), new C1612d(new C1611c()));
    }

    public final void P0(boolean z) {
        N0().j0(this.f4708a);
        O0();
    }

    public final void R0(Context context, final LeadTeamMember leadTeamMember) {
        new nta(requireContext()).mo3873f(getString(hae.confirmation_remove_member)).mo3874g(getString(hae.no), new DialogInterface.OnClickListener() { // from class: o.wah
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TeamInfoFragment.S0(dialogInterface, i);
            }
        }).mo3878k(getString(hae.yes), new DialogInterface.OnClickListener() { // from class: o.xah
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TeamInfoFragment.T0(this.f53437a, leadTeamMember, dialogInterface, i);
            }
        }).m3880m();
    }

    public final void U0(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.vah
                    @Override // java.lang.Runnable
                    public final void run() {
                        TeamInfoFragment.V0(abstractC2333d, i2, bundle);
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

    public final void W0(List list) {
        N0().o0.setAdapter(new C1613e(list, new C1614f(), new rog(this.f4713f, false, 2, null)));
        if (list.size() == 0) {
            N0().k0(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f4709b = String.valueOf(requireArguments().getString("TEAM_ARGUMENT"));
        }
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            idh idhVar = (idh) new b0(fragmentActivityRequireActivity).m6505a(idh.class);
            this.f4710c = idhVar;
            if (idhVar == null) {
                sq8.m48667z("viewModel");
                idhVar = null;
            }
            String str = this.f4709b;
            if (str == null) {
                sq8.m48667z("teamId");
                str = null;
            }
            Optional optionalM31952q = idhVar.m31952q(str);
            this.f4708a = optionalM31952q != null ? (LeadsTeam) optionalM31952q.orElse(null) : null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4711d == null) {
            this.f4711d = ti7.h0(layoutInflater, viewGroup, false);
        }
        return N0().m25689B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f4711d != null) {
            N0().o0.setAdapter(null);
        }
        this.f4711d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AuthorizationLevel authorizationLevel;
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        N0().k0(false);
        List listM54453S = wi0.m54453S();
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM54453S, 10));
        Iterator it = listM54453S.iterator();
        while (it.hasNext()) {
            arrayList.add(((LeadsTeam) it.next()).getTeamId());
        }
        if (!arrayList.isEmpty()) {
            String str = this.f4709b;
            if (str == null) {
                sq8.m48667z("teamId");
                str = null;
            }
            if (arrayList.contains(str) && (authorizationLevel = this.f4712e) == AuthorizationLevel.MANAGER && authorizationLevel != AuthorizationLevel.MEMBER) {
                return;
            }
        }
        this.f4713f = false;
    }
}
