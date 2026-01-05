package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzcq extends zzdp {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ JSONObject zze;
    final /* synthetic */ RemoteMediaPlayer zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzf = remoteMediaPlayer;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzf.zzb.zzx(zzb(), this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
