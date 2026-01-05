package p001o;

import p001o.hr7;
import p001o.m28;

/* loaded from: classes2.dex */
public final class cr7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hr7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            dr7.m23706d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        hr7.C14044a c14044a = new hr7.C14044a();
        if (bArr != null) {
            dr7.m23705c(c14044a, bArr);
        }
        c14044a.m31007b();
        return c14044a.m31006a();
    }
}
