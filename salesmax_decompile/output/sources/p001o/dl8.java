package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class dl8 implements Iterator, sb9 {
    /* renamed from: a */
    public abstract int mo23412a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo23412a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
