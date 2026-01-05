package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class bge {

    /* renamed from: b */
    public static boolean f16148b;

    /* renamed from: a */
    public static final bge f16147a = new bge();

    /* renamed from: c */
    public static Map f16149c = new HashMap();

    /* renamed from: a */
    public static final void m18888a() {
        if (a94.m16694d(bge.class)) {
            return;
        }
        try {
            f16147a.m18891c();
            if (!f16149c.isEmpty()) {
                f16148b = true;
            }
        } catch (Throwable th) {
            a94.m16692b(th, bge.class);
        }
    }

    /* renamed from: d */
    public static final String m18889d(String str) {
        if (a94.m16694d(bge.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "eventName");
            if (f16148b) {
                String strM18890b = f16147a.m18890b(str);
                if (strM18890b != null) {
                    return strM18890b;
                }
            }
            return str;
        } catch (Throwable th) {
            a94.m16692b(th, bge.class);
            return null;
        }
    }

    /* renamed from: b */
    public final String m18890b(String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            for (String str2 : f16149c.keySet()) {
                HashSet hashSet = (HashSet) f16149c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final void m18891c() {
        HashSet hashSetM21666m;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null) {
                return;
            }
            try {
                f16149c = new HashMap();
                JSONArray jSONArrayM50550q = tt6VarM56803u.m50550q();
                if (jSONArrayM50550q == null || jSONArrayM50550q.length() == 0) {
                    return;
                }
                int length = jSONArrayM50550q.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArrayM50550q.getJSONObject(i);
                    boolean zHas = jSONObject.has(TransferTable.COLUMN_KEY);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(TransferTable.COLUMN_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetM21666m = cri.m21666m(jSONArray)) != null) {
                            f16149c.put(string, hashSetM21666m);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
