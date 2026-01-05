package p001o;

import p001o.m28;
import p001o.ro5;

/* loaded from: classes3.dex */
public final class mo5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ro5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            no5.m40860d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        ro5.C16637a c16637a = new ro5.C16637a();
        if (bArr != null) {
            no5.m40859c(c16637a, bArr);
        }
        c16637a.m47016b();
        return c16637a.m47015a();
    }
}
