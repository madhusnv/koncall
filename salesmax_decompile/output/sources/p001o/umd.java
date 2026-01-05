package p001o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.C10773c;
import com.facebook.Profile;

/* loaded from: classes5.dex */
public abstract class umd {

    /* renamed from: a */
    public final BroadcastReceiver f49141a;

    /* renamed from: b */
    public final gha f49142b;

    /* renamed from: c */
    public boolean f49143c;

    /* renamed from: o.umd$a */
    public final class C17403a extends BroadcastReceiver {
        public C17403a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sq8.m48649h(context, "context");
            sq8.m48649h(intent, "intent");
            if (sq8.m48644c("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                umd.this.mo13484c((Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE"), (Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE"));
            }
        }
    }

    public umd() {
        rri.m47117l();
        this.f49141a = new C17403a();
        gha ghaVarM28700b = gha.m28700b(C10773c.m13019l());
        sq8.m48648g(ghaVarM28700b, "getInstance(FacebookSdk.getApplicationContext())");
        this.f49142b = ghaVarM28700b;
        m51790d();
    }

    /* renamed from: a */
    public final void m51788a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        this.f49142b.m28702c(this.f49141a, intentFilter);
    }

    /* renamed from: b */
    public final boolean m51789b() {
        return this.f49143c;
    }

    /* renamed from: c */
    public abstract void mo13484c(Profile profile, Profile profile2);

    /* renamed from: d */
    public final void m51790d() {
        if (this.f49143c) {
            return;
        }
        m51788a();
        this.f49143c = true;
    }

    /* renamed from: e */
    public final void m51791e() {
        if (this.f49143c) {
            this.f49142b.m28704e(this.f49141a);
            this.f49143c = false;
        }
    }
}
