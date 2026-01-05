package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class evh implements ief {

    /* renamed from: a */
    public final ief f22228a;

    /* renamed from: b */
    public final xk7 f22229b;

    /* renamed from: o.evh$a */
    public static final class C13265a implements Iterator, sb9 {

        /* renamed from: a */
        public final Iterator f22230a;

        public C13265a() {
            this.f22230a = evh.this.f22228a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22230a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return evh.this.f22229b.invoke(this.f22230a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public evh(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "sequence");
        sq8.m48649h(xk7Var, "transformer");
        this.f22228a = iefVar;
        this.f22229b = xk7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C13265a();
    }
}
