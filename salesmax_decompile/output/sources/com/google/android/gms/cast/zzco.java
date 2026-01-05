package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzco extends zzdp {
    final /* synthetic */ long[] zza;
    final /* synthetic */ RemoteMediaPlayer zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzco(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, long[] jArr) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzb = remoteMediaPlayer;
        this.zza = jArr;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzb.zzb.zzD(zzb(), this.zza);
    }
}
