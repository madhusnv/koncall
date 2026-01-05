package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.jq7;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fq7 {
    /* renamed from: c */
    public static final void m27340c(jq7.C14627a c14627a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("IdentityId"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c14627a.m34277d(interfaceC12997cMo23579h.mo31726i());
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
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m27341d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable fg3Var;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1818544159:
                        if (!strMo18271a.equals("LimitExceededException")) {
                            fg3Var = new fg3(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            fg3Var = new fda().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1416998079:
                        if (strMo18271a.equals("NotAuthorizedException")) {
                            fg3Var = new o0c().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1327318235:
                        if (strMo18271a.equals("ExternalServiceException")) {
                            fg3Var = new lq6().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -859985393:
                        if (strMo18271a.equals("ResourceConflictException")) {
                            fg3Var = new foe().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 504305508:
                        if (strMo18271a.equals("InternalErrorException")) {
                            fg3Var = new op8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1384808312:
                        if (strMo18271a.equals("TooManyRequestsException")) {
                            fg3Var = new trh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1674340573:
                        if (strMo18271a.equals("InvalidParameterException")) {
                            fg3Var = new ts8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1821306386:
                        if (strMo18271a.equals("ResourceNotFoundException")) {
                            fg3Var = new voe().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(fg3Var, g48VarM31020b, ij6VarM32630a);
            throw fg3Var;
        } catch (Exception e) {
            fg3 fg3Var2 = new fg3("Failed to parse response as 'awsJson1_1' error", e);
            b2e.m18117a(fg3Var2, o18VarM41344c.m41347f(), null);
            throw fg3Var2;
        }
    }
}
