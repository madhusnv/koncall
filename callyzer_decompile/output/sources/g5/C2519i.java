package g5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.i */
/* loaded from: classes.dex */
public final class C2519i {

    /* renamed from: a */
    public int f13813a;

    /* renamed from: d */
    public C2514d f13816d;

    /* renamed from: e */
    public C2514d f13817e;

    /* renamed from: f */
    public C2514d f13818f;

    /* renamed from: g */
    public C2514d f13819g;

    /* renamed from: h */
    public int f13820h;

    /* renamed from: i */
    public int f13821i;

    /* renamed from: j */
    public int f13822j;

    /* renamed from: k */
    public int f13823k;

    /* renamed from: q */
    public int f13829q;

    /* renamed from: r */
    public final /* synthetic */ C2520j f13830r;

    /* renamed from: b */
    public C2517g f13814b = null;

    /* renamed from: c */
    public int f13815c = 0;

    /* renamed from: l */
    public int f13824l = 0;

    /* renamed from: m */
    public int f13825m = 0;

    /* renamed from: n */
    public int f13826n = 0;

    /* renamed from: o */
    public int f13827o = 0;

    /* renamed from: p */
    public int f13828p = 0;

    public C2519i(C2520j c2520j, int i10, C2514d c2514d, C2514d c2514d2, C2514d c2514d3, C2514d c2514d4, int i11) {
        this.f13830r = c2520j;
        this.f13813a = i10;
        this.f13816d = c2514d;
        this.f13817e = c2514d2;
        this.f13818f = c2514d3;
        this.f13819g = c2514d4;
        this.f13820h = c2520j.f44279k0;
        this.f13821i = c2520j.f44277i0;
        this.f13822j = c2520j.f44280l0;
        this.f13823k = c2520j.f44278j0;
        this.f13829q = i11;
    }

    /* renamed from: a */
    public final void m6537a(C2517g c2517g) {
        int i10 = this.f13813a;
        C2520j c2520j = this.f13830r;
        if (i10 == 0) {
            int iM6544N = c2520j.m6544N(c2517g, this.f13829q);
            if (c2517g.f13772L[0] == EnumC2516f.MATCH_CONSTRAINT) {
                this.f13828p++;
                iM6544N = 0;
            }
            this.f13824l = iM6544N + (c2517g.f13786Z != 8 ? c2520j.D0 : 0) + this.f13824l;
            int iM6543M = c2520j.m6543M(c2517g, this.f13829q);
            if (this.f13814b == null || this.f13815c < iM6543M) {
                this.f13814b = c2517g;
                this.f13815c = iM6543M;
                this.f13825m = iM6543M;
            }
        } else {
            int iM6544N2 = c2520j.m6544N(c2517g, this.f13829q);
            int iM6543M2 = c2520j.m6543M(c2517g, this.f13829q);
            if (c2517g.f13772L[1] == EnumC2516f.MATCH_CONSTRAINT) {
                this.f13828p++;
                iM6543M2 = 0;
            }
            this.f13825m = iM6543M2 + (c2517g.f13786Z != 8 ? c2520j.E0 : 0) + this.f13825m;
            if (this.f13814b == null || this.f13815c < iM6544N2) {
                this.f13814b = c2517g;
                this.f13815c = iM6544N2;
                this.f13824l = iM6544N2;
            }
        }
        this.f13827o++;
    }

