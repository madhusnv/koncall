package mg;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.j */
/* loaded from: classes.dex */
public final class C4731j extends e0 implements ListIterator {

    /* renamed from: a */
    public final int f23651a;

    /* renamed from: b */
    public int f23652b;

    /* renamed from: c */
    public final AbstractC4735n f23653c;

    public C4731j(AbstractC4735n abstractC4735n, int i10) {
        int size = abstractC4735n.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC4723b.m9612n(i10, size, "index"));
        }
        this.f23651a = size;
        this.f23652b = i10;
        this.f23653c = abstractC4735n;
    }

    /* renamed from: a */
    public final Object m9619a(int i10) {
        return this.f23653c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23652b < this.f23651a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23652b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23652b;
        this.f23652b = i10 + 1;
        return m9619a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23652b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23652b - 1;
        this.f23652b = i10;
        return m9619a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23652b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
