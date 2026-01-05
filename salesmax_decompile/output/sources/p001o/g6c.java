package p001o;

/* loaded from: classes3.dex */
public abstract class g6c {
    /* renamed from: a */
    public static Object m28095a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m28096b(Object... objArr) {
        m28097c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    public static Object[] m28097c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m28095a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static Object[] m28098d(Object[] objArr, int i) {
        return c9d.m20512b(objArr, i);
    }
}
