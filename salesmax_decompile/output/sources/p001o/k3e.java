package p001o;

/* loaded from: classes3.dex */
public abstract class k3e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m34949b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable pddVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -1631742054:
                        if (!strMo18271a.equals("UnsupportedPlsAlphabetException")) {
                            pddVar = new pdd(ij6VarM32630a.getMessage());
                            break;
                        } else {
                            pddVar = new w5i().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -1303783389:
                        if (strMo18271a.equals("LexiconSizeExceededException")) {
                            pddVar = new jca().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1276726630:
                        if (strMo18271a.equals("ServiceFailureException")) {
                            pddVar = new jgf().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -1239260876:
                        if (strMo18271a.equals("MaxLexiconsNumberExceededException")) {
                            pddVar = new d0b().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -583011314:
                        if (strMo18271a.equals("InvalidLexiconException")) {
                            pddVar = new cs8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -170629900:
                        if (strMo18271a.equals("MaxLexemeLengthExceededException")) {
                            pddVar = new a0b().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 1127717973:
                        if (strMo18271a.equals("UnsupportedPlsLanguageException")) {
                            pddVar = new z5i().mo16296b(jl6Var, o18VarM41344c, bArr);
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
