package p001o;

import p001o.i4g;
import p001o.m28;

/* loaded from: classes3.dex */
public final class d4g implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i4g mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            e4g.m24305d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        i4g.C14183a c14183a = new i4g.C14183a();
        if (bArr != null) {
            e4g.m24304c(c14183a, bArr);
        }
        c14183a.m31565b();
        return c14183a.m31564a();
    }
}
