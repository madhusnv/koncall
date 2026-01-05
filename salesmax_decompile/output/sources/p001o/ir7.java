package p001o;

import p001o.m28;
import p001o.mr7;

/* loaded from: classes3.dex */
public final class ir7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public mr7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            jr7.m34392d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        mr7.C15405a c15405a = new mr7.C15405a();
        if (bArr != null) {
            jr7.m34391c(c15405a, bArr);
        }
        c15405a.m39519b();
        return c15405a.m39518a();
    }
}
