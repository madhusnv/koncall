package p001o;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class b9d {

    /* renamed from: a */
    public static final g0d f15808a = m18461c();

    /* renamed from: o.b9d$b */
    public static final class C12332b implements g0d {
        public C12332b() {
        }
    }

    /* renamed from: a */
    public static String m18459a(String str) {
        if (m18462d(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m18460b(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* renamed from: c */
    public static g0d m18461c() {
        return new C12332b();
    }

    /* renamed from: d */
    public static boolean m18462d(String str) {
        return str == null || str.isEmpty();
    }
}
