package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import p001o.ai4;
import p001o.cri;
import p001o.gha;
import p001o.id5;
import p001o.sq8;
import p001o.srb;
import p001o.xj8;
import p001o.xka;

/* loaded from: classes5.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c */
    public static final C10752a f11294c = new C10752a(null);

    /* renamed from: d */
    public static final String f11295d = CustomTabMainActivity.class.getSimpleName() + ".extra_action";

    /* renamed from: e */
    public static final String f11296e = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* renamed from: f */
    public static final String f11297f = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* renamed from: g */
    public static final String f11298g = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* renamed from: h */
    public static final String f11299h = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";

    /* renamed from: q */
    public static final String f11300q = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* renamed from: s */
    public static final String f11301s = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    /* renamed from: a */
    public boolean f11302a = true;

    /* renamed from: b */
    public BroadcastReceiver f11303b;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    public static final class C10752a {
        public C10752a() {
        }

        public /* synthetic */ C10752a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final Bundle m12803b(String str) {
            Uri uri = Uri.parse(str);
            Bundle bundleP0 = cri.p0(uri.getQuery());
            bundleP0.putAll(cri.p0(uri.getFragment()));
            return bundleP0;
        }
    }

    /* renamed from: com.facebook.CustomTabMainActivity$b */
    public /* synthetic */ class C10753b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11304a;

        static {
            int[] iArr = new int[xka.values().length];
            try {
                iArr[xka.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11304a = iArr;
        }
    }

    /* renamed from: a */
    public final void m12801a(int i, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f11303b;
        if (broadcastReceiver != null) {
            gha.m28700b(this).m28704e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f11298g);
            Bundle bundleM12803b = stringExtra != null ? f11294c.m12803b(stringExtra) : new Bundle();
            Intent intent2 = getIntent();
            sq8.m48648g(intent2, "intent");
            Intent intentM48785m = srb.m48785m(intent2, bundleM12803b, null);
            if (intentM48785m != null) {
                intent = intentM48785m;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            sq8.m48648g(intent3, "intent");
            setResult(i, srb.m48785m(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f11290c;
        if (sq8.m48644c(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(f11295d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f11296e);
        boolean zM17139a = (C10753b.f11304a[xka.Companion.m56421a(getIntent().getStringExtra(f11299h)).ordinal()] == 1 ? new xj8(stringExtra, bundleExtra) : new ai4(stringExtra, bundleExtra)).m17139a(this, getIntent().getStringExtra(f11297f));
        this.f11302a = false;
        if (!zM17139a) {
            setResult(0, getIntent().putExtra(f11301s, true));
            finish();
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    sq8.m48649h(context, "context");
                    sq8.m48649h(intent, "intent");
                    Intent intent2 = new Intent(this.f11305a, (Class<?>) CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f11300q);
                    String str2 = CustomTabMainActivity.f11298g;
                    intent2.putExtra(str2, intent.getStringExtra(str2));
                    intent2.addFlags(603979776);
                    this.f11305a.startActivity(intent2);
                }
            };
            this.f11303b = broadcastReceiver;
            gha.m28700b(this).m28702c(broadcastReceiver, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        sq8.m48649h(intent, "intent");
        super.onNewIntent(intent);
        if (sq8.m48644c(f11300q, intent.getAction())) {
            gha.m28700b(this).m28703d(new Intent(CustomTabActivity.f11291d));
            m12801a(-1, intent);
        } else if (sq8.m48644c(CustomTabActivity.f11290c, intent.getAction())) {
            m12801a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f11302a) {
            m12801a(0, null);
        }
        this.f11302a = true;
    }
}
