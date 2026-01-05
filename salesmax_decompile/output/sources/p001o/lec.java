package p001o;

import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class lec {

    /* renamed from: a */
    public static boolean[] f33693a = new boolean[3];

    /* renamed from: a */
    public static void m37038a(au3 au3Var, sda sdaVar, zt3 zt3Var) {
        zt3Var.f57660t = -1;
        zt3Var.f57661u = -1;
        zt3.EnumC18702b enumC18702b = au3Var.b0[0];
        zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.WRAP_CONTENT;
        if (enumC18702b != enumC18702b2 && zt3Var.b0[0] == zt3.EnumC18702b.MATCH_PARENT) {
            int i = zt3Var.f57631Q.f47688g;
            int iM59846Y = au3Var.m59846Y() - zt3Var.f57633S.f47688g;
            tt3 tt3Var = zt3Var.f57631Q;
            tt3Var.f47690i = sdaVar.m48251q(tt3Var);
            tt3 tt3Var2 = zt3Var.f57633S;
            tt3Var2.f47690i = sdaVar.m48251q(tt3Var2);
            sdaVar.m48240f(zt3Var.f57631Q.f47690i, i);
            sdaVar.m48240f(zt3Var.f57633S.f47690i, iM59846Y);
            zt3Var.f57660t = 2;
            zt3Var.T0(i, iM59846Y);
        }
        if (au3Var.b0[1] == enumC18702b2 || zt3Var.b0[1] != zt3.EnumC18702b.MATCH_PARENT) {
            return;
        }
        int i2 = zt3Var.f57632R.f47688g;
        int iM59866z = au3Var.m59866z() - zt3Var.f57634T.f47688g;
        tt3 tt3Var3 = zt3Var.f57632R;
        tt3Var3.f47690i = sdaVar.m48251q(tt3Var3);
        tt3 tt3Var4 = zt3Var.f57634T;
        tt3Var4.f47690i = sdaVar.m48251q(tt3Var4);
        sdaVar.m48240f(zt3Var.f57632R.f47690i, i2);
        sdaVar.m48240f(zt3Var.f57634T.f47690i, iM59866z);
        if (zt3Var.n0 > 0 || zt3Var.m59845X() == 8) {
            tt3 tt3Var5 = zt3Var.f57635U;
            tt3Var5.f47690i = sdaVar.m48251q(tt3Var5);
            sdaVar.m48240f(zt3Var.f57635U.f47690i, zt3Var.n0 + i2);
        }
        zt3Var.f57661u = 2;
        zt3Var.k1(i2, iM59866z);
    }

    /* renamed from: b */
    public static final boolean m37039b(int i, int i2) {
        return (i & i2) == i2;
    }
}
