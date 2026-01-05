package l0;

import bk.RunnableC0683n;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import k0.ExecutorC3891a;
import og.y0;
import pg.i7;
import pg.t8;
import x4.C8299i;
import zh.InterfaceFutureC8957d;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.h */
/* loaded from: classes.dex */
public abstract class AbstractC4308h {
    /* renamed from: a */
    public static Object m9031a(Future future) {
        y0.m11056f("Future was expected to be done, " + future, future.isDone());
        return m9032b(future);
    }

    /* renamed from: b */
    public static Object m9032b(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: c */
    public static C4310j m9033c(Object obj) {
        return obj == null ? C4310j.f21736c : new C4310j(0, obj);
    }

    /* renamed from: d */
    public static InterfaceFutureC8957d m9034d(InterfaceFutureC8957d interfaceFutureC8957d) {
        interfaceFutureC8957d.getClass();
        return interfaceFutureC8957d.isDone() ? interfaceFutureC8957d : i7.m11697b(new C4305e(interfaceFutureC8957d, 0));
    }

    /* renamed from: e */
    public static void m9035e(InterfaceFutureC8957d interfaceFutureC8957d, C8299i c8299i) {
        m9036f(true, interfaceFutureC8957d, c8299i, t8.m11872a());
    }

    /* renamed from: f */
    public static void m9036f(boolean z6, InterfaceFutureC8957d interfaceFutureC8957d, C8299i c8299i, ExecutorC3891a executorC3891a) {
        interfaceFutureC8957d.getClass();
        c8299i.getClass();
        executorC3891a.getClass();
        interfaceFutureC8957d.mo9026a(new RunnableC4307g(0, interfaceFutureC8957d, new C8986c(29, c8299i)), executorC3891a);
        if (z6) {
            c8299i.m15506a(new RunnableC0683n(4, interfaceFutureC8957d), t8.m11872a());
        }
    }

    /* renamed from: g */
    public static RunnableC4302b m9037g(InterfaceFutureC8957d interfaceFutureC8957d, InterfaceC4301a interfaceC4301a, Executor executor) {
        RunnableC4302b runnableC4302b = new RunnableC4302b(interfaceC4301a, interfaceFutureC8957d);
        interfaceFutureC8957d.mo9026a(runnableC4302b, executor);
        return runnableC4302b;
    }
}
