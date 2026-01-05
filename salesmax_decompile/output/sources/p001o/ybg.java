package p001o;

/* loaded from: classes4.dex */
public abstract class ybg {
    /* renamed from: a */
    public static int m57487a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m57488b() throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
