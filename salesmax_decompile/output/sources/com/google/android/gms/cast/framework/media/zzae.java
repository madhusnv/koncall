package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.TextTrackStyle;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzae extends zzbk {
    final /* synthetic */ TextTrackStyle zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(RemoteMediaClient remoteMediaClient, TextTrackStyle textTrackStyle) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = textTrackStyle;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        this.zzb.zze.zzH(zzb(), this.zza);
    }
}
