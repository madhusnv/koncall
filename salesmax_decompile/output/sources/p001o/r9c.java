package p001o;

/* loaded from: classes2.dex */
public final class r9c implements vgc {

    /* renamed from: b */
    public static final C16562b f43246b = new C16562b(null);

    /* renamed from: c */
    public static final xk7 f43247c = C16561a.f43249a;

    /* renamed from: a */
    public final p9c f43248a;

    /* renamed from: o.r9c$a */
    public static final class C16561a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16561a f43249a = new C16561a();

        public C16561a() {
            super(1);
        }

        /* renamed from: a */
        public final void m46380a(r9c r9cVar) {
            sq8.m48649h(r9cVar, "it");
            if (r9cVar.mo40261s()) {
                r9cVar.m46379b().mo4913j();
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m46380a((r9c) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.r9c$b */
    public static final class C16562b {
        public C16562b() {
        }

        public /* synthetic */ C16562b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xk7 m46381a() {
            return r9c.f43247c;
        }
    }

    public r9c(p9c p9cVar) {
        sq8.m48649h(p9cVar, "observerNode");
        this.f43248a = p9cVar;
    }

    /* renamed from: b */
    public final p9c m46379b() {
        return this.f43248a;
    }

    @Override // p001o.vgc
    /* renamed from: s */
    public boolean mo40261s() {
        return this.f43248a.mo17377h().m17361J();
    }
}
