package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class mlf {

    /* renamed from: a */
    public static ka9.C14756a f35660a = ka9.C14756a.m35230a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    public static llf m39316a(ka9 ka9Var, ama amaVar) {
        String strMo22740t = null;
        int iMo22738r = 0;
        boolean zMo22736k = false;
        mg0 mg0VarM51560k = null;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f35660a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                iMo22738r = ka9Var.mo22738r();
            } else if (iMo22724H == 2) {
                mg0VarM51560k = ug0.m51560k(ka9Var, amaVar);
            } else if (iMo22724H != 3) {
                ka9Var.mo22726K();
            } else {
                zMo22736k = ka9Var.mo22736k();
            }
        }
        return new llf(strMo22740t, iMo22738r, mg0VarM51560k, zMo22736k);
    }
}
