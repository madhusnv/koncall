package p001o;

import p001o.jq7;
import p001o.m28;

/* loaded from: classes3.dex */
public final class eq7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public jq7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            fq7.m27341d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        jq7.C14627a c14627a = new jq7.C14627a();
        if (bArr != null) {
            fq7.m27340c(c14627a, bArr);
        }
        c14627a.m34275b();
        return c14627a.m34274a();
    }
}
