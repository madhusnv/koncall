package e1;

import f1.AbstractC2176a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a */
    public int[] f9063a;

    /* renamed from: b */
    public Object[] f9064b;

    /* renamed from: c */
    public int f9065c;

    public u0(int i10) {
        this.f9063a = i10 == 0 ? AbstractC2176a.f10048a : new int[i10];
        this.f9064b = i10 == 0 ? AbstractC2176a.f10050c : new Object[i10 << 1];
    }

    /* renamed from: b */
    public final int m5629b(Object obj) {
        int i10 = this.f9065c * 2;
        Object[] objArr = this.f9064b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void clear() {
        if (this.f9065c > 0) {
            this.f9063a = AbstractC2176a.f10048a;
            this.f9064b = AbstractC2176a.f10050c;
            this.f9065c = 0;
        }
        if (this.f9065c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m5632h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5629b(obj) >= 0;
    }

    /* renamed from: d */
    public final void m5630d(int i10) {
        int i11 = this.f9065c;
        int[] iArr = this.f9063a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9063a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9064b, i10 * 2);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9064b = objArrCopyOf;
        }
        if (this.f9065c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof u0) {
                int i10 = this.f9065c;
                if (i10 != ((u0) obj).f9065c) {
                    return false;
                }
                u0 u0Var = (u0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objM5634j = m5634j(i11);
                    Object objM5637o = m5637o(i11);
                    Object obj2 = u0Var.get(objM5634j);
                    if (objM5637o == null) {
                        if (obj2 != null || !u0Var.containsKey(objM5634j)) {
                            return false;
                        }
                    } else if (!objM5637o.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f9065c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f9065c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objM5634j2 = m5634j(i13);
                Object objM5637o2 = m5637o(i13);
                Object obj3 = ((Map) obj).get(objM5634j2);
                if (objM5637o2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM5634j2)) {
                        return false;
                    }
                } else if (!objM5637o2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final int m5631f(int i10, Object obj) {
        int i11 = this.f9065c;
        if (i11 == 0) {
            return -1;
        }
        int iM5860a = AbstractC2176a.m5860a(i11, i10, this.f9063a);
        if (iM5860a < 0 || AbstractC4154l.m8918a(obj, this.f9064b[iM5860a << 1])) {
            return iM5860a;
        }
        int i12 = iM5860a + 1;
        while (i12 < i11 && this.f9063a[i12] == i10) {
            if (AbstractC4154l.m8918a(obj, this.f9064b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM5860a - 1; i13 >= 0 && this.f9063a[i13] == i10; i13--) {
            if (AbstractC4154l.m8918a(obj, this.f9064b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public Object get(Object obj) {
        int iM5632h = m5632h(obj);
        if (iM5632h >= 0) {
            return this.f9064b[(iM5632h << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM5632h = m5632h(obj);
        return iM5632h >= 0 ? this.f9064b[(iM5632h << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final int m5632h(Object obj) {
        return obj == null ? m5633i() : m5631f(obj.hashCode(), obj);
    }

    public final int hashCode() {
        int[] iArr = this.f9063a;
        Object[] objArr = this.f9064b;
        int i10 = this.f9065c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final int m5633i() {
        int i10 = this.f9065c;
        if (i10 == 0) {
            return -1;
        }
        int iM5860a = AbstractC2176a.m5860a(i10, 0, this.f9063a);
        if (iM5860a < 0 || this.f9064b[iM5860a << 1] == null) {
            return iM5860a;
        }
        int i11 = iM5860a + 1;
        while (i11 < i10 && this.f9063a[i11] == 0) {
            if (this.f9064b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM5860a - 1; i12 >= 0 && this.f9063a[i12] == 0; i12--) {
            if (this.f9064b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean isEmpty() {
        return this.f9065c <= 0;
    }

    /* renamed from: j */
    public final Object m5634j(int i10) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f9065c) {
            z6 = true;
        }
        if (z6) {
            return this.f9064b[i10 << 1];
        }
        AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    /* renamed from: l */
    public final Object m5635l(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9065c)) {
            AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f9064b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f9063a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC6662l.m12717g(i10, iArr, i14, i11, iArr);
                Object[] objArr2 = this.f9064b;
                AbstractC6662l.m12715e(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f9064b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9063a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9064b, i16 << 1);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9064b = objArrCopyOf;
            if (i11 != this.f9065c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                AbstractC6662l.m12717g(0, iArr, 0, i10, this.f9063a);
                AbstractC6662l.m12715e(0, 0, i12, objArr, this.f9064b);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC6662l.m12717g(i10, iArr, i17, i11, this.f9063a);
                AbstractC6662l.m12715e(i12, i17 << 1, i11 << 1, objArr, this.f9064b);
            }
        }
        if (i11 != this.f9065c) {
            throw new ConcurrentModificationException();
        }
        this.f9065c = i13;
        return obj;
    }

    /* renamed from: n */
    public final Object m5636n(int i10, Object obj) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f9065c) {
            z6 = true;
        }
        if (!z6) {
            AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f9064b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    /* renamed from: o */
    public final Object m5637o(int i10) {
        boolean z6 = false;
        if (i10 >= 0 && i10 < this.f9065c) {
            z6 = true;
        }
        if (z6) {
            return this.f9064b[(i10 << 1) + 1];
        }
        AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f9065c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM5631f = obj != null ? m5631f(iHashCode, obj) : m5633i();
        if (iM5631f >= 0) {
            int i11 = (iM5631f << 1) + 1;
            Object[] objArr = this.f9064b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iM5631f;
        int[] iArr = this.f9063a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9063a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9064b, i13 << 1);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9064b = objArrCopyOf;
            if (i10 != this.f9065c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f9063a;
            int i14 = i12 + 1;
            AbstractC6662l.m12717g(i14, iArr2, i12, i10, iArr2);
            Object[] objArr2 = this.f9064b;
            AbstractC6662l.m12715e(i14 << 1, i12 << 1, this.f9065c << 1, objArr2, objArr2);
        }
        int i15 = this.f9065c;
        if (i10 == i15) {
            int[] iArr3 = this.f9063a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f9064b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f9065c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM5632h = m5632h(obj);
        if (iM5632h >= 0) {
            return m5635l(iM5632h);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM5632h = m5632h(obj);
        if (iM5632h >= 0) {
            return m5636n(iM5632h, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f9065c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9065c * 28);
        sb2.append('{');
        int i10 = this.f9065c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objM5634j = m5634j(i11);
            if (objM5634j != sb2) {
                sb2.append(objM5634j);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM5637o = m5637o(i11);
            if (objM5637o != sb2) {
                sb2.append(objM5637o);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM5632h = m5632h(obj);
        if (iM5632h < 0 || !AbstractC4154l.m8918a(obj2, m5637o(iM5632h))) {
            return false;
        }
        m5635l(iM5632h);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM5632h = m5632h(obj);
        if (iM5632h < 0 || !AbstractC4154l.m8918a(obj2, m5637o(iM5632h))) {
            return false;
        }
        m5636n(iM5632h, obj3);
        return true;
    }
}
