package g5;

import z4.C8863a;
import z4.C8864b;
import z4.C8867e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.l */
/* loaded from: classes.dex */
public final class C2522l extends C2517g {

    /* renamed from: g0, reason: collision with root package name */
    public float f44269g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f44270h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f44271i0;

    /* renamed from: j0, reason: collision with root package name */
    public C2514d f44272j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f44273k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f44274l0;

    @Override // g5.C2517g
    /* renamed from: I */
    public final void mo6509I(C8864b c8864b, boolean z6) {
        if (this.f13773M == null) {
            return;
        }
        C2514d c2514d = this.f44272j0;
        c8864b.getClass();
        int iM16348n = C8864b.m16348n(c2514d);
        if (this.f44273k0 == 1) {
            this.f13778R = iM16348n;
            this.f13779S = 0;
            m6505E(this.f13773M.m6518k());
            m6508H(0);
            return;
        }
        this.f13778R = 0;
        this.f13779S = iM16348n;
        m6508H(this.f13773M.m6519l());
        m6505E(0);
    }

    /* renamed from: J */
    public final void m6545J(int i10) {
        this.f44272j0.m6500k(i10);
        this.f44274l0 = true;
    }

    @Override // g5.C2517g
    /* renamed from: c */
    public final void mo5926c(C8864b c8864b, boolean z6) {
        C2518h c2518h = this.f13773M;
        if (c2518h == null) {
            return;
        }
        Object objMo6516i = c2518h.mo6516i(EnumC2513c.LEFT);
        Object objMo6516i2 = c2518h.mo6516i(EnumC2513c.RIGHT);
        C2518h c2518h2 = this.f13773M;
        boolean z10 = c2518h2 != null && c2518h2.f13772L[0] == EnumC2516f.WRAP_CONTENT;
        if (this.f44273k0 == 0) {
            objMo6516i = c2518h.mo6516i(EnumC2513c.TOP);
            objMo6516i2 = c2518h.mo6516i(EnumC2513c.BOTTOM);
            C2518h c2518h3 = this.f13773M;
            z10 = c2518h3 != null && c2518h3.f13772L[1] == EnumC2516f.WRAP_CONTENT;
        }
        if (this.f44274l0) {
            C2514d c2514d = this.f44272j0;
            if (c2514d.f13753c) {
                C8867e c8867eM16359k = c8864b.m16359k(c2514d);
                c8864b.m16352d(c8867eM16359k, this.f44272j0.m6492c());
                if (this.f44270h0 != -1) {
                    if (z10) {
                        c8864b.m16354f(c8864b.m16359k(objMo6516i2), c8867eM16359k, 0, 5);
                    }
                } else if (this.f44271i0 != -1 && z10) {
                    C8867e c8867eM16359k2 = c8864b.m16359k(objMo6516i2);
                    c8864b.m16354f(c8867eM16359k, c8864b.m16359k(objMo6516i), 0, 5);
                    c8864b.m16354f(c8867eM16359k2, c8867eM16359k, 0, 5);
                }
                this.f44274l0 = false;
                return;
            }
        }
        if (this.f44270h0 != -1) {
            C8867e c8867eM16359k3 = c8864b.m16359k(this.f44272j0);
            c8864b.m16353e(c8867eM16359k3, c8864b.m16359k(objMo6516i), this.f44270h0, 8);
            if (z10) {
                c8864b.m16354f(c8864b.m16359k(objMo6516i2), c8867eM16359k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f44271i0 != -1) {
            C8867e c8867eM16359k4 = c8864b.m16359k(this.f44272j0);
            C8867e c8867eM16359k5 = c8864b.m16359k(objMo6516i2);
            c8864b.m16353e(c8867eM16359k4, c8867eM16359k5, -this.f44271i0, 8);
            if (z10) {
                c8864b.m16354f(c8867eM16359k4, c8864b.m16359k(objMo6516i), 0, 5);
                c8864b.m16354f(c8867eM16359k5, c8867eM16359k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f44269g0 != -1.0f) {
            C8867e c8867eM16359k6 = c8864b.m16359k(this.f44272j0);
            C8867e c8867eM16359k7 = c8864b.m16359k(objMo6516i2);
            float f6 = this.f44269g0;
            C8863a c8863aM16360l = c8864b.m16360l();
            c8863aM16360l.f42647d.m8121n(c8867eM16359k6, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867eM16359k7, f6);
            c8864b.m16351c(c8863aM16360l);
        }
    }

    @Override // g5.C2517g
    /* renamed from: d */
    public final boolean mo6487d() {
        return true;
    }

    @Override // g5.C2517g
    /* renamed from: i */
    public final C2514d mo6516i(EnumC2513c enumC2513c) {
        int i10 = AbstractC2521k.f13831a[enumC2513c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f44273k0 == 1) {
                return this.f44272j0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f44273k0 == 0) {
            return this.f44272j0;
        }
        return null;
    }

    @Override // g5.C2517g
    /* renamed from: v */
    public final boolean mo6488v() {
        return this.f44274l0;
    }

    @Override // g5.C2517g
    /* renamed from: w */
    public final boolean mo6489w() {
        return this.f44274l0;
    }
}
