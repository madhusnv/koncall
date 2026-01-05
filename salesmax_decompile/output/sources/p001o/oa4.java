package p001o;

import p001o.m28;
import p001o.ta4;

/* loaded from: classes2.dex */
public final class oa4 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ta4 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            pa4.m43268d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        ta4.C17040a c17040a = new ta4.C17040a();
        if (bArr != null) {
            pa4.m43267c(c17040a, bArr);
        }
        c17040a.m49615b();
        return c17040a.m49614a();
    }
}
