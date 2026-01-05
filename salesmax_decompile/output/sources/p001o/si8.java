package p001o;

import p001o.m28;
import p001o.xi8;

/* loaded from: classes3.dex */
public final class si8 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xi8 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            ti8.m49908d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        xi8.C18164a c18164a = new xi8.C18164a();
        if (bArr != null) {
            ti8.m49907c(c18164a, bArr);
        }
        c18164a.m56340b();
        return c18164a.m56339a();
    }
}
