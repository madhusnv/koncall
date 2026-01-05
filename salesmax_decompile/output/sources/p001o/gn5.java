package p001o;

import p001o.ln5;
import p001o.m28;

/* loaded from: classes3.dex */
public final class gn5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ln5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            hn5.m30845d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        ln5.C15108a c15108a = new ln5.C15108a();
        if (bArr != null) {
            hn5.m30844c(c15108a, bArr);
        }
        c15108a.m37514b();
        return c15108a.m37513a();
    }
}
