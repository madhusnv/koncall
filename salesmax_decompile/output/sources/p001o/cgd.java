package p001o;

/* loaded from: classes5.dex */
public abstract class cgd {
    /* renamed from: a */
    public static void m21195a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m21196b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m21197c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
