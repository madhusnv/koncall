package p001o;

import p001o.m28;
import p001o.xqe;

/* loaded from: classes3.dex */
public final class sqe implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xqe mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            tqe.m50345d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        xqe.C18223a c18223a = new xqe.C18223a();
        if (bArr != null) {
            tqe.m50344c(c18223a, bArr);
        }
        c18223a.m56666b();
        return c18223a.m56665a();
    }
}
