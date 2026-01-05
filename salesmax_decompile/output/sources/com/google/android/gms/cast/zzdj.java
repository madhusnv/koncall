package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdj extends zzdp {
    final /* synthetic */ boolean zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaPlayer zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, boolean z, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzc = remoteMediaPlayer;
        this.zza = z;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzc.zzb.zzF(zzb(), this.zza, this.zzb);
    }
}
