package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdb extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, long j, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = i;
        this.zzb = j;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        if (RemoteMediaPlayer.zza(this.zzd, this.zza) == -1) {
            setResult((zzdb) new zzdo(this, new Status(0)));
        } else {
            this.zzd.zzb.zzA(zzb(), this.zza, this.zzb, null, 0, null, null, this.zzc);
        }
    }
}
