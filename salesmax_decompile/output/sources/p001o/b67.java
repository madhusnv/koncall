package p001o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class b67 extends o7 {

    /* renamed from: c */
    public final long f15587c;

    /* renamed from: o.b67$a */
    public static final class C12285a extends AtomicInteger implements h67 {

        /* renamed from: a */
        public final qag f15588a;

        /* renamed from: b */
        public final sag f15589b;

        /* renamed from: c */
        public final g3e f15590c;

        /* renamed from: d */
        public long f15591d;

        /* renamed from: e */
        public long f15592e;

        public C12285a(qag qagVar, long j, sag sagVar, g3e g3eVar) {
            this.f15588a = qagVar;
            this.f15589b = sagVar;
            this.f15590c = g3eVar;
            this.f15591d = j;
        }

        /* renamed from: a */
        public void m18193a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f15589b.m48097d()) {
                    long j = this.f15592e;
                    if (j != 0) {
                        this.f15592e = 0L;
                        this.f15589b.m48099h(j);
                    }
                    this.f15590c.mo28025a(this);
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
            this.f15589b.m48100i(ragVar);
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f15592e++;
            this.f15588a.mo18166e(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            long j = this.f15591d;
            if (j != Long.MAX_VALUE) {
                this.f15591d = j - 1;
            }
            if (j != 0) {
                m18193a();
            } else {
                this.f15588a.onComplete();
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f15588a.onError(th);
        }
    }

    public b67(s47 s47Var, long j) {
        super(s47Var);
        this.f15587c = j;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        sag sagVar = new sag(false);
        qagVar.mo18165b(sagVar);
        long j = this.f15587c;
        new C12285a(qagVar, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sagVar, this.f37840b).m18193a();
    }
}
