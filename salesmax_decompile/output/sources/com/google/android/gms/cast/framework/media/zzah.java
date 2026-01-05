package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzah extends zzbk {
    final /* synthetic */ MediaQueueItem zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ JSONObject zzd;
    final /* synthetic */ RemoteMediaClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(RemoteMediaClient remoteMediaClient, MediaQueueItem mediaQueueItem, int i, long j, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zze = remoteMediaClient;
        this.zza = mediaQueueItem;
        this.zzb = i;
        this.zzc = j;
        this.zzd = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zze.zze.zzw(zzb(), new MediaQueueItem[]{this.zza}, this.zzb, 0, 0, this.zzc, this.zzd);
    }
}
