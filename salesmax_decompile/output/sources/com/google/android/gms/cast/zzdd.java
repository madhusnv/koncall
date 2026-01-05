package com.google.android.gms.cast;

import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdd extends zzdp {
    final /* synthetic */ MediaInfo zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long[] zzd;
    final /* synthetic */ JSONObject zze;
    final /* synthetic */ RemoteMediaPlayer zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdd(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzf = remoteMediaPlayer;
        this.zza = mediaInfo;
        this.zzb = z;
        this.zzc = j;
        this.zzd = jArr;
        this.zze = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) {
        synchronized (this.zzf.zza) {
            com.google.android.gms.cast.internal.zzaq zzaqVar = this.zzf.zzb;
            com.google.android.gms.cast.internal.zzat zzatVarZzb = zzb();
            MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
            builder.setMediaInfo(this.zza);
            builder.setAutoplay(Boolean.valueOf(this.zzb));
            builder.setCurrentTime(this.zzc);
            builder.setActiveTrackIds(this.zzd);
            builder.setCustomData(this.zze);
            zzaqVar.zzp(zzatVarZzb, builder.build());
        }
    }
}
