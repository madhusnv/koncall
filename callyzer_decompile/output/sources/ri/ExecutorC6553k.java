package ri;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import sf.AbstractC6840z;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.k */
/* loaded from: classes.dex */
public final class ExecutorC6553k implements Executor {

    /* renamed from: f */
    public static final Logger f31401f = Logger.getLogger(ExecutorC6553k.class.getName());

    /* renamed from: a */
    public final Executor f31402a;

    /* renamed from: b */
    public final ArrayDeque f31403b = new ArrayDeque();

    /* renamed from: c */
    public EnumC6552j f31404c = EnumC6552j.IDLE;

    /* renamed from: d */
    public long f31405d = 0;

    /* renamed from: e */
    public final RunnableC8956c f31406e = new RunnableC8956c(this);

    public ExecutorC6553k(Executor executor) {
        AbstractC6840z.m13036g(executor);
        this.f31402a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            sf.AbstractC6840z.m13036g(r8)
            java.util.ArrayDeque r0 = r7.f31403b
            monitor-enter(r0)
            ri.j r1 = r7.f31404c     // Catch: java.lang.Throwable -> L6e
            ri.j r2 = ri.EnumC6552j.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            ri.j r2 = ri.EnumC6552j.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f31405d     // Catch: java.lang.Throwable -> L6e
            ag.b r1 = new ag.b     // Catch: java.lang.Throwable -> L6e
            r5 = 2
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f31403b     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            ri.j r8 = ri.EnumC6552j.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f31404c = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f31402a     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            zh.c r5 = r7.f31406e     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            ri.j r0 = r7.f31404c
            if (r0 == r8) goto L2f
            goto L6a
        L2f:
            java.util.ArrayDeque r0 = r7.f31403b
            monitor-enter(r0)
            long r5 = r7.f31405d     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            ri.j r1 = r7.f31404c     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f31404c = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f31403b
            monitor-enter(r2)
            ri.j r0 = r7.f31404c     // Catch: java.lang.Throwable -> L56
            ri.j r3 = ri.EnumC6552j.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            ri.j r3 = ri.EnumC6552j.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f31403b     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
        L6a:
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.f31403b     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.ExecutorC6553k.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f31402a + "}";
    }
}
