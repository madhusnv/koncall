package com.google.android.gms.cast.framework.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzaq extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(RemoteMediaClient remoteMediaClient, int i, long j, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = i;
        this.zzb = j;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzd.zze.zzA(zzb(), this.zza, this.zzb, null, 0, null, null, this.zzc);
    }
}
