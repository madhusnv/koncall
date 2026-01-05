package a2;

import ba.AbstractC0639i;
import c3.C0848c;
import d3.AbstractC1561o;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.InterfaceC1566t;
import d3.k0;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import f3.AbstractC2199e;
import f3.C2201g;
import g4.C2492h;
import g4.C2501q;
import g4.g0;
import g4.l0;
import g4.o0;
import java.util.List;
import java.util.Map;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;
import og.b2;
import r4.C6457l;
import s4.InterfaceC6747c;
import t3.i0;
import v3.InterfaceC7644p;
import v3.InterfaceC7652x;
import v3.n0;
import v3.w1;
import w2.AbstractC7878q;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.k */
/* loaded from: classes.dex */
public final class C0038k extends AbstractC7878q implements InterfaceC7652x, InterfaceC7644p, w1 {

    /* renamed from: B */
    public InterfaceC2139c f159B;

    /* renamed from: C */
    public InterfaceC1566t f160C;

    /* renamed from: D */
    public InterfaceC2139c f161D;

    /* renamed from: E */
    public Map f162E;

    /* renamed from: F */
    public C0032e f163F;

    /* renamed from: G */
    public C0035h f164G;

    /* renamed from: H */
    public C0034g f165H;

    /* renamed from: q */
    public C2492h f166q;

    /* renamed from: r */
    public o0 f167r;

    /* renamed from: s */
    public InterfaceC3987h f168s;

    /* renamed from: t */
    public InterfaceC2139c f169t;

    /* renamed from: v */
    public int f170v;

    /* renamed from: w */
    public boolean f171w;

    /* renamed from: x */
    public int f172x;

    /* renamed from: y */
    public int f173y;

    /* renamed from: z */
    public List f174z;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(n0 n0Var, i0 i0Var, int i10) {
        return M0(n0Var).m136a(i10, n0Var.getLayoutDirection());
    }

    public final C0032e L0() {
        if (this.f163F == null) {
            this.f163F = new C0032e(this.f166q, this.f167r, this.f168s, this.f170v, this.f171w, this.f172x, this.f173y, this.f174z);
        }
        C0032e c0032e = this.f163F;
        AbstractC4154l.m8920c(c0032e);
        return c0032e;
    }

    public final C0032e M0(InterfaceC6747c interfaceC6747c) {
        C0032e c0032e;
        C0034g c0034g = this.f165H;
        if (c0034g != null && c0034g.f151c && (c0032e = c0034g.f152d) != null) {
            c0032e.m138c(interfaceC6747c);
            return c0032e;
        }
        C0032e c0032eL0 = L0();
        c0032eL0.m138c(interfaceC6747c);
        return c0032eL0;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(n0 n0Var, i0 i0Var, int i10) {
        return M0(n0Var).m136a(i10, n0Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t3.k0 mo148b(t3.l0 r9, t3.i0 r10, long r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0038k.mo148b(t3.l0, t3.i0, long):t3.k0");
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        if (!this.f37683p) {
            return;
        }
        InterfaceC1563q interfaceC1563qM75t = i0Var.f36917a.f10124b.m75t();
        l0 l0Var = M0(i0Var).f128n;
        if (l0Var == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        C2501q c2501q = l0Var.f13671b;
        boolean z6 = true;
        boolean z10 = l0Var.m6446d() && this.f170v != 3;
        if (z10) {
            long j6 = l0Var.f13672c;
            C0848c c0848cM10543a = b2.m10543a(0L, (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L));
            interfaceC1563qM75t.mo5107i();
            InterfaceC1563q.m5184d(interfaceC1563qM75t, c0848cM10543a);
        }
        try {
            g0 g0Var = this.f167r.f13688a;
            C6457l c6457l = g0Var.f13615m;
            if (c6457l == null) {
                c6457l = C6457l.f31116b;
            }
            C6457l c6457l2 = c6457l;
            k0 k0Var = g0Var.f13616n;
            if (k0Var == null) {
                k0Var = k0.f7781d;
            }
            k0 k0Var2 = k0Var;
            AbstractC2199e abstractC2199e = g0Var.f13618p;
            if (abstractC2199e == null) {
                abstractC2199e = C2201g.f10129a;
            }
            AbstractC2199e abstractC2199e2 = abstractC2199e;
            AbstractC1561o abstractC1561oMo12439c = g0Var.f13603a.mo12439c();
            if (abstractC1561oMo12439c != null) {
                C2501q.m6467j(c2501q, interfaceC1563qM75t, abstractC1561oMo12439c, this.f167r.f13688a.f13603a.mo12437a(), k0Var2, c6457l2, abstractC2199e2);
            } else {
                InterfaceC1566t interfaceC1566t = this.f160C;
                long jMo5194a = interfaceC1566t != null ? interfaceC1566t.mo5194a() : C1565s.f7817j;
                if (jMo5194a == 16) {
                    jMo5194a = this.f167r.m6463b() != 16 ? this.f167r.m6463b() : C1565s.f7809b;
                }
                C2501q.m6466i(c2501q, interfaceC1563qM75t, jMo5194a, k0Var2, c6457l2, abstractC2199e2);
            }
            if (z10) {
                interfaceC1563qM75t.mo5113o();
            }
            C0034g c0034g = this.f165H;
            if (!((c0034g == null || !c0034g.f151c) ? AbstractC0639i.m1856a(this.f166q) : false)) {
                List list = this.f174z;
                if (list != null && !list.isEmpty()) {
                    z6 = false;
                }
                if (z6) {
                    return;
                }
            }
            i0Var.m14622b();
        } finally {
        }
    }

    @Override // v3.InterfaceC7652x
    public final int k0(n0 n0Var, i0 i0Var, int i10) {
        return r0.m15457q(M0(n0Var).m139d(n0Var.getLayoutDirection()).mo214f());
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        C0035h c0035h = this.f164G;
        if (c0035h == null) {
            c0035h = new C0035h(this, 0);
            this.f164G = c0035h;
        }
        AbstractC1594v.m5232j(interfaceC1596x, this.f166q);
        C0034g c0034g = this.f165H;
        if (c0034g != null) {
            C2492h c2492h = c0034g.f150b;
            C1595w c1595w = AbstractC1592t.f7904A;
            InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
            InterfaceC4574m interfaceC4574m = interfaceC4574mArr[14];
            c1595w.m5236a(interfaceC1596x, c2492h);
            boolean z6 = c0034g.f151c;
            C1595w c1595w2 = AbstractC1592t.f7905B;
            InterfaceC4574m interfaceC4574m2 = interfaceC4574mArr[15];
            c1595w2.m5236a(interfaceC1596x, Boolean.valueOf(z6));
        }
        C0035h c0035h2 = new C0035h(this, 1);
        C1595w c1595w3 = C1582j.f7852k;
        C1573a c1573a = new C1573a(null, c0035h2);
        C1583k c1583k = (C1583k) interfaceC1596x;
        c1583k.m5202q(c1595w3, c1573a);
        c1583k.m5202q(C1582j.f7853l, new C1573a(null, new C0035h(this, 2)));
        c1583k.m5202q(C1582j.f7854m, new C1573a(null, new C0036i(0, this)));
        AbstractC1594v.m5225c(interfaceC1596x, c0035h);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(n0 n0Var, i0 i0Var, int i10) {
        return r0.m15457q(M0(n0Var).m139d(n0Var.getLayoutDirection()).mo210b());
    }
}
