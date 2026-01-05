package p001o;

import p001o.cp7;
import p001o.m28;

/* loaded from: classes3.dex */
public final class xo7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cp7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            yo7.m58052d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        cp7.C12719a c12719a = new cp7.C12719a();
        if (bArr != null) {
            yo7.m58051c(c12719a, bArr);
        }
        c12719a.m21568b();
        return c12719a.m21567a();
    }
}
