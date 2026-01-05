package p001o;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.mt6;
import p001o.rl0;

/* loaded from: classes5.dex */
public final class ghf {

    /* renamed from: f */
    public static final C13723a f25219f = new C13723a(null);

    /* renamed from: g */
    public static final String f25220g = ghf.class.getSimpleName();

    /* renamed from: h */
    public static final int f25221h = 1000;

    /* renamed from: a */
    public final vx0 f25222a;

    /* renamed from: b */
    public final String f25223b;

    /* renamed from: c */
    public List f25224c;

    /* renamed from: d */
    public final List f25225d;

    /* renamed from: e */
    public int f25226e;

    /* renamed from: o.ghf$a */
    public static final class C13723a {
        public C13723a() {
        }

        public /* synthetic */ C13723a(id5 id5Var) {
            this();
        }
    }

    public ghf(vx0 vx0Var, String str) {
        sq8.m48649h(vx0Var, "attributionIdentifiers");
        sq8.m48649h(str, "anonymousAppDeviceGUID");
        this.f25222a = vx0Var;
        this.f25223b = str;
        this.f25224c = new ArrayList();
        this.f25225d = new ArrayList();
    }

    /* renamed from: a */
    public final synchronized void m28718a(tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(tk0Var, "event");
            if (this.f25224c.size() + this.f25225d.size() >= f25221h) {
                this.f25226e++;
            } else {
                this.f25224c.add(tk0Var);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: b */
    public final synchronized void m28719b(boolean z) {
        if (a94.m16694d(this)) {
            return;
        }
        if (!z) {
            this.f25225d.clear();
            this.f25226e = 0;
            return;
        }
        try {
            this.f25224c.addAll(this.f25225d);
            this.f25225d.clear();
            this.f25226e = 0;
            return;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return;
        }
    }

    /* renamed from: c */
    public final synchronized int m28720c() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return this.f25224c.size();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: d */
    public final synchronized List m28721d() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            List list = this.f25224c;
            this.f25224c = new ArrayList();
            return list;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final int m28722e(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            sq8.m48649h(graphRequest, "request");
            sq8.m48649h(context, "applicationContext");
            synchronized (this) {
                int i = this.f25226e;
                zj6.m59510d(this.f25224c);
                this.f25225d.addAll(this.f25224c);
                this.f25224c.clear();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (tk0 tk0Var : this.f25225d) {
                    if (z || !tk0Var.m50097h()) {
                        jSONArray.put(tk0Var.m50094e());
                        jSONArray2.put(tk0Var.m50096g());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                y3i y3iVar = y3i.f54824a;
                m28723f(graphRequest, context, i, jSONArray, jSONArray2, z2);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: f */
    public final void m28723f(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                jSONObject = rl0.m46900a(rl0.EnumC16619a.CUSTOM_APP_EVENTS, this.f25222a, this.f25223b, z, context);
                if (this.f25226e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.m12844E(jSONObject);
            Bundle bundleM12861u = graphRequest.m12861u();
            String string = jSONArray.toString();
            sq8.m48648g(string, "events.toString()");
            bundleM12861u.putString("custom_events", string);
            if (mt6.m39648g(mt6.EnumC15426c.IapLoggingLib5To7)) {
                bundleM12861u.putString("operational_parameters", jSONArray2.toString());
            }
            graphRequest.m12847H(string);
            graphRequest.m12846G(bundleM12861u);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
