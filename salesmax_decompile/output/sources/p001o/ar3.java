package p001o;

import p001o.fr3;
import p001o.m28;

/* loaded from: classes3.dex */
public final class ar3 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public fr3 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            br3.m19624d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        fr3.C13534a c13534a = new fr3.C13534a();
        if (bArr != null) {
            br3.m19623c(c13534a, bArr);
        }
        c13534a.m27376b();
        return c13534a.m27375a();
    }
}
