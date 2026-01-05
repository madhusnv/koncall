package androidx.compose.ui.node;

import p001o.a0c;
import p001o.alb;
import p001o.at5;
import p001o.bjg;
import p001o.brb;
import p001o.cj8;
import p001o.fqb;
import p001o.ilb;
import p001o.na1;
import p001o.sk5;
import p001o.sq8;
import p001o.uh9;
import p001o.vh9;
import p001o.xzb;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.node.a */
/* loaded from: classes2.dex */
public final class C1939a {

    /* renamed from: a */
    public final zh9 f6303a;

    /* renamed from: b */
    public final cj8 f6304b;

    /* renamed from: c */
    public xzb f6305c;

    /* renamed from: d */
    public final alb.AbstractC12216c f6306d;

    /* renamed from: e */
    public alb.AbstractC12216c f6307e;

    /* renamed from: f */
    public fqb f6308f;

    /* renamed from: g */
    public fqb f6309g;

    /* renamed from: h */
    public a f6310h;

    /* renamed from: androidx.compose.ui.node.a$a */
    public final class a implements at5 {

        /* renamed from: a */
        public alb.AbstractC12216c f6311a;

        /* renamed from: b */
        public int f6312b;

        /* renamed from: c */
        public fqb f6313c;

        /* renamed from: d */
        public fqb f6314d;

        /* renamed from: e */
        public boolean f6315e;

        /* renamed from: f */
        public final /* synthetic */ C1939a f6316f;

        public a(C1939a c1939a, alb.AbstractC12216c abstractC12216c, int i, fqb fqbVar, fqb fqbVar2, boolean z) {
            sq8.m48649h(abstractC12216c, "node");
            sq8.m48649h(fqbVar, "before");
            sq8.m48649h(fqbVar2, "after");
            this.f6316f = c1939a;
            this.f6311a = abstractC12216c;
            this.f6312b = i;
            this.f6313c = fqbVar;
            this.f6314d = fqbVar2;
            this.f6315e = z;
        }

        @Override // p001o.at5
        /* renamed from: a */
        public void mo5003a(int i, int i2) {
            alb.AbstractC12216c abstractC12216cM17353B = this.f6311a.m17353B();
            sq8.m48646e(abstractC12216cM17353B);
            C1939a.m4974d(this.f6316f);
            if ((zzb.m60153a(2) & abstractC12216cM17353B.m17356E()) != 0) {
                xzb xzbVarM17354C = abstractC12216cM17353B.m17354C();
                sq8.m48646e(xzbVarM17354C);
                xzb xzbVarR0 = xzbVarM17354C.R0();
                xzb xzbVarQ0 = xzbVarM17354C.Q0();
                sq8.m48646e(xzbVarQ0);
                if (xzbVarR0 != null) {
                    xzbVarR0.t1(xzbVarQ0);
                }
                xzbVarQ0.u1(xzbVarR0);
                this.f6316f.m4998v(this.f6311a, xzbVarQ0);
            }
            this.f6311a = this.f6316f.m4984h(abstractC12216cM17353B);
        }

        @Override // p001o.at5
        /* renamed from: b */
        public boolean mo5004b(int i, int i2) {
            return AbstractC1940b.m5015d((alb.InterfaceC12215b) this.f6313c.m27353n()[this.f6312b + i], (alb.InterfaceC12215b) this.f6314d.m27353n()[this.f6312b + i2]) != 0;
        }

        @Override // p001o.at5
        /* renamed from: c */
        public void mo5005c(int i) {
            int i2 = this.f6312b + i;
            this.f6311a = this.f6316f.m4983g((alb.InterfaceC12215b) this.f6314d.m27353n()[i2], this.f6311a);
            C1939a.m4974d(this.f6316f);
            if (!this.f6315e) {
                this.f6311a.m17371U(true);
                return;
            }
            alb.AbstractC12216c abstractC12216cM17353B = this.f6311a.m17353B();
            sq8.m48646e(abstractC12216cM17353B);
            xzb xzbVarM17354C = abstractC12216cM17353B.m17354C();
            sq8.m48646e(xzbVarM17354C);
            uh9 uh9VarM48432d = sk5.m48432d(this.f6311a);
            if (uh9VarM48432d != null) {
                vh9 vh9Var = new vh9(this.f6316f.m4989m(), uh9VarM48432d);
                this.f6311a.m17376Z(vh9Var);
                this.f6316f.m4998v(this.f6311a, vh9Var);
                vh9Var.u1(xzbVarM17354C.R0());
                vh9Var.t1(xzbVarM17354C);
                xzbVarM17354C.u1(vh9Var);
            } else {
                this.f6311a.m17376Z(xzbVarM17354C);
            }
            this.f6311a.m17362K();
            this.f6311a.m17367Q();
            a0c.m16298a(this.f6311a);
        }

