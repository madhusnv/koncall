package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.un3;

/* loaded from: classes2.dex */
public final class gwf {

    /* renamed from: v */
    public static final C13828a f25867v = new C13828a(null);

    /* renamed from: a */
    public final dwf f25868a;

    /* renamed from: b */
    public int[] f25869b;

    /* renamed from: c */
    public Object[] f25870c;

    /* renamed from: d */
    public ArrayList f25871d;

    /* renamed from: e */
    public int f25872e;

    /* renamed from: f */
    public int f25873f;

    /* renamed from: g */
    public int f25874g;

    /* renamed from: h */
    public int f25875h;

    /* renamed from: i */
    public int f25876i;

    /* renamed from: j */
    public int f25877j;

    /* renamed from: k */
    public int f25878k;

    /* renamed from: l */
    public int f25879l;

    /* renamed from: m */
    public int f25880m;

    /* renamed from: n */
    public int f25881n;

    /* renamed from: o */
    public final pl8 f25882o;

    /* renamed from: p */
    public final pl8 f25883p;

    /* renamed from: q */
    public final pl8 f25884q;

    /* renamed from: r */
    public int f25885r;

    /* renamed from: s */
    public int f25886s;

    /* renamed from: t */
    public boolean f25887t;

    /* renamed from: u */
    public jid f25888u;

    /* renamed from: o.gwf$a */
    public static final class C13828a {
        public C13828a() {
        }

