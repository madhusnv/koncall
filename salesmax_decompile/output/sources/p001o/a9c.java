package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class a9c extends x6c {

    /* renamed from: a */
    public final c5f f14319a;

    /* renamed from: b */
    public final long f14320b;

    /* renamed from: c */
    public final TimeUnit f14321c;

    /* renamed from: o.a9c$a */
    public static final class RunnableC12116a extends AtomicReference implements su5, Runnable {

        /* renamed from: a */
        public final m9c f14322a;

        public RunnableC12116a(m9c m9cVar) {
            this.f14322a = m9cVar;
        }

        /* renamed from: a */
        public void m16698a(su5 su5Var) {
            zu5.trySet(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == zu5.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.f14322a.mo16560e(0L);
            lazySet(h66.INSTANCE);
            this.f14322a.onComplete();
        }
    }

    public a9c(long j, TimeUnit timeUnit, c5f c5fVar) {
        this.f14320b = j;
        this.f14321c = timeUnit;
        this.f14319a = c5fVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        RunnableC12116a runnableC12116a = new RunnableC12116a(m9cVar);
        m9cVar.mo16559a(runnableC12116a);
        runnableC12116a.m16698a(this.f14319a.mo20303d(runnableC12116a, this.f14320b, this.f14321c));
    }
}
