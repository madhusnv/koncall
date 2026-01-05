package og;

import fk.C2303i;
import fk.InterfaceC2312r;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import t8.ThreadFactoryC7057c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class lg {

    /* renamed from: a */
    public static fk.h1 f26624a;

    /* renamed from: a */
    public static final ExecutorService m10752a(boolean z6) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC7057c(z6));
        AbstractC4154l.m8922e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* renamed from: b */
    public static final void m10753b() {
        try {
            if (f26624a == null) {
                fk.h1 h1Var = (fk.h1) ((C2303i) ((InterfaceC2312r) C3773g.m8291c().m8294b(InterfaceC2312r.class))).f10433o.get();
                AbstractC4154l.m8923f(h1Var, "<set-?>");
                f26624a = h1Var;
            }
            fk.h1 h1Var2 = f26624a;
            if (h1Var2 == null) {
                AbstractC4154l.m8928k("sharedSessionRepository");
                throw null;
            }
            if (h1Var2.f10417i) {
                if (h1Var2 != null) {
                    h1Var2.m5972b();
                } else {
                    AbstractC4154l.m8928k("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
