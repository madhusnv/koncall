package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class rb7 {

    /* renamed from: a */
    public static final ka9.C14756a f43341a = ka9.C14756a.m35230a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    public static gb7 m46483a(ka9 ka9Var) {
        ka9Var.mo22732d();
        String strMo22740t = null;
        String strMo22740t2 = null;
        float fMo22737o = 0.0f;
        String strMo22740t3 = null;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f43341a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 1) {
                strMo22740t3 = ka9Var.mo22740t();
            } else if (iMo22724H == 2) {
                strMo22740t2 = ka9Var.mo22740t();
            } else if (iMo22724H != 3) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                fMo22737o = (float) ka9Var.mo22737o();
            }
        }
        ka9Var.mo22734g();
        return new gb7(strMo22740t, strMo22740t3, strMo22740t2, fMo22737o);
    }
}
