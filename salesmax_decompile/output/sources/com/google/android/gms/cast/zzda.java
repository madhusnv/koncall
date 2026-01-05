package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzda extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ JSONObject zzb;
    final /* synthetic */ RemoteMediaPlayer zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzc = remoteMediaPlayer;
        this.zza = i;
        this.zzb = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        if (RemoteMediaPlayer.zza(this.zzc, this.zza) == -1) {
            setResult((zzda) new zzdo(this, new Status(0)));
        } else {
            this.zzc.zzb.zzy(zzb(), new int[]{this.zza}, this.zzb);
        }
    }
}
