package p001o;

import p001o.ffa;
import p001o.m28;

/* loaded from: classes3.dex */
public final class afa implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ffa mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            bfa.m18837d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        ffa.C13416a c13416a = new ffa.C13416a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c13416a.m26581z(str != null ? ame.f14997a.m17462a(str) : null);
        if (bArr != null) {
            bfa.m18836c(c13416a, bArr);
        }
        c13416a.m26557b();
        return c13416a.m26556a();
    }
}
