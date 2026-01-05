package p001o;

import p001o.js8;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class ls8 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m37858a(js8.C14648a c14648a, byte[] bArr) {
        Object objM53351b;
        Throwable thM53354e;
        Object objM53351b2;
        Throwable thM53354e2;
        sq8.m48649h(c14648a, "builder");
        sq8.m48649h(bArr, "payload");
        vej vejVarM52647a = vdj.m52647a(wej.m54283e(bArr));
        while (true) {
            vej vejVarM52684d = vejVarM52647a.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            String strM52683c = vejVarM52684d.m52683c();
            if (sq8.m48644c(strM52683c, "AccessTier")) {
                Object objM54282d = wej.m54282d(vejVarM52684d);
                if (vre.m53357h(objM54282d)) {
                    try {
                        objM53351b2 = vre.m53351b(rn8.f43848a.m47002a((String) objM54282d));
                    } catch (Throwable th) {
                        vre.C17665a c17665a = vre.f50797b;
                        objM54282d = wre.m54933a(th);
                    }
                    thM53354e2 = vre.m53354e(objM53351b2);
                    if (thM53354e2 != null) {
                        objM53351b2 = vre.m53351b(wre.m54933a(new an5("expected (enum: `com.amazonaws.s3#IntelligentTieringAccessTier`)", thM53354e2)));
                    }
                    wre.m54934b(objM53351b2);
                    c14648a.m34474e((rn8) objM53351b2);
                } else {
                    objM53351b2 = vre.m53351b(objM54282d);
                    thM53354e2 = vre.m53354e(objM53351b2);
                    if (thM53354e2 != null) {
                    }
                    wre.m54934b(objM53351b2);
                    c14648a.m34474e((rn8) objM53351b2);
                }
            } else if (sq8.m48644c(strM52683c, "StorageClass")) {
                Object objM54282d2 = wej.m54282d(vejVarM52684d);
                if (vre.m53357h(objM54282d2)) {
                    try {
                        objM53351b = vre.m53351b(h6g.f26258a.m29845a((String) objM54282d2));
                    } catch (Throwable th2) {
                        vre.C17665a c17665a2 = vre.f50797b;
                        objM54282d2 = wre.m54933a(th2);
                    }
                    thM53354e = vre.m53354e(objM53351b);
                    if (thM53354e != null) {
                        objM53351b = vre.m53351b(wre.m54933a(new an5("expected (enum: `com.amazonaws.s3#StorageClass`)", thM53354e)));
                    }
                    wre.m54934b(objM53351b);
                    c14648a.m34475f((h6g) objM53351b);
                } else {
                    objM53351b = vre.m53351b(objM54282d2);
                    thM53354e = vre.m53354e(objM53351b);
                    if (thM53354e != null) {
                    }
                    wre.m54934b(objM53351b);
                    c14648a.m34475f((h6g) objM53351b);
                }
            }
            vejVarM52684d.m52681a();
        }
    }
}
