package p001o;

import java.util.Iterator;
import kotlinx.coroutines.AbstractC11951a;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public abstract class c84 {
    /* renamed from: a */
    public static final void m20439a(q74 q74Var, Throwable th) {
        Iterator it = b84.m18272a().iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).mo16249Y(q74Var, th);
            } catch (Throwable th2) {
                b84.m18273b(AbstractC11951a.m16251b(th, th2));
            }
        }
        try {
            cl6.m21376a(th, new pr5(q74Var));
        } catch (Throwable unused) {
        }
        b84.m18273b(th);
    }
}
