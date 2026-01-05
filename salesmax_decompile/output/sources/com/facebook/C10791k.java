package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10791k;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.a94;
import p001o.ao8;
import p001o.cri;
import p001o.hs6;
import p001o.sq8;
import p001o.tt6;
import p001o.vx0;
import p001o.xt6;

/* renamed from: com.facebook.k */
/* loaded from: classes5.dex */
public final class C10791k {

    /* renamed from: a */
    public static final C10791k f11504a = new C10791k();

    /* renamed from: b */
    public static final String f11505b = C10791k.class.getName();

    /* renamed from: c */
    public static final AtomicBoolean f11506c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final AtomicBoolean f11507d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final a f11508e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f */
    public static final a f11509f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g */
    public static final a f11510g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h */
    public static final a f11511h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i */
    public static final a f11512i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j */
    public static SharedPreferences f11513j;

    /* renamed from: com.facebook.k$a */
    public static final class a {

        /* renamed from: a */
        public boolean f11514a;

        /* renamed from: b */
        public String f11515b;

        /* renamed from: c */
        public Boolean f11516c;

        /* renamed from: d */
        public long f11517d;

        public a(boolean z, String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f11514a = z;
            this.f11515b = str;
        }

        /* renamed from: a */
        public final boolean m13174a() {
            return this.f11514a;
        }

        /* renamed from: b */
        public final String m13175b() {
            return this.f11515b;
        }

        /* renamed from: c */
        public final long m13176c() {
            return this.f11517d;
        }

        /* renamed from: d */
        public final Boolean m13177d() {
            return this.f11516c;
        }

        /* renamed from: e */
        public final boolean m13178e() {
            Boolean bool = this.f11516c;
            return bool != null ? bool.booleanValue() : this.f11514a;
        }

        /* renamed from: f */
        public final void m13179f(long j) {
            this.f11517d = j;
        }

        /* renamed from: g */
        public final void m13180g(Boolean bool) {
            this.f11516c = bool;
        }
    }

