package p001o;

import p001o.c4g;
import p001o.m28;

/* loaded from: classes3.dex */
public final class x3g implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c4g mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            y3g.m57190d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        c4g.C12549a c12549a = new c4g.C12549a();
        if (bArr != null) {
            y3g.m57189c(c12549a, bArr);
        }
        c12549a.m20199b();
        return c12549a.m20198a();
    }
}
