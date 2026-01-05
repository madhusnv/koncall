package yi;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.e */
/* loaded from: classes.dex */
public final class C8676e {

    /* renamed from: a */
    public final HashMap f42011a = new HashMap();

    /* renamed from: b */
    public final int f42012b = 64;

    /* renamed from: c */
    public final int f42013c;

    public C8676e(int i10) {
        this.f42013c = i10;
    }

    /* renamed from: a */
    public static String m16010a(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized boolean m16011b(String str, String str2) {
        String strM16010a = m16010a(this.f42013c, str);
        if (this.f42011a.size() >= this.f42012b && !this.f42011a.containsKey(strM16010a)) {
            return false;
        }
        String strM16010a2 = m16010a(this.f42013c, str2);
        String str3 = (String) this.f42011a.get(strM16010a);
        if (str3 == null ? strM16010a2 == null : str3.equals(strM16010a2)) {
            return false;
        }
        this.f42011a.put(strM16010a, strM16010a2);
        return true;
    }

    /* renamed from: c */
    public final synchronized void m16012c(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM16010a = m16010a(this.f42013c, str);
                if (this.f42011a.size() < this.f42012b || this.f42011a.containsKey(strM16010a)) {
                    String str2 = (String) entry.getValue();
                    this.f42011a.put(strM16010a, str2 == null ? "" : m16010a(this.f42013c, str2));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
