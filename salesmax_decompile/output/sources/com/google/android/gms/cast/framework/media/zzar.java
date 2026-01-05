package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzar extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ JSONObject zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(RemoteMediaClient remoteMediaClient, int i, int i2, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = i;
        this.zzb = i2;
        this.zzc = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws JSONException {
        MediaQueueItem queueItem;
        RemoteMediaClient remoteMediaClient = this.zzd;
        int i = this.zza;
        Preconditions.checkMainThread("Must be called from the main thread.");
        int iIndexOfItemWithId = remoteMediaClient.getMediaQueue().indexOfItemWithId(i);
        int itemId = 0;
        if (iIndexOfItemWithId == -1) {
            MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(remoteMediaClient.getMediaStatus());
            iIndexOfItemWithId = 0;
            while (true) {
                if (iIndexOfItemWithId >= mediaStatus.getQueueItemCount()) {
                    iIndexOfItemWithId = -1;
                    break;
                } else if (((MediaQueueItem) Preconditions.checkNotNull(mediaStatus.getQueueItem(iIndexOfItemWithId))).getItemId() == i) {
                    break;
                } else {
                    iIndexOfItemWithId++;
                }
            }
        }
        int i2 = this.zzb;
        if (i2 < 0) {
            setResult(new zzbj(this, new Status(CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.zzb)))));
            return;
        }
        if (iIndexOfItemWithId == i2) {
            setResult(new zzbj(this, new Status(0)));
            return;
        }
        if (i2 > iIndexOfItemWithId) {
            i2++;
        }
        RemoteMediaClient remoteMediaClient2 = this.zzd;
        Preconditions.checkMainThread("Must be called from the main thread.");
        int iItemIdAtIndex = remoteMediaClient2.getMediaQueue().itemIdAtIndex(i2);
        if (iItemIdAtIndex != 0) {
            itemId = iItemIdAtIndex;
        } else {
            MediaStatus mediaStatus2 = remoteMediaClient2.getMediaStatus();
            if (mediaStatus2 != null && (queueItem = mediaStatus2.getQueueItem(i2)) != null) {
                itemId = queueItem.getItemId();
            }
        }
        this.zzd.zze.zzz(zzb(), new int[]{this.zza}, itemId, this.zzc);
    }
}
