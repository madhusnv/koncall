package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.zb8;

/* loaded from: classes2.dex */
public abstract class bc8 {
    /* renamed from: a */
    public static final void m18597a(zb8.C18606a c18606a, byte[] bArr) {
        sq8.m48649h(c18606a, "builder");
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
                    objM54282d = vre.m53351b(wre.m54933a(new an5("expected (string: `com.amazonaws.sts#idpRejectedClaimMessage`)", thM53354e)));
                }
                wre.m54934b(objM54282d);
                c18606a.m59147d((String) objM54282d);
            }
            vejVarM52684d.m52681a();
        }
    }
}
