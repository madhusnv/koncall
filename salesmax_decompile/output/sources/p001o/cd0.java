package p001o;

/* loaded from: classes4.dex */
public abstract class cd0 {

    /* renamed from: a */
    public static final Class f17854a = m20876a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f17855b;

    static {
        f17855b = m20876a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    public static Class m20876a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m20877b() {
        return f17854a;
    }

    /* renamed from: c */
    public static boolean m20878c() {
        return (f17854a == null || f17855b) ? false : true;
    }
}
