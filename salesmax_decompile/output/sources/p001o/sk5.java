package p001o;

import p001o.alb;

/* loaded from: classes2.dex */
public abstract class sk5 {
    /* renamed from: c */
    public static final void m48431c(fqb fqbVar, alb.AbstractC12216c abstractC12216c) {
        fqb fqbVarE0 = m48436h(abstractC12216c).e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            int i = iM27354o - 1;
            Object[] objArrM27353n = fqbVarE0.m27353n();
            do {
                fqbVar.m27344c(((zh9) objArrM27353n[i]).m59428U().m4987k());
                i--;
            } while (i >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final uh9 m48432d(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "<this>");
        if (((zzb.m60153a(2) & abstractC12216c.m17356E()) != 0) && (abstractC12216c instanceof uh9)) {
            return (uh9) abstractC12216c;
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m48433e(rk5 rk5Var, int i) {
        sq8.m48649h(rk5Var, "$this$has");
        return (rk5Var.mo17377h().m17352A() & i) != 0;
    }

    /* renamed from: f */
    public static final alb.AbstractC12216c m48434f(fqb fqbVar) {
        if (fqbVar == null || fqbVar.m27356q()) {
            return null;
        }
        return (alb.AbstractC12216c) fqbVar.m27361v(fqbVar.m27354o() - 1);
    }

    /* renamed from: g */
    public static final xzb m48435g(rk5 rk5Var, int i) {
        sq8.m48649h(rk5Var, "$this$requireCoordinator");
        xzb xzbVarM17354C = rk5Var.mo17377h().m17354C();
        sq8.m48646e(xzbVarM17354C);
        if (xzbVarM17354C.P0() != rk5Var || !a0c.m16306i(i)) {
            return xzbVarM17354C;
        }
        xzb xzbVarQ0 = xzbVarM17354C.Q0();
        sq8.m48646e(xzbVarQ0);
        return xzbVarQ0;
    }

    /* renamed from: h */
    public static final zh9 m48436h(rk5 rk5Var) {
        sq8.m48649h(rk5Var, "<this>");
        xzb xzbVarM17354C = rk5Var.mo17377h().m17354C();
        if (xzbVarM17354C != null) {
            return xzbVarM17354C.a0();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    /* renamed from: i */
    public static final sgc m48437i(rk5 rk5Var) {
        sq8.m48649h(rk5Var, "<this>");
        sgc sgcVarM59430W = m48436h(rk5Var).m59430W();
        if (sgcVarM59430W != null) {
            return sgcVarM59430W;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
