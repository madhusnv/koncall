package p001o;

import p001o.m28;
import p001o.oq7;

/* loaded from: classes3.dex */
public final class kq7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public oq7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            lq7.m37756d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        oq7.C15869a c15869a = new oq7.C15869a();
        if (bArr != null) {
            lq7.m37755c(c15869a, bArr);
        }
        c15869a.m42541b();
        return c15869a.m42540a();
    }
}
