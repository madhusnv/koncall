package p001o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class dea extends x8 implements RandomAccess, Serializable {

    /* renamed from: d */
    public static final C12884b f19648d = new C12884b(null);

    /* renamed from: e */
    public static final dea f19649e;

    /* renamed from: a */
    public Object[] f19650a;

    /* renamed from: b */
    public int f19651b;

    /* renamed from: c */
    public boolean f19652c;

    /* renamed from: o.dea$a */
    public static final class C12883a extends x8 implements RandomAccess, Serializable {

        /* renamed from: a */
        public Object[] f19653a;

        /* renamed from: b */
        public final int f19654b;

        /* renamed from: c */
        public int f19655c;

        /* renamed from: d */
        public final C12883a f19656d;

        /* renamed from: e */
        public final dea f19657e;

        /* renamed from: o.dea$a$a */
        public static final class a implements ListIterator, sb9 {

            /* renamed from: a */
            public final C12883a f19658a;

            /* renamed from: b */
            public int f19659b;

            /* renamed from: c */
            public int f19660c;

            /* renamed from: d */
            public int f19661d;

            public a(C12883a c12883a, int i) {
                sq8.m48649h(c12883a, "list");
                this.f19658a = c12883a;
                this.f19659b = i;
                this.f19660c = -1;
                this.f19661d = ((AbstractList) c12883a).modCount;
            }

            /* renamed from: a */
            public final void m22897a() {
                if (((AbstractList) this.f19658a.f19657e).modCount != this.f19661d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                m22897a();
                C12883a c12883a = this.f19658a;
                int i = this.f19659b;
                this.f19659b = i + 1;
                c12883a.add(i, obj);
                this.f19660c = -1;
                this.f19661d = ((AbstractList) this.f19658a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f19659b < this.f19658a.f19655c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f19659b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                m22897a();
                if (this.f19659b >= this.f19658a.f19655c) {
                    throw new NoSuchElementException();
                }
                int i = this.f19659b;
                this.f19659b = i + 1;
                this.f19660c = i;
                return this.f19658a.f19653a[this.f19658a.f19654b + this.f19660c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f19659b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                m22897a();
                int i = this.f19659b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f19659b = i2;
                this.f19660c = i2;
                return this.f19658a.f19653a[this.f19658a.f19654b + this.f19660c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f19659b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                m22897a();
                int i = this.f19660c;
                if (!(i != -1)) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f19658a.remove(i);
                this.f19659b = this.f19660c;
                this.f19660c = -1;
                this.f19661d = ((AbstractList) this.f19658a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m22897a();
                int i = this.f19660c;
                if (!(i != -1)) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f19658a.set(i, obj);
            }
        }

        public C12883a(Object[] objArr, int i, int i2, C12883a c12883a, dea deaVar) {
            sq8.m48649h(objArr, "backing");
            sq8.m48649h(deaVar, "root");
            this.f19653a = objArr;
            this.f19654b = i;
            this.f19655c = i2;
            this.f19656d = c12883a;
            this.f19657e = deaVar;
            ((AbstractList) this).modCount = ((AbstractList) deaVar).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (m22892J()) {
                return new kff(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        /* renamed from: A */
        public final void m22887A(int i, Collection collection, int i2) {
            m22893L();
            C12883a c12883a = this.f19656d;
            if (c12883a != null) {
                c12883a.m22887A(i, collection, i2);
            } else {
                this.f19657e.m22868I(i, collection, i2);
            }
            this.f19653a = this.f19657e.f19650a;
            this.f19655c += i2;
        }

        /* renamed from: B */
        public final void m22888B(int i, Object obj) {
            m22893L();
            C12883a c12883a = this.f19656d;
            if (c12883a != null) {
                c12883a.m22888B(i, obj);
            } else {
                this.f19657e.m22869J(i, obj);
            }
            this.f19653a = this.f19657e.f19650a;
            this.f19655c++;
        }

        /* renamed from: F */
        public final void m22889F() {
            if (((AbstractList) this.f19657e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: G */
        public final void m22890G() {
            if (m22892J()) {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: I */
        public final boolean m22891I(List list) {
            return eea.m24855h(this.f19653a, this.f19654b, this.f19655c, list);
        }

        /* renamed from: J */
        public final boolean m22892J() {
            return this.f19657e.f19652c;
        }

        /* renamed from: L */
        public final void m22893L() {
            ((AbstractList) this).modCount++;
        }

        /* renamed from: M */
        public final Object m22894M(int i) {
            m22893L();
            C12883a c12883a = this.f19656d;
            this.f19655c--;
            return c12883a != null ? c12883a.m22894M(i) : this.f19657e.m22877T(i);
        }

        /* renamed from: N */
        public final void m22895N(int i, int i2) {
            if (i2 > 0) {
                m22893L();
            }
            C12883a c12883a = this.f19656d;
            if (c12883a != null) {
                c12883a.m22895N(i, i2);
            } else {
                this.f19657e.m22878U(i, i2);
            }
            this.f19655c -= i2;
        }

        /* renamed from: O */
        public final int m22896O(int i, int i2, Collection collection, boolean z) {
            C12883a c12883a = this.f19656d;
            int iM22896O = c12883a != null ? c12883a.m22896O(i, i2, collection, z) : this.f19657e.m22879V(i, i2, collection, z);
            if (iM22896O > 0) {
                m22893L();
            }
            this.f19655c -= iM22896O;
            return iM22896O;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            m22890G();
            m22889F();
            m22888B(this.f19654b + this.f19655c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            m22890G();
            m22889F();
            int size = collection.size();
            m22887A(this.f19654b + this.f19655c, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m22890G();
            m22889F();
            m22895N(this.f19654b, this.f19655c);
        }

        @Override // p001o.x8
        /* renamed from: d */
        public int mo22880d() {
            m22889F();
            return this.f19655c;
        }

        @Override // p001o.x8
        /* renamed from: e */
        public Object mo22881e(int i) {
            m22890G();
            m22889F();
            e8.f21141a.m24504b(i, this.f19655c);
            return m22894M(this.f19654b + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            m22889F();
            return obj == this || ((obj instanceof List) && m22891I((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            m22889F();
            e8.f21141a.m24504b(i, this.f19655c);
            return this.f19653a[this.f19654b + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m22889F();
            return eea.m24856i(this.f19653a, this.f19654b, this.f19655c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            m22889F();
            for (int i = 0; i < this.f19655c; i++) {
                if (sq8.m48644c(this.f19653a[this.f19654b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m22889F();
            return this.f19655c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            m22889F();
            for (int i = this.f19655c - 1; i >= 0; i--) {
                if (sq8.m48644c(this.f19653a[this.f19654b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            m22890G();
            m22889F();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            m22890G();
            m22889F();
            return m22896O(this.f19654b, this.f19655c, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            m22890G();
            m22889F();
            return m22896O(this.f19654b, this.f19655c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            m22890G();
            m22889F();
            e8.f21141a.m24504b(i, this.f19655c);
            Object[] objArr = this.f19653a;
            int i2 = this.f19654b;
            Object obj2 = objArr[i2 + i];
            objArr[i2 + i] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            e8.f21141a.m24506d(i, i2, this.f19655c);
            return new C12883a(this.f19653a, this.f19654b + i, i2 - i, this, this.f19657e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            sq8.m48649h(objArr, "array");
            m22889F();
            int length = objArr.length;
            int i = this.f19655c;
            if (length >= i) {
                Object[] objArr2 = this.f19653a;
                int i2 = this.f19654b;
                fp0.m27260i(objArr2, objArr, 0, i2, i + i2);
                return bh3.m18964f(this.f19655c, objArr);
            }
            Object[] objArr3 = this.f19653a;
            int i3 = this.f19654b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr3, i3, i + i3, objArr.getClass());
            sq8.m48648g(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m22889F();
            return eea.m24857j(this.f19653a, this.f19654b, this.f19655c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            m22889F();
            e8.f21141a.m24505c(i, this.f19655c);
            return new a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            m22890G();
            m22889F();
            e8.f21141a.m24505c(i, this.f19655c);
            m22888B(this.f19654b + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection collection) {
            sq8.m48649h(collection, "elements");
            m22890G();
            m22889F();
            e8.f21141a.m24505c(i, this.f19655c);
            int size = collection.size();
            m22887A(this.f19654b + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            m22889F();
            Object[] objArr = this.f19653a;
            int i = this.f19654b;
            return fp0.m27266o(objArr, i, this.f19655c + i);
        }
    }

    /* renamed from: o.dea$b */
    public static final class C12884b {
        public C12884b() {
        }

        public /* synthetic */ C12884b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.dea$c */
    public static final class C12885c implements ListIterator, sb9 {

        /* renamed from: a */
        public final dea f19662a;

        /* renamed from: b */
        public int f19663b;

        /* renamed from: c */
        public int f19664c;

        /* renamed from: d */
        public int f19665d;

        public C12885c(dea deaVar, int i) {
            sq8.m48649h(deaVar, "list");
            this.f19662a = deaVar;
            this.f19663b = i;
            this.f19664c = -1;
            this.f19665d = ((AbstractList) deaVar).modCount;
        }

        /* renamed from: a */
        public final void m22898a() {
            if (((AbstractList) this.f19662a).modCount != this.f19665d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            m22898a();
            dea deaVar = this.f19662a;
            int i = this.f19663b;
            this.f19663b = i + 1;
            deaVar.add(i, obj);
            this.f19664c = -1;
            this.f19665d = ((AbstractList) this.f19662a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19663b < this.f19662a.f19651b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19663b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            m22898a();
            if (this.f19663b >= this.f19662a.f19651b) {
                throw new NoSuchElementException();
            }
            int i = this.f19663b;
            this.f19663b = i + 1;
            this.f19664c = i;
            return this.f19662a.f19650a[this.f19664c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19663b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            m22898a();
            int i = this.f19663b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.f19663b = i2;
            this.f19664c = i2;
            return this.f19662a.f19650a[this.f19664c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19663b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m22898a();
            int i = this.f19664c;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f19662a.remove(i);
            this.f19663b = this.f19664c;
            this.f19664c = -1;
            this.f19665d = ((AbstractList) this.f19662a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            m22898a();
            int i = this.f19664c;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f19662a.set(i, obj);
        }
    }

    static {
        dea deaVar = new dea(0);
        deaVar.f19652c = true;
        f19649e = deaVar;
    }

    public dea(int i) {
        this.f19650a = eea.m24851d(i);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f19652c) {
            return new kff(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: I */
    public final void m22868I(int i, Collection collection, int i2) {
        m22876S();
        m22875R(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f19650a[i + i3] = it.next();
        }
    }

    /* renamed from: J */
    public final void m22869J(int i, Object obj) {
        m22876S();
        m22875R(i, 1);
        this.f19650a[i] = obj;
    }

    /* renamed from: L */
    public final List m22870L() {
        m22871M();
        this.f19652c = true;
        return this.f19651b > 0 ? this : f19649e;
    }

    /* renamed from: M */
    public final void m22871M() {
        if (this.f19652c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: N */
    public final boolean m22872N(List list) {
        return eea.m24855h(this.f19650a, 0, this.f19651b, list);
    }

    /* renamed from: O */
    public final void m22873O(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f19650a;
        if (i > objArr.length) {
            this.f19650a = eea.m24852e(this.f19650a, e8.f21141a.m24507e(objArr.length, i));
        }
    }

    /* renamed from: P */
    public final void m22874P(int i) {
        m22873O(this.f19651b + i);
    }

    /* renamed from: R */
    public final void m22875R(int i, int i2) {
        m22874P(i2);
        Object[] objArr = this.f19650a;
        fp0.m27260i(objArr, objArr, i + i2, i, this.f19651b);
        this.f19651b += i2;
    }

    /* renamed from: S */
    public final void m22876S() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: T */
    public final Object m22877T(int i) {
        m22876S();
        Object[] objArr = this.f19650a;
        Object obj = objArr[i];
        fp0.m27260i(objArr, objArr, i, i + 1, this.f19651b);
        eea.m24853f(this.f19650a, this.f19651b - 1);
        this.f19651b--;
        return obj;
    }

    /* renamed from: U */
    public final void m22878U(int i, int i2) {
        if (i2 > 0) {
            m22876S();
        }
        Object[] objArr = this.f19650a;
        fp0.m27260i(objArr, objArr, i, i + i2, this.f19651b);
        Object[] objArr2 = this.f19650a;
        int i3 = this.f19651b;
        eea.m24854g(objArr2, i3 - i2, i3);
        this.f19651b -= i2;
    }

    /* renamed from: V */
    public final int m22879V(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f19650a[i5]) == z) {
                Object[] objArr = this.f19650a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f19650a;
        fp0.m27260i(objArr2, objArr2, i + i4, i2 + i, this.f19651b);
        Object[] objArr3 = this.f19650a;
        int i7 = this.f19651b;
        eea.m24854g(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            m22876S();
        }
        this.f19651b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m22871M();
        m22869J(this.f19651b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        m22871M();
        int size = collection.size();
        m22868I(this.f19651b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m22871M();
        m22878U(0, this.f19651b);
    }

    @Override // p001o.x8
    /* renamed from: d */
    public int mo22880d() {
        return this.f19651b;
    }

    @Override // p001o.x8
    /* renamed from: e */
    public Object mo22881e(int i) {
        m22871M();
        e8.f21141a.m24504b(i, this.f19651b);
        return m22877T(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m22872N((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        e8.f21141a.m24504b(i, this.f19651b);
        return this.f19650a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return eea.m24856i(this.f19650a, 0, this.f19651b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.f19651b; i++) {
            if (sq8.m48644c(this.f19650a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f19651b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.f19651b - 1; i >= 0; i--) {
            if (sq8.m48644c(this.f19650a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m22871M();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        m22871M();
        return m22879V(0, this.f19651b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        m22871M();
        return m22879V(0, this.f19651b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        m22871M();
        e8.f21141a.m24504b(i, this.f19651b);
        Object[] objArr = this.f19650a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        e8.f21141a.m24506d(i, i2, this.f19651b);
        return new C12883a(this.f19650a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        int length = objArr.length;
        int i = this.f19651b;
        if (length >= i) {
            fp0.m27260i(this.f19650a, objArr, 0, 0, i);
            return bh3.m18964f(this.f19651b, objArr);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19650a, 0, i, objArr.getClass());
        sq8.m48648g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return eea.m24857j(this.f19650a, 0, this.f19651b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        e8.f21141a.m24505c(i, this.f19651b);
        return new C12885c(this, i);
    }

    public /* synthetic */ dea(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        m22871M();
        e8.f21141a.m24505c(i, this.f19651b);
        m22869J(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        sq8.m48649h(collection, "elements");
        m22871M();
        e8.f21141a.m24505c(i, this.f19651b);
        int size = collection.size();
        m22868I(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return fp0.m27266o(this.f19650a, 0, this.f19651b);
    }
}
