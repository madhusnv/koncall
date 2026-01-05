package og;

import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class hb {
    /* renamed from: a */
    public static final Object[] m10680a(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC6662l.m12720j(0, i10, 6, objArr, objArr2);
        AbstractC6662l.m12715e(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* renamed from: b */
    public static final Object[] m10681b(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC6662l.m12720j(0, i10, 6, objArr, objArr2);
        AbstractC6662l.m12715e(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* renamed from: c */
    public static final Object[] m10682c(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC6662l.m12720j(0, i10, 6, objArr, objArr2);
        AbstractC6662l.m12715e(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* renamed from: d */
    public static final int m10683d(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
