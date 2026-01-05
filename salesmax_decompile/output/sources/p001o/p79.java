package p001o;

/* loaded from: classes6.dex */
public abstract class p79 implements i8g {

    /* renamed from: d */
    public static final C16009a f39513d = new C16009a(null);

    /* renamed from: a */
    public final u79 f39514a;

    /* renamed from: b */
    public final wff f39515b;

    /* renamed from: c */
    public final zm5 f39516c;

    /* renamed from: o.p79$a */
    public static final class C16009a extends p79 {
        public /* synthetic */ C16009a(id5 id5Var) {
            this();
        }

        public C16009a() {
            super(new u79(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, 65535, null), xff.m56225a(), null);
        }
    }

    public /* synthetic */ p79(u79 u79Var, wff wffVar, id5 id5Var) {
        this(u79Var, wffVar);
    }

    @Override // p001o.zef
    /* renamed from: a */
    public wff mo43085a() {
        return this.f39515b;
    }

    @Override // p001o.i8g
    /* renamed from: b */
    public final String mo31740b(iff iffVar, Object obj) {
        sq8.m48649h(iffVar, "serializer");
        wa9 wa9Var = new wa9();
        try {
            ua9.m51307a(this, wa9Var, iffVar, obj);
            return wa9Var.toString();
        } finally {
            wa9Var.m54135h();
        }
    }

    /* renamed from: c */
    public final Object m43086c(bn5 bn5Var, String str) {
        sq8.m48649h(bn5Var, "deserializer");
        sq8.m48649h(str, "string");
        j8g j8gVar = new j8g(str);
        Object objMo17216C = new p7g(this, zcj.OBJ, j8gVar, bn5Var.getDescriptor(), null).mo17216C(bn5Var);
        j8gVar.m16620v();
        return objMo17216C;
    }

    /* renamed from: d */
    public final u79 m43087d() {
        return this.f39514a;
    }

    /* renamed from: e */
    public final zm5 m43088e() {
        return this.f39516c;
    }

    public p79(u79 u79Var, wff wffVar) {
        this.f39514a = u79Var;
        this.f39515b = wffVar;
        this.f39516c = new zm5();
    }
}
