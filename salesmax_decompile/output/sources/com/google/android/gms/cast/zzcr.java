package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzcr extends zzdp {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzd.zzb.zzw(zzb(), this.zza, this.zzb, 0, -1, -1L, this.zzc);
    }
}
