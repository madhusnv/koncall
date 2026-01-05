package p001o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class v57 extends o7 implements gu3 {

    /* renamed from: c */
    public final gu3 f49894c;

    /* renamed from: o.v57$a */
    public static final class C17511a extends AtomicLong implements h67, rag {

        /* renamed from: a */
        public final qag f49895a;

        /* renamed from: b */
        public final gu3 f49896b;

        /* renamed from: c */
        public rag f49897c;

        /* renamed from: d */
        public boolean f49898d;

        public C17511a(qag qagVar, gu3 gu3Var) {
            this.f49895a = qagVar;
            this.f49896b = gu3Var;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f49897c, ragVar)) {
                this.f49897c = ragVar;
                this.f49895a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.rag
        public void cancel() {
            this.f49897c.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f49898d) {
                return;
            }
            if (get() != 0) {
                this.f49895a.mo18166e(obj);
                ka1.m35218c(this, 1L);
                return;
            }
            try {
                this.f49896b.accept(obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                cancel();
                onError(th);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f49898d) {
                return;
            }
            this.f49898d = true;
            this.f49895a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f49898d) {
                fwe.m27599r(th);
            } else {
                this.f49898d = true;
                this.f49895a.onError(th);
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this, j);
            }
        }
    }

    public v57(s47 s47Var) {
        super(s47Var);
        this.f49894c = this;
    }

    @Override // p001o.gu3
    public void accept(Object obj) {
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C17511a(qagVar, this.f49894c));
    }
}
