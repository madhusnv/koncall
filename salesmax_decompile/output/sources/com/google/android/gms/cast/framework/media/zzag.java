package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzag extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzd.zze.zzw(zzb(), this.zza, this.zzb, 0, -1, -1L, this.zzc);
    }
}
