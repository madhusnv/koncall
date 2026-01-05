package p001o;

import p001o.ur0;

/* loaded from: classes2.dex */
public abstract class vr0 {
    /* renamed from: a */
    public static final ur0 m53297a(vej vejVar) {
        sq8.m48649h(vejVar, "reader");
        ur0.C17433a c17433a = new ur0.C17433a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c17433a.m51944b();
                return c17433a.m51943a();
            }
            String strM52683c = vejVarM52684d.m52683c();
            if (sq8.m48644c(strM52683c, "AssumedRoleId")) {
                Object objM54282d = wej.m54282d(vejVarM52684d);
                Throwable thM53354e = vre.m53354e(objM54282d);
                if (thM53354e != null) {
                    objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#assumedRoleIdType`)", thM53354e)));
                }
                wre.m54934b(objM54282d);
                c17433a.m51948f((String) objM54282d);
            } else if (sq8.m48644c(strM52683c, "Arn")) {
                Object objM54282d2 = wej.m54282d(vejVarM52684d);
                Throwable thM53354e2 = vre.m53354e(objM54282d2);
                if (thM53354e2 != null) {
                    objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#arnType`)", thM53354e2)));
                }
                wre.m54934b(objM54282d2);
                c17433a.m51947e((String) objM54282d2);
            }
            vejVarM52684d.m52681a();
        }
    }
}
