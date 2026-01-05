package p001o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes2.dex */
public class ktf {

    /* renamed from: a */
    public int[] f32705a;

    /* renamed from: b */
    public Object[] f32706b;

    /* renamed from: c */
    public int f32707c;

    public ktf() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final int m36222a(Object obj) {
        int i = this.f32707c * 2;
        Object[] objArr = this.f32706b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (sq8.m48644c(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void m36223c(int i) {
        int i2 = this.f32707c;
        int[] iArr = this.f32705a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f32705a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f32706b, i * 2);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f32706b = objArrCopyOf;
        }
        if (this.f32707c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f32707c > 0) {
            this.f32705a = h14.f26079a;
            this.f32706b = h14.f26081c;
            this.f32707c = 0;
        }
        if (this.f32707c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m36225e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m36222a(obj) >= 0;
    }

    /* renamed from: d */
    public final int m36224d(Object obj, int i) {
        int i2 = this.f32707c;
        if (i2 == 0) {
            return -1;
        }
        int iM29727a = h14.m29727a(this.f32705a, i2, i);
        if (iM29727a < 0 || sq8.m48644c(obj, this.f32706b[iM29727a << 1])) {
            return iM29727a;
        }
        int i3 = iM29727a + 1;
        while (i3 < i2 && this.f32705a[i3] == i) {
            if (sq8.m48644c(obj, this.f32706b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM29727a - 1; i4 >= 0 && this.f32705a[i4] == i; i4--) {
            if (sq8.m48644c(obj, this.f32706b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: e */
    public int m36225e(Object obj) {
        return obj == null ? m36226f() : m36224d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ktf) {
                if (size() != ((ktf) obj).size()) {
                    return false;
                }
                ktf ktfVar = (ktf) obj;
                int i = this.f32707c;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM36227g = m36227g(i2);
                    Object objM36228o = m36228o(i2);
                    Object obj2 = ktfVar.get(objM36227g);
                    if (objM36228o == null) {
                        if (obj2 != null || !ktfVar.containsKey(objM36227g)) {
                            return false;
                        }
                    } else if (!sq8.m48644c(objM36228o, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f32707c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM36227g2 = m36227g(i4);
                Object objM36228o2 = m36228o(i4);
                Object obj3 = ((Map) obj).get(objM36227g2);
                if (objM36228o2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM36227g2)) {
                        return false;
                    }
                } else if (!sq8.m48644c(objM36228o2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final int m36226f() {
        int i = this.f32707c;
        if (i == 0) {
            return -1;
        }
        int iM29727a = h14.m29727a(this.f32705a, i, 0);
        if (iM29727a < 0 || this.f32706b[iM29727a << 1] == null) {
            return iM29727a;
        }
        int i2 = iM29727a + 1;
        while (i2 < i && this.f32705a[i2] == 0) {
            if (this.f32706b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM29727a - 1; i3 >= 0 && this.f32705a[i3] == 0; i3--) {
            if (this.f32706b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: g */
    public Object m36227g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f32707c) {
            z = true;
        }
        if (z) {
            return this.f32706b[i << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public Object get(Object obj) {
        int iM36225e = m36225e(obj);
        if (iM36225e >= 0) {
            return this.f32706b[(iM36225e << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iM36225e = m36225e(obj);
        return iM36225e >= 0 ? this.f32706b[(iM36225e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public void mo32669h(ktf ktfVar) {
        sq8.m48649h(ktfVar, "map");
        int i = ktfVar.f32707c;
        m36223c(this.f32707c + i);
        if (this.f32707c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ktfVar.m36227g(i2), ktfVar.m36228o(i2));
            }
        } else if (i > 0) {
            fp0.m27258g(ktfVar.f32705a, this.f32705a, 0, 0, i);
            fp0.m27260i(ktfVar.f32706b, this.f32706b, 0, 0, i << 1);
            this.f32707c = i;
        }
    }

    public int hashCode() {
        int[] iArr = this.f32705a;
        Object[] objArr = this.f32706b;
        int i = this.f32707c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f32707c <= 0;
    }

    /* renamed from: k */
    public Object mo32670k(int i) {
        if (!(i >= 0 && i < this.f32707c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        Object[] objArr = this.f32706b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f32707c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f32705a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 + 1;
                    fp0.m27258g(iArr, iArr, i, i5, i6);
                    Object[] objArr2 = this.f32706b;
                    fp0.m27260i(objArr2, objArr2, i2, i5 << 1, i6 << 1);
                }
                Object[] objArr3 = this.f32706b;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
                sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
                this.f32705a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f32706b, i8 << 1);
                sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
                this.f32706b = objArrCopyOf;
                if (i3 != this.f32707c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    fp0.m27258g(iArr, this.f32705a, 0, 0, i);
                    fp0.m27260i(objArr, this.f32706b, 0, 0, i2);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    fp0.m27258g(iArr, this.f32705a, i, i9, i10);
                    fp0.m27260i(objArr, this.f32706b, i2, i9 << 1, i10 << 1);
                }
            }
            if (i3 != this.f32707c) {
                throw new ConcurrentModificationException();
            }
            this.f32707c = i4;
        }
        return obj;
    }

    /* renamed from: n */
    public Object mo32671n(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f32707c) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f32706b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* renamed from: o */
    public Object m36228o(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f32707c) {
            z = true;
        }
        if (z) {
            return this.f32706b[(i << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f32707c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM36224d = obj != null ? m36224d(obj, iHashCode) : m36226f();
        if (iM36224d >= 0) {
            int i2 = (iM36224d << 1) + 1;
            Object[] objArr = this.f32706b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM36224d;
        int[] iArr = this.f32705a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f32705a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f32706b, i4 << 1);
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f32706b = objArrCopyOf;
            if (i != this.f32707c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f32705a;
            int i5 = i3 + 1;
            fp0.m27258g(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f32706b;
            fp0.m27260i(objArr2, objArr2, i5 << 1, i3 << 1, this.f32707c << 1);
        }
        int i6 = this.f32707c;
        if (i == i6) {
            int[] iArr3 = this.f32705a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f32706b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f32707c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM36225e = m36225e(obj);
        if (iM36225e >= 0) {
            return mo32670k(iM36225e);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iM36225e = m36225e(obj);
        if (iM36225e >= 0) {
            return mo32671n(iM36225e, obj2);
        }
        return null;
    }

    public int size() {
        return this.f32707c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f32707c * 28);
        sb.append('{');
        int i = this.f32707c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM36227g = m36227g(i2);
            if (objM36227g != sb) {
                sb.append(objM36227g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM36228o = m36228o(i2);
            if (objM36228o != sb) {
                sb.append(objM36228o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public ktf(int i) {
        this.f32705a = i == 0 ? h14.f26079a : new int[i];
        this.f32706b = i == 0 ? h14.f26081c : new Object[i << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iM36225e = m36225e(obj);
        if (iM36225e < 0 || !sq8.m48644c(obj2, m36228o(iM36225e))) {
            return false;
        }
        mo32670k(iM36225e);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iM36225e = m36225e(obj);
        if (iM36225e < 0 || !sq8.m48644c(obj2, m36228o(iM36225e))) {
            return false;
        }
        mo32671n(iM36225e, obj3);
        return true;
    }

    public /* synthetic */ ktf(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ktf(ktf ktfVar) {
        this(0, 1, null);
        if (ktfVar != null) {
            mo32669h(ktfVar);
        }
    }
}
