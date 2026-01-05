package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class qg0 {

    /* renamed from: a */
    public static final ka9.C14756a f41841a = ka9.C14756a.m35230a("a");

    /* renamed from: b */
    public static final ka9.C14756a f41842b = ka9.C14756a.m35230a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static pg0 m45370a(ka9 ka9Var, ama amaVar) {
        ka9Var.mo22732d();
        pg0 pg0VarM45371b = null;
        while (ka9Var.mo22735h()) {
            if (ka9Var.mo22724H(f41841a) != 0) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                pg0VarM45371b = m45371b(ka9Var, amaVar);
            }
        }
        ka9Var.mo22734g();
        return pg0VarM45371b == null ? new pg0(null, null, null, null) : pg0VarM45371b;
    }

    /* renamed from: b */
    public static pg0 m45371b(ka9 ka9Var, ama amaVar) {
        ka9Var.mo22732d();
        eg0 eg0VarM51552c = null;
        eg0 eg0VarM51552c2 = null;
        fg0 fg0VarM51554e = null;
        fg0 fg0VarM51554e2 = null;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f41842b);
            if (iMo22724H == 0) {
                eg0VarM51552c = ug0.m51552c(ka9Var, amaVar);
            } else if (iMo22724H == 1) {
                eg0VarM51552c2 = ug0.m51552c(ka9Var, amaVar);
            } else if (iMo22724H == 2) {
                fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
            } else if (iMo22724H != 3) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                fg0VarM51554e2 = ug0.m51554e(ka9Var, amaVar);
            }
        }
        ka9Var.mo22734g();
        return new pg0(eg0VarM51552c, eg0VarM51552c2, fg0VarM51554e, fg0VarM51554e2);
    }
}
