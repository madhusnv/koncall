package com.google.android.gms.cast.framework.media;

import java.util.List;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzaw extends zzbk {
    final /* synthetic */ String zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(RemoteMediaClient remoteMediaClient, boolean z, String str, List list) {
        super(remoteMediaClient, true);
        this.zzb = remoteMediaClient;
        this.zza = str;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzs(this.zza, null);
    }
}
