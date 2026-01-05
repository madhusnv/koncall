package ai.salesmax.ui.support;

import ai.salesmax.ui.BaseFragment;
import ai.salesmax.ui.support.AboutFragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b0;
import p001o.bub;
import p001o.id5;
import p001o.jkf;
import p001o.jm7;
import p001o.kf9;
import p001o.l6;
import p001o.sq8;
import p001o.uk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class AboutFragment extends BaseFragment {

    /* renamed from: s */
    public static final C1432a f4159s = new C1432a(null);

    /* renamed from: x */
    public static final int f4160x = 8;

    /* renamed from: h */
    public jkf f4161h;

    /* renamed from: q */
    public l6 f4162q;

    /* renamed from: ai.salesmax.ui.support.AboutFragment$a */
    public static final class C1432a {
        public C1432a() {
        }

        public /* synthetic */ C1432a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.ui.support.AboutFragment$b */
    public static final class C1433b extends kf9 implements uk7 {
        public C1433b() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68686invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68686invoke() {
            jm7.v0(AboutFragment.this.requireActivity(), "Setting preference has been reset", 0, 0, 12, null);
        }
    }

    /* renamed from: ai.salesmax.ui.support.AboutFragment$c */
    public static final class C1434c extends kf9 implements uk7 {
        public C1434c() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68687invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68687invoke() {
            jm7.v0(AboutFragment.this.requireActivity(), "Setting preference couldn't been reset, please retry!!", 0, 0, 12, null);
        }
    }

    public static final void v1(AboutFragment aboutFragment, View view) {
        sq8.m48649h(aboutFragment, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + aboutFragment.requireActivity().getPackageName()));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        aboutFragment.startActivity(intent);
    }

    public static final void w1(AboutFragment aboutFragment, View view) {
        sq8.m48649h(aboutFragment, "this$0");
        aboutFragment.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:ai.salesmax")));
    }

    public static final void x1(AboutFragment aboutFragment, View view) {
        sq8.m48649h(aboutFragment, "this$0");
        Intent intent = new Intent();
        intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        aboutFragment.startActivity(intent);
    }

    public static final void y1(AboutFragment aboutFragment, View view) {
        sq8.m48649h(aboutFragment, "this$0");
        Context contextRequireContext = aboutFragment.requireContext();
        sq8.m48648g(contextRequireContext, "requireContext(...)");
        if (bub.m19823b(contextRequireContext)) {
            jkf jkfVar = aboutFragment.f4161h;
            if (jkfVar == null) {
                sq8.m48667z("settingsViewModel");
                jkfVar = null;
            }
            jkfVar.m33919B(aboutFragment.new C1433b(), aboutFragment.new C1434c());
        }
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            sq8.m48648g(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f4161h = (jkf) new b0(fragmentActivityRequireActivity).m6505a(jkf.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4162q == null) {
            l6 l6VarH0 = l6.h0(layoutInflater, viewGroup, false);
            l6VarH0.p0.setOnClickListener(new View.OnClickListener() { // from class: o.h6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.v1(this.f26226a, view);
                }
            });
            l6VarH0.r0.setOnClickListener(new View.OnClickListener() { // from class: o.i6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.w1(this.f28135a, view);
                }
            });
            l6VarH0.q0.setOnClickListener(new View.OnClickListener() { // from class: o.j6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.x1(this.f29841a, view);
                }
            });
            l6VarH0.s0.setOnClickListener(new View.OnClickListener() { // from class: o.k6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutFragment.y1(this.f31519a, view);
                }
            });
            this.f4162q = l6VarH0;
        }
        View viewM25689B = t1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f4162q = null;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws PackageManager.NameNotFoundException {
        String str;
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        try {
            PackageInfo packageInfo = requireContext().getPackageManager().getPackageInfo(requireContext().getPackageName(), 0);
            String str2 = "App Version : " + packageInfo.versionName;
            if (Build.VERSION.SDK_INT <= 28) {
                str = str2 + "(" + packageInfo.versionCode + "}";
            } else {
                str = str2 + "(" + packageInfo.getLongVersionCode() + ")";
            }
            t1().n0.setText(str);
            t1().o0.setText(u1());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public final l6 t1() {
        l6 l6Var = this.f4162q;
        sq8.m48646e(l6Var);
        return l6Var;
    }

    public final String u1() {
        return "Model : " + Build.MODEL + "\nManufacturer : " + Build.MANUFACTURER + "\nversionRelease " + Build.VERSION.RELEASE;
    }
}
