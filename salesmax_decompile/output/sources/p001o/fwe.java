package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class fwe {

    /* renamed from: a */
    public static volatile gu3 f24183a;

    /* renamed from: b */
    public static volatile rl7 f24184b;

    /* renamed from: c */
    public static volatile rl7 f24185c;

    /* renamed from: d */
    public static volatile rl7 f24186d;

    /* renamed from: e */
    public static volatile rl7 f24187e;

    /* renamed from: f */
    public static volatile rl7 f24188f;

    /* renamed from: g */
    public static volatile rl7 f24189g;

    /* renamed from: h */
    public static volatile rl7 f24190h;

    /* renamed from: i */
    public static volatile rl7 f24191i;

    /* renamed from: j */
    public static volatile rl7 f24192j;

    /* renamed from: k */
    public static volatile rl7 f24193k;

    /* renamed from: l */
    public static volatile rl7 f24194l;

    /* renamed from: m */
    public static volatile rl7 f24195m;

    /* renamed from: n */
    public static volatile rl7 f24196n;

    /* renamed from: o */
    public static volatile rl7 f24197o;

    /* renamed from: p */
    public static volatile jh1 f24198p;

    /* renamed from: q */
    public static volatile jh1 f24199q;

    /* renamed from: r */
    public static volatile jh1 f24200r;

    /* renamed from: s */
    public static volatile jh1 f24201s;

    /* renamed from: t */
    public static volatile jh1 f24202t;

    /* renamed from: u */
    public static volatile boolean f24203u;

    /* renamed from: v */
    public static volatile boolean f24204v;

    /* renamed from: A */
    public static qag m27579A(s47 s47Var, qag qagVar) {
        jh1 jh1Var = f24198p;
        return jh1Var != null ? (qag) m27582a(jh1Var, s47Var, qagVar) : qagVar;
    }

    /* renamed from: B */
    public static void m27580B(gu3 gu3Var) {
        if (f24203u) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f24183a = gu3Var;
    }

    /* renamed from: C */
    public static void m27581C(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* renamed from: a */
    public static Object m27582a(jh1 jh1Var, Object obj, Object obj2) {
        try {
            return jh1Var.apply(obj, obj2);
        } catch (Throwable th) {
            throw xk6.m56420h(th);
        }
    }

    /* renamed from: b */
    public static Object m27583b(rl7 rl7Var, Object obj) {
        try {
            return rl7Var.apply(obj);
        } catch (Throwable th) {
            throw xk6.m56420h(th);
        }
    }

    /* renamed from: c */
    public static c5f m27584c(rl7 rl7Var, idg idgVar) {
        Object objM27583b = m27583b(rl7Var, idgVar);
        Objects.requireNonNull(objM27583b, "Scheduler Supplier result can't be null");
        return (c5f) objM27583b;
    }

    /* renamed from: d */
    public static c5f m27585d(idg idgVar) {
        try {
            Object obj = idgVar.get();
            Objects.requireNonNull(obj, "Scheduler Supplier result can't be null");
            return (c5f) obj;
        } catch (Throwable th) {
            throw xk6.m56420h(th);
        }
    }

    /* renamed from: e */
    public static c5f m27586e(idg idgVar) {
        Objects.requireNonNull(idgVar, "Scheduler Supplier can't be null");
        rl7 rl7Var = f24185c;
        return rl7Var == null ? m27585d(idgVar) : m27584c(rl7Var, idgVar);
    }

    /* renamed from: f */
    public static c5f m27587f(idg idgVar) {
        Objects.requireNonNull(idgVar, "Scheduler Supplier can't be null");
        rl7 rl7Var = f24187e;
        return rl7Var == null ? m27585d(idgVar) : m27584c(rl7Var, idgVar);
    }

    /* renamed from: g */
    public static c5f m27588g(idg idgVar) {
        Objects.requireNonNull(idgVar, "Scheduler Supplier can't be null");
        rl7 rl7Var = f24188f;
        return rl7Var == null ? m27585d(idgVar) : m27584c(rl7Var, idgVar);
    }

    /* renamed from: h */
    public static c5f m27589h(idg idgVar) {
        Objects.requireNonNull(idgVar, "Scheduler Supplier can't be null");
        rl7 rl7Var = f24186d;
        return rl7Var == null ? m27585d(idgVar) : m27584c(rl7Var, idgVar);
    }

    /* renamed from: i */
    public static boolean m27590i(Throwable th) {
        return (th instanceof pbc) || (th instanceof ggb) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof mo3);
    }

    /* renamed from: j */
    public static boolean m27591j() {
        return f24204v;
    }

    /* renamed from: k */
    public static xk3 m27592k(xk3 xk3Var) {
        rl7 rl7Var = f24197o;
        return rl7Var != null ? (xk3) m27583b(rl7Var, xk3Var) : xk3Var;
    }

    /* renamed from: l */
    public static s47 m27593l(s47 s47Var) {
        rl7 rl7Var = f24193k;
        return rl7Var != null ? (s47) m27583b(rl7Var, s47Var) : s47Var;
    }

    /* renamed from: m */
    public static g0b m27594m(g0b g0bVar) {
        rl7 rl7Var = f24195m;
        return rl7Var != null ? (g0b) m27583b(rl7Var, g0bVar) : g0bVar;
    }

    /* renamed from: n */
    public static x6c m27595n(x6c x6cVar) {
        rl7 rl7Var = f24194l;
        return rl7Var != null ? (x6c) m27583b(rl7Var, x6cVar) : x6cVar;
    }

    /* renamed from: o */
    public static wtf m27596o(wtf wtfVar) {
        rl7 rl7Var = f24196n;
        return rl7Var != null ? (wtf) m27583b(rl7Var, wtfVar) : wtfVar;
    }

    /* renamed from: p */
    public static boolean m27597p() {
        return false;
    }

    /* renamed from: q */
    public static c5f m27598q(c5f c5fVar) {
        rl7 rl7Var = f24189g;
        return rl7Var == null ? c5fVar : (c5f) m27583b(rl7Var, c5fVar);
    }

    /* renamed from: r */
    public static void m27599r(Throwable th) {
        gu3 gu3Var = f24183a;
        if (th == null) {
            th = xk6.m56414b("onError called with a null Throwable.");
        } else if (!m27590i(th)) {
            th = new e3i(th);
        }
        if (gu3Var != null) {
            try {
                gu3Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m27581C(th2);
            }
        }
        th.printStackTrace();
        m27581C(th);
    }

    /* renamed from: s */
    public static c5f m27600s(c5f c5fVar) {
        rl7 rl7Var = f24191i;
        return rl7Var == null ? c5fVar : (c5f) m27583b(rl7Var, c5fVar);
    }

    /* renamed from: t */
    public static c5f m27601t(c5f c5fVar) {
        rl7 rl7Var = f24192j;
        return rl7Var == null ? c5fVar : (c5f) m27583b(rl7Var, c5fVar);
    }

    /* renamed from: u */
    public static Runnable m27602u(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        rl7 rl7Var = f24184b;
        return rl7Var == null ? runnable : (Runnable) m27583b(rl7Var, runnable);
    }

    /* renamed from: v */
    public static c5f m27603v(c5f c5fVar) {
        rl7 rl7Var = f24190h;
        return rl7Var == null ? c5fVar : (c5f) m27583b(rl7Var, c5fVar);
    }

    /* renamed from: w */
    public static ml3 m27604w(xk3 xk3Var, ml3 ml3Var) {
        jh1 jh1Var = f24202t;
        return jh1Var != null ? (ml3) m27582a(jh1Var, xk3Var, ml3Var) : ml3Var;
    }

    /* renamed from: x */
    public static q0b m27605x(g0b g0bVar, q0b q0bVar) {
        jh1 jh1Var = f24199q;
        return jh1Var != null ? (q0b) m27582a(jh1Var, g0bVar, q0bVar) : q0bVar;
    }

    /* renamed from: y */
    public static m9c m27606y(x6c x6cVar, m9c m9cVar) {
        jh1 jh1Var = f24200r;
        return jh1Var != null ? (m9c) m27582a(jh1Var, x6cVar, m9cVar) : m9cVar;
    }

    /* renamed from: z */
    public static luf m27607z(wtf wtfVar, luf lufVar) {
        jh1 jh1Var = f24201s;
        return jh1Var != null ? (luf) m27582a(jh1Var, wtfVar, lufVar) : lufVar;
    }
}
