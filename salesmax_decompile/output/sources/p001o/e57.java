package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class e57 extends o7 {

    /* renamed from: c */
    public final long f20979c;

    /* renamed from: d */
    public final Object f20980d;

    /* renamed from: e */
    public final boolean f20981e;

    /* renamed from: o.e57$a */
    public static final class C13101a extends jk5 implements h67 {

        /* renamed from: c */
        public final long f20982c;

        /* renamed from: d */
        public final Object f20983d;

        /* renamed from: e */
        public final boolean f20984e;

        /* renamed from: f */
        public rag f20985f;

        /* renamed from: g */
        public long f20986g;

        /* renamed from: h */
        public boolean f20987h;

        public C13101a(qag qagVar, long j, Object obj, boolean z) {
            super(qagVar);
            this.f20982c = j;
            this.f20983d = obj;
            this.f20984e = z;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f20985f, ragVar)) {
                this.f20985f = ragVar;
                this.f30542a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f20985f.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f20987h) {
                return;
            }
            long j = this.f20986g;
            if (j != this.f20982c) {
                this.f20986g = j + 1;
                return;
            }
            this.f20987h = true;
            this.f20985f.cancel();
            m33899c(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f20987h) {
                return;
            }
            this.f20987h = true;
            Object obj = this.f20983d;
            if (obj != null) {
                m33899c(obj);
            } else if (this.f20984e) {
                this.f30542a.onError(new NoSuchElementException());
            } else {
                this.f30542a.onComplete();
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f20987h) {
                fwe.m27599r(th);
            } else {
                this.f20987h = true;
                this.f30542a.onError(th);
            }
        }
    }

    public e57(s47 s47Var, long j, Object obj, boolean z) {
        super(s47Var);
        this.f20979c = j;
        this.f20980d = obj;
        this.f20981e = z;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C13101a(qagVar, this.f20979c, this.f20980d, this.f20981e));
    }
}
