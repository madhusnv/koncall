package p001o;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public abstract class wve {

    /* renamed from: a */
    public static volatile rl7 f52762a;

    /* renamed from: b */
    public static volatile rl7 f52763b;

    /* renamed from: a */
    public static Object m55083a(rl7 rl7Var, Object obj) {
        try {
            return rl7Var.apply(obj);
        } catch (Throwable th) {
            throw zk6.m59525a(th);
        }
    }

    /* renamed from: b */
    public static c5f m55084b(rl7 rl7Var, Callable callable) {
        c5f c5fVar = (c5f) m55083a(rl7Var, callable);
        if (c5fVar != null) {
            return c5fVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    public static c5f m55085c(Callable callable) {
        try {
            c5f c5fVar = (c5f) callable.call();
            if (c5fVar != null) {
                return c5fVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw zk6.m59525a(th);
        }
    }

    /* renamed from: d */
    public static c5f m55086d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        rl7 rl7Var = f52762a;
        return rl7Var == null ? m55085c(callable) : m55084b(rl7Var, callable);
    }

    /* renamed from: e */
    public static c5f m55087e(c5f c5fVar) {
        if (c5fVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        rl7 rl7Var = f52763b;
        return rl7Var == null ? c5fVar : (c5f) m55083a(rl7Var, c5fVar);
    }
}
