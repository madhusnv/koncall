package com.google.android.gms.cast;

/* loaded from: classes5.dex */
final class zzaj implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ CastRemoteDisplayLocalService zzb;

    public zzaj(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z) {
        this.zzb = castRemoteDisplayLocalService;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzx(this.zza);
    }
}
