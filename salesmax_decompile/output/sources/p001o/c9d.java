package p001o;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c9d {
    /* renamed from: a */
    public static Object[] m20511a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    /* renamed from: b */
    public static Object[] m20512b(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: c */
    public static Map m20513c(int i) {
        return ak3.m17265J(i);
    }
}
