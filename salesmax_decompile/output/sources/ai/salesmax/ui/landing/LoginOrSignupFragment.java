package ai.salesmax.ui.landing;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.MainActivity;
import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.landing.LoginOrSignupFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.AbstractC2338a;
import com.amplifyframework.core.model.ModelIdentifier;
import p001o.c64;
import p001o.hae;
import p001o.sq8;
import p001o.u6e;
import p001o.uka;
import p001o.z8e;

/* loaded from: classes.dex */
public final class LoginOrSignupFragment extends BaseFragment {

    /* renamed from: h */
    public uka f2365h;

    public static final void s1(LoginOrSignupFragment loginOrSignupFragment, View view) {
        sq8.m48649h(loginOrSignupFragment, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(loginOrSignupFragment.getString(hae.argumentLoginOrSignup), false);
        loginOrSignupFragment.d1(AbstractC2338a.m8705a(loginOrSignupFragment), z8e.loginOrSignup, z8e.action_loginOrSignup_to_landing, bundle);
    }

    public static final void t1(LoginOrSignupFragment loginOrSignupFragment, View view) {
        sq8.m48649h(loginOrSignupFragment, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(loginOrSignupFragment.getString(hae.argumentLoginOrSignup), true);
        loginOrSignupFragment.d1(AbstractC2338a.m8705a(loginOrSignupFragment), z8e.loginOrSignup, z8e.action_loginOrSignup_to_landing, bundle);
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        String hexString = Integer.toHexString(c64.getColor(requireContext(), u6e.superfone_white));
        sq8.m48648g(hexString, "toHexString(...)");
        String strSubstring = hexString.substring(2);
        sq8.m48648g(strSubstring, "substring(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
        ((MainActivity) fragmentActivityRequireActivity).s3(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strSubstring);
        if (this.f2365h == null) {
            uka ukaVarH0 = uka.h0(layoutInflater, viewGroup, false);
            AbstractC0059a.m132a().f1(false);
            ukaVarH0.s0.setOnClickListener(new View.OnClickListener() { // from class: o.ska
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginOrSignupFragment.s1(this.f45524a, view);
                }
            });
            ukaVarH0.t0.setOnClickListener(new View.OnClickListener() { // from class: o.tka
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginOrSignupFragment.t1(this.f47337a, view);
                }
            });
            this.f2365h = ukaVarH0;
        }
        View viewM25689B = r1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f2365h = null;
    }

    public final uka r1() {
        uka ukaVar = this.f2365h;
        sq8.m48646e(ukaVar);
        return ukaVar;
    }
}
