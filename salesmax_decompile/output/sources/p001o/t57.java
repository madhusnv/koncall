package p001o;

import java.util.concurrent.atomic.AtomicLong;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class t57 extends o7 {

    /* renamed from: c */
    public final c5f f46449c;

    /* renamed from: d */
    public final boolean f46450d;

    /* renamed from: e */
    public final int f46451e;

    /* renamed from: o.t57$a */
    public static abstract class AbstractRunnableC17001a extends of1 implements h67, Runnable {

        /* renamed from: H */
        public boolean f46452H;

        /* renamed from: a */
        public final c5f.AbstractC12571c f46453a;

        /* renamed from: b */
        public final boolean f46454b;

        /* renamed from: c */
        public final int f46455c;

        /* renamed from: d */
        public final int f46456d;

        /* renamed from: e */
        public final AtomicLong f46457e = new AtomicLong();

        /* renamed from: f */
        public rag f46458f;

        /* renamed from: g */
        public rtf f46459g;

        /* renamed from: h */
        public volatile boolean f46460h;

        /* renamed from: q */
        public volatile boolean f46461q;

        /* renamed from: s */
        public Throwable f46462s;

        /* renamed from: x */
        public int f46463x;

        /* renamed from: y */
        public long f46464y;

        public AbstractRunnableC17001a(c5f.AbstractC12571c abstractC12571c, boolean z, int i) {
            this.f46453a = abstractC12571c;
            this.f46454b = z;
            this.f46455c = i;
            this.f46456d = i - (i >> 2);
        }

        /* renamed from: c */
        public final boolean m49412c(boolean z, boolean z2, qag qagVar) {
            if (this.f46460h) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f46454b) {
                if (!z2) {
                    return false;
                }
                this.f46460h = true;
                Throwable th = this.f46462s;
                if (th != null) {
                    qagVar.onError(th);
                } else {
                    qagVar.onComplete();
                }
                this.f46453a.dispose();
                return true;
            }
            Throwable th2 = this.f46462s;
            if (th2 != null) {
                this.f46460h = true;
                clear();
                qagVar.onError(th2);
                this.f46453a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f46460h = true;
            qagVar.onComplete();
            this.f46453a.dispose();
            return true;
        }

        @Override // p001o.rag
        public final void cancel() {
            if (this.f46460h) {
                return;
            }
            this.f46460h = true;
            this.f46458f.cancel();
            this.f46453a.dispose();
            if (this.f46452H || getAndIncrement() != 0) {
                return;
            }
            this.f46459g.clear();
        }

        @Override // p001o.rtf
        public final void clear() {
            this.f46459g.clear();
        }

        /* renamed from: d */
        public abstract void mo49413d();

        @Override // p001o.qag
        /* renamed from: e */
        public final void mo18166e(Object obj) {
            if (this.f46461q) {
                return;
            }
            if (this.f46463x == 2) {
                m49416i();
                return;
            }
            if (!this.f46459g.offer(obj)) {
                this.f46458f.cancel();
                this.f46462s = new ggb("Queue is full?!");
                this.f46461q = true;
            }
            m49416i();
        }

        /* renamed from: g */
        public abstract void mo49414g();

        /* renamed from: h */
        public abstract void mo49415h();

        /* renamed from: i */
        public final void m49416i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f46453a.mo20307b(this);
        }

        @Override // p001o.rtf
        public final boolean isEmpty() {
            return this.f46459g.isEmpty();
        }

        @Override // p001o.qag
        public final void onComplete() {
            if (this.f46461q) {
                return;
            }
            this.f46461q = true;
            m49416i();
        }

        @Override // p001o.qag
        public final void onError(Throwable th) {
            if (this.f46461q) {
                fwe.m27599r(th);
                return;
            }
            this.f46462s = th;
            this.f46461q = true;
            m49416i();
        }

        @Override // p001o.rag
        public final void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this.f46457e, j);
                m49416i();
            }
        }

        @Override // p001o.f5e
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f46452H = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f46452H) {
                mo49414g();
            } else if (this.f46463x == 1) {
                mo49415h();
            } else {
                mo49413d();
            }
        }
    }

    /* renamed from: o.t57$b */
    public static final class C17002b extends AbstractRunnableC17001a {

        /* renamed from: L */
        public final kq3 f46465L;

        /* renamed from: M */
        public long f46466M;

        public C17002b(kq3 kq3Var, c5f.AbstractC12571c abstractC12571c, boolean z, int i) {
            super(abstractC12571c, z, i);
            this.f46465L = kq3Var;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f46458f, ragVar)) {
                this.f46458f = ragVar;
                if (ragVar instanceof g5e) {
                    g5e g5eVar = (g5e) ragVar;
                    int iRequestFusion = g5eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f46463x = 1;
                        this.f46459g = g5eVar;
                        this.f46461q = true;
                        this.f46465L.mo18165b(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f46463x = 2;
                        this.f46459g = g5eVar;
                        this.f46465L.mo18165b(this);
                        ragVar.request(this.f46455c);
                        return;
                    }
                }
                this.f46459g = new b1g(this.f46455c);
                this.f46465L.mo18165b(this);
                ragVar.request(this.f46455c);
            }
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: d */
        public void mo49413d() {
            kq3 kq3Var = this.f46465L;
            rtf rtfVar = this.f46459g;
            long j = this.f46464y;
            long j2 = this.f46466M;
            int iAddAndGet = 1;
            do {
                long j3 = this.f46457e.get();
                while (j != j3) {
                    boolean z = this.f46461q;
                    try {
                        Object objPoll = rtfVar.poll();
                        boolean z2 = objPoll == null;
                        if (m49412c(z, z2, kq3Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (kq3Var.mo20248f(objPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f46456d) {
                            this.f46458f.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f46460h = true;
                        this.f46458f.cancel();
                        rtfVar.clear();
                        kq3Var.onError(th);
                        this.f46453a.dispose();
                        return;
                    }
                }
                if (j == j3 && m49412c(this.f46461q, rtfVar.isEmpty(), kq3Var)) {
                    return;
                }
                this.f46464y = j;
                this.f46466M = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: g */
        public void mo49414g() {
            int iAddAndGet = 1;
            while (!this.f46460h) {
                boolean z = this.f46461q;
                this.f46465L.mo18166e(null);
                if (z) {
                    this.f46460h = true;
                    Throwable th = this.f46462s;
                    if (th != null) {
                        this.f46465L.onError(th);
                    } else {
                        this.f46465L.onComplete();
                    }
                    this.f46453a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: h */
        public void mo49415h() {
            kq3 kq3Var = this.f46465L;
            rtf rtfVar = this.f46459g;
            long j = this.f46464y;
            int iAddAndGet = 1;
            do {
                long j2 = this.f46457e.get();
                while (j != j2) {
                    try {
                        Object objPoll = rtfVar.poll();
                        if (this.f46460h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f46460h = true;
                            kq3Var.onComplete();
                            this.f46453a.dispose();
                            return;
                        } else if (kq3Var.mo20248f(objPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f46460h = true;
                        this.f46458f.cancel();
                        kq3Var.onError(th);
                        this.f46453a.dispose();
                        return;
                    }
                }
                if (this.f46460h) {
                    return;
                }
                if (rtfVar.isEmpty()) {
                    this.f46460h = true;
                    kq3Var.onComplete();
                    this.f46453a.dispose();
                    return;
                }
                this.f46464y = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f46459g.poll();
            if (objPoll != null && this.f46463x != 1) {
                long j = this.f46466M + 1;
                if (j == this.f46456d) {
                    this.f46466M = 0L;
                    this.f46458f.request(j);
                } else {
                    this.f46466M = j;
                }
            }
            return objPoll;
        }
    }

    /* renamed from: o.t57$c */
    public static final class C17003c extends AbstractRunnableC17001a {

        /* renamed from: L */
        public final qag f46467L;

        public C17003c(qag qagVar, c5f.AbstractC12571c abstractC12571c, boolean z, int i) {
            super(abstractC12571c, z, i);
            this.f46467L = qagVar;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f46458f, ragVar)) {
                this.f46458f = ragVar;
                if (ragVar instanceof g5e) {
                    g5e g5eVar = (g5e) ragVar;
                    int iRequestFusion = g5eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f46463x = 1;
                        this.f46459g = g5eVar;
                        this.f46461q = true;
                        this.f46467L.mo18165b(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f46463x = 2;
                        this.f46459g = g5eVar;
                        this.f46467L.mo18165b(this);
                        ragVar.request(this.f46455c);
                        return;
                    }
                }
                this.f46459g = new b1g(this.f46455c);
                this.f46467L.mo18165b(this);
                ragVar.request(this.f46455c);
            }
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: d */
        public void mo49413d() {
            qag qagVar = this.f46467L;
            rtf rtfVar = this.f46459g;
            long j = this.f46464y;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f46457e.get();
                while (j != jAddAndGet) {
                    boolean z = this.f46461q;
                    try {
                        Object objPoll = rtfVar.poll();
                        boolean z2 = objPoll == null;
                        if (m49412c(z, z2, qagVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        qagVar.mo18166e(objPoll);
                        j++;
                        if (j == this.f46456d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f46457e.addAndGet(-j);
                            }
                            this.f46458f.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f46460h = true;
                        this.f46458f.cancel();
                        rtfVar.clear();
                        qagVar.onError(th);
                        this.f46453a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && m49412c(this.f46461q, rtfVar.isEmpty(), qagVar)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f46464y = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: g */
        public void mo49414g() {
            int iAddAndGet = 1;
            while (!this.f46460h) {
                boolean z = this.f46461q;
                this.f46467L.mo18166e(null);
                if (z) {
                    this.f46460h = true;
                    Throwable th = this.f46462s;
                    if (th != null) {
                        this.f46467L.onError(th);
                    } else {
                        this.f46467L.onComplete();
                    }
                    this.f46453a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p001o.t57.AbstractRunnableC17001a
        /* renamed from: h */
        public void mo49415h() {
            qag qagVar = this.f46467L;
            rtf rtfVar = this.f46459g;
            long j = this.f46464y;
            int iAddAndGet = 1;
            do {
                long j2 = this.f46457e.get();
                while (j != j2) {
                    try {
                        Object objPoll = rtfVar.poll();
                        if (this.f46460h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f46460h = true;
                            qagVar.onComplete();
                            this.f46453a.dispose();
                            return;
                        }
                        qagVar.mo18166e(objPoll);
                        j++;
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f46460h = true;
                        this.f46458f.cancel();
                        qagVar.onError(th);
                        this.f46453a.dispose();
                        return;
                    }
                }
                if (this.f46460h) {
                    return;
                }
                if (rtfVar.isEmpty()) {
                    this.f46460h = true;
                    qagVar.onComplete();
                    this.f46453a.dispose();
                    return;
                }
                this.f46464y = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f46459g.poll();
            if (objPoll != null && this.f46463x != 1) {
                long j = this.f46464y + 1;
                if (j == this.f46456d) {
                    this.f46464y = 0L;
                    this.f46458f.request(j);
                } else {
                    this.f46464y = j;
                }
            }
            return objPoll;
        }
    }

    public t57(s47 s47Var, c5f c5fVar, boolean z, int i) {
        super(s47Var);
        this.f46449c = c5fVar;
        this.f46450d = z;
        this.f46451e = i;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        c5f.AbstractC12571c abstractC12571cMo20301b = this.f46449c.mo20301b();
        if (qagVar instanceof kq3) {
            this.f37840b.b0(new C17002b((kq3) qagVar, abstractC12571cMo20301b, this.f46450d, this.f46451e));
        } else {
            this.f37840b.b0(new C17003c(qagVar, abstractC12571cMo20301b, this.f46450d, this.f46451e));
        }
    }
}
