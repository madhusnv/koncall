package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import p001o.id5;
import p001o.k8e;
import p001o.k9e;
import p001o.kf9;
import p001o.ns;
import p001o.sq8;
import p001o.us;
import p001o.ws;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public class LoginFragment extends Fragment {

    /* renamed from: f */
    public static final C10817a f11605f = new C10817a(null);

    /* renamed from: a */
    public String f11606a;

    /* renamed from: b */
    public LoginClient.Request f11607b;

    /* renamed from: c */
    public LoginClient f11608c;

    /* renamed from: d */
    public ws f11609d;

    /* renamed from: e */
    public View f11610e;

    /* renamed from: com.facebook.login.LoginFragment$a */
    public static final class C10817a {
        public C10817a() {
        }

        public /* synthetic */ C10817a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.LoginFragment$b */
    public static final class C10818b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ FragmentActivity f11612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10818b(FragmentActivity fragmentActivity) {
            super(1);
            this.f11612b = fragmentActivity;
        }

        /* renamed from: a */
        public final void m13307a(ActivityResult activityResult) {
            sq8.m48649h(activityResult, "result");
            if (activityResult.m3726b() == -1) {
                LoginFragment.this.M0().m13258u(LoginClient.f11564H.m13305b(), activityResult.m3726b(), activityResult.m3725a());
            } else {
                this.f11612b.finish();
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m13307a((ActivityResult) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: com.facebook.login.LoginFragment$c */
    public static final class C10819c implements LoginClient.InterfaceC10813a {
        public C10819c() {
        }

        @Override // com.facebook.login.LoginClient.InterfaceC10813a
        /* renamed from: a */
        public void mo13300a() {
            LoginFragment.this.V0();
        }

        @Override // com.facebook.login.LoginClient.InterfaceC10813a
        /* renamed from: b */
        public void mo13301b() {
            LoginFragment.this.O0();
        }
    }

    public static final void Q0(LoginFragment loginFragment, LoginClient.Result result) {
        sq8.m48649h(loginFragment, "this$0");
        sq8.m48649h(result, "outcome");
        loginFragment.S0(result);
    }

    public static final void R0(xk7 xk7Var, ActivityResult activityResult) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(activityResult);
    }

    public LoginClient J0() {
        return new LoginClient(this);
    }

    public final ws K0() {
        ws wsVar = this.f11609d;
        if (wsVar != null) {
            return wsVar;
        }
        sq8.m48667z("launcher");
        return null;
    }

    public int L0() {
        return k9e.com_facebook_login_fragment;
    }

    public final LoginClient M0() {
        LoginClient loginClient = this.f11608c;
        if (loginClient != null) {
            return loginClient;
        }
        sq8.m48667z("loginClient");
        return null;
    }

    public final xk7 N0(FragmentActivity fragmentActivity) {
        return new C10818b(fragmentActivity);
    }

    public final void O0() {
        View view = this.f11610e;
        if (view == null) {
            sq8.m48667z("progressBar");
            view = null;
        }
        view.setVisibility(8);
        T0();
    }

    public final void P0(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f11606a = callingActivity.getPackageName();
    }

    public final void S0(LoginClient.Result result) {
        this.f11607b = null;
        int i = result.f11597a == LoginClient.Result.EnumC10810a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    public void T0() {
    }

    public void U0() {
    }

    public final void V0() {
        View view = this.f11610e;
        if (view == null) {
            sq8.m48667z("progressBar");
            view = null;
        }
        view.setVisibility(0);
        U0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        M0().m13258u(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClientJ0 = bundle != null ? (LoginClient) bundle.getParcelable("loginClient") : null;
        if (loginClientJ0 != null) {
            loginClientJ0.m13260w(this);
        } else {
            loginClientJ0 = J0();
        }
        this.f11608c = loginClientJ0;
        M0().m13261x(new LoginClient.InterfaceC10816d() { // from class: o.nka
            @Override // com.facebook.login.LoginClient.InterfaceC10816d
            /* renamed from: a */
            public final void mo13306a(LoginClient.Result result) {
                LoginFragment.Q0(this.f36975a, result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        P0(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f11607b = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        us usVar = new us();
        final xk7 xk7VarN0 = N0(activity);
        ws wsVarRegisterForActivityResult = registerForActivityResult(usVar, new ns() { // from class: o.oka
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                LoginFragment.R0(xk7VarN0, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.f11609d = wsVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(L0(), viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(k8e.com_facebook_login_fragment_progress_bar);
        sq8.m48648g(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.f11610e = viewFindViewById;
        M0().m13259v(new C10819c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        M0().m13240c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(k8e.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f11606a != null) {
            M0().m13262y(this.f11607b);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        sq8.m48649h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", M0());
    }
}
