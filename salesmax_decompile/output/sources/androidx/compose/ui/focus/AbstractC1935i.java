package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C1928b;
import androidx.compose.ui.node.C1939a;
import p001o.alb;
import p001o.ch1;
import p001o.fqb;
import p001o.h77;
import p001o.k77;
import p001o.kf9;
import p001o.kl8;
import p001o.sk5;
import p001o.sq8;
import p001o.szb;
import p001o.tq;
import p001o.xk7;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.i */
/* loaded from: classes2.dex */
public abstract class AbstractC1935i {

    /* renamed from: androidx.compose.ui.focus.i$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6289a;

        static {
            int[] iArr = new int[h77.values().length];
            try {
                iArr[h77.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h77.Active.ordinal()] = 2;
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
            f6289a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.focus.i$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C1932f f6290a;

        /* renamed from: b */
        public final /* synthetic */ C1932f f6291b;

        /* renamed from: c */
        public final /* synthetic */ int f6292c;

        /* renamed from: d */
        public final /* synthetic */ xk7 f6293d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
            super(1);
            this.f6290a = c1932f;
            this.f6291b = c1932f2;
            this.f6292c = i;
            this.f6293d = xk7Var;
        }

        /* renamed from: a */
        public final Boolean m4942a(ch1.InterfaceC12680a interfaceC12680a) {
            sq8.m48649h(interfaceC12680a, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(AbstractC1935i.m4941i(this.f6290a, this.f6291b, this.f6292c, this.f6293d));
            if (boolValueOf.booleanValue() || !interfaceC12680a.m21239a()) {
                return boolValueOf;
            }
            return null;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            tq.m50332a(obj);
            return m4942a(null);
        }
    }

    /* renamed from: b */
    public static final boolean m4934b(C1932f c1932f, xk7 xk7Var) {
        h77 h77VarG0 = c1932f.g0();
        int[] iArr = a.f6289a;
        int i = iArr[h77VarG0.ordinal()];
        if (i == 1) {
            C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
            if (c1932fM4931f == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i2 = iArr[c1932fM4931f.g0().ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return m4936d(c1932f, c1932fM4931f, C1928b.f6246b.m4890f(), xk7Var);
                }
                if (i2 != 4) {
                    throw new szb();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!m4934b(c1932fM4931f, xk7Var) && !m4936d(c1932f, c1932fM4931f, C1928b.f6246b.m4890f(), xk7Var) && (!c1932fM4931f.e0().mo4900j() || !((Boolean) xk7Var.invoke(c1932fM4931f)).booleanValue())) {
                return false;
            }
        } else {
            if (i == 2 || i == 3) {
                return m4939g(c1932f, xk7Var);
            }
            if (i != 4) {
                throw new szb();
            }
            if (!m4939g(c1932f, xk7Var)) {
                if (!(c1932f.e0().mo4900j() ? ((Boolean) xk7Var.invoke(c1932f)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m4935c(C1932f c1932f, xk7 xk7Var) {
        int i = a.f6289a[c1932f.g0().ordinal()];
        if (i == 1) {
            C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
            if (c1932fM4931f != null) {
                return m4935c(c1932fM4931f, xk7Var) || m4936d(c1932f, c1932fM4931f, C1928b.f6246b.m4889e(), xk7Var);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i == 2 || i == 3) {
            return m4940h(c1932f, xk7Var);
        }
        if (i == 4) {
            return c1932f.e0().mo4900j() ? ((Boolean) xk7Var.invoke(c1932f)).booleanValue() : m4940h(c1932f, xk7Var);
        }
        throw new szb();
    }

    /* renamed from: d */
    public static final boolean m4936d(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
        if (m4941i(c1932f, c1932f2, i, xk7Var)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC1927a.m4869a(c1932f, i, new b(c1932f, c1932f2, i, xk7Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m4937e(C1932f c1932f) {
        alb.AbstractC12216c abstractC12216c;
        C1939a c1939aM59428U;
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = c1932f.mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f);
        loop0: while (true) {
            abstractC12216c = null;
            if (zh9VarM48436h == null) {
                break;
            }
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a) != 0) {
                while (abstractC12216cM17358G != null) {
                    if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0) {
                        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17358G; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                abstractC12216c = abstractC12216cM48434f;
                                break loop0;
                            }
                            if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                        }
                    }
                    abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
        return abstractC12216c == null;
    }

    /* renamed from: f */
    public static final boolean m4938f(C1932f c1932f, int i, xk7 xk7Var) {
        sq8.m48649h(c1932f, "$this$oneDimensionalFocusSearch");
        sq8.m48649h(xk7Var, "onFound");
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4889e())) {
            return m4935c(c1932f, xk7Var);
        }
        if (C1928b.m4881l(i, aVar.m4890f())) {
            return m4934b(c1932f, xk7Var);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    /* renamed from: g */
    public static final boolean m4939g(C1932f c1932f, xk7 xk7Var) {
        fqb fqbVar = new fqb(new C1932f[16], 0);
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = c1932f.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar2, c1932f.mo17377h());
        } else {
            fqbVar2.m27344c(abstractC12216cM17353B);
        }
        while (fqbVar2.m27357r()) {
            alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
            if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                sk5.m48431c(fqbVar2, abstractC12216cM48434f);
            } else {
                while (true) {
                    if (abstractC12216cM48434f == null) {
                        break;
                    }
                    if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                fqbVar.m27344c((C1932f) abstractC12216cM48434f);
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
        fqbVar.m27365z(k77.f31570a);
        int iM27354o = fqbVar.m27354o();
        if (iM27354o > 0) {
            int i = iM27354o - 1;
            Object[] objArrM27353n = fqbVar.m27353n();
            do {
                C1932f c1932f2 = (C1932f) objArrM27353n[i];
                if (AbstractC1934h.m4932g(c1932f2) && m4934b(c1932f2, xk7Var)) {
                    return true;
                }
                i--;
            } while (i >= 0);
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m4940h(C1932f c1932f, xk7 xk7Var) {
        fqb fqbVar = new fqb(new C1932f[16], 0);
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = c1932f.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar2, c1932f.mo17377h());
        } else {
            fqbVar2.m27344c(abstractC12216cM17353B);
        }
        while (fqbVar2.m27357r()) {
            alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
            if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                sk5.m48431c(fqbVar2, abstractC12216cM48434f);
            } else {
                while (true) {
                    if (abstractC12216cM48434f == null) {
                        break;
                    }
                    if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                fqbVar.m27344c((C1932f) abstractC12216cM48434f);
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
        fqbVar.m27365z(k77.f31570a);
        int iM27354o = fqbVar.m27354o();
        if (iM27354o <= 0) {
            return false;
        }
        Object[] objArrM27353n = fqbVar.m27353n();
        int i = 0;
        do {
            C1932f c1932f2 = (C1932f) objArrM27353n[i];
            if (AbstractC1934h.m4932g(c1932f2) && m4935c(c1932f2, xk7Var)) {
                return true;
            }
            i++;
        } while (i < iM27354o);
        return false;
    }

    /* renamed from: i */
    public static final boolean m4941i(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
        if (!(c1932f.g0() == h77.ActiveParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        fqb fqbVar = new fqb(new C1932f[16], 0);
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = c1932f.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar2, c1932f.mo17377h());
        } else {
            fqbVar2.m27344c(abstractC12216cM17353B);
        }
        while (fqbVar2.m27357r()) {
            alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
            if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                sk5.m48431c(fqbVar2, abstractC12216cM48434f);
            } else {
                while (true) {
                    if (abstractC12216cM48434f == null) {
                        break;
                    }
                    if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                fqbVar.m27344c((C1932f) abstractC12216cM48434f);
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
        fqbVar.m27365z(k77.f31570a);
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4889e())) {
            kl8 kl8Var = new kl8(0, fqbVar.m27354o() - 1);
            int iM32260e = kl8Var.m32260e();
            int iM32261j = kl8Var.m32261j();
            if (iM32260e <= iM32261j) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C1932f c1932f3 = (C1932f) fqbVar.m27353n()[iM32260e];
                        if (AbstractC1934h.m4932g(c1932f3) && m4935c(c1932f3, xk7Var)) {
                            return true;
                        }
                    }
                    if (sq8.m48644c(fqbVar.m27353n()[iM32260e], c1932f2)) {
                        z = true;
                    }
                    if (iM32260e == iM32261j) {
                        break;
                    }
                    iM32260e++;
                }
            }
        } else {
            if (!C1928b.m4881l(i, aVar.m4890f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            kl8 kl8Var2 = new kl8(0, fqbVar.m27354o() - 1);
            int iM32260e2 = kl8Var2.m32260e();
            int iM32261j2 = kl8Var2.m32261j();
            if (iM32260e2 <= iM32261j2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        C1932f c1932f4 = (C1932f) fqbVar.m27353n()[iM32261j2];
                        if (AbstractC1934h.m4932g(c1932f4) && m4934b(c1932f4, xk7Var)) {
                            return true;
                        }
                    }
                    if (sq8.m48644c(fqbVar.m27353n()[iM32261j2], c1932f2)) {
                        z2 = true;
                    }
                    if (iM32261j2 == iM32260e2) {
                        break;
                    }
                    iM32261j2--;
                }
            }
        }
        if (C1928b.m4881l(i, C1928b.f6246b.m4889e()) || !c1932f.e0().mo4900j() || m4937e(c1932f)) {
            return false;
        }
        return ((Boolean) xk7Var.invoke(c1932f)).booleanValue();
    }
}
