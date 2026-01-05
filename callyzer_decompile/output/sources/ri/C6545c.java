package ri;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l1.C4327p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C6545c implements InterfaceC6549g {

    /* renamed from: a */
    public final /* synthetic */ int f31384a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorServiceC6548f f31385b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f31386c;

    /* renamed from: d */
    public final /* synthetic */ long f31387d;

    /* renamed from: e */
    public final /* synthetic */ long f31388e;

    /* renamed from: f */
    public final /* synthetic */ TimeUnit f31389f;

    public /* synthetic */ C6545c(ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f, Runnable runnable, long j6, long j10, TimeUnit timeUnit, int i10) {
        this.f31384a = i10;
        this.f31385b = scheduledExecutorServiceC6548f;
        this.f31386c = runnable;
        this.f31387d = j6;
        this.f31388e = j10;
        this.f31389f = timeUnit;
    }

    @Override // ri.InterfaceC6549g
    /* renamed from: a */
    public final ScheduledFuture mo5398a(C4327p c4327p) {
        switch (this.f31384a) {
            case 0:
                ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f = this.f31385b;
                return scheduledExecutorServiceC6548f.f31399b.scheduleAtFixedRate(new RunnableC6546d(scheduledExecutorServiceC6548f, this.f31386c, c4327p, 0), this.f31387d, this.f31388e, this.f31389f);
            default:
                ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f2 = this.f31385b;
                return scheduledExecutorServiceC6548f2.f31399b.scheduleWithFixedDelay(new RunnableC6546d(scheduledExecutorServiceC6548f2, this.f31386c, c4327p, 2), this.f31387d, this.f31388e, this.f31389f);
        }
    }
}
