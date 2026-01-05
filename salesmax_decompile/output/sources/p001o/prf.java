package p001o;

import p001o.c01;
import p001o.d81;

/* loaded from: classes3.dex */
public final class prf implements c01 {

    /* renamed from: a */
    public final String f40450a;

    /* renamed from: b */
    public final q48 f40451b;

    public prf(q48 q48Var) {
        sq8.m48649h(q48Var, "httpSigner");
        this.f40450a = qrf.m45814a(d01.f18915b);
        this.f40451b = new pxe(q48Var);
    }

    @Override // p001o.c01
    /* renamed from: a */
    public String mo19992a() {
        return this.f40450a;
    }

    @Override // p001o.c01
    /* renamed from: b */
    public nb8 mo19993b(pb8 pb8Var) {
        return c01.C12521a.m19995a(this, pb8Var);
    }

    @Override // p001o.c01
    /* renamed from: c */
    public q48 mo19994c() {
        return this.f40451b;
    }

    public prf(v81 v81Var, String str) {
        sq8.m48649h(v81Var, "awsSigner");
        d81.C12812b c12812b = new d81.C12812b();
        c12812b.m22509o(v81Var);
        c12812b.m22508n(str);
        c12812b.m22507m(w81.SIGV4);
        this(new d81(c12812b));
    }
}