    /* renamed from: d */
    public static final boolean m13155d() {
        if (a94.m16694d(C10791k.class)) {
            return false;
        }
        try {
            f11504a.m13165j();
            return f11510g.m13178e();
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m13156e() {
        if (a94.m16694d(C10791k.class)) {
            return false;
        }
        try {
            f11504a.m13165j();
            return f11508e.m13178e();
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m13157f() {
        if (a94.m16694d(C10791k.class)) {
            return false;
        }
        try {
            C10791k c10791k = f11504a;
            c10791k.m13165j();
            return c10791k.m13162b();
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m13158g() {
        if (a94.m16694d(C10791k.class)) {
            return false;
        }
        try {
            f11504a.m13165j();
            return f11511h.m13178e();
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
            return false;
        }
    }

    /* renamed from: i */
    public static final void m13159i(long j) {
        tt6 tt6VarM56803u;
        if (a94.m16694d(C10791k.class)) {
            return;
        }
        try {
            if (f11510g.m13178e() && (tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false)) != null && tt6VarM56803u.m50537d()) {
                vx0 vx0VarM53530e = vx0.f50974f.m53530e(C10773c.m13019l());
                String strM53522h = (vx0VarM53530e == null || vx0VarM53530e.m53522h() == null) ? null : vx0VarM53530e.m53522h();
                if (strM53522h != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strM53522h);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(null, "app", null);
                    graphRequestM12913x.m12846G(bundle);
                    JSONObject jSONObjectM13065c = graphRequestM12913x.m12851k().m13065c();
                    if (jSONObjectM13065c != null) {
                        a aVar = f11511h;
                        aVar.m13180g(Boolean.valueOf(jSONObjectM13065c.optBoolean("auto_event_setup_enabled", false)));
                        aVar.m13179f(j);
                        f11504a.m13173t(aVar);
                    }
                }
            }
            f11507d.set(false);
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
        }
    }

    /* renamed from: n */
    public static final void m13160n() {
        if (a94.m16694d(C10791k.class)) {
            return;
        }
        try {
            Context contextM13019l = C10773c.m13019l();
            ApplicationInfo applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
            sq8.m48648g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            ao8 ao8Var = new ao8(contextM13019l);
            Bundle bundle2 = new Bundle();
            if (!cri.m21653V()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            ao8Var.m17561d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
        }
    }

    /* renamed from: q */
    public static final Boolean m13161q() {
        String str = "";
        if (a94.m16694d(C10791k.class)) {
            return null;
        }
        try {
            f11504a.m13172s();
            try {
                SharedPreferences sharedPreferences = f11513j;
                if (sharedPreferences == null) {
                    sq8.m48667z("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(f11509f.m13175b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e) {
                cri.j0(f11505b, e);
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, C10791k.class);
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m13162b() {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            Map mapM56797g = xt6.m56797g();
            if (mapM56797g == null || mapM56797g.isEmpty()) {
                return f11509f.m13178e();
            }
            Boolean bool = (Boolean) mapM56797g.get("auto_log_app_events_enabled");
            Boolean bool2 = (Boolean) mapM56797g.get("auto_log_app_events_default");
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean boolM13163c = m13163c();
            if (boolM13163c != null) {
                return boolM13163c.booleanValue();
            }
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return true;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: c */
    public final Boolean m13163c() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Boolean boolM13161q = m13161q();
            if (boolM13161q != null) {
                return Boolean.valueOf(boolM13161q.booleanValue());
            }
            Boolean boolM13167l = m13167l();
            if (boolM13167l != null) {
                return Boolean.valueOf(boolM13167l.booleanValue());
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: h */
    public final void m13164h() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            a aVar = f11511h;
            m13171r(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.m13177d() == null || jCurrentTimeMillis - aVar.m13176c() >= 604800000) {
                aVar.m13180g(null);
                aVar.m13179f(0L);
                if (f11507d.compareAndSet(false, true)) {
                    C10773c.m13028u().execute(new Runnable() { // from class: o.rpi
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10791k.m13159i(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: j */
    public final void m13165j() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (C10773c.m12993G() && f11506c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                sq8.m48648g(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                f11513j = sharedPreferences;
                m13166k(f11509f, f11510g, f11508e);
                m13164h();
                m13170p();
                m13169o();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: k */
    public final void m13166k(a... aVarArr) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            for (a aVar : aVarArr) {
                if (aVar == f11511h) {
                    m13164h();
                } else if (aVar.m13177d() == null) {
                    m13171r(aVar);
                    if (aVar.m13177d() == null) {
                        m13168m(aVar);
                    }
                } else {
                    m13173t(aVar);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: l */
    public final Boolean m13167l() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            m13172s();
            try {
                Context contextM13019l = C10773c.m13019l();
                ApplicationInfo applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
                sq8.m48648g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f11509f;
                    if (bundle.containsKey(aVar.m13175b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.m13175b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                cri.j0(f11505b, e);
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: m */
    public final void m13168m(a aVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13172s();
            try {
                Context contextM13019l = C10773c.m13019l();
                ApplicationInfo applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
                sq8.m48648g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.m13175b())) {
                    return;
                }
                aVar.m13180g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.m13175b(), aVar.m13174a())));
            } catch (PackageManager.NameNotFoundException e) {
                cri.j0(f11505b, e);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: o */
    public final void m13169o() {
        int i;
        int i2;
        ApplicationInfo applicationInfo;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f11506c.get() && C10773c.m12993G()) {
                Context contextM13019l = C10773c.m13019l();
                int i3 = 0;
                int i4 = ((f11508e.m13178e() ? 1 : 0) << 0) | 0 | ((f11509f.m13178e() ? 1 : 0) << 1) | ((f11510g.m13178e() ? 1 : 0) << 2) | ((f11512i.m13178e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f11513j;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    sq8.m48667z("userSettingPref");
                    sharedPreferences = null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences3 = f11513j;
                    if (sharedPreferences3 == null) {
                        sq8.m48667z("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
                        sq8.m48648g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i2 = 0;
                        ao8 ao8Var = new ao8(contextM13019l);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i3);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i5);
                        bundle.putInt("current", i4);
                        ao8Var.m17559b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i2 = 0;
                    i = 0;
                    for (int i6 = 0; i6 < 4; i6++) {
                        try {
                            i |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                            i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i3 = i2;
                            i2 = i3;
                            i3 = i;
                            ao8 ao8Var2 = new ao8(contextM13019l);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i3);
                            bundle2.putInt("initial", i2);
                            bundle2.putInt("previous", i5);
                            bundle2.putInt("current", i4);
                            ao8Var2.m17559b(bundle2);
                        }
                    }
                    i3 = i;
                    ao8 ao8Var22 = new ao8(contextM13019l);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i3);
                    bundle22.putInt("initial", i2);
                    bundle22.putInt("previous", i5);
                    bundle22.putInt("current", i4);
                    ao8Var22.m17559b(bundle22);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: p */
    public final void m13170p() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Context contextM13019l = C10773c.m13019l();
            ApplicationInfo applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
            sq8.m48648g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                m13155d();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: r */
    public final void m13171r(a aVar) {
        String str = "";
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13172s();
            try {
                SharedPreferences sharedPreferences = f11513j;
                if (sharedPreferences == null) {
                    sq8.m48667z("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(aVar.m13175b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.m13180g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.m13179f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e) {
                cri.j0(f11505b, e);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: s */
    public final void m13172s() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f11506c.get()) {
            } else {
                throw new hs6("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: t */
    public final void m13173t(a aVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13172s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.m13177d());
                jSONObject.put("last_timestamp", aVar.m13176c());
                SharedPreferences sharedPreferences = f11513j;
                if (sharedPreferences == null) {
                    sq8.m48667z("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(aVar.m13175b(), jSONObject.toString()).apply();
                m13169o();
            } catch (Exception e) {
                cri.j0(f11505b, e);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
