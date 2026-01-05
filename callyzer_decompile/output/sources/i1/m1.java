package i1;

import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1581i;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import lx.InterfaceC4574m;
import rw.C6669s;
import s4.C6745a;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import v3.InterfaceC7652x;
import v3.w1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 extends AbstractC7878q implements InterfaceC7652x, w1 {

    /* renamed from: q */
    public p1 f16928q;

    /* renamed from: r */
    public boolean f16929r;

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        if (!this.f16929r) {
            i10 = Integer.MAX_VALUE;
        }
        return i0Var.a0(i10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        if (!this.f16929r) {
            i10 = Integer.MAX_VALUE;
        }
        return i0Var.mo13311b(i10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        pg.f0.m11617a(j6, this.f16929r ? k1.x0.Vertical : k1.x0.Horizontal);
        t3.w0 w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, 0, this.f16929r ? C6745a.m12918i(j6) : Integer.MAX_VALUE, 0, this.f16929r ? Integer.MAX_VALUE : C6745a.m12917h(j6), 5));
        int i10 = w0VarMo13314z.f34030a;
        int iM12918i = C6745a.m12918i(j6);
        if (i10 > iM12918i) {
            i10 = iM12918i;
        }
        int i11 = w0VarMo13314z.f34031b;
        int iM12917h = C6745a.m12917h(j6);
        if (i11 > iM12917h) {
            i11 = iM12917h;
        }
        int i12 = w0VarMo13314z.f34031b - i11;
        int i13 = w0VarMo13314z.f34030a - i10;
        if (!this.f16929r) {
            i12 = i13;
        }
        p1 p1Var = this.f16928q;
        k2.b1 b1Var = p1Var.f16956d;
        k2.b1 b1Var2 = p1Var.f16953a;
        b1Var.m8527g(i12);
        AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
        AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
        try {
            if (b1Var2.m8526f() > i12) {
                b1Var2.m8527g(i12);
            }
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
            this.f16928q.f16954b.m8527g(this.f16929r ? i11 : i10);
            return l0Var.g0(i10, i11, C6669s.f31944a, new l1(this, i12, w0VarMo13314z, 0));
        } catch (Throwable th2) {
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
            throw th2;
        }
    }

    @Override // v3.InterfaceC7652x
    public final int k0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        if (this.f16929r) {
            i10 = Integer.MAX_VALUE;
        }
        return i0Var.mo13313y(i10);
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        AbstractC1594v.m5233k(interfaceC1596x);
        C1581i c1581i = new C1581i(new k1(this, 0), new k1(this, 1));
        if (this.f16929r) {
            AbstractC1594v.m5235m(interfaceC1596x, c1581i);
            return;
        }
        C1595w c1595w = AbstractC1592t.f7935s;
        InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[10];
        c1595w.m5236a(interfaceC1596x, c1581i);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        if (this.f16929r) {
            i10 = Integer.MAX_VALUE;
        }
        return i0Var.mo13312x(i10);
    }
}
