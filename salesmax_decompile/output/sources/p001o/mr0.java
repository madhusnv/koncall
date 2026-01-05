package p001o;

import p001o.m28;
import p001o.tr0;

/* loaded from: classes2.dex */
public final class mr0 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public tr0 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            nr0.m40929d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        tr0.C17190a c17190a = new tr0.C17190a();
        if (bArr != null) {
            nr0.m40928c(c17190a, bArr);
        }
        c17190a.m50395b();
        return c17190a.m50394a();
    }
}
