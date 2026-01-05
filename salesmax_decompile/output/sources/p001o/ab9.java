package p001o;

/* loaded from: classes6.dex */
public final class ab9 extends c8 {

    /* renamed from: f */
    public final q79 f14442f;

    /* renamed from: g */
    public final int f14443g;

    /* renamed from: h */
    public int f14444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab9(p79 p79Var, q79 q79Var) {
        super(p79Var, q79Var, null);
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(q79Var, "value");
        this.f14442f = q79Var;
        this.f14443g = s0().size();
        this.f14444h = -1;
    }

    @Override // p001o.mrb
    public String a0(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return String.valueOf(i);
    }

    @Override // p001o.c8
    public k89 e0(String str) {
        sq8.m48649h(str, "tag");
        return s0().get(Integer.parseInt(str));
    }

    @Override // p001o.jo3
    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        int i = this.f14444h;
        if (i >= this.f14443g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f14444h = i2;
        return i2;
    }

    @Override // p001o.c8
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public q79 s0() {
        return this.f14442f;
    }
}
