package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzcp extends zzdp {
    final /* synthetic */ TextTrackStyle zza;
    final /* synthetic */ RemoteMediaPlayer zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, TextTrackStyle textTrackStyle) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzb = remoteMediaPlayer;
        this.zza = textTrackStyle;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        this.zzb.zzb.zzH(zzb(), this.zza);
    }
}
