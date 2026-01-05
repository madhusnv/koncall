package e5;

import d5.C1603g;
import d5.EnumC1608l;
import g5.AbstractC2523m;
import g5.C2520j;
import java.util.ArrayList;
import java.util.HashMap;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.f */
/* loaded from: classes.dex */
public final class C1951f extends C1603g {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;

    /* renamed from: n0, reason: collision with root package name */
    public C2520j f44195n0;

    /* renamed from: o0, reason: collision with root package name */
    public HashMap f44196o0;

    /* renamed from: p0, reason: collision with root package name */
    public HashMap f44197p0;

    /* renamed from: q0, reason: collision with root package name */
    public HashMap f44198q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f44199r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f44200s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f44201t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f44202u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f44203v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f44204w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f44205x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f44206y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f44207z0;

    public C1951f(C8553n c8553n, EnumC1608l enumC1608l) {
        super(c8553n, enumC1608l);
        this.f44199r0 = 0;
        this.f44200s0 = -1;
        this.f44201t0 = -1;
        this.f44202u0 = -1;
        this.f44203v0 = -1;
        this.f44204w0 = -1;
        this.f44205x0 = -1;
        this.f44206y0 = 2;
        this.f44207z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (enumC1608l == EnumC1608l.VERTICAL_FLOW) {
            this.H0 = 1;
        }
    }

    @Override // d5.C1603g, d5.C1598b, d5.InterfaceC1604h
    public final void apply() throws NumberFormatException {
        mo5258s();
        mo5237a(this.f44195n0);
        C2520j c2520j = this.f44195n0;
        c2520j.J0 = this.H0;
        c2520j.H0 = this.f44199r0;
        int i10 = this.G0;
        if (i10 != -1) {
            c2520j.I0 = i10;
        }
        int i11 = this.C0;
        if (i11 != 0) {
            c2520j.f44279k0 = i11;
        }
        int i12 = this.E0;
        if (i12 != 0) {
            c2520j.f44277i0 = i12;
        }
        int i13 = this.D0;
        if (i13 != 0) {
            c2520j.f44280l0 = i13;
        }
        int i14 = this.F0;
        if (i14 != 0) {
            c2520j.f44278j0 = i14;
        }
        int i15 = this.B0;
        if (i15 != 0) {
            c2520j.D0 = i15;
        }
        int i16 = this.A0;
        if (i16 != 0) {
            c2520j.E0 = i16;
        }
        float f6 = this.f7982h;
        if (f6 != 0.5f) {
            c2520j.f44266x0 = f6;
        }
        float f10 = this.K0;
        if (f10 != 0.5f) {
            c2520j.f44268z0 = f10;
        }
        float f11 = this.L0;
        if (f11 != 0.5f) {
            c2520j.B0 = f11;
        }
        float f12 = this.f7983i;
        if (f12 != 0.5f) {
            c2520j.f44267y0 = f12;
        }
        float f13 = this.I0;
        if (f13 != 0.5f) {
            c2520j.A0 = f13;
        }
        float f14 = this.J0;
        if (f14 != 0.5f) {
            c2520j.C0 = f14;
        }
        int i17 = this.f44207z0;
        if (i17 != 2) {
            c2520j.F0 = i17;
        }
        int i18 = this.f44206y0;
        if (i18 != 2) {
            c2520j.G0 = i18;
        }
        int i19 = this.f44200s0;
        if (i19 != -1) {
            c2520j.f44261s0 = i19;
        }
        int i20 = this.f44201t0;
        if (i20 != -1) {
            c2520j.f44263u0 = i20;
        }
        int i21 = this.f44202u0;
        if (i21 != -1) {
            c2520j.f44265w0 = i21;
        }
        int i22 = this.f44203v0;
        if (i22 != -1) {
            c2520j.f44260r0 = i22;
        }
        int i23 = this.f44204w0;
        if (i23 != -1) {
            c2520j.f44262t0 = i23;
        }
        int i24 = this.f44205x0;
        if (i24 != -1) {
            c2520j.f44264v0 = i24;
        }
        m5257r();
    }

    @Override // d5.C1603g
    /* renamed from: s */
    public final AbstractC2523m mo5258s() {
        if (this.f44195n0 == null) {
            C2520j c2520j = new C2520j();
            c2520j.f44260r0 = -1;
            c2520j.f44261s0 = -1;
            c2520j.f44262t0 = -1;
            c2520j.f44263u0 = -1;
            c2520j.f44264v0 = -1;
            c2520j.f44265w0 = -1;
            c2520j.f44266x0 = 0.5f;
            c2520j.f44267y0 = 0.5f;
            c2520j.f44268z0 = 0.5f;
            c2520j.A0 = 0.5f;
            c2520j.B0 = 0.5f;
            c2520j.C0 = 0.5f;
            c2520j.D0 = 0;
            c2520j.E0 = 0;
            c2520j.F0 = 2;
            c2520j.G0 = 2;
            c2520j.H0 = 0;
            c2520j.I0 = -1;
            c2520j.J0 = 0;
            c2520j.K0 = new ArrayList();
            c2520j.L0 = null;
            c2520j.M0 = null;
            c2520j.N0 = null;
            c2520j.P0 = 0;
            this.f44195n0 = c2520j;
        }
        return this.f44195n0;
    }
}
