package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

/* loaded from: classes5.dex */
final class zzbo extends TimerTask {
    final /* synthetic */ RemoteMediaClient zza;
    final /* synthetic */ zzbp zzb;

    public zzbo(zzbp zzbpVar, RemoteMediaClient remoteMediaClient) {
        this.zzb = zzbpVar;
        this.zza = remoteMediaClient;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzbp zzbpVar = this.zzb;
        zzbpVar.zza.zzw(zzbpVar.zzb);
        zzbp zzbpVar2 = this.zzb;
        zzbpVar2.zza.zzd.postDelayed(this, zzbpVar2.zzc);
    }
}
