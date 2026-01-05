package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class q0i implements Collection, sb9 {

    /* renamed from: a */
    public final long[] f41067a;

    /* renamed from: o.q0i$a */
    public static final class C16268a implements Iterator, sb9 {

        /* renamed from: a */
        public final long[] f41068a;

        /* renamed from: b */
        public int f41069b;

        public C16268a(long[] jArr) {
            sq8.m48649h(jArr, "array");
            this.f41068a = jArr;
        }

        /* renamed from: a */
        public long m44645a() {
            int i = this.f41069b;
            long[] jArr = this.f41068a;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f41069b));
            }
            this.f41069b = i + 1;
            return p0i.m42841c(jArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41069b < this.f41068a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return p0i.m42840a(m44645a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ q0i(long[] jArr) {
        this.f41067a = jArr;
    }

    /* renamed from: A */
    public static int m44629A(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: B */
    public static boolean m44630B(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: F */
    public static Iterator m44631F(long[] jArr) {
        return new C16268a(jArr);
    }

    /* renamed from: G */
    public static final void m44632G(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: I */
    public static String m44633I(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    /* renamed from: d */
    public static final /* synthetic */ q0i m44634d(long[] jArr) {
        return new q0i(jArr);
    }

    /* renamed from: e */
    public static long[] m44635e(int i) {
        return m44636j(new long[i]);
    }

    /* renamed from: j */
    public static long[] m44636j(long[] jArr) {
        sq8.m48649h(jArr, "storage");
        return jArr;
    }

    /* renamed from: o */
    public static boolean m44637o(long[] jArr, long j) {
        return gp0.m29250Q(jArr, j);
    }

    /* renamed from: p */
    public static boolean m44638p(long[] jArr, Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!((obj instanceof p0i) && gp0.m29250Q(jArr, ((p0i) obj).m42846j()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m44639r(long[] jArr, Object obj) {
        return (obj instanceof q0i) && sq8.m48644c(jArr, ((q0i) obj).m44642J());
    }

    /* renamed from: v */
    public static final long m44640v(long[] jArr, int i) {
        return p0i.m42841c(jArr[i]);
    }

    /* renamed from: y */
    public static int m44641y(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: J */
    public final /* synthetic */ long[] m44642J() {
        return this.f41067a;
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
        if (obj instanceof p0i) {
            return m44643n(((p0i) obj).m42846j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return m44638p(this.f41067a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m44639r(this.f41067a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m44629A(this.f41067a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m44630B(this.f41067a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m44631F(this.f41067a);
    }

    /* renamed from: n */
    public boolean m44643n(long j) {
        return m44637o(this.f41067a, j);
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
        return m44633I(this.f41067a);
    }

    @Override // java.util.Collection
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m44641y(this.f41067a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
