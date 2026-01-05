package p001o;

import p001o.d81;

/* loaded from: classes3.dex */
public final class lrf implements c01 {

    /* renamed from: a */
    public final String f34320a;

    /* renamed from: b */
    public final d81 f34321b;

    public lrf(d81.C12812b c12812b) {
        sq8.m48649h(c12812b, "config");
        this.f34320a = d01.f18915b.m22175c();
        this.f34321b = new d81(c12812b);
    }

    @Override // p001o.c01
    /* renamed from: a */
    public String mo19992a() {
        return this.f34320a;
    }

    @Override // p001o.c01
    /* renamed from: b */
    public nb8 mo19993b(pb8 pb8Var) {
        sq8.m48649h(pb8Var, "identityProviderConfig");
        return pb8Var.mo19908a(d01.f18915b.m22175c());
    }

    @Override // p001o.c01
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d81 mo19994c() {
        return this.f34321b;
    }

    public lrf(v81 v81Var, String str) {
        sq8.m48649h(v81Var, "awsSigner");
        d81.C12812b c12812b = new d81.C12812b();
        c12812b.m22509o(v81Var);
        c12812b.m22508n(str);
        c12812b.m22507m(w81.SIGV4_ASYMMETRIC);
        this(c12812b);
    }
}
