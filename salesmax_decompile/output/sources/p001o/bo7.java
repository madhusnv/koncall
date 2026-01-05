package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class bo7 implements ief {

    /* renamed from: a */
    public final uk7 f16619a;

    /* renamed from: b */
    public final xk7 f16620b;

    /* renamed from: o.bo7$a */
    public static final class C12464a implements Iterator, sb9 {

        /* renamed from: a */
        public Object f16621a;

        /* renamed from: b */
        public int f16622b = -2;

        public C12464a() {
        }

        /* renamed from: a */
        public final void m19495a() {
            Object objInvoke;
            if (this.f16622b == -2) {
                objInvoke = bo7.this.f16619a.invoke();
            } else {
                xk7 xk7Var = bo7.this.f16620b;
                Object obj = this.f16621a;
                sq8.m48646e(obj);
                objInvoke = xk7Var.invoke(obj);
            }
            this.f16621a = objInvoke;
            this.f16622b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16622b < 0) {
                m19495a();
            }
            return this.f16622b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f16622b < 0) {
                m19495a();
            }
            if (this.f16622b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f16621a;
            sq8.m48647f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f16622b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bo7(uk7 uk7Var, xk7 xk7Var) {
        sq8.m48649h(uk7Var, "getInitialValue");
        sq8.m48649h(xk7Var, "getNextValue");
        this.f16619a = uk7Var;
        this.f16620b = xk7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C12464a();
    }
}
