package p001o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b5g extends a5g implements Iterator, sb9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5g(uxf uxfVar, Iterator it) {
        super(uxfVar, it);
        sq8.m48649h(uxfVar, "map");
        sq8.m48649h(it, "iterator");
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryM16445k = m16445k();
        if (entryM16445k == null) {
            throw new IllegalStateException();
        }
        m16442f();
        return entryM16445k.getKey();
    }
}
