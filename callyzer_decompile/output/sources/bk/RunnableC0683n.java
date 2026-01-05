package bk;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import mz.AbstractC4917a;
import mz.C4919c;
import mz.C4920d;
import og.i1;
import ug.a1;
import ug.g1;
import ug.h4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.n */
/* loaded from: classes.dex */
public final class RunnableC0683n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4289a;

    /* renamed from: b */
    public final /* synthetic */ Object f4290b;

    public /* synthetic */ RunnableC0683n(int i10, Object obj) {
        this.f4289a = i10;
        this.f4290b = obj;
    }

    /* renamed from: a */
    private final void m1960a() {
        AbstractC4917a abstractC4917aM9822b;
        long jNanoTime;
        AbstractC4917a abstractC4917aM9822b2;
        C4920d c4920d = (C4920d) this.f4290b;
        synchronized (c4920d) {
            c4920d.f24479g++;
            abstractC4917aM9822b = c4920d.m9822b();
        }
        if (abstractC4917aM9822b == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(abstractC4917aM9822b.f24459a);
                Logger logger = ((C4920d) this.f4290b).f24474b;
                C4919c c4919c = abstractC4917aM9822b.f24461c;
                AbstractC4154l.m8920c(c4919c);
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    i1.m10695a(logger, abstractC4917aM9822b, c4919c, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jMo9814a = abstractC4917aM9822b.mo9814a();
                    if (zIsLoggable) {
                        i1.m10695a(logger, abstractC4917aM9822b, c4919c, "finished run in " + i1.m10696b(System.nanoTime() - jNanoTime));
                    }
                    C4920d c4920d2 = (C4920d) this.f4290b;
                    synchronized (c4920d2) {
                        C4920d.m9821a(c4920d2, abstractC4917aM9822b, jMo9814a, true);
                        abstractC4917aM9822b2 = c4920d2.m9822b();
                    }
                    if (abstractC4917aM9822b2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    abstractC4917aM9822b = abstractC4917aM9822b2;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        i1.m10695a(logger, abstractC4917aM9822b, c4919c, "failed a run in " + i1.m10696b(System.nanoTime() - jNanoTime));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    C4920d c4920d3 = (C4920d) this.f4290b;
                    synchronized (c4920d3) {
                        C4920d.m9821a(c4920d3, abstractC4917aM9822b, -1L, false);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    threadCurrentThread.setName(name);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r1 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r3.toString();
        og.u1.m10944c("SequentialExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1961b() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f4290b     // Catch: java.lang.Throwable -> L51
            k0.j r2 = (k0.ExecutorC3900j) r2     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r2 = r2.f20005a     // Catch: java.lang.Throwable -> L51
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f4290b     // Catch: java.lang.Throwable -> L20
            k0.j r0 = (k0.ExecutorC3900j) r0     // Catch: java.lang.Throwable -> L20
            k0.i r3 = r0.f20008d     // Catch: java.lang.Throwable -> L20
            k0.i r4 = k0.EnumC3899i.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L5c
        L22:
            long r5 = r0.f20009e     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f20009e = r5     // Catch: java.lang.Throwable -> L20
            r0.f20008d = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f4290b     // Catch: java.lang.Throwable -> L20
            k0.j r3 = (k0.ExecutorC3900j) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f20005a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L47
            java.lang.Object r0 = r9.f4290b     // Catch: java.lang.Throwable -> L20
            k0.j r0 = (k0.ExecutorC3900j) r0     // Catch: java.lang.Throwable -> L20
            k0.i r3 = k0.EnumC3899i.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f20008d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L51
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L51 java.lang.RuntimeException -> L53
            goto L2
        L51:
            r0 = move-exception
            goto L5e
        L53:
            java.lang.String r2 = "SequentialExecutor"
            r3.toString()     // Catch: java.lang.Throwable -> L51
            og.u1.m10944c(r2)     // Catch: java.lang.Throwable -> L51
            goto L2
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L51
        L5e:
            if (r1 == 0) goto L67
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.RunnableC0683n.m1961b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.RunnableC0683n.run():void");
    }

    public RunnableC0683n(a1 a1Var, boolean z6) {
        this.f4289a = 15;
        this.f4290b = a1Var;
    }

    public RunnableC0683n(h4 h4Var, g1 g1Var) {
        this.f4289a = 19;
        this.f4290b = h4Var;
    }
}
