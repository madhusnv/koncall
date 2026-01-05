package p001o;

import p001o.m28;
import p001o.nti;

/* loaded from: classes3.dex */
public final class iti implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public nti mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            jti.m34512b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        nti.C15669a c15669a = new nti.C15669a();
        c15669a.m41150b();
        return c15669a.m41149a();
    }
}
