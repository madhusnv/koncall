package p001o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class u57 extends o7 {

    /* renamed from: c */
    public final int f48356c;

    /* renamed from: d */
    public final boolean f48357d;

    /* renamed from: e */
    public final boolean f48358e;

    /* renamed from: f */
    public final jm f48359f;

    /* renamed from: o.u57$a */
    public static final class C17300a extends of1 implements h67 {

        /* renamed from: a */
        public final qag f48360a;

        /* renamed from: b */
        public final qtf f48361b;

        /* renamed from: c */
        public final boolean f48362c;

        /* renamed from: d */
        public final jm f48363d;

        /* renamed from: e */
        public rag f48364e;

        /* renamed from: f */
        public volatile boolean f48365f;

        /* renamed from: g */
        public volatile boolean f48366g;

        /* renamed from: h */
        public Throwable f48367h;

        /* renamed from: q */
        public final AtomicLong f48368q = new AtomicLong();

        /* renamed from: s */
        public boolean f48369s;

        public C17300a(qag qagVar, int i, boolean z, boolean z2, jm jmVar) {
            this.f48360a = qagVar;
            this.f48363d = jmVar;
            this.f48362c = z2;
            this.f48361b = z ? new c1g(i) : new b1g(i);
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f48364e, ragVar)) {
                this.f48364e = ragVar;
                this.f48360a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public boolean m50955c(boolean z, boolean z2, qag qagVar) {
            if (this.f48365f) {
                this.f48361b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f48362c) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f48367h;
                if (th != null) {
                    qagVar.onError(th);
                } else {
                    qagVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f48367h;
            if (th2 != null) {
                this.f48361b.clear();
                qagVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            qagVar.onComplete();
            return true;
        }

        @Override // p001o.rag
        public void cancel() {
            if (this.f48365f) {
                return;
            }
            this.f48365f = true;
            this.f48364e.cancel();
            if (this.f48369s || getAndIncrement() != 0) {
                return;
            }
            this.f48361b.clear();
        }

        @Override // p001o.rtf
        public void clear() {
            this.f48361b.clear();
        }

        /* renamed from: d */
        public void m50956d() {
            if (getAndIncrement() == 0) {
                qtf qtfVar = this.f48361b;
                qag qagVar = this.f48360a;
                int iAddAndGet = 1;
                while (!m50955c(this.f48366g, qtfVar.isEmpty(), qagVar)) {
                    long j = this.f48368q.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f48366g;
                        Object objPoll = qtfVar.poll();
                        boolean z2 = objPoll == null;
                        if (m50955c(z, z2, qagVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        qagVar.mo18166e(objPoll);
                        j2++;
                    }
                    if (j2 == j && m50955c(this.f48366g, qtfVar.isEmpty(), qagVar)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f48368q.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f48361b.offer(obj)) {
                if (this.f48369s) {
                    this.f48360a.mo18166e(null);
                    return;
                } else {
                    m50956d();
                    return;
                }
            }
            this.f48364e.cancel();
            ggb ggbVar = new ggb("Buffer is full");
            try {
                this.f48363d.run();
            } catch (Throwable th) {
                zk6.m59526b(th);
                ggbVar.initCause(th);
            }
            onError(ggbVar);
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f48361b.isEmpty();
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f48366g = true;
            if (this.f48369s) {
                this.f48360a.onComplete();
            } else {
                m50956d();
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f48367h = th;
            this.f48366g = true;
            if (this.f48369s) {
                this.f48360a.onError(th);
            } else {
                m50956d();
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            return this.f48361b.poll();
        }

        @Override // p001o.rag
        public void request(long j) {
            if (this.f48369s || !wag.validate(j)) {
                return;
            }
            ka1.m35216a(this.f48368q, j);
            m50956d();
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f48369s = true;
            return 2;
        }
    }

    public u57(s47 s47Var, int i, boolean z, boolean z2, jm jmVar) {
        super(s47Var);
        this.f48356c = i;
        this.f48357d = z;
        this.f48358e = z2;
        this.f48359f = jmVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C17300a(qagVar, this.f48356c, this.f48357d, this.f48358e, this.f48359f));
    }
}