        public /* synthetic */ C13828a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ List m29606c(C13828a c13828a, gwf gwfVar, int i, gwf gwfVar2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return c13828a.m29607b(gwfVar, i, gwfVar2, z, z2, z3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final List m29607b(gwf gwfVar, int i, gwf gwfVar2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            List listM21246k;
            int i2;
            int iD0 = gwfVar.d0(i);
            int i3 = i + iD0;
            int iM29588K = gwfVar.m29588K(i);
            int iM29588K2 = gwfVar.m29588K(i3);
            int i4 = iM29588K2 - iM29588K;
            boolean zM29585H = gwfVar.m29585H(i);
            gwfVar2.i0(iD0);
            gwfVar2.j0(i4, gwfVar2.m29599V());
            if (gwfVar.f25872e < i3) {
                gwfVar.r0(i3);
            }
            if (gwfVar.f25877j < iM29588K2) {
                gwfVar.t0(iM29588K2, i3);
            }
            int[] iArr = gwfVar2.f25869b;
            int iM29599V = gwfVar2.m29599V();
            fp0.m27258g(gwfVar.f25869b, iArr, iM29599V * 5, i * 5, i3 * 5);
            Object[] objArr = gwfVar2.f25870c;
            int i5 = gwfVar2.f25875h;
            fp0.m27260i(gwfVar.f25870c, objArr, i5, iM29588K, iM29588K2);
            int iM29600W = gwfVar2.m29600W();
            fwf.m27633Z(iArr, iM29599V, iM29600W);
            int i6 = iM29599V - i;
            int i7 = iM29599V + iD0;
            int iM29589L = i5 - gwfVar2.m29589L(iArr, iM29599V);
            int i8 = gwfVar2.f25879l;
            int i9 = gwfVar2.f25878k;
            int length = objArr.length;
            int i10 = i8;
            int i11 = iM29599V;
            while (true) {
                z4 = 0;
                if (i11 >= i7) {
                    break;
                }
                if (i11 != iM29599V) {
                    i2 = i7;
                    fwf.m27633Z(iArr, i11, fwf.m27625R(iArr, i11) + i6);
                } else {
                    i2 = i7;
                }
                int i12 = iM29589L;
                fwf.m27629V(iArr, i11, gwfVar2.m29591N(gwfVar2.m29589L(iArr, i11) + iM29589L, i10 >= i11 ? gwfVar2.f25877j : 0, i9, length));
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                iM29589L = i12;
                i7 = i2;
            }
            int i13 = i7;
            gwfVar2.f25879l = i10;
            int iM27621N = fwf.m27621N(gwfVar.f25871d, i, gwfVar.m29601X());
            int iM27621N2 = fwf.m27621N(gwfVar.f25871d, i3, gwfVar.m29601X());
            if (iM27621N < iM27621N2) {
                ArrayList arrayList = gwfVar.f25871d;
                ArrayList arrayList2 = new ArrayList(iM27621N2 - iM27621N);
                for (int i14 = iM27621N; i14 < iM27621N2; i14++) {
                    Object obj = arrayList.get(i14);
                    sq8.m48648g(obj, "sourceAnchors[anchorIndex]");
                    sc0 sc0Var = (sc0) obj;
                    sc0Var.m48146c(sc0Var.m48144a() + i6);
                    arrayList2.add(sc0Var);
                }
                gwfVar2.f25871d.addAll(fwf.m27621N(gwfVar2.f25871d, gwfVar2.m29599V(), gwfVar2.m29601X()), arrayList2);
                arrayList.subList(iM27621N, iM27621N2).clear();
                listM21246k = arrayList2;
            } else {
                listM21246k = ch3.m21246k();
            }
            int iX0 = gwfVar.x0(i);
            if (z3) {
                if (z) {
                    boolean z5 = iX0 >= 0;
                    if (z5) {
                        gwfVar.S0();
                        gwfVar.m29604z(iX0 - gwfVar.m29599V());
                        gwfVar.S0();
                    }
                    gwfVar.m29604z(i - gwfVar.m29599V());
                    boolean zD0 = gwfVar.D0();
                    if (z5) {
                        gwfVar.N0();
                        gwfVar.m29592O();
                        gwfVar.N0();
                        gwfVar.m29592O();
                    }
                    z4 = zD0;
                } else {
                    boolean zE0 = gwfVar.E0(i, iD0);
                    gwfVar.F0(iM29588K, i4, i - 1);
                    z4 = zE0;
                }
            }
            if ((!z4) == 0) {
                go3.m29222v("Unexpectedly removed anchors".toString());
                throw new qe9();
            }
            gwfVar2.f25881n += fwf.m27619L(iArr, iM29599V) ? 1 : fwf.m27622O(iArr, iM29599V);
            if (z2) {
                gwfVar2.f25885r = i13;
                gwfVar2.f25875h = i5 + i4;
            }
            if (zM29585H) {
                gwfVar2.Z0(iM29600W);
            }
            return listM21246k;
        }
    }

    /* renamed from: o.gwf$b */
    public static final class C13829b implements Iterator, sb9 {

        /* renamed from: a */
        public int f25889a;

        /* renamed from: b */
        public final /* synthetic */ int f25890b;

        /* renamed from: c */
        public final /* synthetic */ gwf f25891c;

        public C13829b(int i, int i2, gwf gwfVar) {
            this.f25890b = i2;
            this.f25891c = gwfVar;
            this.f25889a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25889a < this.f25890b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f25891c.f25870c;
            gwf gwfVar = this.f25891c;
            int i = this.f25889a;
            this.f25889a = i + 1;
            return objArr[gwfVar.m29590M(i)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public gwf(dwf dwfVar) {
        sq8.m48649h(dwfVar, "table");
        this.f25868a = dwfVar;
        this.f25869b = dwfVar.m23910p();
        this.f25870c = dwfVar.m23912v();
        this.f25871d = dwfVar.m23909o();
        this.f25872e = dwfVar.m23911r();
        this.f25873f = (this.f25869b.length / 5) - dwfVar.m23911r();
        this.f25874g = dwfVar.m23911r();
        this.f25877j = dwfVar.m23913w();
        this.f25878k = this.f25870c.length - dwfVar.m23913w();
        this.f25879l = dwfVar.m23911r();
        this.f25882o = new pl8();
        this.f25883p = new pl8();
        this.f25884q = new pl8();
        this.f25886s = -1;
    }

    public static /* synthetic */ void n0(gwf gwfVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gwfVar.f25886s;
        }
        gwfVar.m0(i);
    }

    /* renamed from: A */
    public final sc0 m29578A(int i) {
        ArrayList arrayList = this.f25871d;
        int iM27626S = fwf.m27626S(arrayList, i, m29601X());
        if (iM27626S >= 0) {
            Object obj = arrayList.get(iM27626S);
            sq8.m48648g(obj, "get(location)");
            return (sc0) obj;
        }
        if (i > this.f25872e) {
            i = -(m29601X() - i);
        }
        sc0 sc0Var = new sc0(i);
        arrayList.add(-(iM27626S + 1), sc0Var);
        return sc0Var;
    }

    public final int A0(int i, int i2) {
        return i < i2 ? i : -((m29601X() - i) + 2);
    }

    /* renamed from: B */
    public final int m29579B(sc0 sc0Var) {
        sq8.m48649h(sc0Var, "anchor");
        int iM48144a = sc0Var.m48144a();
        return iM48144a < 0 ? iM48144a + m29601X() : iM48144a;
    }

    public final void B0() {
        jid jidVar = this.f25888u;
        if (jidVar != null) {
            while (jidVar.m33864b()) {
                a1(jidVar.m33866d(), jidVar);
            }
        }
    }

    /* renamed from: C */
    public final int m29580C(int[] iArr, int i) {
        return m29589L(iArr, i) + fwf.m27611D(fwf.m27613F(iArr, i) >> 29);
    }

    public final boolean C0(int i, int i2) {
        int i3 = i2 + i;
        int iM27621N = fwf.m27621N(this.f25871d, i3, m29597T() - this.f25873f);
        if (iM27621N >= this.f25871d.size()) {
            iM27621N--;
        }
        int i4 = iM27621N + 1;
        int i5 = 0;
        while (iM27621N >= 0) {
            Object obj = this.f25871d.get(iM27621N);
            sq8.m48648g(obj, "anchors[index]");
            sc0 sc0Var = (sc0) obj;
            int iM29579B = m29579B(sc0Var);
            if (iM29579B < i) {
                break;
            }
            if (iM29579B < i3) {
                sc0Var.m48146c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = iM27621N + 1;
                }
                i4 = iM27621N;
            }
            iM27621N--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.f25871d.subList(i4, i5).clear();
        }
        return z;
    }

    /* renamed from: D */
    public final void m29581D() {
        int i = this.f25880m;
        this.f25880m = i + 1;
        if (i == 0) {
            I0();
        }
    }

    public final boolean D0() {
        if (!(this.f25880m == 0)) {
            go3.m29222v("Cannot remove group while inserting".toString());
            throw new qe9();
        }
        int i = this.f25885r;
        int i2 = this.f25875h;
        int iM0 = M0();
        jid jidVar = this.f25888u;
        if (jidVar != null) {
            while (jidVar.m33864b() && jidVar.m33865c() >= i) {
                jidVar.m33866d();
            }
        }
        boolean zE0 = E0(i, this.f25885r - i);
        F0(i2, this.f25875h - i2, i - 1);
        this.f25885r = i;
        this.f25875h = i2;
        this.f25881n -= iM0;
        return zE0;
    }

    /* renamed from: E */
    public final boolean m29582E(int i) {
        int iD0 = i + 1;
        int iD02 = i + d0(i);
        while (iD0 < iD02) {
            if (fwf.m27609B(this.f25869b, a0(iD0))) {
                return true;
            }
            iD0 += d0(iD0);
        }
        return false;
    }

    public final boolean E0(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f25871d;
            r0(i);
            zC0 = arrayList.isEmpty() ^ true ? C0(i, i2) : false;
            this.f25872e = i;
            this.f25873f += i2;
            int i3 = this.f25879l;
            if (i3 > i) {
                this.f25879l = Math.max(i, i3 - i2);
            }
            int i4 = this.f25874g;
            if (i4 >= this.f25872e) {
                this.f25874g = i4 - i2;
            }
            if (m29586I(this.f25886s)) {
                Z0(this.f25886s);
            }
        }
        return zC0;
    }

    /* renamed from: F */
    public final void m29583F() {
        int i = this.f25877j;
        fp0.m27270s(this.f25870c, null, i, this.f25878k + i);
    }

    public final void F0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f25878k;
            int i5 = i + i2;
            t0(i5, i3);
            this.f25877j = i;
            this.f25878k = i4 + i2;
            fp0.m27270s(this.f25870c, null, i, i5);
            int i6 = this.f25876i;
            if (i6 >= i) {
                this.f25876i = i6 - i2;
            }
        }
    }

