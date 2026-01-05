package p001o;

import p001o.lb7;

/* loaded from: classes2.dex */
public final class mb7 implements lb7.InterfaceC15049a {

    /* renamed from: a */
    public final h9d f35095a;

    /* renamed from: b */
    public final s9d f35096b;

    /* renamed from: c */
    public final qzh f35097c;

    /* renamed from: d */
    public final pb7 f35098d;

    /* renamed from: e */
    public final g9d f35099e;

    /* renamed from: f */
    public final xk7 f35100f;

    /* renamed from: o.mb7$a */
    public static final class C15268a extends kf9 implements xk7 {
        public C15268a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pzh pzhVar) {
            sq8.m48649h(pzhVar, "it");
            return mb7.this.m38674f(pzh.m44568b(pzhVar, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* renamed from: o.mb7$b */
    public static final class C15269b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ pzh f35103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15269b(pzh pzhVar) {
            super(1);
            this.f35103b = pzhVar;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rzh invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "onAsyncCompletion");
            rzh rzhVarM43300a = mb7.this.f35098d.m43300a(this.f35103b, mb7.this.m38673e(), xk7Var, mb7.this.f35100f);
            if (rzhVarM43300a == null && (rzhVarM43300a = mb7.this.f35099e.m28213a(this.f35103b, mb7.this.m38673e(), xk7Var, mb7.this.f35100f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return rzhVarM43300a;
        }
    }

    public mb7(h9d h9dVar, s9d s9dVar, qzh qzhVar, pb7 pb7Var, g9d g9dVar) {
        sq8.m48649h(h9dVar, "platformFontLoader");
        sq8.m48649h(s9dVar, "platformResolveInterceptor");
        sq8.m48649h(qzhVar, "typefaceRequestCache");
        sq8.m48649h(pb7Var, "fontListFontFamilyTypefaceAdapter");
        sq8.m48649h(g9dVar, "platformFamilyTypefaceAdapter");
        this.f35095a = h9dVar;
        this.f35096b = s9dVar;
        this.f35097c = qzhVar;
        this.f35098d = pb7Var;
        this.f35099e = g9dVar;
        this.f35100f = new C15268a();
    }

    /* renamed from: e */
    public final h9d m38673e() {
        return this.f35095a;
    }

    /* renamed from: f */
    public final p4g m38674f(pzh pzhVar) {
        return this.f35097c.m46007c(pzhVar, new C15269b(pzhVar));
    }

    public /* synthetic */ mb7(h9d h9dVar, s9d s9dVar, qzh qzhVar, pb7 pb7Var, g9d g9dVar, int i, id5 id5Var) {
        this(h9dVar, (i & 2) != 0 ? s9d.f45040a.m48064a() : s9dVar, (i & 4) != 0 ? nb7.m40284b() : qzhVar, (i & 8) != 0 ? new pb7(nb7.m40283a(), null, 2, null) : pb7Var, (i & 16) != 0 ? new g9d() : g9dVar);
    }
}
