package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class y8c extends a9 {

    /* renamed from: b */
    public final c5f f55069b;

    /* renamed from: o.y8c$a */
    public static final class C18354a extends AtomicReference implements m9c, su5 {

        /* renamed from: a */
        public final m9c f55070a;

        /* renamed from: b */
        public final AtomicReference f55071b = new AtomicReference();

        public C18354a(m9c m9cVar) {
            this.f55070a = m9cVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            zu5.setOnce(this.f55071b, su5Var);
        }

        /* renamed from: b */
        public void m57369b(su5 su5Var) {
            zu5.setOnce(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this.f55071b);
            zu5.dispose(this);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f55070a.mo16560e(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f55070a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f55070a.onError(th);
        }
    }

    /* renamed from: o.y8c$b */
    public final class RunnableC18355b implements Runnable {

        /* renamed from: a */
        public final C18354a f55072a;

        public RunnableC18355b(C18354a c18354a) {
            this.f55072a = c18354a;
        }

        @Override // java.lang.Runnable
        public void run() {
            y8c.this.f14302a.mo55724b(this.f55072a);
        }
    }

    public y8c(x8c x8cVar, c5f c5fVar) {
        super(x8cVar);
        this.f55069b = c5fVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C18354a c18354a = new C18354a(m9cVar);
        m9cVar.mo16559a(c18354a);
        c18354a.m57369b(this.f55069b.mo20302c(new RunnableC18355b(c18354a)));
    }
}
