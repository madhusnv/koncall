package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class xzh implements Collection, sb9 {

    /* renamed from: a */
    public final byte[] f54649a;

    /* renamed from: o.xzh$a */
    public static final class C18283a implements Iterator, sb9 {

        /* renamed from: a */
        public final byte[] f54650a;

        /* renamed from: b */
        public int f54651b;

        public C18283a(byte[] bArr) {
            sq8.m48649h(bArr, "array");
            this.f54650a = bArr;
        }

        /* renamed from: a */
        public byte m57064a() {
            int i = this.f54651b;
            byte[] bArr = this.f54650a;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f54651b));
            }
            this.f54651b = i + 1;
            return wzh.m55511c(bArr[i]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54651b < this.f54650a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return wzh.m55510a(m57064a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ xzh(byte[] bArr) {
        this.f54649a = bArr;
    }

    /* renamed from: A */
    public static int m57048A(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: B */
    public static boolean m57049B(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: F */
    public static Iterator m57050F(byte[] bArr) {
        return new C18283a(bArr);
    }

    /* renamed from: G */
    public static final void m57051G(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: I */
    public static String m57052I(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    /* renamed from: d */
    public static final /* synthetic */ xzh m57053d(byte[] bArr) {
        return new xzh(bArr);
    }

    /* renamed from: e */
    public static byte[] m57054e(int i) {
        return m57055j(new byte[i]);
    }

    /* renamed from: j */
    public static byte[] m57055j(byte[] bArr) {
        sq8.m48649h(bArr, "storage");
        return bArr;
    }

    /* renamed from: o */
    public static boolean m57056o(byte[] bArr, byte b) {
        return gp0.m29247N(bArr, b);
    }

    /* renamed from: p */
    public static boolean m57057p(byte[] bArr, Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!((obj instanceof wzh) && gp0.m29247N(bArr, ((wzh) obj).m55515h()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m57058r(byte[] bArr, Object obj) {
        return (obj instanceof xzh) && sq8.m48644c(bArr, ((xzh) obj).m57061J());
    }

    /* renamed from: v */
    public static final byte m57059v(byte[] bArr, int i) {
        return wzh.m55511c(bArr[i]);
    }

    /* renamed from: y */
    public static int m57060y(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: J */
    public final /* synthetic */ byte[] m57061J() {
        return this.f54649a;
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
        if (obj instanceof wzh) {
            return m57062n(((wzh) obj).m55515h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return m57057p(this.f54649a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m57058r(this.f54649a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m57048A(this.f54649a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m57049B(this.f54649a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m57050F(this.f54649a);
    }

    /* renamed from: n */
    public boolean m57062n(byte b) {
        return m57056o(this.f54649a, b);
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
        return m57052I(this.f54649a);
    }

    @Override // java.util.Collection
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m57060y(this.f54649a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
