package p001o;

import android.content.SharedPreferences;
import com.facebook.C10773c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p001o.kh8;

/* loaded from: classes5.dex */
public final class hh8 {

    /* renamed from: a */
    public static final hh8 f26865a = new hh8();

    /* renamed from: c */
    public static final void m30453c() {
        if (a94.m16694d(hh8.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C10773c.m13019l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
        }
    }

    /* renamed from: d */
    public static final void m30454d(Map map, Map map2, boolean z, String str, kh8.EnumC14835a enumC14835a, boolean z2) {
        if (a94.m16694d(hh8.class)) {
            return;
        }
        try {
            sq8.m48649h(map, "purchaseDetailsMap");
            sq8.m48649h(map2, "skuDetailsMap");
            sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            sq8.m48649h(enumC14835a, "billingClientVersion");
            hh8 hh8Var = f26865a;
            hh8Var.m30461f(hh8Var.m30460b(hh8Var.m30459a(map, z), map2, str), z, enumC14835a, z2);
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
        }
    }

    /* renamed from: e */
    public static final boolean m30455e() {
        if (a94.m16694d(hh8.class)) {
            return false;
        }
        try {
            return !C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final void m30456g() {
        if (a94.m16694d(hh8.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) f9g.D0((String) it.next(), new String[]{";"}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            m30453c();
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
        }
    }

    /* renamed from: h */
    public static final void m30457h() {
        if (a94.m16694d(hh8.class)) {
            return;
        }
        try {
            try {
                C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
        }
    }

    /* renamed from: i */
    public static final void m30458i() {
        if (a94.m16694d(hh8.class)) {
            return;
        }
        try {
            m30457h();
            try {
                SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, hh8.class);
        }
    }

    /* renamed from: a */
    public final Map m30459a(Map map, boolean z) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(map, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : isa.m32693t(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public final Map m30460b(Map map, Map map2, String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(map, "purchaseDetailsMap");
            sq8.m48649h(map2, "skuDetailsMap");
            sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, str);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        sq8.m48648g(string, "purchaseDetail.toString()");
                        String string2 = jSONObject2.toString();
                        sq8.m48648g(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final void m30461f(Map map, boolean z, kh8.EnumC14835a enumC14835a, boolean z2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                u61.m50980j((String) entry.getKey(), (String) entry.getValue(), z, enumC14835a, z2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
