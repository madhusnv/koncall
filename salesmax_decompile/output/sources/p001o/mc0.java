package p001o;

import p001o.m28;
import p001o.rc0;

/* loaded from: classes3.dex */
public final class mc0 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rc0 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            nc0.m40310d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        rc0.C16582a c16582a = new rc0.C16582a();
        if (bArr != null) {
            nc0.m40309c(c16582a, bArr);
        }
        c16582a.m46493b();
        return c16582a.m46492a();
    }
}
