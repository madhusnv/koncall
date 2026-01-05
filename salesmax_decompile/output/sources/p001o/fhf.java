package p001o;

import p001o.ehf;

/* loaded from: classes3.dex */
public abstract class fhf {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public static final ehf m26707a(vej vejVar) {
        sq8.m48649h(vejVar, "reader");
        ehf.C13194a c13194a = new ehf.C13194a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c13194a.m25068b();
                return c13194a.m25067a();
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case -532231901:
                    if (!strM52683c.equals("SessionToken")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e = vre.m53354e(objM54282d);
                        if (thM53354e != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#SessionCredentialValue`)", thM53354e)));
                        }
                        wre.m54934b(objM54282d);
                        c13194a.m25076j((String) objM54282d);
                        break;
                    }
                case 616582326:
                    if (!strM52683c.equals("AccessKeyId")) {
                        break;
                    } else {
                        Object objM54282d2 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e2 = vre.m53354e(objM54282d2);
                        if (thM53354e2 != null) {
                            objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#AccessKeyIdValue`)", thM53354e2)));
                        }
                        wre.m54934b(objM54282d2);
                        c13194a.m25073g((String) objM54282d2);
                        break;
                    }
                case 1155999439:
                    if (!strM52683c.equals("Expiration")) {
                        break;
                    } else {
                        Object objM42772d = oyc.m42772d(wej.m54282d(vejVarM52684d), vmh.ISO_8601);
                        Throwable thM53354e3 = vre.m53354e(objM42772d);
                        if (thM53354e3 != null) {
                            objM42772d = vre.m53351b(wre.m54933a(new an5("expected (timestamp: `com.amazonaws.s3#SessionExpiration`)", thM53354e3)));
                        }
                        wre.m54934b(objM42772d);
                        c13194a.m25074h((gk8) objM42772d);
                        break;
                    }
                case 1364055403:
                    if (!strM52683c.equals("SecretAccessKey")) {
                        break;
                    } else {
                        Object objM54282d3 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e4 = vre.m53354e(objM54282d3);
                        if (thM53354e4 != null) {
                            objM54282d3 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#SessionCredentialValue`)", thM53354e4)));
                        }
                        wre.m54934b(objM54282d3);
                        c13194a.m25075i((String) objM54282d3);
                        break;
                    }
            }
            vejVarM52684d.m52681a();
        }
    }
}