    /* renamed from: G */
    public final void m29584G() {
        this.f25887t = true;
        if (this.f25882o.m43831d()) {
            r0(m29601X());
            t0(this.f25870c.length - this.f25878k, this.f25872e);
            m29583F();
            B0();
        }
        this.f25868a.m23908n(this, this.f25869b, this.f25872e, this.f25870c, this.f25877j, this.f25871d);
    }

    public final void G0() {
        if (!(this.f25880m == 0)) {
            go3.m29222v("Cannot reset when inserting".toString());
            throw new qe9();
        }
        B0();
        this.f25885r = 0;
        this.f25874g = m29597T() - this.f25873f;
        this.f25875h = 0;
        this.f25876i = 0;
        this.f25881n = 0;
    }

    /* renamed from: H */
    public final boolean m29585H(int i) {
        return i >= 0 && fwf.m27609B(this.f25869b, a0(i));
    }

    public final int H0() {
        int iM29597T = (m29597T() - this.f25873f) - this.f25883p.m43835h();
        this.f25874g = iM29597T;
        return iM29597T;
    }

    /* renamed from: I */
    public final boolean m29586I(int i) {
        return i >= 0 && fwf.m27610C(this.f25869b, a0(i));
    }

    public final void I0() {
        this.f25883p.m43836i((m29597T() - this.f25873f) - this.f25874g);
    }

