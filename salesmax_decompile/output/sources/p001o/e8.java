package p001o;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class e8 extends b7 implements List {

    /* renamed from: a */
    public static final C13122a f21141a = new C13122a(null);

    /* renamed from: o.e8$a */
    public static final class C13122a {
        public C13122a() {
        }

        public /* synthetic */ C13122a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m24503a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        /* renamed from: b */
        public final void m24504b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void m24505c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void m24506d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        /* renamed from: e */
        public final int m24507e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        /* renamed from: f */
        public final boolean m24508f(Collection collection, Collection collection2) {
            sq8.m48649h(collection, "c");
            sq8.m48649h(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!sq8.m48644c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final int m24509g(Collection collection) {
            sq8.m48649h(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* renamed from: o.e8$b */
    public class C13123b implements Iterator, sb9 {

        /* renamed from: a */
        public int f21142a;

        public C13123b() {
        }

        /* renamed from: a */
        public final int m24510a() {
            return this.f21142a;
        }

        /* renamed from: e */
        public final void m24511e(int i) {
            this.f21142a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21142a < e8.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            e8 e8Var = e8.this;
            int i = this.f21142a;
            this.f21142a = i + 1;
            return e8Var.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.e8$c */
    public class C13124c extends C13123b implements ListIterator {
        public C13124c(int i) {
            super();
            e8.f21141a.m24505c(i, e8.this.size());
            m24511e(i);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m24510a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m24510a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            e8 e8Var = e8.this;
            m24511e(m24510a() - 1);
            return e8Var.get(m24510a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m24510a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.e8$d */
    public static final class C13125d extends e8 implements RandomAccess {

        /* renamed from: b */
        public final e8 f21145b;

        /* renamed from: c */
        public final int f21146c;

        /* renamed from: d */
        public int f21147d;

        public C13125d(e8 e8Var, int i, int i2) {
            sq8.m48649h(e8Var, "list");
            this.f21145b = e8Var;
            this.f21146c = i;
            e8.f21141a.m24506d(i, i2, e8Var.size());
            this.f21147d = i2 - i;
        }

        @Override // p001o.b7
        /* renamed from: d */
        public int mo18169d() {
            return this.f21147d;
        }

        @Override // p001o.e8, java.util.List
        public Object get(int i) {
            e8.f21141a.m24504b(i, this.f21147d);
            return this.f21145b.get(this.f21146c + i);
        }
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f21141a.m24508f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f21141a.m24509g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (sq8.m48644c(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C13123b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (sq8.m48644c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C13124c(0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C13125d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new C13124c(i);
    }
}
