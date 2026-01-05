package p001o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract class aw7 {
    /* renamed from: a */
    public static void m17889a(m9c m9cVar, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (atomicInteger.getAndIncrement() == 0) {
            ns0Var.m41020f(m9cVar);
        }
    }

    /* renamed from: b */
    public static void m17890b(qag qagVar, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (atomicInteger.getAndIncrement() == 0) {
            ns0Var.m41021g(qagVar);
        }
    }

    /* renamed from: c */
    public static void m17891c(m9c m9cVar, Throwable th, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (ns0Var.m41017c(th) && atomicInteger.getAndIncrement() == 0) {
            ns0Var.m41020f(m9cVar);
        }
    }

    /* renamed from: d */
    public static void m17892d(qag qagVar, Throwable th, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (ns0Var.m41017c(th) && atomicInteger.getAndIncrement() == 0) {
            ns0Var.m41021g(qagVar);
        }
    }

    /* renamed from: e */
    public static void m17893e(m9c m9cVar, Object obj, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            m9cVar.mo16560e(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                ns0Var.m41020f(m9cVar);
            }
        }
    }

    /* renamed from: f */
    public static boolean m17894f(qag qagVar, Object obj, AtomicInteger atomicInteger, ns0 ns0Var) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            qagVar.mo18166e(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            ns0Var.m41021g(qagVar);
        }
        return false;
    }
}
