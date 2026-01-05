package p001o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class c67 extends o7 {

    /* renamed from: c */
    public final ggd f17398c;

    /* renamed from: d */
    public final long f17399d;

    /* renamed from: o.c67$a */
    public static final class C12579a extends AtomicInteger implements h67 {

        /* renamed from: a */
        public final qag f17400a;

        /* renamed from: b */
        public final sag f17401b;

        /* renamed from: c */
        public final g3e f17402c;

        /* renamed from: d */
        public final ggd f17403d;

        /* renamed from: e */
        public long f17404e;

        /* renamed from: f */
        public long f17405f;

        public C12579a(qag qagVar, long j, ggd ggdVar, sag sagVar, g3e g3eVar) {
            this.f17400a = qagVar;
            this.f17401b = sagVar;
            this.f17402c = g3eVar;
            this.f17403d = ggdVar;
            this.f17404e = j;
        }

        /* renamed from: a */
        public void m20341a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f17401b.m48097d()) {
                    long j = this.f17405f;
                    if (j != 0) {
                        this.f17405f = 0L;
                        this.f17401b.m48099h(j);
                    }
                    this.f17402c.mo28025a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            this.f17401b.m48100i(ragVar);
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f17405f++;
            this.f17400a.mo18166e(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f17400a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            long j = this.f17404e;
            if (j != Long.MAX_VALUE) {
                this.f17404e = j - 1;
            }
            if (j == 0) {
                this.f17400a.onError(th);
                return;
            }
            try {
                if (this.f17403d.test(th)) {
                    m20341a();
                } else {
                    this.f17400a.onError(th);
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f17400a.onError(new mo3(th, th2));
            }
        }
    }

    public c67(s47 s47Var, long j, ggd ggdVar) {
        super(s47Var);
        this.f17398c = ggdVar;
        this.f17399d = j;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        sag sagVar = new sag(false);
        qagVar.mo18165b(sagVar);
        new C12579a(qagVar, this.f17399d, this.f17398c, sagVar, this.f37840b).m20341a();
    }
}
