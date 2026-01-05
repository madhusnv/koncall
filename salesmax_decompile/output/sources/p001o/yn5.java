package p001o;

import p001o.do5;
import p001o.m28;

/* loaded from: classes3.dex */
public final class yn5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public do5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            zn5.m59633d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        do5.C13007a c13007a = new do5.C13007a();
        if (bArr != null) {
            zn5.m59632c(c13007a, bArr);
        }
        c13007a.m23638b();
        return c13007a.m23637a();
    }
}
