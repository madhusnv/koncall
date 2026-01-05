package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class f8c extends x6c {

    /* renamed from: a */
    public final c5f f22947a;

    /* renamed from: b */
    public final long f22948b;

    /* renamed from: c */
    public final long f22949c;

    /* renamed from: d */
    public final TimeUnit f22950d;

    /* renamed from: o.f8c$a */
    public static final class RunnableC13364a extends AtomicReference implements su5, Runnable {

        /* renamed from: a */
        public final m9c f22951a;

        /* renamed from: b */
        public long f22952b;

        public RunnableC13364a(m9c m9cVar) {
            this.f22951a = m9cVar;
        }

        /* renamed from: a */
        public void m26282a(su5 su5Var) {
            zu5.setOnce(this, su5Var);
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
            if (get() != zu5.DISPOSED) {
                m9c m9cVar = this.f22951a;
                long j = this.f22952b;
                this.f22952b = 1 + j;
                m9cVar.mo16560e(Long.valueOf(j));
            }
        }
    }

    public f8c(long j, long j2, TimeUnit timeUnit, c5f c5fVar) {
        this.f22948b = j;
        this.f22949c = j2;
        this.f22950d = timeUnit;
        this.f22947a = c5fVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        RunnableC13364a runnableC13364a = new RunnableC13364a(m9cVar);
        m9cVar.mo16559a(runnableC13364a);
        c5f c5fVar = this.f22947a;
        if (!(c5fVar instanceof fuh)) {
            runnableC13364a.m26282a(c5fVar.mo20304e(runnableC13364a, this.f22948b, this.f22949c, this.f22950d));
            return;
        }
        c5f.AbstractC12571c abstractC12571cMo20301b = c5fVar.mo20301b();
        runnableC13364a.m26282a(abstractC12571cMo20301b);
        abstractC12571cMo20301b.m20309e(runnableC13364a, this.f22948b, this.f22949c, this.f22950d);
    }
}
