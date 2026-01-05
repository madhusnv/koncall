package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzaf extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ JSONObject zze;
    final /* synthetic */ RemoteMediaClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzf = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzf.zze.zzx(zzb(), this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
