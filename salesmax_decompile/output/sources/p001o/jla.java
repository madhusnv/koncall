package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class jla implements Iterator, sb9 {
    /* renamed from: a */
    public abstract long mo34006a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(mo34006a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
