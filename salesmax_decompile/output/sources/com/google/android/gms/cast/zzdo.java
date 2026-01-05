package com.google.android.gms.cast;

import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdo implements RemoteMediaPlayer.MediaChannelResult {
    final /* synthetic */ Status zza;

    public zzdo(zzdp zzdpVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.cast.RemoteMediaPlayer.MediaChannelResult
    public final JSONObject getCustomData() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
