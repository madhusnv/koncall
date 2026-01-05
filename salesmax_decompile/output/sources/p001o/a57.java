package p001o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class a57 extends s47 {

    /* renamed from: b */
    public final y57 f14144b;

    /* renamed from: c */
    public final la1 f14145c;

    /* renamed from: o.a57$a */
    public static /* synthetic */ class C12085a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14146a;

        static {
            int[] iArr = new int[la1.values().length];
            f14146a = iArr;
            try {
                iArr[la1.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14146a[la1.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14146a[la1.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14146a[la1.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.a57$b */
    public static abstract class AbstractC12086b extends AtomicLong implements g57, rag {

        /* renamed from: a */
        public final qag f14147a;

        /* renamed from: b */
        public final ref f14148b = new ref();

        public AbstractC12086b(qag qagVar) {
            this.f14147a = qagVar;
        }

        /* renamed from: c */
        public void m16424c() {
            if (m16426g()) {
                return;
            }
            try {
                this.f14147a.onComplete();
            } finally {
                this.f14148b.dispose();
            }
        }

        @Override // p001o.rag
        public final void cancel() {
            this.f14148b.dispose();
            mo16428i();
        }

        /* renamed from: f */
        public boolean m16425f(Throwable th) {
            if (m16426g()) {
                return false;
            }
            try {
                this.f14147a.onError(th);
                this.f14148b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f14148b.dispose();
                throw th2;
            }
        }

        /* renamed from: g */
        public final boolean m16426g() {
            return this.f14148b.isDisposed();
        }

        /* renamed from: h */
        public void mo16427h() {
        }

        /* renamed from: i */
        public void mo16428i() {
        }

        /* renamed from: j */
        public boolean mo16429j(Throwable th) {
            return m16425f(th);
        }

        @Override // p001o.i56
        public void onComplete() {
            m16424c();
        }

        @Override // p001o.i56
        public final void onError(Throwable th) {
            if (th == null) {
                th = xk6.m56414b("onError called with a null Throwable.");
            }
            if (mo16429j(th)) {
                return;
            }
            fwe.m27599r(th);
        }

        @Override // p001o.rag
        public final void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this, j);
                mo16427h();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: o.a57$c */
    public static final class C12087c extends AbstractC12086b {

        /* renamed from: c */
        public final c1g f14149c;

        /* renamed from: d */
        public Throwable f14150d;

        /* renamed from: e */
        public volatile boolean f14151e;

        /* renamed from: f */
        public final AtomicInteger f14152f;

        public C12087c(qag qagVar, int i) {
            super(qagVar);
            this.f14149c = new c1g(i);
            this.f14152f = new AtomicInteger();
        }

        @Override // p001o.i56
        /* renamed from: e */
        public void mo16430e(Object obj) {
            if (this.f14151e || m16426g()) {
                return;
            }
            if (obj == null) {
                onError(xk6.m56414b("onNext called with a null value."));
            } else {
                this.f14149c.offer(obj);
                m16431k();
            }
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: h */
        public void mo16427h() {
            m16431k();
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: i */
        public void mo16428i() {
            if (this.f14152f.getAndIncrement() == 0) {
                this.f14149c.clear();
            }
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: j */
        public boolean mo16429j(Throwable th) {
            if (this.f14151e || m16426g()) {
                return false;
            }
            this.f14150d = th;
            this.f14151e = true;
            m16431k();
            return true;
        }

        /* renamed from: k */
        public void m16431k() {
            if (this.f14152f.getAndIncrement() != 0) {
                return;
            }
            qag qagVar = this.f14147a;
            c1g c1gVar = this.f14149c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (m16426g()) {
                        c1gVar.clear();
                        return;
                    }
                    boolean z = this.f14151e;
                    Object objPoll = c1gVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f14150d;
                        if (th != null) {
                            m16425f(th);
                            return;
                        } else {
                            m16424c();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    qagVar.mo18166e(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (m16426g()) {
                        c1gVar.clear();
                        return;
                    }
                    boolean z3 = this.f14151e;
                    boolean zIsEmpty = c1gVar.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.f14150d;
                        if (th2 != null) {
                            m16425f(th2);
                            return;
                        } else {
                            m16424c();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    ka1.m35218c(this, j2);
                }
                iAddAndGet = this.f14152f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p001o.a57.AbstractC12086b, p001o.i56
        public void onComplete() {
            this.f14151e = true;
            m16431k();
        }
    }

    /* renamed from: o.a57$d */
    public static final class C12088d extends AbstractC12092h {
        public C12088d(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.a57.AbstractC12092h
        /* renamed from: k */
        public void mo16432k() {
        }
    }

    /* renamed from: o.a57$e */
    public static final class C12089e extends AbstractC12092h {
        public C12089e(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.a57.AbstractC12092h
        /* renamed from: k */
        public void mo16432k() {
            onError(new ggb("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: o.a57$f */
    public static final class C12090f extends AbstractC12086b {

        /* renamed from: c */
        public final AtomicReference f14153c;

        /* renamed from: d */
        public Throwable f14154d;

        /* renamed from: e */
        public volatile boolean f14155e;

        /* renamed from: f */
        public final AtomicInteger f14156f;

        public C12090f(qag qagVar) {
            super(qagVar);
            this.f14153c = new AtomicReference();
            this.f14156f = new AtomicInteger();
        }

        @Override // p001o.i56
        /* renamed from: e */
        public void mo16430e(Object obj) {
            if (this.f14155e || m16426g()) {
                return;
            }
            if (obj == null) {
                onError(xk6.m56414b("onNext called with a null value."));
            } else {
                this.f14153c.set(obj);
                m16433k();
            }
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: h */
        public void mo16427h() {
            m16433k();
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: i */
        public void mo16428i() {
            if (this.f14156f.getAndIncrement() == 0) {
                this.f14153c.lazySet(null);
            }
        }

        @Override // p001o.a57.AbstractC12086b
        /* renamed from: j */
        public boolean mo16429j(Throwable th) {
            if (this.f14155e || m16426g()) {
                return false;
            }
            this.f14154d = th;
            this.f14155e = true;
            m16433k();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            if (m16426g() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        
            r5 = r17.f14155e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            if (r2.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        
            r1 = r17.f14154d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
        
            m16425f(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        
            m16424c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            p001o.ka1.m35218c(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            r4 = r17.f14156f.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m16433k() {
            if (this.f14156f.getAndIncrement() != 0) {
                return;
            }
            qag qagVar = this.f14147a;
            AtomicReference atomicReference = this.f14153c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (m16426g()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z2 = this.f14155e;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z3 = andSet == null;
                    if (z2 && z3) {
                        Throwable th = this.f14154d;
                        if (th != null) {
                            m16425f(th);
                            return;
                        } else {
                            m16424c();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    qagVar.mo18166e(andSet);
                    j2++;
                }
            } while (iAddAndGet != 0);
        }

        @Override // p001o.a57.AbstractC12086b, p001o.i56
        public void onComplete() {
            this.f14155e = true;
            m16433k();
        }
    }

    /* renamed from: o.a57$g */
    public static final class C12091g extends AbstractC12086b {
        public C12091g(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.i56
        /* renamed from: e */
        public void mo16430e(Object obj) {
            long j;
            if (m16426g()) {
                return;
            }
            if (obj == null) {
                onError(xk6.m56414b("onNext called with a null value."));
                return;
            }
            this.f14147a.mo18166e(obj);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* renamed from: o.a57$h */
    public static abstract class AbstractC12092h extends AbstractC12086b {
        public AbstractC12092h(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.i56
        /* renamed from: e */
        public final void mo16430e(Object obj) {
            if (m16426g()) {
                return;
            }
            if (obj == null) {
                onError(xk6.m56414b("onNext called with a null value."));
            } else if (get() == 0) {
                mo16432k();
            } else {
                this.f14147a.mo18166e(obj);
                ka1.m35218c(this, 1L);
            }
        }

        /* renamed from: k */
        public abstract void mo16432k();
    }

    public a57(y57 y57Var, la1 la1Var) {
        this.f14144b = y57Var;
        this.f14145c = la1Var;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        int i = C12085a.f14146a[this.f14145c.ordinal()];
        AbstractC12086b c12087c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C12087c(qagVar, s47.m47676l()) : new C12090f(qagVar) : new C12088d(qagVar) : new C12089e(qagVar) : new C12091g(qagVar);
        qagVar.mo18165b(c12087c);
        try {
            this.f14144b.mo20510a(c12087c);
        } catch (Throwable th) {
            zk6.m59526b(th);
            c12087c.onError(th);
        }
    }
}
