package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C1931e;
import androidx.compose.ui.node.C1939a;
import p001o.alb;
import p001o.h77;
import p001o.kf9;
import p001o.q9c;
import p001o.s67;
import p001o.sgc;
import p001o.sk5;
import p001o.sq8;
import p001o.szb;
import p001o.td4;
import p001o.uk7;
import p001o.xzb;
import p001o.y3i;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1933g {

    /* renamed from: androidx.compose.ui.focus.g$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6284a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6285b;

        static {
            int[] iArr = new int[td4.values().length];
            try {
                iArr[td4.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[td4.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[td4.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[td4.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6284a = iArr;
            int[] iArr2 = new int[h77.values().length];
            try {
                iArr2[h77.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h77.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h77.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f6285b = iArr2;
        }
    }

    /* renamed from: androidx.compose.ui.focus.g$b */
    public static final class b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ C1932f f6286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1932f c1932f) {
            super(0);
            this.f6286a = c1932f;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68690invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68690invoke() {
            this.f6286a.e0();
        }
    }

    /* renamed from: a */
    public static final boolean m4914a(C1932f c1932f, boolean z, boolean z2) {
        C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
        if (c1932fM4931f != null) {
            return m4916c(c1932fM4931f, z, z2);
        }
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m4915b(C1932f c1932f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m4914a(c1932f, z, z2);
    }

    /* renamed from: c */
    public static final boolean m4916c(C1932f c1932f, boolean z, boolean z2) {
        sq8.m48649h(c1932f, "<this>");
        int i = a.f6285b[c1932f.g0().ordinal()];
        if (i == 1) {
            c1932f.j0(h77.Inactive);
            if (z2) {
                s67.m47904c(c1932f);
            }
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                c1932f.j0(h77.Inactive);
                if (!z2) {
                    return z;
                }
                s67.m47904c(c1932f);
                return z;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new szb();
                }
            } else {
                if (!m4914a(c1932f, z, z2)) {
                    return false;
                }
                c1932f.j0(h77.Inactive);
                if (z2) {
                    s67.m47904c(c1932f);
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m4917d(C1932f c1932f) {
        q9c.m45034a(c1932f, new b(c1932f));
        int i = a.f6285b[c1932f.g0().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        c1932f.j0(h77.Active);
        return true;
    }

    /* renamed from: e */
    public static final td4 m4918e(C1932f c1932f, int i) {
        sq8.m48649h(c1932f, "$this$performCustomClearFocus");
        int i2 = a.f6285b[c1932f.g0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return td4.Cancelled;
            }
            if (i2 == 3) {
                C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
                if (c1932fM4931f == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                td4 td4VarM4918e = m4918e(c1932fM4931f, i);
                if (td4VarM4918e == td4.None) {
                    td4VarM4918e = null;
                }
                return td4VarM4918e == null ? m4920g(c1932f, i) : td4VarM4918e;
            }
            if (i2 != 4) {
                throw new szb();
            }
        }
        return td4.None;
    }

    /* renamed from: f */
    public static final td4 m4919f(C1932f c1932f, int i) {
        if (!c1932f.f6279M) {
            c1932f.f6279M = true;
            try {
                C1931e c1931e = (C1931e) c1932f.e0().mo4899i().invoke(C1928b.m4878i(i));
                C1931e.a aVar = C1931e.f6273b;
                if (c1931e != aVar.m4910b()) {
                    if (c1931e == aVar.m4909a()) {
                        return td4.Cancelled;
                    }
                    return c1931e.m4908c() ? td4.Redirected : td4.RedirectCancelled;
                }
            } finally {
                c1932f.f6279M = false;
            }
        }
        return td4.None;
    }

    /* renamed from: g */
    public static final td4 m4920g(C1932f c1932f, int i) {
        if (!c1932f.f6278L) {
            c1932f.f6278L = true;
            try {
                C1931e c1931e = (C1931e) c1932f.e0().mo4896f().invoke(C1928b.m4878i(i));
                C1931e.a aVar = C1931e.f6273b;
                if (c1931e != aVar.m4910b()) {
                    if (c1931e == aVar.m4909a()) {
                        return td4.Cancelled;
                    }
                    return c1931e.m4908c() ? td4.Redirected : td4.RedirectCancelled;
                }
            } finally {
                c1932f.f6278L = false;
            }
        }
        return td4.None;
    }

    /* renamed from: h */
    public static final td4 m4921h(C1932f c1932f, int i) {
        alb.AbstractC12216c abstractC12216cM48434f;
        C1939a c1939aM59428U;
        sq8.m48649h(c1932f, "$this$performCustomRequestFocus");
        int i2 = a.f6285b[c1932f.g0().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return td4.None;
        }
        if (i2 == 3) {
            C1932f c1932fM4931f = AbstractC1934h.m4931f(c1932f);
            if (c1932fM4931f != null) {
                return m4918e(c1932fM4931f, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (i2 != 4) {
            throw new szb();
        }
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
        if (c1932f2 == null) {
            return td4.None;
        }
        int i3 = a.f6285b[c1932f2.g0().ordinal()];
        if (i3 == 1) {
            return m4919f(c1932f2, i);
        }
        if (i3 == 2) {
            return td4.Cancelled;
        }
        if (i3 == 3) {
            return m4921h(c1932f2, i);
        }
        if (i3 != 4) {
            throw new szb();
        }
        td4 td4VarM4921h = m4921h(c1932f2, i);
        td4 td4Var = td4VarM4921h == td4.None ? null : td4VarM4921h;
        return td4Var == null ? m4919f(c1932f2, i) : td4Var;
    }

    /* renamed from: i */
    public static final boolean m4922i(C1932f c1932f) {
        boolean z;
        C1939a c1939aM59428U;
        sq8.m48649h(c1932f, "<this>");
        int i = a.f6285b[c1932f.g0().ordinal()];
        if (i == 1 || i == 2) {
            s67.m47904c(c1932f);
            return true;
        }
        alb.AbstractC12216c abstractC12216c = null;
        if (i == 3) {
            z = m4915b(c1932f, false, false, 3, null) && m4917d(c1932f);
            if (!z) {
                return z;
            }
            s67.m47904c(c1932f);
            return z;
        }
        if (i != 4) {
            throw new szb();
        }
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = c1932f.mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f);
        loop0: while (true) {
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
        C1932f c1932f2 = (C1932f) abstractC12216c;
        if (c1932f2 != null) {
            return m4924k(c1932f2, c1932f);
        }
        z = m4925l(c1932f) && m4917d(c1932f);
        if (!z) {
            return z;
        }
        s67.m47904c(c1932f);
        return z;
    }

    /* renamed from: j */
    public static final boolean m4923j(C1932f c1932f) {
        sq8.m48649h(c1932f, "<this>");
        int i = a.f6284a[m4921h(c1932f, C1928b.f6246b.m4886b()).ordinal()];
        if (i == 1) {
            return m4922i(c1932f);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new szb();
    }

    /* renamed from: k */
    public static final boolean m4924k(C1932f c1932f, C1932f c1932f2) {
        alb.AbstractC12216c abstractC12216c;
        alb.AbstractC12216c abstractC12216cM48434f;
        C1939a c1939aM59428U;
        C1939a c1939aM59428U2;
        int iM60153a = zzb.m60153a(1024);
        if (!c1932f2.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = c1932f2.mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(c1932f2);
        loop0: while (true) {
            abstractC12216c = null;
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
            abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U2 = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U2.m4991o();
        }
        if (!sq8.m48644c(abstractC12216cM48434f, c1932f)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i = a.f6285b[c1932f.g0().ordinal()];
        if (i == 1) {
            boolean zM4917d = m4917d(c1932f2);
            if (!zM4917d) {
                return zM4917d;
            }
            c1932f.j0(h77.ActiveParent);
            s67.m47904c(c1932f2);
            s67.m47904c(c1932f);
            return zM4917d;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            if (AbstractC1934h.m4931f(c1932f) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            boolean z = m4915b(c1932f, false, false, 3, null) && m4917d(c1932f2);
            if (z) {
                s67.m47904c(c1932f2);
            }
            return z;
        }
        if (i != 4) {
            throw new szb();
        }
        int iM60153a2 = zzb.m60153a(1024);
        if (!c1932f.mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G2 = c1932f.mo17377h().m17358G();
        zh9 zh9VarM48436h2 = sk5.m48436h(c1932f);
        loop3: while (true) {
            if (zh9VarM48436h2 == null) {
                break;
            }
            if ((zh9VarM48436h2.m59428U().m4987k().m17352A() & iM60153a2) != 0) {
                while (abstractC12216cM17358G2 != null) {
                    if ((abstractC12216cM17358G2.m17356E() & iM60153a2) != 0) {
                        for (alb.AbstractC12216c abstractC12216cM48434f2 = abstractC12216cM17358G2; abstractC12216cM48434f2 != null; abstractC12216cM48434f2 = sk5.m48434f(null)) {
                            if (abstractC12216cM48434f2 instanceof C1932f) {
                                abstractC12216c = abstractC12216cM48434f2;
                                break loop3;
                            }
                            if ((abstractC12216cM48434f2.m17356E() & iM60153a2) != 0) {
                            }
                        }
                    }
                    abstractC12216cM17358G2 = abstractC12216cM17358G2.m17358G();
                }
            }
            zh9VarM48436h2 = zh9VarM48436h2.m59431X();
            abstractC12216cM17358G2 = (zh9VarM48436h2 == null || (c1939aM59428U = zh9VarM48436h2.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
        C1932f c1932f3 = (C1932f) abstractC12216c;
        if (c1932f3 == null && m4925l(c1932f)) {
            c1932f.j0(h77.Active);
            s67.m47904c(c1932f);
            return m4924k(c1932f, c1932f2);
        }
        if (c1932f3 == null || !m4924k(c1932f3, c1932f)) {
            return false;
        }
        boolean zM4924k = m4924k(c1932f, c1932f2);
        if (c1932f.g0() == h77.ActiveParent) {
            return zM4924k;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public static final boolean m4925l(C1932f c1932f) {
        zh9 zh9VarA0;
        sgc sgcVarM59430W;
        xzb xzbVarM17354C = c1932f.m17354C();
        if (xzbVarM17354C == null || (zh9VarA0 = xzbVarM17354C.a0()) == null || (sgcVarM59430W = zh9VarA0.m59430W()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return sgcVarM59430W.requestFocus();
    }
}
