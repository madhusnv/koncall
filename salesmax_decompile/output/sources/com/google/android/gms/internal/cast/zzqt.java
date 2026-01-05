package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzqt extends zzqq implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    public zzqt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzqw zzqwVarZzn = zzqw.zzn(runnable, null);
        return new zzqr(zzqwVarZzn, this.zza.schedule(zzqwVarZzn, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzqs zzqsVar = new zzqs(runnable);
        return new zzqr(zzqsVar, this.zza.scheduleAtFixedRate(zzqsVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzqs zzqsVar = new zzqs(runnable);
        return new zzqr(zzqsVar, this.zza.scheduleWithFixedDelay(zzqsVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzqw zzqwVar = new zzqw(callable);
        return new zzqr(zzqwVar, this.zza.schedule(zzqwVar, j, timeUnit));
    }
}
