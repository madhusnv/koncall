package k0;

import bk.RunnableC0683n;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.j */
/* loaded from: classes.dex */
public final class ExecutorC3900j implements Executor {

    /* renamed from: b */
    public final Executor f20006b;

    /* renamed from: a */
    public final ArrayDeque f20005a = new ArrayDeque();

    /* renamed from: c */
    public final RunnableC0683n f20007c = new RunnableC0683n(3, this);

    /* renamed from: d */
    public EnumC3899i f20008d = EnumC3899i.IDLE;

    /* renamed from: e */
    public long f20009e = 0;

    public ExecutorC3900j(Executor executor) {
        executor.getClass();
        this.f20006b = executor;
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
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f20005a
            monitor-enter(r0)
            k0.i r1 = r7.f20008d     // Catch: java.lang.Throwable -> L6e
            k0.i r2 = k0.EnumC3899i.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            k0.i r2 = k0.EnumC3899i.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f20009e     // Catch: java.lang.Throwable -> L6e
            ag.b r1 = new ag.b     // Catch: java.lang.Throwable -> L6e
            r5 = 1
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f20005a     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            k0.i r8 = k0.EnumC3899i.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f20008d = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f20006b     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            bk.n r5 = r7.f20007c     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            k0.i r0 = r7.f20008d
            if (r0 == r8) goto L2f
            goto L6a
        L2f:
            java.util.ArrayDeque r0 = r7.f20005a
            monitor-enter(r0)
            long r5 = r7.f20009e     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            k0.i r1 = r7.f20008d     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f20008d = r2     // Catch: java.lang.Throwable -> L3f
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
            java.util.ArrayDeque r2 = r7.f20005a
            monitor-enter(r2)
            k0.i r0 = r7.f20008d     // Catch: java.lang.Throwable -> L56
            k0.i r3 = k0.EnumC3899i.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            k0.i r3 = k0.EnumC3899i.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f20005a     // Catch: java.lang.Throwable -> L56
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
            java.util.ArrayDeque r1 = r7.f20005a     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.ExecutorC3900j.execute(java.lang.Runnable):void");
    }
}
