package p001o;

import p001o.aff;
import p001o.c4g;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class y3g {
    /* renamed from: c */
    public static final void m57189c(c4g.C12549a c12549a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("SynthesisTask"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c12549a.m20201d(shg.m48356a(i89Var));
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
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m57190d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable pddVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -2006780792:
                        if (!strMo18271a.equals("LexiconNotFoundException")) {
                            pddVar = new pdd(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            pddVar = new gca().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1866493394:
                        if (strMo18271a.equals("InvalidS3BucketException")) {
                            pddVar = new wt8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1276726630:
                        if (strMo18271a.equals("ServiceFailureException")) {
                            pddVar = new jgf().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -994260351:
                        if (strMo18271a.equals("SsmlMarksNotSupportedForTextTypeException")) {
                            pddVar = new l1g().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -880223920:
                        if (strMo18271a.equals("MarksNotSupportedForFormatException")) {
                            pddVar = new ssa().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -557748247:
                        if (strMo18271a.equals("TextLengthExceededException")) {
                            pddVar = new gih().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -460810631:
                        if (strMo18271a.equals("InvalidSsmlException")) {
                            pddVar = new yu8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 300683431:
                        if (strMo18271a.equals("InvalidS3KeyException")) {
                            pddVar = new zt8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 788170350:
                        if (strMo18271a.equals("InvalidSampleRateException")) {
                            pddVar = new iu8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 972566304:
                        if (strMo18271a.equals("InvalidSnsTopicArnException")) {
                            pddVar = new uu8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1643850460:
                        if (strMo18271a.equals("LanguageNotSupportedException")) {
                            pddVar = new xg9().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1791529522:
                        if (strMo18271a.equals("EngineNotSupportedException")) {
                            pddVar = new gg6().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(pddVar, g48VarM31020b, ij6VarM32630a);
            throw pddVar;
        } catch (Exception e) {
            pdd pddVar2 = new pdd("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(pddVar2, o18VarM41344c.m41347f(), null);
            throw pddVar2;
        }
    }
}
