package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class t47 extends o7 {

    /* renamed from: c */
    public final idg f46349c;

    /* renamed from: d */
    public final eh1 f46350d;

    /* renamed from: o.t47$a */
    public static final class C16989a extends jk5 implements h67 {

        /* renamed from: c */
        public final eh1 f46351c;

        /* renamed from: d */
        public final Object f46352d;

        /* renamed from: e */
        public rag f46353e;

        /* renamed from: f */
        public boolean f46354f;

        public C16989a(qag qagVar, Object obj, eh1 eh1Var) {
            super(qagVar);
            this.f46351c = eh1Var;
            this.f46352d = obj;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f46353e, ragVar)) {
                this.f46353e = ragVar;
                this.f30542a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f46353e.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f46354f) {
                return;
            }
            try {
                this.f46351c.accept(this.f46352d, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f46353e.cancel();
                onError(th);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f46354f) {
                return;
            }
            this.f46354f = true;
            m33899c(this.f46352d);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f46354f) {
                fwe.m27599r(th);
            } else {
                this.f46354f = true;
                this.f30542a.onError(th);
            }
        }
    }

    public t47(s47 s47Var, idg idgVar, eh1 eh1Var) {
        super(s47Var);
        this.f46349c = idgVar;
        this.f46350d = eh1Var;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        try {
            Object obj = this.f46349c.get();
            Objects.requireNonNull(obj, "The initial value supplied is null");
            this.f37840b.b0(new C16989a(qagVar, obj, this.f46350d));
        } catch (Throwable th) {
            zk6.m59526b(th);
            u66.error(th, qagVar);
        }
    }
}
