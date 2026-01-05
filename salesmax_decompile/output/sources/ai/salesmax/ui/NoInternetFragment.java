package ai.salesmax.ui;

import ai.salesmax.ui.NoInternetFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.AbstractC2338a;
import p001o.bub;
import p001o.p9e;
import p001o.sq8;
import p001o.uh7;
import p001o.zt4;

/* loaded from: classes.dex */
public final class NoInternetFragment extends BaseFragment {

    /* renamed from: h */
    public uh7 f360h;

    public static final void s1(NoInternetFragment noInternetFragment, View view) {
        sq8.m48649h(noInternetFragment, "this$0");
        Context contextRequireContext = noInternetFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        if (bub.m19823b(contextRequireContext)) {
            AbstractC2338a.m8705a(noInternetFragment).f0();
        }
    }

    public static final boolean t1(View view, int i, KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && i == 4;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f360h == null) {
            this.f360h = (uh7) zt4.m59874h(layoutInflater, p9e.fragment_no_internet, viewGroup, false);
        }
        r1().n0.q0.setOnClickListener(new View.OnClickListener() { // from class: o.dzb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoInternetFragment.s1(this.f20673a, view);
            }
        });
        r1().m25689B().setFocusableInTouchMode(true);
        r1().m25689B().requestFocus();
        r1().m25689B().setOnKeyListener(new View.OnKeyListener() { // from class: o.ezb
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return NoInternetFragment.t1(view, i, keyEvent);
            }
        });
        View viewM25689B = r1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f360h = null;
    }

    public final uh7 r1() {
        uh7 uh7Var = this.f360h;
        sq8.m48646e(uh7Var);
        return uh7Var;
    }
}
