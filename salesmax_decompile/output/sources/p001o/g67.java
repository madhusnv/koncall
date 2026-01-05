package p001o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class g67 extends o7 {

    /* renamed from: c */
    public final c5f f24631c;

    /* renamed from: d */
    public final boolean f24632d;

    /* renamed from: o.g67$a */
    public static final class RunnableC13628a extends AtomicReference implements h67, rag, Runnable {

        /* renamed from: a */
        public final qag f24633a;

        /* renamed from: b */
        public final c5f.AbstractC12571c f24634b;

        /* renamed from: c */
        public final AtomicReference f24635c = new AtomicReference();

        /* renamed from: d */
        public final AtomicLong f24636d = new AtomicLong();

        /* renamed from: e */
        public final boolean f24637e;

        /* renamed from: f */
        public g3e f24638f;

        /* renamed from: o.g67$a$a */
        public static final class a implements Runnable {

            /* renamed from: a */
            public final rag f24639a;

            /* renamed from: b */
            public final long f24640b;

            public a(rag ragVar, long j) {
                this.f24639a = ragVar;
                this.f24640b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24639a.request(this.f24640b);
            }
        }

        public RunnableC13628a(qag qagVar, c5f.AbstractC12571c abstractC12571c, g3e g3eVar, boolean z) {
            this.f24633a = qagVar;
            this.f24634b = abstractC12571c;
            this.f24638f = g3eVar;
            this.f24637e = !z;
        }

        /* renamed from: a */
        public void m28091a(long j, rag ragVar) {
            if (this.f24637e || Thread.currentThread() == get()) {
                ragVar.request(j);
            } else {
                this.f24634b.mo20307b(new a(ragVar, j));
            }
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.setOnce(this.f24635c, ragVar)) {
                long andSet = this.f24636d.getAndSet(0L);
                if (andSet != 0) {
                    m28091a(andSet, ragVar);
                }
            }
        }

        @Override // p001o.rag
        public void cancel() {
            wag.cancel(this.f24635c);
            this.f24634b.dispose();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f24633a.mo18166e(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f24633a.onComplete();
            this.f24634b.dispose();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f24633a.onError(th);
            this.f24634b.dispose();
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                rag ragVar = (rag) this.f24635c.get();
                if (ragVar != null) {
                    m28091a(j, ragVar);
                    return;
                }
                ka1.m35216a(this.f24636d, j);
                rag ragVar2 = (rag) this.f24635c.get();
                if (ragVar2 != null) {
                    long andSet = this.f24636d.getAndSet(0L);
                    if (andSet != 0) {
                        m28091a(andSet, ragVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            g3e g3eVar = this.f24638f;
            this.f24638f = null;
            g3eVar.mo28025a(this);
        }
    }

    public g67(s47 s47Var, c5f c5fVar, boolean z) {
        super(s47Var);
        this.f24631c = c5fVar;
        this.f24632d = z;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        c5f.AbstractC12571c abstractC12571cMo20301b = this.f24631c.mo20301b();
        RunnableC13628a runnableC13628a = new RunnableC13628a(qagVar, abstractC12571cMo20301b, this.f37840b, this.f24632d);
        qagVar.mo18165b(runnableC13628a);
        abstractC12571cMo20301b.mo20307b(runnableC13628a);
    }
}
