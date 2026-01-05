package p001o;

import p001o.m28;
import p001o.yrf;

/* loaded from: classes3.dex */
public final class trf implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yrf mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            urf.m51978d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        yrf.C18472a c18472a = new yrf.C18472a();
        if (bArr != null) {
            urf.m51977c(c18472a, bArr);
        }
        c18472a.m58146b();
        return c18472a.m58145a();
    }
}
