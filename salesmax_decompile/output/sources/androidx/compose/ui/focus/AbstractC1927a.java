package androidx.compose.ui.focus;

import androidx.compose.ui.node.C1939a;
import p001o.alb;
import p001o.sk5;
import p001o.sq8;
import p001o.xk7;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1927a {
    /* renamed from: a */
    public static final Object m4869a(C1932f c1932f, int i, xk7 xk7Var) {
        alb.AbstractC12216c abstractC12216cM48434f;
        C1939a c1939aM59428U;
        sq8.m48649h(c1932f, "$this$searchBeyondBounds");
        sq8.m48649h(xk7Var, "block");
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = c1932f.mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f);
        loop0: while (true) {
            if (zh9VarM48436h == null) {
                abstractC12216cM48434f = null;
                break;
            }
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                while (abstractC12216cM17358G != null) {
                    if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                        abstractC12216cM48434f = abstractC12216cM17358G;
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                break loop0;
                            }
                            if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                            abstractC12216cM48434f = sk5.m48434f(null);
                        }
                    }
                    abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
        C1932f c1932f2 = (C1932f) abstractC12216cM48434f;
        if (c1932f2 != null) {
            c1932f2.f0();
            c1932f.f0();
            if (sq8.m48644c(null, null)) {
                return null;
            }
        }
        c1932f.f0();
        return null;
    }
}
