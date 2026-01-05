package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public class uz5 {

    /* renamed from: f */
    public static final ka9.C14756a f49693f = ka9.C14756a.m35230a("ef");

    /* renamed from: g */
    public static final ka9.C14756a f49694g = ka9.C14756a.m35230a("nm", "v");

    /* renamed from: a */
    public eg0 f49695a;

    /* renamed from: b */
    public fg0 f49696b;

    /* renamed from: c */
    public fg0 f49697c;

    /* renamed from: d */
    public fg0 f49698d;

    /* renamed from: e */
    public fg0 f49699e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m52175a(ka9 ka9Var, ama amaVar) {
        ka9Var.mo22732d();
        String strMo22740t = "";
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f49694g);
            if (iMo22724H != 0) {
                char c = 1;
                if (iMo22724H == 1) {
                    strMo22740t.hashCode();
                    switch (strMo22740t.hashCode()) {
                        case 353103893:
                            if (!strMo22740t.equals("Distance")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case 397447147:
                            if (!strMo22740t.equals("Opacity")) {
                            }
                            break;
                        case 1041377119:
                            if (strMo22740t.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1379387491:
                            if (strMo22740t.equals("Shadow Color")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1383710113:
                            if (strMo22740t.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f49698d = ug0.m51554e(ka9Var, amaVar);
                            break;
                        case 1:
                            this.f49696b = ug0.m51555f(ka9Var, amaVar, false);
                            break;
                        case 2:
                            this.f49697c = ug0.m51555f(ka9Var, amaVar, false);
                            break;
                        case 3:
                            this.f49695a = ug0.m51552c(ka9Var, amaVar);
                            break;
                        case 4:
                            this.f49699e = ug0.m51554e(ka9Var, amaVar);
                            break;
                        default:
                            ka9Var.mo22726K();
                            break;
                    }
                } else {
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                }
            } else {
                strMo22740t = ka9Var.mo22740t();
            }
        }
        ka9Var.mo22734g();
    }

    /* renamed from: b */
    public tz5 m52176b(ka9 ka9Var, ama amaVar) {
        fg0 fg0Var;
        fg0 fg0Var2;
        fg0 fg0Var3;
        fg0 fg0Var4;
        while (ka9Var.mo22735h()) {
            if (ka9Var.mo22724H(f49693f) != 0) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                ka9Var.mo22731c();
                while (ka9Var.mo22735h()) {
                    m52175a(ka9Var, amaVar);
                }
                ka9Var.mo22733f();
            }
        }
        eg0 eg0Var = this.f49695a;
        if (eg0Var == null || (fg0Var = this.f49696b) == null || (fg0Var2 = this.f49697c) == null || (fg0Var3 = this.f49698d) == null || (fg0Var4 = this.f49699e) == null) {
            return null;
        }
        return new tz5(eg0Var, fg0Var, fg0Var2, fg0Var3, fg0Var4);
    }
}
