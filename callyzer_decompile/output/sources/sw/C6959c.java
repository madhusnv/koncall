package sw;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4154l;
import og.oe;
import og.zf;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6656f;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.c */
/* loaded from: classes3.dex */
public final class C6959c extends AbstractC6656f implements RandomAccess, Serializable {

    /* renamed from: d */
    public static final C6959c f33699d;

    /* renamed from: a */
    public Object[] f33700a;

    /* renamed from: b */
    public int f33701b;

    /* renamed from: c */
    public boolean f33702c;

    static {
        C6959c c6959c = new C6959c(0);
        c6959c.f33702c = true;
        f33699d = c6959c;
    }

    public C6959c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f33700a = new Object[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13223s();
        int i10 = this.f33701b;
        ((AbstractList) this).modCount++;
        m13224t(i10, 1);
        this.f33700a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13223s();
        int size = elements.size();
        m13221q(this.f33701b, elements, size);
        return size > 0;
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        return this.f33701b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m13223s();
        m13226v(0, this.f33701b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f33700a;
            int i10 = this.f33701b;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (AbstractC4154l.m8918a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f33701b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return this.f33700a[i10];
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        m13223s();
        int i11 = this.f33701b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return m13225u(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f33700a;
        int i10 = this.f33701b;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f33701b; i10++) {
            if (AbstractC4154l.m8918a(this.f33700a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f33701b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f33701b - 1; i10 >= 0; i10--) {
            if (AbstractC4154l.m8918a(this.f33700a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final void m13221q(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        m13224t(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f33700a[i10 + i12] = it.next();
        }
    }

    /* renamed from: r */
    public final void m13222r(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        m13224t(i10, 1);
        this.f33700a[i10] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m13223s();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo10412h(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13223s();
        return m13227w(0, this.f33701b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13223s();
        return m13227w(0, this.f33701b, elements, true) > 0;
    }

    /* renamed from: s */
    public final void m13223s() {
        if (this.f33702c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m13223s();
        int i11 = this.f33701b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f33700a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        oe.m10800b(i10, i11, this.f33701b);
        return new C6958b(this.f33700a, i10, i11 - i10, null, this);
    }

    /* renamed from: t */
    public final void m13224t(int i10, int i11) {
        int i12 = this.f33701b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f33700a;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f33700a = objArrCopyOf;
        }
        Object[] objArr2 = this.f33700a;
        AbstractC6662l.m12715e(i10 + i11, i10, this.f33701b, objArr2, objArr2);
        this.f33701b += i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        int length = array.length;
        int i10 = this.f33701b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f33700a, 0, i10, array.getClass());
            AbstractC4154l.m8922e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC6662l.m12715e(0, 0, i10, this.f33700a, array);
        int i11 = this.f33701b;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zf.m11099a(this.f33700a, 0, this.f33701b, this);
    }

    /* renamed from: u */
    public final Object m13225u(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f33700a;
        Object obj = objArr[i10];
        AbstractC6662l.m12715e(i10, i10 + 1, this.f33701b, objArr, objArr);
        Object[] objArr2 = this.f33700a;
        int i11 = this.f33701b - 1;
        AbstractC4154l.m8923f(objArr2, "<this>");
        objArr2[i11] = null;
        this.f33701b--;
        return obj;
    }

    /* renamed from: v */
    public final void m13226v(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f33700a;
        AbstractC6662l.m12715e(i10, i10 + i11, this.f33701b, objArr, objArr);
        Object[] objArr2 = this.f33700a;
        int i12 = this.f33701b;
        zf.m11100b(objArr2, i12 - i11, i12);
        this.f33701b -= i11;
    }

    /* renamed from: w */
    public final int m13227w(int i10, int i11, Collection collection, boolean z6) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f33700a[i14]) == z6) {
                Object[] objArr = this.f33700a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f33700a;
        AbstractC6662l.m12715e(i10 + i13, i11 + i10, this.f33701b, objArr2, objArr2);
        Object[] objArr3 = this.f33700a;
        int i16 = this.f33701b;
        zf.m11100b(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f33701b -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f33701b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return new C6957a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13223s();
        int i11 = this.f33701b;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            m13221q(i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m13223s();
        int i11 = this.f33701b;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            m13224t(i10, 1);
            this.f33700a[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC6662l.m12724n(this.f33700a, 0, this.f33701b);
    }
}
