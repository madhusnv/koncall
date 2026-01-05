package p001o;

import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class a34 {

    /* renamed from: a */
    public static final ka9.C14756a f14087a = ka9.C14756a.m35230a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z24 m16370a(ka9 ka9Var, ama amaVar) {
        z24 z24VarM52467a;
        String strMo22740t;
        ka9Var.mo22732d();
        char c = 2;
        int iMo22738r = 2;
        while (true) {
            z24VarM52467a = null;
            if (!ka9Var.mo22735h()) {
                strMo22740t = null;
                break;
            }
            int iMo22724H = ka9Var.mo22724H(f14087a);
            if (iMo22724H == 0) {
                strMo22740t = ka9Var.mo22740t();
                break;
            }
            if (iMo22724H != 1) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                iMo22738r = ka9Var.mo22738r();
            }
        }
        if (strMo22740t == null) {
            return null;
        }
        switch (strMo22740t.hashCode()) {
            case 3239:
                if (!strMo22740t.equals("el")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 3270:
                if (strMo22740t.equals("fl")) {
                    c = 1;
                    break;
                }
                break;
            case 3295:
                if (!strMo22740t.equals("gf")) {
                }
                break;
            case 3307:
                if (strMo22740t.equals("gr")) {
                    c = 3;
                    break;
                }
                break;
            case 3308:
                if (strMo22740t.equals("gs")) {
                    c = 4;
                    break;
                }
                break;
            case 3488:
                if (strMo22740t.equals("mm")) {
                    c = 5;
                    break;
                }
                break;
            case 3633:
                if (strMo22740t.equals("rc")) {
                    c = 6;
                    break;
                }
                break;
            case 3646:
                if (strMo22740t.equals("rp")) {
                    c = 7;
                    break;
                }
                break;
            case 3669:
                if (strMo22740t.equals("sh")) {
                    c = '\b';
                    break;
                }
                break;
            case 3679:
                if (strMo22740t.equals("sr")) {
                    c = '\t';
                    break;
                }
                break;
            case 3681:
                if (strMo22740t.equals("st")) {
                    c = '\n';
                    break;
                }
                break;
            case 3705:
                if (strMo22740t.equals("tm")) {
                    c = 11;
                    break;
                }
                break;
            case 3710:
                if (strMo22740t.equals("tr")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                z24VarM52467a = v93.m52467a(ka9Var, amaVar, iMo22738r);
                break;
            case 1:
                z24VarM52467a = flf.m27029a(ka9Var, amaVar);
                break;
            case 2:
                z24VarM52467a = ru7.m47166a(ka9Var, amaVar);
                break;
            case 3:
                z24VarM52467a = hlf.m30760a(ka9Var, amaVar);
                break;
            case 4:
                z24VarM52467a = uu7.m52030a(ka9Var, amaVar);
                break;
            case 5:
                z24VarM52467a = fbb.m26388a(ka9Var);
                amaVar.m17437a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                z24VarM52467a = ufe.m51544a(ka9Var, amaVar);
                break;
            case 7:
                z24VarM52467a = ske.m48446a(ka9Var, amaVar);
                break;
            case '\b':
                z24VarM52467a = mlf.m39316a(ka9Var, amaVar);
                break;
            case '\t':
                z24VarM52467a = bed.m18803a(ka9Var, amaVar);
                break;
            case '\n':
                z24VarM52467a = olf.m42395a(ka9Var, amaVar);
                break;
            case 11:
                z24VarM52467a = qlf.m45635a(ka9Var, amaVar);
                break;
            case '\f':
                z24VarM52467a = sg0.m48303g(ka9Var, amaVar);
                break;
            default:
                rja.m46866c("Unknown shape type " + strMo22740t);
                break;
        }
        while (ka9Var.mo22735h()) {
            ka9Var.mo22726K();
        }
        ka9Var.mo22734g();
        return z24VarM52467a;
    }
}
