package p001o;

import p001o.tgc;

/* loaded from: classes3.dex */
public abstract class ugc {
    /* renamed from: a */
    public static final tgc m51567a(vej vejVar) {
        sq8.m48649h(vejVar, "reader");
        tgc.C17106a c17106a = new tgc.C17106a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c17106a.m49832b();
                return c17106a.m49831a();
            }
            String strM52683c = vejVarM52684d.m52683c();
            if (sq8.m48644c(strM52683c, "DisplayName")) {
                Object objM54282d = wej.m54282d(vejVarM52684d);
                Throwable thM53354e = vre.m53354e(objM54282d);
                if (thM53354e != null) {
                    objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#DisplayName`)", thM53354e)));
                }
                wre.m54934b(objM54282d);
                c17106a.m49835e((String) objM54282d);
            } else if (sq8.m48644c(strM52683c, "ID")) {
                Object objM54282d2 = wej.m54282d(vejVarM52684d);
                Throwable thM53354e2 = vre.m53354e(objM54282d2);
                if (thM53354e2 != null) {
                    objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ID`)", thM53354e2)));
                }
                wre.m54934b(objM54282d2);
                c17106a.m49836f((String) objM54282d2);
            }
            vejVarM52684d.m52681a();
        }
    }
}
