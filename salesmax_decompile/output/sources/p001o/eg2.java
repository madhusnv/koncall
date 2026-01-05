package p001o;

/* loaded from: classes3.dex */
public abstract class eg2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m24965b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable ng3Var;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1818544159:
                        if (!strMo18271a.equals("LimitExceededException")) {
                            ng3Var = new ng3(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            ng3Var = new eda().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1572556067:
                        if (strMo18271a.equals("InvalidPasswordException")) {
                            ng3Var = new zs8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1416998079:
                        if (strMo18271a.equals("NotAuthorizedException")) {
                            ng3Var = new n0c().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -469823499:
                        if (strMo18271a.equals("PasswordHistoryPolicyViolationException")) {
                            ng3Var = new pzc().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -392923018:
                        if (strMo18271a.equals("ForbiddenException")) {
                            ng3Var = new dc7().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -344619019:
                        if (strMo18271a.equals("UserNotFoundException")) {
                            ng3Var = new yhi().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -26861384:
                        if (strMo18271a.equals("UserNotConfirmedException")) {
                            ng3Var = new vhi().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 504305508:
                        if (strMo18271a.equals("InternalErrorException")) {
                            ng3Var = new np8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1384808312:
                        if (strMo18271a.equals("TooManyRequestsException")) {
                            ng3Var = new urh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1674340573:
                        if (strMo18271a.equals("InvalidParameterException")) {
                            ng3Var = new qs8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1821306386:
                        if (strMo18271a.equals("ResourceNotFoundException")) {
                            ng3Var = new woe().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1937518204:
                        if (strMo18271a.equals("PasswordResetRequiredException")) {
                            ng3Var = new szc().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(ng3Var, g48VarM31020b, ij6VarM32630a);
            throw ng3Var;
        } catch (Exception e) {
            ng3 ng3Var2 = new ng3("Failed to parse response as 'awsJson1_1' error", e);
            b2e.m18117a(ng3Var2, o18VarM41344c.m41347f(), null);
            throw ng3Var2;
        }
    }
}
