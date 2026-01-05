package p001o;

import p001o.gti;
import p001o.m28;

/* loaded from: classes3.dex */
public final class bti implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gti mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            cti.m21805d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        gti.C13822a c13822a = new gti.C13822a();
        if (bArr != null) {
            cti.m21804c(c13822a, bArr);
        }
        c13822a.m29485b();
        return c13822a.m29484a();
    }
}