        @Override // p001o.at5
        /* renamed from: d */
        public void mo5006d(int i, int i2) {
            alb.AbstractC12216c abstractC12216cM17353B = this.f6311a.m17353B();
            sq8.m48646e(abstractC12216cM17353B);
            this.f6311a = abstractC12216cM17353B;
            fqb fqbVar = this.f6313c;
            alb.InterfaceC12215b interfaceC12215b = (alb.InterfaceC12215b) fqbVar.m27353n()[this.f6312b + i];
            fqb fqbVar2 = this.f6314d;
            alb.InterfaceC12215b interfaceC12215b2 = (alb.InterfaceC12215b) fqbVar2.m27353n()[this.f6312b + i2];
            if (sq8.m48644c(interfaceC12215b, interfaceC12215b2)) {
                C1939a.m4974d(this.f6316f);
            } else {
                this.f6316f.m4982F(interfaceC12215b, interfaceC12215b2, this.f6311a);
                C1939a.m4974d(this.f6316f);
            }
        }

        /* renamed from: e */
        public final void m5007e(fqb fqbVar) {
            sq8.m48649h(fqbVar, "<set-?>");
            this.f6314d = fqbVar;
        }

        /* renamed from: f */
        public final void m5008f(fqb fqbVar) {
            sq8.m48649h(fqbVar, "<set-?>");
            this.f6313c = fqbVar;
        }

        /* renamed from: g */
        public final void m5009g(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "<set-?>");
            this.f6311a = abstractC12216c;
        }

        /* renamed from: h */
        public final void m5010h(int i) {
            this.f6312b = i;
        }

