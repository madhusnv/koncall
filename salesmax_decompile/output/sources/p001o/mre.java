package p001o;

import p001o.lre;

/* loaded from: classes3.dex */
public abstract class mre {
    /* renamed from: a */
    public static final lre m39526a(vej vejVar) {
        sq8.m48649h(vejVar, "reader");
        lre.C15143a c15143a = new lre.C15143a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c15143a.m37825b();
                return c15143a.m37824a();
            }
            String strM52683c = vejVarM52684d.m52683c();
            if (sq8.m48644c(strM52683c, "IsRestoreInProgress")) {
                Object objM42769a = oyc.m42769a(wej.m54282d(vejVarM52684d));
                Throwable thM53354e = vre.m53354e(objM42769a);
                if (thM53354e != null) {
                    objM42769a = vre.m53351b(wre.m54933a(new an5("expected (boolean: `com.amazonaws.s3#IsRestoreInProgress`)", thM53354e)));
                }
                wre.m54934b(objM42769a);
                c15143a.m37829f((Boolean) objM42769a);
            } else if (sq8.m48644c(strM52683c, "RestoreExpiryDate")) {
                Object objM42772d = oyc.m42772d(wej.m54282d(vejVarM52684d), vmh.ISO_8601);
                Throwable thM53354e2 = vre.m53354e(objM42772d);
                if (thM53354e2 != null) {
                    objM42772d = vre.m53351b(wre.m54933a(new an5("expected (timestamp: `com.amazonaws.s3#RestoreExpiryDate`)", thM53354e2)));
                }
                wre.m54934b(objM42772d);
                c15143a.m37828e((gk8) objM42772d);
            }
            vejVarM52684d.m52681a();
        }
    }
}
