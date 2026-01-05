package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.vre;

/* loaded from: classes3.dex */
public final class udj {

    /* renamed from: a */
    public static final udj f48749a = new udj();

    /* renamed from: a */
    public final tdj m51390a(vej vejVar) {
        Object objM53351b;
        String strM52683c;
        vej vejVarM52684d;
        String strM54279a;
        String strM54279a2;
        sq8.m48649h(vejVar, "root");
        try {
            vre.C17665a c17665a = vre.f50797b;
            strM52683c = vejVar.m52683c();
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (!(sq8.m48644c(strM52683c, "ErrorResponse") || sq8.m48644c(strM52683c, "Error"))) {
            throw new IllegalStateException("expected restXml error response with root tag of <ErrorResponse> or <Error>".toString());
        }
        if (sq8.m48644c(vejVar.m52683c(), "ErrorResponse")) {
            vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                throw new IllegalStateException("expected more tags after <ErrorResponse>".toString());
            }
        } else {
            vejVarM52684d = vejVar;
        }
        String strM54279a3 = null;
        if (sq8.m48644c(vejVarM52684d.m52683c(), "Error")) {
            strM54279a = null;
            strM54279a2 = null;
            while (true) {
                vej vejVarM52684d2 = vejVarM52684d.m52684d();
                if (vejVarM52684d2 != null) {
                    String strM52683c2 = vejVarM52684d2.m52683c();
                    switch (strM52683c2.hashCode()) {
                        case -1675388953:
                            if (!strM52683c2.equals("Message")) {
                            }
                            vejVarM52684d2.m52681a();
                            break;
                        case -1597066262:
                            if (strM52683c2.equals("RequestId")) {
                                strM54279a3 = wej.m54279a(vejVarM52684d2);
                            } else {
                                continue;
                            }
                            vejVarM52684d2.m52681a();
                        case 2105869:
                            if (strM52683c2.equals("Code")) {
                                strM54279a2 = wej.m54279a(vejVarM52684d2);
                            } else {
                                continue;
                            }
                            vejVarM52684d2.m52681a();
                        case 954925063:
                            if (!strM52683c2.equals(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) {
                            }
                            vejVarM52684d2.m52681a();
                            break;
                        default:
                            continue;
                            vejVarM52684d2.m52681a();
                    }
                    strM54279a = wej.m54279a(vejVarM52684d2);
                    vejVarM52684d2.m52681a();
                }
            }
        } else {
            strM54279a = null;
            strM54279a2 = null;
        }
        if (strM54279a3 == null) {
            while (true) {
                vej vejVarM52684d3 = vejVar.m52684d();
                if (vejVarM52684d3 != null) {
                    if (sq8.m48644c(vejVarM52684d3.m52683c(), "RequestId")) {
                        strM54279a3 = wej.m54279a(vejVarM52684d3);
                    }
                }
            }
        }
        objM53351b = vre.m53351b(new tdj(strM54279a3, strM54279a2, strM54279a));
        Throwable thM53354e = vre.m53354e(objM53351b);
        if (thM53354e != null) {
            objM53351b = vre.m53351b(wre.m54933a(new an5("Unable to deserialize RestXml error", thM53354e)));
        }
        wre.m54934b(objM53351b);
        return (tdj) objM53351b;
    }
}
