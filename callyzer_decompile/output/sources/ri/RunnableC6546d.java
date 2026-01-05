package ri;

import java.util.concurrent.ExecutorService;
import l1.C4327p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6546d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f31390a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorServiceC6548f f31391b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f31392c;

    /* renamed from: d */
    public final /* synthetic */ C4327p f31393d;

    public /* synthetic */ RunnableC6546d(ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f, Runnable runnable, C4327p c4327p, int i10) {
        this.f31390a = i10;
        this.f31391b = scheduledExecutorServiceC6548f;
        this.f31392c = runnable;
        this.f31393d = c4327p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31390a) {
            case 0:
                ExecutorService executorService = this.f31391b.f31398a;
                final int i10 = 0;
                final Runnable runnable = this.f31392c;
                final C4327p c4327p = this.f31393d;
                executorService.execute(new Runnable() { // from class: ri.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC6550h) c4327p.f21788b).mo15505k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC6550h) c4327p.f21788b).mo15505k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC6550h scheduledFutureC6550h = (ScheduledFutureC6550h) c4327p.f21788b;
                                try {
                                    runnable2.run();
                                    scheduledFutureC6550h.m15504j(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC6550h.mo15505k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f31391b.f31398a;
                final int i11 = 2;
                final Runnable runnable2 = this.f31392c;
                final C4327p c4327p2 = this.f31393d;
                executorService2.execute(new Runnable() { // from class: ri.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC6550h) c4327p2.f21788b).mo15505k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC6550h) c4327p2.f21788b).mo15505k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC6550h scheduledFutureC6550h = (ScheduledFutureC6550h) c4327p2.f21788b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC6550h.m15504j(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC6550h.mo15505k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f31391b.f31398a;
                final int i12 = 1;
                final Runnable runnable3 = this.f31392c;
                final C4327p c4327p3 = this.f31393d;
                executorService3.execute(new Runnable() { // from class: ri.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC6550h) c4327p3.f21788b).mo15505k(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC6550h) c4327p3.f21788b).mo15505k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC6550h scheduledFutureC6550h = (ScheduledFutureC6550h) c4327p3.f21788b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC6550h.m15504j(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC6550h.mo15505k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
