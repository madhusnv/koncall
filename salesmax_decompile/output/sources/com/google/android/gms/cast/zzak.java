package com.google.android.gms.cast;

import com.google.android.gms.cast.CastRemoteDisplayLocalService;

/* loaded from: classes5.dex */
final class zzak implements Runnable {
    final /* synthetic */ CastRemoteDisplayLocalService.NotificationSettings zza;
    final /* synthetic */ CastRemoteDisplayLocalService zzb;

    public zzak(CastRemoteDisplayLocalService castRemoteDisplayLocalService, CastRemoteDisplayLocalService.NotificationSettings notificationSettings) {
        this.zzb = castRemoteDisplayLocalService;
        this.zza = notificationSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CastRemoteDisplayLocalService.zzq(this.zzb, this.zza);
    }
}
