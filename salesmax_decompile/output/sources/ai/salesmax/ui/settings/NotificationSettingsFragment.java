package ai.salesmax.ui.settings;

import ai.salesmax.ui.settings.NotificationSettingsFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.AbstractC2338a;
import p001o.id5;
import p001o.jkf;
import p001o.sq8;
import p001o.t4c;

/* loaded from: classes.dex */
public final class NotificationSettingsFragment extends Fragment {

    /* renamed from: c */
    public static final C1334a f3906c = new C1334a(null);

    /* renamed from: d */
    public static final int f3907d = 8;

    /* renamed from: a */
    public jkf f3908a;

    /* renamed from: b */
    public t4c f3909b;

    /* renamed from: ai.salesmax.ui.settings.NotificationSettingsFragment$a */
    public static final class C1334a {
        public C1334a() {
        }

        public /* synthetic */ C1334a(id5 id5Var) {
            this();
        }
    }

    public static final void H0(NotificationSettingsFragment notificationSettingsFragment, View view) {
        sq8.m48649h(notificationSettingsFragment, "this$0");
        AbstractC2338a.m8705a(notificationSettingsFragment).f0();
    }

    public final t4c G0() {
        t4c t4cVar = this.f3909b;
        sq8.m48646e(t4cVar);
        return t4cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f3908a = (jkf) new b0(fragmentActivityRequireActivity).m6505a(jkf.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f3909b == null) {
            t4c t4cVarH0 = t4c.h0(layoutInflater, viewGroup, false);
            t4cVarH0.t0.setOnClickListener(new View.OnClickListener() { // from class: o.i4c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationSettingsFragment.H0(this.f28013a, view);
                }
            });
            this.f3909b = t4cVarH0;
        }
        View viewM25689B = G0().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f3909b = null;
    }
}
