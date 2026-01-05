package p001o;

import p001o.m28;
import p001o.qm5;

/* loaded from: classes3.dex */
public final class lm5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public qm5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            mm5.m39350d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        qm5.C16421a c16421a = new qm5.C16421a();
        if (bArr != null) {
            mm5.m39349c(c16421a, bArr);
        }
        c16421a.m45643b();
        return c16421a.m45642a();
    }
}
