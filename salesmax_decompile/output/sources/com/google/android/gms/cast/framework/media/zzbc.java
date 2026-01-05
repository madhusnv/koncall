package com.google.android.gms.cast.framework.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzbc extends zzbk {
    final /* synthetic */ boolean zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(RemoteMediaClient remoteMediaClient, boolean z, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = z;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzc.zze.zzF(zzb(), this.zza, this.zzb);
    }
}
