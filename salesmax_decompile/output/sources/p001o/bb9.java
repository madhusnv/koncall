package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class bb9 extends za9 {

    /* renamed from: k */
    public final z99 f15865k;

    /* renamed from: l */
    public final List f15866l;

    /* renamed from: m */
    public final int f15867m;

    /* renamed from: n */
    public int f15868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb9(p79 p79Var, z99 z99Var) {
        super(p79Var, z99Var, null, null, 12, null);
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(z99Var, "value");
        this.f15865k = z99Var;
        List listQ0 = kh3.Q0(s0().keySet());
        this.f15866l = listQ0;
        this.f15867m = listQ0.size() * 2;
        this.f15868n = -1;
    }

    @Override // p001o.za9, p001o.mrb
    public String a0(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return (String) this.f15866l.get(i / 2);
    }

    @Override // p001o.za9, p001o.c8, p001o.jo3
    /* renamed from: c */
    public void mo18548c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
    }

    @Override // p001o.za9, p001o.c8
    public k89 e0(String str) {
        sq8.m48649h(str, "tag");
        return this.f15868n % 2 == 0 ? l89.m36736a(str) : (k89) isa.m32682i(s0(), str);
    }

    @Override // p001o.za9, p001o.jo3
    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        int i = this.f15868n;
        if (i >= this.f15867m - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f15868n = i2;
        return i2;
    }

    @Override // p001o.za9, p001o.c8
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public z99 s0() {
        return this.f15865k;
    }
}