    /* renamed from: b */
    public final void m6538b(int i10, boolean z6) {
        C2520j c2520j;
        int i11;
        int i12;
        C2517g c2517g;
        boolean z10;
        int i13;
        int i14;
        char c2;
        float f6;
        int i15;
        float f10;
        int i16;
        int i17 = this.f13827o;
        int i18 = 0;
        while (true) {
            c2520j = this.f13830r;
            if (i18 >= i17 || (i16 = this.f13826n + i18) >= c2520j.P0) {
                break;
            }
            C2517g c2517g2 = c2520j.O0[i16];
            if (c2517g2 != null) {
                c2517g2.m6530y();
            }
            i18++;
        }
        if (i17 == 0 || this.f13814b == null) {
            return;
        }
        boolean z11 = z6 && i10 == 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = 0; i21 < i17; i21++) {
            int i22 = this.f13826n + i21;
            if (i22 >= c2520j.P0) {
                break;
            }
            C2517g c2517g3 = c2520j.O0[i22];
            if (c2517g3 != null && c2517g3.f13786Z == 0) {
                if (i19 == -1) {
                    i19 = i21;
                }
                i20 = i21;
            }
        }
        if (this.f13813a == 0) {
            C2517g c2517g4 = this.f13814b;
            c2517g4.f44240c0 = c2520j.f44261s0;
            C2514d c2514d = c2517g4.f13764D;
            C2514d c2514d2 = c2517g4.f13762B;
            int i23 = this.f13821i;
            if (i10 > 0) {
                i23 += c2520j.E0;
            }
            c2514d2.m6490a(this.f13817e, i23);
            if (z6) {
                c2514d.m6490a(this.f13819g, this.f13823k);
            }
            if (i10 > 0) {
                this.f13817e.f13754d.f13764D.m6490a(c2514d2, 0);
            }
            if (c2520j.G0 != 3 || c2517g4.f13812z) {
                c2517g = c2517g4;
            } else {
                for (int i24 = 0; i24 < i17; i24++) {
                    int i25 = this.f13826n + i24;
                    if (i25 >= c2520j.P0) {
                        break;
                    }
                    c2517g = c2520j.O0[i25];
                    if (c2517g.f13812z) {
                        break;
                    }
                }
                c2517g = c2517g4;
            }
            int i26 = 0;
            C2517g c2517g5 = null;
            while (i26 < i17) {
                int i27 = this.f13826n + i26;
                if (i27 >= c2520j.P0) {
                    return;
                }
                C2517g c2517g6 = c2520j.O0[i27];
                if (c2517g6 == null) {
                    i14 = i17;
                    z10 = z11;
                    i13 = i20;
                    c2 = 3;
                } else {
                    C2514d c2514d3 = c2517g6.f13764D;
                    C2514d c2514d4 = c2517g6.f13762B;
                    C2514d c2514d5 = c2517g6.f13761A;
                    z10 = z11;
                    if (i26 == 0) {
                        i13 = i20;
                        c2517g6.m6514g(c2514d5, this.f13816d, this.f13820h);
                    } else {
                        i13 = i20;
                    }
                    if (i26 == 0) {
                        int i28 = c2520j.f44260r0;
                        float f11 = c2520j.f44266x0;
                        if (this.f13826n == 0) {
                            i15 = c2520j.f44262t0;
                            f6 = f11;
                            if (i15 != -1) {
                                f10 = c2520j.f44268z0;
                            }
                            c2517g6.f44239b0 = i15;
                            c2517g6.f13783W = f10;
                        } else {
                            f6 = f11;
                        }
                        if (!z6 || (i15 = c2520j.f44264v0) == -1) {
                            i15 = i28;
                            f10 = f6;
                        } else {
                            f10 = c2520j.B0;
                        }
                        c2517g6.f44239b0 = i15;
                        c2517g6.f13783W = f10;
                    }
                    if (i26 == i17 - 1) {
                        i14 = i17;
                        c2517g6.m6514g(c2517g6.f13763C, this.f13818f, this.f13822j);
                    } else {
                        i14 = i17;
                    }
                    if (c2517g5 != null) {
                        C2514d c2514d6 = c2517g5.f13763C;
                        c2514d5.m6490a(c2514d6, c2520j.D0);
                        if (i26 == i19) {
                            int i29 = this.f13820h;
                            if (c2514d5.m6496g()) {
                                c2514d5.f13758h = i29;
                            }
                        }
                        c2514d6.m6490a(c2514d5, 0);
                        if (i26 == i13 + 1) {
                            int i30 = this.f13822j;
                            if (c2514d6.m6496g()) {
                                c2514d6.f13758h = i30;
                            }
                        }
                    }
                    if (c2517g6 != c2517g4) {
                        int i31 = c2520j.G0;
                        c2 = 3;
                        if (i31 == 3 && c2517g.f13812z && c2517g6 != c2517g && c2517g6.f13812z) {
                            c2517g6.f13765E.m6490a(c2517g.f13765E, 0);
                        } else if (i31 == 0) {
                            c2514d4.m6490a(c2514d2, 0);
                        } else if (i31 == 1) {
                            c2514d3.m6490a(c2514d, 0);
                        } else if (z10) {
                            c2514d4.m6490a(this.f13817e, this.f13821i);
                            c2514d3.m6490a(this.f13819g, this.f13823k);
                        } else {
                            c2514d4.m6490a(c2514d2, 0);
                            c2514d3.m6490a(c2514d, 0);
                        }
                    } else {
                        c2 = 3;
                    }
                    c2517g5 = c2517g6;
                }
                i26++;
                z11 = z10;
                i20 = i13;
                i17 = i14;
            }
            return;
        }
        int i32 = i17;
        boolean z12 = z11;
        int i33 = i20;
        C2517g c2517g7 = this.f13814b;
        c2517g7.f44239b0 = c2520j.f44260r0;
        C2514d c2514d7 = c2517g7.f13761A;
        C2514d c2514d8 = c2517g7.f13763C;
        int i34 = this.f13820h;
        if (i10 > 0) {
            i34 += c2520j.D0;
        }
        c2514d7.m6490a(this.f13816d, i34);
        if (z6) {
            c2514d8.m6490a(this.f13818f, this.f13822j);
        }
        if (i10 > 0) {
            this.f13816d.f13754d.f13763C.m6490a(c2514d7, 0);
        }
        int i35 = 0;
        C2517g c2517g8 = null;
        while (true) {
            int i36 = i32;
            if (i35 >= i36 || (i11 = this.f13826n + i35) >= c2520j.P0) {
                return;
            }
            C2517g c2517g9 = c2520j.O0[i11];
            if (c2517g9 == null) {
                i32 = i36;
                c2517g9 = c2517g8;
            } else {
                C2514d c2514d9 = c2517g9.f13762B;
                C2514d c2514d10 = c2517g9.f13763C;
                C2514d c2514d11 = c2517g9.f13761A;
                if (i35 == 0) {
                    c2517g9.m6514g(c2514d9, this.f13817e, this.f13821i);
                    int i37 = c2520j.f44261s0;
                    float f12 = c2520j.f44267y0;
                    if (this.f13826n == 0) {
                        int i38 = c2520j.f44263u0;
                        i32 = i36;
                        i12 = -1;
                        if (i38 != -1) {
                            f12 = c2520j.A0;
                        }
                        i37 = i38;
                        c2517g9.f44240c0 = i37;
                        c2517g9.f13784X = f12;
                    } else {
                        i32 = i36;
                        i12 = -1;
                    }
                    if (z6 && (i38 = c2520j.f44265w0) != i12) {
                        f12 = c2520j.C0;
                        i37 = i38;
                    }
                    c2517g9.f44240c0 = i37;
                    c2517g9.f13784X = f12;
                } else {
                    i32 = i36;
                }
                if (i35 == i32 - 1) {
                    c2517g9.m6514g(c2517g9.f13764D, this.f13819g, this.f13823k);
                }
                if (c2517g8 != null) {
                    C2514d c2514d12 = c2517g8.f13764D;
                    c2514d9.m6490a(c2514d12, c2520j.E0);
                    if (i35 == i19) {
                        int i39 = this.f13821i;
                        if (c2514d9.m6496g()) {
                            c2514d9.f13758h = i39;
                        }
                    }
                    c2514d12.m6490a(c2514d9, 0);
                    if (i35 == i33 + 1) {
                        int i40 = this.f13823k;
                        if (c2514d12.m6496g()) {
                            c2514d12.f13758h = i40;
                        }
                    }
                }
                if (c2517g9 != c2517g7) {
                    int i41 = c2520j.F0;
                    if (i41 == 0) {
                        c2514d11.m6490a(c2514d7, 0);
                    } else if (i41 == 1) {
                        c2514d10.m6490a(c2514d8, 0);
                    } else if (i41 == 2) {
                        if (z12) {
                            c2514d11.m6490a(this.f13816d, this.f13820h);
                            c2514d10.m6490a(this.f13818f, this.f13822j);
                        } else {
                            c2514d11.m6490a(c2514d7, 0);
                            c2514d10.m6490a(c2514d8, 0);
                        }
                    }
                    i35++;
                    c2517g8 = c2517g9;
                }
                i35++;
                c2517g8 = c2517g9;
            }
            i35++;
            c2517g8 = c2517g9;
        }
    }

    /* renamed from: c */
    public final int m6539c() {
        return this.f13813a == 1 ? this.f13825m - this.f13830r.E0 : this.f13825m;
    }

    /* renamed from: d */
    public final int m6540d() {
        return this.f13813a == 0 ? this.f13824l - this.f13830r.D0 : this.f13824l;
    }

    /* renamed from: e */
    public final void m6541e(int i10) {
        C2520j c2520j;
        int i11;
        int i12 = this.f13828p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f13827o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            c2520j = this.f13830r;
            if (i15 >= i13 || (i11 = this.f13826n + i15) >= c2520j.P0) {
                break;
            }
            C2517g c2517g = c2520j.O0[i11];
            if (this.f13813a == 0) {
                if (c2517g != null) {
                    EnumC2516f[] enumC2516fArr = c2517g.f13772L;
                    if (enumC2516fArr[0] == EnumC2516f.MATCH_CONSTRAINT && c2517g.f13799m == 0) {
                        c2520j.m6549L(c2517g, EnumC2516f.FIXED, i14, enumC2516fArr[1], c2517g.m6518k());
                    }
                }
            } else if (c2517g != null) {
                EnumC2516f[] enumC2516fArr2 = c2517g.f13772L;
                if (enumC2516fArr2[1] == EnumC2516f.MATCH_CONSTRAINT && c2517g.f13800n == 0) {
                    int i16 = i14;
                    c2520j.m6549L(c2517g, enumC2516fArr2[0], c2517g.m6519l(), EnumC2516f.FIXED, i16);
                    i14 = i16;
                }
            }
            i15++;
        }
        this.f13824l = 0;
        this.f13825m = 0;
        this.f13814b = null;
        this.f13815c = 0;
        int i17 = this.f13827o;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = this.f13826n + i18;
            if (i19 >= c2520j.P0) {
                return;
            }
            C2517g c2517g2 = c2520j.O0[i19];
            if (this.f13813a == 0) {
                int iM6519l = c2517g2.m6519l();
                int i20 = c2520j.D0;
                if (c2517g2.f13786Z == 8) {
                    i20 = 0;
                }
                this.f13824l = iM6519l + i20 + this.f13824l;
                int iM6543M = c2520j.m6543M(c2517g2, this.f13829q);
                if (this.f13814b == null || this.f13815c < iM6543M) {
                    this.f13814b = c2517g2;
                    this.f13815c = iM6543M;
                    this.f13825m = iM6543M;
                }
            } else {
                int iM6544N = c2520j.m6544N(c2517g2, this.f13829q);
                int iM6543M2 = c2520j.m6543M(c2517g2, this.f13829q);
                int i21 = c2520j.E0;
                if (c2517g2.f13786Z == 8) {
                    i21 = 0;
                }
                this.f13825m = iM6543M2 + i21 + this.f13825m;
                if (this.f13814b == null || this.f13815c < iM6544N) {
                    this.f13814b = c2517g2;
                    this.f13815c = iM6544N;
                    this.f13824l = iM6544N;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m6542f(int i10, C2514d c2514d, C2514d c2514d2, C2514d c2514d3, C2514d c2514d4, int i11, int i12, int i13, int i14, int i15) {
        this.f13813a = i10;
        this.f13816d = c2514d;
        this.f13817e = c2514d2;
        this.f13818f = c2514d3;
        this.f13819g = c2514d4;
        this.f13820h = i11;
        this.f13821i = i12;
        this.f13822j = i13;
        this.f13823k = i14;
        this.f13829q = i15;
    }
}
