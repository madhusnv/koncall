package t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.w */
/* loaded from: classes.dex */
public final class C7077w {

    /* renamed from: b */
    public static volatile C7077w f34173b;

    /* renamed from: a */
    public static final Object f34172a = new Object();

    /* renamed from: c */
    public static final C7077w f34174c = new C7077w();

    /* renamed from: d */
    public static final a0 f34175d = new a0(1);

    /* renamed from: e */
    public static final a0 f34176e = new a0(0);

    /* renamed from: a */
    public static C7077w m13371a() {
        C7077w c7077w;
        synchronized (f34172a) {
            try {
                if (f34173b == null) {
                    f34173b = new C7077w();
                }
                c7077w = f34173b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7077w;
    }

    /* renamed from: b */
    public static String m13372b(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
