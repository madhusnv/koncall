package p001o;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public final class he0 extends i7 implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public he0() {
        super(CoroutineExceptionHandler.f13954j);
        this._preHandler = this;
    }

    /* renamed from: K */
    public final Method m30278K() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* renamed from: Y */
    public void mo16249Y(q74 q74Var, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method methodM30278K = m30278K();
            Object objInvoke = methodM30278K != null ? methodM30278K.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
