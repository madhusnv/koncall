package p001o;

import p001o.xj3;

/* loaded from: classes3.dex */
public abstract class yj3 {
    /* renamed from: a */
    public static final xj3 m57860a(vej vejVar) {
        sq8.m48649h(vejVar, "reader");
        xj3.C18170a c18170a = new xj3.C18170a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c18170a.m56373b();
                return c18170a.m56372a();
            }
            if (sq8.m48644c(vejVarM52684d.m52683c(), "Prefix")) {
                Object objM54282d = wej.m54282d(vejVarM52684d);
                Throwable thM53354e = vre.m53354e(objM54282d);
                if (thM53354e != null) {
                    objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#Prefix`)", thM53354e)));
                }
                wre.m54934b(objM54282d);
                c18170a.m56375d((String) objM54282d);
            }
            vejVarM52684d.m52681a();
        }
    }
}
