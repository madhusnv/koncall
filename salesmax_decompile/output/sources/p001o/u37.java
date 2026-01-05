package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p001o.zt3;

/* loaded from: classes2.dex */
public class u37 extends x0j {
    public zt3[] H1;
    public int k1 = -1;
    public int l1 = -1;
    public int m1 = -1;
    public int n1 = -1;
    public int o1 = -1;
    public int p1 = -1;
    public float q1 = 0.5f;
    public float r1 = 0.5f;
    public float s1 = 0.5f;
    public float t1 = 0.5f;
    public float u1 = 0.5f;
    public float v1 = 0.5f;
    public int w1 = 0;
    public int x1 = 0;
    public int y1 = 2;
    public int z1 = 2;
    public int A1 = 0;
    public int B1 = -1;
    public int C1 = 0;
    public ArrayList D1 = new ArrayList();
    public zt3[] E1 = null;
    public zt3[] F1 = null;
    public int[] G1 = null;
    public int I1 = 0;

    /* renamed from: o.u37$a */
    public class C17287a {

        /* renamed from: a */
        public int f48230a;

        /* renamed from: d */
        public tt3 f48233d;

        /* renamed from: e */
        public tt3 f48234e;

        /* renamed from: f */
        public tt3 f48235f;

        /* renamed from: g */
        public tt3 f48236g;

        /* renamed from: h */
        public int f48237h;

        /* renamed from: i */
        public int f48238i;

        /* renamed from: j */
        public int f48239j;

        /* renamed from: k */
        public int f48240k;

        /* renamed from: q */
        public int f48246q;

        /* renamed from: b */
        public zt3 f48231b = null;

        /* renamed from: c */
        public int f48232c = 0;

        /* renamed from: l */
        public int f48241l = 0;

        /* renamed from: m */
        public int f48242m = 0;

        /* renamed from: n */
        public int f48243n = 0;

        /* renamed from: o */
        public int f48244o = 0;

        /* renamed from: p */
        public int f48245p = 0;

        public C17287a(int i, tt3 tt3Var, tt3 tt3Var2, tt3 tt3Var3, tt3 tt3Var4, int i2) {
            this.f48237h = 0;
            this.f48238i = 0;
            this.f48239j = 0;
            this.f48240k = 0;
            this.f48246q = 0;
            this.f48230a = i;
            this.f48233d = tt3Var;
            this.f48234e = tt3Var2;
            this.f48235f = tt3Var3;
            this.f48236g = tt3Var4;
            this.f48237h = u37.this.E1();
            this.f48238i = u37.this.G1();
            this.f48239j = u37.this.F1();
            this.f48240k = u37.this.D1();
            this.f48246q = i2;
        }

        /* renamed from: b */
        public void m50873b(zt3 zt3Var) {
            if (this.f48230a == 0) {
                int iQ2 = u37.this.q2(zt3Var, this.f48246q);
                if (zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    this.f48245p++;
                    iQ2 = 0;
                }
                this.f48241l += iQ2 + (zt3Var.m59845X() != 8 ? u37.this.w1 : 0);
                int iP2 = u37.this.p2(zt3Var, this.f48246q);
                if (this.f48231b == null || this.f48232c < iP2) {
                    this.f48231b = zt3Var;
                    this.f48232c = iP2;
                    this.f48242m = iP2;
                }
            } else {
                int iQ22 = u37.this.q2(zt3Var, this.f48246q);
                int iP22 = u37.this.p2(zt3Var, this.f48246q);
                if (zt3Var.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    this.f48245p++;
                    iP22 = 0;
                }
                this.f48242m += iP22 + (zt3Var.m59845X() != 8 ? u37.this.x1 : 0);
                if (this.f48231b == null || this.f48232c < iQ22) {
                    this.f48231b = zt3Var;
                    this.f48232c = iQ22;
                    this.f48241l = iQ22;
                }
            }
            this.f48244o++;
        }

        /* renamed from: c */
        public void m50874c() {
            this.f48232c = 0;
            this.f48231b = null;
            this.f48241l = 0;
            this.f48242m = 0;
            this.f48243n = 0;
            this.f48244o = 0;
            this.f48245p = 0;
        }

