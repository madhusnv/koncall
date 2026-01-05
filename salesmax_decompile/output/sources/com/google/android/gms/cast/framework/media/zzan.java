package com.google.android.gms.cast.framework.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzan extends zzbk {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(RemoteMediaClient remoteMediaClient, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzA(zzb(), 0, -1L, null, 1, null, null, this.zza);
    }
}
