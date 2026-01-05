package f5;

import cj.C0975a;
import g5.AbstractC2525o;
import g5.C2517g;
import g5.C2518h;
import g5.EnumC2516f;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f5.a */
/* loaded from: classes.dex */
public final class C2204a extends AbstractC2525o {
    public String A0;
    public String B0;
    public String C0;
    public String D0;
    public int E0;
    public int F0;
    public boolean[][] G0;
    public HashSet H0;
    public int[][] I0;
    public int J0;
    public int[][] K0;
    public int L0;

    /* renamed from: r0, reason: collision with root package name */
    public C2518h f44221r0;

    /* renamed from: s0, reason: collision with root package name */
    public C2517g[] f44222s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f44223t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f44224u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f44225v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f44226w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f44227x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f44228y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f44229z0;

    /* renamed from: M */
    public static void m5914M(C2517g c2517g) {
        c2517g.f44241d0[1] = -1.0f;
        c2517g.f13762B.m6498i();
        c2517g.f13764D.m6498i();
        c2517g.f13765E.m6498i();
    }

    /* renamed from: V */
    public static float[] m5915V(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e2) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e2.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // g5.AbstractC2525o
    /* renamed from: K */
    public final void mo5916K(int i10, int i11, int i12, int i13) {
        int[][] iArrM5924U;
        this.f44221r0 = this.f13773M;
        if (this.f44224u0 >= 1 && this.f44226w0 >= 1) {
            this.F0 = 0;
            String str = this.D0;
            if (str != null && !str.trim().isEmpty() && (iArrM5924U = m5924U(this.D0, false)) != null) {
                m5920Q(iArrM5924U);
            }
            String str2 = this.C0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.K0 = m5924U(this.C0, true);
            }
            int iMax = Math.max(this.f44224u0, this.f44226w0);
            C2517g[] c2517gArr = this.f44222s0;
            if (c2517gArr == null) {
                this.f44222s0 = new C2517g[iMax];
                int i14 = 0;
                while (true) {
                    C2517g[] c2517gArr2 = this.f44222s0;
                    if (i14 >= c2517gArr2.length) {
                        break;
                    }
                    C2517g c2517g = new C2517g();
                    EnumC2516f enumC2516f = EnumC2516f.MATCH_CONSTRAINT;
                    EnumC2516f[] enumC2516fArr = c2517g.f13772L;
                    enumC2516fArr[0] = enumC2516f;
                    enumC2516fArr[1] = enumC2516f;
                    c2517g.f13792f = String.valueOf(c2517g.hashCode());
                    c2517gArr2[i14] = c2517g;
                    i14++;
                }
            } else if (iMax != c2517gArr.length) {
                C2517g[] c2517gArr3 = new C2517g[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    C2517g[] c2517gArr4 = this.f44222s0;
                    if (i15 < c2517gArr4.length) {
                        c2517gArr3[i15] = c2517gArr4[i15];
                    } else {
                        C2517g c2517g2 = new C2517g();
                        EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
                        EnumC2516f[] enumC2516fArr2 = c2517g2.f13772L;
                        enumC2516fArr2[0] = enumC2516f2;
                        enumC2516fArr2[1] = enumC2516f2;
                        c2517g2.f13792f = String.valueOf(c2517g2.hashCode());
                        c2517gArr3[i15] = c2517g2;
                    }
                }
                while (true) {
                    C2517g[] c2517gArr5 = this.f44222s0;
                    if (iMax >= c2517gArr5.length) {
                        break;
                    }
                    C2517g c2517g3 = c2517gArr5[iMax];
                    this.f44221r0.f44244g0.remove(c2517g3);
                    c2517g3.mo6529x();
                    iMax++;
                }
                this.f44222s0 = c2517gArr3;
            }
            int[][] iArr = this.K0;
            if (iArr != null) {
                m5921R(iArr);
            }
        }
        C2518h c2518h = this.f44221r0;
        C2517g[] c2517gArr6 = this.f44222s0;
        c2518h.getClass();
        for (C2517g c2517g4 : c2517gArr6) {
            c2518h.f44244g0.add(c2517g4);
            C2518h c2518h2 = c2517g4.f13773M;
            if (c2518h2 != null) {
                c2518h2.f44244g0.remove(c2517g4);
                c2517g4.mo6529x();
            }
            c2517g4.f13773M = c2518h;
        }
    }

    /* renamed from: N */
    public final void m5917N(C2517g c2517g, int i10, int i11, int i12, int i13) {
        c2517g.f13761A.m6490a(this.f44222s0[i11].f13761A, 0);
        c2517g.f13762B.m6490a(this.f44222s0[i10].f13762B, 0);
        c2517g.f13763C.m6490a(this.f44222s0[(i11 + i13) - 1].f13763C, 0);
        c2517g.f13764D.m6490a(this.f44222s0[(i10 + i12) - 1].f13764D, 0);
    }

    /* renamed from: O */
    public final int m5918O(int i10) {
        return this.E0 == 1 ? i10 / this.f44224u0 : i10 % this.f44226w0;
    }

    /* renamed from: P */
    public final int m5919P(int i10) {
        return this.E0 == 1 ? i10 % this.f44224u0 : i10 / this.f44226w0;
    }

    /* renamed from: Q */
    public final void m5920Q(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!m5923T(m5919P(iArr2[0]), m5918O(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    /* renamed from: R */
    public final void m5921R(int[][] iArr) {
        if ((this.J0 & 2) > 0) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iM5919P = m5919P(iArr[i10][0]);
            int iM5918O = m5918O(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!m5923T(iM5919P, iM5918O, iArr2[1], iArr2[2])) {
                break;
            }
            C2517g c2517g = this.f44275g0[i10];
            int[] iArr3 = iArr[i10];
            m5917N(c2517g, iM5919P, iM5918O, iArr3[1], iArr3[2]);
            this.H0.add(this.f44275g0[i10].f13792f);
        }
    }

    /* renamed from: S */
    public final void m5922S() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f44224u0, this.f44226w0);
        this.G0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f44276h0;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.I0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    /* renamed from: T */
    public final boolean m5923T(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.G0;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final int[][] m5924U(String str, boolean z6) {
        int i10;
        int i11;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new C0975a(3));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f44224u0 != 1 && this.f44226w0 != 1) {
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    String[] strArrSplit2 = strArrSplit[i12].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i12][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.J0 & 1) > 0) {
                        iArr[i12][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i12][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i12][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i12][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                String[] strArrSplit4 = strArrSplit[i15].trim().split(":");
                iArr[i15][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i15];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f44226w0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i13 += iArr[i15][1];
                    if (z6) {
                        i13--;
                    }
                }
                if (this.f44224u0 == 1) {
                    iArr[i15][2] = Integer.parseInt(strArrSplit4[1]);
                    i14 += iArr[i15][2];
                    if (z6) {
                        i14--;
                    }
                }
            }
            if (i13 != 0 && !this.f44223t0 && (i11 = this.f44224u0 + i13) <= 50 && this.f44225v0 != i11) {
                this.f44225v0 = i11;
                m5925W();
                m5922S();
            }
            if (i14 != 0 && !this.f44223t0 && (i10 = this.f44226w0 + i14) <= 50 && this.f44227x0 != i10) {
                this.f44227x0 = i10;
                m5925W();
                m5922S();
            }
            this.f44223t0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: W */
    public final void m5925W() {
        int i10;
        int i11 = this.f44225v0;
        if (i11 != 0 && (i10 = this.f44227x0) != 0) {
            this.f44224u0 = i11;
            this.f44226w0 = i10;
            return;
        }
        int i12 = this.f44227x0;
        if (i12 > 0) {
            this.f44226w0 = i12;
            this.f44224u0 = ((this.f44276h0 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f44224u0 = i11;
            this.f44226w0 = ((this.f44276h0 + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f44276h0) + 1.5d);
            this.f44224u0 = iSqrt;
            this.f44226w0 = ((this.f44276h0 + iSqrt) - 1) / iSqrt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    @Override // g5.C2517g
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5926c(z4.C8864b r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.C2204a.mo5926c(z4.b, boolean):void");
    }
}
