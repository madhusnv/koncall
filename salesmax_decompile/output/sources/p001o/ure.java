package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ure {

    /* renamed from: b */
    public static boolean f49411b;

    /* renamed from: a */
    public static final ure f49410a = new ure();

    /* renamed from: c */
    public static final String f49412c = ure.class.getCanonicalName();

    /* renamed from: d */
    public static final List f49413d = new ArrayList();

    /* renamed from: e */
    public static final Set f49414e = new CopyOnWriteArraySet();

    /* renamed from: o.ure$a */
    public static final class C17438a {

        /* renamed from: a */
        public String f49415a;

        /* renamed from: b */
        public Map f49416b;

        public C17438a(String str, Map map) {
            sq8.m48649h(str, "eventName");
            sq8.m48649h(map, "restrictiveParams");
            this.f49415a = str;
            this.f49416b = map;
        }

        /* renamed from: a */
        public final String m51972a() {
            return this.f49415a;
        }

        /* renamed from: b */
        public final Map m51973b() {
            return this.f49416b;
        }

        /* renamed from: c */
        public final void m51974c(Map map) {
            sq8.m48649h(map, "<set-?>");
            this.f49416b = map;
        }
    }

    /* renamed from: a */
    public static final void m51966a() {
        if (a94.m16694d(ure.class)) {
            return;
        }
        try {
            f49411b = true;
            f49410a.m51970c();
        } catch (Throwable th) {
            a94.m16692b(th, ure.class);
        }
    }

    /* renamed from: e */
    public static final String m51967e(String str) {
        if (a94.m16694d(ure.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "eventName");
            return f49411b ? f49410a.m51971d(str) ? "_removed_" : str : str;
        } catch (Throwable th) {
            a94.m16692b(th, ure.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m51968f(Map map, String str) {
        if (a94.m16694d(ure.class)) {
            return;
        }
        try {
            sq8.m48649h(map, "parameters");
            sq8.m48649h(str, "eventName");
            if (f49411b) {
                HashMap map2 = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String strM51969b = f49410a.m51969b(str, str2);
                    if (strM51969b != null) {
                        map2.put(str2, strM51969b);
                        map.remove(str2);
                    }
                }
                if (!map2.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, ure.class);
        }
    }

    /* renamed from: b */
    public final String m51969b(String str, String str2) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            for (C17438a c17438a : new ArrayList(f49413d)) {
                if (c17438a != null && sq8.m48644c(str, c17438a.m51972a())) {
                    for (String str3 : c17438a.m51973b().keySet()) {
                        if (sq8.m48644c(str2, str3)) {
                            return (String) c17438a.m51973b().get(str3);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
        return null;
    }

    /* renamed from: c */
    public final void m51970c() {
        String strM50551r;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null || (strM50551r = tt6VarM56803u.m50551r()) == null) {
                return;
            }
            if (strM50551r.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM50551r);
            f49413d.clear();
            f49414e.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    sq8.m48648g(next, TransferTable.COLUMN_KEY);
                    C17438a c17438a = new C17438a(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c17438a.m51974c(cri.m21669p(jSONObjectOptJSONObject));
                        f49413d.add(c17438a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f49414e.add(c17438a.m51972a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: d */
    public final boolean m51971d(String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return f49414e.contains(str);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
