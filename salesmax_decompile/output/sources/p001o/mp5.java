package p001o;

import p001o.m28;
import p001o.rp5;

/* loaded from: classes3.dex */
public final class mp5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rp5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            np5.m40900d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        rp5.C16646a c16646a = new rp5.C16646a();
        if (bArr != null) {
            np5.m40899c(c16646a, bArr);
        }
        c16646a.m47049b();
        return c16646a.m47048a();
    }
}
