package p001o;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public abstract class b84 {

    /* renamed from: a */
    public static final Collection f15665a = qef.m45302A(oef.m42144c(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final Collection m18272a() {
        return f15665a;
    }

    /* renamed from: b */
    public static final void m18273b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
