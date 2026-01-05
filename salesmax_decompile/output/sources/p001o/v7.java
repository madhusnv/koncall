package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class v7 extends t4i {

    /* renamed from: a */
    public final int f49943a;

    /* renamed from: b */
    public int f49944b;

    public v7(int i, int i2) {
        dgd.m23065r(i2, i);
        this.f49943a = i;
        this.f49944b = i2;
    }

    /* renamed from: a */
    public abstract Object mo40521a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f49944b < this.f49943a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f49944b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f49944b;
        this.f49944b = i + 1;
        return mo40521a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49944b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f49944b - 1;
        this.f49944b = i;
        return mo40521a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49944b - 1;
    }
}
