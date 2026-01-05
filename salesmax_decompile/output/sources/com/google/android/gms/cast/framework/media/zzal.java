package com.google.android.gms.cast.framework.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzal extends zzbk {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(RemoteMediaClient remoteMediaClient, boolean z, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzA(zzb(), 0, -1L, null, 0, Boolean.TRUE, null, this.zza);
    }
}
