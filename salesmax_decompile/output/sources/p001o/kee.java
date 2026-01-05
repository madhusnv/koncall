package p001o;

import p001o.m28;
import p001o.pee;

/* loaded from: classes3.dex */
public final class kee implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public pee mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            lee.m37046d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        pee.C16093a c16093a = new pee.C16093a();
        if (bArr != null) {
            lee.m37045c(c16093a, bArr);
        }
        c16093a.m43536b();
        return c16093a.m43535a();
    }
}
