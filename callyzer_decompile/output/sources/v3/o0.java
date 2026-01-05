package v3;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6754j;
import s4.EnumC6757m;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o0 extends n0 implements t3.i0 {

    /* renamed from: m */
    public final h1 f36966m;

    /* renamed from: p */
    public LinkedHashMap f36968p;

    /* renamed from: r */
    public t3.k0 f36970r;

    /* renamed from: s */
    public final e1.d0 f36971s;

    /* renamed from: n */
    public long f36967n = 0;

    /* renamed from: q */
    public final t3.h0 f36969q = new t3.h0(this);

    public o0(h1 h1Var) {
        this.f36966m = h1Var;
        e1.d0 d0Var = e1.o0.f9033a;
        this.f36971s = new e1.d0();
    }

    public static final void H0(o0 o0Var, t3.k0 k0Var) {
        qw.a0 a0Var;
        LinkedHashMap linkedHashMap;
        if (k0Var != null) {
            o0Var.m0((k0Var.getHeight() & 4294967295L) | (k0Var.mo12108b() << 32));
            a0Var = qw.a0.f30746a;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            o0Var.m0(0L);
        }
        if (!AbstractC4154l.m8918a(o0Var.f36970r, k0Var) && k0Var != null && ((((linkedHashMap = o0Var.f36968p) != null && !linkedHashMap.isEmpty()) || !k0Var.mo12109c().isEmpty()) && !AbstractC4154l.m8918a(k0Var.mo12109c(), o0Var.f36968p))) {
            s0 s0Var = o0Var.f36966m.f36902m.f36833L.f36944q;
            AbstractC4154l.m8920c(s0Var);
            s0Var.f37004t.m14619f();
            LinkedHashMap linkedHashMap2 = o0Var.f36968p;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.f36968p = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k0Var.mo12109c());
        }
        o0Var.f36970r = k0Var;
    }

    @Override // v3.n0
    public final boolean A0() {
        return this.f36970r != null;
    }

    @Override // v3.n0
    public final g0 B0() {
        return this.f36966m.f36902m;
    }

    @Override // t3.w0, t3.i0
    /* renamed from: C */
    public final Object mo13310C() {
        return this.f36966m.mo13310C();
    }

    @Override // v3.n0
    public final t3.k0 C0() {
        t3.k0 k0Var = this.f36970r;
        if (k0Var != null) {
            return k0Var;
        }
        throw p020v.a1.m14342v("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // v3.n0
    public final n0 D0() {
        h1 h1Var = this.f36966m.f36904p;
        if (h1Var != null) {
            return h1Var.R0();
        }
        return null;
    }

    @Override // v3.n0
    public final long E0() {
        return this.f36967n;
    }

    @Override // v3.n0
    public final void G0() {
        k0(this.f36967n, DefinitionKt.NO_Float_VALUE, null);
    }

    public void I0() {
        C0().mo12110d();
    }

    public final void J0(long j6) {
        if (!C6754j.m12940a(this.f36967n, j6)) {
            this.f36967n = j6;
            h1 h1Var = this.f36966m;
            s0 s0Var = h1Var.f36902m.f36833L.f36944q;
            if (s0Var != null) {
                s0Var.x0();
            }
            n0.F0(h1Var);
        }
        if (this.f36956h) {
            return;
        }
        u0(new t1(C0(), this));
    }

    public final long K0(o0 o0Var, boolean z6) {
        long jM12942c = 0;
        o0 o0VarR0 = this;
        while (!o0VarR0.equals(o0Var)) {
            if (!o0VarR0.f36954f || !z6) {
                jM12942c = C6754j.m12942c(jM12942c, o0VarR0.f36967n);
            }
            h1 h1Var = o0VarR0.f36966m.f36904p;
            AbstractC4154l.m8920c(h1Var);
            o0VarR0 = h1Var.R0();
            AbstractC4154l.m8920c(o0VarR0);
        }
        return jM12942c;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f36966m.mo154O();
    }

    @Override // v3.n0, t3.InterfaceC7028o
    /* renamed from: R */
    public final boolean mo12874R() {
        return true;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f36966m.mo155a();
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f36966m.f36902m.f36826D;
    }

    @Override // t3.w0
    public final void k0(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        J0(j6);
        if (this.f36955g) {
            return;
        }
        I0();
    }

    @Override // v3.n0
    public final n0 x0() {
        h1 h1Var = this.f36966m.f36903n;
        if (h1Var != null) {
            return h1Var.R0();
        }
        return null;
    }

    @Override // v3.n0
    public final InterfaceC7033t z0() {
        return this.f36969q;
    }
}
