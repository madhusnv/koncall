package p001o;

import p001o.cr0;
import p001o.m28;

/* loaded from: classes3.dex */
public final class xq0 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cr0 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            yq0.m58073d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        cr0.C12726a c12726a = new cr0.C12726a();
        if (bArr != null) {
            yq0.m58072c(c12726a, bArr);
        }
        c12726a.m21598b();
        return c12726a.m21597a();
    }
}
