package g5;

import com.sun.mail.util.AbstractC1452a;
import z4.C8863a;
import z4.C8864b;
import z4.C8867e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.a */
/* loaded from: classes.dex */
public final class C2511a extends AbstractC2523m {

    /* renamed from: i0, reason: collision with root package name */
    public int f44234i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f44235j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f44236k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f44237l0;

    /* renamed from: K */
    public final boolean m6485K() {
        int i10;
        int i11;
        int i12;
        boolean z6 = this.f44235j0;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f44276h0;
            if (i13 >= i10) {
                break;
            }
            C2517g c2517g = this.f44275g0[i13];
            if ((z6 || c2517g.mo6487d()) && ((((i11 = this.f44234i0) == 0 || i11 == 1) && !c2517g.mo6488v()) || (((i12 = this.f44234i0) == 2 || i12 == 3) && !c2517g.mo6489w()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f44276h0; i14++) {
            C2517g c2517g2 = this.f44275g0[i14];
            if (z6 || c2517g2.mo6487d()) {
                if (!z11) {
                    int i15 = this.f44234i0;
                    if (i15 == 0) {
                        iMax = c2517g2.mo6516i(EnumC2513c.LEFT).m6492c();
                    } else if (i15 == 1) {
                        iMax = c2517g2.mo6516i(EnumC2513c.RIGHT).m6492c();
                    } else if (i15 == 2) {
                        iMax = c2517g2.mo6516i(EnumC2513c.TOP).m6492c();
                    } else if (i15 == 3) {
                        iMax = c2517g2.mo6516i(EnumC2513c.BOTTOM).m6492c();
                    }
                    z11 = true;
                }
                int i16 = this.f44234i0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, c2517g2.mo6516i(EnumC2513c.LEFT).m6492c());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, c2517g2.mo6516i(EnumC2513c.RIGHT).m6492c());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, c2517g2.mo6516i(EnumC2513c.TOP).m6492c());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, c2517g2.mo6516i(EnumC2513c.BOTTOM).m6492c());
                }
            }
        }
        int i17 = iMax + this.f44236k0;
        int i18 = this.f44234i0;
        if (i18 == 0 || i18 == 1) {
            m6503C(i17, i17);
        } else {
            m6504D(i17, i17);
        }
        this.f44237l0 = true;
        return true;
    }

    /* renamed from: L */
    public final int m6486L() {
        int i10 = this.f44234i0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // g5.C2517g
    /* renamed from: c */
    public final void mo5926c(C8864b c8864b, boolean z6) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12 = this.f44235j0;
        C2514d[] c2514dArr = this.f13769I;
        char c2 = 0;
        C2514d c2514d = this.f13761A;
        c2514dArr[0] = c2514d;
        int i12 = 2;
        C2514d c2514d2 = this.f13762B;
        c2514dArr[2] = c2514d2;
        C2514d c2514d3 = this.f13763C;
        c2514dArr[1] = c2514d3;
        C2514d c2514d4 = this.f13764D;
        c2514dArr[3] = c2514d4;
        for (C2514d c2514d5 : c2514dArr) {
            c2514d5.f13759i = c8864b.m16359k(c2514d5);
        }
        int i13 = this.f44234i0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        C2514d c2514d6 = c2514dArr[i13];
        if (!this.f44237l0) {
            m6485K();
        }
        if (this.f44237l0) {
            this.f44237l0 = false;
            int i14 = this.f44234i0;
            if (i14 == 0 || i14 == 1) {
                c8864b.m16352d(c2514d.f13759i, this.f13778R);
                c8864b.m16352d(c2514d3.f13759i, this.f13778R);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    c8864b.m16352d(c2514d2.f13759i, this.f13779S);
                    c8864b.m16352d(c2514d4.f13759i, this.f13779S);
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < this.f44276h0) {
            C2517g c2517g = this.f44275g0[i15];
            if ((z12 || c2517g.mo6487d()) && ((((i11 = this.f44234i0) == 0 || i11 == 1) && c2517g.f13772L[c2] == EnumC2516f.MATCH_CONSTRAINT && c2517g.f13761A.f13756f != null && c2517g.f13763C.f13756f != null) || ((i11 == 2 || i11 == 3) && c2517g.f13772L[1] == EnumC2516f.MATCH_CONSTRAINT && c2517g.f13762B.f13756f != null && c2517g.f13764D.f13756f != null))) {
                z10 = true;
                break;
            } else {
                i15++;
                c2 = 0;
            }
        }
        z10 = false;
        boolean z13 = c2514d.m6495f() || c2514d3.m6495f();
        boolean z14 = c2514d2.m6495f() || c2514d4.m6495f();
        int i16 = !(!z10 && (((i10 = this.f44234i0) == 0 && z13) || ((i10 == 2 && z14) || ((i10 == 1 && z13) || (i10 == 3 && z14))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f44276h0) {
            C2517g c2517g2 = this.f44275g0[i17];
            if (z12 || c2517g2.mo6487d()) {
                C8867e c8867eM16359k = c8864b.m16359k(c2517g2.f13769I[this.f44234i0]);
                C2514d[] c2514dArr2 = c2517g2.f13769I;
                int i18 = this.f44234i0;
                C2514d c2514d7 = c2514dArr2[i18];
                c2514d7.f13759i = c8867eM16359k;
                C2514d c2514d8 = c2514d7.f13756f;
                int i19 = (c2514d8 == null || c2514d8.f13754d != this) ? 0 : c2514d7.f13757g;
                if (i18 == 0 || i18 == i12) {
                    z11 = z12;
                    C8867e c8867e = c2514d6.f13759i;
                    int i20 = this.f44236k0 - i19;
                    C8863a c8863aM16360l = c8864b.m16360l();
                    C8867e c8867eM16361m = c8864b.m16361m();
                    c8867eM16361m.f42673d = 0;
                    c8863aM16360l.m16341c(c8867e, c8867eM16359k, c8867eM16361m, i20);
                    c8864b.m16351c(c8863aM16360l);
                } else {
                    C8867e c8867e2 = c2514d6.f13759i;
                    int i21 = this.f44236k0 + i19;
                    C8863a c8863aM16360l2 = c8864b.m16360l();
                    C8867e c8867eM16361m2 = c8864b.m16361m();
                    z11 = z12;
                    c8867eM16361m2.f42673d = 0;
                    c8863aM16360l2.m16340b(c8867e2, c8867eM16359k, c8867eM16361m2, i21);
                    c8864b.m16351c(c8863aM16360l2);
                }
                c8864b.m16353e(c2514d6.f13759i, c8867eM16359k, this.f44236k0 + i19, i16);
            } else {
                z11 = z12;
            }
            i17++;
            z12 = z11;
            i12 = 2;
        }
        int i22 = this.f44234i0;
        if (i22 == 0) {
            c8864b.m16353e(c2514d3.f13759i, c2514d.f13759i, 0, 8);
            c8864b.m16353e(c2514d.f13759i, this.f13773M.f13763C.f13759i, 0, 4);
            c8864b.m16353e(c2514d.f13759i, this.f13773M.f13761A.f13759i, 0, 0);
            return;
        }
        if (i22 == 1) {
            c8864b.m16353e(c2514d.f13759i, c2514d3.f13759i, 0, 8);
            c8864b.m16353e(c2514d.f13759i, this.f13773M.f13761A.f13759i, 0, 4);
            c8864b.m16353e(c2514d.f13759i, this.f13773M.f13763C.f13759i, 0, 0);
        } else if (i22 == 2) {
            c8864b.m16353e(c2514d4.f13759i, c2514d2.f13759i, 0, 8);
            c8864b.m16353e(c2514d2.f13759i, this.f13773M.f13764D.f13759i, 0, 4);
            c8864b.m16353e(c2514d2.f13759i, this.f13773M.f13762B.f13759i, 0, 0);
        } else if (i22 == 3) {
            c8864b.m16353e(c2514d2.f13759i, c2514d4.f13759i, 0, 8);
            c8864b.m16353e(c2514d2.f13759i, this.f13773M.f13762B.f13759i, 0, 4);
            c8864b.m16353e(c2514d2.f13759i, this.f13773M.f13764D.f13759i, 0, 0);
        }
    }

    @Override // g5.C2517g
    /* renamed from: d */
    public final boolean mo6487d() {
        return true;
    }

    @Override // g5.C2517g
    public final String toString() {
        String strM4564k = AbstractC1452a.m4564k(new StringBuilder("[Barrier] "), this.f44238a0, " {");
        for (int i10 = 0; i10 < this.f44276h0; i10++) {
            C2517g c2517g = this.f44275g0[i10];
            if (i10 > 0) {
                strM4564k = AbstractC1452a.m4561h(strM4564k, ", ");
            }
            StringBuilder sbM4568o = AbstractC1452a.m4568o(strM4564k);
            sbM4568o.append(c2517g.f44238a0);
            strM4564k = sbM4568o.toString();
        }
        return AbstractC1452a.m4561h(strM4564k, "}");
    }

    @Override // g5.C2517g
    /* renamed from: v */
    public final boolean mo6488v() {
        return this.f44237l0;
    }

    @Override // g5.C2517g
    /* renamed from: w */
    public final boolean mo6489w() {
        return this.f44237l0;
    }
}
