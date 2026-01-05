package p001o;

import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class s6c {
    /* renamed from: a */
    public static boolean m47909a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: b */
    public static int m47910b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* renamed from: c */
    public static Object m47911c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: d */
    public static Object m47912d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
