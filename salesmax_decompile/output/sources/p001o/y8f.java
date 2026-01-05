package p001o;

import p001o.d9f;
import p001o.m28;

/* loaded from: classes3.dex */
public final class y8f implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d9f mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            z8f.m58943d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        d9f.C12845a c12845a = new d9f.C12845a();
        if (bArr != null) {
            z8f.m58942c(c12845a, bArr);
        }
        c12845a.m22628b();
        return c12845a.m22627a();
    }
}
