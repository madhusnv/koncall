package p001o;

/* loaded from: classes3.dex */
public abstract class p3e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m42951b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable jxeVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        gxe gxeVarMo18271a = 0;
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVarMo18271a = gxeVar.mo18271a();
            if (gxeVarMo18271a != 0) {
                switch (gxeVarMo18271a.hashCode()) {
                    case -2077214483:
                        if (!gxeVarMo18271a.equals("TooManyParts")) {
                            jxeVar = new jxe(gxeVar.getMessage());
                            break;
                        } else {
                            jxeVar = new orh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -2044359061:
                        if (gxeVarMo18271a.equals("EncryptionTypeMismatch")) {
                            jxeVar = new v76().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1969068293:
                        if (gxeVarMo18271a.equals("InvalidWriteOffset")) {
                            jxeVar = new jv8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -224423752:
                        if (gxeVarMo18271a.equals("InvalidRequest")) {
                            jxeVar = new et8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            ixe.m32887b(jxeVar, g48VarM31020b, gxeVar);
            throw jxeVar;
        } catch (Exception unused) {
            jxe jxeVar2 = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar2, o18VarM41344c.m41347f(), gxeVarMo18271a);
            throw jxeVar2;
        }
    }
}
