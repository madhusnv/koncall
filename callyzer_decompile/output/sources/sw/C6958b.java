package sw;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
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
/* renamed from: sw.b */
/* loaded from: classes3.dex */
public final class C6958b extends AbstractC6656f implements RandomAccess, Serializable {

    /* renamed from: a */
    public Object[] f33694a;

    /* renamed from: b */
    public final int f33695b;

    /* renamed from: c */
    public int f33696c;

    /* renamed from: d */
    public final C6958b f33697d;

    /* renamed from: e */
    public final C6959c f33698e;

    public C6958b(Object[] backing, int i10, int i11, C6958b c6958b, C6959c root) {
        AbstractC4154l.m8923f(backing, "backing");
        AbstractC4154l.m8923f(root, "root");
        this.f33694a = backing;
        this.f33695b = i10;
        this.f33696c = i11;
        this.f33697d = c6958b;
        this.f33698e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m13216t();
        m13215s();
        m13214r(this.f33695b + this.f33696c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13216t();
        m13215s();
        int size = elements.size();
        m13213q(this.f33695b + this.f33696c, elements, size);
        return size > 0;
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        m13215s();
        return this.f33696c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m13216t();
        m13215s();
        m13218v(this.f33695b, this.f33696c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m13215s();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f33694a;
            int i10 = this.f33696c;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (AbstractC4154l.m8918a(objArr[this.f33695b + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m13215s();
        int i11 = this.f33696c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return this.f33694a[this.f33695b + i10];
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        m13216t();
        m13215s();
        int i11 = this.f33696c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return m13217u(this.f33695b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m13215s();
        Object[] objArr = this.f33694a;
        int i10 = this.f33696c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f33695b + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m13215s();
        for (int i10 = 0; i10 < this.f33696c; i10++) {
            if (AbstractC4154l.m8918a(this.f33694a[this.f33695b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m13215s();
        return this.f33696c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m13215s();
        for (int i10 = this.f33696c - 1; i10 >= 0; i10--) {
            if (AbstractC4154l.m8918a(this.f33694a[this.f33695b + i10], obj)) {
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
    public final void m13213q(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        C6959c c6959c = this.f33698e;
        C6958b c6958b = this.f33697d;
        if (c6958b != null) {
            c6958b.m13213q(i10, collection, i11);
        } else {
            C6959c c6959c2 = C6959c.f33699d;
            c6959c.m13221q(i10, collection, i11);
        }
        this.f33694a = c6959c.f33700a;
        this.f33696c += i11;
    }

    /* renamed from: r */
    public final void m13214r(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        C6959c c6959c = this.f33698e;
        C6958b c6958b = this.f33697d;
        if (c6958b != null) {
            c6958b.m13214r(i10, obj);
        } else {
            C6959c c6959c2 = C6959c.f33699d;
            c6959c.m13222r(i10, obj);
        }
        this.f33694a = c6959c.f33700a;
        this.f33696c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m13216t();
        m13215s();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo10412h(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13216t();
        m13215s();
        return m13219w(this.f33695b, this.f33696c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13216t();
        m13215s();
        return m13219w(this.f33695b, this.f33696c, elements, true) > 0;
    }

    /* renamed from: s */
    public final void m13215s() {
        if (((AbstractList) this.f33698e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m13216t();
        m13215s();
        int i11 = this.f33696c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f33694a;
        int i12 = this.f33695b;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        oe.m10800b(i10, i11, this.f33696c);
        return new C6958b(this.f33694a, this.f33695b + i10, i11 - i10, this, this.f33698e);
    }

    /* renamed from: t */
    public final void m13216t() {
        if (this.f33698e.f33702c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        m13215s();
        int length = array.length;
        int i10 = this.f33696c;
        int i11 = this.f33695b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f33694a, i11, i10 + i11, array.getClass());
            AbstractC4154l.m8922e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC6662l.m12715e(0, i11, i10 + i11, this.f33694a, array);
        int i12 = this.f33696c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m13215s();
        return zf.m11099a(this.f33694a, this.f33695b, this.f33696c, this);
    }

    /* renamed from: u */
    public final Object m13217u(int i10) {
        Object objM13225u;
        ((AbstractList) this).modCount++;
        C6958b c6958b = this.f33697d;
        if (c6958b != null) {
            objM13225u = c6958b.m13217u(i10);
        } else {
            C6959c c6959c = C6959c.f33699d;
            objM13225u = this.f33698e.m13225u(i10);
        }
        this.f33696c--;
        return objM13225u;
    }

    /* renamed from: v */
    public final void m13218v(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        C6958b c6958b = this.f33697d;
        if (c6958b != null) {
            c6958b.m13218v(i10, i11);
        } else {
            C6959c c6959c = C6959c.f33699d;
            this.f33698e.m13226v(i10, i11);
        }
        this.f33696c -= i11;
    }

    /* renamed from: w */
    public final int m13219w(int i10, int i11, Collection collection, boolean z6) {
        int iM13227w;
        C6958b c6958b = this.f33697d;
        if (c6958b != null) {
            iM13227w = c6958b.m13219w(i10, i11, collection, z6);
        } else {
            C6959c c6959c = C6959c.f33699d;
            iM13227w = this.f33698e.m13227w(i10, i11, collection, z6);
        }
        if (iM13227w > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f33696c -= iM13227w;
        return iM13227w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        m13215s();
        int i11 = this.f33696c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        return new C6957a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m13216t();
        m13215s();
        int i11 = this.f33696c;
        if (i10 >= 0 && i10 <= i11) {
            m13214r(this.f33695b + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        m13216t();
        m13215s();
        int i11 = this.f33696c;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            m13213q(this.f33695b + i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m13215s();
        Object[] objArr = this.f33694a;
        int i10 = this.f33696c;
        int i11 = this.f33695b;
        return AbstractC6662l.m12724n(objArr, i11, i10 + i11);
    }
}
