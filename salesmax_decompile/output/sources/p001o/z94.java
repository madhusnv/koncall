package p001o;

import p001o.da4;

/* loaded from: classes3.dex */
public abstract class z94 {
    /* renamed from: c */
    public static final void m58973c(da4.C12851a c12851a, byte[] bArr) {
        vej vejVarM54283e = wej.m54283e(bArr);
        while (true) {
            vej vejVarM52684d = vejVarM54283e.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            String strM52683c = vejVarM52684d.m52683c();
            int iHashCode = strM52683c.hashCode();
            if (iHashCode != 75327) {
                if (iHashCode != 1628634908) {
                    if (iHashCode == 2000631306 && strM52683c.equals("Bucket")) {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e = vre.m53354e(objM54282d);
                        if (thM53354e != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#BucketName`)", thM53354e)));
                        }
                        wre.m54934b(objM54282d);
                        c12851a.m22668r((String) objM54282d);
                    }
                } else if (strM52683c.equals("UploadId")) {
                    Object objM54282d2 = wej.m54282d(vejVarM52684d);
                    Throwable thM53354e2 = vre.m53354e(objM54282d2);
                    if (thM53354e2 != null) {
                        objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#MultipartUploadId`)", thM53354e2)));
                    }
                    wre.m54934b(objM54282d2);
                    c12851a.m22650B((String) objM54282d2);
                }
            } else if (strM52683c.equals("Key")) {
                Object objM54282d3 = wej.m54282d(vejVarM52684d);
                Throwable thM53354e3 = vre.m53354e(objM54282d3);
                if (thM53354e3 != null) {
                    objM54282d3 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ObjectKey`)", thM53354e3)));
                }
                wre.m54934b(objM54282d3);
                c12851a.m22671u((String) objM54282d3);
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
    public static final Void m58974d(jl6 jl6Var, o18 o18Var, byte[] bArr) {
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
