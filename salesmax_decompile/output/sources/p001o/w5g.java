package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class w5g {

    /* renamed from: b */
    public static boolean f51514b;

    /* renamed from: a */
    public static final w5g f51513a = new w5g();

    /* renamed from: c */
    public static Map f51515c = new HashMap();

    /* renamed from: d */
    public static Map f51516d = new HashMap();

    /* renamed from: b */
    public static final void m53987b() {
        if (a94.m16694d(w5g.class)) {
            return;
        }
        try {
            if (f51514b) {
                return;
            }
            f51513a.m53992e();
            f51514b = (f51515c.isEmpty() && f51516d.isEmpty()) ? false : true;
        } catch (Throwable th) {
            a94.m16692b(th, w5g.class);
        }
    }

    /* renamed from: g */
    public static final void m53988g(Bundle bundle) {
        if (a94.m16694d(w5g.class)) {
            return;
        }
        try {
            if (f51514b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(str));
                    boolean z = true;
                    boolean z2 = f51515c.get(str) != null;
                    if (f51516d.get(str) == null) {
                        z = false;
                    }
                    if (z2 || z) {
                        w5g w5gVar = f51513a;
                        boolean zM53991d = w5gVar.m53991d(strValueOf, (Set) f51515c.get(str));
                        boolean zM53990c = w5gVar.m53990c(strValueOf, (Set) f51516d.get(str));
                        if (!zM53991d && !zM53990c) {
                            sq8.m48648g(str, TransferTable.COLUMN_KEY);
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, w5g.class);
        }
    }

    /* renamed from: a */
    public final void m53989a(JSONArray jSONArray) {
        if (a94.m16694d(this) || jSONArray == null) {
            return;
        }
        try {
            if (f51514b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(TransferTable.COLUMN_KEY);
                if (!(string == null || string.length() == 0)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet hashSetM53993f = m53993f(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                Map map = f51516d;
                                sq8.m48648g(string, TransferTable.COLUMN_KEY);
                                HashSet hashSet = (HashSet) f51516d.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetM53993f);
                                    hashSetM53993f = hashSet;
                                }
                                map.put(string, hashSetM53993f);
                            } else {
                                Map map2 = f51515c;
                                sq8.m48648g(string, TransferTable.COLUMN_KEY);
                                HashSet hashSet2 = (HashSet) f51515c.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetM53993f);
                                    hashSetM53993f = hashSet2;
                                }
                                map2.put(string, hashSetM53993f);
                            }
                        }
                    } catch (Exception unused) {
                        f51516d.remove(string);
                        f51515c.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: c */
    public final boolean m53990c(String str, Set set) {
        if (a94.m16694d(this) || set == null) {
            return false;
        }
        try {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            for (String str2 : set2) {
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (sq8.m48644c(lowerCase, lowerCase2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean m53991d(String str, Set set) {
        if (a94.m16694d(this) || set == null) {
            return false;
        }
        try {
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (new mge((String) it.next()).m38995g(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: e */
    public final void m53992e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null) {
                return;
            }
            m53989a(tt6VarM56803u.m50552s());
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final HashSet m53993f(JSONArray jSONArray) {
        HashSet hashSet;
        try {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                hashSet = cri.m21666m(jSONArray);
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
            } catch (Exception unused) {
                hashSet = new HashSet();
            }
            return hashSet;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
