package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzcv extends zzdp {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int[] iArr, int i, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = iArr;
        this.zzb = i;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzd.zzb.zzz(zzb(), this.zza, this.zzb, this.zzc);
    }
}
