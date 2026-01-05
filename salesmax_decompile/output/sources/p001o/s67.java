package p001o;

import androidx.compose.ui.focus.C1932f;
import androidx.compose.ui.node.C1939a;
import p001o.alb;

/* loaded from: classes2.dex */
public abstract class s67 {

    /* renamed from: o.s67$a */
    public /* synthetic */ class C16757a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44872a;

        static {
            int[] iArr = new int[h77.values().length];
            try {
                iArr[h77.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h77.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h77.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44872a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0065, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g77 m47902a(r67 r67Var) {
        sq8.m48649h(r67Var, "<this>");
        int iM60153a = zzb.m60153a(1024);
        for (alb.AbstractC12216c abstractC12216cMo17377h = r67Var.mo17377h(); abstractC12216cMo17377h != null; abstractC12216cMo17377h = sk5.m48434f(null)) {
            if (abstractC12216cMo17377h instanceof C1932f) {
                h77 h77VarG0 = ((C1932f) abstractC12216cMo17377h).g0();
                int i = C16757a.f44872a[h77VarG0.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return h77VarG0;
                }
            } else if ((abstractC12216cMo17377h.m17356E() & iM60153a) != 0) {
            }
        }
        if (!r67Var.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = r67Var.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar, r67Var.mo17377h());
        } else {
            fqbVar.m27344c(abstractC12216cM17353B);
        }
        while (fqbVar.m27357r()) {
            alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar.m27361v(fqbVar.m27354o() - 1);
            if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                sk5.m48431c(fqbVar, abstractC12216cM48434f);
            } else {
                while (true) {
                    if (abstractC12216cM48434f == null) {
                        break;
                    }
                    if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                h77 h77VarG02 = ((C1932f) abstractC12216cM48434f).g0();
                                int i2 = C16757a.f44872a[h77VarG02.ordinal()];
                                if (i2 == 1 || i2 == 2 || i2 == 3) {
                                    return h77VarG02;
                                }
                            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                            abstractC12216cM48434f = sk5.m48434f(null);
                        }
                    } else {
                        abstractC12216cM48434f = abstractC12216cM48434f.m17353B();
                    }
                }
            }
        }
        return h77.Inactive;
    }

    /* renamed from: b */
    public static final void m47903b(r67 r67Var) {
        sq8.m48649h(r67Var, "<this>");
        sk5.m48437i(r67Var).getFocusOwner().mo4855j(r67Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final void m47904c(C1932f c1932f) {
        C1939a c1939aM59428U;
        sq8.m48649h(c1932f, "<this>");
        int iM60153a = zzb.m60153a(4096);
        int iM60153a2 = zzb.m60153a(1024);
        alb.AbstractC12216c abstractC12216cMo17377h = c1932f.mo17377h();
        int i = iM60153a | iM60153a2;
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cMo17377h2 = c1932f.mo17377h();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f);
        while (zh9VarM48436h != null) {
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & i) != 0) {
                while (abstractC12216cMo17377h2 != null) {
                    if ((abstractC12216cMo17377h2.m17356E() & i) != 0) {
                        if (abstractC12216cMo17377h2 != abstractC12216cMo17377h) {
                            if ((abstractC12216cMo17377h2.m17356E() & iM60153a2) != 0) {
                                return;
                            }
                        }
                        if ((abstractC12216cMo17377h2.m17356E() & iM60153a) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cMo17377h2; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof r67) {
                                    r67 r67Var = (r67) abstractC12216cM48434f;
                                    r67Var.mo40257i(m47902a(r67Var));
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                            }
                        }
                    }
                    abstractC12216cMo17377h2 = abstractC12216cMo17377h2.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cMo17377h2 = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
    }
}
