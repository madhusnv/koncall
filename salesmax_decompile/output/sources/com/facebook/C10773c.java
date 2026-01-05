package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.google.android.gms.cast.MediaStatus;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.a94;
import p001o.bka;
import p001o.cgf;
import p001o.cri;
import p001o.e9g;
import p001o.h8g;
import p001o.hh8;
import p001o.im0;
import p001o.mm0;
import p001o.mt6;
import p001o.nif;
import p001o.nl0;
import p001o.obc;
import p001o.oia;
import p001o.pk8;
import p001o.ql0;
import p001o.rl0;
import p001o.rri;
import p001o.sja;
import p001o.sq8;
import p001o.srb;
import p001o.st6;
import p001o.ur6;
import p001o.vx0;
import p001o.wp;
import p001o.xt6;
import p001o.y3i;

/* renamed from: com.facebook.c */
/* loaded from: classes5.dex */
public final class C10773c {

    /* renamed from: d */
    public static Executor f11399d;

    /* renamed from: e */
    public static volatile String f11400e;

    /* renamed from: f */
    public static volatile String f11401f;

    /* renamed from: g */
    public static volatile String f11402g;

    /* renamed from: h */
    public static volatile Boolean f11403h;

    /* renamed from: j */
    public static volatile boolean f11405j;

    /* renamed from: k */
    public static boolean f11406k;

    /* renamed from: l */
    public static oia f11407l;

    /* renamed from: m */
    public static Context f11408m;

    /* renamed from: q */
    public static boolean f11412q;

    /* renamed from: r */
    public static boolean f11413r;

    /* renamed from: s */
    public static boolean f11414s;

    /* renamed from: x */
    public static boolean f11419x;

    /* renamed from: a */
    public static final C10773c f11396a = new C10773c();

    /* renamed from: b */
    public static final String f11397b = C10773c.class.getCanonicalName();

    /* renamed from: c */
    public static final HashSet f11398c = nif.m40665f(bka.DEVELOPER_ERRORS);

    /* renamed from: i */
    public static AtomicLong f11404i = new AtomicLong(MediaStatus.COMMAND_FOLLOW);

    /* renamed from: n */
    public static int f11409n = 64206;

    /* renamed from: o */
    public static final ReentrantLock f11410o = new ReentrantLock();

    /* renamed from: p */
    public static String f11411p = cgf.m21200a();

    /* renamed from: t */
    public static final AtomicBoolean f11415t = new AtomicBoolean(false);

    /* renamed from: u */
    public static volatile String f11416u = "instagram.com";

    /* renamed from: v */
    public static volatile String f11417v = "facebook.com";

