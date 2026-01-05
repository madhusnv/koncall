package p001o;

import p001o.lr0;
import p001o.m28;

/* loaded from: classes2.dex */
public final class dr0 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public lr0 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            er0.m25446d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        lr0.C15135a c15135a = new lr0.C15135a();
        if (bArr != null) {
            er0.m25445c(c15135a, bArr);
        }
        c15135a.m37792b();
        return c15135a.m37791a();
    }
}
