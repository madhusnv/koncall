package p001o;

import p001o.m28;
import p001o.nea;

/* loaded from: classes3.dex */
public final class iea implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public nea mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            jea.m33646d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        nea.C15554a c15554a = new nea.C15554a();
        if (bArr != null) {
            jea.m33645c(c15554a, bArr);
        }
        c15554a.m40421b();
        return c15554a.m40420a();
    }
}