        /* renamed from: i */
        public final void m5011i(boolean z) {
            this.f6315e = z;
        }
    }

    /* renamed from: androidx.compose.ui.node.a$b */
    public interface b {
    }

    public C1939a(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.f6303a = zh9Var;
        cj8 cj8Var = new cj8(zh9Var);
        this.f6304b = cj8Var;
        this.f6305c = cj8Var;
        bjg bjgVarF1 = cj8Var.P0();
        this.f6306d = bjgVarF1;
        this.f6307e = bjgVarF1;
    }

    /* renamed from: d */
    public static final /* synthetic */ b m4974d(C1939a c1939a) {
        c1939a.getClass();
        return null;
    }

    /* renamed from: A */
    public final void m4977A(int i, fqb fqbVar, fqb fqbVar2, alb.AbstractC12216c abstractC12216c, boolean z) {
        brb.m19656e(fqbVar.m27354o() - i, fqbVar2.m27354o() - i, m4986j(abstractC12216c, i, fqbVar, fqbVar2, z));
        m4978B();
    }

    /* renamed from: B */
    public final void m4978B() {
        int iM17356E = 0;
        for (alb.AbstractC12216c abstractC12216cM17358G = this.f6306d.m17358G(); abstractC12216cM17358G != null && abstractC12216cM17358G != AbstractC1940b.f6317a; abstractC12216cM17358G = abstractC12216cM17358G.m17358G()) {
            iM17356E |= abstractC12216cM17358G.m17356E();
            abstractC12216cM17358G.m17369S(iM17356E);
        }
    }

    /* renamed from: C */
    public final void m4979C() {
        xzb vh9Var;
        xzb xzbVar = this.f6304b;
        for (alb.AbstractC12216c abstractC12216cM17358G = this.f6306d.m17358G(); abstractC12216cM17358G != null; abstractC12216cM17358G = abstractC12216cM17358G.m17358G()) {
            uh9 uh9VarM48432d = sk5.m48432d(abstractC12216cM17358G);
            if (uh9VarM48432d != null) {
                if (abstractC12216cM17358G.m17354C() != null) {
                    xzb xzbVarM17354C = abstractC12216cM17358G.m17354C();
                    sq8.m48647f(xzbVarM17354C, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    vh9Var = (vh9) xzbVarM17354C;
                    uh9 uh9VarG1 = vh9Var.G1();
                    vh9Var.I1(uh9VarM48432d);
                    if (uh9VarG1 != abstractC12216cM17358G) {
                        vh9Var.g1();
                    }
                } else {
                    vh9Var = new vh9(this.f6303a, uh9VarM48432d);
                    abstractC12216cM17358G.m17376Z(vh9Var);
                }
                xzbVar.u1(vh9Var);
                vh9Var.t1(xzbVar);
                xzbVar = vh9Var;
            } else {
                abstractC12216cM17358G.m17376Z(xzbVar);
            }
        }
        zh9 zh9VarM59431X = this.f6303a.m59431X();
        xzbVar.u1(zh9VarM59431X != null ? zh9VarM59431X.m59410C() : null);
        this.f6305c = xzbVar;
    }

    /* renamed from: D */
    public final alb.AbstractC12216c m4980D(alb.AbstractC12216c abstractC12216c) {
        if (!(abstractC12216c == AbstractC1940b.f6317a)) {
            throw new IllegalStateException("trimChain called on already trimmed chain".toString());
        }
        alb.AbstractC12216c abstractC12216cM17353B = AbstractC1940b.f6317a.m17353B();
        if (abstractC12216cM17353B == null) {
            abstractC12216cM17353B = this.f6306d;
        }
        abstractC12216cM17353B.m17374X(null);
        AbstractC1940b.f6317a.m17370T(null);
        AbstractC1940b.f6317a.m17369S(-1);
        AbstractC1940b.f6317a.m17376Z(null);
        if (abstractC12216cM17353B != AbstractC1940b.f6317a) {
            return abstractC12216cM17353B;
        }
        throw new IllegalStateException("trimChain did not update the head".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r3 >= r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r6 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        m4977A(r3, r7, r13, r6, r12.f6303a.s0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4981E(alb albVar) {
        sq8.m48649h(albVar, "m");
        alb.AbstractC12216c abstractC12216cM4997u = m4997u();
        fqb fqbVar = this.f6308f;
        int i = 0;
        int iM27354o = fqbVar != null ? fqbVar.m27354o() : 0;
        fqb fqbVar2 = this.f6309g;
        if (fqbVar2 == null) {
            fqbVar2 = new fqb(new alb.InterfaceC12215b[16], 0);
        }
        fqb fqbVarM5016e = AbstractC1940b.m5016e(albVar, fqbVar2);
        fqb fqbVar3 = null;
        if (fqbVarM5016e.m27354o() == iM27354o) {
            alb.AbstractC12216c abstractC12216cM17353B = abstractC12216cM4997u.m17353B();
            int i2 = 0;
            while (true) {
                if (abstractC12216cM17353B == null || i2 >= iM27354o) {
                    break;
                }
                if (fqbVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                alb.InterfaceC12215b interfaceC12215b = (alb.InterfaceC12215b) fqbVar.m27353n()[i2];
                alb.InterfaceC12215b interfaceC12215b2 = (alb.InterfaceC12215b) fqbVarM5016e.m27353n()[i2];
                int iM5015d = AbstractC1940b.m5015d(interfaceC12215b, interfaceC12215b2);
                if (iM5015d == 0) {
                    abstractC12216cM17353B = abstractC12216cM17353B.m17358G();
                    break;
                }
                if (iM5015d == 1) {
                    m4982F(interfaceC12215b, interfaceC12215b2, abstractC12216cM17353B);
                }
                abstractC12216cM17353B = abstractC12216cM17353B.m17353B();
                i2++;
            }
        } else {
            if (!this.f6303a.s0() && iM27354o == 0) {
                alb.AbstractC12216c abstractC12216cM4983g = abstractC12216cM4997u;
                while (i < fqbVarM5016e.m27354o()) {
                    abstractC12216cM4983g = m4983g((alb.InterfaceC12215b) fqbVarM5016e.m27353n()[i], abstractC12216cM4983g);
                    i++;
                }
                m4978B();
            } else if (fqbVarM5016e.m27354o() != 0) {
                if (fqbVar == null) {
                    fqbVar = new fqb(new alb.InterfaceC12215b[16], 0);
                }
                m4977A(0, fqbVar, fqbVarM5016e, abstractC12216cM4997u, this.f6303a.s0());
            } else {
                if (fqbVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                alb.AbstractC12216c abstractC12216cM17353B2 = abstractC12216cM4997u.m17353B();
                for (int i3 = 0; abstractC12216cM17353B2 != null && i3 < fqbVar.m27354o(); i3++) {
                    abstractC12216cM17353B2 = m4984h(abstractC12216cM17353B2).m17353B();
                }
                cj8 cj8Var = this.f6304b;
                zh9 zh9VarM59431X = this.f6303a.m59431X();
                cj8Var.u1(zh9VarM59431X != null ? zh9VarM59431X.m59410C() : null);
                this.f6305c = this.f6304b;
            }
            i = 1;
        }
        this.f6308f = fqbVarM5016e;
        if (fqbVar != null) {
            fqbVar.m27349i();
            fqbVar3 = fqbVar;
        }
        this.f6309g = fqbVar3;
        this.f6307e = m4980D(abstractC12216cM4997u);
        if (i != 0) {
            m4979C();
        }
    }

    /* renamed from: F */
    public final void m4982F(alb.InterfaceC12215b interfaceC12215b, alb.InterfaceC12215b interfaceC12215b2, alb.AbstractC12216c abstractC12216c) {
        if ((interfaceC12215b instanceof ilb) && (interfaceC12215b2 instanceof ilb)) {
            AbstractC1940b.m5017f((ilb) interfaceC12215b2, abstractC12216c);
            if (abstractC12216c.m17361J()) {
                a0c.m16302e(abstractC12216c);
                return;
            } else {
                abstractC12216c.m17375Y(true);
                return;
            }
        }
        if (!(abstractC12216c instanceof na1)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        ((na1) abstractC12216c).d0(interfaceC12215b2);
        if (abstractC12216c.m17361J()) {
            a0c.m16302e(abstractC12216c);
        } else {
            abstractC12216c.m17375Y(true);
        }
    }

    /* renamed from: g */
    public final alb.AbstractC12216c m4983g(alb.InterfaceC12215b interfaceC12215b, alb.AbstractC12216c abstractC12216c) {
        alb.AbstractC12216c na1Var;
        if (interfaceC12215b instanceof ilb) {
            na1Var = ((ilb) interfaceC12215b).mo4865d();
            na1Var.m17372V(a0c.m16305h(na1Var));
        } else {
            na1Var = new na1(interfaceC12215b);
        }
        if (!(!na1Var.m17361J())) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        na1Var.m17371U(true);
        return m4994r(na1Var, abstractC12216c);
    }

    /* renamed from: h */
    public final alb.AbstractC12216c m4984h(alb.AbstractC12216c abstractC12216c) {
        if (abstractC12216c.m17361J()) {
            a0c.m16301d(abstractC12216c);
            abstractC12216c.m17368R();
            abstractC12216c.m17363L();
        }
        return m4999w(abstractC12216c);
    }

    /* renamed from: i */
    public final int m4985i() {
        return this.f6307e.m17352A();
    }

    /* renamed from: j */
    public final a m4986j(alb.AbstractC12216c abstractC12216c, int i, fqb fqbVar, fqb fqbVar2, boolean z) {
        a aVar = this.f6310h;
        if (aVar == null) {
            a aVar2 = new a(this, abstractC12216c, i, fqbVar, fqbVar2, z);
            this.f6310h = aVar2;
            return aVar2;
        }
        aVar.m5009g(abstractC12216c);
        aVar.m5010h(i);
        aVar.m5008f(fqbVar);
        aVar.m5007e(fqbVar2);
        aVar.m5011i(z);
        return aVar;
    }

    /* renamed from: k */
    public final alb.AbstractC12216c m4987k() {
        return this.f6307e;
    }

    /* renamed from: l */
    public final cj8 m4988l() {
        return this.f6304b;
    }

    /* renamed from: m */
    public final zh9 m4989m() {
        return this.f6303a;
    }

    /* renamed from: n */
    public final xzb m4990n() {
        return this.f6305c;
    }

    /* renamed from: o */
    public final alb.AbstractC12216c m4991o() {
        return this.f6306d;
    }

    /* renamed from: p */
    public final boolean m4992p(int i) {
        return (i & m4985i()) != 0;
    }

    /* renamed from: q */
    public final boolean m4993q(int i) {
        return (i & m4985i()) != 0;
    }

    /* renamed from: r */
    public final alb.AbstractC12216c m4994r(alb.AbstractC12216c abstractC12216c, alb.AbstractC12216c abstractC12216c2) {
        alb.AbstractC12216c abstractC12216cM17353B = abstractC12216c2.m17353B();
        if (abstractC12216cM17353B != null) {
            abstractC12216cM17353B.m17374X(abstractC12216c);
            abstractC12216c.m17370T(abstractC12216cM17353B);
        }
        abstractC12216c2.m17370T(abstractC12216c);
        abstractC12216c.m17374X(abstractC12216c2);
        return abstractC12216c;
    }

    /* renamed from: s */
    public final void m4995s() {
        for (alb.AbstractC12216c abstractC12216cM4987k = m4987k(); abstractC12216cM4987k != null; abstractC12216cM4987k = abstractC12216cM4987k.m17353B()) {
            abstractC12216cM4987k.m17362K();
        }
    }

    /* renamed from: t */
    public final void m4996t() {
        for (alb.AbstractC12216c abstractC12216cM4991o = m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
            if (abstractC12216cM4991o.m17361J()) {
                abstractC12216cM4991o.m17363L();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f6307e == this.f6306d) {
            sb.append("]");
        } else {
            alb.AbstractC12216c abstractC12216cM4987k = m4987k();
            while (true) {
                if (abstractC12216cM4987k == null || abstractC12216cM4987k == m4991o()) {
                    break;
                }
                sb.append(String.valueOf(abstractC12216cM4987k));
                if (abstractC12216cM4987k.m17353B() == this.f6306d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC12216cM4987k = abstractC12216cM4987k.m17353B();
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: u */
    public final alb.AbstractC12216c m4997u() {
        if (!(this.f6307e != AbstractC1940b.f6317a)) {
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        alb.AbstractC12216c abstractC12216c = this.f6307e;
        abstractC12216c.m17374X(AbstractC1940b.f6317a);
        AbstractC1940b.f6317a.m17370T(abstractC12216c);
        return AbstractC1940b.f6317a;
    }

    /* renamed from: v */
    public final void m4998v(alb.AbstractC12216c abstractC12216c, xzb xzbVar) {
        for (alb.AbstractC12216c abstractC12216cM17358G = abstractC12216c.m17358G(); abstractC12216cM17358G != null; abstractC12216cM17358G = abstractC12216cM17358G.m17358G()) {
            if (abstractC12216cM17358G == AbstractC1940b.f6317a) {
                zh9 zh9VarM59431X = this.f6303a.m59431X();
                xzbVar.u1(zh9VarM59431X != null ? zh9VarM59431X.m59410C() : null);
                this.f6305c = xzbVar;
                return;
            } else {
                if ((zzb.m60153a(2) & abstractC12216cM17358G.m17356E()) != 0) {
                    return;
                }
                abstractC12216cM17358G.m17376Z(xzbVar);
            }
        }
    }

    /* renamed from: w */
    public final alb.AbstractC12216c m4999w(alb.AbstractC12216c abstractC12216c) {
        alb.AbstractC12216c abstractC12216cM17353B = abstractC12216c.m17353B();
        alb.AbstractC12216c abstractC12216cM17358G = abstractC12216c.m17358G();
        if (abstractC12216cM17353B != null) {
            abstractC12216cM17353B.m17374X(abstractC12216cM17358G);
            abstractC12216c.m17370T(null);
        }
        if (abstractC12216cM17358G != null) {
            abstractC12216cM17358G.m17370T(abstractC12216cM17353B);
            abstractC12216c.m17374X(null);
        }
        sq8.m48646e(abstractC12216cM17358G);
        return abstractC12216cM17358G;
    }

    /* renamed from: x */
    public final void m5000x() {
        int iM27354o;
        for (alb.AbstractC12216c abstractC12216cM4991o = m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
            if (abstractC12216cM4991o.m17361J()) {
                abstractC12216cM4991o.m17366P();
            }
        }
        fqb fqbVar = this.f6308f;
        if (fqbVar != null && (iM27354o = fqbVar.m27354o()) > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i = 0;
            do {
                i++;
            } while (i < iM27354o);
        }
        m5002z();
        m4996t();
    }

    /* renamed from: y */
    public final void m5001y() {
        for (alb.AbstractC12216c abstractC12216cM4987k = m4987k(); abstractC12216cM4987k != null; abstractC12216cM4987k = abstractC12216cM4987k.m17353B()) {
            abstractC12216cM4987k.m17367Q();
            if (abstractC12216cM4987k.m17355D()) {
                a0c.m16298a(abstractC12216cM4987k);
            }
            if (abstractC12216cM4987k.m17360I()) {
                a0c.m16302e(abstractC12216cM4987k);
            }
            abstractC12216cM4987k.m17371U(false);
            abstractC12216cM4987k.m17375Y(false);
        }
    }

    /* renamed from: z */
    public final void m5002z() {
        for (alb.AbstractC12216c abstractC12216cM4991o = m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
            if (abstractC12216cM4991o.m17361J()) {
                abstractC12216cM4991o.m17368R();
            }
        }
    }
}
