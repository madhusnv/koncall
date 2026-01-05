package p001o;

import p001o.hwh;
import p001o.m28;

/* loaded from: classes3.dex */
public final class cwh implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hwh mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            dwh.m23918d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        hwh.C14111a c14111a = new hwh.C14111a();
        if (bArr != null) {
            dwh.m23917c(c14111a, bArr);
        }
        c14111a.m31240b();
        return c14111a.m31239a();
    }
}
