package p001o;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public abstract class pv7 {
    /* renamed from: a */
    public static int[] m44236a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m44238c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static Object[] m44237b(Object[] objArr, int i, Object obj) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m44238c(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    /* renamed from: c */
    public static int m44238c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
