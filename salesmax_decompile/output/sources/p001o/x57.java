package p001o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class x57 extends o7 {

    /* renamed from: o.x57$a */
    public static final class C18055a extends AtomicInteger implements h67, rag {

        /* renamed from: a */
        public final qag f53217a;

        /* renamed from: b */
        public rag f53218b;

        /* renamed from: c */
        public volatile boolean f53219c;

        /* renamed from: d */
        public Throwable f53220d;

        /* renamed from: e */
        public volatile boolean f53221e;

        /* renamed from: f */
        public final AtomicLong f53222f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference f53223g = new AtomicReference();

        public C18055a(qag qagVar) {
            this.f53217a = qagVar;
        }

        /* renamed from: a */
        public boolean m55643a(boolean z, boolean z2, qag qagVar, AtomicReference atomicReference) {
            if (this.f53221e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f53220d;
            if (th != null) {
                atomicReference.lazySet(null);
                qagVar.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            qagVar.onComplete();
            return true;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f53218b, ragVar)) {
                this.f53218b = ragVar;
                this.f53217a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f53219c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (m55643a(r9, r10, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            p001o.ka1.m35218c(r1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r4 = addAndGet(-r4);
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m55644c() {
            if (getAndIncrement() != 0) {
                return;
            }
            qag qagVar = this.f53217a;
            AtomicLong atomicLong = this.f53222f;
            AtomicReference atomicReference = this.f53223g;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    boolean z = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z2 = this.f53219c;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z3 = andSet == null;
                    if (m55643a(z2, z3, qagVar, atomicReference)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    qagVar.mo18166e(andSet);
                    j++;
                }
            } while (iAddAndGet != 0);
        }

        @Override // p001o.rag
        public void cancel() {
            if (this.f53221e) {
                return;
            }
            this.f53221e = true;
            this.f53218b.cancel();
            if (getAndIncrement() == 0) {
                this.f53223g.lazySet(null);
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f53223g.lazySet(obj);
            m55644c();
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f53219c = true;
            m55644c();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f53220d = th;
            this.f53219c = true;
            m55644c();
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this.f53222f, j);
                m55644c();
            }
        }
    }

    public x57(s47 s47Var) {
        super(s47Var);
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C18055a(qagVar));
    }
}
