package p001o;

/* loaded from: classes2.dex */
public final class qzh {

    /* renamed from: a */
    public final ihg f42653a = tgg.m49847a();

    /* renamed from: b */
    public final vma f42654b = new vma(16);

    /* renamed from: o.qzh$a */
    public static final class C16496a extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ pzh f42656b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16496a(pzh pzhVar) {
            super(1);
            this.f42656b = pzhVar;
        }

        /* renamed from: a */
        public final void m46008a(rzh rzhVar) {
            sq8.m48649h(rzhVar, "finalResult");
            ihg ihgVarM46006b = qzh.this.m46006b();
            qzh qzhVar = qzh.this;
            pzh pzhVar = this.f42656b;
            synchronized (ihgVarM46006b) {
                if (rzhVar.mo47364c()) {
                    qzhVar.f42654b.m52969e(pzhVar, rzhVar);
                } else {
                    qzhVar.f42654b.m52970f(pzhVar);
                }
                y3i y3iVar = y3i.f54824a;
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m46008a((rzh) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public final ihg m46006b() {
        return this.f42653a;
    }

    /* renamed from: c */
    public final p4g m46007c(pzh pzhVar, xk7 xk7Var) {
        sq8.m48649h(pzhVar, "typefaceRequest");
        sq8.m48649h(xk7Var, "resolveTypeface");
        synchronized (this.f42653a) {
            rzh rzhVar = (rzh) this.f42654b.m52968d(pzhVar);
            if (rzhVar != null) {
                if (rzhVar.mo47364c()) {
                    return rzhVar;
                }
            }
            try {
                rzh rzhVar2 = (rzh) xk7Var.invoke(new C16496a(pzhVar));
                synchronized (this.f42653a) {
                    if (this.f42654b.m52968d(pzhVar) == null && rzhVar2.mo47364c()) {
                        this.f42654b.m52969e(pzhVar, rzhVar2);
                    }
                    y3i y3iVar = y3i.f54824a;
                }
                return rzhVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
