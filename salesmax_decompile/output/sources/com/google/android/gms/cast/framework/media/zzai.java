package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzai extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzc.zze.zzA(zzb(), 0, -1L, this.zza, 0, null, null, this.zzb);
    }
}
