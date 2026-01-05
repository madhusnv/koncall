package p001o;

/* loaded from: classes6.dex */
public abstract class egd {
    /* renamed from: a */
    public static void m24972a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m24973b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m24974c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
