package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class d69 implements Iterator, sb9 {

    /* renamed from: a */
    public final Iterator f19147a;

    /* renamed from: b */
    public final xk7 f19148b;

    public d69(Iterator it, xk7 xk7Var) {
        sq8.m48649h(it, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        this.f19147a = it;
        this.f19148b = xk7Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19147a.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f19148b.invoke(this.f19147a.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
