package rw;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import og.oe;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.k */
/* loaded from: classes3.dex */
public final class C6661k extends AbstractC6656f {

    /* renamed from: d */
    public static final Object[] f31938d = new Object[0];

    /* renamed from: a */
    public int f31939a;

    /* renamed from: b */
    public Object[] f31940b;

    /* renamed from: c */
    public int f31941c;

    public C6661k() {
        this.f31940b = f31938d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11 = this.f31941c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        m12697x();
        m12690q(this.f31941c + 1);
        int iM12696w = m12696w(this.f31939a + i10);
        int i12 = this.f31941c;
        if (i10 < ((i12 + 1) >> 1)) {
            int iM12735y = iM12696w == 0 ? AbstractC6662l.m12735y(this.f31940b) : iM12696w - 1;
            int i13 = this.f31939a;
            int iM12735y2 = i13 == 0 ? AbstractC6662l.m12735y(this.f31940b) : i13 - 1;
            int i14 = this.f31939a;
            if (iM12735y >= i14) {
                Object[] objArr = this.f31940b;
                objArr[iM12735y2] = objArr[i14];
                AbstractC6662l.m12715e(i14, i14 + 1, iM12735y + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f31940b;
                AbstractC6662l.m12715e(i14 - 1, i14, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f31940b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC6662l.m12715e(0, 1, iM12735y + 1, objArr3, objArr3);
            }
            this.f31940b[iM12735y] = obj;
            this.f31939a = iM12735y2;
        } else {
            int iM12696w2 = m12696w(i12 + this.f31939a);
            if (iM12696w < iM12696w2) {
                Object[] objArr4 = this.f31940b;
                AbstractC6662l.m12715e(iM12696w + 1, iM12696w, iM12696w2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f31940b;
                AbstractC6662l.m12715e(1, 0, iM12696w2, objArr5, objArr5);
                Object[] objArr6 = this.f31940b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC6662l.m12715e(iM12696w + 1, iM12696w, objArr6.length - 1, objArr6, objArr6);
            }
            this.f31940b[iM12696w] = obj;
        }
        this.f31941c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        int i11 = this.f31941c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f31941c) {
            return addAll(elements);
        }
        m12697x();
        m12690q(elements.size() + this.f31941c);
        int iM12696w = m12696w(this.f31941c + this.f31939a);
        int iM12696w2 = m12696w(this.f31939a + i10);
        int size = elements.size();
        if (i10 >= ((this.f31941c + 1) >> 1)) {
            int i12 = iM12696w2 + size;
            if (iM12696w2 < iM12696w) {
                int i13 = size + iM12696w;
                Object[] objArr = this.f31940b;
                if (i13 <= objArr.length) {
                    AbstractC6662l.m12715e(i12, iM12696w2, iM12696w, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    AbstractC6662l.m12715e(i12 - objArr.length, iM12696w2, iM12696w, objArr, objArr);
                } else {
                    int length = iM12696w - (i13 - objArr.length);
                    AbstractC6662l.m12715e(0, length, iM12696w, objArr, objArr);
                    Object[] objArr2 = this.f31940b;
                    AbstractC6662l.m12715e(i12, iM12696w2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f31940b;
                AbstractC6662l.m12715e(size, 0, iM12696w, objArr3, objArr3);
                Object[] objArr4 = this.f31940b;
                if (i12 >= objArr4.length) {
                    AbstractC6662l.m12715e(i12 - objArr4.length, iM12696w2, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC6662l.m12715e(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f31940b;
                    AbstractC6662l.m12715e(i12, iM12696w2, objArr5.length - size, objArr5, objArr5);
                }
            }
            m12689j(iM12696w2, elements);
            return true;
        }
        int i14 = this.f31939a;
        int length2 = i14 - size;
        if (iM12696w2 < i14) {
            Object[] objArr6 = this.f31940b;
            AbstractC6662l.m12715e(length2, i14, objArr6.length, objArr6, objArr6);
            if (size >= iM12696w2) {
                Object[] objArr7 = this.f31940b;
                AbstractC6662l.m12715e(objArr7.length - size, 0, iM12696w2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f31940b;
                AbstractC6662l.m12715e(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f31940b;
                AbstractC6662l.m12715e(0, size, iM12696w2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f31940b;
            AbstractC6662l.m12715e(length2, i14, iM12696w2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f31940b;
            length2 += objArr11.length;
            int i15 = iM12696w2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                AbstractC6662l.m12715e(length2, i14, iM12696w2, objArr11, objArr11);
            } else {
                AbstractC6662l.m12715e(length2, i14, i14 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f31940b;
                AbstractC6662l.m12715e(0, this.f31939a + length3, iM12696w2, objArr12, objArr12);
            }
        }
        this.f31939a = length2;
        m12689j(m12694u(iM12696w2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m12697x();
        m12690q(this.f31941c + 1);
        int i10 = this.f31939a;
        int iM12735y = i10 == 0 ? AbstractC6662l.m12735y(this.f31940b) : i10 - 1;
        this.f31939a = iM12735y;
        this.f31940b[iM12735y] = obj;
        this.f31941c++;
    }

    public final void addLast(Object obj) {
        m12697x();
        m12690q(mo10411b() + 1);
        this.f31940b[m12696w(mo10411b() + this.f31939a)] = obj;
        this.f31941c = mo10411b() + 1;
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        return this.f31941c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m12697x();
            m12695v(this.f31939a, m12696w(mo10411b() + this.f31939a));
        }
        this.f31939a = 0;
        this.f31941c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f31940b[this.f31939a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iMo10411b = mo10411b();
        if (i10 < 0 || i10 >= iMo10411b) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, iMo10411b, ", size: "));
        }
        return this.f31940b[m12696w(this.f31939a + i10)];
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        int i11 = this.f31941c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, i11, ", size: "));
        }
        if (i10 == pe.m10832g(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        m12697x();
        int iM12696w = m12696w(this.f31939a + i10);
        Object[] objArr = this.f31940b;
        Object obj = objArr[iM12696w];
        if (i10 < (this.f31941c >> 1)) {
            int i12 = this.f31939a;
            if (iM12696w >= i12) {
                AbstractC6662l.m12715e(i12 + 1, i12, iM12696w, objArr, objArr);
            } else {
                AbstractC6662l.m12715e(1, 0, iM12696w, objArr, objArr);
                Object[] objArr2 = this.f31940b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f31939a;
                AbstractC6662l.m12715e(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f31940b;
            int i14 = this.f31939a;
            objArr3[i14] = null;
            this.f31939a = m12692s(i14);
        } else {
            int iM12696w2 = m12696w(pe.m10832g(this) + this.f31939a);
            if (iM12696w <= iM12696w2) {
                Object[] objArr4 = this.f31940b;
                AbstractC6662l.m12715e(iM12696w, iM12696w + 1, iM12696w2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f31940b;
                AbstractC6662l.m12715e(iM12696w, iM12696w + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f31940b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC6662l.m12715e(0, 1, iM12696w2 + 1, objArr6, objArr6);
            }
            this.f31940b[iM12696w2] = null;
        }
        this.f31941c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iM12696w = m12696w(mo10411b() + this.f31939a);
        int length = this.f31939a;
        if (length < iM12696w) {
            while (length < iM12696w) {
                if (AbstractC4154l.m8918a(obj, this.f31940b[length])) {
                    i10 = this.f31939a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM12696w) {
            return -1;
        }
        int length2 = this.f31940b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iM12696w; i11++) {
                    if (AbstractC4154l.m8918a(obj, this.f31940b[i11])) {
                        length = i11 + this.f31940b.length;
                        i10 = this.f31939a;
                    }
                }
                return -1;
            }
            if (AbstractC4154l.m8918a(obj, this.f31940b[length])) {
                i10 = this.f31939a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo10411b() == 0;
    }

    /* renamed from: j */
    public final void m12689j(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f31940b.length;
        while (i10 < length && it.hasNext()) {
            this.f31940b[i10] = it.next();
            i10++;
        }
        int i11 = this.f31939a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f31940b[i12] = it.next();
        }
        this.f31941c = collection.size() + this.f31941c;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f31940b[m12696w(pe.m10832g(this) + this.f31939a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iM12735y;
        int i10;
        int iM12696w = m12696w(mo10411b() + this.f31939a);
        int i11 = this.f31939a;
        if (i11 < iM12696w) {
            iM12735y = iM12696w - 1;
            if (i11 <= iM12735y) {
                while (!AbstractC4154l.m8918a(obj, this.f31940b[iM12735y])) {
                    if (iM12735y != i11) {
                        iM12735y--;
                    }
                }
                i10 = this.f31939a;
                return iM12735y - i10;
            }
            return -1;
        }
        if (i11 > iM12696w) {
            int i12 = iM12696w - 1;
            while (true) {
                if (-1 >= i12) {
                    iM12735y = AbstractC6662l.m12735y(this.f31940b);
                    int i13 = this.f31939a;
                    if (i13 <= iM12735y) {
                        while (!AbstractC4154l.m8918a(obj, this.f31940b[iM12735y])) {
                            if (iM12735y != i13) {
                                iM12735y--;
                            }
                        }
                        i10 = this.f31939a;
                    }
                } else {
                    if (AbstractC4154l.m8918a(obj, this.f31940b[i12])) {
                        iM12735y = i12 + this.f31940b.length;
                        i10 = this.f31939a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final void m12690q(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f31940b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f31938d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f31940b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        AbstractC6662l.m12715e(0, this.f31939a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f31940b;
        int length2 = objArr3.length;
        int i12 = this.f31939a;
        AbstractC6662l.m12715e(length2 - i12, 0, i12, objArr3, objArr2);
        this.f31939a = 0;
        this.f31940b = objArr2;
    }

    /* renamed from: r */
    public final Object m12691r() {
        if (isEmpty()) {
            return null;
        }
        return this.f31940b[this.f31939a];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo10412h(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM12696w;
        AbstractC4154l.m8923f(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f31940b.length != 0) {
            int iM12696w2 = m12696w(mo10411b() + this.f31939a);
            int i10 = this.f31939a;
            if (i10 < iM12696w2) {
                iM12696w = i10;
                while (i10 < iM12696w2) {
                    Object obj = this.f31940b[i10];
                    if (elements.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f31940b[iM12696w] = obj;
                        iM12696w++;
                    }
                    i10++;
                }
                AbstractC6662l.m12726p(this.f31940b, iM12696w, iM12696w2, null);
            } else {
                int length = this.f31940b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f31940b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f31940b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM12696w = m12696w(i11);
                for (int i12 = 0; i12 < iM12696w2; i12++) {
                    Object[] objArr2 = this.f31940b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f31940b[iM12696w] = obj3;
                        iM12696w = m12692s(iM12696w);
                    }
                }
                z6 = z10;
            }
            if (z6) {
                m12697x();
                this.f31941c = m12694u(iM12696w - this.f31939a);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m12697x();
        Object[] objArr = this.f31940b;
        int i10 = this.f31939a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f31939a = m12692s(i10);
        this.f31941c = mo10411b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m12697x();
        int iM12696w = m12696w(pe.m10832g(this) + this.f31939a);
        Object[] objArr = this.f31940b;
        Object obj = objArr[iM12696w];
        objArr[iM12696w] = null;
        this.f31941c = mo10411b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        oe.m10800b(i10, i11, this.f31941c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f31941c) {
            clear();
            return;
        }
        if (i12 == 1) {
            mo10412h(i10);
            return;
        }
        m12697x();
        if (i10 < this.f31941c - i11) {
            int iM12696w = m12696w(this.f31939a + (i10 - 1));
            int iM12696w2 = m12696w(this.f31939a + (i11 - 1));
            while (i10 > 0) {
                int i13 = iM12696w + 1;
                int iMin = Math.min(i10, Math.min(i13, iM12696w2 + 1));
                Object[] objArr = this.f31940b;
                int i14 = iM12696w2 - iMin;
                int i15 = iM12696w - iMin;
                AbstractC6662l.m12715e(i14 + 1, i15 + 1, i13, objArr, objArr);
                iM12696w = m12694u(i15);
                iM12696w2 = m12694u(i14);
                i10 -= iMin;
            }
            int iM12696w3 = m12696w(this.f31939a + i12);
            m12695v(this.f31939a, iM12696w3);
            this.f31939a = iM12696w3;
        } else {
            int iM12696w4 = m12696w(this.f31939a + i11);
            int iM12696w5 = m12696w(this.f31939a + i10);
            int i16 = this.f31941c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f31940b;
                i11 = Math.min(i16, Math.min(objArr2.length - iM12696w4, objArr2.length - iM12696w5));
                Object[] objArr3 = this.f31940b;
                int i17 = iM12696w4 + i11;
                AbstractC6662l.m12715e(iM12696w5, iM12696w4, i17, objArr3, objArr3);
                iM12696w4 = m12696w(i17);
                iM12696w5 = m12696w(iM12696w5 + i11);
            }
            int iM12696w6 = m12696w(this.f31941c + this.f31939a);
            m12695v(m12694u(iM12696w6 - i12), iM12696w6);
        }
        this.f31941c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM12696w;
        AbstractC4154l.m8923f(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f31940b.length != 0) {
            int iM12696w2 = m12696w(mo10411b() + this.f31939a);
            int i10 = this.f31939a;
            if (i10 < iM12696w2) {
                iM12696w = i10;
                while (i10 < iM12696w2) {
                    Object obj = this.f31940b[i10];
                    if (elements.contains(obj)) {
                        this.f31940b[iM12696w] = obj;
                        iM12696w++;
                    } else {
                        z6 = true;
                    }
                    i10++;
                }
                AbstractC6662l.m12726p(this.f31940b, iM12696w, iM12696w2, null);
            } else {
                int length = this.f31940b.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f31940b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f31940b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iM12696w = m12696w(i11);
                for (int i12 = 0; i12 < iM12696w2; i12++) {
                    Object[] objArr2 = this.f31940b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f31940b[iM12696w] = obj3;
                        iM12696w = m12692s(iM12696w);
                    } else {
                        z10 = true;
                    }
                }
                z6 = z10;
            }
            if (z6) {
                m12697x();
                this.f31941c = m12694u(iM12696w - this.f31939a);
            }
        }
        return z6;
    }

    /* renamed from: s */
    public final int m12692s(int i10) {
        if (i10 == AbstractC6662l.m12735y(this.f31940b)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iMo10411b = mo10411b();
        if (i10 < 0 || i10 >= iMo10411b) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, iMo10411b, ", size: "));
        }
        int iM12696w = m12696w(this.f31939a + i10);
        Object[] objArr = this.f31940b;
        Object obj2 = objArr[iM12696w];
        objArr[iM12696w] = obj;
        return obj2;
    }

    /* renamed from: t */
    public final Object m12693t() {
        if (isEmpty()) {
            return null;
        }
        return this.f31940b[m12696w(pe.m10832g(this) + this.f31939a)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo10411b()]);
    }

    /* renamed from: u */
    public final int m12694u(int i10) {
        return i10 < 0 ? i10 + this.f31940b.length : i10;
    }

    /* renamed from: v */
    public final void m12695v(int i10, int i11) {
        if (i10 < i11) {
            AbstractC6662l.m12726p(this.f31940b, i10, i11, null);
            return;
        }
        Object[] objArr = this.f31940b;
        AbstractC6662l.m12726p(objArr, i10, objArr.length, null);
        AbstractC6662l.m12726p(this.f31940b, 0, i11, null);
    }

    /* renamed from: w */
    public final int m12696w(int i10) {
        Object[] objArr = this.f31940b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* renamed from: x */
    public final void m12697x() {
        ((AbstractList) this).modCount++;
    }

    public C6661k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f31938d;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Illegal Capacity: "));
        }
        this.f31940b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC4154l.m8923f(array, "array");
        int length = array.length;
        int i10 = this.f31941c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            AbstractC4154l.m8921d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iM12696w = m12696w(this.f31941c + this.f31939a);
        int i11 = this.f31939a;
        if (i11 < iM12696w) {
            AbstractC6662l.m12720j(i11, iM12696w, 2, this.f31940b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f31940b;
            AbstractC6662l.m12715e(0, this.f31939a, objArr.length, objArr, array);
            Object[] objArr2 = this.f31940b;
            AbstractC6662l.m12715e(objArr2.length - this.f31939a, 0, iM12696w, objArr2, array);
        }
        int i12 = this.f31941c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m12697x();
        m12690q(elements.size() + mo10411b());
        m12689j(m12696w(mo10411b() + this.f31939a), elements);
        return true;
    }
}
