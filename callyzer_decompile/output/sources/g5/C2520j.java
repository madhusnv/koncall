package g5;

import java.util.ArrayList;
import z4.C8864b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.j */
/* loaded from: classes.dex */
public final class C2520j extends AbstractC2525o {
    public float A0;
    public float B0;
    public float C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public ArrayList K0;
    public C2517g[] L0;
    public C2517g[] M0;
    public int[] N0;
    public C2517g[] O0;
    public int P0;

    /* renamed from: r0, reason: collision with root package name */
    public int f44260r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f44261s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f44262t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f44263u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f44264v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f44265w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f44266x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f44267y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f44268z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    @Override // g5.AbstractC2525o
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5916K(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2520j.mo5916K(int, int, int, int):void");
    }

    /* renamed from: M */
    public final int m6543M(C2517g c2517g, int i10) {
        C2517g c2517g2;
        if (c2517g == null) {
            return 0;
        }
        EnumC2516f[] enumC2516fArr = c2517g.f13772L;
        if (enumC2516fArr[1] == EnumC2516f.MATCH_CONSTRAINT) {
            int i11 = c2517g.f13800n;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c2517g.f13807u * i10);
                if (i12 != c2517g.m6518k()) {
                    c2517g.f13788b = true;
                    m6549L(c2517g, enumC2516fArr[0], c2517g.m6519l(), EnumC2516f.FIXED, i12);
                }
                return i12;
            }
            c2517g2 = c2517g;
            if (i11 == 1) {
                return c2517g2.m6518k();
            }
            if (i11 == 3) {
                return (int) ((c2517g2.m6519l() * c2517g2.f13776P) + 0.5f);
            }
        } else {
            c2517g2 = c2517g;
        }
        return c2517g2.m6518k();
    }

    /* renamed from: N */
    public final int m6544N(C2517g c2517g, int i10) {
        C2517g c2517g2;
        if (c2517g == null) {
            return 0;
        }
        EnumC2516f[] enumC2516fArr = c2517g.f13772L;
        if (enumC2516fArr[0] == EnumC2516f.MATCH_CONSTRAINT) {
            int i11 = c2517g.f13799m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c2517g.f13804r * i10);
                if (i12 != c2517g.m6519l()) {
                    c2517g.f13788b = true;
                    m6549L(c2517g, EnumC2516f.FIXED, i12, enumC2516fArr[1], c2517g.m6518k());
                }
                return i12;
            }
            c2517g2 = c2517g;
            if (i11 == 1) {
                return c2517g2.m6519l();
            }
            if (i11 == 3) {
                return (int) ((c2517g2.m6518k() * c2517g2.f13776P) + 0.5f);
            }
        } else {
            c2517g2 = c2517g;
        }
        return c2517g2.m6519l();
    }

    @Override // g5.C2517g
    /* renamed from: c */
    public final void mo5926c(C8864b c8864b, boolean z6) {
        C2517g c2517g;
        ArrayList arrayList = this.K0;
        super.mo5926c(c8864b, z6);
        int i10 = this.H0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((C2519i) arrayList.get(i11)).m6538b(i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        ((C2519i) arrayList.get(i12)).m6538b(i12, i12 == size2 + (-1));
                        i12++;
                    }
                }
            } else if (this.N0 != null && this.M0 != null && this.L0 != null) {
                for (int i13 = 0; i13 < this.P0; i13++) {
                    this.O0[i13].m6530y();
                }
                int[] iArr = this.N0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f6 = this.f44266x0;
                C2517g c2517g2 = null;
                for (int i16 = 0; i16 < i14; i16++) {
                    C2517g c2517g3 = this.M0[i16];
                    if (c2517g3 != null) {
                        C2514d c2514d = c2517g3.f13761A;
                        if (c2517g3.f13786Z != 8) {
                            if (i16 == 0) {
                                c2517g3.m6514g(c2514d, this.f13761A, this.f44279k0);
                                c2517g3.f44239b0 = this.f44260r0;
                                c2517g3.f13783W = f6;
                            }
                            if (i16 == i14 - 1) {
                                c2517g3.m6514g(c2517g3.f13763C, this.f13763C, this.f44280l0);
                            }
                            if (i16 > 0 && c2517g2 != null) {
                                C2514d c2514d2 = c2517g2.f13763C;
                                c2517g3.m6514g(c2514d, c2514d2, this.D0);
                                c2517g2.m6514g(c2514d2, c2514d, 0);
                            }
                            c2517g2 = c2517g3;
                        }
                    }
                }
                for (int i17 = 0; i17 < i15; i17++) {
                    C2517g c2517g4 = this.L0[i17];
                    if (c2517g4 != null) {
                        C2514d c2514d3 = c2517g4.f13762B;
                        if (c2517g4.f13786Z != 8) {
                            if (i17 == 0) {
                                c2517g4.m6514g(c2514d3, this.f13762B, this.f44277i0);
                                c2517g4.f44240c0 = this.f44261s0;
                                c2517g4.f13784X = this.f44267y0;
                            }
                            if (i17 == i15 - 1) {
                                c2517g4.m6514g(c2517g4.f13764D, this.f13764D, this.f44278j0);
                            }
                            if (i17 > 0 && c2517g2 != null) {
                                C2514d c2514d4 = c2517g2.f13764D;
                                c2517g4.m6514g(c2514d3, c2514d4, this.E0);
                                c2517g2.m6514g(c2514d4, c2514d3, 0);
                            }
                            c2517g2 = c2517g4;
                        }
                    }
                }
                for (int i18 = 0; i18 < i14; i18++) {
                    for (int i19 = 0; i19 < i15; i19++) {
                        int i20 = (i19 * i14) + i18;
                        if (this.J0 == 1) {
                            i20 = (i18 * i15) + i19;
                        }
                        C2517g[] c2517gArr = this.O0;
                        if (i20 < c2517gArr.length && (c2517g = c2517gArr[i20]) != null && c2517g.f13786Z != 8) {
                            C2517g c2517g5 = this.M0[i18];
                            C2517g c2517g6 = this.L0[i19];
                            if (c2517g != c2517g5) {
                                c2517g.m6514g(c2517g.f13761A, c2517g5.f13761A, 0);
                                c2517g.m6514g(c2517g.f13763C, c2517g5.f13763C, 0);
                            }
                            if (c2517g != c2517g6) {
                                c2517g.m6514g(c2517g.f13762B, c2517g6.f13762B, 0);
                                c2517g.m6514g(c2517g.f13764D, c2517g6.f13764D, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C2519i) arrayList.get(0)).m6538b(0, true);
        }
        this.f44281m0 = false;
    }
}
