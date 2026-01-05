package p001o;

import java.util.Collection;

/* loaded from: classes6.dex */
public final class j67 extends o7 {

    /* renamed from: c */
    public final idg f29854c;

    /* renamed from: o.j67$a */
    public static final class C14458a extends jk5 implements h67, rag {

        /* renamed from: c */
        public rag f29855c;

        public C14458a(qag qagVar, Collection collection) {
            super(qagVar);
            this.f30543b = collection;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f29855c, ragVar)) {
                this.f29855c = ragVar;
                this.f30542a.mo18165b(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f29855c.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            Collection collection = (Collection) this.f30543b;
            if (collection != null) {
                collection.add(obj);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            m33899c(this.f30543b);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f30543b = null;
            this.f30542a.onError(th);
        }
    }

    public j67(s47 s47Var, idg idgVar) {
        super(s47Var);
        this.f29854c = idgVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        try {
            this.f37840b.b0(new C14458a(qagVar, (Collection) xk6.m56415c(this.f29854c.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            zk6.m59526b(th);
            u66.error(th, qagVar);
        }
    }
}
