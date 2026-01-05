package p001o;

import p001o.m28;
import p001o.rn5;

/* loaded from: classes3.dex */
public final class mn5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rn5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            nn5.m40802d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        rn5.C16630a c16630a = new rn5.C16630a();
        if (bArr != null) {
            nn5.m40801c(c16630a, bArr);
        }
        c16630a.m46990b();
        return c16630a.m46989a();
    }
}
