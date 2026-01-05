package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class e1i implements Collection, sb9 {

    /* renamed from: a */
    public final short[] f20799a;

    /* renamed from: o.e1i$a */
    public static final class C13085a implements Iterator, sb9 {

        /* renamed from: a */
        public final short[] f20800a;

        /* renamed from: b */
        public int f20801b;

        public C13085a(short[] sArr) {
            sq8.m48649h(sArr, "array");
            this.f20800a = sArr;
        }

        /* renamed from: a */
        public short m24135a() {
            int i = this.f20801b;
            short[] sArr = this.f20800a;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f20801b));
            }
            this.f20801b = i + 1;
            return d1i.m22246c(sArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20801b < this.f20800a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return d1i.m22245a(m24135a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ e1i(short[] sArr) {
        this.f20799a = sArr;
    }

    /* renamed from: A */
    public static int m24119A(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: B */
    public static boolean m24120B(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: F */
    public static Iterator m24121F(short[] sArr) {
        return new C13085a(sArr);
    }

    /* renamed from: G */
    public static final void m24122G(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: I */
    public static String m24123I(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    /* renamed from: d */
    public static final /* synthetic */ e1i m24124d(short[] sArr) {
        return new e1i(sArr);
    }

    /* renamed from: e */
    public static short[] m24125e(int i) {
        return m24126j(new short[i]);
    }

    /* renamed from: j */
    public static short[] m24126j(short[] sArr) {
        sq8.m48649h(sArr, "storage");
        return sArr;
    }

    /* renamed from: o */
    public static boolean m24127o(short[] sArr, short s) {
        return gp0.m29252S(sArr, s);
    }

    /* renamed from: p */
    public static boolean m24128p(short[] sArr, Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!((obj instanceof d1i) && gp0.m29252S(sArr, ((d1i) obj).m22250h()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m24129r(short[] sArr, Object obj) {
        return (obj instanceof e1i) && sq8.m48644c(sArr, ((e1i) obj).m24132J());
    }

    /* renamed from: v */
    public static final short m24130v(short[] sArr, int i) {
        return d1i.m22246c(sArr[i]);
    }

    /* renamed from: y */
    public static int m24131y(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: J */
    public final /* synthetic */ short[] m24132J() {
        return this.f20799a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d1i) {
            return m24133n(((d1i) obj).m22250h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return m24128p(this.f20799a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m24129r(this.f20799a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m24119A(this.f20799a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m24120B(this.f20799a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m24121F(this.f20799a);
    }

    /* renamed from: n */
    public boolean m24133n(short s) {
        return m24127o(this.f20799a, s);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    public String toString() {
        return m24123I(this.f20799a);
    }

    @Override // java.util.Collection
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m24131y(this.f20799a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
