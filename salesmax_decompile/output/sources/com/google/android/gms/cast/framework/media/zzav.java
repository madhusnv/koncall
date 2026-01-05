package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaLoadRequestData;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzav extends zzbk {
    final /* synthetic */ MediaLoadRequestData zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(RemoteMediaClient remoteMediaClient, MediaLoadRequestData mediaLoadRequestData) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = mediaLoadRequestData;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzp(zzb(), this.zza);
    }
}
