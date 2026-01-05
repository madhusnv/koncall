package com.google.android.gms.cast.framework.media;

import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzad extends zzbk {
    final /* synthetic */ long[] zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(RemoteMediaClient remoteMediaClient, long[] jArr) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jArr;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzD(zzb(), this.zza);
    }
}
