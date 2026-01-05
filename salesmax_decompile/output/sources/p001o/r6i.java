package p001o;

import p001o.m28;
import p001o.w6i;

/* loaded from: classes3.dex */
public final class r6i implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public w6i mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            s6i.m47917d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        w6i.C17786a c17786a = new w6i.C17786a();
        if (bArr != null) {
            s6i.m47916c(c17786a, bArr);
        }
        c17786a.m54011b();
        return c17786a.m54010a();
    }
}
