package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p001o.gha;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: b */
    public static final C10751a f11289b = new C10751a(null);

    /* renamed from: c */
    public static final String f11290c = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";

    /* renamed from: d */
    public static final String f11291d = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* renamed from: a */
    public BroadcastReceiver f11292a;

    /* renamed from: com.facebook.CustomTabActivity$a */
    public static final class C10751a {
        public C10751a() {
        }

        public /* synthetic */ C10751a(id5 id5Var) {
            this();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f11290c);
            intent2.putExtra(CustomTabMainActivity.f11298g, getIntent().getDataString());
            gha.m28700b(this).m28703d(intent2);
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent3) {
                    sq8.m48649h(context, "context");
                    sq8.m48649h(intent3, "intent");
                    this.f11293a.finish();
                }
            };
            gha.m28700b(this).m28702c(broadcastReceiver, new IntentFilter(f11291d));
            this.f11292a = broadcastReceiver;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f11290c);
        intent.putExtra(CustomTabMainActivity.f11298g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f11292a;
        if (broadcastReceiver != null) {
            gha.m28700b(this).m28704e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
