package p001o;

import p001o.m28;
import p001o.yo5;

/* loaded from: classes3.dex */
public final class to5 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yo5 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        if (!t48.m49282c(o18Var.m41347f().getStatus())) {
            uo5.m51842d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        yo5.C18448a c18448a = new yo5.C18448a();
        if (bArr != null) {
            uo5.m51841c(c18448a, bArr);
        }
        c18448a.m58036b();
        return c18448a.m58035a();
    }
}
