package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import p001o.c84;
import p001o.cl6;
import p001o.q74;

/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11951a {
    /* renamed from: a */
    public static final void m16250a(q74 q74Var, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) q74Var.get(CoroutineExceptionHandler.f13954j);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.mo16249Y(q74Var, th);
            } else {
                c84.m20439a(q74Var, th);
            }
        } catch (Throwable th2) {
            c84.m20439a(q74Var, m16251b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m16251b(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        cl6.m21376a(runtimeException, th);
        return runtimeException;
    }
}
