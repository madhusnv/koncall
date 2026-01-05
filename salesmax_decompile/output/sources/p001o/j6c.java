package p001o;

import org.apache.http.HttpHeaders;
import p001o.e6c;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class j6c {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e6c m33296a(vej vejVar) {
        Object objM53351b;
        Throwable thM53354e;
        Object objM53351b2;
        Throwable thM53354e2;
        sq8.m48649h(vejVar, "reader");
        e6c.C13117a c13117a = new e6c.C13117a();
        while (true) {
            vej vejVarM52684d = vejVar.m52684d();
            if (vejVarM52684d == null) {
                c13117a.m24400b();
                return c13117a.m24399a();
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case 75327:
                    if (!strM52683c.equals("Key")) {
                        break;
                    } else {
                        Object objM54282d = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e3 = vre.m53354e(objM54282d);
                        if (thM53354e3 != null) {
                            objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ObjectKey`)", thM53354e3)));
                        }
                        wre.m54934b(objM54282d);
                        c13117a.m24411m((String) objM54282d);
                        break;
                    }
                case 2139413:
                    if (!strM52683c.equals(HttpHeaders.ETAG)) {
                        break;
                    } else {
                        Object objM54282d2 = wej.m54282d(vejVarM52684d);
                        Throwable thM53354e4 = vre.m53354e(objM54282d2);
                        if (thM53354e4 != null) {
                            objM54282d2 = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.s3#ETag`)", thM53354e4)));
                        }
                        wre.m54934b(objM54282d2);
                        c13117a.m24410l((String) objM54282d2);
                        break;
                    }
                case 2577441:
                    if (!strM52683c.equals("Size")) {
                        break;
                    } else {
                        Object objM42771c = oyc.m42771c(wej.m54282d(vejVarM52684d));
                        Throwable thM53354e5 = vre.m53354e(objM42771c);
                        if (thM53354e5 != null) {
                            objM42771c = vre.m53351b(wre.m54933a(new an5("expected (long: `com.amazonaws.s3#Size`)", thM53354e5)));
                        }
                        wre.m54934b(objM42771c);
                        c13117a.m24415q((Long) objM42771c);
                        break;
                    }
                case 34348032:
                    if (!strM52683c.equals("RestoreStatus")) {
                        break;
                    } else {
                        c13117a.m24414p(mre.m39526a(vejVarM52684d));
                        break;
                    }
                case 76612243:
                    if (!strM52683c.equals("Owner")) {
                        break;
                    } else {
                        c13117a.m24413o(ugc.m51567a(vejVarM52684d));
                        break;
                    }
                case 1035673565:
                    if (!strM52683c.equals("StorageClass")) {
                        break;
                    } else {
                        Object objM54282d3 = wej.m54282d(vejVarM52684d);
                        if (vre.m53357h(objM54282d3)) {
                            try {
                                objM53351b = vre.m53351b(p6c.f39402a.m43006a((String) objM54282d3));
                            } catch (Throwable th) {
                                vre.C17665a c17665a = vre.f50797b;
                                objM54282d3 = wre.m54933a(th);
                            }
                            thM53354e = vre.m53354e(objM53351b);
                            if (thM53354e != null) {
                                objM53351b = vre.m53351b(wre.m54933a(new an5("expected (enum: `com.amazonaws.s3#ObjectStorageClass`)", thM53354e)));
                            }
                            wre.m54934b(objM53351b);
                            c13117a.m24416r((p6c) objM53351b);
                            break;
                        } else {
                            objM53351b = vre.m53351b(objM54282d3);
                            thM53354e = vre.m53354e(objM53351b);
                            if (thM53354e != null) {
                            }
                            wre.m54934b(objM53351b);
                            c13117a.m24416r((p6c) objM53351b);
                        }
                    }
                case 1179374412:
                    if (!strM52683c.equals("ChecksumAlgorithm")) {
                        break;
                    } else {
                        Object objM54282d4 = wej.m54282d(vejVarM52684d);
                        if (vre.m53357h(objM54282d4)) {
                            try {
                                objM53351b2 = vre.m53351b(t83.f46609a.m49557a((String) objM54282d4));
                            } catch (Throwable th2) {
                                vre.C17665a c17665a2 = vre.f50797b;
                                objM54282d4 = wre.m54933a(th2);
                            }
                            thM53354e2 = vre.m53354e(objM53351b2);
                            if (thM53354e2 != null) {
                                objM53351b2 = vre.m53351b(wre.m54933a(new an5("expected (enum: `com.amazonaws.s3#ChecksumAlgorithm`)", thM53354e2)));
                            }
                            wre.m54934b(objM53351b2);
                            c13117a.m24409k(sg3.m48305a(c13117a.m24401c(), (t83) objM53351b2));
                            break;
                        } else {
                            objM53351b2 = vre.m53351b(objM54282d4);
                            thM53354e2 = vre.m53354e(objM53351b2);
                            if (thM53354e2 != null) {
                            }
                            wre.m54934b(objM53351b2);
                            c13117a.m24409k(sg3.m48305a(c13117a.m24401c(), (t83) objM53351b2));
                        }
                    }
                case 2123323295:
                    if (!strM52683c.equals("LastModified")) {
                        break;
                    } else {
                        Object objM42772d = oyc.m42772d(wej.m54282d(vejVarM52684d), vmh.ISO_8601);
                        Throwable thM53354e6 = vre.m53354e(objM42772d);
                        if (thM53354e6 != null) {
                            objM42772d = vre.m53351b(wre.m54933a(new an5("expected (timestamp: `com.amazonaws.s3#LastModified`)", thM53354e6)));
                        }
                        wre.m54934b(objM42772d);
                        c13117a.m24412n((gk8) objM42772d);
                        break;
                    }
            }
            vejVarM52684d.m52681a();
        }
    }
}
