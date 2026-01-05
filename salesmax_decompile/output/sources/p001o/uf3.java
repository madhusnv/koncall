package p001o;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.twi;

/* loaded from: classes5.dex */
public final class uf3 {

    /* renamed from: c */
    public static SensorManager f48871c;

    /* renamed from: d */
    public static swi f48872d;

    /* renamed from: e */
    public static String f48873e;

    /* renamed from: h */
    public static volatile boolean f48876h;

    /* renamed from: a */
    public static final uf3 f48869a = new uf3();

    /* renamed from: b */
    public static final twi f48870b = new twi();

    /* renamed from: f */
    public static final AtomicBoolean f48874f = new AtomicBoolean(true);

    /* renamed from: g */
    public static final AtomicBoolean f48875g = new AtomicBoolean(false);

    /* renamed from: d */
    public static final void m51518d(String str) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            vx0 vx0VarM53530e = vx0.f50974f.m53530e(C10773c.m13019l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((vx0VarM53530e != null ? vx0VarM53530e.m53522h() : null) != null) {
                jSONArray.put(vx0VarM53530e.m53522h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(gl0.m28971e() ? "1" : "0");
            Locale localeM21642B = cri.m21642B();
            jSONArray.put(localeM21642B.getLanguage() + '_' + localeM21642B.getCountry());
            String string = jSONArray.toString();
            sq8.m48648g(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", m51521g());
            bundle.putString("extinfo", string);
            GraphRequest.C10764c c10764c = GraphRequest.f11338n;
            h8g h8gVar = h8g.f26398a;
            boolean z = true;
            String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            sq8.m48648g(str3, "format(locale, format, *args)");
            JSONObject jSONObjectM13065c = c10764c.m12883B(null, str3, bundle, null).m12851k().m13065c();
            AtomicBoolean atomicBoolean = f48875g;
            if (jSONObjectM13065c == null || !jSONObjectM13065c.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (atomicBoolean.get()) {
                swi swiVar = f48872d;
                if (swiVar != null) {
                    swiVar.m49037h();
                }
            } else {
                f48873e = null;
            }
            f48876h = false;
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: e */
    public static final void m51519e() {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            f48874f.set(false);
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: f */
    public static final void m51520f() {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            f48874f.set(true);
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: g */
    public static final String m51521g() {
        if (a94.m16694d(uf3.class)) {
            return null;
        }
        try {
            if (f48873e == null) {
                f48873e = UUID.randomUUID().toString();
            }
            String str = f48873e;
            sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final boolean m51522h() {
        if (a94.m16694d(uf3.class)) {
            return false;
        }
        try {
            return f48875g.get();
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
            return false;
        }
    }

    /* renamed from: j */
    public static final void m51523j(Activity activity) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            wf3.f51880f.m54305a().m54301f(activity);
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: k */
    public static final void m51524k(Activity activity) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            if (f48874f.get()) {
                wf3.f51880f.m54305a().m54303h(activity);
                swi swiVar = f48872d;
                if (swiVar != null) {
                    swiVar.m49039l();
                }
                SensorManager sensorManager = f48871c;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(f48870b);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: l */
    public static final void m51525l(Activity activity) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            if (f48874f.get()) {
                wf3.f51880f.m54305a().m54300e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strM13020m = C10773c.m13020m();
                final tt6 tt6VarM56796f = xt6.m56796f(strM13020m);
                boolean z = false;
                if (tt6VarM56796f != null && tt6VarM56796f.m50537d()) {
                    z = true;
                }
                if (z || f48869a.m51529i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f48871c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    swi swiVar = new swi(activity);
                    f48872d = swiVar;
                    twi twiVar = f48870b;
                    twiVar.m50735a(new twi.InterfaceC17248b() { // from class: o.sf3
                        @Override // p001o.twi.InterfaceC17248b
                        /* renamed from: a */
                        public final void mo48288a() {
                            uf3.m51526m(tt6VarM56796f, strM13020m);
                        }
                    });
                    sensorManager.registerListener(twiVar, defaultSensor, 2);
                    if (tt6VarM56796f != null && tt6VarM56796f.m50537d()) {
                        swiVar.m49037h();
                    }
                }
                uf3 uf3Var = f48869a;
                if (!uf3Var.m51529i() || f48875g.get()) {
                    return;
                }
                uf3Var.m51528c(strM13020m);
            }
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: m */
    public static final void m51526m(tt6 tt6Var, String str) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$appId");
            boolean z = tt6Var != null && tt6Var.m50537d();
            boolean zM13027t = C10773c.m13027t();
            if (z && zM13027t) {
                f48869a.m51528c(str);
            }
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: n */
    public static final void m51527n(boolean z) {
        if (a94.m16694d(uf3.class)) {
            return;
        }
        try {
            f48875g.set(z);
        } catch (Throwable th) {
            a94.m16692b(th, uf3.class);
        }
    }

    /* renamed from: c */
    public final void m51528c(final String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f48876h) {
                return;
            }
            f48876h = true;
            C10773c.m13028u().execute(new Runnable() { // from class: o.tf3
                @Override // java.lang.Runnable
                public final void run() {
                    uf3.m51518d(str);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final boolean m51529i() {
        a94.m16694d(this);
        return false;
    }
}
