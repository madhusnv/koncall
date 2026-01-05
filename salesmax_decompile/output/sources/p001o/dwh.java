package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.hwh;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dwh {
    /* renamed from: c */
    public static final void m23917c(hwh.C14111a c14111a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("AppliedSettings"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("AppliedTerminologies"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar3 = new h7f(c12163j, new na9("SourceLanguageCode"));
        h7f h7fVar4 = new h7f(c12163j, new na9("TargetLanguageCode"));
        h7f h7fVar5 = new h7f(c12163j, new na9("TranslatedText"));
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
                c14111a.m31246h(kwh.m36269a(i89Var));
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = i89Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(zn0.m59628a(i89Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c14111a.m31247i(arrayList);
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c14111a.m31248j(interfaceC12997cMo23579h.mo31726i());
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c14111a.m31249k(interfaceC12997cMo23579h.mo31726i());
                        } else {
                            int iM29946a5 = h7fVar5.m29946a();
                            if (numMo23583m != null && numMo23583m.intValue() == iM29946a5) {
                                c14111a.m31250l(interfaceC12997cMo23579h.mo31726i());
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
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m23918d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable awhVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1545607148:
                        if (!strMo18271a.equals("ServiceUnavailableException")) {
                            awhVar = new awh(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            awhVar = new pgf().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case 588566607:
                        if (strMo18271a.equals("TextSizeLimitExceededException")) {
                            awhVar = new qih().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 734598063:
                        if (strMo18271a.equals("InternalServerException")) {
                            awhVar = new gq8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 774046472:
                        if (strMo18271a.equals("UnsupportedLanguagePairException")) {
                            awhVar = new q5i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1148038775:
                        if (strMo18271a.equals("InvalidRequestException")) {
                            awhVar = new ot8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1384808312:
                        if (strMo18271a.equals("TooManyRequestsException")) {
                            awhVar = new vrh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1411765675:
                        if (strMo18271a.equals("DetectedLanguageLowConfidenceException")) {
                            awhVar = new tp5().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1821306386:
                        if (strMo18271a.equals("ResourceNotFoundException")) {
                            awhVar = new yoe().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(awhVar, g48VarM31020b, ij6VarM32630a);
            throw awhVar;
        } catch (Exception e) {
            awh awhVar2 = new awh("Failed to parse response as 'awsJson1_1' error", e);
            b2e.m18117a(awhVar2, o18VarM41344c.m41347f(), null);
            throw awhVar2;
        }
    }
}
