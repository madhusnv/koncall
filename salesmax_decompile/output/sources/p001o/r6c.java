package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class r6c extends pq6 {
    /* renamed from: a */
    public static boolean m46255a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m46256b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
