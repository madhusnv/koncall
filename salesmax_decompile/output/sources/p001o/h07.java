package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class h07 implements ief {

    /* renamed from: a */
    public final ief f26041a;

    /* renamed from: b */
    public final boolean f26042b;

    /* renamed from: c */
    public final xk7 f26043c;

    /* renamed from: o.h07$a */
    public static final class C13837a implements Iterator, sb9 {

        /* renamed from: a */
        public final Iterator f26044a;

        /* renamed from: b */
        public int f26045b = -1;

        /* renamed from: c */
        public Object f26046c;

        public C13837a() {
            this.f26044a = h07.this.f26041a.iterator();
        }

        /* renamed from: a */
        public final void m29720a() {
            while (this.f26044a.hasNext()) {
                Object next = this.f26044a.next();
                if (((Boolean) h07.this.f26043c.invoke(next)).booleanValue() == h07.this.f26042b) {
                    this.f26046c = next;
                    this.f26045b = 1;
                    return;
                }
            }
            this.f26045b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26045b == -1) {
                m29720a();
            }
            return this.f26045b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f26045b == -1) {
                m29720a();
            }
            if (this.f26045b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f26046c;
            this.f26046c = null;
            this.f26045b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h07(ief iefVar, boolean z, xk7 xk7Var) {
        sq8.m48649h(iefVar, "sequence");
        sq8.m48649h(xk7Var, "predicate");
        this.f26041a = iefVar;
        this.f26042b = z;
        this.f26043c = xk7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C13837a();
    }
}
