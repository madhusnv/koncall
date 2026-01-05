package p001o;

import p001o.tt3;

/* loaded from: classes2.dex */
public class s8d extends x0j {
    @Override // p001o.x0j
    public void H1(int i, int i2, int i3, int i4) {
        int iE1 = E1() + F1() + 0;
        int iG1 = G1() + D1() + 0;
        if (this.W0 > 0) {
            iE1 += this.V0[0].m59846Y();
            iG1 += this.V0[0].m59866z();
        }
        int iMax = Math.max(m59833K(), iE1);
        int iMax2 = Math.max(m59832J(), iG1);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        M1(i2, i4);
        p1(i2);
        Q0(i4);
        L1(this.W0 > 0);
    }

    @Override // p001o.zt3
    /* renamed from: g */
    public void mo47183g(sda sdaVar, boolean z) {
        super.mo47183g(sdaVar, z);
        if (this.W0 > 0) {
            zt3 zt3Var = this.V0[0];
            zt3Var.w0();
            tt3.EnumC17197a enumC17197a = tt3.EnumC17197a.LEFT;
            zt3Var.m59852j(enumC17197a, this, enumC17197a);
            tt3.EnumC17197a enumC17197a2 = tt3.EnumC17197a.RIGHT;
            zt3Var.m59852j(enumC17197a2, this, enumC17197a2);
            tt3.EnumC17197a enumC17197a3 = tt3.EnumC17197a.TOP;
            zt3Var.m59852j(enumC17197a3, this, enumC17197a3);
            tt3.EnumC17197a enumC17197a4 = tt3.EnumC17197a.BOTTOM;
            zt3Var.m59852j(enumC17197a4, this, enumC17197a4);
        }
    }
}
