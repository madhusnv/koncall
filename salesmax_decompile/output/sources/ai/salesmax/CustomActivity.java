package ai.salesmax;

import ai.salesmax.model.Leads;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import p001o.ct1;
import p001o.hae;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CustomActivity extends Activity {

    /* renamed from: b */
    public static final C0001a f0b = new C0001a(null);

    /* renamed from: c */
    public static final int f1c = 8;

    /* renamed from: a */
    public ct1 f2a;

    /* renamed from: ai.salesmax.CustomActivity$a */
    public static final class C0001a {
        public C0001a() {
        }

        public /* synthetic */ C0001a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public final ct1 m1a() {
        ct1 ct1Var = this.f2a;
        sq8.m48646e(ct1Var);
        return ct1Var;
    }

    /* renamed from: b */
    public final boolean m2b() {
        Object systemService = getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return keyguardManager.isDeviceLocked();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2a = ct1.h0(getLayoutInflater());
        setContentView(m1a().m25689B());
        m1a().k0((Leads) getIntent().getParcelableExtra(getString(hae.argumentLeads)));
        if (m2b()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }
}
