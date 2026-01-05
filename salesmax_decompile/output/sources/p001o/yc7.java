package p001o;

import p001o.dd7;
import p001o.m28;

/* loaded from: classes3.dex */
public final class yc7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public dd7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            zc7.m59181d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        dd7.C12874a c12874a = new dd7.C12874a();
        if (bArr != null) {
            zc7.m59180c(c12874a, bArr);
        }
        c12874a.m22813b();
        return c12874a.m22812a();
    }
}
