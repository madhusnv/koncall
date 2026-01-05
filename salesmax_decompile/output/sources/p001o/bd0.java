package p001o;

/* loaded from: classes6.dex */
public abstract class bd0 {

    /* renamed from: a */
    public static boolean f15943a;

    /* renamed from: b */
    public static final Class f15944b = m18625a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f15945c;

    static {
        f15945c = (f15943a || m18625a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    public static Class m18625a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m18626b() {
        return f15944b;
    }

    /* renamed from: c */
    public static boolean m18627c() {
        return f15943a || !(f15944b == null || f15945c);
    }
}
