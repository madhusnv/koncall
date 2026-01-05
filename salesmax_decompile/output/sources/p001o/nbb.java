package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class nbb implements ief {

    /* renamed from: a */
    public final ief f36648a;

    /* renamed from: b */
    public final ief f36649b;

    /* renamed from: c */
    public final nl7 f36650c;

    /* renamed from: o.nbb$a */
    public static final class C15535a implements Iterator, sb9 {

        /* renamed from: a */
        public final Iterator f36651a;

        /* renamed from: b */
        public final Iterator f36652b;

        public C15535a() {
            this.f36651a = nbb.this.f36648a.iterator();
            this.f36652b = nbb.this.f36649b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36651a.hasNext() && this.f36652b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return nbb.this.f36650c.invoke(this.f36651a.next(), this.f36652b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nbb(ief iefVar, ief iefVar2, nl7 nl7Var) {
        sq8.m48649h(iefVar, "sequence1");
        sq8.m48649h(iefVar2, "sequence2");
        sq8.m48649h(nl7Var, "transform");
        this.f36648a = iefVar;
        this.f36649b = iefVar2;
        this.f36650c = nl7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C15535a();
    }
}
