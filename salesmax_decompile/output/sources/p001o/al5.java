package p001o;

import p001o.gl5;
import p001o.m28;

/* loaded from: classes3.dex */
public final class al5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gl5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            bl5.m19317b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        gl5.C13773a c13773a = new gl5.C13773a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-delete-marker");
        c13773a.m28992f(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null);
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c13773a.m28993g(str2 != null ? ame.f14997a.m17462a(str2) : null);
        c13773a.m28994h((String) g48VarM41347f.getHeaders().get("x-amz-version-id"));
        c13773a.m28988b();
        return c13773a.m28987a();
    }
}
