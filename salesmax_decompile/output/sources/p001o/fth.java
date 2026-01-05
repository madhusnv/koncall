package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public abstract class fth {
    /* renamed from: a */
    public static final void m27471a(dth dthVar, Throwable th, boolean z) {
        sq8.m48649h(dthVar, "<this>");
        sq8.m48649h(th, "ex");
        String strMo26336c = kge.m35689b(th.getClass()).mo26336c();
        if (strMo26336c == null) {
            strMo26336c = kge.m35689b(th.getClass()).mo26337d();
        }
        m27472b(dthVar, Constants.IPC_BUNDLE_KEY_SEND_ERROR, Boolean.TRUE);
        String message = th.getMessage();
        if (message != null) {
            m27472b(dthVar, "exception.message", message);
        }
        if (strMo26336c != null) {
            m27472b(dthVar, "exception.type", strMo26336c);
        }
        m27472b(dthVar, "exception.stacktrace", cl6.m21378c(th));
        Throwable cause = th.getCause();
        if (cause != null) {
            m27472b(dthVar, "exception.cause", cause.toString());
        }
        m27472b(dthVar, "exception.escaped", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static final void m27472b(dth dthVar, String str, Object obj) {
        sq8.m48649h(dthVar, "<this>");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        dthVar.mo23814p(new kx0(str), obj);
    }
}
