package p001o;

/* loaded from: classes6.dex */
public final class fa9 extends c8 {

    /* renamed from: f */
    public final k89 f23037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa9(p79 p79Var, k89 k89Var) {
        super(p79Var, k89Var, null);
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(k89Var, "value");
        this.f23037f = k89Var;
        m17236X("primitive");
    }

    @Override // p001o.c8
    public k89 e0(String str) {
        sq8.m48649h(str, "tag");
        if (str == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // p001o.jo3
    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return 0;
    }

    @Override // p001o.c8
    public k89 s0() {
        return this.f23037f;
    }
}
