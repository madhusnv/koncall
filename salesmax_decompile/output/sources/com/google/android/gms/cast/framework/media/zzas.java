package com.google.android.gms.cast.framework.media;

import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzas extends zzbk {
    final /* synthetic */ RemoteMediaClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(RemoteMediaClient remoteMediaClient, boolean z) {
        super(remoteMediaClient, true);
        this.zza = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zza.zze.zzu(zzb());
    }
}
