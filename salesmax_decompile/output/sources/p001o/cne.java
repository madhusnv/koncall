package p001o;

import p001o.hne;
import p001o.m28;

/* loaded from: classes3.dex */
public final class cne implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hne mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            dne.m23633d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        hne.C14013a c14013a = new hne.C14013a();
        if (bArr != null) {
            dne.m23632c(c14013a, bArr);
        }
        c14013a.m30855b();
        return c14013a.m30854a();
    }
}
