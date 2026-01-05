package p001o;

import p001o.m28;
import p001o.xn5;

/* loaded from: classes3.dex */
public final class sn5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xn5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            tn5.m50234d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        xn5.C18191a c18191a = new xn5.C18191a();
        if (bArr != null) {
            tn5.m50233c(c18191a, bArr);
        }
        c18191a.m56494b();
        return c18191a.m56493a();
    }
}
