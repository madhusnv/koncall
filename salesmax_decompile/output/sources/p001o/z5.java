package p001o;

import p001o.f6;
import p001o.m28;

/* loaded from: classes3.dex */
public final class z5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f6 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            a6.m16510b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        f6.C13343a c13343a = new f6.C13343a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c13343a.m26197d(str != null ? ame.f14997a.m17462a(str) : null);
        c13343a.m26195b();
        return c13343a.m26194a();
    }
}
