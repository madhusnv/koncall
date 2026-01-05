package p001o;

/* loaded from: classes6.dex */
public final class c89 extends k7 {

    /* renamed from: a */
    public final a8 f17502a;

    /* renamed from: b */
    public final wff f17503b;

    public c89(a8 a8Var, p79 p79Var) {
        sq8.m48649h(a8Var, "lexer");
        sq8.m48649h(p79Var, "json");
        this.f17502a = a8Var;
        this.f17503b = p79Var.mo43085a();
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: G */
    public byte mo17219G() {
        a8 a8Var = this.f17502a;
        String strM16615q = a8Var.m16615q();
        try {
            return m1i.m38186b(strM16615q);
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'UByte' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }

    @Override // p001o.jo3
    /* renamed from: a */
    public wff mo20419a() {
        return this.f17503b;
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: h */
    public int mo17240h() {
        a8 a8Var = this.f17502a;
        String strM16615q = a8Var.m16615q();
        try {
            return m1i.m38189e(strM16615q);
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'UInt' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }

    @Override // p001o.jo3
    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: l */
    public long mo17243l() {
        a8 a8Var = this.f17502a;
        String strM16615q = a8Var.m16615q();
        try {
            return m1i.m38192h(strM16615q);
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'ULong' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }

    @Override // p001o.k7, p001o.w75
    /* renamed from: s */
    public short mo17250s() {
        a8 a8Var = this.f17502a;
        String strM16615q = a8Var.m16615q();
        try {
            return m1i.m38195k(strM16615q);
        } catch (IllegalArgumentException unused) {
            a8.m16582x(a8Var, "Failed to parse type 'UShort' for input '" + strM16615q + '\'', 0, null, 6, null);
            throw new qe9();
        }
    }
}
