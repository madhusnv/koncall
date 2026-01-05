package p001o;

import java.util.LinkedHashMap;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.xqe;

/* loaded from: classes3.dex */
public abstract class tqe {
    /* renamed from: c */
    public static final void m50344c(xqe.C18223a c18223a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("AuthenticationResult"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("ChallengeName"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ChallengeParameters"));
        h7f h7fVar4 = new h7f(aff.C12163j.f14622a, new na9("Session"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c18223a.m56671g(r01.m46010a(i89Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18223a.m56672h(cg2.f18052a.m21139a(interfaceC12997cMo23579h.mo31726i()));
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        dn5.InterfaceC12996b interfaceC12996bMo23578g = i89Var.mo23578g(h7fVar3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (interfaceC12996bMo23578g.mo23582f()) {
                            String strKey = interfaceC12996bMo23578g.key();
                            if (interfaceC12996bMo23578g.mo23580a()) {
                                linkedHashMap.put(strKey, interfaceC12996bMo23578g.mo31726i());
                            } else {
                                interfaceC12996bMo23578g.mo31725e();
                            }
                        }
                        c18223a.m56673i(linkedHashMap);
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c18223a.m56674j(interfaceC12997cMo23579h.mo31726i());
                        } else if (numMo23583m == null) {
                            return;
                        } else {
                            interfaceC12997cMo23579h.skipValue();
                        }
                    }
                }
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
    /* JADX WARN: Removed duplicated region for block: B:101:0x0204  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m50345d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable ng3Var;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1699379746:
                        if (!strMo18271a.equals("InvalidEmailRoleAccessPolicyException")) {
                            ng3Var = new ng3(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            ng3Var = new ir8().mo16296b(jl6Var, o18VarM41344c, bArr);
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
                    case -1003072464:
                        if (strMo18271a.equals("InvalidLambdaResponseException")) {
                            ng3Var = new zr8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -828042111:
                        if (strMo18271a.equals("InvalidSmsRoleAccessPolicyException")) {
                            ng3Var = new ou8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -668746953:
                        if (strMo18271a.equals("InvalidSmsRoleTrustRelationshipException")) {
                            ng3Var = new ru8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -631599401:
                        if (strMo18271a.equals("MFAMethodNotFoundException")) {
                            ng3Var = new qeb().mo16296b(jl6Var, o18VarM41344c, bArr);
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
                    case 668921642:
                        if (strMo18271a.equals("SoftwareTokenMFANotFoundException")) {
                            ng3Var = new azf().mo16296b(jl6Var, o18VarM41344c, bArr);
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
                    case 1937518204:
                        if (strMo18271a.equals("PasswordResetRequiredException")) {
                            ng3Var = new szc().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 2109214467:
                        if (strMo18271a.equals("AliasExistsException")) {
                            ng3Var = new q90().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 2130594583:
                        if (strMo18271a.equals("InvalidUserPoolConfigurationException")) {
                            ng3Var = new gv8().mo16296b(jl6Var, o18VarM41344c, bArr);
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
