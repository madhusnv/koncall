package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class zj1 {

    /* renamed from: a */
    public static final ka9.C14756a f57269a = ka9.C14756a.m35230a("ef");

    /* renamed from: b */
    public static final ka9.C14756a f57270b = ka9.C14756a.m35230a("ty", "v");

    /* renamed from: a */
    public static yj1 m59504a(ka9 ka9Var, ama amaVar) {
        ka9Var.mo22732d();
        yj1 yj1Var = null;
        while (true) {
            boolean z = false;
            while (ka9Var.mo22735h()) {
                int iMo22724H = ka9Var.mo22724H(f57270b);
                if (iMo22724H != 0) {
                    if (iMo22724H != 1) {
                        ka9Var.mo22725J();
                        ka9Var.mo22726K();
                    } else if (z) {
                        yj1Var = new yj1(ug0.m51554e(ka9Var, amaVar));
                    } else {
                        ka9Var.mo22726K();
                    }
                } else if (ka9Var.mo22738r() == 0) {
                    z = true;
                }
            }
            ka9Var.mo22734g();
            return yj1Var;
        }
    }

    /* renamed from: b */
    public static yj1 m59505b(ka9 ka9Var, ama amaVar) {
        yj1 yj1Var = null;
        while (ka9Var.mo22735h()) {
            if (ka9Var.mo22724H(f57269a) != 0) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                ka9Var.mo22731c();
                while (ka9Var.mo22735h()) {
                    yj1 yj1VarM59504a = m59504a(ka9Var, amaVar);
                    if (yj1VarM59504a != null) {
                        yj1Var = yj1VarM59504a;
                    }
                }
                ka9Var.mo22733f();
            }
        }
        return yj1Var;
    }
}
