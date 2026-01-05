package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sja;

/* loaded from: classes5.dex */
public final class tk0 implements Serializable {

    /* renamed from: f */
    public static final C17146a f47320f = new C17146a(null);

    /* renamed from: g */
    public static final HashSet f47321g = new HashSet();

    /* renamed from: a */
    public final JSONObject f47322a;

    /* renamed from: b */
    public final JSONObject f47323b;

    /* renamed from: c */
    public final boolean f47324c;

    /* renamed from: d */
    public final boolean f47325d;

    /* renamed from: e */
    public final String f47326e;

    /* renamed from: o.tk0$a */
    public static final class C17146a {
        public C17146a() {
        }

        public /* synthetic */ C17146a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m50099a(String str) {
            boolean zContains;
            sq8.m48649h(str, "identifier");
            if ((str.length() == 0) || str.length() > 40) {
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                sq8.m48648g(str2, "format(locale, format, *args)");
                throw new ur6(str2);
            }
            synchronized (tk0.f47321g) {
                zContains = tk0.f47321g.contains(str);
                y3i y3iVar = y3i.f54824a;
            }
            if (zContains) {
                return;
            }
            if (new mge("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m38995g(str)) {
                synchronized (tk0.f47321g) {
                    tk0.f47321g.add(str);
                }
            } else {
                h8g h8gVar2 = h8g.f26398a;
                String str3 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                sq8.m48648g(str3, "format(format, *args)");
                throw new ur6(str3);
            }
        }
    }

    /* renamed from: o.tk0$b */
    public static final class C17147b implements Serializable {

        /* renamed from: e */
        public static final a f47327e = new a(null);

        /* renamed from: a */
        public final String f47328a;

        /* renamed from: b */
        public final String f47329b;

        /* renamed from: c */
        public final boolean f47330c;

        /* renamed from: d */
        public final boolean f47331d;

        /* renamed from: o.tk0$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C17147b(String str, String str2, boolean z, boolean z2) {
            sq8.m48649h(str, "jsonString");
            sq8.m48649h(str2, "operationalJsonString");
            this.f47328a = str;
            this.f47329b = str2;
            this.f47330c = z;
            this.f47331d = z2;
        }

        private final Object readResolve() {
            return new tk0(this.f47328a, this.f47329b, this.f47330c, this.f47331d, null);
        }
    }

    public /* synthetic */ tk0(String str, String str2, boolean z, boolean z2, id5 id5Var) {
        this(str, str2, z, z2);
    }

    /* renamed from: j */
    public static /* synthetic */ Map m50090j(tk0 tk0Var, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return tk0Var.m50098i(bundle, z);
    }

    private final Object writeReplace() {
        String string = this.f47322a.toString();
        sq8.m48648g(string, "jsonObject.toString()");
        String string2 = this.f47323b.toString();
        sq8.m48648g(string2, "operationalJsonObject.toString()");
        return new C17147b(string, string2, this.f47324c, this.f47325d);
    }

    /* renamed from: b */
    public final boolean m50091b() {
        return this.f47324c;
    }

    /* renamed from: c */
    public final JSONObject m50092c() {
        return this.f47322a;
    }

    /* renamed from: d */
    public final JSONObject m50093d(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        f47320f.m50099a(str2);
        JSONObject jSONObject = new JSONObject();
        String strM51967e = ure.m51967e(str2);
        if (sq8.m48644c(strM51967e, str2)) {
            strM51967e = bge.m18889d(str2);
        }
        jSONObject.put("_eventName", strM51967e);
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map mapM50090j = m50090j(this, bundle, false, 2, null);
            for (String str3 : mapM50090j.keySet()) {
                jSONObject.put(str3, mapM50090j.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f47325d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f47324c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String string = jSONObject.toString();
            sq8.m48648g(string, "eventObject.toString()");
            c16851a.m48388c(bkaVar, "AppEvents", "Created app event '%s'", string);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final JSONObject m50094e() {
        return this.f47322a;
    }

    /* renamed from: f */
    public final String m50095f() {
        return this.f47326e;
    }

    /* renamed from: g */
    public final JSONObject m50096g() {
        return this.f47323b;
    }

    /* renamed from: h */
    public final boolean m50097h() {
        return this.f47324c;
    }

    /* renamed from: i */
    public final Map m50098i(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            C17146a c17146a = f47320f;
            sq8.m48648g(str, TransferTable.COLUMN_KEY);
            c17146a.m50099a(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                sq8.m48648g(str2, "format(format, *args)");
                throw new ur6(str2);
            }
            map.put(str, obj.toString());
        }
        if (!z) {
            qn8.m45703c(map);
            ure.m51968f(azh.m18051d(map), this.f47326e);
            zj6.m59509c(azh.m18051d(map), this.f47326e);
        }
        return map;
    }

    public String toString() {
        h8g h8gVar = h8g.f26398a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f47322a.optString("_eventName"), Boolean.valueOf(this.f47324c), this.f47322a.toString()}, 3));
        sq8.m48648g(str, "format(format, *args)");
        return str;
    }

    public tk0(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, eec eecVar) {
        JSONObject jSONObjectM24864e;
        sq8.m48649h(str, "contextName");
        sq8.m48649h(str2, "eventName");
        this.f47324c = z;
        this.f47325d = z2;
        this.f47326e = str2;
        this.f47323b = (eecVar == null || (jSONObjectM24864e = eecVar.m24864e()) == null) ? new JSONObject() : jSONObjectM24864e;
        this.f47322a = m50093d(str, str2, d, bundle, uuid);
    }

    public tk0(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f47322a = jSONObject;
        this.f47323b = new JSONObject(str2);
        this.f47324c = z;
        String strOptString = jSONObject.optString("_eventName");
        sq8.m48648g(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f47326e = strOptString;
        this.f47325d = z2;
    }
}
