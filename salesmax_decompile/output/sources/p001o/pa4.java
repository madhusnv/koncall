package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.ta4;

/* loaded from: classes2.dex */
public abstract class pa4 {
    /* renamed from: c */
    public static final void m43267c(ta4.C17040a c17040a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("accessToken"));
        h7f h7fVar2 = new h7f(aff.C12159f.f14618a, new na9("expiresIn"));
        h7f h7fVar3 = new h7f(c12163j, new na9("idToken"));
        h7f h7fVar4 = new h7f(c12163j, new na9("refreshToken"));
        h7f h7fVar5 = new h7f(c12163j, new na9("tokenType"));
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
                c17040a.m49621h(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c17040a.m49622i(interfaceC12997cMo23579h.mo31724b());
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c17040a.m49623j(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c17040a.m49624k(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c17040a.m49625l(interfaceC12997cMo23579h.mo31726i());
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
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m43268d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable f2gVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1190608143:
                        if (!strMo18271a.equals("AuthorizationPendingException")) {
                            f2gVar = new f2g(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            f2gVar = new v01().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1101695507:
                        if (strMo18271a.equals("InvalidClientException")) {
                            f2gVar = new fr8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -608224069:
                        if (strMo18271a.equals("ExpiredTokenException")) {
                            f2gVar = new to6().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -213094100:
                        if (strMo18271a.equals("SlowDownException")) {
                            f2gVar = new iwf().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 122859728:
                        if (strMo18271a.equals("AccessDeniedException")) {
                            f2gVar = new qa().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 369611024:
                        if (strMo18271a.equals("UnauthorizedClientException")) {
                            f2gVar = new u2i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 734598063:
                        if (strMo18271a.equals("InternalServerException")) {
                            f2gVar = new hq8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 797925906:
                        if (strMo18271a.equals("InvalidScopeException")) {
                            f2gVar = new lu8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1148038775:
                        if (strMo18271a.equals("InvalidRequestException")) {
                            f2gVar = new mt8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1302626378:
                        if (strMo18271a.equals("InvalidGrantException")) {
                            f2gVar = new lr8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 2022771054:
                        if (strMo18271a.equals("UnsupportedGrantTypeException")) {
                            f2gVar = new k5i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(f2gVar, g48VarM31020b, ij6VarM32630a);
            throw f2gVar;
        } catch (Exception e) {
            f2g f2gVar2 = new f2g("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(f2gVar2, o18VarM41344c.m41347f(), null);
            throw f2gVar2;
        }
    }
}