        /* renamed from: d */
        public void m50875d(boolean z, int i, boolean z2) {
            zt3 zt3Var;
            char c;
            float f;
            float f2;
            int i2 = this.f48244o;
            for (int i3 = 0; i3 < i2 && this.f48243n + i3 < u37.this.I1; i3++) {
                zt3 zt3Var2 = u37.this.H1[this.f48243n + i3];
                if (zt3Var2 != null) {
                    zt3Var2.x0();
                }
            }
            if (i2 == 0 || this.f48231b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.f48243n + i7 >= u37.this.I1) {
                    break;
                }
                zt3 zt3Var3 = u37.this.H1[this.f48243n + i7];
                if (zt3Var3 != null && zt3Var3.m59845X() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            zt3 zt3Var4 = null;
            if (this.f48230a != 0) {
                zt3 zt3Var5 = this.f48231b;
                zt3Var5.S0(u37.this.k1);
                int i8 = this.f48237h;
                if (i > 0) {
                    i8 += u37.this.w1;
                }
                if (z) {
                    zt3Var5.f57633S.m50468a(this.f48235f, i8);
                    if (z2) {
                        zt3Var5.f57631Q.m50468a(this.f48233d, this.f48239j);
                    }
                    if (i > 0) {
                        this.f48235f.f47685d.f57631Q.m50468a(zt3Var5.f57633S, 0);
                    }
                } else {
                    zt3Var5.f57631Q.m50468a(this.f48233d, i8);
                    if (z2) {
                        zt3Var5.f57633S.m50468a(this.f48235f, this.f48239j);
                    }
                    if (i > 0) {
                        this.f48233d.f47685d.f57633S.m50468a(zt3Var5.f57631Q, 0);
                    }
                }
                for (int i9 = 0; i9 < i2 && this.f48243n + i9 < u37.this.I1; i9++) {
                    zt3 zt3Var6 = u37.this.H1[this.f48243n + i9];
                    if (zt3Var6 != null) {
                        if (i9 == 0) {
                            zt3Var6.m59854l(zt3Var6.f57632R, this.f48234e, this.f48238i);
                            int i10 = u37.this.l1;
                            float f3 = u37.this.r1;
                            if (this.f48243n == 0 && u37.this.n1 != -1) {
                                i10 = u37.this.n1;
                                f3 = u37.this.t1;
                            } else if (z2 && u37.this.p1 != -1) {
                                i10 = u37.this.p1;
                                f3 = u37.this.v1;
                            }
                            zt3Var6.j1(i10);
                            zt3Var6.i1(f3);
                        }
                        if (i9 == i2 - 1) {
                            zt3Var6.m59854l(zt3Var6.f57634T, this.f48236g, this.f48240k);
                        }
                        if (zt3Var4 != null) {
                            zt3Var6.f57632R.m50468a(zt3Var4.f57634T, u37.this.x1);
                            if (i9 == i4) {
                                zt3Var6.f57632R.m50488u(this.f48238i);
                            }
                            zt3Var4.f57634T.m50468a(zt3Var6.f57632R, 0);
                            if (i9 == i5 + 1) {
                                zt3Var4.f57634T.m50488u(this.f48240k);
                            }
                        }
                        if (zt3Var6 == zt3Var5) {
                            zt3Var4 = zt3Var6;
                        } else if (z) {
                            int i11 = u37.this.y1;
                            if (i11 == 0) {
                                zt3Var6.f57633S.m50468a(zt3Var5.f57633S, 0);
                            } else if (i11 == 1) {
                                zt3Var6.f57631Q.m50468a(zt3Var5.f57631Q, 0);
                            } else if (i11 == 2) {
                                zt3Var6.f57631Q.m50468a(zt3Var5.f57631Q, 0);
                                zt3Var6.f57633S.m50468a(zt3Var5.f57633S, 0);
                            }
                            zt3Var4 = zt3Var6;
                        } else {
                            int i12 = u37.this.y1;
                            if (i12 == 0) {
                                zt3Var6.f57631Q.m50468a(zt3Var5.f57631Q, 0);
                            } else if (i12 == 1) {
                                zt3Var6.f57633S.m50468a(zt3Var5.f57633S, 0);
                            } else if (i12 == 2) {
                                if (z3) {
                                    zt3Var6.f57631Q.m50468a(this.f48233d, this.f48237h);
                                    zt3Var6.f57633S.m50468a(this.f48235f, this.f48239j);
                                } else {
                                    zt3Var6.f57631Q.m50468a(zt3Var5.f57631Q, 0);
                                    zt3Var6.f57633S.m50468a(zt3Var5.f57633S, 0);
                                }
                            }
                            zt3Var4 = zt3Var6;
                        }
                    }
                }
                return;
            }
            zt3 zt3Var7 = this.f48231b;
            zt3Var7.j1(u37.this.l1);
            int i13 = this.f48238i;
            if (i > 0) {
                i13 += u37.this.x1;
            }
            zt3Var7.f57632R.m50468a(this.f48234e, i13);
            if (z2) {
                zt3Var7.f57634T.m50468a(this.f48236g, this.f48240k);
            }
            if (i > 0) {
                this.f48234e.f47685d.f57634T.m50468a(zt3Var7.f57632R, 0);
            }
            char c2 = 3;
            if (u37.this.z1 != 3 || zt3Var7.b0()) {
                zt3Var = zt3Var7;
            } else {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.f48243n + i15 >= u37.this.I1) {
                        break;
                    }
                    zt3Var = u37.this.H1[this.f48243n + i15];
                    if (zt3Var.b0()) {
                        break;
                    }
                }
                zt3Var = zt3Var7;
            }
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.f48243n + i17 >= u37.this.I1) {
                    return;
                }
                zt3 zt3Var8 = u37.this.H1[this.f48243n + i17];
                if (zt3Var8 == null) {
                    zt3Var8 = zt3Var4;
                    c = c2;
                } else {
                    if (i16 == 0) {
                        zt3Var8.m59854l(zt3Var8.f57631Q, this.f48233d, this.f48237h);
                    }
                    if (i17 == 0) {
                        int i18 = u37.this.k1;
                        float f4 = u37.this.q1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.f48243n != 0 || u37.this.m1 == -1) {
                            if (z2 && u37.this.o1 != -1) {
                                i18 = u37.this.o1;
                                if (z) {
                                    f2 = u37.this.u1;
                                    f = 1.0f - f2;
                                    f4 = f;
                                } else {
                                    f = u37.this.u1;
                                    f4 = f;
                                }
                            }
                            zt3Var8.S0(i18);
                            zt3Var8.R0(f4);
                        } else {
                            i18 = u37.this.m1;
                            if (z) {
                                f2 = u37.this.s1;
                                f = 1.0f - f2;
                                f4 = f;
                                zt3Var8.S0(i18);
                                zt3Var8.R0(f4);
                            } else {
                                f = u37.this.s1;
                                f4 = f;
                                zt3Var8.S0(i18);
                                zt3Var8.R0(f4);
                            }
                        }
                    }
                    if (i16 == i2 - 1) {
                        zt3Var8.m59854l(zt3Var8.f57633S, this.f48235f, this.f48239j);
                    }
                    if (zt3Var4 != null) {
                        zt3Var8.f57631Q.m50468a(zt3Var4.f57633S, u37.this.w1);
                        if (i16 == i4) {
                            zt3Var8.f57631Q.m50488u(this.f48237h);
                        }
                        zt3Var4.f57633S.m50468a(zt3Var8.f57631Q, 0);
                        if (i16 == i5 + 1) {
                            zt3Var4.f57633S.m50488u(this.f48239j);
                        }
                    }
                    if (zt3Var8 != zt3Var7) {
                        c = 3;
                        if (u37.this.z1 == 3 && zt3Var.b0() && zt3Var8 != zt3Var && zt3Var8.b0()) {
                            zt3Var8.f57635U.m50468a(zt3Var.f57635U, 0);
                        } else {
                            int i19 = u37.this.z1;
                            if (i19 == 0) {
                                zt3Var8.f57632R.m50468a(zt3Var7.f57632R, 0);
                            } else if (i19 == 1) {
                                zt3Var8.f57634T.m50468a(zt3Var7.f57634T, 0);
                            } else if (z3) {
                                zt3Var8.f57632R.m50468a(this.f48234e, this.f48238i);
                                zt3Var8.f57634T.m50468a(this.f48236g, this.f48240k);
                            } else {
                                zt3Var8.f57632R.m50468a(zt3Var7.f57632R, 0);
                                zt3Var8.f57634T.m50468a(zt3Var7.f57634T, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i16++;
                c2 = c;
                zt3Var4 = zt3Var8;
            }
        }

        /* renamed from: e */
        public int m50876e() {
            return this.f48230a == 1 ? this.f48242m - u37.this.x1 : this.f48242m;
        }

        /* renamed from: f */
        public int m50877f() {
            return this.f48230a == 0 ? this.f48241l - u37.this.w1 : this.f48241l;
        }

        /* renamed from: g */
        public void m50878g(int i) {
            int i2 = this.f48245p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f48244o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f48243n + i5 < u37.this.I1; i5++) {
                zt3 zt3Var = u37.this.H1[this.f48243n + i5];
                if (this.f48230a == 0) {
                    if (zt3Var != null && zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT && zt3Var.f57663w == 0) {
                        u37.this.I1(zt3Var, zt3.EnumC18702b.FIXED, i4, zt3Var.m59843V(), zt3Var.m59866z());
                    }
                } else if (zt3Var != null && zt3Var.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT && zt3Var.f57664x == 0) {
                    u37.this.I1(zt3Var, zt3Var.m59825C(), zt3Var.m59846Y(), zt3.EnumC18702b.FIXED, i4);
                }
            }
            m50879h();
        }

        /* renamed from: h */
        public final void m50879h() {
            this.f48241l = 0;
            this.f48242m = 0;
            this.f48231b = null;
            this.f48232c = 0;
            int i = this.f48244o;
            for (int i2 = 0; i2 < i && this.f48243n + i2 < u37.this.I1; i2++) {
                zt3 zt3Var = u37.this.H1[this.f48243n + i2];
                if (this.f48230a == 0) {
                    int iM59846Y = zt3Var.m59846Y();
                    int i3 = u37.this.w1;
                    if (zt3Var.m59845X() == 8) {
                        i3 = 0;
                    }
                    this.f48241l += iM59846Y + i3;
                    int iP2 = u37.this.p2(zt3Var, this.f48246q);
                    if (this.f48231b == null || this.f48232c < iP2) {
                        this.f48231b = zt3Var;
                        this.f48232c = iP2;
                        this.f48242m = iP2;
                    }
                } else {
                    int iQ2 = u37.this.q2(zt3Var, this.f48246q);
                    int iP22 = u37.this.p2(zt3Var, this.f48246q);
                    int i4 = u37.this.x1;
                    if (zt3Var.m59845X() == 8) {
                        i4 = 0;
                    }
                    this.f48242m += iP22 + i4;
                    if (this.f48231b == null || this.f48232c < iQ2) {
                        this.f48231b = zt3Var;
                        this.f48232c = iQ2;
                        this.f48241l = iQ2;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m50880i(int i) {
            this.f48243n = i;
        }

        /* renamed from: j */
        public void m50881j(int i, tt3 tt3Var, tt3 tt3Var2, tt3 tt3Var3, tt3 tt3Var4, int i2, int i3, int i4, int i5, int i6) {
            this.f48230a = i;
            this.f48233d = tt3Var;
            this.f48234e = tt3Var2;
            this.f48235f = tt3Var3;
            this.f48236g = tt3Var4;
            this.f48237h = i2;
            this.f48238i = i3;
            this.f48239j = i4;
            this.f48240k = i5;
            this.f48246q = i6;
        }
    }

    public void A2(float f) {
        this.q1 = f;
    }

    public void B2(int i) {
        this.w1 = i;
    }

    public void C2(int i) {
        this.k1 = i;
    }

    public void D2(float f) {
        this.u1 = f;
    }

    public void E2(int i) {
        this.o1 = i;
    }

    public void F2(float f) {
        this.v1 = f;
    }

    public void G2(int i) {
        this.p1 = i;
    }

    @Override // p001o.x0j
    public void H1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.W0 > 0 && !J1()) {
            M1(0, 0);
            L1(false);
            return;
        }
        int iE1 = E1();
        int iF1 = F1();
        int iG1 = G1();
        int iD1 = D1();
        int[] iArr2 = new int[2];
        int i7 = (i2 - iE1) - iF1;
        int i8 = this.C1;
        if (i8 == 1) {
            i7 = (i4 - iG1) - iD1;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.k1 == -1) {
                this.k1 = 0;
            }
            if (this.l1 == -1) {
                this.l1 = 0;
            }
        } else {
            if (this.k1 == -1) {
                this.k1 = 0;
            }
            if (this.l1 == -1) {
                this.l1 = 0;
            }
        }
        zt3[] zt3VarArr = this.V0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.W0;
            if (i10 >= i5) {
                break;
            }
            if (this.V0[i10].m59845X() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            zt3VarArr = new zt3[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.W0; i13++) {
                zt3 zt3Var = this.V0[i13];
                if (zt3Var.m59845X() != 8) {
                    zt3VarArr[i12] = zt3Var;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.H1 = zt3VarArr;
        this.I1 = i6;
        int i14 = this.A1;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            u2(zt3VarArr, i6, this.C1, i9, iArr2);
        } else if (i14 == 1) {
            z = true;
            iArr = iArr2;
            s2(zt3VarArr, i6, this.C1, i9, iArr2);
        } else if (i14 == 2) {
            z = true;
            iArr = iArr2;
            r2(zt3VarArr, i6, this.C1, i9, iArr2);
        } else if (i14 != 3) {
            z = true;
            iArr = iArr2;
        } else {
            z = true;
            iArr = iArr2;
            t2(zt3VarArr, i6, this.C1, i9, iArr2);
        }
        int iMin = iArr[0] + iE1 + iF1;
        int iMin2 = iArr[z ? 1 : 0] + iG1 + iD1;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        M1(iMin, iMin2);
        p1(iMin);
        Q0(iMin2);
        if (this.W0 <= 0) {
            z = false;
        }
        L1(z);
    }

    public void H2(int i) {
        this.B1 = i;
    }

    public void I2(int i) {
        this.C1 = i;
    }

    public void J2(int i) {
        this.z1 = i;
    }

    public void K2(float f) {
        this.r1 = f;
    }

    public void L2(int i) {
        this.x1 = i;
    }

    public void M2(int i) {
        this.l1 = i;
    }

    public void N2(int i) {
        this.A1 = i;
    }

    @Override // p001o.zt3
    /* renamed from: g */
    public void mo47183g(sda sdaVar, boolean z) {
        super.mo47183g(sdaVar, z);
        boolean z2 = m59835M() != null && ((au3) m59835M()).V1();
        int i = this.A1;
        if (i != 0) {
            if (i == 1) {
                int size = this.D1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C17287a) this.D1.get(i2)).m50875d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                o2(z2);
            } else if (i == 3) {
                int size2 = this.D1.size();
                int i3 = 0;
                while (i3 < size2) {
                    ((C17287a) this.D1.get(i3)).m50875d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.D1.size() > 0) {
            ((C17287a) this.D1.get(0)).m50875d(z2, 0, true);
        }
        L1(false);
    }

    @Override // p001o.dy7, p001o.zt3
    /* renamed from: n */
    public void mo23956n(zt3 zt3Var, HashMap map) {
        super.mo23956n(zt3Var, map);
        u37 u37Var = (u37) zt3Var;
        this.k1 = u37Var.k1;
        this.l1 = u37Var.l1;
        this.m1 = u37Var.m1;
        this.n1 = u37Var.n1;
        this.o1 = u37Var.o1;
        this.p1 = u37Var.p1;
        this.q1 = u37Var.q1;
        this.r1 = u37Var.r1;
        this.s1 = u37Var.s1;
        this.t1 = u37Var.t1;
        this.u1 = u37Var.u1;
        this.v1 = u37Var.v1;
        this.w1 = u37Var.w1;
        this.x1 = u37Var.x1;
        this.y1 = u37Var.y1;
        this.z1 = u37Var.z1;
        this.A1 = u37Var.A1;
        this.B1 = u37Var.B1;
        this.C1 = u37Var.C1;
    }

    public final void o2(boolean z) {
        zt3 zt3Var;
        float f;
        int i;
        if (this.G1 == null || this.F1 == null || this.E1 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.I1; i2++) {
            this.H1[i2].x0();
        }
        int[] iArr = this.G1;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.q1;
        zt3 zt3Var2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.q1;
            } else {
                f = f2;
                i = i5;
            }
            zt3 zt3Var3 = this.F1[i];
            if (zt3Var3 != null && zt3Var3.m59845X() != 8) {
                if (i5 == 0) {
                    zt3Var3.m59854l(zt3Var3.f57631Q, this.f57631Q, E1());
                    zt3Var3.S0(this.k1);
                    zt3Var3.R0(f);
                }
                if (i5 == i3 - 1) {
                    zt3Var3.m59854l(zt3Var3.f57633S, this.f57633S, F1());
                }
                if (i5 > 0 && zt3Var2 != null) {
                    zt3Var3.m59854l(zt3Var3.f57631Q, zt3Var2.f57633S, this.w1);
                    zt3Var2.m59854l(zt3Var2.f57633S, zt3Var3.f57631Q, 0);
                }
                zt3Var2 = zt3Var3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            zt3 zt3Var4 = this.E1[i6];
            if (zt3Var4 != null && zt3Var4.m59845X() != 8) {
                if (i6 == 0) {
                    zt3Var4.m59854l(zt3Var4.f57632R, this.f57632R, G1());
                    zt3Var4.j1(this.l1);
                    zt3Var4.i1(this.r1);
                }
                if (i6 == i4 - 1) {
                    zt3Var4.m59854l(zt3Var4.f57634T, this.f57634T, D1());
                }
                if (i6 > 0 && zt3Var2 != null) {
                    zt3Var4.m59854l(zt3Var4.f57632R, zt3Var2.f57634T, this.x1);
                    zt3Var2.m59854l(zt3Var2.f57634T, zt3Var4.f57632R, 0);
                }
                zt3Var2 = zt3Var4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.C1 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                zt3[] zt3VarArr = this.H1;
                if (i9 < zt3VarArr.length && (zt3Var = zt3VarArr[i9]) != null && zt3Var.m59845X() != 8) {
                    zt3 zt3Var5 = this.F1[i7];
                    zt3 zt3Var6 = this.E1[i8];
                    if (zt3Var != zt3Var5) {
                        zt3Var.m59854l(zt3Var.f57631Q, zt3Var5.f57631Q, 0);
                        zt3Var.m59854l(zt3Var.f57633S, zt3Var5.f57633S, 0);
                    }
                    if (zt3Var != zt3Var6) {
                        zt3Var.m59854l(zt3Var.f57632R, zt3Var6.f57632R, 0);
                        zt3Var.m59854l(zt3Var.f57634T, zt3Var6.f57634T, 0);
                    }
                }
            }
        }
    }

    public final int p2(zt3 zt3Var, int i) {
        if (zt3Var == null) {
            return 0;
        }
        if (zt3Var.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
            int i2 = zt3Var.f57664x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (zt3Var.f57619E * i);
                if (i3 != zt3Var.m59866z()) {
                    zt3Var.d1(true);
                    I1(zt3Var, zt3Var.m59825C(), zt3Var.m59846Y(), zt3.EnumC18702b.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return zt3Var.m59866z();
            }
            if (i2 == 3) {
                return (int) ((zt3Var.m59846Y() * zt3Var.f0) + 0.5f);
            }
        }
        return zt3Var.m59866z();
    }

    public final int q2(zt3 zt3Var, int i) {
        if (zt3Var == null) {
            return 0;
        }
        if (zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
            int i2 = zt3Var.f57663w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (zt3Var.f57616B * i);
                if (i3 != zt3Var.m59846Y()) {
                    zt3Var.d1(true);
                    I1(zt3Var, zt3.EnumC18702b.FIXED, i3, zt3Var.m59843V(), zt3Var.m59866z());
                }
                return i3;
            }
            if (i2 == 1) {
                return zt3Var.m59846Y();
            }
            if (i2 == 3) {
                return (int) ((zt3Var.m59866z() * zt3Var.f0) + 0.5f);
            }
        }
        return zt3Var.m59846Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r2(zt3[] zt3VarArr, int i, int i2, int i3, int[] iArr) {
        int iCeil;
        int iCeil2;
        zt3 zt3Var;
        if (i2 == 0) {
            int i4 = this.B1;
            if (i4 <= 0) {
                i4 = 0;
                int iQ2 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 > 0) {
                        iQ2 += this.w1;
                    }
                    zt3 zt3Var2 = zt3VarArr[i5];
                    if (zt3Var2 != null) {
                        iQ2 += q2(zt3Var2, i3);
                        if (iQ2 > i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            iCeil2 = i4;
            iCeil = 0;
        } else {
            iCeil = this.B1;
            if (iCeil <= 0) {
                iCeil = 0;
                int iP2 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    if (i6 > 0) {
                        iP2 += this.x1;
                    }
                    zt3 zt3Var3 = zt3VarArr[i6];
                    if (zt3Var3 != null) {
                        iP2 += p2(zt3Var3, i3);
                        if (iP2 > i3) {
                            break;
                        } else {
                            iCeil++;
                        }
                    }
                }
            }
            iCeil2 = 0;
        }
        if (this.G1 == null) {
            this.G1 = new int[2];
        }
        boolean z = (iCeil == 0 && i2 == 1) || (iCeil2 == 0 && i2 == 0);
        while (!z) {
            if (i2 == 0) {
                iCeil = (int) Math.ceil(i / iCeil2);
            } else {
                iCeil2 = (int) Math.ceil(i / iCeil);
            }
            zt3[] zt3VarArr2 = this.F1;
            if (zt3VarArr2 == null || zt3VarArr2.length < iCeil2) {
                this.F1 = new zt3[iCeil2];
            } else {
                Arrays.fill(zt3VarArr2, (Object) null);
            }
            zt3[] zt3VarArr3 = this.E1;
            if (zt3VarArr3 == null || zt3VarArr3.length < iCeil) {
                this.E1 = new zt3[iCeil];
            } else {
                Arrays.fill(zt3VarArr3, (Object) null);
            }
            for (int i7 = 0; i7 < iCeil2; i7++) {
                for (int i8 = 0; i8 < iCeil; i8++) {
                    int i9 = (i8 * iCeil2) + i7;
                    if (i2 == 1) {
                        i9 = (i7 * iCeil) + i8;
                    }
                    if (i9 < zt3VarArr.length && (zt3Var = zt3VarArr[i9]) != null) {
                        int iQ22 = q2(zt3Var, i3);
                        zt3 zt3Var4 = this.F1[i7];
                        if (zt3Var4 == null || zt3Var4.m59846Y() < iQ22) {
                            this.F1[i7] = zt3Var;
                        }
                        int iP22 = p2(zt3Var, i3);
                        zt3 zt3Var5 = this.E1[i8];
                        if (zt3Var5 == null || zt3Var5.m59866z() < iP22) {
                            this.E1[i8] = zt3Var;
                        }
                    }
                }
            }
            int iQ23 = 0;
            for (int i10 = 0; i10 < iCeil2; i10++) {
                zt3 zt3Var6 = this.F1[i10];
                if (zt3Var6 != null) {
                    if (i10 > 0) {
                        iQ23 += this.w1;
                    }
                    iQ23 += q2(zt3Var6, i3);
                }
            }
            int iP23 = 0;
            for (int i11 = 0; i11 < iCeil; i11++) {
                zt3 zt3Var7 = this.E1[i11];
                if (zt3Var7 != null) {
                    if (i11 > 0) {
                        iP23 += this.x1;
                    }
                    iP23 += p2(zt3Var7, i3);
                }
            }
            iArr[0] = iQ23;
            iArr[1] = iP23;
            if (i2 != 0) {
                if (iP23 > i3 && iCeil > 1) {
                    iCeil--;
                }
            } else if (iQ23 > i3 && iCeil2 > 1) {
                iCeil2--;
            }
            while (!z) {
            }
        }
        int[] iArr2 = this.G1;
        iArr2[0] = iCeil2;
        iArr2[1] = iCeil;
    }

    public final void s2(zt3[] zt3VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        tt3 tt3Var;
        int iF1;
        tt3 tt3Var2;
        int iD1;
        int i7;
        if (i == 0) {
            return;
        }
        this.D1.clear();
        C17287a c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
        this.D1.add(c17287a);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                zt3 zt3Var = zt3VarArr[i9];
                int iQ2 = q2(zt3Var, i3);
                if (zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.w1 + i8) + iQ2 > i3) && c17287a.f48231b != null;
                if (!z && i9 > 0 && (i7 = this.B1) > 0 && i9 % i7 == 0) {
                    z = true;
                }
                if (z) {
                    c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
                    c17287a.m50880i(i9);
                    this.D1.add(c17287a);
                } else {
                    if (i9 > 0) {
                        i8 += this.w1 + iQ2;
                    }
                    c17287a.m50873b(zt3Var);
                    i9++;
                    i4 = i10;
                }
                i8 = iQ2;
                c17287a.m50873b(zt3Var);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                zt3 zt3Var2 = zt3VarArr[i12];
                int iP2 = p2(zt3Var2, i3);
                if (zt3Var2.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.x1 + i11) + iP2 > i3) && c17287a.f48231b != null;
                if (!z2 && i12 > 0 && (i5 = this.B1) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
                    c17287a.m50880i(i12);
                    this.D1.add(c17287a);
                } else {
                    if (i12 > 0) {
                        i11 += this.x1 + iP2;
                    }
                    c17287a.m50873b(zt3Var2);
                    i12++;
                    i4 = i13;
                }
                i11 = iP2;
                c17287a.m50873b(zt3Var2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.D1.size();
        tt3 tt3Var3 = this.f57631Q;
        tt3 tt3Var4 = this.f57632R;
        tt3 tt3Var5 = this.f57633S;
        tt3 tt3Var6 = this.f57634T;
        int iE1 = E1();
        int iG1 = G1();
        int iF12 = F1();
        int iD12 = D1();
        zt3.EnumC18702b enumC18702bM59825C = m59825C();
        zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
        boolean z3 = enumC18702bM59825C == enumC18702b || m59843V() == enumC18702b;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                C17287a c17287a2 = (C17287a) this.D1.get(i14);
                if (i2 == 0) {
                    c17287a2.m50878g(i3 - c17287a2.m50877f());
                } else {
                    c17287a2.m50878g(i3 - c17287a2.m50876e());
                }
            }
        }
        int i15 = iG1;
        int i16 = iF12;
        int iM50876e = 0;
        int iM50877f = 0;
        int i17 = 0;
        int i18 = iE1;
        tt3 tt3Var7 = tt3Var4;
        tt3 tt3Var8 = tt3Var3;
        int i19 = iD12;
        while (i17 < size) {
            C17287a c17287a3 = (C17287a) this.D1.get(i17);
            if (i2 == 0) {
                if (i17 < size - 1) {
                    tt3Var2 = ((C17287a) this.D1.get(i17 + 1)).f48231b.f57632R;
                    iD1 = 0;
                } else {
                    tt3Var2 = this.f57634T;
                    iD1 = D1();
                }
                tt3 tt3Var9 = c17287a3.f48231b.f57634T;
                tt3 tt3Var10 = tt3Var8;
                tt3 tt3Var11 = tt3Var8;
                int i20 = iM50876e;
                tt3 tt3Var12 = tt3Var7;
                int i21 = iM50877f;
                tt3 tt3Var13 = tt3Var5;
                tt3 tt3Var14 = tt3Var5;
                i6 = i17;
                c17287a3.m50881j(i2, tt3Var10, tt3Var12, tt3Var13, tt3Var2, i18, i15, i16, iD1, i3);
                int iMax = Math.max(i21, c17287a3.m50877f());
                iM50876e = i20 + c17287a3.m50876e();
                if (i6 > 0) {
                    iM50876e += this.x1;
                }
                tt3Var8 = tt3Var11;
                iM50877f = iMax;
                i15 = 0;
                tt3Var7 = tt3Var9;
                tt3Var = tt3Var14;
                int i22 = iD1;
                tt3Var6 = tt3Var2;
                i19 = i22;
            } else {
                tt3 tt3Var15 = tt3Var8;
                int i23 = iM50876e;
                int i24 = iM50877f;
                i6 = i17;
                if (i6 < size - 1) {
                    tt3Var = ((C17287a) this.D1.get(i6 + 1)).f48231b.f57631Q;
                    iF1 = 0;
                } else {
                    tt3Var = this.f57633S;
                    iF1 = F1();
                }
                tt3 tt3Var16 = c17287a3.f48231b.f57633S;
                c17287a3.m50881j(i2, tt3Var15, tt3Var7, tt3Var, tt3Var6, i18, i15, iF1, i19, i3);
                iM50877f = i24 + c17287a3.m50877f();
                int iMax2 = Math.max(i23, c17287a3.m50876e());
                if (i6 > 0) {
                    iM50877f += this.w1;
                }
                iM50876e = iMax2;
                i18 = 0;
                i16 = iF1;
                tt3Var8 = tt3Var16;
            }
            i17 = i6 + 1;
            tt3Var5 = tt3Var;
        }
        iArr[0] = iM50877f;
        iArr[1] = iM50876e;
    }

    public final void t2(zt3[] zt3VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        tt3 tt3Var;
        int iF1;
        tt3 tt3Var2;
        int iD1;
        int i7;
        if (i == 0) {
            return;
        }
        this.D1.clear();
        C17287a c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
        this.D1.add(c17287a);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                i8++;
                zt3 zt3Var = zt3VarArr[i10];
                int iQ2 = q2(zt3Var, i3);
                if (zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i11 = i4;
                boolean z = (i9 == i3 || (this.w1 + i9) + iQ2 > i3) && c17287a.f48231b != null;
                if (!z && i10 > 0 && (i7 = this.B1) > 0 && i8 > i7) {
                    z = true;
                }
                if (z) {
                    c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
                    c17287a.m50880i(i10);
                    this.D1.add(c17287a);
                    i9 = iQ2;
                    i8 = 1;
                } else {
                    i9 = i10 > 0 ? i9 + this.w1 + iQ2 : iQ2;
                }
                c17287a.m50873b(zt3Var);
                i10++;
                i4 = i11;
            }
        } else {
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i) {
                i12++;
                zt3 zt3Var2 = zt3VarArr[i14];
                int iP2 = p2(zt3Var2, i3);
                if (zt3Var2.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i3 || (this.x1 + i13) + iP2 > i3) && c17287a.f48231b != null;
                if (!z2 && i14 > 0 && (i5 = this.B1) > 0 && i12 > i5) {
                    z2 = true;
                }
                if (z2) {
                    c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
                    c17287a.m50880i(i14);
                    this.D1.add(c17287a);
                    i13 = iP2;
                    i12 = 1;
                } else {
                    i13 = i14 > 0 ? i13 + this.x1 + iP2 : iP2;
                }
                c17287a.m50873b(zt3Var2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.D1.size();
        tt3 tt3Var3 = this.f57631Q;
        tt3 tt3Var4 = this.f57632R;
        tt3 tt3Var5 = this.f57633S;
        tt3 tt3Var6 = this.f57634T;
        int iE1 = E1();
        int iG1 = G1();
        int iF12 = F1();
        int iD12 = D1();
        zt3.EnumC18702b enumC18702bM59825C = m59825C();
        zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
        boolean z3 = enumC18702bM59825C == enumC18702b || m59843V() == enumC18702b;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                C17287a c17287a2 = (C17287a) this.D1.get(i16);
                if (i2 == 0) {
                    c17287a2.m50878g(i3 - c17287a2.m50877f());
                } else {
                    c17287a2.m50878g(i3 - c17287a2.m50876e());
                }
            }
        }
        int i17 = iG1;
        int i18 = iF12;
        int iM50876e = 0;
        int iM50877f = 0;
        int i19 = 0;
        int i20 = iE1;
        tt3 tt3Var7 = tt3Var4;
        tt3 tt3Var8 = tt3Var3;
        int i21 = iD12;
        while (i19 < size) {
            C17287a c17287a3 = (C17287a) this.D1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    tt3Var2 = ((C17287a) this.D1.get(i19 + 1)).f48231b.f57632R;
                    iD1 = 0;
                } else {
                    tt3Var2 = this.f57634T;
                    iD1 = D1();
                }
                tt3 tt3Var9 = c17287a3.f48231b.f57634T;
                tt3 tt3Var10 = tt3Var8;
                tt3 tt3Var11 = tt3Var8;
                int i22 = iM50876e;
                tt3 tt3Var12 = tt3Var7;
                int i23 = iM50877f;
                tt3 tt3Var13 = tt3Var5;
                tt3 tt3Var14 = tt3Var5;
                i6 = i19;
                c17287a3.m50881j(i2, tt3Var10, tt3Var12, tt3Var13, tt3Var2, i20, i17, i18, iD1, i3);
                int iMax = Math.max(i23, c17287a3.m50877f());
                iM50876e = i22 + c17287a3.m50876e();
                if (i6 > 0) {
                    iM50876e += this.x1;
                }
                tt3Var8 = tt3Var11;
                iM50877f = iMax;
                i17 = 0;
                tt3Var7 = tt3Var9;
                tt3Var = tt3Var14;
                int i24 = iD1;
                tt3Var6 = tt3Var2;
                i21 = i24;
            } else {
                tt3 tt3Var15 = tt3Var8;
                int i25 = iM50876e;
                int i26 = iM50877f;
                i6 = i19;
                if (i6 < size - 1) {
                    tt3Var = ((C17287a) this.D1.get(i6 + 1)).f48231b.f57631Q;
                    iF1 = 0;
                } else {
                    tt3Var = this.f57633S;
                    iF1 = F1();
                }
                tt3 tt3Var16 = c17287a3.f48231b.f57633S;
                c17287a3.m50881j(i2, tt3Var15, tt3Var7, tt3Var, tt3Var6, i20, i17, iF1, i21, i3);
                iM50877f = i26 + c17287a3.m50877f();
                int iMax2 = Math.max(i25, c17287a3.m50876e());
                if (i6 > 0) {
                    iM50877f += this.w1;
                }
                iM50876e = iMax2;
                i20 = 0;
                i18 = iF1;
                tt3Var8 = tt3Var16;
            }
            i19 = i6 + 1;
            tt3Var5 = tt3Var;
        }
        iArr[0] = iM50877f;
        iArr[1] = iM50876e;
    }

    public final void u2(zt3[] zt3VarArr, int i, int i2, int i3, int[] iArr) {
        C17287a c17287a;
        if (i == 0) {
            return;
        }
        if (this.D1.size() == 0) {
            c17287a = new C17287a(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, i3);
            this.D1.add(c17287a);
        } else {
            C17287a c17287a2 = (C17287a) this.D1.get(0);
            c17287a2.m50874c();
            c17287a = c17287a2;
            c17287a.m50881j(i2, this.f57631Q, this.f57632R, this.f57633S, this.f57634T, E1(), G1(), F1(), D1(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c17287a.m50873b(zt3VarArr[i4]);
        }
        iArr[0] = c17287a.m50877f();
        iArr[1] = c17287a.m50876e();
    }

    public void v2(float f) {
        this.s1 = f;
    }

    public void w2(int i) {
        this.m1 = i;
    }

    public void x2(float f) {
        this.t1 = f;
    }

    public void y2(int i) {
        this.n1 = i;
    }

    public void z2(int i) {
        this.y1 = i;
    }
}
