package p001o;

import p001o.tr0;

/* loaded from: classes2.dex */
public abstract class nr0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static final void m40928c(tr0.C17190a c17190a, byte[] bArr) {
        vej vejVarM35158a = k81.m35158a(wej.m54283e(bArr), "AssumeRoleWithWebIdentity");
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
                        c17190a.m50403j(vr0.m53297a(vejVarM52684d));
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
                        c17190a.m50406m((Integer) objM42770b);
                        break;
                    }
                case -996247587:
                    if (!strM52683c.equals("SubjectFromWebIdentityToken")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e2 = vre.m53354e(objM54282d);
                        if (thM53354e2 != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#webIdentitySubjectType`)", thM53354e2)));
                        }
                        wre.m54934b(objM54282d);
                        c17190a.m50409p((String) objM54282d);
                        break;
                    }
                case -922850799:
                    if (!strM52683c.equals("Provider")) {
                        break;
                    } else {
                        Object objM54282d2 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e3 = vre.m53354e(objM54282d2);
                        if (thM53354e3 != null) {
                            objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#Issuer`)", thM53354e3)));
                        }
                        wre.m54934b(objM54282d2);
                        c17190a.m50407n((String) objM54282d2);
                        break;
                    }
                case 1040272932:
                    if (!strM52683c.equals("Audience")) {
                        break;
                    } else {
                        Object objM54282d3 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e4 = vre.m53354e(objM54282d3);
                        if (thM53354e4 != null) {
                            objM54282d3 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#Audience`)", thM53354e4)));
                        }
                        wre.m54934b(objM54282d3);
                        c17190a.m50404k((String) objM54282d3);
                        break;
                    }
                case 1793703449:
                    if (!strM52683c.equals("SourceIdentity")) {
                        break;
                    } else {
                        Object objM54282d4 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e5 = vre.m53354e(objM54282d4);
                        if (thM53354e5 != null) {
                            objM54282d4 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#sourceIdentityType`)", thM53354e5)));
                        }
                        wre.m54934b(objM54282d4);
                        c17190a.m50408o((String) objM54282d4);
                        break;
                    }
                case 1956825820:
                    if (!strM52683c.equals("Credentials")) {
                        break;
                    } else {
                        c17190a.m50405l(lc4.m36898a(vejVarM52684d));
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
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m40929d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
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
                    case -1712667833:
                        if (!strMo18271a.equals("IDPCommunicationError")) {
                            cagVar = new cag(ij6VarM36130a.getMessage());
                            break;
                        } else {
                            cagVar = new xb8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                    case -924282799:
                        if (strMo18271a.equals("PackedPolicyTooLarge")) {
                            cagVar = new jic().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
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
                    case 665566020:
                        if (strMo18271a.equals("InvalidIdentityToken")) {
                            cagVar = new rr8().mo16296b(jl6Var, o18VarM41344c, bArr);
                            break;
                        }
                        break;
                    case 851800521:
                        if (strMo18271a.equals("IDPRejectedClaim")) {
                            cagVar = new ac8().mo16296b(jl6Var, o18VarM41344c, bArr);
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
