package ai.salesmax.ui.settings;

import ai.salesmax.ui.settings.AdminFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.fragment.AbstractC2338a;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import p001o.bub;
import p001o.h70;
import p001o.id5;
import p001o.j0f;
import p001o.jkf;
import p001o.mii;
import p001o.sq8;
import p001o.z8e;

/* loaded from: classes.dex */
public final class AdminFragment extends Fragment {

    /* renamed from: c */
    public static final C1231a f3636c = new C1231a(null);

    /* renamed from: d */
    public static final int f3637d = 8;

    /* renamed from: a */
    public jkf f3638a;

    /* renamed from: b */
    public h70 f3639b;

    /* renamed from: ai.salesmax.ui.settings.AdminFragment$a */
    public static final class C1231a {
        public C1231a() {
        }

        public /* synthetic */ C1231a(id5 id5Var) {
            this();
        }
    }

    public static final void P0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_accountDefaults, null, 4, null);
            }
        }
    }

    public static final void Q0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_integrations, null, 4, null);
            }
        }
    }

    public static final void R0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_products, null, 4, null);
            }
        }
    }

    public static final void S0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_customizations, null, 4, null);
            }
        }
    }

    public static final void T0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_customizations, null, 4, null);
            }
        }
    }

    public static final void U0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_userManagement, null, 4, null);
            }
        }
    }

    public static final void V0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        if (adminFragment.getContext() != null) {
            Context contextRequireContext = adminFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(adminFragment, AbstractC2338a.m8705a(adminFragment), z8e.admin_start, z8e.action_admin_to_userManagement, null, 4, null);
            }
        }
    }

    public static final void W0(AdminFragment adminFragment, View view) {
        sq8.m48649h(adminFragment, "this$0");
        AbstractC2338a.m8705a(adminFragment).f0();
    }

    public static /* synthetic */ void Y0(AdminFragment adminFragment, AbstractC2333d abstractC2333d, int i, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        adminFragment.X0(abstractC2333d, i, i2, bundle);
    }

    public static final void Z0(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public final h70 O0() {
        h70 h70Var = this.f3639b;
        sq8.m48646e(h70Var);
        return h70Var;
    }

    public final void X0(final AbstractC2333d abstractC2333d, int i, final int i2, final Bundle bundle) {
        sq8.m48649h(abstractC2333d, "<this>");
        AbstractC2341h abstractC2341hM8591G = abstractC2333d.m8591G();
        boolean z = false;
        if (abstractC2341hM8591G != null && i == abstractC2341hM8591G.m8753A()) {
            z = true;
        }
        if (z) {
            try {
                j0f.m33008i(new Runnable() { // from class: o.g70
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdminFragment.Z0(abstractC2333d, i2, bundle);
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f3638a = (jkf) new b0(fragmentActivityRequireActivity).m6505a(jkf.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f3639b == null) {
            h70 h70VarH0 = h70.h0(layoutInflater, viewGroup, false);
            h70VarH0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.y60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.P0(this.f54965a, view);
                }
            });
            h70VarH0.t0.setOnClickListener(new View.OnClickListener() { // from class: o.z60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.Q0(this.f56575a, view);
                }
            });
            h70VarH0.u0.setOnClickListener(new View.OnClickListener() { // from class: o.a70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.R0(this.f14225a, view);
                }
            });
            h70VarH0.o0.setOnClickListener(new View.OnClickListener() { // from class: o.b70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.S0(this.f15602a, view);
                }
            });
            h70VarH0.p0.setOnClickListener(new View.OnClickListener() { // from class: o.c70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.T0(this.f17426a, view);
                }
            });
            h70VarH0.x0.setOnClickListener(new View.OnClickListener() { // from class: o.d70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.U0(this.f19161a, view);
                }
            });
            h70VarH0.y0.setOnClickListener(new View.OnClickListener() { // from class: o.e70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.V0(this.f21087a, view);
                }
            });
            h70VarH0.v0.setOnClickListener(new View.OnClickListener() { // from class: o.f70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdminFragment.W0(this.f22835a, view);
                }
            });
            this.f3639b = h70VarH0;
        }
        View viewM25689B = O0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f3639b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        jkf jkfVar = this.f3638a;
        if (jkfVar == null) {
            sq8.m48667z("viewModel");
            jkfVar = null;
        }
        mii miiVarM33946w = jkfVar.m33946w();
        if (AuthorizationLevel.SUPERADMIN != (miiVarM33946w != null ? miiVarM33946w.m39162l() : null)) {
            O0().q0.setVisibility(0);
            return;
        }
        O0().q0.setVisibility(0);
        Account accountM39156f = miiVarM33946w.m39156f();
        String deviceKey = accountM39156f != null ? accountM39156f.getDeviceKey() : null;
        O0().q0.setText("Workspace Device Pin is " + deviceKey);
    }
}
