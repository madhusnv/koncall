package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC11951a;

/* loaded from: classes6.dex */
public abstract class zve {
    /* renamed from: a */
    public static final void m59988a(Throwable th, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            fwe.m27599r(th);
        } catch (Throwable th2) {
            cl6.m21376a(th, th2);
            AbstractC11951a.m16250a(q74Var, th);
        }
    }
}
