package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class bef {

    /* renamed from: b */
    public static boolean f16065b;

    /* renamed from: a */
    public static final bef f16064a = new bef();

    /* renamed from: c */
    public static HashSet f16066c = new HashSet();

    /* renamed from: d */
    public static Map f16067d = new HashMap();

    /* renamed from: a */
    public static final void m18804a() {
        if (a94.m16694d(bef.class)) {
            return;
        }
        try {
            f16064a.m18806b();
            if (f16066c.isEmpty() && f16067d.isEmpty()) {
                f16065b = false;
            } else {
                f16065b = true;
            }
        } catch (Throwable th) {
            a94.m16692b(th, bef.class);
        }
    }

    /* renamed from: c */
    public static final void m18805c(Bundle bundle, String str) {
        if (a94.m16694d(bef.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "eventName");
            if (f16065b && bundle != null) {
                if (!f16066c.isEmpty() || f16067d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f16067d.get(str);
                        Iterator it = new ArrayList(bundle.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            bef befVar = f16064a;
                            sq8.m48648g(str2, TransferTable.COLUMN_KEY);
                            if (befVar.m18807d(str2, hashSet)) {
                                bundle.remove(str2);
                                jSONArray.put(str2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, bef.class);
        }
    }

    /* renamed from: b */
    public final void m18806b() {
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
                f16066c = new HashSet();
                f16067d = new HashMap();
                JSONArray jSONArrayM50554u = tt6VarM56803u.m50554u();
                if (jSONArrayM50554u == null || jSONArrayM50554u.length() == 0) {
                    return;
                }
                int length = jSONArrayM50554u.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArrayM50554u.getJSONObject(i);
                    boolean zHas = jSONObject.has(TransferTable.COLUMN_KEY);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(TransferTable.COLUMN_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (jSONArray != null && (hashSetM21666m = cri.m21666m(jSONArray)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                f16066c = hashSetM21666m;
                            } else {
                                Map map = f16067d;
                                sq8.m48648g(string, "sensitiveParamsScope");
                                map.put(string, hashSetM21666m);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: d */
    public final boolean m18807d(String str, HashSet hashSet) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            if (!f16066c.contains(str)) {
                if (hashSet == null || hashSet.isEmpty()) {
                    return false;
                }
                if (!hashSet.contains(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
