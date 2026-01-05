package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.ro6;

/* loaded from: classes2.dex */
public abstract class uo6 {
    /* renamed from: a */
    public static final void m51843a(ro6.C16639a c16639a, byte[] bArr) {
        sq8.m48649h(c16639a, "builder");
        sq8.m48649h(bArr, "payload");
        vej vejVarM54243a = wdj.m54243a(wej.m54283e(bArr));
        while (true) {
            vej vejVarM52684d = vejVarM54243a.m52684d();
            if (vejVarM52684d == null) {
                return;
            }
            if (sq8.m48644c(vejVarM52684d.m52683c(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) {
                Object objM54282d = wej.m54282d(vejVarM52684d);
                Throwable thM53354e = vre.m53354e(objM54282d);
                if (thM53354e != null) {
                    objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#expiredIdentityTokenMessage`)", thM53354e)));
                }
                wre.m54934b(objM54282d);
                c16639a.m47028d((String) objM54282d);
            }
            vejVarM52684d.m52681a();
        }
    }
}
