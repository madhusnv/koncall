package p001o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public class r4i extends AbstractList implements yi9, RandomAccess {

    /* renamed from: a */
    public final yi9 f42995a;

    /* renamed from: o.r4i$a */
    public class C16536a implements ListIterator {

        /* renamed from: a */
        public ListIterator f42996a;

        /* renamed from: b */
        public final /* synthetic */ int f42997b;

        public C16536a(int i) {
            this.f42997b = i;
            this.f42996a = r4i.this.f42995a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f42996a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f42996a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f42996a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f42996a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f42996a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f42996a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.r4i$b */
    public class C16537b implements Iterator {

        /* renamed from: a */
        public Iterator f42999a;

        public C16537b() {
            this.f42999a = r4i.this.f42995a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f42999a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f42999a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r4i(yi9 yi9Var) {
        this.f42995a = yi9Var;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.f42995a.get(i);
    }

    @Override // p001o.yi9
    /* renamed from: g */
    public List mo46221g() {
        return this.f42995a.mo46221g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C16537b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new C16536a(i);
    }

    @Override // p001o.yi9
    /* renamed from: s */
    public yi9 mo46222s() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f42995a.size();
    }

    @Override // p001o.yi9
    /* renamed from: u */
    public Object mo46223u(int i) {
        return this.f42995a.mo46223u(i);
    }

    @Override // p001o.yi9
    public void z0(xq1 xq1Var) {
        throw new UnsupportedOperationException();
    }
}
