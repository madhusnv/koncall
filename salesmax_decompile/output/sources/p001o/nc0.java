package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.rc0;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class nc0 {
    /* renamed from: c */
    public static final void m40309c(rc0.C16582a c16582a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("AnalyzeDocumentModelVersion"));
        h7f h7fVar2 = new h7f(aff.C12160g.f14619a, new na9("Blocks"));
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar3 = new h7f(c12164k, new na9("DocumentMetadata"));
        h7f h7fVar4 = new h7f(c12164k, new na9("HumanLoopActivationOutput"));
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
                c16582a.m46498g(interfaceC12997cMo23579h.mo31726i());
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    dn5.InterfaceC12995a interfaceC12995aMo23577c = i89Var.mo23577c(h7fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC12995aMo23577c.mo23581d()) {
                        if (interfaceC12995aMo23577c.mo23580a()) {
                            arrayList.add(wi1.m54565a(i89Var));
                        } else {
                            interfaceC12995aMo23577c.mo31725e();
                        }
                    }
                    c16582a.m46499h(arrayList);
                } else {
                    int iM29946a3 = h7fVar3.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a3) {
                        c16582a.m46500i(dw5.m23896a(i89Var));
                    } else {
                        int iM29946a4 = h7fVar4.m29946a();
                        if (numMo23583m != null && numMo23583m.intValue() == iM29946a4) {
                            c16582a.m46501j(t58.m49417a(i89Var));
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
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m40310d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable qjhVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1961891719:
                        if (!strMo18271a.equals("InvalidS3ObjectException")) {
                            qjhVar = new qjh(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            qjhVar = new du8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1943616152:
                        if (strMo18271a.equals("InternalServerError")) {
                            qjhVar = new yp8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1514639393:
                        if (strMo18271a.equals("UnsupportedDocumentException")) {
                            qjhVar = new g5i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1240985585:
                        if (strMo18271a.equals("BadDocumentException")) {
                            qjhVar = new qa1().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -727499650:
                        if (strMo18271a.equals("ProvisionedThroughputExceededException")) {
                            qjhVar = new q2e().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -292546099:
                        if (strMo18271a.equals("DocumentTooLargeException")) {
                            qjhVar = new mw5().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -72198520:
                        if (strMo18271a.equals("ThrottlingException")) {
                            qjhVar = new ilh().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 122859728:
                        if (strMo18271a.equals("AccessDeniedException")) {
                            qjhVar = new pa().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 426479957:
                        if (strMo18271a.equals("HumanLoopQuotaExceededException")) {
                            qjhVar = new z58().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1674340573:
                        if (strMo18271a.equals("InvalidParameterException")) {
                            qjhVar = new ss8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(qjhVar, g48VarM31020b, ij6VarM32630a);
            throw qjhVar;
        } catch (Exception e) {
            qjh qjhVar2 = new qjh("Failed to parse response as 'awsJson1_1' error", e);
            b2e.m18117a(qjhVar2, o18VarM41344c.m41347f(), null);
            throw qjhVar2;
        }
    }
}
