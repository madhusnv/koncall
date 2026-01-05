package com.google.android.gms.cast.framework.media;

import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzau extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(RemoteMediaClient remoteMediaClient, boolean z, int i, int i2, int i3) {
        super(remoteMediaClient, true);
        this.zzd = remoteMediaClient;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzd.zze.zzt(zzb(), this.zza, this.zzb, this.zzc);
    }
}
