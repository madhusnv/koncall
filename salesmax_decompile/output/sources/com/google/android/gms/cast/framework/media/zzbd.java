package com.google.android.gms.cast.framework.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzbd extends zzbk {
    final /* synthetic */ double zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(RemoteMediaClient remoteMediaClient, double d, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = d;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException, com.google.android.gms.cast.internal.zzao {
        this.zzc.zze.zzE(zzb(), this.zza, this.zzb);
    }
}
