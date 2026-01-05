package p001o;

import p001o.m28;
import p001o.mfa;

/* loaded from: classes3.dex */
public final class hfa implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public mfa mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            ifa.m32060d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        mfa.C15307a c15307a = new mfa.C15307a();
        if (bArr != null) {
            ifa.m32059c(c15307a, bArr);
        }
        c15307a.m38931b();
        return c15307a.m38930a();
    }
}
