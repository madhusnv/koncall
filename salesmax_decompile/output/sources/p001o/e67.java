package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class e67 extends o7 {

    /* renamed from: c */
    public final Object f21036c;

    /* renamed from: d */
    public final boolean f21037d;

    /* renamed from: o.e67$a */
    public static final class C13112a extends jk5 implements h67 {

        /* renamed from: c */
        public final Object f21038c;

        /* renamed from: d */
        public final boolean f21039d;

        /* renamed from: e */
        public rag f21040e;

        /* renamed from: f */
        public boolean f21041f;

        public C13112a(qag qagVar, Object obj, boolean z) {
            super(qagVar);
            this.f21038c = obj;
            this.f21039d = z;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f21040e, ragVar)) {
                this.f21040e = ragVar;
                this.f30542a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f21040e.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f21041f) {
                return;
            }
            if (this.f30543b == null) {
                this.f30543b = obj;
                return;
            }
            this.f21041f = true;
            this.f21040e.cancel();
            this.f30542a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f21041f) {
                return;
            }
            this.f21041f = true;
            Object obj = this.f30543b;
            this.f30543b = null;
            if (obj == null) {
                obj = this.f21038c;
            }
            if (obj != null) {
                m33899c(obj);
            } else if (this.f21039d) {
                this.f30542a.onError(new NoSuchElementException());
            } else {
                this.f30542a.onComplete();
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f21041f) {
                fwe.m27599r(th);
            } else {
                this.f21041f = true;
                this.f30542a.onError(th);
            }
        }
    }

    public e67(s47 s47Var, Object obj, boolean z) {
        super(s47Var);
        this.f21036c = obj;
        this.f21037d = z;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C13112a(qagVar, this.f21036c, this.f21037d));
    }
}
