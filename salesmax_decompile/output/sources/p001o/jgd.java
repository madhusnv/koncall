package p001o;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.C10773c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jgd {

    /* renamed from: c */
    public static SharedPreferences f30408c;

    /* renamed from: a */
    public static final jgd f30406a = new jgd();

    /* renamed from: b */
    public static final Map f30407b = new LinkedHashMap();

    /* renamed from: d */
    public static final AtomicBoolean f30409d = new AtomicBoolean(false);

    /* renamed from: a */
    public static final void m33802a(String str, String str2) {
        if (a94.m16694d(jgd.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "pathID");
            sq8.m48649h(str2, "predictedEvent");
            if (!f30409d.get()) {
                f30406a.m33805c();
            }
            Map map = f30407b;
            map.put(str, str2);
            SharedPreferences sharedPreferences = f30408c;
            if (sharedPreferences == null) {
                sq8.m48667z("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", cri.m0(isa.m32693t(map))).apply();
        } catch (Throwable th) {
            a94.m16692b(th, jgd.class);
        }
    }

    /* renamed from: b */
    public static final String m33803b(View view, String str) {
        if (a94.m16694d(jgd.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            sq8.m48649h(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = owi.m42739j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return cri.G0(jSONObject.toString());
        } catch (Throwable th) {
            a94.m16692b(th, jgd.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m33804d(String str) {
        if (a94.m16694d(jgd.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "pathID");
            Map map = f30407b;
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, jgd.class);
            return null;
        }
    }

    /* renamed from: c */
    public final void m33805c() {
        String str = "";
        if (a94.m16694d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f30409d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sq8.m48648g(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            f30408c = sharedPreferences;
            Map map = f30407b;
            if (sharedPreferences == null) {
                sq8.m48667z("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(cri.i0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
