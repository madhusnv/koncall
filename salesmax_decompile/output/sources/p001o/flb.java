package p001o;

import androidx.compose.ui.node.C1939a;
import p001o.alb;

/* loaded from: classes2.dex */
public interface flb extends rk5 {
    /* renamed from: f */
    default elb mo27027f() {
        return m66.f34852a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    default Object m27028g(blb blbVar) {
        C1939a c1939aM59428U;
        sq8.m48649h(blbVar, "<this>");
        if (!mo17377h().m17361J()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iM60153a = zzb.m60153a(32);
        if (!mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(this);
        while (zh9VarM48436h != null) {
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                while (abstractC12216cM17358G != null) {
                    if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                            if (abstractC12216cM48434f instanceof flb) {
                                flb flbVar = (flb) abstractC12216cM48434f;
                                if (flbVar.mo27027f().mo25208a(blbVar)) {
                                    return flbVar.mo27027f().mo25209b(blbVar);
                                }
                            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                        }
                    }
                    abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
        return blbVar.m19332a().invoke();
    }
}
