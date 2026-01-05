package t3;

import c3.C0847b;
import c3.C0848c;
import kotlin.jvm.internal.AbstractC4154l;
import og.xe;
import s3.AbstractC6744a;
import s4.C6754j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 implements InterfaceC7033t {

    /* renamed from: a */
    public final v3.o0 f34004a;

    public h0(v3.o0 o0Var) {
        this.f34004a = o0Var;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: B */
    public final long mo13295B(long j6) {
        return C0847b.m2276g(this.f34004a.f36966m.mo13295B(j6), m13300a());
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: D */
    public final InterfaceC7033t mo13296D() {
        v3.o0 o0VarR0;
        if (!mo13305s()) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        v3.h1 h1Var = ((v3.h1) this.f34004a.f36966m.f36902m.f36832K.f22540d).f36904p;
        if (h1Var == null || (o0VarR0 = h1Var.R0()) == null) {
            return null;
        }
        return o0VarR0.f36969q;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: N */
    public final long mo13297N(long j6) {
        return C0847b.m2276g(this.f34004a.f36966m.mo13297N(j6), m13300a());
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: S */
    public final C0848c mo13298S(InterfaceC7033t interfaceC7033t, boolean z6) {
        return this.f34004a.f36966m.mo13298S(interfaceC7033t, z6);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: V */
    public final long mo13299V(long j6) {
        return this.f34004a.f36966m.mo13299V(C0847b.m2276g(j6, m13300a()));
    }

    /* renamed from: a */
    public final long m13300a() {
        v3.o0 o0Var = this.f34004a;
        v3.o0 o0VarM13280i = c1.m13280i(o0Var);
        return C0847b.m2275f(m13301b(o0VarM13280i.f36969q, 0L), o0Var.f36966m.c1(o0VarM13280i.f36966m, 0L));
    }

    /* renamed from: b */
    public final long m13301b(InterfaceC7033t interfaceC7033t, long j6) {
        boolean z6 = interfaceC7033t instanceof h0;
        v3.o0 o0Var = this.f34004a;
        if (!z6) {
            v3.o0 o0VarM13280i = c1.m13280i(o0Var);
            InterfaceC7033t interfaceC7033t2 = o0VarM13280i.f36966m;
            long jM13301b = m13301b(o0VarM13280i.f36969q, j6);
            long j10 = o0VarM13280i.f36967n;
            long jM2275f = C0847b.m2275f(jM13301b, (4294967295L & Float.floatToRawIntBits((int) (j10 & 4294967295L))) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            InterfaceC7033t interfaceC7033tMo13304k = interfaceC7033t2.mo13304k();
            if (interfaceC7033tMo13304k != null) {
                interfaceC7033t2 = interfaceC7033tMo13304k;
            }
            return C0847b.m2276g(jM2275f, ((v3.h1) interfaceC7033t2).c1(interfaceC7033t, 0L));
        }
        v3.o0 o0Var2 = ((h0) interfaceC7033t).f34004a;
        v3.h1 h1Var = o0Var2.f36966m;
        h1Var.e1();
        v3.o0 o0VarR0 = o0Var.f36966m.O0(h1Var).R0();
        if (o0VarR0 != null) {
            long jM12941b = C6754j.m12941b(C6754j.m12942c(o0Var2.K0(o0VarR0, false), xe.m11048e(j6)), o0Var.K0(o0VarR0, false));
            return (Float.floatToRawIntBits((int) (jM12941b >> 32)) << 32) | (Float.floatToRawIntBits((int) (jM12941b & 4294967295L)) & 4294967295L);
        }
        v3.o0 o0VarM13280i2 = c1.m13280i(o0Var2);
        long jM12942c = C6754j.m12942c(C6754j.m12942c(o0Var2.K0(o0VarM13280i2, false), o0VarM13280i2.f36967n), xe.m11048e(j6));
        v3.o0 o0VarM13280i3 = c1.m13280i(o0Var);
        long jM12941b2 = C6754j.m12941b(jM12942c, C6754j.m12942c(o0Var.K0(o0VarM13280i3, false), o0VarM13280i3.f36967n));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM12941b2 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jM12941b2 & 4294967295L)) & 4294967295L;
        v3.h1 h1Var2 = o0VarM13280i3.f36966m.f36904p;
        AbstractC4154l.m8920c(h1Var2);
        v3.h1 h1Var3 = o0VarM13280i2.f36966m.f36904p;
        AbstractC4154l.m8920c(h1Var3);
        return h1Var2.c1(h1Var3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // t3.InterfaceC7033t
    public final long c0(InterfaceC7033t interfaceC7033t, long j6) {
        return m13301b(interfaceC7033t, j6);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: d */
    public final void mo13302d(InterfaceC7033t interfaceC7033t, float[] fArr) {
        this.f34004a.f36966m.mo13302d(interfaceC7033t, fArr);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: f */
    public final long mo13303f(long j6) {
        return this.f34004a.f36966m.mo13303f(C0847b.m2276g(j6, m13300a()));
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: k */
    public final InterfaceC7033t mo13304k() {
        v3.o0 o0VarR0;
        if (!mo13305s()) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        v3.h1 h1Var = this.f34004a.f36966m.f36904p;
        if (h1Var == null || (o0VarR0 = h1Var.R0()) == null) {
            return null;
        }
        return o0VarR0.f36969q;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: s */
    public final boolean mo13305s() {
        return this.f34004a.f36966m.T0().f37683p;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: t */
    public final void mo13306t(float[] fArr) {
        this.f34004a.f36966m.mo13306t(fArr);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: v */
    public final long mo13307v() {
        v3.o0 o0Var = this.f34004a;
        return (o0Var.f34030a << 32) | (o0Var.f34031b & 4294967295L);
    }
}
