package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class fh2 implements Iterator, sb9 {
    /* renamed from: a */
    public abstract char mo26686a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo26686a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
