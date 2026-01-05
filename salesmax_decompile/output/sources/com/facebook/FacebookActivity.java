package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p001o.a86;
import p001o.a94;
import p001o.cri;
import p001o.id5;
import p001o.k8e;
import p001o.k9e;
import p001o.sq8;
import p001o.srb;
import p001o.ur6;

/* loaded from: classes5.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: b */
    public static final C10754a f11306b = new C10754a(null);

    /* renamed from: c */
    public static final String f11307c = FacebookActivity.class.getName();

    /* renamed from: a */
    public Fragment f11308a;

    /* renamed from: com.facebook.FacebookActivity$a */
    public static final class C10754a {
        public C10754a() {
        }

        public /* synthetic */ C10754a(id5 id5Var) {
            this();
        }
    }

    public final Fragment I0() {
        return this.f11308a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.facebook.internal.FacebookDialogFragment] */
    public Fragment J0() {
        LoginFragment loginFragment;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        sq8.m48648g(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentM0 = supportFragmentManager.m0("SingleFragment");
        if (fragmentM0 != null) {
            return fragmentM0;
        }
        if (sq8.m48644c("FacebookDialogFragment", intent.getAction())) {
            ?? facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, "SingleFragment");
            loginFragment = facebookDialogFragment;
        } else {
            LoginFragment loginFragment2 = new LoginFragment();
            loginFragment2.setRetainInstance(true);
            supportFragmentManager.m6205q().m6419c(k8e.com_facebook_fragment_container, loginFragment2, "SingleFragment").mo6260h();
            loginFragment = loginFragment2;
        }
        return loginFragment;
    }

    public final void K0() {
        Intent intent = getIntent();
        sq8.m48648g(intent, "requestIntent");
        ur6 ur6VarM48789r = srb.m48789r(srb.m48792v(intent));
        Intent intent2 = getIntent();
        sq8.m48648g(intent2, "intent");
        setResult(0, srb.m48785m(intent2, null, ur6VarM48789r));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(str, "prefix");
            sq8.m48649h(printWriter, "writer");
            a86.f14290a.m16680a();
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        sq8.m48649h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f11308a;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C10773c.m12993G()) {
            cri.k0(f11307c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            sq8.m48648g(applicationContext, "applicationContext");
            C10773c.m12999N(applicationContext);
        }
        setContentView(k9e.com_facebook_activity_layout);
        if (sq8.m48644c("PassThrough", intent.getAction())) {
            K0();
        } else {
            this.f11308a = J0();
        }
    }
}
