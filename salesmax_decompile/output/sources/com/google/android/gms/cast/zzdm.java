package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes5.dex */
final class zzdm implements com.google.android.gms.cast.internal.zzar {
    final /* synthetic */ RemoteMediaPlayer zza;
    private GoogleApiClient zzb;
    private long zzc = 0;

    public zzdm(RemoteMediaPlayer remoteMediaPlayer) {
        this.zza = remoteMediaPlayer;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final long zza() {
        long j = this.zzc + 1;
        this.zzc = j;
        return j;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(String str, String str2, long j, String str3) {
        GoogleApiClient googleApiClient = this.zzb;
        if (googleApiClient == null) {
            throw new IllegalStateException("No GoogleApiClient available");
        }
        Cast.CastApi.sendMessage(googleApiClient, str, str2).setResultCallback(new zzdl(this, j));
    }

    public final void zzc(GoogleApiClient googleApiClient) {
        this.zzb = googleApiClient;
    }
}
