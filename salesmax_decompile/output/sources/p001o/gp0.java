package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class gp0 extends fp0 {

    /* renamed from: o.gp0$a */
    public static final class C13806a implements ief {

        /* renamed from: a */
        public final /* synthetic */ Object[] f25629a;

        public C13806a(Object[] objArr) {
            this.f25629a = objArr;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return qo0.m45707a(this.f25629a);
        }
    }

    /* renamed from: o.gp0$b */
    public static final class C13807b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ Object[] f25630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13807b(Object[] objArr) {
            super(0);
            this.f25630a = objArr;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return qo0.m45707a(this.f25630a);
        }
    }

    public static final List A0(float[] fArr) {
        sq8.m48649h(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? F0(fArr) : bh3.m18963e(Float.valueOf(fArr[0])) : ch3.m21246k();
    }

    public static final List B0(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? G0(iArr) : bh3.m18963e(Integer.valueOf(iArr[0])) : ch3.m21246k();
    }

    public static final List C0(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? H0(jArr) : bh3.m18963e(Long.valueOf(jArr[0])) : ch3.m21246k();
    }

    public static final List D0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? I0(objArr) : bh3.m18963e(objArr[0]) : ch3.m21246k();
    }

    public static final List E0(boolean[] zArr) {
        sq8.m48649h(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? J0(zArr) : bh3.m18963e(Boolean.valueOf(zArr[0])) : ch3.m21246k();
    }

    public static final List F0(float[] fArr) {
        sq8.m48649h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List G0(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List H0(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final List I0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return new ArrayList(ch3.m21243h(objArr));
    }

    public static final List J0(boolean[] zArr) {
        sq8.m48649h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final Set K0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) y0(objArr, new LinkedHashSet(hsa.m31055e(objArr.length))) : mif.m39137d(objArr[0]) : nif.m40664e();
    }

    public static final Iterable L0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return new zh8(new C13807b(objArr));
    }

    /* renamed from: M */
    public static final ief m29246M(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return objArr.length == 0 ? oef.m42146e() : new C13806a(objArr);
    }

    public static final List M0(Object[] objArr, Object[] objArr2) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(vyh.m53620a(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    /* renamed from: N */
    public static final boolean m29247N(byte[] bArr, byte b) {
        sq8.m48649h(bArr, "<this>");
        return g0(bArr, b) >= 0;
    }

    /* renamed from: O */
    public static final boolean m29248O(char[] cArr, char c) {
        sq8.m48649h(cArr, "<this>");
        return h0(cArr, c) >= 0;
    }

    /* renamed from: P */
    public static final boolean m29249P(int[] iArr, int i) {
        sq8.m48649h(iArr, "<this>");
        return i0(iArr, i) >= 0;
    }

    /* renamed from: Q */
    public static final boolean m29250Q(long[] jArr, long j) {
        sq8.m48649h(jArr, "<this>");
        return j0(jArr, j) >= 0;
    }

    /* renamed from: R */
    public static final boolean m29251R(Object[] objArr, Object obj) {
        sq8.m48649h(objArr, "<this>");
        return k0(objArr, obj) >= 0;
    }

    /* renamed from: S */
    public static final boolean m29252S(short[] sArr, short s) {
        sq8.m48649h(sArr, "<this>");
        return l0(sArr, s) >= 0;
    }

    /* renamed from: T */
    public static final List m29253T(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        if (i >= 0) {
            return x0(objArr, bce.m18601d(objArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: U */
    public static final List m29254U(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        if (i >= 0) {
            return w0(objArr, bce.m18601d(objArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: V */
    public static final List m29255V(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return (List) m29256W(objArr, new ArrayList());
    }

    /* renamed from: W */
    public static final Collection m29256W(Object[] objArr, Collection collection) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(collection, FirebaseAnalytics.Param.DESTINATION);
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: X */
    public static final Object m29257X(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[0];
    }

    /* renamed from: Y */
    public static final Object m29258Y(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: Z */
    public static final kl8 m29259Z(short[] sArr) {
        sq8.m48649h(sArr, "<this>");
        return new kl8(0, d0(sArr));
    }

    public static final int a0(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final int b0(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final int c0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final int d0(short[] sArr) {
        sq8.m48649h(sArr, "<this>");
        return sArr.length - 1;
    }

    public static final Byte e0(byte[] bArr, int i) {
        sq8.m48649h(bArr, "<this>");
        boolean z = false;
        if (i >= 0 && i < bArr.length) {
            z = true;
        }
        if (z) {
            return Byte.valueOf(bArr[i]);
        }
        return null;
    }

    public static final Object f0(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        boolean z = false;
        if (i >= 0 && i < objArr.length) {
            z = true;
        }
        if (z) {
            return objArr[i];
        }
        return null;
    }

    public static final int g0(byte[] bArr, byte b) {
        sq8.m48649h(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int h0(char[] cArr, char c) {
        sq8.m48649h(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int i0(int[] iArr, int i) {
        sq8.m48649h(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int j0(long[] jArr, long j) {
        sq8.m48649h(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int k0(Object[] objArr, Object obj) {
        sq8.m48649h(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (sq8.m48644c(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int l0(short[] sArr, short s) {
        sq8.m48649h(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final Appendable m0(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(appendable, "buffer");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (xk7Var != null) {
                appendable.append((CharSequence) xk7Var.invoke(Byte.valueOf(b)));
            } else {
                appendable.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable n0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(appendable, "buffer");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.m54067a(appendable, obj, xk7Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String o0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) m0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public static final String p0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) n0(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String q0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            xk7Var = null;
        }
        return o0(bArr, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }

    public static /* synthetic */ String r0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            xk7Var = null;
        }
        return p0(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }

    public static final Object s0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[c0(objArr)];
    }

    public static final char t0(char[] cArr) {
        sq8.m48649h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Object u0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final byte[] v0(byte[] bArr, kl8 kl8Var) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(kl8Var, "indices");
        return kl8Var.isEmpty() ? new byte[0] : fp0.m27265n(bArr, kl8Var.getStart().intValue(), kl8Var.getEndInclusive().intValue() + 1);
    }

    public static final List w0(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return ch3.m21246k();
        }
        if (i >= objArr.length) {
            return D0(objArr);
        }
        if (i == 1) {
            return bh3.m18963e(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final List x0(Object[] objArr, int i) {
        sq8.m48649h(objArr, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return ch3.m21246k();
        }
        int length = objArr.length;
        if (i >= length) {
            return D0(objArr);
        }
        if (i == 1) {
            return bh3.m18963e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static final Collection y0(Object[] objArr, Collection collection) {
        sq8.m48649h(objArr, "<this>");
        sq8.m48649h(collection, FirebaseAnalytics.Param.DESTINATION);
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static final HashSet z0(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return (HashSet) y0(objArr, new HashSet(hsa.m31055e(objArr.length)));
    }
}
