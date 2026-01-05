package p001o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class mm0 {

    /* renamed from: b */
    public static final C15356a f35670b = new C15356a(null);

    /* renamed from: c */
    public static volatile mm0 f35671c;

    /* renamed from: a */
    public final gi9 f35672a;

    /* renamed from: o.mm0$a */
    public static final class C15356a {
        public C15356a() {
        }

        public /* synthetic */ C15356a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mm0 m39336a() {
            mm0 mm0VarM39327a = mm0.m39327a();
            if (mm0VarM39327a == null) {
                synchronized (this) {
                    id5 id5Var = null;
                    if (!C10773c.m12993G()) {
                        return null;
                    }
                    mm0VarM39327a = mm0.m39327a();
                    if (mm0VarM39327a == null) {
                        mm0VarM39327a = new mm0(id5Var);
                        mm0.m39328b(mm0VarM39327a);
                    }
                }
            }
            return mm0VarM39327a;
        }
    }

    /* renamed from: o.mm0$b */
    public static final class C15357b extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C15357b f35673a = new C15357b();

        public C15357b() {
            super(0);
        }

        @Override // p001o.uk7
        public final SharedPreferences invoke() {
            return C10773c.m13019l().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    /* renamed from: o.mm0$c */
    public static final class C15358c implements Application.ActivityLifecycleCallbacks {
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
            mm0 mm0VarM39336a = mm0.f35670b.m39336a();
            if (mm0VarM39336a != null) {
                mm0VarM39336a.m39333g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            sq8.m48649h(activity, "activity");
            mm0 mm0VarM39336a = mm0.f35670b.m39336a();
            if (mm0VarM39336a != null) {
                mm0VarM39336a.m39333g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
        }
    }

    public /* synthetic */ mm0(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public static final /* synthetic */ mm0 m39327a() {
        if (a94.m16694d(mm0.class)) {
            return null;
        }
        try {
            return f35671c;
        } catch (Throwable th) {
            a94.m16692b(th, mm0.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m39328b(mm0 mm0Var) {
        if (a94.m16694d(mm0.class)) {
            return;
        }
        try {
            f35671c = mm0Var;
        } catch (Throwable th) {
            a94.m16692b(th, mm0.class);
        }
    }

    /* renamed from: c */
    public final String m39329c(Intent intent) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final String m39330d(Uri uri) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final String m39331e(String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return m39332f().getString(str, null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final SharedPreferences m39332f() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Object value = this.f35672a.getValue();
            sq8.m48648g(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public final void m39333g(Activity activity) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            sq8.m48648g(intent, "activity.intent");
            m39334h(data, intent);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m39334h(Uri uri, Intent intent) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(uri, "uri");
            sq8.m48649h(intent, "intent");
            String strM39330d = m39330d(uri);
            if (strM39330d == null) {
                strM39330d = m39329c(intent);
            }
            if (strM39330d != null) {
                m39332f().edit().putString("campaign_ids", strM39330d).apply();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m39335i(Application application) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(application, "application");
            application.registerActivityLifecycleCallbacks(new C15358c());
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public mm0() {
        this.f35672a = si9.m48360a(C15357b.f35673a);
    }
}
