package p001o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class oo0 extends x8 {

    /* renamed from: d */
    public static final C15850a f38641d = new C15850a(null);

    /* renamed from: e */
    public static final Object[] f38642e = new Object[0];

    /* renamed from: a */
    public int f38643a;

    /* renamed from: b */
    public Object[] f38644b;

    /* renamed from: c */
    public int f38645c;

    /* renamed from: o.oo0$a */
    public static final class C15850a {
        public C15850a() {
        }

        public /* synthetic */ C15850a(id5 id5Var) {
            this();
        }
    }

    public oo0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f38642e;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i);
            }
            objArr = new Object[i];
        }
        this.f38644b = objArr;
    }

    /* renamed from: A */
    public final void m42466A(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f38644b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f38642e) {
            this.f38644b = new Object[bce.m18601d(i, 10)];
        } else {
            m42483r(e8.f21141a.m24507e(objArr.length, i));
        }
    }

    /* renamed from: B */
    public final Object m42467B() {
        if (isEmpty()) {
            return null;
        }
        return this.f38644b[this.f38643a];
    }

    /* renamed from: F */
    public final int m42468F(int i) {
        if (i == gp0.c0(this.f38644b)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: G */
    public final Object m42469G() {
        if (isEmpty()) {
            return null;
        }
        return this.f38644b[m42472L(this.f38643a + ch3.m21248m(this))];
    }

    /* renamed from: I */
    public final int m42470I(int i) {
        return i < 0 ? i + this.f38644b.length : i;
    }

    /* renamed from: J */
    public final void m42471J(int i, int i2) {
        if (i < i2) {
            fp0.m27270s(this.f38644b, null, i, i2);
            return;
        }
        Object[] objArr = this.f38644b;
        fp0.m27270s(objArr, null, i, objArr.length);
        fp0.m27270s(this.f38644b, null, 0, i2);
    }

    /* renamed from: L */
    public final int m42472L(int i) {
        Object[] objArr = this.f38644b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: M */
    public final void m42473M() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: N */
    public final Object m42474N() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m42473M();
        Object[] objArr = this.f38644b;
        int i = this.f38643a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f38643a = m42468F(i);
        this.f38645c = size() - 1;
        return obj;
    }

    /* renamed from: O */
    public final Object m42475O() {
        if (isEmpty()) {
            return null;
        }
        return m42474N();
    }

    /* renamed from: P */
    public final Object m42476P() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m42473M();
        int iM42472L = m42472L(this.f38643a + ch3.m21248m(this));
        Object[] objArr = this.f38644b;
        Object obj = objArr[iM42472L];
        objArr[iM42472L] = null;
        this.f38645c = size() - 1;
        return obj;
    }

    /* renamed from: R */
    public final Object m42477R() {
        if (isEmpty()) {
            return null;
        }
        return m42476P();
    }

    /* renamed from: S */
    public final void m42478S(int i, int i2) {
        int iM42472L = m42472L(this.f38643a + (i - 1));
        int iM42472L2 = m42472L(this.f38643a + (i2 - 1));
        while (i > 0) {
            int i3 = iM42472L + 1;
            int iMin = Math.min(i, Math.min(i3, iM42472L2 + 1));
            Object[] objArr = this.f38644b;
            int i4 = iM42472L2 - iMin;
            int i5 = iM42472L - iMin;
            fp0.m27260i(objArr, objArr, i4 + 1, i5 + 1, i3);
            iM42472L = m42470I(i5);
            iM42472L2 = m42470I(i4);
            i -= iMin;
        }
    }

    /* renamed from: T */
    public final void m42479T(int i, int i2) {
        int iM42472L = m42472L(this.f38643a + i2);
        int iM42472L2 = m42472L(this.f38643a + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f38644b;
            i2 = Math.min(size, Math.min(objArr.length - iM42472L, objArr.length - iM42472L2));
            Object[] objArr2 = this.f38644b;
            int i3 = iM42472L + i2;
            fp0.m27260i(objArr2, objArr2, iM42472L2, iM42472L, i3);
            iM42472L = m42472L(i3);
            iM42472L2 = m42472L(iM42472L2 + i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m42481o(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m42473M();
        m42466A(size() + collection.size());
        m42482p(m42472L(this.f38643a + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m42473M();
            m42471J(this.f38643a, m42472L(this.f38643a + size()));
        }
        this.f38643a = 0;
        this.f38645c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p001o.x8
    /* renamed from: d */
    public int mo22880d() {
        return this.f38645c;
    }

    @Override // p001o.x8
    /* renamed from: e */
    public Object mo22881e(int i) {
        e8.f21141a.m24504b(i, size());
        if (i == ch3.m21248m(this)) {
            return m42476P();
        }
        if (i == 0) {
            return m42474N();
        }
        m42473M();
        int iM42472L = m42472L(this.f38643a + i);
        Object obj = this.f38644b[iM42472L];
        if (i < (size() >> 1)) {
            int i2 = this.f38643a;
            if (iM42472L >= i2) {
                Object[] objArr = this.f38644b;
                fp0.m27260i(objArr, objArr, i2 + 1, i2, iM42472L);
            } else {
                Object[] objArr2 = this.f38644b;
                fp0.m27260i(objArr2, objArr2, 1, 0, iM42472L);
                Object[] objArr3 = this.f38644b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f38643a;
                fp0.m27260i(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f38644b;
            int i4 = this.f38643a;
            objArr4[i4] = null;
            this.f38643a = m42468F(i4);
        } else {
            int iM42472L2 = m42472L(this.f38643a + ch3.m21248m(this));
            if (iM42472L <= iM42472L2) {
                Object[] objArr5 = this.f38644b;
                fp0.m27260i(objArr5, objArr5, iM42472L, iM42472L + 1, iM42472L2 + 1);
            } else {
                Object[] objArr6 = this.f38644b;
                fp0.m27260i(objArr6, objArr6, iM42472L, iM42472L + 1, objArr6.length);
                Object[] objArr7 = this.f38644b;
                objArr7[objArr7.length - 1] = objArr7[0];
                fp0.m27260i(objArr7, objArr7, 0, 1, iM42472L2 + 1);
            }
            this.f38644b[iM42472L2] = null;
        }
        this.f38645c = size() - 1;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f38644b[this.f38643a];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        e8.f21141a.m24504b(i, size());
        return this.f38644b[m42472L(this.f38643a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iM42472L = m42472L(this.f38643a + size());
        int length = this.f38643a;
        if (length < iM42472L) {
            while (length < iM42472L) {
                if (sq8.m48644c(obj, this.f38644b[length])) {
                    i = this.f38643a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM42472L) {
            return -1;
        }
        int length2 = this.f38644b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM42472L; i2++) {
                    if (sq8.m48644c(obj, this.f38644b[i2])) {
                        length = i2 + this.f38644b.length;
                        i = this.f38643a;
                    }
                }
                return -1;
            }
            if (sq8.m48644c(obj, this.f38644b[length])) {
                i = this.f38643a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final void m42480j(Object obj) {
        m42473M();
        m42466A(size() + 1);
        int iM42484y = m42484y(this.f38643a);
        this.f38643a = iM42484y;
        this.f38644b[iM42484y] = obj;
        this.f38645c = size() + 1;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f38644b[m42472L(this.f38643a + ch3.m21248m(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iC0;
        int i;
        int iM42472L = m42472L(this.f38643a + size());
        int i2 = this.f38643a;
        if (i2 < iM42472L) {
            iC0 = iM42472L - 1;
            if (i2 <= iC0) {
                while (!sq8.m48644c(obj, this.f38644b[iC0])) {
                    if (iC0 != i2) {
                        iC0--;
                    }
                }
                i = this.f38643a;
                return iC0 - i;
            }
            return -1;
        }
        if (i2 > iM42472L) {
            int i3 = iM42472L - 1;
            while (true) {
                if (-1 >= i3) {
                    iC0 = gp0.c0(this.f38644b);
                    int i4 = this.f38643a;
                    if (i4 <= iC0) {
                        while (!sq8.m48644c(obj, this.f38644b[iC0])) {
                            if (iC0 != i4) {
                                iC0--;
                            }
                        }
                        i = this.f38643a;
                    }
                } else {
                    if (sq8.m48644c(obj, this.f38644b[i3])) {
                        iC0 = i3 + this.f38644b.length;
                        i = this.f38643a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m42481o(Object obj) {
        m42473M();
        m42466A(size() + 1);
        this.f38644b[m42472L(this.f38643a + size())] = obj;
        this.f38645c = size() + 1;
    }

    /* renamed from: p */
    public final void m42482p(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f38644b.length;
        while (i < length && it.hasNext()) {
            this.f38644b[i] = it.next();
            i++;
        }
        int i2 = this.f38643a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f38644b[i3] = it.next();
        }
        this.f38645c = size() + collection.size();
    }

    /* renamed from: r */
    public final void m42483r(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f38644b;
        fp0.m27260i(objArr2, objArr, 0, this.f38643a, objArr2.length);
        Object[] objArr3 = this.f38644b;
        int length = objArr3.length;
        int i2 = this.f38643a;
        fp0.m27260i(objArr3, objArr, length - i2, 0, i2);
        this.f38643a = 0;
        this.f38644b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iM42472L;
        sq8.m48649h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f38644b.length == 0) == false) {
                int iM42472L2 = m42472L(this.f38643a + size());
                int i = this.f38643a;
                if (i < iM42472L2) {
                    iM42472L = i;
                    while (i < iM42472L2) {
                        Object obj = this.f38644b[i];
                        if (!collection.contains(obj)) {
                            this.f38644b[iM42472L] = obj;
                            iM42472L++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    fp0.m27270s(this.f38644b, null, iM42472L, iM42472L2);
                } else {
                    int length = this.f38644b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f38644b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.f38644b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    iM42472L = m42472L(i2);
                    for (int i3 = 0; i3 < iM42472L2; i3++) {
                        Object[] objArr2 = this.f38644b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.f38644b[iM42472L] = obj3;
                            iM42472L = m42468F(iM42472L);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    m42473M();
                    this.f38645c = m42470I(iM42472L - this.f38643a);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e8.f21141a.m24506d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        m42473M();
        if (i < size() - i2) {
            m42478S(i, i2);
            int iM42472L = m42472L(this.f38643a + i3);
            m42471J(this.f38643a, iM42472L);
            this.f38643a = iM42472L;
        } else {
            m42479T(i, i2);
            int iM42472L2 = m42472L(this.f38643a + size());
            m42471J(m42470I(iM42472L2 - i3), iM42472L2);
        }
        this.f38645c = size() - i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iM42472L;
        sq8.m48649h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f38644b.length == 0) == false) {
                int iM42472L2 = m42472L(this.f38643a + size());
                int i = this.f38643a;
                if (i < iM42472L2) {
                    iM42472L = i;
                    while (i < iM42472L2) {
                        Object obj = this.f38644b[i];
                        if (collection.contains(obj)) {
                            this.f38644b[iM42472L] = obj;
                            iM42472L++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    fp0.m27270s(this.f38644b, null, iM42472L, iM42472L2);
                } else {
                    int length = this.f38644b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f38644b;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.f38644b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    iM42472L = m42472L(i2);
                    for (int i3 = 0; i3 < iM42472L2; i3++) {
                        Object[] objArr2 = this.f38644b;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f38644b[iM42472L] = obj3;
                            iM42472L = m42468F(iM42472L);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    m42473M();
                    this.f38645c = m42470I(iM42472L - this.f38643a);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        e8.f21141a.m24504b(i, size());
        int iM42472L = m42472L(this.f38643a + i);
        Object[] objArr = this.f38644b;
        Object obj2 = objArr[iM42472L];
        objArr[iM42472L] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        sq8.m48649h(objArr, "array");
        if (objArr.length < size()) {
            objArr = dp0.m23653a(objArr, size());
        }
        int iM42472L = m42472L(this.f38643a + size());
        int i = this.f38643a;
        if (i < iM42472L) {
            fp0.m27264m(this.f38644b, objArr, 0, i, iM42472L, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f38644b;
            fp0.m27260i(objArr2, objArr, 0, this.f38643a, objArr2.length);
            Object[] objArr3 = this.f38644b;
            fp0.m27260i(objArr3, objArr, objArr3.length - this.f38643a, 0, iM42472L);
        }
        return bh3.m18964f(size(), objArr);
    }

    /* renamed from: y */
    public final int m42484y(int i) {
        return i == 0 ? gp0.c0(this.f38644b) : i - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        e8.f21141a.m24505c(i, size());
        if (i == size()) {
            m42481o(obj);
            return;
        }
        if (i == 0) {
            m42480j(obj);
            return;
        }
        m42473M();
        m42466A(size() + 1);
        int iM42472L = m42472L(this.f38643a + i);
        if (i < ((size() + 1) >> 1)) {
            int iM42484y = m42484y(iM42472L);
            int iM42484y2 = m42484y(this.f38643a);
            int i2 = this.f38643a;
            if (iM42484y >= i2) {
                Object[] objArr = this.f38644b;
                objArr[iM42484y2] = objArr[i2];
                fp0.m27260i(objArr, objArr, i2, i2 + 1, iM42484y + 1);
            } else {
                Object[] objArr2 = this.f38644b;
                fp0.m27260i(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.f38644b;
                objArr3[objArr3.length - 1] = objArr3[0];
                fp0.m27260i(objArr3, objArr3, 0, 1, iM42484y + 1);
            }
            this.f38644b[iM42484y] = obj;
            this.f38643a = iM42484y2;
        } else {
            int iM42472L2 = m42472L(this.f38643a + size());
            if (iM42472L < iM42472L2) {
                Object[] objArr4 = this.f38644b;
                fp0.m27260i(objArr4, objArr4, iM42472L + 1, iM42472L, iM42472L2);
            } else {
                Object[] objArr5 = this.f38644b;
                fp0.m27260i(objArr5, objArr5, 1, 0, iM42472L2);
                Object[] objArr6 = this.f38644b;
                objArr6[0] = objArr6[objArr6.length - 1];
                fp0.m27260i(objArr6, objArr6, iM42472L + 1, iM42472L, objArr6.length - 1);
            }
            this.f38644b[iM42472L] = obj;
        }
        this.f38645c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        sq8.m48649h(collection, "elements");
        e8.f21141a.m24505c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m42473M();
        m42466A(size() + collection.size());
        int iM42472L = m42472L(this.f38643a + size());
        int iM42472L2 = m42472L(this.f38643a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f38643a;
            int length = i2 - size;
            if (iM42472L2 < i2) {
                Object[] objArr = this.f38644b;
                fp0.m27260i(objArr, objArr, length, i2, objArr.length);
                if (size >= iM42472L2) {
                    Object[] objArr2 = this.f38644b;
                    fp0.m27260i(objArr2, objArr2, objArr2.length - size, 0, iM42472L2);
                } else {
                    Object[] objArr3 = this.f38644b;
                    fp0.m27260i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f38644b;
                    fp0.m27260i(objArr4, objArr4, 0, size, iM42472L2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f38644b;
                fp0.m27260i(objArr5, objArr5, length, i2, iM42472L2);
            } else {
                Object[] objArr6 = this.f38644b;
                length += objArr6.length;
                int i3 = iM42472L2 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    fp0.m27260i(objArr6, objArr6, length, i2, iM42472L2);
                } else {
                    fp0.m27260i(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.f38644b;
                    fp0.m27260i(objArr7, objArr7, 0, this.f38643a + length2, iM42472L2);
                }
            }
            this.f38643a = length;
            m42482p(m42470I(iM42472L2 - size), collection);
        } else {
            int i4 = iM42472L2 + size;
            if (iM42472L2 < iM42472L) {
                int i5 = size + iM42472L;
                Object[] objArr8 = this.f38644b;
                if (i5 <= objArr8.length) {
                    fp0.m27260i(objArr8, objArr8, i4, iM42472L2, iM42472L);
                } else if (i4 >= objArr8.length) {
                    fp0.m27260i(objArr8, objArr8, i4 - objArr8.length, iM42472L2, iM42472L);
                } else {
                    int length3 = iM42472L - (i5 - objArr8.length);
                    fp0.m27260i(objArr8, objArr8, 0, length3, iM42472L);
                    Object[] objArr9 = this.f38644b;
                    fp0.m27260i(objArr9, objArr9, i4, iM42472L2, length3);
                }
            } else {
                Object[] objArr10 = this.f38644b;
                fp0.m27260i(objArr10, objArr10, size, 0, iM42472L);
                Object[] objArr11 = this.f38644b;
                if (i4 >= objArr11.length) {
                    fp0.m27260i(objArr11, objArr11, i4 - objArr11.length, iM42472L2, objArr11.length);
                } else {
                    fp0.m27260i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f38644b;
                    fp0.m27260i(objArr12, objArr12, i4, iM42472L2, objArr12.length - size);
                }
            }
            m42482p(iM42472L2, collection);
        }
        return true;
    }

    public oo0() {
        this.f38644b = f38642e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
