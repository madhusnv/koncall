package p001o;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.facebook.C10773c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class cdi {

    /* renamed from: c */
    public static SharedPreferences f17973c;

    /* renamed from: a */
    public static final cdi f17971a = new cdi();

    /* renamed from: b */
    public static final String f17972b = cdi.class.getSimpleName();

    /* renamed from: d */
    public static final AtomicBoolean f17974d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final ConcurrentHashMap f17975e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentHashMap f17976f = new ConcurrentHashMap();

    /* renamed from: b */
    public static final String m20983b() {
        if (a94.m16694d(cdi.class)) {
            return null;
        }
        try {
            if (!f17974d.get()) {
                f17971a.m20988d();
            }
            HashMap map = new HashMap();
            map.putAll(f17975e);
            map.putAll(f17971a.m20987c());
            return cri.m0(map);
        } catch (Throwable th) {
            a94.m16692b(th, cdi.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m20984e() {
        if (a94.m16694d(cdi.class)) {
            return;
        }
        try {
            if (f17974d.get()) {
                return;
            }
            f17971a.m20988d();
        } catch (Throwable th) {
            a94.m16692b(th, cdi.class);
        }
    }

    /* renamed from: g */
    public static final void m20985g(Map map) {
        String[] strArr;
        List listM38998j;
        if (a94.m16694d(cdi.class)) {
            return;
        }
        try {
            sq8.m48649h(map, "ud");
            if (!f17974d.get()) {
                f17971a.m20988d();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                cdi cdiVar = f17971a;
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = sq8.m48651j(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String strG0 = cri.G0(cdiVar.m20989f(str, str2.subSequence(i, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = f17976f;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listM38998j = new mge(",").m38998j(str3, 0)) == null || (strArr = (String[]) listM38998j.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setM40666g = nif.m40666g(Arrays.copyOf(strArr, strArr.length));
                    if (setM40666g.contains(strG0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strG0);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strG0);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(",");
                        }
                        sb.append(strG0);
                        setM40666g.remove(strArr[0]);
                    }
                    f17976f.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strG0);
                }
            }
            f17971a.m20990h("com.facebook.appevents.UserDataStore.internalUserData", cri.m0(f17976f));
        } catch (Throwable th) {
            a94.m16692b(th, cdi.class);
        }
    }

    /* renamed from: i */
    public static final void m20986i(String str, String str2) {
        if (a94.m16694d(cdi.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$key");
            sq8.m48649h(str2, "$value");
            if (!f17974d.get()) {
                f17971a.m20988d();
            }
            SharedPreferences sharedPreferences = f17973c;
            if (sharedPreferences == null) {
                sq8.m48667z("sharedPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(str, str2).apply();
        } catch (Throwable th) {
            a94.m16692b(th, cdi.class);
        }
    }

    /* renamed from: c */
    public final Map m20987c() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set setM56086b = xdb.f53550d.m56086b();
            for (String str : f17976f.keySet()) {
                if (setM56086b.contains(str)) {
                    map.put(str, f17976f.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized void m20988d() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f17974d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l());
            sq8.m48648g(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            f17973c = defaultSharedPreferences;
            SharedPreferences sharedPreferences = null;
            if (defaultSharedPreferences == null) {
                sq8.m48667z("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = f17973c;
            if (sharedPreferences2 == null) {
                sq8.m48667z("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f17975e.putAll(cri.i0(string));
            f17976f.putAll(cri.i0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final String m20989f(String str, String str2) {
        String strSubstring;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = sq8.m48651j(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
            if (sq8.m48644c("em", str)) {
                return Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches() ? lowerCase : "";
            }
            if (sq8.m48644c("ph", str)) {
                return new mge("[^0-9]").m38996h(lowerCase, "");
            }
            if (!sq8.m48644c("ge", str)) {
                return lowerCase;
            }
            if (lowerCase.length() > 0) {
                strSubstring = lowerCase.substring(0, 1);
                sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            return (sq8.m48644c("f", strSubstring) || sq8.m48644c("m", strSubstring)) ? strSubstring : "";
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: h */
    public final void m20990h(final String str, final String str2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            C10773c.m13028u().execute(new Runnable() { // from class: o.bdi
                @Override // java.lang.Runnable
                public final void run() {
                    cdi.m20986i(str, str2);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
