package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzdc extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdc(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, int i2, JSONObject jSONObject) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = i;
        this.zzb = i2;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws JSONException {
        int iZza = RemoteMediaPlayer.zza(this.zzd, this.zza);
        if (iZza == -1) {
            setResult((zzdc) new zzdo(this, new Status(0)));
            return;
        }
        int i = this.zzb;
        if (i < 0) {
            setResult((zzdc) new zzdo(this, new Status(CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.zzb)))));
            return;
        }
        if (iZza == i) {
            setResult((zzdc) new zzdo(this, new Status(0)));
            return;
        }
        MediaStatus mediaStatus = this.zzd.getMediaStatus();
        if (mediaStatus == null) {
            setResult((zzdc) new zzdo(this, new Status(CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid MediaStatus", new Object[0]))));
            return;
        }
        int i2 = this.zzb;
        if (i2 > iZza) {
            i2++;
        }
        MediaQueueItem queueItem = mediaStatus.getQueueItem(i2);
        this.zzd.zzb.zzz(zzb(), new int[]{this.zza}, queueItem != null ? queueItem.getItemId() : 0, this.zzc);
    }
}
