package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001o.zfa;

/* loaded from: classes3.dex */
final class zzqr extends zzqh implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzqr(zfa zfaVar, ScheduledFuture scheduledFuture) {
        super(zfaVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.cast.zzqg, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = zzb().cancel(z);
        if (zCancel) {
            this.zza.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
