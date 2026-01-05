package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.rr3;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nr3 {
    /* renamed from: c */
    public static final void m40997c(rr3.C16651a c16651a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("Session"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c16651a.m47087d(interfaceC12997cMo23579h.mo31726i());
            } else if (numMo23583m == null) {
                return;
            } else {
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m40998d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
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
                    case -1416998079:
                        if (strMo18271a.equals("NotAuthorizedException")) {
                            ng3Var = new n0c().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1003072464:
                        if (strMo18271a.equals("InvalidLambdaResponseException")) {
                            ng3Var = new zr8().mo16296b(jl6Var, o18VarM41344c, bArr);
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
                    case -291251783:
                        if (strMo18271a.equals("TooManyFailedAttemptsException")) {
                            ng3Var = new lrh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 504305508:
                        if (strMo18271a.equals("InternalErrorException")) {
                            ng3Var = new np8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 696704477:
                        if (strMo18271a.equals("ExpiredCodeException")) {
                            ng3Var = new oo6().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 905283300:
                        if (strMo18271a.equals("UserLambdaValidationException")) {
                            ng3Var = new oei().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1016859543:
                        if (strMo18271a.equals("UnexpectedLambdaException")) {
                            ng3Var = new l3i().mo16296b(jl6Var, o18VarM41344c, bArr);
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
                    case 1852399508:
                        if (strMo18271a.equals("CodeMismatchException")) {
                            ng3Var = new ff3().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 2109214467:
                        if (strMo18271a.equals("AliasExistsException")) {
                            ng3Var = new q90().mo16296b(jl6Var, o18VarM41344c, bArr);
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
