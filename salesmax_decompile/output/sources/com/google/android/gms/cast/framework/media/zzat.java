package com.google.android.gms.cast.framework.media;

import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzat extends zzbk {
    final /* synthetic */ int[] zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(RemoteMediaClient remoteMediaClient, boolean z, int[] iArr) {
        super(remoteMediaClient, true);
        this.zzb = remoteMediaClient;
        this.zza = iArr;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzv(zzb(), this.zza);
    }
}
