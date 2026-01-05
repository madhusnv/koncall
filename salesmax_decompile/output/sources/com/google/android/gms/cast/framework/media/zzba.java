package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaSeekOptions;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzba extends zzbk {
    final /* synthetic */ MediaSeekOptions zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(RemoteMediaClient remoteMediaClient, MediaSeekOptions mediaSeekOptions) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = mediaSeekOptions;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzC(zzb(), this.zza);
    }
}
