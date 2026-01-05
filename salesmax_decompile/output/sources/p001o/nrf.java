package p001o;

import p001o.c01;
import p001o.d81;

/* loaded from: classes3.dex */
public final class nrf implements c01 {

    /* renamed from: a */
    public final String f37212a;

    /* renamed from: b */
    public final d81 f37213b;

    public nrf(d81.C12812b c12812b) {
        sq8.m48649h(c12812b, "config");
        this.f37212a = d01.f18915b.m22174b();
        this.f37213b = new d81(c12812b);
    }

    @Override // p001o.c01
    /* renamed from: a */
    public String mo19992a() {
        return this.f37212a;
    }

    @Override // p001o.c01
    /* renamed from: b */
    public nb8 mo19993b(pb8 pb8Var) {
        return c01.C12521a.m19995a(this, pb8Var);
    }

    @Override // p001o.c01
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d81 mo19994c() {
        return this.f37213b;
    }

    public nrf(v81 v81Var, String str) {
        sq8.m48649h(v81Var, "awsSigner");
        d81.C12812b c12812b = new d81.C12812b();
        c12812b.m22509o(v81Var);
        c12812b.m22508n(str);
        this(c12812b);
    }
}
