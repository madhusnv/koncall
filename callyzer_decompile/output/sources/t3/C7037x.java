package t3;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import java.util.Map;
import m2.C4637b;
import m2.C4640e;
import rw.C6668r;
import s3.AbstractC6744a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.x */
/* loaded from: classes.dex */
public final class C7037x implements g1, l0 {

    /* renamed from: a */
    public final /* synthetic */ a0 f34035a;

    /* renamed from: b */
    public final /* synthetic */ f0 f34036b;

    public C7037x(f0 f0Var) {
        this.f34036b = f0Var;
        this.f34035a = f0Var.f33986h;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: A */
    public final long mo8432A(float f6) {
        return this.f34035a.mo8432A(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: F */
    public final float mo8433F(int i10) {
        return this.f34035a.mo8433F(i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: J */
    public final float mo8434J(float f6) {
        return f6 / this.f34035a.mo155a();
    }

    @Override // t3.l0
    /* renamed from: M */
    public final k0 mo12873M(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        return this.f34035a.mo12873M(i10, i11, map, interfaceC2139c);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f34035a.f33953c;
    }

    @Override // t3.InterfaceC7028o
    /* renamed from: R */
    public final boolean mo12874R() {
        return this.f34035a.mo12874R();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: T */
    public final float mo8435T(float f6) {
        return this.f34035a.mo155a() * f6;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: Z */
    public final int mo8436Z(long j6) {
        return this.f34035a.mo8436Z(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f34035a.f33952b;
    }

    @Override // t3.g1
    public final List b0(Object obj, InterfaceC2141e interfaceC2141e) {
        f0 f0Var = this.f34036b;
        v3.g0 g0Var = f0Var.f33979a;
        v3.g0 g0Var2 = (v3.g0) f0Var.f33985g.m5574g(obj);
        if (g0Var2 != null && ((C4637b) g0Var.m14604q()).f22878a.m9513k(g0Var2) < f0Var.f33982d) {
            return g0Var2.m14602o();
        }
        e1.j0 j0Var = f0Var.f33988k;
        C4640e c4640e = f0Var.f33991n;
        if (c4640e.f22886c < f0Var.f33983e) {
            AbstractC6744a.m12906a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i10 = c4640e.f22886c;
        int i11 = f0Var.f33983e;
        if (i10 == i11) {
            c4640e.m9506b(obj);
        } else {
            Object[] objArr = c4640e.f22884a;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        f0Var.f33983e++;
        if (!j0Var.m5569b(obj)) {
            f0Var.f33990m.m5579l(obj, f0Var.m13289f(obj, interfaceC2141e));
            if (g0Var.f36833L.f36931d == v3.c0.LayingOut) {
                g0Var.m14589T(true);
            } else {
                v3.g0.m14567U(g0Var, true, 6);
            }
        }
        v3.g0 g0Var3 = (v3.g0) j0Var.m5574g(obj);
        if (g0Var3 == null) {
            return C6668r.f31943a;
        }
        List listT0 = g0Var3.f36833L.f36943p.t0();
        C4637b c4637b = (C4637b) listT0;
        int i12 = c4637b.f22878a.f22886c;
        for (int i13 = 0; i13 < i12; i13++) {
            ((v3.y0) c4637b.get(i13)).f37057f.f36929b = true;
        }
        return listT0;
    }

    @Override // s4.InterfaceC6747c
    public final int e0(float f6) {
        return this.f34035a.e0(f6);
    }

    @Override // t3.l0
    public final k0 g0(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        return this.f34035a.mo12873M(i10, i11, map, interfaceC2139c);
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f34035a.f33951a;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return this.f34035a.mo8441l(f6);
    }

    @Override // s4.InterfaceC6747c
    public final long l0(long j6) {
        return this.f34035a.l0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: m */
    public final long mo8442m(long j6) {
        return this.f34035a.mo8442m(j6);
    }

    @Override // s4.InterfaceC6747c
    public final float n0(long j6) {
        return this.f34035a.n0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        return this.f34035a.mo8443p(j6);
    }
}
