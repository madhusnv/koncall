package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class lb8 implements Set, sb9 {

    /* renamed from: a */
    public int f33542a;

    /* renamed from: b */
    public Object[] f33543b = new Object[16];

    /* renamed from: o.lb8$a */
    public static final class C15050a implements Iterator, sb9 {

        /* renamed from: a */
        public int f33544a;

        public C15050a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33544a < lb8.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArrM36856p = lb8.this.m36856p();
            int i = this.f33544a;
            this.f33544a = i + 1;
            Object obj = objArrM36856p[i];
            sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.lb8$b */
    public static final class C15051b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15051b f33546a = new C15051b();

        public C15051b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            sq8.m48649h(obj, "it");
            return obj.toString();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int iM36853j;
        sq8.m48649h(obj, "value");
        int size = size();
        Object[] objArr = this.f33543b;
        if (size > 0) {
            iM36853j = m36853j(obj);
            if (iM36853j >= 0) {
                return false;
            }
        } else {
            iM36853j = -1;
        }
        int i = -(iM36853j + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            fp0.m27260i(objArr, objArr2, i + 1, i, size);
            fp0.m27264m(objArr, objArr2, 0, 0, i, 6, null);
            this.f33543b = objArr2;
        } else {
            fp0.m27260i(objArr, objArr, i + 1, i, size);
        }
        this.f33543b[i] = obj;
        this.f33542a = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        fp0.m27273v(this.f33543b, null, 0, 0, 6, null);
        this.f33542a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && m36853j(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void m36852e(Collection collection) {
        Object[] objArr;
        int i;
        Object obj;
        boolean z;
        sq8.m48649h(collection, "collection");
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof lb8)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.f33543b;
        lb8 lb8Var = (lb8) collection;
        Object[] objArr3 = lb8Var.f33543b;
        int size = size();
        int size2 = lb8Var.size();
        int i2 = size + size2;
        boolean z2 = this.f33543b.length < i2;
        boolean z3 = size == 0 || ov.m42710a(objArr2[size + (-1)]) < ov.m42710a(objArr3[0]);
        if (!z2 && z3) {
            fp0.m27260i(objArr3, objArr2, size, 0, size2);
            this.f33542a = size() + size2;
            return;
        }
        if (z2) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i3 = size - 1;
        int i4 = size2 - 1;
        int i5 = i2 - 1;
        while (true) {
            if (i3 < 0 && i4 < 0) {
                break;
            }
            if (i3 < 0) {
                i = i4 - 1;
                obj = objArr3[i4];
            } else if (i4 < 0) {
                i = i4;
                obj = objArr2[i3];
                i3--;
            } else {
                Object obj2 = objArr2[i3];
                Object obj3 = objArr3[i4];
                int iM42710a = ov.m42710a(obj2);
                int iM42710a2 = ov.m42710a(obj3);
                if (iM42710a > iM42710a2) {
                    i3--;
                } else {
                    if (iM42710a >= iM42710a2) {
                        if (obj2 == obj3) {
                            i3--;
                            i4--;
                        } else {
                            int i6 = i3 - 1;
                            while (i6 >= 0) {
                                int i7 = i6 - 1;
                                Object obj4 = objArr2[i6];
                                if (ov.m42710a(obj4) != iM42710a2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    z = true;
                                    break;
                                }
                                i6 = i7;
                            }
                            z = false;
                            if (z) {
                                i4--;
                            }
                        }
                    }
                    i = i4 - 1;
                    obj = obj3;
                }
                i = i4;
                obj = obj2;
            }
            objArr[i5] = obj;
            i4 = i;
            i5--;
        }
        if (i5 >= 0) {
            fp0.m27260i(objArr, objArr, 0, i5 + 1, i2);
        }
        int i8 = i2 - (i5 + 1);
        fp0.m27270s(objArr, null, i8, i2);
        this.f33543b = objArr;
        this.f33542a = i8;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C15050a();
    }

    /* renamed from: j */
    public final int m36853j(Object obj) {
        int size = size() - 1;
        int iM42710a = ov.m42710a(obj);
        Object[] objArr = this.f33543b;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = objArr[i2];
            int iM42710a2 = ov.m42710a(obj2);
            if (iM42710a2 < iM42710a) {
                i = i2 + 1;
            } else {
                if (iM42710a2 <= iM42710a) {
                    return obj2 == obj ? i2 : m36854n(i2, obj, iM42710a);
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: n */
    public final int m36854n(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f33543b;
        int size = size();
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj3 = objArr[i3];
            if (obj3 == obj) {
                return i3;
            }
            if (ov.m42710a(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i >= size) {
                return -(size + 1);
            }
            obj2 = objArr[i];
            if (obj2 == obj) {
                return i;
            }
        } while (ov.m42710a(obj2) == i2);
        return -(i + 1);
    }

    /* renamed from: o */
    public int m36855o() {
        return this.f33542a;
    }

    /* renamed from: p */
    public final Object[] m36856p() {
        return this.f33543b;
    }

    /* renamed from: r */
    public final boolean m36857r() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM36853j = m36853j(obj);
        Object[] objArr = this.f33543b;
        int size = size();
        if (iM36853j < 0) {
            return false;
        }
        int i = size - 1;
        if (iM36853j < i) {
            fp0.m27260i(objArr, objArr, iM36853j, iM36853j + 1, size);
        }
        objArr[i] = null;
        this.f33542a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m36855o();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    public String toString() {
        return kh3.p0(this, null, "[", "]", 0, null, C15051b.f33546a, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
