package p001o;

import p001o.m28;
import p001o.vr7;

/* loaded from: classes3.dex */
public final class qr7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public vr7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            rr7.m47091d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        vr7.C17663a c17663a = new vr7.C17663a();
        if (bArr != null) {
            rr7.m47090c(c17663a, bArr);
        }
        c17663a.m53337b();
        return c17663a.m53336a();
    }
}
