package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zj6 {

    /* renamed from: b */
    public static boolean f57277b;

    /* renamed from: a */
    public static final zj6 f57276a = new zj6();

    /* renamed from: c */
    public static final List f57278c = new ArrayList();

    /* renamed from: d */
    public static final Set f57279d = new HashSet();

    /* renamed from: o.zj6$a */
    public static final class C18658a {

        /* renamed from: a */
        public String f57280a;

        /* renamed from: b */
        public List f57281b;

        public C18658a(String str, List list) {
            sq8.m48649h(str, "eventName");
            sq8.m48649h(list, "deprecateParams");
            this.f57280a = str;
            this.f57281b = list;
        }

        /* renamed from: a */
        public final List m59512a() {
            return this.f57281b;
        }

        /* renamed from: b */
        public final String m59513b() {
            return this.f57280a;
        }

        /* renamed from: c */
        public final void m59514c(List list) {
            sq8.m48649h(list, "<set-?>");
            this.f57281b = list;
        }
    }

    /* renamed from: a */
    public static final void m59508a() {
        if (a94.m16694d(zj6.class)) {
            return;
        }
        try {
            f57277b = true;
            f57276a.m59511b();
        } catch (Throwable th) {
            a94.m16692b(th, zj6.class);
        }
    }

    /* renamed from: c */
    public static final void m59509c(Map map, String str) {
        if (a94.m16694d(zj6.class)) {
            return;
        }
        try {
            sq8.m48649h(map, "parameters");
            sq8.m48649h(str, "eventName");
            if (f57277b) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (C18658a c18658a : new ArrayList(f57278c)) {
                    if (sq8.m48644c(c18658a.m59513b(), str)) {
                        for (String str2 : arrayList) {
                            if (c18658a.m59512a().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, zj6.class);
        }
    }

    /* renamed from: d */
    public static final void m59510d(List list) {
        if (a94.m16694d(zj6.class)) {
            return;
        }
        try {
            sq8.m48649h(list, "events");
            if (f57277b) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f57279d.contains(((tk0) it.next()).m50095f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, zj6.class);
        }
    }

    /* renamed from: b */
    public final synchronized void m59511b() {
        tt6 tt6VarM56803u;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return;
        }
        if (tt6VarM56803u == null) {
            return;
        }
        String strM50551r = tt6VarM56803u.m50551r();
        if (strM50551r != null) {
            if (strM50551r.length() > 0) {
                JSONObject jSONObject = new JSONObject(strM50551r);
                f57278c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set set = f57279d;
                            sq8.m48648g(next, TransferTable.COLUMN_KEY);
                            set.add(next);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            sq8.m48648g(next, TransferTable.COLUMN_KEY);
                            C18658a c18658a = new C18658a(next, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                c18658a.m59514c(cri.m21667n(jSONArrayOptJSONArray));
                            }
                            f57278c.add(c18658a);
                        }
                    }
                }
            }
        }
    }
}
