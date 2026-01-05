package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "MediaStatusCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final long COMMAND_DISLIKE = 32768;
    public static final long COMMAND_EDIT_TRACKS = 4096;
    public static final long COMMAND_FOLLOW = 65536;
    public static final long COMMAND_LIKE = 16384;
    public static final long COMMAND_PAUSE = 1;
    public static final long COMMAND_PLAYBACK_RATE = 8192;
    public static final long COMMAND_QUEUE_NEXT = 64;
    public static final long COMMAND_QUEUE_PREVIOUS = 128;
    public static final long COMMAND_QUEUE_REPEAT = 3072;
    public static final long COMMAND_QUEUE_REPEAT_ALL = 1024;
    public static final long COMMAND_QUEUE_REPEAT_ONE = 2048;
    public static final long COMMAND_QUEUE_SHUFFLE = 256;
    public static final long COMMAND_SEEK = 2;
    public static final long COMMAND_SET_VOLUME = 4;
    public static final long COMMAND_SKIP_AD = 512;

    @Deprecated
    public static final long COMMAND_SKIP_BACKWARD = 32;

    @Deprecated
    public static final long COMMAND_SKIP_FORWARD = 16;

    @ShowFirstParty
    @KeepForSdk
    public static final long COMMAND_STREAM_TRANSFER = 262144;
    public static final long COMMAND_TOGGLE_MUTE = 8;
    public static final long COMMAND_UNFOLLOW = 131072;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_LOADING = 5;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int REPEAT_MODE_REPEAT_ALL = 1;
    public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
    public static final int REPEAT_MODE_REPEAT_OFF = 0;
    public static final int REPEAT_MODE_REPEAT_SINGLE = 2;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getMediaInfo", id = 2)
    MediaInfo zza;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getMediaSessionId", id = 3)
    long zzb;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 4)
    int zzc;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getPlaybackRate", id = 5)
    double zzd;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getPlayerState", id = 6)
    int zze;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getIdleReason", id = 7)
    int zzf;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getStreamPosition", id = 8)
    long zzg;

    @SafeParcelable.Field(id = 9)
    long zzh;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getStreamVolume", id = 10)
    double zzi;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "isMute", id = 11)
    boolean zzj;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 12)
    long[] zzk;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getLoadingItemId", id = 13)
    int zzl;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getPreloadedItemId", id = 14)
    int zzm;

    @SafeParcelable.Field(id = 15)
    String zzn;

    @VisibleForTesting
    JSONObject zzo;

    @SafeParcelable.Field(id = 16)
    int zzp;

    @SafeParcelable.Field(id = 17)
    final List zzq;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "isPlayingAd", id = 18)
    boolean zzr;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getAdBreakStatus", id = 19)
    AdBreakStatus zzs;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getVideoInfo", id = 20)
    VideoInfo zzt;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getLiveSeekableRange", id = 21)
    MediaLiveSeekableRange zzu;

    @VisibleForTesting
    @SafeParcelable.Field(getter = "getQueueData", id = 22)
    MediaQueueData zzv;
    boolean zzw;
    private final SparseArray zzy;
    private final Writer zzz;
    private static final Logger zzx = new Logger("MediaStatus");

    @KeepForSdk
    public static final Parcelable.Creator<MediaStatus> CREATOR = new zzcm();

    @KeepForSdk
    public static class Builder {
        private MediaInfo zza;
        private long zzb;
        private double zzd;
        private long zzg;
        private long zzh;
        private double zzi;
        private boolean zzj;
        private long[] zzk;
        private JSONObject zzn;
        private boolean zzq;
        private AdBreakStatus zzr;
        private VideoInfo zzs;
        private MediaLiveSeekableRange zzt;
        private MediaQueueData zzu;
        private int zzc = 0;
        private int zze = 0;
        private int zzf = 0;
        private int zzl = 0;
        private int zzm = 0;
        private int zzo = 0;
        private final List zzp = new ArrayList();

        @KeepForSdk
        public MediaStatus build() {
            MediaStatus mediaStatus = new MediaStatus(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu);
            mediaStatus.zzo = this.zzn;
            return mediaStatus;
        }

        @KeepForSdk
        public Builder setActiveTrackIds(long[] jArr) {
            this.zzk = jArr;
            return this;
        }

        @KeepForSdk
        public Builder setAdBreakStatus(AdBreakStatus adBreakStatus) {
            this.zzr = adBreakStatus;
            return this;
        }

        @KeepForSdk
        public Builder setCurrentItemId(int i) {
            this.zzc = i;
            return this;
        }

        @KeepForSdk
        public Builder setCustomData(JSONObject jSONObject) {
            this.zzn = jSONObject;
            return this;
        }

        @KeepForSdk
        public Builder setIdleReason(int i) {
            this.zzf = i;
            return this;
        }

        @KeepForSdk
        public Builder setIsMute(boolean z) {
            this.zzj = z;
            return this;
        }

        @KeepForSdk
        public Builder setIsPlayingAd(boolean z) {
            this.zzq = z;
            return this;
        }

        @KeepForSdk
        public Builder setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
            this.zzt = mediaLiveSeekableRange;
            return this;
        }

        @KeepForSdk
        public Builder setLoadingItemId(int i) {
            this.zzl = i;
            return this;
        }

        @KeepForSdk
        public Builder setMediaInfo(MediaInfo mediaInfo) {
            this.zza = mediaInfo;
            return this;
        }

        @KeepForSdk
        public Builder setMediaSessionId(long j) {
            this.zzb = j;
            return this;
        }

        @KeepForSdk
        public Builder setPlaybackRate(double d) {
            this.zzd = d;
            return this;
        }

        @KeepForSdk
        public Builder setPlayerState(int i) {
            this.zze = i;
            return this;
        }

        @KeepForSdk
        public Builder setPreloadedItemId(int i) {
            this.zzm = i;
            return this;
        }

        @KeepForSdk
        public Builder setQueueData(MediaQueueData mediaQueueData) {
            this.zzu = mediaQueueData;
            return this;
        }

        @KeepForSdk
        public Builder setQueueItems(List<MediaQueueItem> list) {
            this.zzp.clear();
            this.zzp.addAll(list);
            return this;
        }

        @KeepForSdk
        public Builder setQueueRepeatMode(int i) {
            this.zzo = i;
            return this;
        }

        @KeepForSdk
        public Builder setStreamPosition(long j) {
            this.zzg = j;
            return this;
        }

        @KeepForSdk
        public Builder setStreamVolume(double d) {
            this.zzi = d;
            return this;
        }

        @KeepForSdk
        public Builder setSupportedMediaCommands(long j) {
            this.zzh = j;
            return this;
        }

        @KeepForSdk
        public Builder setVideoInfo(VideoInfo videoInfo) {
            this.zzs = videoInfo;
            return this;
        }
    }

    @KeepForSdk
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setActiveTrackIds(long[] jArr) {
            MediaStatus.this.zzk = jArr;
        }

        @KeepForSdk
        public void setAdBreakStatus(AdBreakStatus adBreakStatus) {
            MediaStatus.this.zzs = adBreakStatus;
        }

        @KeepForSdk
        public void setCurrentItemId(int i) {
            MediaStatus.this.zzc = i;
        }

        @KeepForSdk
        public void setCustomData(JSONObject jSONObject) {
            MediaStatus mediaStatus = MediaStatus.this;
            mediaStatus.zzo = jSONObject;
            mediaStatus.zzn = null;
        }

        @KeepForSdk
        public void setIdleReason(int i) {
            MediaStatus.this.zzf = i;
        }

        @KeepForSdk
        public void setIsPlayingAd(boolean z) {
            MediaStatus.this.zzr = z;
        }

        @KeepForSdk
        public void setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
            MediaStatus.this.zzu = mediaLiveSeekableRange;
        }

        @KeepForSdk
        public void setLoadingItemId(int i) {
            MediaStatus.this.zzl = i;
        }

        @KeepForSdk
        public void setMediaInfo(MediaInfo mediaInfo) {
            MediaStatus.this.zza = mediaInfo;
        }

        @KeepForSdk
        public void setMute(boolean z) {
            MediaStatus.this.zzj = z;
        }

        @KeepForSdk
        public void setPlaybackRate(double d) {
            MediaStatus.this.zzd = d;
        }

        @KeepForSdk
        public void setPlayerState(int i) {
            MediaStatus.this.zze = i;
        }

        @KeepForSdk
        public void setPreloadedItemId(int i) {
            MediaStatus.this.zzm = i;
        }

        @KeepForSdk
        public void setQueueData(MediaQueueData mediaQueueData) {
            MediaStatus.this.zzv = mediaQueueData;
        }

        @KeepForSdk
        public void setQueueItems(List<MediaQueueItem> list) {
            MediaStatus.this.zze(list);
        }

        @KeepForSdk
        public void setQueueRepeatMode(int i) {
            MediaStatus.this.zzp = i;
        }

        @KeepForSdk
        public void setShuffle(boolean z) {
            MediaStatus.this.zzw = z;
        }

        @KeepForSdk
        public void setStreamPosition(long j) {
            MediaStatus.this.zzg = j;
        }

        @KeepForSdk
        public void setStreamVolume(double d) {
            MediaStatus.this.zzi = d;
        }

        @KeepForSdk
        public void setSupportedMediaCommands(long j) {
            MediaStatus.this.zzh = j;
        }

        @KeepForSdk
        public void setVideoInfo(VideoInfo videoInfo) {
            MediaStatus.this.zzt = videoInfo;
        }
    }

    @SafeParcelable.Constructor
    @SuppressLint({"NonSdkVisibleApi"})
    public MediaStatus(@SafeParcelable.Param(id = 2) MediaInfo mediaInfo, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) double d, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) double d2, @SafeParcelable.Param(id = 11) boolean z, @SafeParcelable.Param(id = 12) long[] jArr, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 15) String str, @SafeParcelable.Param(id = 16) int i6, @SafeParcelable.Param(id = 17) List list, @SafeParcelable.Param(id = 18) boolean z2, @SafeParcelable.Param(id = 19) AdBreakStatus adBreakStatus, @SafeParcelable.Param(id = 20) VideoInfo videoInfo, @SafeParcelable.Param(id = 21) MediaLiveSeekableRange mediaLiveSeekableRange, @SafeParcelable.Param(id = 22) MediaQueueData mediaQueueData) {
        this.zzq = new ArrayList();
        this.zzy = new SparseArray();
        this.zzz = new Writer();
        this.zza = mediaInfo;
        this.zzb = j;
        this.zzc = i;
        this.zzd = d;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = d2;
        this.zzj = z;
        this.zzk = jArr;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = str;
        if (str != null) {
            try {
                this.zzo = new JSONObject(this.zzn);
            } catch (JSONException unused) {
                this.zzo = null;
                this.zzn = null;
            }
        } else {
            this.zzo = null;
        }
        this.zzp = i6;
        if (list != null && !list.isEmpty()) {
            zze(list);
        }
        this.zzr = z2;
        this.zzs = adBreakStatus;
        this.zzt = videoInfo;
        this.zzu = mediaLiveSeekableRange;
        this.zzv = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.zzk()) {
            z3 = true;
        }
        this.zzw = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(List list) {
        this.zzq.clear();
        this.zzy.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
                this.zzq.add(mediaQueueItem);
                this.zzy.put(mediaQueueItem.getItemId(), Integer.valueOf(i));
            }
        }
    }

    private static final boolean zzf(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.zzo == null) == (mediaStatus.zzo == null) && this.zzb == mediaStatus.zzb && this.zzc == mediaStatus.zzc && this.zzd == mediaStatus.zzd && this.zze == mediaStatus.zze && this.zzf == mediaStatus.zzf && this.zzg == mediaStatus.zzg && this.zzi == mediaStatus.zzi && this.zzj == mediaStatus.zzj && this.zzl == mediaStatus.zzl && this.zzm == mediaStatus.zzm && this.zzp == mediaStatus.zzp && Arrays.equals(this.zzk, mediaStatus.zzk) && CastUtils.zze(Long.valueOf(this.zzh), Long.valueOf(mediaStatus.zzh)) && CastUtils.zze(this.zzq, mediaStatus.zzq) && CastUtils.zze(this.zza, mediaStatus.zza) && ((jSONObject = this.zzo) == null || (jSONObject2 = mediaStatus.zzo) == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzr == mediaStatus.isPlayingAd() && CastUtils.zze(this.zzs, mediaStatus.zzs) && CastUtils.zze(this.zzt, mediaStatus.zzt) && CastUtils.zze(this.zzu, mediaStatus.zzu) && Objects.equal(this.zzv, mediaStatus.zzv) && this.zzw == mediaStatus.zzw;
    }

    public long[] getActiveTrackIds() {
        return this.zzk;
    }

    public AdBreakStatus getAdBreakStatus() {
        return this.zzs;
    }

    public AdBreakInfo getCurrentAdBreak() {
        MediaInfo mediaInfo;
        List<AdBreakInfo> adBreaks;
        AdBreakStatus adBreakStatus = this.zzs;
        if (adBreakStatus == null) {
            return null;
        }
        String breakId = adBreakStatus.getBreakId();
        if (!TextUtils.isEmpty(breakId) && (mediaInfo = this.zza) != null && (adBreaks = mediaInfo.getAdBreaks()) != null && !adBreaks.isEmpty()) {
            for (AdBreakInfo adBreakInfo : adBreaks) {
                if (breakId.equals(adBreakInfo.getId())) {
                    return adBreakInfo;
                }
            }
        }
        return null;
    }

    public AdBreakClipInfo getCurrentAdBreakClip() {
        MediaInfo mediaInfo;
        List<AdBreakClipInfo> adBreakClips;
        AdBreakStatus adBreakStatus = this.zzs;
        if (adBreakStatus == null) {
            return null;
        }
        String breakClipId = adBreakStatus.getBreakClipId();
        if (!TextUtils.isEmpty(breakClipId) && (mediaInfo = this.zza) != null && (adBreakClips = mediaInfo.getAdBreakClips()) != null && !adBreakClips.isEmpty()) {
            for (AdBreakClipInfo adBreakClipInfo : adBreakClips) {
                if (breakClipId.equals(adBreakClipInfo.getId())) {
                    return adBreakClipInfo;
                }
            }
        }
        return null;
    }

    public int getCurrentItemId() {
        return this.zzc;
    }

    public JSONObject getCustomData() {
        return this.zzo;
    }

    public int getIdleReason() {
        return this.zzf;
    }

    public Integer getIndexById(int i) {
        return (Integer) this.zzy.get(i);
    }

    public MediaQueueItem getItemById(int i) {
        Integer num = (Integer) this.zzy.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.zzq.get(num.intValue());
    }

    public MediaQueueItem getItemByIndex(int i) {
        if (i < 0 || i >= this.zzq.size()) {
            return null;
        }
        return (MediaQueueItem) this.zzq.get(i);
    }

    public MediaLiveSeekableRange getLiveSeekableRange() {
        return this.zzu;
    }

    public int getLoadingItemId() {
        return this.zzl;
    }

    public MediaInfo getMediaInfo() {
        return this.zza;
    }

    public double getPlaybackRate() {
        return this.zzd;
    }

    public int getPlayerState() {
        return this.zze;
    }

    public int getPreloadedItemId() {
        return this.zzm;
    }

    public MediaQueueData getQueueData() {
        return this.zzv;
    }

    public MediaQueueItem getQueueItem(int i) {
        return getItemByIndex(i);
    }

    public MediaQueueItem getQueueItemById(int i) {
        return getItemById(i);
    }

    public int getQueueItemCount() {
        return this.zzq.size();
    }

    public List<MediaQueueItem> getQueueItems() {
        return this.zzq;
    }

    public int getQueueRepeatMode() {
        return this.zzp;
    }

    public long getStreamPosition() {
        return this.zzg;
    }

    public double getStreamVolume() {
        return this.zzi;
    }

    @KeepForSdk
    public long getSupportedMediaCommands() {
        return this.zzh;
    }

    public VideoInfo getVideoInfo() {
        return this.zzt;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzz;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Double.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(Arrays.hashCode(this.zzk)), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), String.valueOf(this.zzo), Integer.valueOf(this.zzp), this.zzq, Boolean.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv);
    }

    public boolean isMediaCommandSupported(long j) {
        return (j & this.zzh) != 0;
    }

    public boolean isMute() {
        return this.zzj;
    }

    public boolean isPlayingAd() {
        return this.zzr;
    }

    @KeepForSdk
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaSessionId", this.zzb);
            int i = this.zze;
            String str = "IDLE";
            if (i != 1) {
                if (i == 2) {
                    str = "PLAYING";
                } else if (i == 3) {
                    str = "PAUSED";
                } else if (i == 4) {
                    str = "BUFFERING";
                } else if (i == 5) {
                    str = "LOADING";
                }
            }
            jSONObject.put("playerState", str);
            JSONArray jSONArray = null;
            if (this.zze == 1) {
                int i2 = this.zzf;
                jSONObject.putOpt("idleReason", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : MediaError.ERROR_TYPE_ERROR : "INTERRUPTED" : "CANCELLED" : "FINISHED");
            }
            jSONObject.put("playbackRate", this.zzd);
            jSONObject.put("currentTime", CastUtils.millisecToSec(this.zzg));
            jSONObject.put("supportedMediaCommands", this.zzh);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FirebaseAnalytics.Param.LEVEL, this.zzi);
            jSONObject2.put("muted", this.zzj);
            jSONObject.put("volume", jSONObject2);
            if (this.zzk != null) {
                jSONArray = new JSONArray();
                for (long j : this.zzk) {
                    jSONArray.put(j);
                }
            }
            jSONObject.putOpt("activeTrackIds", jSONArray);
            jSONObject.putOpt("customData", this.zzo);
            jSONObject.putOpt("shuffle", Boolean.valueOf(this.zzw));
            MediaInfo mediaInfo = this.zza;
            if (mediaInfo != null) {
                jSONObject.putOpt("media", mediaInfo.zza());
            }
            int i3 = this.zzc;
            if (i3 != 0) {
                jSONObject.put("currentItemId", i3);
            }
            int i4 = this.zzm;
            if (i4 != 0) {
                jSONObject.put("preloadedItemId", i4);
            }
            int i5 = this.zzl;
            if (i5 != 0) {
                jSONObject.put("loadingItemId", i5);
            }
            AdBreakStatus adBreakStatus = this.zzs;
            if (adBreakStatus != null) {
                jSONObject.putOpt("breakStatus", adBreakStatus.zzb());
            }
            VideoInfo videoInfo = this.zzt;
            if (videoInfo != null) {
                jSONObject.putOpt("videoInfo", videoInfo.zzb());
            }
            MediaQueueData mediaQueueData = this.zzv;
            if (mediaQueueData != null) {
                jSONObject.putOpt("queueData", mediaQueueData.zza());
            }
            MediaLiveSeekableRange mediaLiveSeekableRange = this.zzu;
            if (mediaLiveSeekableRange != null) {
                jSONObject.putOpt("liveSeekableRange", mediaLiveSeekableRange.zzb());
            }
            jSONObject.putOpt("repeatMode", MediaCommon.zza(Integer.valueOf(this.zzp)));
            List list = this.zzq;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = this.zzq.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((MediaQueueItem) it.next()).toJson());
                }
                jSONObject.put("items", jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e) {
            zzx.m13798e(e, "Error transforming MediaStatus into JSONObject", new Object[0]);
            return new JSONObject();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzo;
        this.zzn = jSONObject == null ? null : jSONObject.toString();
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMediaInfo(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, getCurrentItemId());
        SafeParcelWriter.writeDouble(parcel, 5, getPlaybackRate());
        SafeParcelWriter.writeInt(parcel, 6, getPlayerState());
        SafeParcelWriter.writeInt(parcel, 7, getIdleReason());
        SafeParcelWriter.writeLong(parcel, 8, getStreamPosition());
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeDouble(parcel, 10, getStreamVolume());
        SafeParcelWriter.writeBoolean(parcel, 11, isMute());
        SafeParcelWriter.writeLongArray(parcel, 12, getActiveTrackIds(), false);
        SafeParcelWriter.writeInt(parcel, 13, getLoadingItemId());
        SafeParcelWriter.writeInt(parcel, 14, getPreloadedItemId());
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, isPlayingAd());
        SafeParcelWriter.writeParcelable(parcel, 19, getAdBreakStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 20, getVideoInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 21, getLiveSeekableRange(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getQueueData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018c A[EDGE_INSN: B:102:0x018c->B:103:0x0190 BREAK  A[LOOP:0: B:95:0x0178->B:99:0x0185]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(JSONObject jSONObject, int i) throws JSONException {
        int i2;
        MediaInfo mediaInfo;
        boolean zFromJson;
        MediaInfo mediaInfo2;
        int i3;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extendedStatus");
        boolean z = false;
        if (jSONObjectOptJSONObject != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
                }
                jSONObject2.remove("extendedStatus");
                jSONObject = jSONObject2;
            } catch (JSONException unused) {
            }
        }
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.zzb) {
            this.zzb = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i4 = 3;
            int i5 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
            if (i5 != this.zze) {
                this.zze = i5;
                i2 |= 2;
            }
            if (i5 == 1 && jSONObject.has("idleReason")) {
                String string2 = jSONObject.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i4 = 2;
                } else if (!string2.equals("INTERRUPTED")) {
                    i4 = string2.equals("FINISHED") ? 1 : string2.equals(MediaError.ERROR_TYPE_ERROR) ? 4 : 0;
                }
                if (i4 != this.zzf) {
                    this.zzf = i4;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.zzd != d) {
                this.zzd = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime")) {
            long jSecToMillisec = CastUtils.secToMillisec(jSONObject.getDouble("currentTime"));
            if (jSecToMillisec != this.zzg) {
                this.zzg = jSecToMillisec;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j2 = jSONObject.getLong("supportedMediaCommands");
            if (j2 != this.zzh) {
                this.zzh = j2;
                i2 |= 2;
            }
        }
        if (jSONObject.has("volume") && i == 0) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("volume");
            double d2 = jSONObject3.getDouble(FirebaseAnalytics.Param.LEVEL);
            if (d2 != this.zzi) {
                this.zzi = d2;
                i2 |= 2;
            }
            boolean z2 = jSONObject3.getBoolean("muted");
            if (z2 != this.zzj) {
                this.zzj = z2;
                i2 |= 2;
            }
        }
        long[] jArrZzg = CastUtils.zzg(jSONObject.has("activeTrackIds") ? jSONObject.getJSONArray("activeTrackIds") : null);
        if (jArrZzg == null) {
            if (this.zzk == null) {
                this.zzk = jArrZzg;
                i2 |= 2;
                break;
            }
        } else {
            long[] jArr = this.zzk;
            if (jArr == null) {
                this.zzk = jArrZzg;
                i2 |= 2;
                break;
            }
            if (jArr.length == jArrZzg.length) {
                for (int i6 = 0; i6 < jArrZzg.length; i6++) {
                    if (this.zzk[i6] != jArrZzg[i6]) {
                        this.zzk = jArrZzg;
                        i2 |= 2;
                        break;
                    }
                }
            }
        }
        if (jSONObject.has("customData")) {
            this.zzo = jSONObject.getJSONObject("customData");
            this.zzn = null;
            i2 |= 2;
        }
        if (jSONObject.has("media")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.zza;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.zza = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject4.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject.has("currentItemId") && this.zzc != (i3 = jSONObject.getInt("currentItemId"))) {
            this.zzc = i3;
            i2 |= 2;
        }
        int iOptInt = jSONObject.optInt("preloadedItemId", 0);
        if (this.zzm != iOptInt) {
            this.zzm = iOptInt;
            i2 |= 16;
        }
        int iOptInt2 = jSONObject.optInt("loadingItemId", 0);
        if (this.zzl != iOptInt2) {
            this.zzl = iOptInt2;
            i2 |= 2;
        }
        MediaInfo mediaInfo5 = this.zza;
        if (zzf(this.zze, this.zzf, this.zzl, mediaInfo5 == null ? -1 : mediaInfo5.getStreamType())) {
            this.zzc = 0;
            this.zzl = 0;
            this.zzm = 0;
            if (!this.zzq.isEmpty()) {
                this.zzp = 0;
                this.zzq.clear();
                this.zzy.clear();
                i2 |= 8;
            }
        } else if (jSONObject.has("repeatMode")) {
            Integer numMediaRepeatModeFromString = MediaCommon.mediaRepeatModeFromString(jSONObject.getString("repeatMode"));
            Integer numValueOf = Integer.valueOf(numMediaRepeatModeFromString == null ? this.zzp : numMediaRepeatModeFromString.intValue());
            if (this.zzp != numValueOf.intValue()) {
                this.zzp = numValueOf.intValue();
                zFromJson = true;
            }
            if (jSONObject.has("items")) {
            }
            if (zFromJson) {
            }
        } else {
            zFromJson = false;
            if (jSONObject.has("items")) {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                int length = jSONArray.length();
                SparseArray sparseArray = new SparseArray();
                for (int i7 = 0; i7 < length; i7++) {
                    sparseArray.put(i7, Integer.valueOf(jSONArray.getJSONObject(i7).getInt("itemId")));
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < length; i8++) {
                    Integer num = (Integer) sparseArray.get(i8);
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i8);
                    MediaQueueItem itemById = getItemById(num.intValue());
                    if (itemById != null) {
                        zFromJson |= itemById.fromJson(jSONObject5);
                        arrayList2.add(itemById);
                        if (i8 != getIndexById(num.intValue()).intValue()) {
                        }
                    } else if (num.intValue() != this.zzc || (mediaInfo2 = this.zza) == null) {
                        arrayList2.add(new MediaQueueItem(jSONObject5));
                    } else {
                        MediaQueueItem mediaQueueItemBuild = new MediaQueueItem.Builder(mediaInfo2).build();
                        mediaQueueItemBuild.fromJson(jSONObject5);
                        arrayList2.add(mediaQueueItemBuild);
                    }
                    zFromJson = true;
                }
                zFromJson |= !(this.zzq.size() == length);
                zze(arrayList2);
            }
            if (zFromJson) {
                i2 |= 8;
            }
        }
        AdBreakStatus adBreakStatusZza = AdBreakStatus.zza(jSONObject.optJSONObject("breakStatus"));
        AdBreakStatus adBreakStatus = this.zzs;
        if ((adBreakStatus == null && adBreakStatusZza != null) || (adBreakStatus != null && !adBreakStatus.equals(adBreakStatusZza))) {
            if (adBreakStatusZza != null && (adBreakStatusZza.getBreakId() != null || adBreakStatusZza.getBreakClipId() != null)) {
                z = true;
            }
            this.zzr = z;
            this.zzs = adBreakStatusZza;
            i2 |= 32;
        }
        VideoInfo videoInfoZza = VideoInfo.zza(jSONObject.optJSONObject("videoInfo"));
        VideoInfo videoInfo = this.zzt;
        if ((videoInfo == null && videoInfoZza != null) || (videoInfo != null && !videoInfo.equals(videoInfoZza))) {
            this.zzt = videoInfoZza;
            i2 |= 64;
        }
        if (jSONObject.has("breakInfo") && (mediaInfo = this.zza) != null) {
            mediaInfo.zzr(jSONObject.getJSONObject("breakInfo"));
            i2 |= 2;
        }
        if (jSONObject.has("queueData")) {
            MediaQueueData.Builder builder = new MediaQueueData.Builder();
            builder.zza(jSONObject.getJSONObject("queueData"));
            MediaQueueData mediaQueueDataBuild = builder.build();
            this.zzv = mediaQueueDataBuild;
            boolean zZzk = mediaQueueDataBuild.zzk();
            if (this.zzw != zZzk) {
                this.zzw = zZzk;
                i2 |= 8;
            }
        }
        if (jSONObject.has("liveSeekableRange")) {
            this.zzu = MediaLiveSeekableRange.zza(jSONObject.optJSONObject("liveSeekableRange"));
            return i2 | 2;
        }
        if (this.zzu != null) {
            i2 |= 2;
        }
        this.zzu = null;
        return i2;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzd() {
        MediaInfo mediaInfo = this.zza;
        return zzf(this.zze, this.zzf, this.zzl, mediaInfo == null ? -1 : mediaInfo.getStreamType());
    }

    @KeepForSdk
    public MediaStatus(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0, 0, 0L, 0L, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        zza(jSONObject, 0);
    }
}
