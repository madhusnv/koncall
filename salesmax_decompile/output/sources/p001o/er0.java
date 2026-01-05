package p001o;

import p001o.lr0;

/* loaded from: classes2.dex */
public abstract class er0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static final void m25445c(lr0.C15135a c15135a, byte[] bArr) {
        vej vejVarM35158a = k81.m35158a(wej.m54283e(bArr), "AssumeRole");
        while (true) {
            vej vejVarM52684d = vejVarM35158a.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case -1787805543:
                    if (!strM52683c.equals("AssumedRoleUser")) {
                        break;
                    } else {
                        c15135a.m37797g(vr0.m53297a(vejVarM52684d));
                        break;
                    }
                case -1686485237:
                    if (!strM52683c.equals("PackedPolicySize")) {
                        break;
                    } else {
                        Object objM42770b = oyc.m42770b(wej.m54282d(vejVarM52684d));
                        Throwable thM53354e = vre.m53354e(objM42770b);
                        if (thM53354e != null) {
                            objM42770b = vre.m53351b(wre.m54933a(new an5("expected (integer: `com.amazonaws.sts#nonNegativeIntegerType`)", thM53354e)));
                        }
                        wre.m54934b(objM42770b);
                        c15135a.m37799i((Integer) objM42770b);
                        break;
                    }
                case 1793703449:
                    if (!strM52683c.equals("SourceIdentity")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e2 = vre.m53354e(objM54282d);
                        if (thM53354e2 != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#sourceIdentityType`)", thM53354e2)));
                        }
                        wre.m54934b(objM54282d);
                        c15135a.m37800j((String) objM54282d);
                        break;
                    }
                case 1956825820:
                    if (!strM52683c.equals("Credentials")) {
                        break;
                    } else {
                        c15135a.m37798h(lc4.m36898a(vejVarM52684d));
                        break;
                    }
            }
            vejVarM52684d.m52681a();
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
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m25446d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable cagVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            if (bArr == null) {
                throw new IllegalStateException("unable to parse error from empty response".toString());
            }
            ij6 ij6VarM36130a = kre.m36130a(bArr);
            String strMo18271a = ij6VarM36130a.mo18271a();
            if (strMo18271a != null) {
                switch (strMo18271a.hashCode()) {
                    case -924282799:
                        if (!strMo18271a.equals("PackedPolicyTooLarge")) {
                            cagVar = new cag(ij6VarM36130a.getMessage());
                            break;
                        } else {
                            cagVar = new jic().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -608224069:
                        if (strMo18271a.equals("ExpiredTokenException")) {
                            cagVar = new so6().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case -109774721:
                        if (strMo18271a.equals("RegionDisabledException")) {
                            cagVar = new uge().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 534430952:
                        if (strMo18271a.equals("MalformedPolicyDocument")) {
                            cagVar = new rpa().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                }
            }
            b2e.m18117a(cagVar, g48VarM31020b, ij6VarM36130a);
            throw cagVar;
        } catch (Exception e) {
            cag cagVar2 = new cag("Failed to parse response as 'awsQuery' error", e);
            b2e.m18117a(cagVar2, o18VarM41344c.m41347f(), null);
            throw cagVar2;
        }
    }
}
