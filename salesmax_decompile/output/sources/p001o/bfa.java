package p001o;

import p001o.ffa;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class bfa {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18836c(ffa.C13416a c13416a, byte[] bArr) {
        Object objM53351b;
        Throwable thM53354e;
        vej vejVarM54283e = wej.m54283e(bArr);
        while (true) {
            vej vejVarM52684d = vejVarM54283e.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case -1943297557:
                    if (!strM52683c.equals("CommonPrefixes")) {
                        break;
                    } else {
                        c13416a.m26571p(sg3.m48305a(c13416a.m26558c(), yj3.m57860a(vejVarM52684d)));
                        break;
                    }
                case -1896243534:
                    if (!strM52683c.equals("Prefix")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e2 = vre.m53354e(objM54282d);
                        if (thM53354e2 != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#Prefix`)", thM53354e2)));
                        }
                        wre.m54934b(objM54282d);
                        c13416a.m26580y((String) objM54282d);
                        break;
                    }
                case -1786475176:
                    if (!strM52683c.equals("MaxKeys")) {
                        break;
                    } else {
                        Object objM42770b = oyc.m42770b(wej.m54282d(vejVarM52684d));
                        Throwable thM53354e3 = vre.m53354e(objM42770b);
                        if (thM53354e3 != null) {
                            objM42770b = vre.m53351b(wre.m54933a(new an5("expected (integer: `com.amazonaws.s3#MaxKeys`)", thM53354e3)));
                        }
                        wre.m54934b(objM42770b);
                        c13416a.m26577v((Integer) objM42770b);
                        break;
                    }
                case -871463121:
                    if (!strM52683c.equals("NextContinuationToken")) {
                        break;
                    } else {
                        Object objM54282d2 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e4 = vre.m53354e(objM54282d2);
                        if (thM53354e4 != null) {
                            objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#NextToken`)", thM53354e4)));
                        }
                        wre.m54934b(objM54282d2);
                        c13416a.m26579x((String) objM54282d2);
                        break;
                    }
                case -685399219:
                    if (!strM52683c.equals("EncodingType")) {
                        break;
                    } else {
                        Object objM54282d3 = wej.m54282d(vejVarM52684d);
                        if (vre.m53357h(objM54282d3)) {
                            try {
                                objM53351b = vre.m53351b(q76.f41423a.m44925a((String) objM54282d3));
                            } catch (Throwable th) {
                                vre.C17665a c17665a = vre.f50797b;
                                objM54282d3 = wre.m54933a(th);
                            }
                            thM53354e = vre.m53354e(objM53351b);
                            if (thM53354e != null) {
                                objM53351b = vre.m53351b(wre.m54933a(new an5("expected (enum: `com.amazonaws.s3#EncodingType`)", thM53354e)));
                            }
                            wre.m54934b(objM53351b);
                            c13416a.m26575t((q76) objM53351b);
                            break;
                        } else {
                            objM53351b = vre.m53351b(objM54282d3);
                            thM53354e = vre.m53354e(objM53351b);
                            if (thM53354e != null) {
                            }
                            wre.m54934b(objM53351b);
                            c13416a.m26575t((q76) objM53351b);
                        }
                    }
                case -502677702:
                    if (!strM52683c.equals("Contents")) {
                        break;
                    } else {
                        c13416a.m26572q(sg3.m48305a(c13416a.m26559d(), j6c.m33296a(vejVarM52684d)));
                        break;
                    }
                case 2420395:
                    if (!strM52683c.equals("Name")) {
                        break;
                    } else {
                        Object objM54282d4 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e5 = vre.m53354e(objM54282d4);
                        if (thM53354e5 != null) {
                            objM54282d4 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#BucketName`)", thM53354e5)));
                        }
                        wre.m54934b(objM54282d4);
                        c13416a.m26578w((String) objM54282d4);
                        break;
                    }
                case 159271316:
                    if (!strM52683c.equals("IsTruncated")) {
                        break;
                    } else {
                        Object objM42769a = oyc.m42769a(wej.m54282d(vejVarM52684d));
                        Throwable thM53354e6 = vre.m53354e(objM42769a);
                        if (thM53354e6 != null) {
                            objM42769a = vre.m53351b(wre.m54933a(new an5("expected (boolean: `com.amazonaws.s3#IsTruncated`)", thM53354e6)));
                        }
                        wre.m54934b(objM42769a);
                        c13416a.m26555B((Boolean) objM42769a);
                        break;
                    }
                case 392207034:
                    if (!strM52683c.equals("StartAfter")) {
                        break;
                    } else {
                        Object objM54282d5 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e7 = vre.m53354e(objM54282d5);
                        if (thM53354e7 != null) {
                            objM54282d5 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#StartAfter`)", thM53354e7)));
                        }
                        wre.m54934b(objM54282d5);
                        c13416a.m26554A((String) objM54282d5);
                        break;
                    }
                case 413261282:
                    if (!strM52683c.equals("ContinuationToken")) {
                        break;
                    } else {
                        Object objM54282d6 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e8 = vre.m53354e(objM54282d6);
                        if (thM53354e8 != null) {
                            objM54282d6 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#Token`)", thM53354e8)));
                        }
                        wre.m54934b(objM54282d6);
                        c13416a.m26573r((String) objM54282d6);
                        break;
                    }
                case 539773456:
                    if (!strM52683c.equals("KeyCount")) {
                        break;
                    } else {
                        Object objM42770b2 = oyc.m42770b(wej.m54282d(vejVarM52684d));
                        Throwable thM53354e9 = vre.m53354e(objM42770b2);
                        if (thM53354e9 != null) {
                            objM42770b2 = vre.m53351b(wre.m54933a(new an5("expected (integer: `com.amazonaws.s3#KeyCount`)", thM53354e9)));
                        }
                        wre.m54934b(objM42770b2);
                        c13416a.m26576u((Integer) objM42770b2);
                        break;
                    }
                case 1753449959:
                    if (!strM52683c.equals("Delimiter")) {
                        break;
                    } else {
                        Object objM54282d7 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e10 = vre.m53354e(objM54282d7);
                        if (thM53354e10 != null) {
                            objM54282d7 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#Delimiter`)", thM53354e10)));
                        }
                        wre.m54934b(objM54282d7);
                        c13416a.m26574s((String) objM54282d7);
                        break;
                    }
            }
            vejVarM52684d.m52681a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* renamed from: d */
    public static final Void m18837d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        gxe gxeVarM48644c = 0;
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVarM48644c = sq8.m48644c(gxeVar.mo18271a(), "NoSuchBucket");
            Throwable thMo16296b = gxeVarM48644c != 0 ? new mzb().mo16296b(jl6Var, o18VarM41344c, bArr) : new jxe(gxeVar.getMessage());
            ixe.m32887b(thMo16296b, g48VarM31020b, gxeVar);
            throw thMo16296b;
        } catch (Exception unused) {
            jxe jxeVar = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar, o18VarM41344c.m41347f(), gxeVarM48644c);
            throw jxeVar;
        }
    }
}
