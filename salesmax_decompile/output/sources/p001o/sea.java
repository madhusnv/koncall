package p001o;

import p001o.m28;
import p001o.xea;

/* loaded from: classes3.dex */
public final class sea implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xea mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            tea.m49788d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        xea.C18127a c18127a = new xea.C18127a();
        if (bArr != null) {
            tea.m49787c(c18127a, bArr);
        }
        c18127a.m56168b();
        return c18127a.m56167a();
    }
}
