package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.bs7;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class xr7 {
    /* renamed from: c */
    public static final void m56695c(bs7.C12484a c12484a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar = new h7f(c12160g, new na9("MFAOptions"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("PreferredMfaSetting"));
        h7f h7fVar3 = new h7f(c12160g, new na9("UserAttributes"));
        h7f h7fVar4 = new h7f(c12160g, new na9("UserMFASettingList"));
        h7f h7fVar5 = new h7f(c12163j, new na9("Username"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = i89Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(teb.m49789a(i89Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c12484a.m19689h(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c12484a.m19690i(interfaceC12997cMo23579h.mo31726i());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        dn5.InterfaceC12995a interfaceC12995aMo23577c2 = i89Var.mo23577c(h7fVar3);
                        ArrayList arrayList2 = new ArrayList();
                        while (interfaceC12995aMo23577c2.mo23581d()) {
                            if (interfaceC12995aMo23577c2.mo23580a()) {
                                arrayList2.add(mx0.m39753a(i89Var));
                            } else {
                                interfaceC12995aMo23577c2.mo31725e();
                            }
                        }
                        c12484a.m19691j(arrayList2);
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            dn5.InterfaceC12995a interfaceC12995aMo23577c3 = i89Var.mo23577c(h7fVar4);
                            ArrayList arrayList3 = new ArrayList();
                            while (interfaceC12995aMo23577c3.mo23581d()) {
                                if (interfaceC12995aMo23577c3.mo23580a()) {
                                    arrayList3.add(interfaceC12995aMo23577c3.mo31726i());
                                } else {
                                    interfaceC12995aMo23577c3.mo31725e();
                                }
                            }
                            c12484a.m19692k(arrayList3);
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c12484a.m19693l(interfaceC12997cMo23579h.mo31726i());
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
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m56696d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable ng3Var;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1416998079:
                        if (!strMo18271a.equals("NotAuthorizedException")) {
                            ng3Var = new ng3(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            ng3Var = new n0c().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
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
