package p001o;

import java.util.ArrayList;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class xf2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[PHI: r8 r16
      0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[PHI: r8 r16
      0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v40, types: [o.zt3] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.zt3] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m56207a(au3 au3Var, sda sdaVar, int i, int i2, yf2 yf2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        zt3 zt3Var;
        int i4;
        zt3 zt3Var2;
        tt3 tt3Var;
        fzf fzfVar;
        fzf fzfVar2;
        zt3 zt3Var3;
        tt3 tt3Var2;
        zt3 zt3Var4;
        fzf fzfVar3;
        zt3 zt3Var5;
        zt3 zt3Var6;
        int size;
        ArrayList arrayList;
        int i5;
        boolean z4;
        boolean z5;
        zt3 zt3Var7;
        zt3 zt3Var8;
        int i6;
        int i7 = i;
        zt3 zt3Var9 = yf2Var.f55393a;
        zt3 zt3Var10 = yf2Var.f55395c;
        zt3 zt3Var11 = yf2Var.f55394b;
        zt3 zt3Var12 = yf2Var.f55396d;
        zt3 zt3Var13 = yf2Var.f55397e;
        float f = yf2Var.f55403k;
        boolean z6 = au3Var.b0[i7] == zt3.EnumC18702b.WRAP_CONTENT;
        if (i7 == 0) {
            int i8 = zt3Var13.J0;
            z = i8 == 0;
            z2 = i8 == 1;
            z3 = i8 == 2;
        } else {
            int i9 = zt3Var13.K0;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
            }
        }
        boolean z7 = z2;
        boolean z8 = false;
        boolean z9 = z;
        ?? r8 = zt3Var9;
        while (true) {
            if (z8) {
                break;
            }
            tt3 tt3Var3 = r8.f57639Y[i2];
            int i10 = z3 ? 1 : 4;
            int iM50473f = tt3Var3.m50473f();
            zt3.EnumC18702b enumC18702b = r8.b0[i7];
            float f2 = f;
            zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
            if (enumC18702b == enumC18702b2 && r8.f57665y[i7] == 0) {
                z4 = z8;
                z5 = true;
            } else {
                z4 = z8;
                z5 = false;
            }
            tt3 tt3Var4 = tt3Var3.f47687f;
            if (tt3Var4 != null && r8 != zt3Var9) {
                iM50473f += tt3Var4.m50473f();
            }
            int i11 = iM50473f;
            if (!z3 || r8 == zt3Var9 || r8 == zt3Var11) {
                zt3Var7 = zt3Var13;
            } else {
                zt3Var7 = zt3Var13;
                i10 = 8;
            }
            tt3 tt3Var5 = tt3Var3.f47687f;
            if (tt3Var5 != null) {
                if (r8 == zt3Var11) {
                    zt3Var8 = zt3Var9;
                    sdaVar.m48242h(tt3Var3.f47690i, tt3Var5.f47690i, i11, 6);
                } else {
                    zt3Var8 = zt3Var9;
                    sdaVar.m48242h(tt3Var3.f47690i, tt3Var5.f47690i, i11, 8);
                }
                if (z5 && !z3) {
                    i10 = 5;
                }
                sdaVar.m48239e(tt3Var3.f47690i, tt3Var3.f47687f.f47690i, i11, (r8 == zt3Var11 && z3 && r8.j0(i7)) ? 5 : i10);
            } else {
                zt3Var8 = zt3Var9;
            }
            if (z6) {
                if (r8.m59845X() == 8 || r8.b0[i7] != enumC18702b2) {
                    i6 = 0;
                } else {
                    tt3[] tt3VarArr = r8.f57639Y;
                    i6 = 0;
                    sdaVar.m48242h(tt3VarArr[i2 + 1].f47690i, tt3VarArr[i2].f47690i, 0, 5);
                }
                sdaVar.m48242h(r8.f57639Y[i2].f47690i, au3Var.f57639Y[i2].f47690i, i6, 8);
            }
            tt3 tt3Var6 = r8.f57639Y[i2 + 1].f47687f;
            if (tt3Var6 != null) {
                ?? r1 = tt3Var6.f47685d;
                tt3 tt3Var7 = r1.f57639Y[i2].f47687f;
                if (tt3Var7 != null && tt3Var7.f47685d == r8) {
                    fzfVar = r1;
                }
            }
            if (fzfVar != null) {
                r8 = fzfVar;
                z8 = z4;
            } else {
                z8 = true;
            }
            zt3Var13 = zt3Var7;
            f = f2;
            zt3Var9 = zt3Var8;
            r8 = r8;
        }
        zt3 zt3Var14 = zt3Var13;
        float f3 = f;
        zt3 zt3Var15 = zt3Var9;
        if (zt3Var12 != null) {
            int i12 = i2 + 1;
            if (zt3Var10.f57639Y[i12].f47687f != null) {
                tt3 tt3Var8 = zt3Var12.f57639Y[i12];
                if (!(zt3Var12.b0[i7] == zt3.EnumC18702b.MATCH_CONSTRAINT && zt3Var12.f57665y[i7] == 0) || z3) {
                    if (z3) {
                        tt3 tt3Var9 = tt3Var8.f47687f;
                        if (tt3Var9.f47685d == au3Var) {
                            sdaVar.m48239e(tt3Var8.f47690i, tt3Var9.f47690i, -tt3Var8.m50473f(), 4);
                        }
                    }
                    sdaVar.m48244j(tt3Var8.f47690i, zt3Var10.f57639Y[i12].f47687f.f47690i, -tt3Var8.m50473f(), 6);
                } else {
                    tt3 tt3Var10 = tt3Var8.f47687f;
                    if (tt3Var10.f47685d == au3Var) {
                        sdaVar.m48239e(tt3Var8.f47690i, tt3Var10.f47690i, -tt3Var8.m50473f(), 5);
                    }
                    sdaVar.m48244j(tt3Var8.f47690i, zt3Var10.f57639Y[i12].f47687f.f47690i, -tt3Var8.m50473f(), 6);
                }
            }
        }
        if (z6) {
            int i13 = i2 + 1;
            fzf fzfVar4 = au3Var.f57639Y[i13].f47690i;
            tt3 tt3Var11 = zt3Var10.f57639Y[i13];
            sdaVar.m48242h(fzfVar4, tt3Var11.f47690i, tt3Var11.m50473f(), 8);
        }
        ArrayList arrayList2 = yf2Var.f55400h;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f4 = (!yf2Var.f55410r || yf2Var.f55412t) ? f3 : yf2Var.f55402j;
            float f5 = 0.0f;
            float f6 = 0.0f;
            zt3 zt3Var16 = null;
            int i14 = 0;
            while (i14 < size) {
                zt3 zt3Var17 = (zt3) arrayList2.get(i14);
                float f7 = zt3Var17.N0[i7];
                if (f7 < f5) {
                    if (yf2Var.f55412t) {
                        tt3[] tt3VarArr2 = zt3Var17.f57639Y;
                        sdaVar.m48239e(tt3VarArr2[i2 + 1].f47690i, tt3VarArr2[i2].f47690i, 0, 4);
                        arrayList = arrayList2;
                        i5 = size;
                        i14++;
                        size = i5;
                        arrayList2 = arrayList;
                        f5 = 0.0f;
                    } else {
                        f7 = 1.0f;
                        f5 = 0.0f;
                    }
                }
                if (f7 == f5) {
                    tt3[] tt3VarArr3 = zt3Var17.f57639Y;
                    sdaVar.m48239e(tt3VarArr3[i2 + 1].f47690i, tt3VarArr3[i2].f47690i, 0, 8);
                    arrayList = arrayList2;
                    i5 = size;
                    i14++;
                    size = i5;
                    arrayList2 = arrayList;
                    f5 = 0.0f;
                } else {
                    if (zt3Var16 != null) {
                        tt3[] tt3VarArr4 = zt3Var16.f57639Y;
                        fzf fzfVar5 = tt3VarArr4[i2].f47690i;
                        int i15 = i2 + 1;
                        fzf fzfVar6 = tt3VarArr4[i15].f47690i;
                        tt3[] tt3VarArr5 = zt3Var17.f57639Y;
                        arrayList = arrayList2;
                        fzf fzfVar7 = tt3VarArr5[i2].f47690i;
                        fzf fzfVar8 = tt3VarArr5[i15].f47690i;
                        i5 = size;
                        zo0 zo0VarM48252r = sdaVar.m48252r();
                        zo0VarM48252r.m59648l(f6, f4, f7, fzfVar5, fzfVar6, fzfVar7, fzfVar8);
                        sdaVar.m48238d(zo0VarM48252r);
                    } else {
                        arrayList = arrayList2;
                        i5 = size;
                    }
                    zt3Var16 = zt3Var17;
                    f6 = f7;
                    i14++;
                    size = i5;
                    arrayList2 = arrayList;
                    f5 = 0.0f;
                }
            }
        }
        if (zt3Var11 != null && (zt3Var11 == zt3Var12 || z3)) {
            tt3 tt3Var12 = zt3Var15.f57639Y[i2];
            int i16 = i2 + 1;
            tt3 tt3Var13 = zt3Var10.f57639Y[i16];
            tt3 tt3Var14 = tt3Var12.f47687f;
            fzf fzfVar9 = tt3Var14 != null ? tt3Var14.f47690i : null;
            tt3 tt3Var15 = tt3Var13.f47687f;
            fzf fzfVar10 = tt3Var15 != null ? tt3Var15.f47690i : null;
            tt3 tt3Var16 = zt3Var11.f57639Y[i2];
            if (zt3Var12 != null) {
                tt3Var13 = zt3Var12.f57639Y[i16];
            }
            if (fzfVar9 != null && fzfVar10 != null) {
                sdaVar.m48237c(tt3Var16.f47690i, fzfVar9, tt3Var16.m50473f(), i7 == 0 ? zt3Var14.q0 : zt3Var14.r0, fzfVar10, tt3Var13.f47690i, tt3Var13.m50473f(), 7);
            }
        } else if (!z9 || zt3Var11 == null) {
            int i17 = 8;
            if (z7 && zt3Var11 != null) {
                int i18 = yf2Var.f55402j;
                boolean z10 = i18 > 0 && yf2Var.f55401i == i18;
                zt3 zt3Var18 = zt3Var11;
                zt3 zt3Var19 = zt3Var18;
                while (zt3Var19 != null) {
                    zt3 zt3Var20 = zt3Var19.P0[i7];
                    while (zt3Var20 != null && zt3Var20.m59845X() == i17) {
                        zt3Var20 = zt3Var20.P0[i7];
                    }
                    if (zt3Var19 == zt3Var11 || zt3Var19 == zt3Var12 || zt3Var20 == null) {
                        zt3Var = zt3Var18;
                        i4 = i17;
                    } else {
                        zt3 zt3Var21 = zt3Var20 == zt3Var12 ? null : zt3Var20;
                        tt3 tt3Var17 = zt3Var19.f57639Y[i2];
                        fzf fzfVar11 = tt3Var17.f47690i;
                        tt3 tt3Var18 = tt3Var17.f47687f;
                        if (tt3Var18 != null) {
                            fzf fzfVar12 = tt3Var18.f47690i;
                        }
                        int i19 = i2 + 1;
                        fzf fzfVar13 = zt3Var18.f57639Y[i19].f47690i;
                        int iM50473f2 = tt3Var17.m50473f();
                        int iM50473f3 = zt3Var19.f57639Y[i19].m50473f();
                        if (zt3Var21 != null) {
                            tt3Var = zt3Var21.f57639Y[i2];
                            fzf fzfVar14 = tt3Var.f47690i;
                            zt3Var2 = zt3Var21;
                            tt3 tt3Var19 = tt3Var.f47687f;
                            fzfVar2 = tt3Var19 != null ? tt3Var19.f47690i : null;
                            fzfVar = fzfVar14;
                        } else {
                            zt3Var2 = zt3Var21;
                            tt3Var = zt3Var12.f57639Y[i2];
                            fzfVar = tt3Var != null ? tt3Var.f47690i : null;
                            fzfVar2 = zt3Var19.f57639Y[i19].f47690i;
                        }
                        if (tt3Var != null) {
                            iM50473f3 += tt3Var.m50473f();
                        }
                        int i20 = iM50473f3;
                        int iM50473f4 = zt3Var18.f57639Y[i19].m50473f() + iM50473f2;
                        int i21 = z10 ? 8 : 4;
                        if (fzfVar11 == null || fzfVar13 == null || fzfVar == null || fzfVar2 == null) {
                            zt3Var3 = zt3Var2;
                            zt3Var = zt3Var18;
                            i4 = 8;
                        } else {
                            zt3Var3 = zt3Var2;
                            zt3Var = zt3Var18;
                            i4 = 8;
                            sdaVar.m48237c(fzfVar11, fzfVar13, iM50473f4, 0.5f, fzfVar, fzfVar2, i20, i21);
                        }
                        zt3Var20 = zt3Var3;
                    }
                    zt3Var18 = zt3Var19.m59845X() != i4 ? zt3Var19 : zt3Var;
                    zt3Var19 = zt3Var20;
                    i17 = i4;
                    i7 = i;
                }
                tt3 tt3Var20 = zt3Var11.f57639Y[i2];
                tt3 tt3Var21 = zt3Var15.f57639Y[i2].f47687f;
                int i22 = i2 + 1;
                tt3 tt3Var22 = zt3Var12.f57639Y[i22];
                tt3 tt3Var23 = zt3Var10.f57639Y[i22].f47687f;
                if (tt3Var21 == null) {
                    i3 = 5;
                } else if (zt3Var11 != zt3Var12) {
                    i3 = 5;
                    sdaVar.m48239e(tt3Var20.f47690i, tt3Var21.f47690i, tt3Var20.m50473f(), 5);
                } else {
                    i3 = 5;
                    if (tt3Var23 != null) {
                        sdaVar.m48237c(tt3Var20.f47690i, tt3Var21.f47690i, tt3Var20.m50473f(), 0.5f, tt3Var22.f47690i, tt3Var23.f47690i, tt3Var22.m50473f(), 5);
                    }
                }
                if (tt3Var23 != null && zt3Var11 != zt3Var12) {
                    sdaVar.m48239e(tt3Var22.f47690i, tt3Var23.f47690i, -tt3Var22.m50473f(), i3);
                }
            }
        } else {
            int i23 = yf2Var.f55402j;
            boolean z11 = i23 > 0 && yf2Var.f55401i == i23;
            zt3 zt3Var22 = zt3Var11;
            zt3 zt3Var23 = zt3Var22;
            while (zt3Var23 != null) {
                zt3 zt3Var24 = zt3Var23.P0[i7];
                while (zt3Var24 != null && zt3Var24.m59845X() == 8) {
                    zt3Var24 = zt3Var24.P0[i7];
                }
                if (zt3Var24 != null || zt3Var23 == zt3Var12) {
                    tt3 tt3Var24 = zt3Var23.f57639Y[i2];
                    fzf fzfVar15 = tt3Var24.f47690i;
                    tt3 tt3Var25 = tt3Var24.f47687f;
                    fzf fzfVar16 = tt3Var25 != null ? tt3Var25.f47690i : null;
                    if (zt3Var22 != zt3Var23) {
                        fzfVar16 = zt3Var22.f57639Y[i2 + 1].f47690i;
                    } else if (zt3Var23 == zt3Var11) {
                        tt3 tt3Var26 = zt3Var15.f57639Y[i2].f47687f;
                        fzfVar16 = tt3Var26 != null ? tt3Var26.f47690i : null;
                    }
                    int iM50473f5 = tt3Var24.m50473f();
                    int i24 = i2 + 1;
                    int iM50473f6 = zt3Var23.f57639Y[i24].m50473f();
                    if (zt3Var24 != null) {
                        tt3Var2 = zt3Var24.f57639Y[i2];
                        fzfVar3 = tt3Var2.f47690i;
                    } else {
                        tt3Var2 = zt3Var10.f57639Y[i24].f47687f;
                        if (tt3Var2 != null) {
                            fzfVar3 = tt3Var2.f47690i;
                        } else {
                            zt3Var4 = zt3Var24;
                            fzfVar3 = null;
                            fzf fzfVar17 = zt3Var23.f57639Y[i24].f47690i;
                            if (tt3Var2 != null) {
                                iM50473f6 += tt3Var2.m50473f();
                            }
                            int iM50473f7 = iM50473f5 + zt3Var22.f57639Y[i24].m50473f();
                            if (fzfVar15 != null || fzfVar16 == null || fzfVar3 == null || fzfVar17 == null) {
                                zt3Var5 = zt3Var4;
                            } else {
                                if (zt3Var23 == zt3Var11) {
                                    iM50473f7 = zt3Var11.f57639Y[i2].m50473f();
                                }
                                int i25 = iM50473f7;
                                zt3Var5 = zt3Var4;
                                zt3Var6 = zt3Var22;
                                sdaVar.m48237c(fzfVar15, fzfVar16, i25, 0.5f, fzfVar3, fzfVar17, zt3Var23 == zt3Var12 ? zt3Var12.f57639Y[i24].m50473f() : iM50473f6, z11 ? 8 : 5);
                                if (zt3Var23.m59845X() != 8) {
                                    zt3Var23 = zt3Var6;
                                }
                                zt3Var22 = zt3Var23;
                                zt3Var23 = zt3Var5;
                            }
                        }
                    }
                    zt3Var4 = zt3Var24;
                    fzf fzfVar172 = zt3Var23.f57639Y[i24].f47690i;
                    if (tt3Var2 != null) {
                    }
                    int iM50473f72 = iM50473f5 + zt3Var22.f57639Y[i24].m50473f();
                    if (fzfVar15 != null) {
                    }
                    zt3Var5 = zt3Var4;
                } else {
                    zt3Var5 = zt3Var24;
                }
                zt3Var6 = zt3Var22;
                if (zt3Var23.m59845X() != 8) {
                }
                zt3Var22 = zt3Var23;
                zt3Var23 = zt3Var5;
            }
        }
        if ((!z9 && !z7) || zt3Var11 == null || zt3Var11 == zt3Var12) {
            return;
        }
        tt3[] tt3VarArr6 = zt3Var11.f57639Y;
        tt3 tt3Var27 = tt3VarArr6[i2];
        if (zt3Var12 == null) {
            zt3Var12 = zt3Var11;
        }
        int i26 = i2 + 1;
        tt3 tt3Var28 = zt3Var12.f57639Y[i26];
        tt3 tt3Var29 = tt3Var27.f47687f;
        fzf fzfVar18 = tt3Var29 != null ? tt3Var29.f47690i : null;
        tt3 tt3Var30 = tt3Var28.f47687f;
        fzf fzfVar19 = tt3Var30 != null ? tt3Var30.f47690i : null;
        if (zt3Var10 != zt3Var12) {
            tt3 tt3Var31 = zt3Var10.f57639Y[i26].f47687f;
            fzfVar19 = tt3Var31 != null ? tt3Var31.f47690i : null;
        }
        if (zt3Var11 == zt3Var12) {
            tt3Var28 = tt3VarArr6[i26];
        }
        if (fzfVar18 == null || fzfVar19 == null) {
            return;
        }
        sdaVar.m48237c(tt3Var27.f47690i, fzfVar18, tt3Var27.m50473f(), 0.5f, fzfVar19, tt3Var28.f47690i, zt3Var12.f57639Y[i26].m50473f(), 5);
    }

    /* renamed from: b */
    public static void m56208b(au3 au3Var, sda sdaVar, ArrayList arrayList, int i) {
        int i2;
        yf2[] yf2VarArr;
        int i3;
        if (i == 0) {
            i2 = au3Var.g1;
            yf2VarArr = au3Var.j1;
            i3 = 0;
        } else {
            i2 = au3Var.h1;
            yf2VarArr = au3Var.i1;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            yf2 yf2Var = yf2VarArr[i4];
            yf2Var.m57718a();
            if (arrayList == null || arrayList.contains(yf2Var.f55393a)) {
                m56207a(au3Var, sdaVar, i, i3, yf2Var);
            }
        }
    }
}
