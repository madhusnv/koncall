package p001o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class s4i extends AbstractList implements zi9, RandomAccess {

    /* renamed from: a */
    public final zi9 f44814a;

    /* renamed from: o.s4i$a */
    public class C16743a implements ListIterator {

        /* renamed from: a */
        public ListIterator f44815a;

        /* renamed from: b */
        public final /* synthetic */ int f44816b;

        public C16743a(int i) {
            this.f44816b = i;
            this.f44815a = s4i.this.f44814a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f44815a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f44815a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f44815a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f44815a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f44815a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f44815a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.s4i$b */
    public class C16744b implements Iterator {

        /* renamed from: a */
        public Iterator f44818a;

        public C16744b() {
            this.f44818a = s4i.this.f44814a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f44818a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44818a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public s4i(zi9 zi9Var) {
        this.f44814a = zi9Var;
    }

    @Override // p001o.zi9
    public void P1(yq1 yq1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.f44814a.get(i);
    }

    @Override // p001o.zi9
    /* renamed from: g */
    public List mo47844g() {
        return this.f44814a.mo47844g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C16744b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new C16743a(i);
    }

    @Override // p001o.zi9
    /* renamed from: s */
    public zi9 mo47845s() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f44814a.size();
    }

    @Override // p001o.zi9
    /* renamed from: u */
    public Object mo47846u(int i) {
        return this.f44814a.mo47846u(i);
    }
}
