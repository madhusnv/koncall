package e1;

import f1.AbstractC2176a;
import fx.InterfaceC2396b;
import fx.InterfaceC2400f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C1904f implements Collection, Set, InterfaceC2396b, InterfaceC2400f {

    /* renamed from: a */
    public int[] f8958a = AbstractC2176a.f10048a;

    /* renamed from: b */
    public Object[] f8959b = AbstractC2176a.f10050c;

    /* renamed from: c */
    public int f8960c;

    public C1904f(int i10) {
        if (i10 > 0) {
            AbstractC1916r.m5606b(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iM5607c;
        int i11 = this.f8960c;
        if (obj == null) {
            iM5607c = AbstractC1916r.m5607c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iM5607c = AbstractC1916r.m5607c(this, obj, iHashCode);
        }
        if (iM5607c >= 0) {
            return false;
        }
        int i12 = ~iM5607c;
        int[] iArr = this.f8958a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f8959b;
            int[] iArr2 = new int[i13];
            this.f8958a = iArr2;
            this.f8959b = new Object[i13];
            if (i11 != this.f8960c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC6662l.m12722l(0, iArr, iArr.length, 6, iArr2);
                AbstractC6662l.m12720j(0, objArr.length, 6, objArr, this.f8959b);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f8958a;
            int i14 = i12 + 1;
            AbstractC6662l.m12717g(i14, iArr3, i12, i11, iArr3);
            Object[] objArr2 = this.f8959b;
            AbstractC6662l.m12715e(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f8960c;
        if (i11 == i15) {
            int[] iArr4 = this.f8958a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f8959b[i12] = obj;
                this.f8960c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        int size = elements.size() + this.f8960c;
        int i10 = this.f8960c;
        int[] iArr = this.f8958a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8959b;
            int[] iArr2 = new int[size];
            this.f8958a = iArr2;
            this.f8959b = new Object[size];
            if (i10 > 0) {
                AbstractC6662l.m12722l(0, iArr, i10, 6, iArr2);
                AbstractC6662l.m12720j(0, this.f8960c, 6, objArr, this.f8959b);
            }
        }
        if (this.f8960c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* renamed from: b */
    public final Object m5556b(int i10) {
        int i11 = this.f8960c;
        Object[] objArr = this.f8959b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f8958a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                AbstractC6662l.m12717g(i10, iArr, i13, i11, iArr);
                Object[] objArr2 = this.f8959b;
                AbstractC6662l.m12715e(i10, i13, i11, objArr2, objArr2);
            }
            this.f8959b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f8958a = iArr2;
            this.f8959b = new Object[i14];
            if (i10 > 0) {
                AbstractC6662l.m12722l(0, iArr, i10, 6, iArr2);
                AbstractC6662l.m12720j(0, i10, 6, objArr, this.f8959b);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                AbstractC6662l.m12717g(i10, iArr, i15, i11, this.f8958a);
                AbstractC6662l.m12715e(i10, i15, i11, objArr, this.f8959b);
            }
        }
        if (i11 != this.f8960c) {
            throw new ConcurrentModificationException();
        }
        this.f8960c = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8960c != 0) {
            this.f8958a = AbstractC2176a.f10048a;
            this.f8959b = AbstractC2176a.f10050c;
            this.f8960c = 0;
        }
        if (this.f8960c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1916r.m5607c(this, null, 0) : AbstractC1916r.m5607c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f8960c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f8960c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f8959b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8958a;
        int i10 = this.f8960c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8960c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1899a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM5607c = obj == null ? AbstractC1916r.m5607c(this, null, 0) : AbstractC1916r.m5607c(this, obj, obj.hashCode());
        if (iM5607c < 0) {
            return false;
        }
        m5556b(iM5607c);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        boolean z6 = false;
        for (int i10 = this.f8960c - 1; -1 < i10; i10--) {
            if (!AbstractC6663m.m12767z(elements, this.f8959b[i10])) {
                m5556b(i10);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8960c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC6662l.m12724n(this.f8959b, 0, this.f8960c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8960c * 14);
        sb2.append('{');
        int i10 = this.f8960c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f8959b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        int i10 = this.f8960c;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        AbstractC6662l.m12715e(0, 0, this.f8960c, this.f8959b, array);
        return array;
    }
}
