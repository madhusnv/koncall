package p001o;

import p001o.ep5;
import p001o.m28;

/* loaded from: classes3.dex */
public final class zo5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ep5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            ap5.m17593d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        ep5.C13243a c13243a = new ep5.C13243a();
        if (bArr != null) {
            ap5.m17592c(c13243a, bArr);
        }
        c13243a.m25409b();
        return c13243a.m25408a();
    }
}
