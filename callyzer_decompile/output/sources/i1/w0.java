package i1;

import ab.C0084b;
import android.view.View;
import c3.C0847b;
import d4.C1583k;
import d4.InterfaceC1596x;
import k2.C3953b;
import og.ze;
import pg.o6;
import s4.C6752h;
import s4.C6756l;
import s4.InterfaceC6747c;
import v3.AbstractC7634f;
import v3.InterfaceC7644p;
import v3.InterfaceC7645q;
import v3.w1;
import vx.C7806h;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends AbstractC7878q implements InterfaceC7645q, InterfaceC7644p, w1, v3.l1 {

    /* renamed from: B */
    public C6756l f17000B;

    /* renamed from: C */
    public C7806h f17001C;

    /* renamed from: q */
    public b2.d1 f17002q;

    /* renamed from: r */
    public b2.e1 f17003r;

    /* renamed from: s */
    public g1 f17004s;

    /* renamed from: t */
    public View f17005t;

    /* renamed from: v */
    public InterfaceC6747c f17006v;

    /* renamed from: w */
    public f1 f17007w;

    /* renamed from: y */
    public k2.c0 f17009y;

    /* renamed from: x */
    public final k2.e1 f17008x = new k2.e1(null, k2.s0.f20544c);

    /* renamed from: z */
    public long f17010z = 9205357640488583168L;

    public w0(b2.d1 d1Var, b2.e1 e1Var, g1 g1Var) {
        this.f17002q = d1Var;
        this.f17003r = e1Var;
        this.f17004s = g1Var;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        c0();
        this.f17001C = o6.m11805a(0, null, null, 7);
        tx.c0.m13502y(z0(), null, tx.b0.UNDISPATCHED, new C0084b(this, null, 25), 1);
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        f1 f1Var = this.f17007w;
        if (f1Var != null) {
            ((h1) f1Var).m7508b();
        }
        this.f17007w = null;
    }

    public final long L0() {
        if (this.f17009y == null) {
            this.f17009y = C3953b.m8512o(new v0(this, 0));
        }
        k2.c0 c0Var = this.f17009y;
        if (c0Var != null) {
            return ((C0847b) c0Var.getValue()).f5352a;
        }
        return 9205357640488583168L;
    }

    public final void M0() {
        f1 f1Var = this.f17007w;
        if (f1Var != null) {
            ((h1) f1Var).m7508b();
        }
        View viewM14565z = this.f17005t;
        if (viewM14565z == null) {
            viewM14565z = AbstractC7634f.m14565z(this);
        }
        this.f17005t = viewM14565z;
        InterfaceC6747c interfaceC6747c = this.f17006v;
        if (interfaceC6747c == null) {
            interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
        }
        this.f17006v = interfaceC6747c;
        this.f17007w = this.f17004s.mo7507b(viewM14565z, interfaceC6747c);
        O0();
    }

    public final void N0() {
        InterfaceC6747c interfaceC6747c = this.f17006v;
        if (interfaceC6747c == null) {
            interfaceC6747c = AbstractC7634f.m14563x(this).f36825C;
            this.f17006v = interfaceC6747c;
        }
        long j6 = ((C0847b) this.f17002q.invoke(interfaceC6747c)).f5352a;
        if ((j6 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & L0()) == 9205357640488583168L) {
            this.f17010z = 9205357640488583168L;
            f1 f1Var = this.f17007w;
            if (f1Var != null) {
                ((h1) f1Var).m7508b();
                return;
            }
            return;
        }
        this.f17010z = C0847b.m2276g(L0(), j6);
        if (this.f17007w == null) {
            M0();
        }
        f1 f1Var2 = this.f17007w;
        if (f1Var2 != null) {
            f1Var2.mo7496a(this.f17010z, 9205357640488583168L);
        }
        O0();
    }

    public final void O0() {
        InterfaceC6747c interfaceC6747c;
        f1 f1Var = this.f17007w;
        if (f1Var == null || (interfaceC6747c = this.f17006v) == null) {
            return;
        }
        h1 h1Var = (h1) f1Var;
        long jM7509c = h1Var.m7509c();
        C6756l c6756l = this.f17000B;
        if (c6756l != null && jM7509c == c6756l.f32210a) {
            return;
        }
        this.f17003r.invoke(new C6752h(interfaceC6747c.mo8442m(ze.m11098d(h1Var.m7509c()))));
        this.f17000B = new C6756l(h1Var.m7509c());
    }

    @Override // v3.InterfaceC7645q
    /* renamed from: W */
    public final void mo7495W(v3.h1 h1Var) {
        this.f17008x.setValue(h1Var);
    }

    @Override // v3.l1
    public final void c0() {
        AbstractC7634f.m14559t(this, new v0(this, 2));
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        i0Var.m14622b();
        C7806h c7806h = this.f17001C;
        if (c7806h != null) {
            c7806h.mo14776i(qw.a0.f30746a);
        }
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        ((C1583k) interfaceC1596x).m5202q(x0.f17011a, new v0(this, 1));
    }
}
