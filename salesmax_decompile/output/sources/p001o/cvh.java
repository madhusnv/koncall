package p001o;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class cvh extends bvh implements ListIterator {
    public cvh(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ListIterator m21885b() {
        return (ListIterator) this.f16877a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m21885b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m21885b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo19878a(m21885b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m21885b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
