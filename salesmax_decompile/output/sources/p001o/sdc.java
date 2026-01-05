package p001o;

import p001o.l8i;
import p001o.s8i;

/* loaded from: classes3.dex */
public abstract class sdc {
    /* renamed from: a */
    public static final void m48263a(z38 z38Var, jl6 jl6Var, b86 b86Var) {
        sq8.m48649h(z38Var, "req");
        sq8.m48649h(jl6Var, "ctx");
        sq8.m48649h(b86Var, "endpoint");
        String str = (String) jl6Var.mo18191b(s38.f44646a.m47568d());
        if (str == null) {
            str = "";
        }
        String str2 = str + b86Var.m18277c().m36755b();
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        c15036aM58671h.m36775p(b86Var.m18277c().m36759f());
        c15036aM58671h.m36769j().m35557c(b86Var.m18277c().m36760g());
        c15036aM58671h.m36773n(y08.f54673a.m57086a(str2));
        c15036aM58671h.m36774o(Integer.valueOf(b86Var.m18277c().m36758e()));
        s8i.C16783a c16783aM36767h = c15036aM58671h.m36767h();
        c16783aM36767h.m48017n(c16783aM36767h.m48010g() || (c16783aM36767h.m48009f().isEmpty() && b86Var.m18277c().m36757d().m48002c()));
        c16783aM36767h.m48009f().addAll(0, b86Var.m18277c().m36757d().m48001b());
        c15036aM58671h.m36766g().mo20281q(b86Var.m18277c().m36756c());
        y66 y66VarM36754a = b86Var.m18277c().m36754a();
        c15036aM58671h.m36772m(y66VarM36754a != null ? y66VarM36754a.m57311c() : null);
        z38Var.m58668e().m59810r("Host", z38Var.m58671h().m36765f());
        xri xriVarM18276b = b86Var.m18276b();
        if (xriVarM18276b != null) {
            z38Var.m58668e().m59798e(xriVarM18276b);
        }
    }

    /* renamed from: b */
    public static final void m48264b(zdc zdcVar, b86 b86Var) {
        sq8.m48649h(zdcVar, "req");
        sq8.m48649h(b86Var, "endpoint");
        m48263a((z38) zdcVar.m59255d(), zdcVar.m59254c(), b86Var);
    }
}
