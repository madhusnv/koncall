package p001o;

import android.app.Activity;
import com.facebook.C10773c;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.mjb;

/* loaded from: classes5.dex */
public final class bcg {

    /* renamed from: a */
    public static final bcg f15935a = new bcg();

    /* renamed from: b */
    public static final AtomicBoolean f15936b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final Set f15937c = new LinkedHashSet();

    /* renamed from: d */
    public static final Set f15938d = new LinkedHashSet();

    /* renamed from: b */
    public static final synchronized void m18618b() {
        if (a94.m16694d(bcg.class)) {
            return;
        }
        try {
            C10773c.m13028u().execute(new Runnable() { // from class: o.acg
                @Override // java.lang.Runnable
                public final void run() {
                    bcg.m18619c();
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, bcg.class);
        }
    }

    /* renamed from: c */
    public static final void m18619c() {
        if (a94.m16694d(bcg.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f15936b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f15935a.m18623d();
        } catch (Throwable th) {
            a94.m16692b(th, bcg.class);
        }
    }

    /* renamed from: e */
    public static final boolean m18620e(String str) {
        if (a94.m16694d(bcg.class)) {
            return false;
        }
        try {
            sq8.m48649h(str, "event");
            return f15938d.contains(str);
        } catch (Throwable th) {
            a94.m16692b(th, bcg.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m18621f(String str) {
        if (a94.m16694d(bcg.class)) {
            return false;
        }
        try {
            sq8.m48649h(str, "event");
            return f15937c.contains(str);
        } catch (Throwable th) {
            a94.m16692b(th, bcg.class);
            return false;
        }
    }

    /* renamed from: h */
    public static final void m18622h(Activity activity) {
        if (a94.m16694d(bcg.class)) {
            return;
        }
        try {
            sq8.m48649h(activity, "activity");
            try {
                if (f15936b.get() && it6.m32710f() && (!f15937c.isEmpty() || !f15938d.isEmpty())) {
                    pxi.f40713d.m44278a(activity);
                } else {
                    pxi.f40713d.m44279b(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, bcg.class);
        }
    }

    /* renamed from: d */
    public final void m18623d() {
        String strM50557x;
        File fileM39193l;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null || (strM50557x = tt6VarM56803u.m50557x()) == null) {
                return;
            }
            m18624g(strM50557x);
            if (((!f15937c.isEmpty()) || (!f15938d.isEmpty())) && (fileM39193l = mjb.m39193l(mjb.EnumC15341a.MTML_APP_EVENT_PREDICTION)) != null) {
                it6.m32709d(fileM39193l);
                Activity activityM54767m = wp.m54767m();
                if (activityM54767m != null) {
                    m18622h(activityM54767m);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m18624g(String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Set set = f15937c;
                    String string = jSONArray.getString(i);
                    sq8.m48648g(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    Set set2 = f15938d;
                    String string2 = jSONArray2.getString(i2);
                    sq8.m48648g(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
