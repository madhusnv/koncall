package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzdk extends zzdp {
    final /* synthetic */ RemoteMediaPlayer zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient) {
        super(remoteMediaPlayer, googleApiClient);
        this.zza = remoteMediaPlayer;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zza.zzb.zzB(zzb());
    }
}
