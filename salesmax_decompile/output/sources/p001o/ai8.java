package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ai8 implements Iterator, sb9 {

    /* renamed from: a */
    public final Iterator f14799a;

    /* renamed from: b */
    public int f14800b;

    public ai8(Iterator it) {
        sq8.m48649h(it, "iterator");
        this.f14799a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yh8 next() {
        int i = this.f14800b;
        this.f14800b = i + 1;
        if (i < 0) {
            ch3.m21256u();
        }
        return new yh8(i, this.f14799a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14799a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
