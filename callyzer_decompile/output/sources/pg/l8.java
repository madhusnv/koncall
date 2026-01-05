package pg;

import android.os.Looper;
import com.websoptimization.callyzerbiz.common.exception.RestApiException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.ExecutorC3891a;
import kotlin.jvm.internal.AbstractC4154l;
import sf.AbstractC6840z;
import uf.C7427b;
import yg.AbstractC8651h;
import yg.C8652i;
import yg.C8656m;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class l8 {
    /* renamed from: a */
    public static Object m11760a(C8656m c8656m) throws InterruptedException {
        AbstractC6840z.m13035f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC6840z.m13037h(c8656m, "Task must not be null");
        if (c8656m.m15984k()) {
            return m11768i(c8656m);
        }
        ug.g1 g1Var = new ug.g1(19);
        Executor executor = AbstractC8651h.f41932b;
        c8656m.m15979f(executor, g1Var);
        c8656m.m15977d(executor, g1Var);
        c8656m.m15974a(executor, g1Var);
        ((CountDownLatch) g1Var.f35448a).await();
        return m11768i(c8656m);
    }

    /* renamed from: b */
    public static Object m11761b(C8656m c8656m, long j6, TimeUnit timeUnit) throws TimeoutException {
        AbstractC6840z.m13035f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC6840z.m13037h(c8656m, "Task must not be null");
        AbstractC6840z.m13037h(timeUnit, "TimeUnit must not be null");
        if (c8656m.m15984k()) {
            return m11768i(c8656m);
        }
        ug.g1 g1Var = new ug.g1(19);
        Executor executor = AbstractC8651h.f41932b;
        c8656m.m15979f(executor, g1Var);
        c8656m.m15977d(executor, g1Var);
        c8656m.m15974a(executor, g1Var);
        if (((CountDownLatch) g1Var.f35448a).await(j6, timeUnit)) {
            return m11768i(c8656m);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static C8656m m11762c(Executor executor, Callable callable) {
        AbstractC6840z.m13037h(executor, "Executor must not be null");
        C8656m c8656m = new C8656m();
        executor.execute(new RunnableC8956c(29, c8656m, callable));
        return c8656m;
    }

    /* renamed from: d */
    public static final boolean m11763d(RestApiException restApiException) {
        AbstractC4154l.m8923f(restApiException, "<this>");
        RestApiException.EnumC1454a enumC1454a = restApiException.f7325a;
        return enumC1454a == RestApiException.EnumC1454a.NETWORK_ERROR || enumC1454a == RestApiException.EnumC1454a.SERVER_ERROR || enumC1454a == RestApiException.EnumC1454a.BAD_REQUEST || enumC1454a == RestApiException.EnumC1454a.UNAUTHORIZED;
    }

    /* renamed from: e */
    public static C8656m m11764e(Exception exc) {
        C8656m c8656m = new C8656m();
        c8656m.m15987n(exc);
        return c8656m;
    }

    /* renamed from: f */
    public static C8656m m11765f(Object obj) {
        C8656m c8656m = new C8656m();
        c8656m.m15988o(obj);
        return c8656m;
    }

    /* renamed from: g */
    public static C8656m m11766g(List list) {
        if (list == null || list.isEmpty()) {
            return m11765f(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C8656m) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C8656m c8656m = new C8656m();
        C8652i c8652i = new C8652i(list.size(), c8656m);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C8656m c8656m2 = (C8656m) it2.next();
            ExecutorC3891a executorC3891a = AbstractC8651h.f41932b;
            c8656m2.m15979f(executorC3891a, c8652i);
            c8656m2.m15977d(executorC3891a, c8652i);
            c8656m2.m15974a(executorC3891a, c8652i);
        }
        return c8656m;
    }

    /* renamed from: h */
    public static C8656m m11767h(C8656m... c8656mArr) {
        if (c8656mArr.length == 0) {
            return m11765f(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(c8656mArr);
        return (listAsList == null || listAsList.isEmpty()) ? m11765f(Collections.EMPTY_LIST) : m11766g(listAsList).m15981h(AbstractC8651h.f41931a, new C7427b(15, listAsList));
    }

    /* renamed from: i */
    public static Object m11768i(C8656m c8656m) throws ExecutionException {
        if (c8656m.m15985l()) {
            return c8656m.m15983j();
        }
        if (c8656m.f41952d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c8656m.m15982i());
    }
}
