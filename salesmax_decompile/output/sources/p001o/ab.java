package p001o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.AccessToken;
import com.facebook.C10773c;

/* loaded from: classes5.dex */
public abstract class ab {

    /* renamed from: d */
    public static final C12124a f14408d = new C12124a(null);

    /* renamed from: e */
    public static final String f14409e = ab.class.getSimpleName();

    /* renamed from: a */
    public final BroadcastReceiver f14410a;

    /* renamed from: b */
    public final gha f14411b;

    /* renamed from: c */
    public boolean f14412c;

    /* renamed from: o.ab$a */
    public static final class C12124a {
        public C12124a() {
        }

        public /* synthetic */ C12124a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.ab$b */
    public final class C12125b extends BroadcastReceiver {
        public C12125b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sq8.m48649h(context, "context");
            sq8.m48649h(intent, "intent");
            if (sq8.m48644c("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                cri.k0(ab.f14409e, "AccessTokenChanged");
                ab.this.mo13469d((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public ab() {
        rri.m47117l();
        this.f14410a = new C12125b();
        gha ghaVarM28700b = gha.m28700b(C10773c.m13019l());
        sq8.m48648g(ghaVarM28700b, "getInstance(FacebookSdk.getApplicationContext())");
        this.f14411b = ghaVarM28700b;
        m16792e();
    }

    /* renamed from: b */
    public final void m16790b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f14411b.m28702c(this.f14410a, intentFilter);
    }

    /* renamed from: c */
    public final boolean m16791c() {
        return this.f14412c;
    }

    /* renamed from: d */
    public abstract void mo13469d(AccessToken accessToken, AccessToken accessToken2);

    /* renamed from: e */
    public final void m16792e() {
        if (this.f14412c) {
            return;
        }
        m16790b();
        this.f14412c = true;
    }

    /* renamed from: f */
    public final void m16793f() {
        if (this.f14412c) {
            this.f14411b.m28704e(this.f14410a);
            this.f14412c = false;
        }
    }
}
