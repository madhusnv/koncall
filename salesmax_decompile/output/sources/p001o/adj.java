package p001o;

import p001o.bff;
import p001o.p9g;

/* loaded from: classes6.dex */
public abstract class adj {
    /* renamed from: a */
    public static final uef m16935a(uef uefVar, wff wffVar) {
        uef uefVarM16935a;
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(wffVar, "module");
        if (!sq8.m48644c(uefVar.getKind(), bff.C12372a.f16098a)) {
            return uefVar.isInline() ? m16935a(uefVar.mo16765g(0), wffVar) : uefVar;
        }
        uef uefVarM16512b = a64.m16512b(wffVar, uefVar);
        return (uefVarM16512b == null || (uefVarM16935a = m16935a(uefVarM16512b, wffVar)) == null) ? uefVar : uefVarM16935a;
    }

    /* renamed from: b */
    public static final zcj m16936b(p79 p79Var, uef uefVar) {
        sq8.m48649h(p79Var, "<this>");
        sq8.m48649h(uefVar, "desc");
        bff kind = uefVar.getKind();
        if (kind instanceof udd) {
            return zcj.POLY_OBJ;
        }
        if (sq8.m48644c(kind, p9g.C16038b.f39682a)) {
            return zcj.LIST;
        }
        if (!sq8.m48644c(kind, p9g.C16039c.f39683a)) {
            return zcj.OBJ;
        }
        uef uefVarM16935a = m16935a(uefVar.mo16765g(0), p79Var.mo43085a());
        bff kind2 = uefVarM16935a.getKind();
        if ((kind2 instanceof vhd) || sq8.m48644c(kind2, bff.C12373b.f16099a)) {
            return zcj.MAP;
        }
        if (p79Var.m43087d().m51125b()) {
            return zcj.LIST;
        }
        throw w89.m54055c(uefVarM16935a);
    }
}
