package p001o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class i6d implements Iterator, sb9 {

    /* renamed from: a */
    public Object f28161a;

    /* renamed from: b */
    public final Map f28162b;

    /* renamed from: c */
    public int f28163c;

    public i6d(Object obj, Map map) {
        sq8.m48649h(map, "map");
        this.f28161a = obj;
        this.f28162b = map;
    }

    /* renamed from: a */
    public final void m31617a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28163c < this.f28162b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        m31617a();
        Object obj = this.f28161a;
        this.f28163c++;
        Object obj2 = this.f28162b.get(obj);
        if (obj2 != null) {
            this.f28161a = ((cea) obj2).m21068c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
