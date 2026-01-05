package p001o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class w57 extends o7 {

    /* renamed from: o.w57$a */
    public static final class C17782a extends AtomicLong implements h67, rag {

        /* renamed from: a */
        public final qag f51499a;

        /* renamed from: b */
        public rag f51500b;

        /* renamed from: c */
        public boolean f51501c;

        public C17782a(qag qagVar) {
            this.f51499a = qagVar;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f51500b, ragVar)) {
                this.f51500b = ragVar;
                this.f51499a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.rag
        public void cancel() {
            this.f51500b.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f51501c) {
                return;
            }
            if (get() == 0) {
                onError(new ggb("could not emit value due to lack of requests"));
            } else {
                this.f51499a.mo18166e(obj);
                ka1.m35218c(this, 1L);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f51501c) {
                return;
            }
            this.f51501c = true;
            this.f51499a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f51501c) {
                fwe.m27599r(th);
            } else {
                this.f51501c = true;
                this.f51499a.onError(th);
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this, j);
            }
        }
    }

    public w57(s47 s47Var) {
        super(s47Var);
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C17782a(qagVar));
    }
}
