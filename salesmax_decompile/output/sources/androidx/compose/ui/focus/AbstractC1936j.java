package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C1928b;
import p001o.alb;
import p001o.ch1;
import p001o.fqb;
import p001o.h77;
import p001o.kf9;
import p001o.mfe;
import p001o.rk5;
import p001o.sk5;
import p001o.sq8;
import p001o.szb;
import p001o.tq;
import p001o.xk7;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1936j {

    /* renamed from: androidx.compose.ui.focus.j$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6294a;

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
            f6294a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.focus.j$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C1932f f6295a;

        /* renamed from: b */
        public final /* synthetic */ C1932f f6296b;

        /* renamed from: c */
        public final /* synthetic */ int f6297c;

        /* renamed from: d */
        public final /* synthetic */ xk7 f6298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
            super(1);
            this.f6295a = c1932f;
            this.f6296b = c1932f2;
            this.f6297c = i;
            this.f6298d = xk7Var;
        }

        /* renamed from: a */
        public final Boolean m4963a(ch1.InterfaceC12680a interfaceC12680a) {
            sq8.m48649h(interfaceC12680a, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(AbstractC1936j.m4960r(this.f6295a, this.f6296b, this.f6297c, this.f6298d));
            if (boolValueOf.booleanValue() || !interfaceC12680a.m21239a()) {
                return boolValueOf;
            }
            return null;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            tq.m50332a(obj);
            return m4963a(null);
        }
    }

    /* renamed from: b */
    public static final C1932f m4944b(C1932f c1932f) {
        if (!(c1932f.g0() == h77.ActiveParent)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C1932f c1932fM4927b = AbstractC1934h.m4927b(c1932f);
        if (c1932fM4927b != null) {
            return c1932fM4927b;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    /* renamed from: c */
    public static final boolean m4945c(mfe mfeVar, mfe mfeVar2, mfe mfeVar3, int i) {
        if (m4946d(mfeVar3, i, mfeVar) || !m4946d(mfeVar2, i, mfeVar)) {
            return false;
        }
        if (m4947e(mfeVar3, i, mfeVar)) {
            C1928b.a aVar = C1928b.f6246b;
            if (!C1928b.m4881l(i, aVar.m4888d()) && !C1928b.m4881l(i, aVar.m4891g()) && m4948f(mfeVar2, i, mfeVar) >= m4949g(mfeVar3, i, mfeVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m4946d(mfe mfeVar, int i, mfe mfeVar2) {
        C1928b.a aVar = C1928b.f6246b;
        if (!(C1928b.m4881l(i, aVar.m4888d()) ? true : C1928b.m4881l(i, aVar.m4891g()))) {
            if (!(C1928b.m4881l(i, aVar.m4892h()) ? true : C1928b.m4881l(i, aVar.m4885a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (mfeVar.m38946g() > mfeVar2.m38945f() && mfeVar.m38945f() < mfeVar2.m38946g()) {
                return true;
            }
        } else if (mfeVar.m38942c() > mfeVar2.m38948i() && mfeVar.m38948i() < mfeVar2.m38942c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m4947e(mfe mfeVar, int i, mfe mfeVar2) {
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4888d())) {
            if (mfeVar2.m38945f() >= mfeVar.m38946g()) {
                return true;
            }
        } else if (C1928b.m4881l(i, aVar.m4891g())) {
            if (mfeVar2.m38946g() <= mfeVar.m38945f()) {
                return true;
            }
        } else if (C1928b.m4881l(i, aVar.m4892h())) {
            if (mfeVar2.m38948i() >= mfeVar.m38942c()) {
                return true;
            }
        } else {
            if (!C1928b.m4881l(i, aVar.m4885a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (mfeVar2.m38942c() <= mfeVar.m38948i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final float m4948f(mfe mfeVar, int i, mfe mfeVar2) {
        float fM38948i;
        float fM38942c;
        float fM38948i2;
        float fM38942c2;
        float f;
        C1928b.a aVar = C1928b.f6246b;
        if (!C1928b.m4881l(i, aVar.m4888d())) {
            if (C1928b.m4881l(i, aVar.m4891g())) {
                fM38948i = mfeVar.m38945f();
                fM38942c = mfeVar2.m38946g();
            } else if (C1928b.m4881l(i, aVar.m4892h())) {
                fM38948i2 = mfeVar2.m38948i();
                fM38942c2 = mfeVar.m38942c();
            } else {
                if (!C1928b.m4881l(i, aVar.m4885a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fM38948i = mfeVar.m38948i();
                fM38942c = mfeVar2.m38942c();
            }
            f = fM38948i - fM38942c;
            return Math.max(0.0f, f);
        }
        fM38948i2 = mfeVar2.m38945f();
        fM38942c2 = mfeVar.m38946g();
        f = fM38948i2 - fM38942c2;
        return Math.max(0.0f, f);
    }

    /* renamed from: g */
    public static final float m4949g(mfe mfeVar, int i, mfe mfeVar2) {
        float fM38942c;
        float fM38942c2;
        float fM38948i;
        float fM38948i2;
        float f;
        C1928b.a aVar = C1928b.f6246b;
        if (!C1928b.m4881l(i, aVar.m4888d())) {
            if (C1928b.m4881l(i, aVar.m4891g())) {
                fM38942c = mfeVar.m38946g();
                fM38942c2 = mfeVar2.m38946g();
            } else if (C1928b.m4881l(i, aVar.m4892h())) {
                fM38948i = mfeVar2.m38948i();
                fM38948i2 = mfeVar.m38948i();
            } else {
                if (!C1928b.m4881l(i, aVar.m4885a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fM38942c = mfeVar.m38942c();
                fM38942c2 = mfeVar2.m38942c();
            }
            f = fM38942c - fM38942c2;
            return Math.max(1.0f, f);
        }
        fM38948i = mfeVar2.m38945f();
        fM38948i2 = mfeVar.m38945f();
        f = fM38948i - fM38948i2;
        return Math.max(1.0f, f);
    }

    /* renamed from: h */
    public static final mfe m4950h(mfe mfeVar) {
        return new mfe(mfeVar.m38946g(), mfeVar.m38942c(), mfeVar.m38946g(), mfeVar.m38942c());
    }

    /* renamed from: i */
    public static final void m4951i(rk5 rk5Var, fqb fqbVar) {
        int iM60153a = zzb.m60153a(1024);
        if (!rk5Var.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar2 = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = rk5Var.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar2, rk5Var.mo17377h());
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
                                C1932f c1932f = (C1932f) abstractC12216cM48434f;
                                if (c1932f.m17361J()) {
                                    if (c1932f.e0().mo4900j()) {
                                        fqbVar.m27344c(c1932f);
                                    } else {
                                        m4951i(c1932f, fqbVar);
                                    }
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
    }

    /* renamed from: j */
    public static final C1932f m4952j(fqb fqbVar, mfe mfeVar, int i) {
        mfe mfeVarM38951l;
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4888d())) {
            mfeVarM38951l = mfeVar.m38951l(mfeVar.m38949j() + 1, 0.0f);
        } else if (C1928b.m4881l(i, aVar.m4891g())) {
            mfeVarM38951l = mfeVar.m38951l(-(mfeVar.m38949j() + 1), 0.0f);
        } else if (C1928b.m4881l(i, aVar.m4892h())) {
            mfeVarM38951l = mfeVar.m38951l(0.0f, mfeVar.m38944e() + 1);
        } else {
            if (!C1928b.m4881l(i, aVar.m4885a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            mfeVarM38951l = mfeVar.m38951l(0.0f, -(mfeVar.m38944e() + 1));
        }
        int iM27354o = fqbVar.m27354o();
        C1932f c1932f = null;
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i2 = 0;
            do {
                C1932f c1932f2 = (C1932f) objArrM27353n[i2];
                if (AbstractC1934h.m4932g(c1932f2)) {
                    mfe mfeVarM4929d = AbstractC1934h.m4929d(c1932f2);
                    if (m4955m(mfeVarM4929d, mfeVarM38951l, mfeVar, i)) {
                        c1932f = c1932f2;
                        mfeVarM38951l = mfeVarM4929d;
                    }
                }
                i2++;
            } while (i2 < iM27354o);
        }
        return c1932f;
    }

    /* renamed from: k */
    public static final boolean m4953k(C1932f c1932f, int i, xk7 xk7Var) {
        mfe mfeVarM4950h;
        sq8.m48649h(c1932f, "$this$findChildCorrespondingToFocusEnter");
        sq8.m48649h(xk7Var, "onFound");
        fqb fqbVar = new fqb(new C1932f[16], 0);
        m4951i(c1932f, fqbVar);
        if (fqbVar.m27354o() <= 1) {
            C1932f c1932f2 = (C1932f) (fqbVar.m27356q() ? null : fqbVar.m27353n()[0]);
            if (c1932f2 != null) {
                return ((Boolean) xk7Var.invoke(c1932f2)).booleanValue();
            }
            return false;
        }
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4886b())) {
            i = aVar.m4891g();
        }
        if (C1928b.m4881l(i, aVar.m4891g()) ? true : C1928b.m4881l(i, aVar.m4885a())) {
            mfeVarM4950h = m4961s(AbstractC1934h.m4929d(c1932f));
        } else {
            if (!(C1928b.m4881l(i, aVar.m4888d()) ? true : C1928b.m4881l(i, aVar.m4892h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            mfeVarM4950h = m4950h(AbstractC1934h.m4929d(c1932f));
        }
        C1932f c1932fM4952j = m4952j(fqbVar, mfeVarM4950h, i);
        if (c1932fM4952j != null) {
            return ((Boolean) xk7Var.invoke(c1932fM4952j)).booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m4954l(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
        if (m4960r(c1932f, c1932f2, i, xk7Var)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC1927a.m4869a(c1932f, i, new b(c1932f, c1932f2, i, xk7Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m4955m(mfe mfeVar, mfe mfeVar2, mfe mfeVar3, int i) {
        if (m4956n(mfeVar, i, mfeVar3)) {
            return !m4956n(mfeVar2, i, mfeVar3) || m4945c(mfeVar3, mfeVar, mfeVar2, i) || (!m4945c(mfeVar3, mfeVar2, mfeVar, i) && m4959q(i, mfeVar3, mfeVar) < m4959q(i, mfeVar3, mfeVar2));
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m4956n(mfe mfeVar, int i, mfe mfeVar2) {
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4888d())) {
            if ((mfeVar2.m38946g() > mfeVar.m38946g() || mfeVar2.m38945f() >= mfeVar.m38946g()) && mfeVar2.m38945f() > mfeVar.m38945f()) {
                return true;
            }
        } else if (C1928b.m4881l(i, aVar.m4891g())) {
            if ((mfeVar2.m38945f() < mfeVar.m38945f() || mfeVar2.m38946g() <= mfeVar.m38945f()) && mfeVar2.m38946g() < mfeVar.m38946g()) {
                return true;
            }
        } else if (C1928b.m4881l(i, aVar.m4892h())) {
            if ((mfeVar2.m38942c() > mfeVar.m38942c() || mfeVar2.m38948i() >= mfeVar.m38942c()) && mfeVar2.m38948i() > mfeVar.m38948i()) {
                return true;
            }
        } else {
            if (!C1928b.m4881l(i, aVar.m4885a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if ((mfeVar2.m38948i() < mfeVar.m38948i() || mfeVar2.m38942c() <= mfeVar.m38948i()) && mfeVar2.m38942c() < mfeVar.m38942c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static final float m4957o(mfe mfeVar, int i, mfe mfeVar2) {
        float fM38948i;
        float fM38942c;
        float fM38948i2;
        float fM38942c2;
        float f;
        C1928b.a aVar = C1928b.f6246b;
        if (!C1928b.m4881l(i, aVar.m4888d())) {
            if (C1928b.m4881l(i, aVar.m4891g())) {
                fM38948i = mfeVar.m38945f();
                fM38942c = mfeVar2.m38946g();
            } else if (C1928b.m4881l(i, aVar.m4892h())) {
                fM38948i2 = mfeVar2.m38948i();
                fM38942c2 = mfeVar.m38942c();
            } else {
                if (!C1928b.m4881l(i, aVar.m4885a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fM38948i = mfeVar.m38948i();
                fM38942c = mfeVar2.m38942c();
            }
            f = fM38948i - fM38942c;
            return Math.max(0.0f, f);
        }
        fM38948i2 = mfeVar2.m38945f();
        fM38942c2 = mfeVar.m38946g();
        f = fM38948i2 - fM38942c2;
        return Math.max(0.0f, f);
    }

    /* renamed from: p */
    public static final float m4958p(mfe mfeVar, int i, mfe mfeVar2) {
        float f;
        float fM38945f;
        float fM38945f2;
        float fM38949j;
        C1928b.a aVar = C1928b.f6246b;
        if (C1928b.m4881l(i, aVar.m4888d()) ? true : C1928b.m4881l(i, aVar.m4891g())) {
            f = 2;
            fM38945f = mfeVar2.m38948i() + (mfeVar2.m38944e() / f);
            fM38945f2 = mfeVar.m38948i();
            fM38949j = mfeVar.m38944e();
        } else {
            if (!(C1928b.m4881l(i, aVar.m4892h()) ? true : C1928b.m4881l(i, aVar.m4885a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = 2;
            fM38945f = mfeVar2.m38945f() + (mfeVar2.m38949j() / f);
            fM38945f2 = mfeVar.m38945f();
            fM38949j = mfeVar.m38949j();
        }
        return fM38945f - (fM38945f2 + (fM38949j / f));
    }

    /* renamed from: q */
    public static final long m4959q(int i, mfe mfeVar, mfe mfeVar2) {
        long jAbs = (long) Math.abs(m4957o(mfeVar2, i, mfeVar));
        long jAbs2 = (long) Math.abs(m4958p(mfeVar2, i, mfeVar));
        return (13 * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* renamed from: r */
    public static final boolean m4960r(C1932f c1932f, C1932f c1932f2, int i, xk7 xk7Var) {
        C1932f c1932fM4952j;
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
        while (fqbVar.m27357r() && (c1932fM4952j = m4952j(fqbVar, AbstractC1934h.m4929d(c1932f2), i)) != null) {
            if (c1932fM4952j.e0().mo4900j()) {
                return ((Boolean) xk7Var.invoke(c1932fM4952j)).booleanValue();
            }
            if (m4954l(c1932fM4952j, c1932f2, i, xk7Var)) {
                return true;
            }
            fqbVar.m27359t(c1932fM4952j);
        }
        return false;
    }

    /* renamed from: s */
    public static final mfe m4961s(mfe mfeVar) {
        return new mfe(mfeVar.m38945f(), mfeVar.m38948i(), mfeVar.m38945f(), mfeVar.m38948i());
    }

    /* renamed from: t */
    public static final Boolean m4962t(C1932f c1932f, int i, xk7 xk7Var) {
        sq8.m48649h(c1932f, "$this$twoDimensionalFocusSearch");
        sq8.m48649h(xk7Var, "onFound");
        h77 h77VarG0 = c1932f.g0();
        int[] iArr = a.f6294a;
        int i2 = iArr[h77VarG0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m4953k(c1932f, i, xk7Var));
            }
            if (i2 == 4) {
                return c1932f.e0().mo4900j() ? (Boolean) xk7Var.invoke(c1932f) : Boolean.FALSE;
            }
            throw new szb();
        }
        C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
        if (c1932fM4931f == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i3 = iArr[c1932fM4931f.g0().ordinal()];
        if (i3 == 1) {
            Boolean boolM4962t = m4962t(c1932fM4931f, i, xk7Var);
            return !sq8.m48644c(boolM4962t, Boolean.FALSE) ? boolM4962t : Boolean.valueOf(m4954l(c1932f, m4944b(c1932fM4931f), i, xk7Var));
        }
        if (i3 == 2 || i3 == 3) {
            return Boolean.valueOf(m4954l(c1932f, c1932fM4931f, i, xk7Var));
        }
        if (i3 != 4) {
            throw new szb();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
