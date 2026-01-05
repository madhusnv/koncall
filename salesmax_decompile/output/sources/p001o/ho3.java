package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class ho3 extends vn3 {

    /* renamed from: c */
    public final p79 f27240c;

    /* renamed from: d */
    public int f27241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3(up8 up8Var, p79 p79Var) {
        super(up8Var);
        sq8.m48649h(up8Var, "writer");
        sq8.m48649h(p79Var, "json");
        this.f27240c = p79Var;
    }

    @Override // p001o.vn3
    /* renamed from: b */
    public void mo30873b() {
        m53033o(true);
        this.f27241d++;
    }

    @Override // p001o.vn3
    /* renamed from: c */
    public void mo30874c() {
        m53033o(false);
        m53030k("\n");
        int i = this.f27241d;
        for (int i2 = 0; i2 < i; i2++) {
            m53030k(this.f27240c.m43087d().m51136m());
        }
    }

    @Override // p001o.vn3
    /* renamed from: d */
    public void mo30875d() {
        if (m53026a()) {
            m53033o(false);
        } else {
            mo30874c();
        }
    }

    @Override // p001o.vn3
    /* renamed from: p */
    public void mo30876p() {
        m53027f(TokenParser.SP);
    }

    @Override // p001o.vn3
    /* renamed from: q */
    public void mo30877q() {
        this.f27241d--;
    }
}
