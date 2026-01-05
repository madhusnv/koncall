package ai.salesmax.ui.settings;

import ai.salesmax.ui.settings.CustomizeFragment;
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
import p001o.bub;
import p001o.id5;
import p001o.j0f;
import p001o.sq8;
import p001o.wh4;
import p001o.z8e;
import p001o.zj4;

/* loaded from: classes.dex */
public final class CustomizeFragment extends Fragment {

    /* renamed from: c */
    public static final C1291a f3771c = new C1291a(null);

    /* renamed from: d */
    public static final int f3772d = 8;

    /* renamed from: a */
    public wh4 f3773a;

    /* renamed from: b */
    public zj4 f3774b;

    /* renamed from: ai.salesmax.ui.settings.CustomizeFragment$a */
    public static final class C1291a {
        public C1291a() {
        }

        public /* synthetic */ C1291a(id5 id5Var) {
            this();
        }
    }

    public static final void P0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        AbstractC2338a.m8705a(customizeFragment).f0();
    }

    public static final void Q0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_custom_properties, null, 4, null);
            }
        }
    }

    public static final void R0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_taskCustomization, null, 4, null);
            }
        }
    }

    public static final void S0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_custom_forms, null, 4, null);
            }
        }
    }

    public static final void T0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_custom_labels, null, 4, null);
            }
        }
    }

    public static final void U0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_deal_customizations, null, 4, null);
            }
        }
    }

    public static final void V0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_customCallOutcomes, null, 4, null);
            }
        }
    }

    public static final void W0(CustomizeFragment customizeFragment, View view) {
        sq8.m48649h(customizeFragment, "this$0");
        if (customizeFragment.getContext() != null) {
            Context contextRequireContext = customizeFragment.requireContext();
            sq8.m48648g(contextRequireContext, "requireContext(...)");
            if (bub.m19823b(contextRequireContext)) {
                Y0(customizeFragment, AbstractC2338a.m8705a(customizeFragment), z8e.customizations, z8e.action_customizations_to_customVisitOutcomes, null, 4, null);
            }
        }
    }

    public static /* synthetic */ void Y0(CustomizeFragment customizeFragment, AbstractC2333d abstractC2333d, int i, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        customizeFragment.X0(abstractC2333d, i, i2, bundle);
    }

    public static final void Z0(AbstractC2333d abstractC2333d, int i, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "$this_safeNavigate");
        abstractC2333d.m8604U(i, bundle);
    }

    public final zj4 O0() {
        zj4 zj4Var = this.f3774b;
        sq8.m48646e(zj4Var);
        return zj4Var;
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
                j0f.m33008i(new Runnable() { // from class: o.yj4
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomizeFragment.Z0(abstractC2333d, i2, bundle);
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
            this.f3773a = (wh4) new b0(fragmentActivityRequireActivity).m6505a(wh4.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f3774b == null) {
            zj4 zj4VarH0 = zj4.h0(layoutInflater, viewGroup, false);
            zj4VarH0.u0.setOnClickListener(new View.OnClickListener() { // from class: o.qj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.P0(this.f42054a, view);
                }
            });
            zj4VarH0.n0.setOnClickListener(new View.OnClickListener() { // from class: o.rj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.Q0(this.f43705a, view);
                }
            });
            zj4VarH0.w0.setOnClickListener(new View.OnClickListener() { // from class: o.sj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.R0(this.f45471a, view);
                }
            });
            zj4VarH0.q0.setOnClickListener(new View.OnClickListener() { // from class: o.tj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.S0(this.f47224a, view);
                }
            });
            zj4VarH0.p0.setOnClickListener(new View.OnClickListener() { // from class: o.uj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.T0(this.f48982a, view);
                }
            });
            zj4VarH0.r0.setOnClickListener(new View.OnClickListener() { // from class: o.vj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.U0(this.f50434a, view);
                }
            });
            zj4VarH0.o0.setOnClickListener(new View.OnClickListener() { // from class: o.wj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.V0(this.f52224a, view);
                }
            });
            zj4VarH0.y0.setOnClickListener(new View.OnClickListener() { // from class: o.xj4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomizeFragment.W0(this.f53845a, view);
                }
            });
            this.f3774b = zj4VarH0;
        }
        View viewM25689B = O0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f3774b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
    }
}
