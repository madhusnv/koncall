package p001o;

import java.util.HashMap;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public class ya1 extends dy7 {
    public int X0 = 0;
    public boolean Y0 = true;
    public int Z0 = 0;
    public boolean a1 = false;

    public int A1() {
        return this.X0;
    }

    public int B1() {
        return this.Z0;
    }

    public int C1() {
        int i = this.X0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public void D1() {
        for (int i = 0; i < this.W0; i++) {
            zt3 zt3Var = this.V0[i];
            if (this.Y0 || zt3Var.mo47184h()) {
                int i2 = this.X0;
                if (i2 == 0 || i2 == 1) {
                    zt3Var.X0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    zt3Var.X0(1, true);
                }
            }
        }
    }

    public void E1(boolean z) {
        this.Y0 = z;
    }

    public void F1(int i) {
        this.X0 = i;
    }

    public void G1(int i) {
        this.Z0 = i;
    }

    @Override // p001o.zt3
    /* renamed from: g */
    public void mo47183g(sda sdaVar, boolean z) {
        tt3[] tt3VarArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        tt3[] tt3VarArr2 = this.f57639Y;
        tt3VarArr2[0] = this.f57631Q;
        tt3VarArr2[2] = this.f57632R;
        tt3VarArr2[1] = this.f57633S;
        tt3VarArr2[3] = this.f57634T;
        int i4 = 0;
        while (true) {
            tt3VarArr = this.f57639Y;
            if (i4 >= tt3VarArr.length) {
                break;
            }
            tt3 tt3Var = tt3VarArr[i4];
            tt3Var.f47690i = sdaVar.m48251q(tt3Var);
            i4++;
        }
        int i5 = this.X0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        tt3 tt3Var2 = tt3VarArr[i5];
        if (!this.a1) {
            y1();
        }
        if (this.a1) {
            this.a1 = false;
            int i6 = this.X0;
            if (i6 == 0 || i6 == 1) {
                sdaVar.m48240f(this.f57631Q.f47690i, this.h0);
                sdaVar.m48240f(this.f57633S.f47690i, this.h0);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    sdaVar.m48240f(this.f57632R.f47690i, this.i0);
                    sdaVar.m48240f(this.f57634T.f47690i, this.i0);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.W0; i7++) {
            zt3 zt3Var = this.V0[i7];
            if ((this.Y0 || zt3Var.mo47184h()) && ((((i2 = this.X0) == 0 || i2 == 1) && zt3Var.m59825C() == zt3.EnumC18702b.MATCH_CONSTRAINT && zt3Var.f57631Q.f47687f != null && zt3Var.f57633S.f47687f != null) || (((i3 = this.X0) == 2 || i3 == 3) && zt3Var.m59843V() == zt3.EnumC18702b.MATCH_CONSTRAINT && zt3Var.f57632R.f47687f != null && zt3Var.f57634T.f47687f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f57631Q.m50479l() || this.f57633S.m50479l();
        boolean z4 = this.f57632R.m50479l() || this.f57634T.m50479l();
        int i8 = !(!z2 && (((i = this.X0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.W0; i9++) {
            zt3 zt3Var2 = this.V0[i9];
            if (this.Y0 || zt3Var2.mo47184h()) {
                fzf fzfVarM48251q = sdaVar.m48251q(zt3Var2.f57639Y[this.X0]);
                tt3[] tt3VarArr3 = zt3Var2.f57639Y;
                int i10 = this.X0;
                tt3 tt3Var3 = tt3VarArr3[i10];
                tt3Var3.f47690i = fzfVarM48251q;
                tt3 tt3Var4 = tt3Var3.f47687f;
                int i11 = (tt3Var4 == null || tt3Var4.f47685d != this) ? 0 : tt3Var3.f47688g + 0;
                if (i10 == 0 || i10 == 2) {
                    sdaVar.m48243i(tt3Var2.f47690i, fzfVarM48251q, this.Z0 - i11, z2);
                } else {
                    sdaVar.m48241g(tt3Var2.f47690i, fzfVarM48251q, this.Z0 + i11, z2);
                }
                sdaVar.m48239e(tt3Var2.f47690i, fzfVarM48251q, this.Z0 + i11, i8);
            }
        }
        int i12 = this.X0;
        if (i12 == 0) {
            sdaVar.m48239e(this.f57633S.f47690i, this.f57631Q.f47690i, 0, 8);
            sdaVar.m48239e(this.f57631Q.f47690i, this.c0.f57633S.f47690i, 0, 4);
            sdaVar.m48239e(this.f57631Q.f47690i, this.c0.f57631Q.f47690i, 0, 0);
            return;
        }
        if (i12 == 1) {
            sdaVar.m48239e(this.f57631Q.f47690i, this.f57633S.f47690i, 0, 8);
            sdaVar.m48239e(this.f57631Q.f47690i, this.c0.f57631Q.f47690i, 0, 4);
            sdaVar.m48239e(this.f57631Q.f47690i, this.c0.f57633S.f47690i, 0, 0);
        } else if (i12 == 2) {
            sdaVar.m48239e(this.f57634T.f47690i, this.f57632R.f47690i, 0, 8);
            sdaVar.m48239e(this.f57632R.f47690i, this.c0.f57634T.f47690i, 0, 4);
            sdaVar.m48239e(this.f57632R.f47690i, this.c0.f57632R.f47690i, 0, 0);
        } else if (i12 == 3) {
            sdaVar.m48239e(this.f57632R.f47690i, this.f57634T.f47690i, 0, 8);
            sdaVar.m48239e(this.f57632R.f47690i, this.c0.f57632R.f47690i, 0, 4);
            sdaVar.m48239e(this.f57632R.f47690i, this.c0.f57634T.f47690i, 0, 0);
        }
    }

    @Override // p001o.zt3
    /* renamed from: h */
    public boolean mo47184h() {
        return true;
    }

    @Override // p001o.dy7, p001o.zt3
    /* renamed from: n */
    public void mo23956n(zt3 zt3Var, HashMap map) {
        super.mo23956n(zt3Var, map);
        ya1 ya1Var = (ya1) zt3Var;
        this.X0 = ya1Var.X0;
        this.Y0 = ya1Var.Y0;
        this.Z0 = ya1Var.Z0;
    }

    @Override // p001o.zt3
    public boolean p0() {
        return this.a1;
    }

    @Override // p001o.zt3
    public boolean q0() {
        return this.a1;
    }

    @Override // p001o.zt3
    public String toString() {
        String str = "[Barrier] " + m59862v() + " {";
        for (int i = 0; i < this.W0; i++) {
            zt3 zt3Var = this.V0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + zt3Var.m59862v();
        }
        return str + "}";
    }

    public boolean y1() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.W0;
            if (i4 >= i) {
                break;
            }
            zt3 zt3Var = this.V0[i4];
            if ((this.Y0 || zt3Var.mo47184h()) && ((((i2 = this.X0) == 0 || i2 == 1) && !zt3Var.p0()) || (((i3 = this.X0) == 2 || i3 == 3) && !zt3Var.q0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.W0; i5++) {
            zt3 zt3Var2 = this.V0[i5];
            if (this.Y0 || zt3Var2.mo47184h()) {
                if (!z2) {
                    int i6 = this.X0;
                    if (i6 == 0) {
                        iMax = zt3Var2.mo47185q(tt3.EnumC17197a.LEFT).m50472e();
                    } else if (i6 == 1) {
                        iMax = zt3Var2.mo47185q(tt3.EnumC17197a.RIGHT).m50472e();
                    } else if (i6 == 2) {
                        iMax = zt3Var2.mo47185q(tt3.EnumC17197a.TOP).m50472e();
                    } else if (i6 == 3) {
                        iMax = zt3Var2.mo47185q(tt3.EnumC17197a.BOTTOM).m50472e();
                    }
                    z2 = true;
                }
                int i7 = this.X0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, zt3Var2.mo47185q(tt3.EnumC17197a.LEFT).m50472e());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, zt3Var2.mo47185q(tt3.EnumC17197a.RIGHT).m50472e());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, zt3Var2.mo47185q(tt3.EnumC17197a.TOP).m50472e());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, zt3Var2.mo47185q(tt3.EnumC17197a.BOTTOM).m50472e());
                }
            }
        }
        int i8 = iMax + this.Z0;
        int i9 = this.X0;
        if (i9 == 0 || i9 == 1) {
            K0(i8, i8);
        } else {
            N0(i8, i8);
        }
        this.a1 = true;
        return true;
    }

    public boolean z1() {
        return this.Y0;
    }
}
