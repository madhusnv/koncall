package p001o;

import p001o.kp5;
import p001o.m28;

/* loaded from: classes3.dex */
public final class fp5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kp5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            gp5.m29268d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        kp5.C14895a c14895a = new kp5.C14895a();
        if (bArr != null) {
            gp5.m29267c(c14895a, bArr);
        }
        c14895a.m36000b();
        return c14895a.m35999a();
    }
}
