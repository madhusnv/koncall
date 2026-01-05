package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.hr7;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class dr7 {
    /* renamed from: c */
    public static final void m23705c(hr7.C14044a c14044a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("roleCredentials"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c14044a.m31009d(kue.m36248a(i89Var));
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m23706d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable x1gVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1362904677:
                        if (!strMo18271a.equals("UnauthorizedException")) {
                            x1gVar = new x1g(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            x1gVar = new z2i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case 1148038775:
                        if (strMo18271a.equals("InvalidRequestException")) {
                            x1gVar = new pt8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1384808312:
                        if (strMo18271a.equals("TooManyRequestsException")) {
                            x1gVar = new wrh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1821306386:
                        if (strMo18271a.equals("ResourceNotFoundException")) {
                            x1gVar = new zoe().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(x1gVar, g48VarM31020b, ij6VarM32630a);
            throw x1gVar;
        } catch (Exception e) {
            x1g x1gVar2 = new x1g("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(x1gVar2, o18VarM41344c.m41347f(), null);
            throw x1gVar2;
        }
    }
}
