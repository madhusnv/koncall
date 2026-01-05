package p001o;

/* loaded from: classes3.dex */
public final class lca implements rej {

    /* renamed from: a */
    public final ydj f33616a;

    /* renamed from: b */
    public final oo0 f33617b;

    /* renamed from: c */
    public xej f33618c;

    public lca(ydj ydjVar) {
        sq8.m48649h(ydjVar, "source");
        this.f33616a = ydjVar;
        this.f33617b = new oo0();
    }

    @Override // p001o.rej
    /* renamed from: a */
    public xej mo36943a() {
        return this.f33618c;
    }

    @Override // p001o.rej
    public xej nextToken() {
        xej xejVarM57664c = (xej) this.f33617b.m42475O();
        if (xejVarM57664c == null) {
            xejVarM57664c = this.f33616a.m57664c();
        }
        this.f33618c = xejVarM57664c;
        return xejVarM57664c;
    }

    @Override // p001o.rej
    /* renamed from: o */
    public xej mo36944o(int i) {
        while (i > this.f33617b.size() && !this.f33616a.m57662a()) {
            oo0 oo0Var = this.f33617b;
            xej xejVarM57664c = this.f33616a.m57664c();
            sq8.m48646e(xejVarM57664c);
            oo0Var.m42481o(xejVarM57664c);
        }
        return (xej) mca.m38741b(this.f33617b, i - 1);
    }
}
