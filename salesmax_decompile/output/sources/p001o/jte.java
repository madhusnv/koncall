package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
public class jte extends e8 {

    /* renamed from: b */
    public final List f31077b;

    /* renamed from: o.jte$a */
    public static final class C14657a implements ListIterator, sb9 {

        /* renamed from: a */
        public final ListIterator f31078a;

        public C14657a(int i) {
            this.f31078a = jte.this.f31077b.listIterator(ih3.m32131S(jte.this, i));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f31078a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31078a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f31078a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return ih3.m32130R(jte.this, this.f31078a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f31078a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return ih3.m32130R(jte.this, this.f31078a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public jte(List list) {
        sq8.m48649h(list, "delegate");
        this.f31077b = list;
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f31077b.size();
    }

    @Override // p001o.e8, java.util.List
    public Object get(int i) {
        return this.f31077b.get(ih3.m32129Q(this, i));
    }

    @Override // p001o.e8, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p001o.e8, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p001o.e8, java.util.List
    public ListIterator listIterator(int i) {
        return new C14657a(i);
    }
}
