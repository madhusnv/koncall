package p001o;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class he9 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList f26741a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static ge9 m30303a(String str) throws GeneralSecurityException {
        Iterator it = f26741a.iterator();
        while (it.hasNext()) {
            ge9 ge9Var = (ge9) it.next();
            if (ge9Var.mo28511a(str)) {
                return ge9Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
