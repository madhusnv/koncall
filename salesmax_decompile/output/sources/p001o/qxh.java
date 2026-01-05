package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class qxh {
    /* renamed from: f */
    public static final int m45963f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    public static final Object[] m45964g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        fp0.m27264m(objArr, objArr2, 0, 0, i, 6, null);
        fp0.m27260i(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* renamed from: h */
    public static final Object[] m45965h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        fp0.m27264m(objArr, objArr2, 0, 0, i, 6, null);
        fp0.m27260i(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: i */
    public static final Object[] m45966i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        fp0.m27264m(objArr, objArr2, 0, 0, i, 6, null);
        fp0.m27260i(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: j */
    public static final Object[] m45967j(Object[] objArr, int i, int i2, mxh mxhVar) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        fp0.m27264m(objArr, objArr2, 0, 0, i, 6, null);
        fp0.m27260i(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = mxhVar;
        fp0.m27260i(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* renamed from: k */
    public static final Object[] m45968k(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
        fp0.m27260i(objArrCopyOf, objArrCopyOf, i + 2, i + 1, objArr.length);
        fp0.m27260i(objArrCopyOf, objArrCopyOf, i2 + 2, i2, i);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }
}
