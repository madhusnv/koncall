package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class l0i implements Collection, sb9 {

    /* renamed from: a */
    public final int[] f32962a;

    /* renamed from: o.l0i$a */
    public static final class C14957a implements Iterator, sb9 {

        /* renamed from: a */
        public final int[] f32963a;

        /* renamed from: b */
        public int f32964b;

        public C14957a(int[] iArr) {
            sq8.m48649h(iArr, "array");
            this.f32963a = iArr;
        }

        /* renamed from: a */
        public int m36440a() {
            int i = this.f32964b;
            int[] iArr = this.f32963a;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f32964b));
            }
            this.f32964b = i + 1;
            return j0i.m33018c(iArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32964b < this.f32963a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return j0i.m33017a(m36440a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ l0i(int[] iArr) {
        this.f32962a = iArr;
    }

    /* renamed from: A */
    public static int m36424A(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: B */
    public static boolean m36425B(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: F */
    public static Iterator m36426F(int[] iArr) {
        return new C14957a(iArr);
    }

    /* renamed from: G */
    public static final void m36427G(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: I */
    public static String m36428I(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    /* renamed from: d */
    public static final /* synthetic */ l0i m36429d(int[] iArr) {
        return new l0i(iArr);
    }

    /* renamed from: e */
    public static int[] m36430e(int i) {
        return m36431j(new int[i]);
    }

    /* renamed from: j */
    public static int[] m36431j(int[] iArr) {
        sq8.m48649h(iArr, "storage");
        return iArr;
    }

    /* renamed from: o */
    public static boolean m36432o(int[] iArr, int i) {
        return gp0.m29249P(iArr, i);
    }

    /* renamed from: p */
    public static boolean m36433p(int[] iArr, Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!((obj instanceof j0i) && gp0.m29249P(iArr, ((j0i) obj).m33022h()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m36434r(int[] iArr, Object obj) {
        return (obj instanceof l0i) && sq8.m48644c(iArr, ((l0i) obj).m36437J());
    }

    /* renamed from: v */
    public static final int m36435v(int[] iArr, int i) {
        return j0i.m33018c(iArr[i]);
    }

    /* renamed from: y */
    public static int m36436y(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: J */
    public final /* synthetic */ int[] m36437J() {
        return this.f32962a;
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
        if (obj instanceof j0i) {
            return m36438n(((j0i) obj).m33022h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return m36433p(this.f32962a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m36434r(this.f32962a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m36424A(this.f32962a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m36425B(this.f32962a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m36426F(this.f32962a);
    }

    /* renamed from: n */
    public boolean m36438n(int i) {
        return m36432o(this.f32962a, i);
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
        return m36428I(this.f32962a);
    }

    @Override // java.util.Collection
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m36436y(this.f32962a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
