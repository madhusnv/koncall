package p001o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C10773c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.kh8;
import p001o.rg8;

/* loaded from: classes5.dex */
public final class rg8 {

    /* renamed from: a */
    public static final rg8 f43577a = new rg8();

    /* renamed from: b */
    public static final String f43578b = rg8.class.getCanonicalName();

    /* renamed from: c */
    public static final AtomicBoolean f43579c = new AtomicBoolean(false);

    /* renamed from: d */
    public static Boolean f43580d;

    /* renamed from: e */
    public static Boolean f43581e;

    /* renamed from: f */
    public static ServiceConnection f43582f;

    /* renamed from: g */
    public static Application.ActivityLifecycleCallbacks f43583g;

    /* renamed from: h */
    public static Intent f43584h;

    /* renamed from: i */
    public static Object f43585i;

    /* renamed from: j */
    public static kh8.EnumC14835a f43586j;

    /* renamed from: o.rg8$a */
    public static final class ServiceConnectionC16609a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            sq8.m48649h(componentName, "name");
            sq8.m48649h(iBinder, "service");
            rg8 rg8Var = rg8.f43577a;
            rg8.f43585i = gh8.m28658a(C10773c.m13019l(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            sq8.m48649h(componentName, "name");
        }
    }

    /* renamed from: o.rg8$b */
    public static final class C16610b implements Application.ActivityLifecycleCallbacks {
        /* renamed from: c */
        public static final void m46727c() throws JSONException {
            Context contextM13019l = C10773c.m13019l();
            ArrayList arrayListM28661i = gh8.m28661i(contextM13019l, rg8.f43585i);
            rg8 rg8Var = rg8.f43577a;
            rg8Var.m46723f(contextM13019l, arrayListM28661i, false);
            rg8Var.m46723f(contextM13019l, gh8.m28662j(contextM13019l, rg8.f43585i), true);
        }

        /* renamed from: d */
        public static final void m46728d() throws JSONException {
            Context contextM13019l = C10773c.m13019l();
            ArrayList arrayListM28661i = gh8.m28661i(contextM13019l, rg8.f43585i);
            if (arrayListM28661i.isEmpty()) {
                arrayListM28661i = gh8.m28660g(contextM13019l, rg8.f43585i);
            }
            rg8.f43577a.m46723f(contextM13019l, arrayListM28661i, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            sq8.m48649h(activity, "activity");
            try {
                C10773c.m13028u().execute(new Runnable() { // from class: o.sg8
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        rg8.C16610b.m46727c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            sq8.m48649h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
            try {
                if (sq8.m48644c(rg8.f43581e, Boolean.TRUE) && sq8.m48644c(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C10773c.m13028u().execute(new Runnable() { // from class: o.tg8
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            rg8.C16610b.m46728d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static final void m46721g(kh8.EnumC14835a enumC14835a) {
        sq8.m48649h(enumC14835a, "billingClientVersion");
        rg8 rg8Var = f43577a;
        rg8Var.m46722e();
        if (!sq8.m48644c(f43580d, Boolean.FALSE) && u61.m50977g()) {
            f43586j = enumC14835a;
            rg8Var.m46724h();
        }
    }

    /* renamed from: e */
    public final void m46722e() {
        if (f43580d != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(kh8.m35712a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f43580d = boolValueOf;
        if (sq8.m48644c(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f43581e = Boolean.valueOf(kh8.m35712a("com.android.billingclient.api.ProxyBillingActivity") != null);
        gh8.m28659b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        sq8.m48648g(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        f43584h = intent;
        f43582f = new ServiceConnectionC16609a();
        f43583g = new C16610b();
    }

    /* renamed from: f */
    public final void m46723f(Context context, ArrayList arrayList, boolean z) throws JSONException {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                sq8.m48648g(string, "sku");
                sq8.m48648g(str, FirebaseAnalytics.Event.PURCHASE);
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException unused) {
            }
        }
        for (Map.Entry entry : gh8.m28663k(context, arrayList2, f43585i, z).entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) map.get(str2);
            if (str4 != null) {
                u61.m50981k(str4, str3, z, f43586j, false, 16, null);
            }
        }
    }

    /* renamed from: h */
    public final void m46724h() {
        if (f43579c.compareAndSet(false, true)) {
            Context contextM13019l = C10773c.m13019l();
            if (contextM13019l instanceof Application) {
                Application application = (Application) contextM13019l;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f43583g;
                ServiceConnection serviceConnection = null;
                if (activityLifecycleCallbacks == null) {
                    sq8.m48667z("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f43584h;
                if (intent == null) {
                    sq8.m48667z("intent");
                    intent = null;
                }
                ServiceConnection serviceConnection2 = f43582f;
                if (serviceConnection2 == null) {
                    sq8.m48667z("serviceConnection");
                } else {
                    serviceConnection = serviceConnection2;
                }
                contextM13019l.bindService(intent, serviceConnection, 1);
            }
        }
    }
}
