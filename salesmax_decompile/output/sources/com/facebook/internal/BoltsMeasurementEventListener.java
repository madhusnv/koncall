package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Set;
import p001o.a94;
import p001o.ao8;
import p001o.gha;
import p001o.id5;
import p001o.mge;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: c */
    public static BoltsMeasurementEventListener f11460c;

    /* renamed from: a */
    public final Context f11462a;

    /* renamed from: b */
    public static final C10780a f11459b = new C10780a(null);

    /* renamed from: d */
    public static final String f11461d = "com.parse.bolts.measurement_event";

    /* renamed from: com.facebook.internal.BoltsMeasurementEventListener$a */
    public static final class C10780a {
        public C10780a() {
        }

        public /* synthetic */ C10780a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final BoltsMeasurementEventListener m13099a(Context context) {
            sq8.m48649h(context, "context");
            if (BoltsMeasurementEventListener.m13094a() != null) {
                return BoltsMeasurementEventListener.m13094a();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.m13095b(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.m13096c(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.m13094a();
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, id5 id5Var) {
        this(context);
    }

    /* renamed from: a */
    public static final /* synthetic */ BoltsMeasurementEventListener m13094a() {
        if (a94.m16694d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f11460c;
        } catch (Throwable th) {
            a94.m16692b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m13095b(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (a94.m16694d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.m13098e();
        } catch (Throwable th) {
            a94.m16692b(th, BoltsMeasurementEventListener.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m13096c(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (a94.m16694d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            f11460c = boltsMeasurementEventListener;
        } catch (Throwable th) {
            a94.m16692b(th, BoltsMeasurementEventListener.class);
        }
    }

    /* renamed from: d */
    public final void m13097d() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            gha ghaVarM28700b = gha.m28700b(this.f11462a);
            sq8.m48648g(ghaVarM28700b, "getInstance(applicationContext)");
            ghaVarM28700b.m28704e(this);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public final void m13098e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            gha ghaVarM28700b = gha.m28700b(this.f11462a);
            sq8.m48648g(ghaVarM28700b, "getInstance(applicationContext)");
            ghaVarM28700b.m28702c(this, new IntentFilter(f11461d));
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final void finalize() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13097d();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            ao8 ao8Var = new ao8(context);
            StringBuilder sb = new StringBuilder();
            sb.append("bf_");
            sb.append(intent != null ? intent.getStringExtra("event_name") : null);
            String string = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    bundle.putString(new mge("[ -]*$").m38996h(new mge("^[ -]*").m38996h(new mge("[^0-9a-zA-Z _-]").m38996h(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            ao8Var.m17561d(string, bundle);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        this.f11462a = applicationContext;
    }
}
