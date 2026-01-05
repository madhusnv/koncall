package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes3.dex */
public abstract class ixe {
    /* renamed from: a */
    public static final gxe m32886a(byte[] bArr) {
        sq8.m48649h(bArr, "payload");
        vej vejVarM54283e = wej.m54283e(bArr);
        String strM54279a = null;
        String strM54279a2 = null;
        String strM54279a3 = null;
        String strM54279a4 = null;
        while (true) {
            vej vejVarM52684d = vejVarM54283e.m52684d();
            if (vejVarM52684d == null) {
                return new gxe(strM54279a, strM54279a2, strM54279a3, strM54279a4);
            }
            String strM52683c = vejVarM52684d.m52683c();
            switch (strM52683c.hashCode()) {
                case -2127617789:
                    if (strM52683c.equals("HostId")) {
                        strM54279a4 = wej.m54279a(vejVarM52684d);
                        continue;
                    }
                    vejVarM52684d.m52681a();
                case -1675388953:
                    if (!strM52683c.equals("Message")) {
                    }
                    vejVarM52684d.m52681a();
                    break;
                case -1597066262:
                    if (strM52683c.equals("RequestId")) {
                        strM54279a3 = wej.m54279a(vejVarM52684d);
                        continue;
                    }
                    vejVarM52684d.m52681a();
                case 2105869:
                    if (strM52683c.equals("Code")) {
                        strM54279a = wej.m54279a(vejVarM52684d);
                    } else {
                        continue;
                    }
                    vejVarM52684d.m52681a();
                case 954925063:
                    if (!strM52683c.equals(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) {
                    }
                    vejVarM52684d.m52681a();
                    break;
                default:
                    vejVarM52684d.m52681a();
            }
            strM54279a2 = wej.m54279a(vejVarM52684d);
            vejVarM52684d.m52681a();
        }
    }

    /* renamed from: b */
    public static final void m32887b(Object obj, g48 g48Var, gxe gxeVar) {
        String strM29630c;
        sq8.m48649h(obj, "exception");
        sq8.m48649h(g48Var, "response");
        b2e.m18117a(obj, g48Var, gxeVar);
        if (obj instanceof q81) {
            tx0.m50743h(((q81) obj).mo34658a().m35772c(), ggf.f25107e.m28593e(), gxeVar != null ? gxeVar.m29629b() : null);
        }
        if (obj instanceof jxe) {
            if (gxeVar == null || (strM29630c = gxeVar.m29630c()) == null) {
                strM29630c = (String) g48Var.getHeaders().get("x-amz-id-2");
            }
            tx0.m50743h(((jxe) obj).mo30426c().m35772c(), hxe.f27763k.m31267a(), strM29630c);
        }
    }
}