    /* renamed from: w */
    public static a f11418w = new a() { // from class: o.fs6
        @Override // com.facebook.C10773c.a
        /* renamed from: a */
        public final GraphRequest mo13035a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC10763b interfaceC10763b) {
            return C10773c.m12990D(accessToken, str, jSONObject, interfaceC10763b);
        }
    };

    /* renamed from: com.facebook.c$a */
    public interface a {
        /* renamed from: a */
        GraphRequest mo13035a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC10763b interfaceC10763b);
    }

    /* renamed from: com.facebook.c$b */
    public interface b {
        /* renamed from: a */
        void m13036a();
    }

    /* renamed from: A */
    public static final boolean m12987A(Context context) {
        sq8.m48649h(context, "context");
        rri.m47117l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: B */
    public static final long m12988B() {
        rri.m47117l();
        return f11404i.get();
    }

    /* renamed from: C */
    public static final String m12989C() {
        return "18.0.3";
    }

    /* renamed from: D */
    public static final GraphRequest m12990D(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC10763b interfaceC10763b) {
        return GraphRequest.f11338n.m12882A(accessToken, str, jSONObject, interfaceC10763b);
    }

    /* renamed from: E */
    public static final boolean m12991E() {
        return f11405j;
    }

    /* renamed from: F */
    public static final synchronized boolean m12992F() {
        return f11419x;
    }

    /* renamed from: G */
    public static final boolean m12993G() {
        return f11415t.get();
    }

    /* renamed from: H */
    public static final boolean m12994H() {
        return f11406k;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m12995I(bka bkaVar) {
        boolean z;
        sq8.m48649h(bkaVar, "behavior");
        HashSet hashSet = f11398c;
        synchronized (hashSet) {
            if (m12991E()) {
                z = hashSet.contains(bkaVar);
            }
        }
        return z;
    }

    /* renamed from: J */
    public static final void m12996J(Context context) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            sq8.m48648g(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f11400e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    sq8.m48648g(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (e9g.m24597K(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        sq8.m48648g(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f11400e = strSubstring;
                    } else {
                        f11400e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new ur6("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f11401f == null) {
                f11401f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f11402g == null) {
                f11402g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f11409n == 64206) {
                f11409n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f11403h == null) {
                f11403h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: L */
    public static final void m12997L(Context context, final String str) {
        if (a94.m16694d(C10773c.class)) {
            return;
        }
        try {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            if (!st6.m48897d("app_events_killswitch", m13020m(), false)) {
                m13028u().execute(new Runnable() { // from class: o.gs6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10773c.m12998M(applicationContext, str);
                    }
                });
            }
            if (mt6.m39648g(mt6.EnumC15426c.OnDeviceEventProcessing) && obc.m41917d()) {
                obc.m41920g(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            a94.m16692b(th, C10773c.class);
        }
    }

    /* renamed from: M */
    public static final void m12998M(Context context, String str) {
        sq8.m48649h(context, "$applicationContext");
        sq8.m48649h(str, "$applicationId");
        f11396a.m13034K(context, str);
    }

    /* renamed from: N */
    public static final synchronized void m12999N(Context context) {
        sq8.m48649h(context, "applicationContext");
        m13000O(context, null);
    }

    /* renamed from: O */
    public static final synchronized void m13000O(Context context, final b bVar) {
        sq8.m48649h(context, "applicationContext");
        AtomicBoolean atomicBoolean = f11415t;
        if (atomicBoolean.get()) {
            if (bVar != null) {
                bVar.m13036a();
            }
            return;
        }
        rri.m47110e(context, false);
        rri.m47111f(context, false);
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "applicationContext.applicationContext");
        f11408m = applicationContext;
        nl0.f36985b.m40735b(context);
        Context context2 = f11408m;
        Context context3 = null;
        if (context2 == null) {
            sq8.m48667z("applicationContext");
            context2 = null;
        }
        m12996J(context2);
        String str = f11400e;
        if (str == null || str.length() == 0) {
            throw new ur6("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f11402g;
        if (str2 == null || str2.length() == 0) {
            throw new ur6("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (m13022o()) {
            m13017j();
        }
        Context context4 = f11408m;
        if (context4 == null) {
            sq8.m48667z("applicationContext");
            context4 = null;
        }
        if ((context4 instanceof Application) && C10791k.m13157f()) {
            Context context5 = f11408m;
            if (context5 == null) {
                sq8.m48667z("applicationContext");
                context5 = null;
            }
            wp.m54777z((Application) context5, f11400e);
        } else {
            hh8.m30458i();
        }
        mm0 mm0VarM39336a = mm0.f35670b.m39336a();
        if (mm0VarM39336a != null) {
            Context context6 = f11408m;
            if (context6 == null) {
                sq8.m48667z("applicationContext");
                context6 = null;
            }
            mm0VarM39336a.m39335i((Application) context6);
        }
        xt6.m56798h();
        srb.m48796z();
        BoltsMeasurementEventListener.C10780a c10780a = BoltsMeasurementEventListener.f11459b;
        Context context7 = f11408m;
        if (context7 == null) {
            sq8.m48667z("applicationContext");
        } else {
            context3 = context7;
        }
        c10780a.m13099a(context3);
        f11407l = new oia(new Callable() { // from class: o.yr6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10773c.m13001P();
            }
        });
        mt6.m39645a(mt6.EnumC15426c.Instrument, new mt6.InterfaceC15425b() { // from class: o.zr6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                C10773c.m13002Q(z);
            }
        });
        mt6.m39645a(mt6.EnumC15426c.AppEvents, new mt6.InterfaceC15425b() { // from class: o.as6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                C10773c.m13003R(z);
            }
        });
        mt6.m39645a(mt6.EnumC15426c.ChromeCustomTabsPrefetching, new mt6.InterfaceC15425b() { // from class: o.bs6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                C10773c.m13004S(z);
            }
        });
        mt6.m39645a(mt6.EnumC15426c.IgnoreAppSwitchToLoggedOut, new mt6.InterfaceC15425b() { // from class: o.cs6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                C10773c.m13005T(z);
            }
        });
        mt6.m39645a(mt6.EnumC15426c.BypassAppSwitch, new mt6.InterfaceC15425b() { // from class: o.ds6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                C10773c.m13006U(z);
            }
        });
        m13028u().execute(new FutureTask(new Callable(bVar) { // from class: o.es6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10773c.m13007V(null);
            }
        }));
    }

    /* renamed from: P */
    public static final File m13001P() {
        Context context = f11408m;
        if (context == null) {
            sq8.m48667z("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    /* renamed from: Q */
    public static final void m13002Q(boolean z) {
        if (z) {
            pk8.m43806d();
        }
    }

    /* renamed from: R */
    public static final void m13003R(boolean z) {
        if (z) {
            im0.m32272a();
        }
    }

    /* renamed from: S */
    public static final void m13004S(boolean z) {
        if (z) {
            f11412q = true;
        }
    }

    /* renamed from: T */
    public static final void m13005T(boolean z) {
        if (z) {
            f11413r = true;
        }
    }

    /* renamed from: U */
    public static final void m13006U(boolean z) {
        if (z) {
            f11414s = true;
        }
    }

    /* renamed from: V */
    public static final Void m13007V(b bVar) {
        C10772b.f11380f.m12973e().m12961j();
        C10778h.f11447d.m13090a().m13086d();
        if (AccessToken.f11242y.m12776g()) {
            Profile.C10770b c10770b = Profile.f11367h;
            if (c10770b.m12935b() == null) {
                c10770b.m12934a();
            }
        }
        if (bVar != null) {
            bVar.m13036a();
        }
        nl0.C15598a c15598a = nl0.f36985b;
        c15598a.m40738e(m13019l(), f11400e);
        C10791k.m13160n();
        Context applicationContext = m13019l().getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext().applicationContext");
        c15598a.m40739f(applicationContext).m40732a();
        return null;
    }

    /* renamed from: j */
    public static final void m13017j() {
        f11419x = true;
    }

    /* renamed from: k */
    public static final boolean m13018k() {
        return C10791k.m13155d();
    }

    /* renamed from: l */
    public static final Context m13019l() {
        rri.m47117l();
        Context context = f11408m;
        if (context != null) {
            return context;
        }
        sq8.m48667z("applicationContext");
        return null;
    }

    /* renamed from: m */
    public static final String m13020m() {
        rri.m47117l();
        String str = f11400e;
        if (str != null) {
            return str;
        }
        throw new ur6("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* renamed from: n */
    public static final String m13021n() {
        rri.m47117l();
        return f11401f;
    }

    /* renamed from: o */
    public static final boolean m13022o() {
        return C10791k.m13156e();
    }

    /* renamed from: p */
    public static final boolean m13023p() {
        return C10791k.m13157f();
    }

    /* renamed from: q */
    public static final File m13024q() {
        rri.m47117l();
        oia oiaVar = f11407l;
        if (oiaVar == null) {
            sq8.m48667z("cacheDir");
            oiaVar = null;
        }
        return (File) oiaVar.m42265c();
    }

    /* renamed from: r */
    public static final int m13025r() {
        rri.m47117l();
        return f11409n;
    }

    /* renamed from: s */
    public static final String m13026s() {
        rri.m47117l();
        String str = f11402g;
        if (str != null) {
            return str;
        }
        throw new ur6("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* renamed from: t */
    public static final boolean m13027t() {
        return C10791k.m13158g();
    }

    /* renamed from: u */
    public static final Executor m13028u() {
        ReentrantLock reentrantLock = f11410o;
        reentrantLock.lock();
        try {
            if (f11399d == null) {
                f11399d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            y3i y3iVar = y3i.f54824a;
            reentrantLock.unlock();
            Executor executor = f11399d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: v */
    public static final String m13029v() {
        return f11417v;
    }

    /* renamed from: w */
    public static final String m13030w() {
        return "fb.gg";
    }

    /* renamed from: x */
    public static final String m13031x() {
        String str = f11397b;
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f11411p}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        cri.k0(str, str2);
        return f11411p;
    }

    /* renamed from: y */
    public static final String m13032y() {
        AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
        return cri.m21644F(accessTokenM12774e != null ? accessTokenM12774e.m12756h() : null);
    }

    /* renamed from: z */
    public static final String m13033z() {
        return f11416u;
    }

    /* renamed from: K */
    public final void m13034K(Context context, String str) {
        try {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                vx0 vx0VarM53530e = vx0.f50974f.m53530e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0L);
                try {
                    JSONObject jSONObjectM46900a = rl0.m46900a(rl0.EnumC16619a.MOBILE_INSTALL_EVENT, vx0VarM53530e, nl0.f36985b.m40735b(context), m12987A(context), context);
                    String strM45620l = ql0.f42105c.m45620l();
                    if (strM45620l != null) {
                        jSONObjectM46900a.put("install_referrer", strM45620l);
                    }
                    h8g h8gVar = h8g.f26398a;
                    String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    sq8.m48648g(str3, "format(format, *args)");
                    GraphRequest graphRequestMo13035a = f11418w.mo13035a(null, str3, jSONObjectM46900a, null);
                    if (j == 0 && graphRequestMo13035a.m12851k().m13064b() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str2, System.currentTimeMillis());
                        editorEdit.apply();
                        sja.C16851a c16851a = sja.f45482e;
                        bka bkaVar = bka.APP_EVENTS;
                        String str4 = f11397b;
                        sq8.m48648g(str4, "TAG");
                        c16851a.m48387b(bkaVar, str4, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e) {
                    throw new ur6("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                cri.j0("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
