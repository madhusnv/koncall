package com.google.android.gms.cast;

import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdh extends zzdp {
    final /* synthetic */ long zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, long j, int i, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = j;
        this.zzb = i;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        com.google.android.gms.cast.internal.zzaq zzaqVar = this.zzd.zzb;
        com.google.android.gms.cast.internal.zzat zzatVarZzb = zzb();
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(this.zza);
        builder.setResumeState(this.zzb);
        builder.setCustomData(this.zzc);
        zzaqVar.zzC(zzatVarZzb, builder.build());
    }
}
