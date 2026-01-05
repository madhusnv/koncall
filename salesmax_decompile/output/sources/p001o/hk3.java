package p001o;

import p001o.m28;
import p001o.mk3;

/* loaded from: classes3.dex */
public final class hk3 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public mk3 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            ik3.m32234d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        mk3.C15345a c15345a = new mk3.C15345a();
        if (bArr != null) {
            ik3.m32233c(c15345a, bArr);
        }
        c15345a.m39258b();
        return c15345a.m39257a();
    }
}
