package p001o;

import org.apache.http.HttpHeaders;
import p001o.bm3;

/* loaded from: classes3.dex */
public abstract class wl3 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static final void m54676c(bm3.C12452a c12452a, byte[] bArr) {
        vej vejVarM54283e = wej.m54283e(bArr);
        while (true) {
            vej vejVarM52684d = vejVarM54283e.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case -869917261:
                    if (!strM52683c.equals("ChecksumCRC32C")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e = vre.m53354e(objM54282d);
                        if (thM53354e != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ChecksumCRC32C`)", thM53354e)));
                        }
                        wre.m54934b(objM54282d);
                        c12452a.m19363t((String) objM54282d);
                        break;
                    }
                case -421146518:
                    if (!strM52683c.equals("ChecksumSHA256")) {
                        break;
                    } else {
                        Object objM54282d2 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e2 = vre.m53354e(objM54282d2);
                        if (thM53354e2 != null) {
                            objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ChecksumSHA256`)", thM53354e2)));
                        }
                        wre.m54934b(objM54282d2);
                        c12452a.m19365v((String) objM54282d2);
                        break;
                    }
                case 75327:
                    if (!strM52683c.equals("Key")) {
                        break;
                    } else {
                        Object objM54282d3 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e3 = vre.m53354e(objM54282d3);
                        if (thM53354e3 != null) {
                            objM54282d3 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ObjectKey`)", thM53354e3)));
                        }
                        wre.m54934b(objM54282d3);
                        c12452a.m19368y((String) objM54282d3);
                        break;
                    }
                case 2139413:
                    if (!strM52683c.equals(HttpHeaders.ETAG)) {
                        break;
                    } else {
                        Object objM54282d4 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e4 = vre.m53354e(objM54282d4);
                        if (thM53354e4 != null) {
                            objM54282d4 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ETag`)", thM53354e4)));
                        }
                        wre.m54934b(objM54282d4);
                        c12452a.m19366w((String) objM54282d4);
                        break;
                    }
                case 875538440:
                    if (!strM52683c.equals("ChecksumSHA1")) {
                        break;
                    } else {
                        Object objM54282d5 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e5 = vre.m53354e(objM54282d5);
                        if (thM53354e5 != null) {
                            objM54282d5 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ChecksumSHA1`)", thM53354e5)));
                        }
                        wre.m54934b(objM54282d5);
                        c12452a.m19364u((String) objM54282d5);
                        break;
                    }
                case 1357411472:
                    if (!strM52683c.equals("ChecksumCRC32")) {
                        break;
                    } else {
                        Object objM54282d6 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e6 = vre.m53354e(objM54282d6);
                        if (thM53354e6 != null) {
                            objM54282d6 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ChecksumCRC32`)", thM53354e6)));
                        }
                        wre.m54934b(objM54282d6);
                        c12452a.m19362s((String) objM54282d6);
                        break;
                    }
                case 1965687765:
                    if (!strM52683c.equals("Location")) {
                        break;
                    } else {
                        Object objM54282d7 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e7 = vre.m53354e(objM54282d7);
                        if (thM53354e7 != null) {
                            objM54282d7 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#Location`)", thM53354e7)));
                        }
                        wre.m54934b(objM54282d7);
                        c12452a.m19369z((String) objM54282d7);
                        break;
                    }
                case 2000631306:
                    if (!strM52683c.equals("Bucket")) {
                        break;
                    } else {
                        Object objM54282d8 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e8 = vre.m53354e(objM54282d8);
                        if (thM53354e8 != null) {
                            objM54282d8 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#BucketName`)", thM53354e8)));
                        }
                        wre.m54934b(objM54282d8);
                        c12452a.m19360q((String) objM54282d8);
                        break;
                    }
            }
            vejVarM52684d.m52681a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.o18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.o18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Throwable, o.jxe] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.gxe] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* renamed from: d */
    public static final Void m54677d(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        ?? message = 0;
        ?? M41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVar.mo18271a();
            message = gxeVar.getMessage();
            M41344c = new jxe(message);
            ixe.m32887b(M41344c, g48VarM31020b, gxeVar);
            throw M41344c;
        } catch (Exception unused) {
            jxe jxeVar = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar, M41344c.m41347f(), message);
            throw jxeVar;
        }
    }
}
