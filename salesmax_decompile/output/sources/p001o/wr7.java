package p001o;

import p001o.bs7;
import p001o.m28;

/* loaded from: classes3.dex */
public final class wr7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bs7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            xr7.m56696d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        bs7.C12484a c12484a = new bs7.C12484a();
        if (bArr != null) {
            xr7.m56695c(c12484a, bArr);
        }
        c12484a.m19683b();
        return c12484a.m19682a();
    }
}
