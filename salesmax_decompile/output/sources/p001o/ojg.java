package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class ojg implements ief {

    /* renamed from: a */
    public final ief f38451a;

    /* renamed from: b */
    public final xk7 f38452b;

    /* renamed from: o.ojg$a */
    public static final class C15821a implements Iterator, sb9 {

        /* renamed from: a */
        public final Iterator f38453a;

        /* renamed from: b */
        public int f38454b = -1;

        /* renamed from: c */
        public Object f38455c;

        public C15821a() {
            this.f38453a = ojg.this.f38451a.iterator();
        }

        /* renamed from: a */
        public final void m42298a() {
            if (this.f38453a.hasNext()) {
                Object next = this.f38453a.next();
                if (((Boolean) ojg.this.f38452b.invoke(next)).booleanValue()) {
                    this.f38454b = 1;
                    this.f38455c = next;
                    return;
                }
            }
            this.f38454b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38454b == -1) {
                m42298a();
            }
            return this.f38454b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f38454b == -1) {
                m42298a();
            }
            if (this.f38454b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f38455c;
            this.f38455c = null;
            this.f38454b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ojg(ief iefVar, xk7 xk7Var) {
        sq8.m48649h(iefVar, "sequence");
        sq8.m48649h(xk7Var, "predicate");
        this.f38451a = iefVar;
        this.f38452b = xk7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C15821a();
    }
}
