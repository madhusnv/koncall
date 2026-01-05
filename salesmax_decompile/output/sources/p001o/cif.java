package p001o;

import p001o.hif;
import p001o.m28;

/* loaded from: classes3.dex */
public final class cif implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hif mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            dif.m23306b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        hif.C13979a c13979a = new hif.C13979a();
        c13979a.m30650b();
        return c13979a.m30649a();
    }
}
