package p001o;

import java.util.List;
import p001o.lmh;

/* loaded from: classes2.dex */
public abstract class ie1 implements mad {

    /* renamed from: a */
    public final lmh.C15106c f28559a = new lmh.C15106c();

    @Override // p001o.mad
    /* renamed from: E */
    public final void mo31977E() {
        if (mo7112A().m37477q() || mo7133b()) {
            k0(9);
            return;
        }
        if (mo31988u()) {
            p0(9);
        } else if (g0() && mo31990y()) {
            o0(mo7128W(), 9);
        } else {
            k0(9);
        }
    }

    @Override // p001o.mad
    /* renamed from: H */
    public final void mo31978H(int i, long j) {
        m0(i, j, 10, false);
    }

    @Override // p001o.mad
    /* renamed from: M */
    public final long mo31979M() {
        lmh lmhVarMo7112A = mo7112A();
        if (lmhVarMo7112A.m37477q()) {
            return -9223372036854775807L;
        }
        return lmhVarMo7112A.m37476n(mo7128W(), this.f28559a).m37502d();
    }

    @Override // p001o.mad
    /* renamed from: Q */
    public final boolean mo31980Q() {
        return i0() != -1;
    }

    @Override // p001o.mad
    /* renamed from: U */
    public final boolean mo31981U() {
        lmh lmhVarMo7112A = mo7112A();
        return !lmhVarMo7112A.m37477q() && lmhVarMo7112A.m37476n(mo7128W(), this.f28559a).f34087h;
    }

    @Override // p001o.mad
    /* renamed from: V */
    public final boolean mo31982V() {
        return mo7134c() == 3 && mo7119J() && mo7148z() == 0;
    }

    @Override // p001o.mad
    public final void b0() {
        q0(mo7126S(), 12);
    }

    @Override // p001o.mad
    public final void c0() {
        q0(-f0(), 11);
    }

    @Override // p001o.mad
    /* renamed from: g */
    public final void mo31983g() {
        mo7144s(true);
    }

    @Override // p001o.mad
    public final boolean g0() {
        lmh lmhVarMo7112A = mo7112A();
        return !lmhVarMo7112A.m37477q() && lmhVarMo7112A.m37476n(mo7128W(), this.f28559a).m37504f();
    }

    @Override // p001o.mad
    /* renamed from: h */
    public final void mo31984h(long j) {
        n0(j, 5);
    }

    public final int h0() {
        lmh lmhVarMo7112A = mo7112A();
        if (lmhVarMo7112A.m37477q()) {
            return -1;
        }
        return lmhVarMo7112A.mo22379e(mo7128W(), j0(), mo7130Y());
    }

    public final int i0() {
        lmh lmhVarMo7112A = mo7112A();
        if (lmhVarMo7112A.m37477q()) {
            return -1;
        }
        return lmhVarMo7112A.mo22381l(mo7128W(), j0(), mo7130Y());
    }

    public final int j0() {
        int iMo7140l = mo7140l();
        if (iMo7140l == 1) {
            return 0;
        }
        return iMo7140l;
    }

    @Override // p001o.mad
    /* renamed from: k */
    public final void mo31985k() {
        o0(mo7128W(), 4);
    }

    public final void k0(int i) {
        m0(-1, -9223372036854775807L, i, false);
    }

    public final void l0(int i) {
        m0(mo7128W(), -9223372036854775807L, i, true);
    }

    public abstract void m0(int i, long j, int i2, boolean z);

    @Override // p001o.mad
    /* renamed from: n */
    public final void mo31986n(s2b s2bVar) {
        s0(nf8.m40500F(s2bVar));
    }

    public final void n0(long j, int i) {
        m0(mo7128W(), j, i, false);
    }

    public final void o0(int i, int i2) {
        m0(i, -9223372036854775807L, i2, false);
    }

    @Override // p001o.mad
    /* renamed from: p */
    public final void mo31987p() {
        if (mo7112A().m37477q() || mo7133b()) {
            k0(7);
            return;
        }
        boolean zMo31980Q = mo31980Q();
        if (g0() && !mo31981U()) {
            if (zMo31980Q) {
                r0(7);
                return;
            } else {
                k0(7);
                return;
            }
        }
        if (!zMo31980Q || e0() > mo7121L()) {
            n0(0L, 7);
        } else {
            r0(7);
        }
    }

    public final void p0(int i) {
        int iH0 = h0();
        if (iH0 == -1) {
            k0(i);
        } else if (iH0 == mo7128W()) {
            l0(i);
        } else {
            o0(iH0, i);
        }
    }

    @Override // p001o.mad
    public final void pause() {
        mo7144s(false);
    }

    public final void q0(long j, int i) {
        long jE0 = e0() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jE0 = Math.min(jE0, duration);
        }
        n0(Math.max(jE0, 0L), i);
    }

    public final void r0(int i) {
        int iI0 = i0();
        if (iI0 == -1) {
            k0(i);
        } else if (iI0 == mo7128W()) {
            l0(i);
        } else {
            o0(iI0, i);
        }
    }

    public final void s0(List list) {
        mo7141m(list, true);
    }

    @Override // p001o.mad
    /* renamed from: u */
    public final boolean mo31988u() {
        return h0() != -1;
    }

    @Override // p001o.mad
    /* renamed from: x */
    public final boolean mo31989x(int i) {
        return mo7118I().m38644b(i);
    }

    @Override // p001o.mad
    /* renamed from: y */
    public final boolean mo31990y() {
        lmh lmhVarMo7112A = mo7112A();
        return !lmhVarMo7112A.m37477q() && lmhVarMo7112A.m37476n(mo7128W(), this.f28559a).f34088i;
    }
}
