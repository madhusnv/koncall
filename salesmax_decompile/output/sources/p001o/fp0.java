package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class fp0 extends ep0 {
    /* renamed from: A */
    public static final long[] m27243A(long[] jArr, long[] jArr2) {
        sq8.m48649h(jArr, "<this>");
        sq8.m48649h(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        sq8.m48646e(jArrCopyOf);
        return jArrCopyOf;
    }

    /* renamed from: B */
    public static final Object[] m27244B(Object[] objArr, Object obj) {
        sq8.m48649h(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        sq8.m48646e(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: C */
    public static final Object[] m27245C(Object[] objArr, Collection collection) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(collection, "elements");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + length);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        sq8.m48646e(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: D */
    public static final Object[] m27246D(Object[] objArr, Object[] objArr2) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        sq8.m48646e(objArrCopyOf);
        return objArrCopyOf;
    }

    /* renamed from: E */
    public static final boolean[] m27247E(boolean[] zArr, boolean[] zArr2) {
        sq8.m48649h(zArr, "<this>");
        sq8.m48649h(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        sq8.m48646e(zArrCopyOf);
        return zArrCopyOf;
    }

    /* renamed from: F */
    public static final void m27248F(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: G */
    public static final void m27249G(Object[] objArr, Comparator comparator) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: H */
    public static final void m27250H(Object[] objArr, Comparator comparator, int i, int i2) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    /* renamed from: I */
    public static final Boolean[] m27251I(boolean[] zArr) {
        sq8.m48649h(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: J */
    public static final Float[] m27252J(float[] fArr) {
        sq8.m48649h(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: K */
    public static final Integer[] m27253K(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: L */
    public static final Long[] m27254L(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* renamed from: d */
    public static final List m27255d(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        List listM30888a = hp0.m30888a(objArr);
        sq8.m48648g(listM30888a, "asList(...)");
        return listM30888a;
    }

    /* renamed from: e */
    public static final byte[] m27256e(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(bArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f */
    public static final float[] m27257f(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        sq8.m48649h(fArr, "<this>");
        sq8.m48649h(fArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    /* renamed from: g */
    public static final int[] m27258g(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        sq8.m48649h(iArr, "<this>");
        sq8.m48649h(iArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    /* renamed from: h */
    public static final long[] m27259h(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        sq8.m48649h(jArr, "<this>");
        sq8.m48649h(jArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    /* renamed from: i */
    public static final Object[] m27260i(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(objArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* renamed from: j */
    public static /* synthetic */ byte[] m27261j(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m27256e(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: k */
    public static /* synthetic */ float[] m27262k(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return m27257f(fArr, fArr2, i, i2, i3);
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m27263l(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return m27258g(iArr, iArr2, i, i2, i3);
    }

    /* renamed from: m */
    public static /* synthetic */ Object[] m27264m(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m27260i(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: n */
    public static final byte[] m27265n(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "<this>");
        dp0.m23654b(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        sq8.m48648g(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: o */
    public static final Object[] m27266o(Object[] objArr, int i, int i2) {
        sq8.m48649h(objArr, "<this>");
        dp0.m23654b(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        sq8.m48648g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: p */
    public static final void m27267p(byte[] bArr, byte b, int i, int i2) {
        sq8.m48649h(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    /* renamed from: q */
    public static final void m27268q(int[] iArr, int i, int i2, int i3) {
        sq8.m48649h(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: r */
    public static final void m27269r(long[] jArr, long j, int i, int i2) {
        sq8.m48649h(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    /* renamed from: s */
    public static final void m27270s(Object[] objArr, Object obj, int i, int i2) {
        sq8.m48649h(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    /* renamed from: t */
    public static /* synthetic */ void m27271t(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m27268q(iArr, i, i2, i3);
    }

    /* renamed from: u */
    public static /* synthetic */ void m27272u(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        m27269r(jArr, j, i, i2);
    }

    /* renamed from: v */
    public static /* synthetic */ void m27273v(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m27270s(objArr, obj, i, i2);
    }

    /* renamed from: w */
    public static final byte[] m27274w(byte[] bArr, byte[] bArr2) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        sq8.m48646e(bArrCopyOf);
        return bArrCopyOf;
    }

    /* renamed from: x */
    public static final float[] m27275x(float[] fArr, float[] fArr2) {
        sq8.m48649h(fArr, "<this>");
        sq8.m48649h(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        sq8.m48646e(fArrCopyOf);
        return fArrCopyOf;
    }

    /* renamed from: y */
    public static final int[] m27276y(int[] iArr, int i) {
        sq8.m48649h(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        sq8.m48646e(iArrCopyOf);
        return iArrCopyOf;
    }

    /* renamed from: z */
    public static final int[] m27277z(int[] iArr, int[] iArr2) {
        sq8.m48649h(iArr, "<this>");
        sq8.m48649h(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        sq8.m48646e(iArrCopyOf);
        return iArrCopyOf;
    }
}
