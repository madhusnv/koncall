package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class s8c extends a9 {

    /* renamed from: b */
    public final long f44968b;

    /* renamed from: c */
    public final TimeUnit f44969c;

    /* renamed from: d */
    public final c5f f44970d;

    /* renamed from: e */
    public final boolean f44971e;

    /* renamed from: o.s8c$a */
    public static final class C16780a extends AbstractRunnableC16782c {

        /* renamed from: g */
        public final AtomicInteger f44972g;

        public C16780a(m9c m9cVar, long j, TimeUnit timeUnit, c5f c5fVar) {
            super(m9cVar, j, timeUnit, c5fVar);
            this.f44972g = new AtomicInteger(1);
        }

        @Override // p001o.s8c.AbstractRunnableC16782c
        /* renamed from: d */
        public void mo47991d() {
            m47993f();
            if (this.f44972g.decrementAndGet() == 0) {
                this.f44973a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44972g.incrementAndGet() == 2) {
                m47993f();
                if (this.f44972g.decrementAndGet() == 0) {
                    this.f44973a.onComplete();
                }
            }
        }
    }

    /* renamed from: o.s8c$b */
    public static final class C16781b extends AbstractRunnableC16782c {
        public C16781b(m9c m9cVar, long j, TimeUnit timeUnit, c5f c5fVar) {
            super(m9cVar, j, timeUnit, c5fVar);
        }

        @Override // p001o.s8c.AbstractRunnableC16782c
        /* renamed from: d */
        public void mo47991d() {
            this.f44973a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m47993f();
        }
    }

    /* renamed from: o.s8c$c */
    public static abstract class AbstractRunnableC16782c extends AtomicReference implements m9c, su5, Runnable {

        /* renamed from: a */
        public final m9c f44973a;

        /* renamed from: b */
        public final long f44974b;

        /* renamed from: c */
        public final TimeUnit f44975c;

        /* renamed from: d */
        public final c5f f44976d;

        /* renamed from: e */
        public final AtomicReference f44977e = new AtomicReference();

        /* renamed from: f */
        public su5 f44978f;

        public AbstractRunnableC16782c(m9c m9cVar, long j, TimeUnit timeUnit, c5f c5fVar) {
            this.f44973a = m9cVar;
            this.f44974b = j;
            this.f44975c = timeUnit;
            this.f44976d = c5fVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f44978f, su5Var)) {
                this.f44978f = su5Var;
                this.f44973a.mo16559a(this);
                c5f c5fVar = this.f44976d;
                long j = this.f44974b;
                zu5.replace(this.f44977e, c5fVar.mo20304e(this, j, j, this.f44975c));
            }
        }

        /* renamed from: b */
        public void m47992b() {
            zu5.dispose(this.f44977e);
        }

        /* renamed from: d */
        public abstract void mo47991d();

        @Override // p001o.su5
        public void dispose() {
            m47992b();
            this.f44978f.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            lazySet(obj);
        }

        /* renamed from: f */
        public void m47993f() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f44973a.mo16560e(andSet);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f44978f.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            m47992b();
            mo47991d();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            m47992b();
            this.f44973a.onError(th);
        }
    }

    public s8c(x8c x8cVar, long j, TimeUnit timeUnit, c5f c5fVar, boolean z) {
        super(x8cVar);
        this.f44968b = j;
        this.f44969c = timeUnit;
        this.f44970d = c5fVar;
        this.f44971e = z;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        qff qffVar = new qff(m9cVar);
        if (this.f44971e) {
            this.f14302a.mo55724b(new C16780a(qffVar, this.f44968b, this.f44969c, this.f44970d));
        } else {
            this.f14302a.mo55724b(new C16781b(qffVar, this.f44968b, this.f44969c, this.f44970d));
        }
    }
}
