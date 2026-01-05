package p001o;

import p001o.m28;
import p001o.yfa;

/* loaded from: classes3.dex */
public final class tfa implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yfa mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            ufa.m51542d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        yfa.C18399a c18399a = new yfa.C18399a();
        if (bArr != null) {
            ufa.m51541c(c18399a, bArr);
        }
        c18399a.m57758b();
        return c18399a.m57757a();
    }
}