    /* renamed from: J */
    public final int m29587J(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    public final Object J0(int i, Object obj) {
        int iQ0 = Q0(this.f25869b, a0(this.f25885r));
        int i2 = iQ0 + i;
        if (i2 >= iQ0 && i2 < m29589L(this.f25869b, a0(this.f25885r + 1))) {
            int iM29590M = m29590M(i2);
            Object[] objArr = this.f25870c;
            Object obj2 = objArr[iM29590M];
            objArr[iM29590M] = obj;
            return obj2;
        }
        go3.m29222v(("Write to an invalid slot index " + i + " for group " + this.f25885r).toString());
        throw new qe9();
    }

    /* renamed from: K */
    public final int m29588K(int i) {
        return m29589L(this.f25869b, a0(i));
    }

    public final void K0(Object obj) {
        int i = this.f25875h;
        if (i <= this.f25876i) {
            this.f25870c[m29590M(i - 1)] = obj;
        } else {
            go3.m29222v("Writing to an invalid slot".toString());
            throw new qe9();
        }
    }

    /* renamed from: L */
    public final int m29589L(int[] iArr, int i) {
        return i >= m29597T() ? this.f25870c.length - this.f25878k : m29587J(fwf.m27612E(iArr, i), this.f25878k, this.f25870c.length);
    }

    public final Object L0() {
        if (this.f25880m > 0) {
            j0(1, this.f25886s);
        }
        Object[] objArr = this.f25870c;
        int i = this.f25875h;
        this.f25875h = i + 1;
        return objArr[m29590M(i)];
    }

    /* renamed from: M */
    public final int m29590M(int i) {
        return i < this.f25877j ? i : i + this.f25878k;
    }

    public final int M0() {
        int iA0 = a0(this.f25885r);
        int iM27614G = this.f25885r + fwf.m27614G(this.f25869b, iA0);
        this.f25885r = iM27614G;
        this.f25875h = m29589L(this.f25869b, a0(iM27614G));
        if (fwf.m27619L(this.f25869b, iA0)) {
            return 1;
        }
        return fwf.m27622O(this.f25869b, iA0);
    }

    /* renamed from: N */
    public final int m29591N(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void N0() {
        int i = this.f25874g;
        this.f25885r = i;
        this.f25875h = m29589L(this.f25869b, a0(i));
    }

    /* renamed from: O */
    public final int m29592O() {
        boolean z = this.f25880m > 0;
        int i = this.f25885r;
        int i2 = this.f25874g;
        int i3 = this.f25886s;
        int iA0 = a0(i3);
        int i4 = this.f25881n;
        int i5 = i - i3;
        boolean zM27619L = fwf.m27619L(this.f25869b, iA0);
        if (z) {
            fwf.m27630W(this.f25869b, iA0, i5);
            fwf.m27632Y(this.f25869b, iA0, i4);
            this.f25881n = this.f25884q.m43835h() + (zM27619L ? 1 : i4);
            this.f25886s = y0(this.f25869b, i3);
        } else {
            if ((i != i2 ? 0 : 1) == 0) {
                go3.m29222v("Expected to be at the end of a group".toString());
                throw new qe9();
            }
            int iM27614G = fwf.m27614G(this.f25869b, iA0);
            int iM27622O = fwf.m27622O(this.f25869b, iA0);
            fwf.m27630W(this.f25869b, iA0, i5);
            fwf.m27632Y(this.f25869b, iA0, i4);
            int iM43835h = this.f25882o.m43835h();
            H0();
            this.f25886s = iM43835h;
            int iY0 = y0(this.f25869b, i3);
            int iM43835h2 = this.f25884q.m43835h();
            this.f25881n = iM43835h2;
            if (iY0 == iM43835h) {
                this.f25881n = iM43835h2 + (zM27619L ? 0 : i4 - iM27622O);
            } else {
                int i6 = i5 - iM27614G;
                int i7 = zM27619L ? 0 : i4 - iM27622O;
                if (i6 != 0 || i7 != 0) {
                    while (iY0 != 0 && iY0 != iM43835h && (i7 != 0 || i6 != 0)) {
                        int iA02 = a0(iY0);
                        if (i6 != 0) {
                            fwf.m27630W(this.f25869b, iA02, fwf.m27614G(this.f25869b, iA02) + i6);
                        }
                        if (i7 != 0) {
                            int[] iArr = this.f25869b;
                            fwf.m27632Y(iArr, iA02, fwf.m27622O(iArr, iA02) + i7);
                        }
                        if (fwf.m27619L(this.f25869b, iA02)) {
                            i7 = 0;
                        }
                        iY0 = y0(this.f25869b, iY0);
                    }
                }
                this.f25881n += i7;
            }
        }
        return i4;
    }

    public final Object O0(int i, int i2) {
        int iQ0 = Q0(this.f25869b, a0(i));
        int i3 = i2 + iQ0;
        if (iQ0 <= i3 && i3 < m29589L(this.f25869b, a0(i + 1))) {
            return this.f25870c[m29590M(i3)];
        }
        return un3.f49155a.m51802a();
    }

    /* renamed from: P */
    public final void m29593P() {
        int i = this.f25880m;
        if (!(i > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.f25880m = i2;
        if (i2 == 0) {
            if (this.f25884q.m43829b() == this.f25882o.m43829b()) {
                H0();
            } else {
                go3.m29222v("startGroup/endGroup mismatch while inserting".toString());
                throw new qe9();
            }
        }
    }

    public final Object P0(sc0 sc0Var, int i) {
        sq8.m48649h(sc0Var, "anchor");
        return O0(m29579B(sc0Var), i);
    }

    /* renamed from: Q */
    public final void m29594Q(int i) {
        if (!(this.f25880m <= 0)) {
            go3.m29222v("Cannot call ensureStarted() while inserting".toString());
            throw new qe9();
        }
        int i2 = this.f25886s;
        if (i2 != i) {
            if (!(i >= i2 && i < this.f25874g)) {
                go3.m29222v(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new qe9();
            }
            int i3 = this.f25885r;
            int i4 = this.f25875h;
            int i5 = this.f25876i;
            this.f25885r = i;
            S0();
            this.f25885r = i3;
            this.f25875h = i4;
            this.f25876i = i5;
        }
    }

    public final int Q0(int[] iArr, int i) {
        return i >= m29597T() ? this.f25870c.length - this.f25878k : m29587J(fwf.m27627T(iArr, i), this.f25878k, this.f25870c.length);
    }

    /* renamed from: R */
    public final void m29595R(sc0 sc0Var) {
        sq8.m48649h(sc0Var, "anchor");
        m29594Q(sc0Var.m48148e(this));
    }

    public final void R0(int i, Object obj, Object obj2) {
        U0(i, obj, false, obj2);
    }

    /* renamed from: S */
    public final void m29596S(int i, int i2, int i3) {
        int iA0 = A0(i, this.f25872e);
        while (i3 < i2) {
            fwf.m27633Z(this.f25869b, a0(i3), iA0);
            int iM27614G = fwf.m27614G(this.f25869b, a0(i3)) + i3;
            m29596S(i3, iM27614G, i3 + 1);
            i3 = iM27614G;
        }
    }

    public final void S0() {
        if (!(this.f25880m == 0)) {
            go3.m29222v("Key must be supplied when inserting".toString());
            throw new qe9();
        }
        un3.C17404a c17404a = un3.f49155a;
        U0(0, c17404a.m51802a(), false, c17404a.m51802a());
    }

    /* renamed from: T */
    public final int m29597T() {
        return this.f25869b.length / 5;
    }

    public final void T0(int i, Object obj) {
        U0(i, obj, false, un3.f49155a.m51802a());
    }

    /* renamed from: U */
    public final boolean m29598U() {
        return this.f25887t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(int i, Object obj, boolean z, Object obj2) {
        int iM27614G;
        Object[] objArr = this.f25880m > 0;
        this.f25884q.m43836i(this.f25881n);
        if (objArr == true) {
            i0(1);
            int i2 = this.f25885r;
            int iA0 = a0(i2);
            un3.C17404a c17404a = un3.f49155a;
            int i3 = obj != c17404a.m51802a() ? 1 : 0;
            int i4 = (z || obj2 == c17404a.m51802a()) ? 0 : 1;
            fwf.m27618K(this.f25869b, iA0, i, z, i3, i4, this.f25886s, this.f25875h);
            this.f25876i = this.f25875h;
            int i5 = (z ? 1 : 0) + i3 + i4;
            if (i5 > 0) {
                j0(i5, i2);
                Object[] objArr2 = this.f25870c;
                int i6 = this.f25875h;
                if (z) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                if (i3 != 0) {
                    objArr2[i6] = obj;
                    i6++;
                }
                if (i4 != 0) {
                    objArr2[i6] = obj2;
                    i6++;
                }
                this.f25875h = i6;
            }
            this.f25881n = 0;
            iM27614G = i2 + 1;
            this.f25886s = i2;
            this.f25885r = iM27614G;
        } else {
            this.f25882o.m43836i(this.f25886s);
            I0();
            int i7 = this.f25885r;
            int iA02 = a0(i7);
            if (!sq8.m48644c(obj2, un3.f49155a.m51802a())) {
                if (z) {
                    c1(obj2);
                } else {
                    Y0(obj2);
                }
            }
            this.f25875h = Q0(this.f25869b, iA02);
            this.f25876i = m29589L(this.f25869b, a0(this.f25885r + 1));
            this.f25881n = fwf.m27622O(this.f25869b, iA02);
            this.f25886s = i7;
            this.f25885r = i7 + 1;
            iM27614G = i7 + fwf.m27614G(this.f25869b, iA02);
        }
        this.f25874g = iM27614G;
    }

    /* renamed from: V */
    public final int m29599V() {
        return this.f25885r;
    }

    public final void V0(int i, Object obj) {
        U0(i, obj, true, un3.f49155a.m51802a());
    }

    /* renamed from: W */
    public final int m29600W() {
        return this.f25886s;
    }

    public final Object W0(Object obj) {
        Object objL0 = L0();
        K0(obj);
        return objL0;
    }

    /* renamed from: X */
    public final int m29601X() {
        return m29597T() - this.f25873f;
    }

    public final void X0(int i, int i2) {
        int i3;
        int iM29597T = m29597T() - this.f25873f;
        if (i >= i2) {
            for (int iM27621N = fwf.m27621N(this.f25871d, i2, iM29597T); iM27621N < this.f25871d.size(); iM27621N++) {
                Object obj = this.f25871d.get(iM27621N);
                sq8.m48648g(obj, "anchors[index]");
                sc0 sc0Var = (sc0) obj;
                int iM48144a = sc0Var.m48144a();
                if (iM48144a < 0) {
                    return;
                }
                sc0Var.m48146c(-(iM29597T - iM48144a));
            }
            return;
        }
        for (int iM27621N2 = fwf.m27621N(this.f25871d, i, iM29597T); iM27621N2 < this.f25871d.size(); iM27621N2++) {
            Object obj2 = this.f25871d.get(iM27621N2);
            sq8.m48648g(obj2, "anchors[index]");
            sc0 sc0Var2 = (sc0) obj2;
            int iM48144a2 = sc0Var2.m48144a();
            if (iM48144a2 >= 0 || (i3 = iM48144a2 + iM29597T) >= i2) {
                return;
            }
            sc0Var2.m48146c(i3);
        }
    }

    /* renamed from: Y */
    public final dwf m29602Y() {
        return this.f25868a;
    }

    public final void Y0(Object obj) {
        int iA0 = a0(this.f25885r);
        if (fwf.m27615H(this.f25869b, iA0)) {
            this.f25870c[m29590M(m29580C(this.f25869b, iA0))] = obj;
        } else {
            go3.m29222v("Updating the data of a group that was not created with a data slot".toString());
            throw new qe9();
        }
    }

    /* renamed from: Z */
    public final Object m29603Z(int i) {
        int iA0 = a0(i);
        return fwf.m27615H(this.f25869b, iA0) ? this.f25870c[m29580C(this.f25869b, iA0)] : un3.f49155a.m51802a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0(int i) {
        if (i >= 0) {
            jid jidVar = this.f25888u;
            if (jidVar == null) {
                jidVar = new jid(null, 1, 0 == true ? 1 : 0);
                this.f25888u = jidVar;
            }
            jidVar.m33863a(i);
        }
    }

    public final int a0(int i) {
        return i < this.f25872e ? i : i + this.f25873f;
    }

    public final void a1(int i, jid jidVar) {
        int iA0 = a0(i);
        boolean zM29582E = m29582E(i);
        if (fwf.m27610C(this.f25869b, iA0) != zM29582E) {
            fwf.m27628U(this.f25869b, iA0, zM29582E);
            int iX0 = x0(i);
            if (iX0 >= 0) {
                jidVar.m33863a(iX0);
            }
        }
    }

    public final int b0(int i) {
        return fwf.m27620M(this.f25869b, a0(i));
    }

    public final void b1(int[] iArr, int i, int i2) {
        fwf.m27629V(iArr, i, m29591N(i2, this.f25877j, this.f25878k, this.f25870c.length));
    }

    public final Object c0(int i) {
        int iA0 = a0(i);
        if (fwf.m27617J(this.f25869b, iA0)) {
            return this.f25870c[fwf.m27624Q(this.f25869b, iA0)];
        }
        return null;
    }

    public final void c1(Object obj) {
        d1(this.f25885r, obj);
    }

    public final int d0(int i) {
        return fwf.m27614G(this.f25869b, a0(i));
    }

    public final void d1(int i, Object obj) {
        int iA0 = a0(i);
        int[] iArr = this.f25869b;
        if (iA0 < iArr.length && fwf.m27619L(iArr, iA0)) {
            this.f25870c[m29590M(w0(this.f25869b, iA0))] = obj;
            return;
        }
        go3.m29222v(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new qe9();
    }

    public final Iterator e0() {
        int iM29589L = m29589L(this.f25869b, a0(this.f25885r));
        int[] iArr = this.f25869b;
        int i = this.f25885r;
        return new C13829b(iM29589L, m29589L(iArr, a0(i + d0(i))), this);
    }

    public final boolean f0(int i) {
        return g0(i, this.f25885r);
    }

    public final boolean g0(int i, int i2) {
        int iM43830c;
        int iM29597T;
        if (i2 == this.f25886s) {
            iM29597T = this.f25874g;
        } else if (i2 <= this.f25882o.m43834g(0) && (iM43830c = this.f25882o.m43830c(i2)) >= 0) {
            iM29597T = (m29597T() - this.f25873f) - this.f25883p.m43833f(iM43830c);
        } else {
            int iD0 = d0(i2);
            iM29597T = iD0 + i2;
        }
        return i > i2 && i < iM29597T;
    }

    public final boolean h0(int i) {
        int i2 = this.f25886s;
        return (i > i2 && i < this.f25874g) || (i2 == 0 && i == 0);
    }

    public final void i0(int i) {
        if (i > 0) {
            int i2 = this.f25885r;
            r0(i2);
            int i3 = this.f25872e;
            int i4 = this.f25873f;
            int[] iArr = this.f25869b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                fp0.m27258g(iArr, iArr2, 0, 0, i3 * 5);
                fp0.m27258g(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f25869b = iArr2;
                i4 = i6;
            }
            int i7 = this.f25874g;
            if (i7 >= i3) {
                this.f25874g = i7 + i;
            }
            int i8 = i3 + i;
            this.f25872e = i8;
            this.f25873f = i4 - i;
            int iM29591N = m29591N(i5 > 0 ? m29588K(i2 + i) : 0, this.f25879l >= i3 ? this.f25877j : 0, this.f25878k, this.f25870c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                fwf.m27629V(this.f25869b, i9, iM29591N);
            }
            int i10 = this.f25879l;
            if (i10 >= i3) {
                this.f25879l = i10 + i;
            }
        }
    }

    public final void j0(int i, int i2) {
        if (i > 0) {
            t0(this.f25875h, i2);
            int i3 = this.f25877j;
            int i4 = this.f25878k;
            if (i4 < i) {
                Object[] objArr = this.f25870c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                fp0.m27260i(objArr, objArr2, 0, 0, i3);
                fp0.m27260i(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f25870c = objArr2;
                i4 = i7;
            }
            int i8 = this.f25876i;
            if (i8 >= i3) {
                this.f25876i = i8 + i;
            }
            this.f25877j = i3 + i;
            this.f25878k = i4 - i;
        }
    }

    public final boolean k0() {
        int i = this.f25885r;
        return i < this.f25874g && fwf.m27619L(this.f25869b, a0(i));
    }

    public final boolean l0(int i) {
        return fwf.m27619L(this.f25869b, a0(i));
    }

    public final void m0(int i) {
        int iA0 = a0(i);
        if (fwf.m27616I(this.f25869b, iA0)) {
            return;
        }
        fwf.m27631X(this.f25869b, iA0, true);
        if (fwf.m27610C(this.f25869b, iA0)) {
            return;
        }
        Z0(x0(i));
    }

    public final void o0(int i, int i2, int i3) {
        int i4 = i3 + i;
        int iM29601X = m29601X();
        int iM27621N = fwf.m27621N(this.f25871d, i, iM29601X);
        ArrayList arrayList = new ArrayList();
        if (iM27621N >= 0) {
            while (iM27621N < this.f25871d.size()) {
                Object obj = this.f25871d.get(iM27621N);
                sq8.m48648g(obj, "anchors[index]");
                sc0 sc0Var = (sc0) obj;
                int iM29579B = m29579B(sc0Var);
                if (iM29579B < i || iM29579B >= i4) {
                    break;
                }
                arrayList.add(sc0Var);
                this.f25871d.remove(iM27621N);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            sc0 sc0Var2 = (sc0) arrayList.get(i6);
            int iM29579B2 = m29579B(sc0Var2) + i5;
            if (iM29579B2 >= this.f25872e) {
                sc0Var2.m48146c(-(iM29601X - iM29579B2));
            } else {
                sc0Var2.m48146c(iM29579B2);
            }
            this.f25871d.add(fwf.m27621N(this.f25871d, iM29579B2, iM29601X), sc0Var2);
        }
    }

    public final List p0(dwf dwfVar, int i, boolean z) {
        sq8.m48649h(dwfVar, "table");
        go3.m29198R(this.f25880m > 0);
        if (i != 0 || this.f25885r != 0 || this.f25868a.m23911r() != 0 || fwf.m27614G(dwfVar.m23910p(), i) != dwfVar.m23911r()) {
            gwf gwfVarM23902G = dwfVar.m23902G();
            try {
                return f25867v.m29607b(gwfVarM23902G, i, this, true, true, z);
            } finally {
                gwfVarM23902G.m29584G();
            }
        }
        int[] iArr = this.f25869b;
        Object[] objArr = this.f25870c;
        ArrayList arrayList = this.f25871d;
        int[] iArrM23910p = dwfVar.m23910p();
        int iM23911r = dwfVar.m23911r();
        Object[] objArrM23912v = dwfVar.m23912v();
        int iM23913w = dwfVar.m23913w();
        this.f25869b = iArrM23910p;
        this.f25870c = objArrM23912v;
        this.f25871d = dwfVar.m23909o();
        this.f25872e = iM23911r;
        this.f25873f = (iArrM23910p.length / 5) - iM23911r;
        this.f25877j = iM23913w;
        this.f25878k = objArrM23912v.length - iM23913w;
        this.f25879l = iM23911r;
        dwfVar.m23904J(iArr, 0, objArr, 0, arrayList);
        return this.f25871d;
    }

    public final void q0(int i) {
        if (!(this.f25880m == 0)) {
            go3.m29222v("Cannot move a group while inserting".toString());
            throw new qe9();
        }
        if (!(i >= 0)) {
            go3.m29222v("Parameter offset is out of bounds".toString());
            throw new qe9();
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f25885r;
        int i3 = this.f25886s;
        int i4 = this.f25874g;
        int iM27614G = i2;
        for (int i5 = i; i5 > 0; i5--) {
            iM27614G += fwf.m27614G(this.f25869b, a0(iM27614G));
            if (!(iM27614G <= i4)) {
                go3.m29222v("Parameter offset is out of bounds".toString());
                throw new qe9();
            }
        }
        int iM27614G2 = fwf.m27614G(this.f25869b, a0(iM27614G));
        int i6 = this.f25875h;
        int iM29589L = m29589L(this.f25869b, a0(iM27614G));
        int i7 = iM27614G + iM27614G2;
        int iM29589L2 = m29589L(this.f25869b, a0(i7));
        int i8 = iM29589L2 - iM29589L;
        j0(i8, Math.max(this.f25885r - 1, 0));
        i0(iM27614G2);
        int[] iArr = this.f25869b;
        int iA0 = a0(i7) * 5;
        fp0.m27258g(iArr, iArr, a0(i2) * 5, iA0, (iM27614G2 * 5) + iA0);
        if (i8 > 0) {
            Object[] objArr = this.f25870c;
            fp0.m27260i(objArr, objArr, i6, m29590M(iM29589L + i8), m29590M(iM29589L2 + i8));
        }
        int i9 = iM29589L + i8;
        int i10 = i9 - i6;
        int i11 = this.f25877j;
        int i12 = this.f25878k;
        int length = this.f25870c.length;
        int i13 = this.f25879l;
        int i14 = i2 + iM27614G2;
        int i15 = i2;
        while (i15 < i14) {
            int iA02 = a0(i15);
            int i16 = i11;
            int i17 = i10;
            b1(iArr, iA02, m29591N(m29589L(iArr, iA02) - i10, i13 < iA02 ? 0 : i16, i12, length));
            i15++;
            i11 = i16;
            i10 = i17;
        }
        o0(i7, i2, iM27614G2);
        if (!(!E0(i7, iM27614G2))) {
            go3.m29222v("Unexpectedly removed anchors".toString());
            throw new qe9();
        }
        m29596S(i3, this.f25874g, i2);
        if (i8 > 0) {
            F0(i9, i8, i7 - 1);
        }
    }

    public final void r0(int i) {
        int i2 = this.f25873f;
        int i3 = this.f25872e;
        if (i3 != i) {
            if (!this.f25871d.isEmpty()) {
                X0(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.f25869b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    fp0.m27258g(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    fp0.m27258g(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int iM29597T = m29597T();
            go3.m29198R(i3 < iM29597T);
            while (i3 < iM29597T) {
                int iM27625R = fwf.m27625R(this.f25869b, i3);
                int iA0 = A0(z0(iM27625R), i);
                if (iA0 != iM27625R) {
                    fwf.m27633Z(this.f25869b, i3, iA0);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.f25872e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List s0(int i, dwf dwfVar, int i2) {
        boolean z;
        sq8.m48649h(dwfVar, "table");
        if (this.f25880m <= 0) {
            z = d0(this.f25885r + i) == 1;
        }
        go3.m29198R(z);
        int i3 = this.f25885r;
        int i4 = this.f25875h;
        int i5 = this.f25876i;
        m29604z(i);
        S0();
        m29581D();
        gwf gwfVarM23902G = dwfVar.m23902G();
        try {
            List listM29606c = C13828a.m29606c(f25867v, gwfVarM23902G, i2, this, false, true, false, 32, null);
            gwfVarM23902G.m29584G();
            m29593P();
            m29592O();
            this.f25885r = i3;
            this.f25875h = i4;
            this.f25876i = i5;
            return listM29606c;
        } catch (Throwable th) {
            gwfVarM23902G.m29584G();
            throw th;
        }
    }

    public final void t0(int i, int i2) {
        int i3 = this.f25878k;
        int i4 = this.f25877j;
        int i5 = this.f25879l;
        if (i4 != i) {
            Object[] objArr = this.f25870c;
            if (i < i4) {
                fp0.m27260i(objArr, objArr, i + i3, i, i4);
            } else {
                fp0.m27260i(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int iMin = Math.min(i2 + 1, m29601X());
        if (i5 != iMin) {
            int length = this.f25870c.length - i3;
            if (iMin < i5) {
                int iA0 = a0(iMin);
                int iA02 = a0(i5);
                int i6 = this.f25872e;
                while (iA0 < iA02) {
                    int iM27612E = fwf.m27612E(this.f25869b, iA0);
                    if (!(iM27612E >= 0)) {
                        go3.m29222v("Unexpected anchor value, expected a positive anchor".toString());
                        throw new qe9();
                    }
                    fwf.m27629V(this.f25869b, iA0, -((length - iM27612E) + 1));
                    iA0++;
                    if (iA0 == i6) {
                        iA0 += this.f25873f;
                    }
                }
            } else {
                int iA03 = a0(i5);
                int iA04 = a0(iMin);
                while (iA03 < iA04) {
                    int iM27612E2 = fwf.m27612E(this.f25869b, iA03);
                    if (!(iM27612E2 < 0)) {
                        go3.m29222v("Unexpected anchor value, expected a negative anchor".toString());
                        throw new qe9();
                    }
                    fwf.m27629V(this.f25869b, iA03, iM27612E2 + length + 1);
                    iA03++;
                    if (iA03 == this.f25872e) {
                        iA03 += this.f25873f;
                    }
                }
            }
            this.f25879l = iMin;
        }
        this.f25877j = i;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f25885r + " end=" + this.f25874g + " size = " + m29601X() + " gap=" + this.f25872e + '-' + (this.f25872e + this.f25873f) + ')';
    }

    public final Object u0(int i) {
        int iA0 = a0(i);
        if (fwf.m27619L(this.f25869b, iA0)) {
            return this.f25870c[m29590M(w0(this.f25869b, iA0))];
        }
        return null;
    }

    public final int v0(int i) {
        return fwf.m27622O(this.f25869b, a0(i));
    }

    public final int w0(int[] iArr, int i) {
        return m29589L(iArr, i);
    }

    public final int x0(int i) {
        return y0(this.f25869b, i);
    }

    public final int y0(int[] iArr, int i) {
        return z0(fwf.m27625R(iArr, a0(i)));
    }

    /* renamed from: z */
    public final void m29604z(int i) {
        if (!(i >= 0)) {
            go3.m29222v("Cannot seek backwards".toString());
            throw new qe9();
        }
        if (!(this.f25880m <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f25885r + i;
        if (i2 >= this.f25886s && i2 <= this.f25874g) {
            this.f25885r = i2;
            int iM29589L = m29589L(this.f25869b, a0(i2));
            this.f25875h = iM29589L;
            this.f25876i = iM29589L;
            return;
        }
        go3.m29222v(("Cannot seek outside the current group (" + this.f25886s + '-' + this.f25874g + ')').toString());
        throw new qe9();
    }

    public final int z0(int i) {
        return i > -2 ? i : m29601X() + i + 2;
    }
}
