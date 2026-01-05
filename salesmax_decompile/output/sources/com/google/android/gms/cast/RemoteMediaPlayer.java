package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import org.json.JSONObject;

@SuppressLint({"MissingRemoteException"})
@Deprecated
/* loaded from: classes5.dex */
public class RemoteMediaPlayer implements Cast.MessageReceivedCallback {
    public static final String NAMESPACE = com.google.android.gms.cast.internal.zzaq.zzb;
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final Object zza;
    private final com.google.android.gms.cast.internal.zzaq zzb;
    private final zzdm zzc;
    private OnPreloadStatusUpdatedListener zzd;
    private OnQueueStatusUpdatedListener zze;
    private OnMetadataUpdatedListener zzf;
    private OnStatusUpdatedListener zzg;

    @Deprecated
    public interface MediaChannelResult extends Result {
        JSONObject getCustomData();
    }

    @Deprecated
    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    @Deprecated
    public interface OnPreloadStatusUpdatedListener {
        void onPreloadStatusUpdated();
    }

    @Deprecated
    public interface OnQueueStatusUpdatedListener {
        void onQueueStatusUpdated();
    }

    @Deprecated
    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    public RemoteMediaPlayer() {
        com.google.android.gms.cast.internal.zzaq zzaqVar = new com.google.android.gms.cast.internal.zzaq(null);
        this.zza = new Object();
        this.zzb = zzaqVar;
        zzaqVar.zzQ(new zzcy(this));
        zzdm zzdmVar = new zzdm(this);
        this.zzc = zzdmVar;
        zzaqVar.zzh(zzdmVar);
    }

    public static /* bridge */ /* synthetic */ int zza(RemoteMediaPlayer remoteMediaPlayer, int i) {
        MediaStatus mediaStatus = remoteMediaPlayer.getMediaStatus();
        if (mediaStatus == null) {
            return -1;
        }
        for (int i2 = 0; i2 < mediaStatus.getQueueItemCount(); i2++) {
            MediaQueueItem queueItem = mediaStatus.getQueueItem(i2);
            if (queueItem != null && queueItem.getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ void zze(RemoteMediaPlayer remoteMediaPlayer) {
        OnMetadataUpdatedListener onMetadataUpdatedListener = remoteMediaPlayer.zzf;
        if (onMetadataUpdatedListener != null) {
            onMetadataUpdatedListener.onMetadataUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzf(RemoteMediaPlayer remoteMediaPlayer) {
        OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener = remoteMediaPlayer.zzd;
        if (onPreloadStatusUpdatedListener != null) {
            onPreloadStatusUpdatedListener.onPreloadStatusUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(RemoteMediaPlayer remoteMediaPlayer) {
        OnQueueStatusUpdatedListener onQueueStatusUpdatedListener = remoteMediaPlayer.zze;
        if (onQueueStatusUpdatedListener != null) {
            onQueueStatusUpdatedListener.onQueueStatusUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(RemoteMediaPlayer remoteMediaPlayer) {
        OnStatusUpdatedListener onStatusUpdatedListener = remoteMediaPlayer.zzg;
        if (onStatusUpdatedListener != null) {
            onStatusUpdatedListener.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition() {
        long jZzm;
        synchronized (this.zza) {
            jZzm = this.zzb.zzm();
        }
        return jZzm;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfoZzK;
        synchronized (this.zza) {
            mediaInfoZzK = this.zzb.zzK();
        }
        return mediaInfoZzK;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus mediaStatusZzL;
        synchronized (this.zza) {
            mediaStatusZzL = this.zzb.zzL();
        }
        return mediaStatusZzL;
    }

    public String getNamespace() {
        return this.zzb.zze();
    }

    public long getStreamDuration() {
        long jZzo;
        synchronized (this.zza) {
            jZzo = this.zzb.zzo();
        }
        return jZzo;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo) {
        return load(googleApiClient, mediaInfo, true, -1L, null, null);
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzb.zzO(str2);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient) {
        return pause(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient) {
        return play(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> queueAppendItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, JSONObject jSONObject) {
        return queueInsertItems(googleApiClient, new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, long j, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcs(this, googleApiClient, mediaQueueItem, i, j, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueInsertItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcr(this, googleApiClient, mediaQueueItemArr, i, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, long j, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdb(this, googleApiClient, i, j, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcq(this, googleApiClient, mediaQueueItemArr, i, i2, j, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueMoveItemToNewIndex(GoogleApiClient googleApiClient, int i, int i2, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdc(this, googleApiClient, i, i2, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueNext(GoogleApiClient googleApiClient, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcx(this, googleApiClient, jSONObject));
    }

    public PendingResult<MediaChannelResult> queuePrev(GoogleApiClient googleApiClient, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcw(this, googleApiClient, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueRemoveItem(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        return googleApiClient.execute(new zzda(this, googleApiClient, i, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueRemoveItems(GoogleApiClient googleApiClient, int[] iArr, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcu(this, googleApiClient, iArr, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueReorderItems(GoogleApiClient googleApiClient, int[] iArr, int i, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcv(this, googleApiClient, iArr, i, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueSetRepeatMode(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        return googleApiClient.execute(new zzcz(this, googleApiClient, i, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueUpdateItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, JSONObject jSONObject) {
        return googleApiClient.execute(new zzct(this, googleApiClient, mediaQueueItemArr, jSONObject));
    }

    public PendingResult<MediaChannelResult> requestStatus(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzdk(this, googleApiClient));
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j) {
        return seek(googleApiClient, j, 0, null);
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(GoogleApiClient googleApiClient, long[] jArr) {
        return googleApiClient.execute(new zzco(this, googleApiClient, jArr));
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onMetadataUpdatedListener) {
        this.zzf = onMetadataUpdatedListener;
    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener) {
        this.zzd = onPreloadStatusUpdatedListener;
    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onQueueStatusUpdatedListener) {
        this.zze = onQueueStatusUpdatedListener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onStatusUpdatedListener) {
        this.zzg = onStatusUpdatedListener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z) {
        return setStreamMute(googleApiClient, z, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d) {
        return setStreamVolume(googleApiClient, d, null);
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(GoogleApiClient googleApiClient, TextTrackStyle textTrackStyle) {
        return googleApiClient.execute(new zzcp(this, googleApiClient, textTrackStyle));
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient) {
        return stop(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z) {
        return load(googleApiClient, mediaInfo, z, -1L, null, null);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient, JSONObject jSONObject) {
        return googleApiClient.execute(new zzde(this, googleApiClient, jSONObject));
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdg(this, googleApiClient, jSONObject));
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return queueInsertAndPlayItem(googleApiClient, mediaQueueItem, i, -1L, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        return queueJumpToItem(googleApiClient, i, -1L, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) {
        return queueLoad(googleApiClient, mediaQueueItemArr, i, i2, -1L, jSONObject);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i) {
        return seek(googleApiClient, j, i, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdj(this, googleApiClient, z, jSONObject));
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdi(this, googleApiClient, d, jSONObject));
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdf(this, googleApiClient, jSONObject));
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j) {
        return load(googleApiClient, mediaInfo, z, j, null, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdh(this, googleApiClient, j, i, jSONObject));
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return load(googleApiClient, mediaInfo, z, j, null, jSONObject);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        return googleApiClient.execute(new zzdd(this, googleApiClient, mediaInfo, z, j, jArr, jSONObject));
    }
}
