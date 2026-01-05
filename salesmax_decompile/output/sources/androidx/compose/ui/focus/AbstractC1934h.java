package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C1928b;
import androidx.compose.ui.node.C1939a;
import p001o.alb;
import p001o.fqb;
import p001o.h77;
import p001o.mfe;
import p001o.nh9;
import p001o.qh9;
import p001o.sk5;
import p001o.sq8;
import p001o.szb;
import p001o.xk7;
import p001o.xzb;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1934h {

    /* renamed from: androidx.compose.ui.focus.h$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6287a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6288b;

        static {
            int[] iArr = new int[qh9.values().length];
            try {
                iArr[qh9.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qh9.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6287a = iArr;
            int[] iArr2 = new int[h77.values().length];
            try {
                iArr2[h77.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h77.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h77.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f6288b = iArr2;
        }
    }

    /* renamed from: a */
    public static final C1931e m4926a(C1932f c1932f, int i, qh9 qh9Var) {
        C1931e c1931eMo4897g;
        sq8.m48649h(c1932f, "$this$customFocusSearch");
        sq8.m48649h(qh9Var, "layoutDirection");
        InterfaceC1929c interfaceC1929cE0 = c1932f.e0();
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4889e())) {
            return interfaceC1929cE0.getNext();
        }
        if (C1928b.m4881l(i, aVar.m4890f())) {
            return interfaceC1929cE0.mo4901k();
        }
        if (C1928b.m4881l(i, aVar.m4892h())) {
            return interfaceC1929cE0.mo4895e();
        }
        if (C1928b.m4881l(i, aVar.m4885a())) {
            return interfaceC1929cE0.mo4898h();
        }
        if (C1928b.m4881l(i, aVar.m4888d())) {
            int i2 = a.f6287a[qh9Var.ordinal()];
            if (i2 == 1) {
                c1931eMo4897g = interfaceC1929cE0.getStart();
            } else {
                if (i2 != 2) {
                    throw new szb();
                }
                c1931eMo4897g = interfaceC1929cE0.mo4897g();
            }
            if (c1931eMo4897g == C1931e.f6273b.m4910b()) {
                c1931eMo4897g = null;
            }
            if (c1931eMo4897g == null) {
                return interfaceC1929cE0.mo4893a();
            }
        } else {
            if (!C1928b.m4881l(i, aVar.m4891g())) {
                if (C1928b.m4881l(i, aVar.m4886b())) {
                    return (C1931e) interfaceC1929cE0.mo4899i().invoke(C1928b.m4878i(i));
                }
                if (C1928b.m4881l(i, aVar.m4887c())) {
                    return (C1931e) interfaceC1929cE0.mo4896f().invoke(C1928b.m4878i(i));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i3 = a.f6287a[qh9Var.ordinal()];
            if (i3 == 1) {
                c1931eMo4897g = interfaceC1929cE0.mo4897g();
            } else {
                if (i3 != 2) {
                    throw new szb();
                }
                c1931eMo4897g = interfaceC1929cE0.getStart();
            }
            if (c1931eMo4897g == C1931e.f6273b.m4910b()) {
                c1931eMo4897g = null;
            }
            if (c1931eMo4897g == null) {
                return interfaceC1929cE0.mo4894d();
            }
        }
        return c1931eMo4897g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0054, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1932f m4927b(C1932f c1932f) {
        sq8.m48649h(c1932f, "<this>");
        int i = a.f6288b[c1932f.g0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int iM60153a = zzb.m60153a(1024);
                if (!c1932f.mo17377h().m17361J()) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                fqb fqbVar = new fqb(new alb.AbstractC12216c[16], 0);
                alb.AbstractC12216c abstractC12216cM17353B = c1932f.mo17377h().m17353B();
                if (abstractC12216cM17353B == null) {
                    sk5.m48431c(fqbVar, c1932f.mo17377h());
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
                                        C1932f c1932fM4927b = m4927b((C1932f) abstractC12216cM48434f);
                                        if (c1932fM4927b != null) {
                                            return c1932fM4927b;
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
                return null;
            }
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new szb();
            }
        }
        return c1932f;
    }

    /* renamed from: c */
    public static final C1932f m4928c(C1932f c1932f) {
        C1939a c1939aM59428U;
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = c1932f.mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f);
        while (zh9VarM48436h != null) {
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                while (abstractC12216cM17358G != null) {
                    if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                C1932f c1932f2 = (C1932f) abstractC12216cM48434f;
                                if (c1932f2.e0().mo4900j()) {
                                    return c1932f2;
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
        return null;
    }

    /* renamed from: d */
    public static final mfe m4929d(C1932f c1932f) {
        mfe mfeVarMo39064q;
        sq8.m48649h(c1932f, "<this>");
        xzb xzbVarM17354C = c1932f.m17354C();
        return (xzbVarM17354C == null || (mfeVarMo39064q = nh9.m40601d(xzbVarM17354C).mo39064q(xzbVarM17354C, false)) == null) ? mfe.f35356e.m38953a() : mfeVarMo39064q;
    }

    /* renamed from: e */
    public static final boolean m4930e(C1932f c1932f, int i, qh9 qh9Var, xk7 xk7Var) {
        int iM4891g;
        Boolean boolM4962t;
        sq8.m48649h(c1932f, "$this$focusSearch");
        sq8.m48649h(qh9Var, "layoutDirection");
        sq8.m48649h(xk7Var, "onFound");
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4889e()) ? true : C1928b.m4881l(i, aVar.m4890f())) {
            return AbstractC1935i.m4938f(c1932f, i, xk7Var);
        }
        if (C1928b.m4881l(i, aVar.m4888d()) ? true : C1928b.m4881l(i, aVar.m4891g()) ? true : C1928b.m4881l(i, aVar.m4892h()) ? true : C1928b.m4881l(i, aVar.m4885a())) {
            Boolean boolM4962t2 = AbstractC1936j.m4962t(c1932f, i, xk7Var);
            if (boolM4962t2 != null) {
                return boolM4962t2.booleanValue();
            }
        } else if (C1928b.m4881l(i, aVar.m4886b())) {
            int i2 = a.f6287a[qh9Var.ordinal()];
            if (i2 == 1) {
                iM4891g = aVar.m4891g();
            } else {
                if (i2 != 2) {
                    throw new szb();
                }
                iM4891g = aVar.m4888d();
            }
            C1932f c1932fM4927b = m4927b(c1932f);
            if (c1932fM4927b != null && (boolM4962t = AbstractC1936j.m4962t(c1932fM4927b, iM4891g, xk7Var)) != null) {
                return boolM4962t.booleanValue();
            }
        } else {
            if (!C1928b.m4881l(i, aVar.m4887c())) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C1928b.m4883n(i))).toString());
            }
            C1932f c1932fM4927b2 = m4927b(c1932f);
            C1932f c1932fM4928c = c1932fM4927b2 != null ? m4928c(c1932fM4927b2) : null;
            if (c1932fM4928c != null && !sq8.m48644c(c1932fM4928c, c1932f)) {
                return ((Boolean) xk7Var.invoke(c1932fM4928c)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0040, code lost:
    
        continue;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1932f m4931f(C1932f c1932f) {
        sq8.m48649h(c1932f, "<this>");
        if (!c1932f.mo17377h().m17361J()) {
            return null;
        }
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = c1932f.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar, c1932f.mo17377h());
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
                                C1932f c1932f2 = (C1932f) abstractC12216cM48434f;
                                int i = a.f6288b[c1932f2.g0().ordinal()];
                                if (i == 1 || i == 2 || i == 3) {
                                    return c1932f2;
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
        return null;
    }

    /* renamed from: g */
    public static final boolean m4932g(C1932f c1932f) {
        zh9 zh9VarA0;
        zh9 zh9VarA02;
        sq8.m48649h(c1932f, "<this>");
        xzb xzbVarM17354C = c1932f.m17354C();
        if ((xzbVarM17354C == null || (zh9VarA02 = xzbVarM17354C.a0()) == null || !zh9VarA02.mo49883a()) ? false : true) {
            xzb xzbVarM17354C2 = c1932f.m17354C();
            if ((xzbVarM17354C2 == null || (zh9VarA0 = xzbVarM17354C2.a0()) == null || !zh9VarA0.s0()) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
