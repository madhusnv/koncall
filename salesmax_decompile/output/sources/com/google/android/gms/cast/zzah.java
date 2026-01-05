package com.google.android.gms.cast;

/* loaded from: classes5.dex */
final class zzah implements Runnable {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzah(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.zza;
        castRemoteDisplayLocalService.zzv("onCreate after delay. The local service been started: " + castRemoteDisplayLocalService.zzs);
        CastRemoteDisplayLocalService castRemoteDisplayLocalService2 = this.zza;
        if (castRemoteDisplayLocalService2.zzs) {
            return;
        }
        CastRemoteDisplayLocalService.zza.m13797e("[Instance: %s] %s", castRemoteDisplayLocalService2, "The local service has not been been started, stopping it");
        this.zza.stopSelf();
    }
}
