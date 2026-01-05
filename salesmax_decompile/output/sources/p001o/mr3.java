package p001o;

import p001o.m28;
import p001o.rr3;

/* loaded from: classes3.dex */
public final class mr3 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rr3 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            nr3.m40998d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        rr3.C16651a c16651a = new rr3.C16651a();
        if (bArr != null) {
            nr3.m40997c(c16651a, bArr);
        }
        c16651a.m47085b();
        return c16651a.m47084a();
    }
}
