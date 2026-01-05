package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "MediaQueueItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class MediaQueueItem extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new zzck();
    public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
    public static final int INVALID_ITEM_ID = 0;

    @SafeParcelable.Field(id = 9)
    String zza;

    @SafeParcelable.Field(getter = "getMedia", id = 2)
    private MediaInfo zzb;

    @SafeParcelable.Field(getter = "getItemId", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getAutoplay", id = 4)
    private boolean zzd;

    @SafeParcelable.Field(getter = "getStartTime", id = 5)
    private double zze;

    @SafeParcelable.Field(getter = "getPlaybackDuration", id = 6)
    private double zzf;

    @SafeParcelable.Field(getter = "getPreloadTime", id = 7)
    private double zzg;

    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 8)
    private long[] zzh;
    private JSONObject zzi;
    private final Writer zzj;

    public static class Builder {
        private final MediaQueueItem zza;

        public Builder(MediaInfo mediaInfo) {
            this.zza = new MediaQueueItem(mediaInfo, (zzcj) null);
        }

        public MediaQueueItem build() {
            this.zza.zzi();
            return this.zza;
        }

        public Builder clearItemId() {
            this.zza.getWriter().setItemId(0);
            return this;
        }

        public Builder setActiveTrackIds(long[] jArr) {
            this.zza.getWriter().setActiveTrackIds(jArr);
            return this;
        }

        public Builder setAutoplay(boolean z) {
            this.zza.getWriter().setAutoplay(z);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zza.getWriter().setCustomData(jSONObject);
            return this;
        }

        public Builder setItemId(int i) {
            this.zza.getWriter().setItemId(i);
            return this;
        }

        public Builder setPlaybackDuration(double d) {
            this.zza.getWriter().setPlaybackDuration(d);
            return this;
        }

        public Builder setPreloadTime(double d) {
            this.zza.getWriter().setPreloadTime(d);
            return this;
        }

        public Builder setStartTime(double d) {
            this.zza.getWriter().setStartTime(d);
            return this;
        }

        public Builder(MediaQueueItem mediaQueueItem) {
            this.zza = new MediaQueueItem(mediaQueueItem, (zzcj) null);
        }

        public Builder(JSONObject jSONObject) {
            this.zza = new MediaQueueItem(jSONObject);
        }
    }

    @KeepForSdk
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setActiveTrackIds(long[] jArr) {
            MediaQueueItem.this.zzh = jArr;
        }

        @KeepForSdk
        public void setAutoplay(boolean z) {
            MediaQueueItem.this.zzd = z;
        }

        @KeepForSdk
        public void setCustomData(JSONObject jSONObject) {
            MediaQueueItem.this.zzi = jSONObject;
        }

        @KeepForSdk
        public void setItemId(int i) {
            MediaQueueItem.this.zzc = i;
        }

        @KeepForSdk
        public void setMedia(MediaInfo mediaInfo) {
            MediaQueueItem.this.zzb = mediaInfo;
        }

        @KeepForSdk
        public void setPlaybackDuration(double d) {
            if (Double.isNaN(d)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            MediaQueueItem.this.zzf = d;
        }

        @KeepForSdk
        public void setPreloadTime(double d) {
            if (Double.isNaN(d) || d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
            }
            MediaQueueItem.this.zzg = d;
        }

        @KeepForSdk
        public void setStartTime(double d) {
            if (!Double.isNaN(d) && d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                throw new IllegalArgumentException("startTime cannot be negative.");
            }
            MediaQueueItem.this.zze = d;
        }
    }

    @SafeParcelable.Constructor
    public MediaQueueItem(@SafeParcelable.Param(id = 2) MediaInfo mediaInfo, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) double d, @SafeParcelable.Param(id = 6) double d2, @SafeParcelable.Param(id = 7) double d3, @SafeParcelable.Param(id = 8) long[] jArr, @SafeParcelable.Param(id = 9) String str) {
        this.zze = Double.NaN;
        this.zzj = new Writer();
        this.zzb = mediaInfo;
        this.zzc = i;
        this.zzd = z;
        this.zze = d;
        this.zzf = d2;
        this.zzg = d3;
        this.zzh = jArr;
        this.zza = str;
        if (str == null) {
            this.zzi = null;
            return;
        }
        try {
            this.zzi = new JSONObject(this.zza);
        } catch (JSONException unused) {
            this.zzi = null;
            this.zza = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.zzi;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.zzi;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && CastUtils.zze(this.zzb, mediaQueueItem.zzb) && this.zzc == mediaQueueItem.zzc && this.zzd == mediaQueueItem.zzd && ((Double.isNaN(this.zze) && Double.isNaN(mediaQueueItem.zze)) || this.zze == mediaQueueItem.zze) && this.zzf == mediaQueueItem.zzf && this.zzg == mediaQueueItem.zzg && Arrays.equals(this.zzh, mediaQueueItem.zzh);
    }

    @KeepForSdk
    public boolean fromJson(JSONObject jSONObject) throws JSONException {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.zzb = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.zzc != (i = jSONObject.getInt("itemId"))) {
            this.zzc = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.zzd != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.zzd = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.zze) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.zze) > 1.0E-7d)) {
            this.zze = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.zzf) > 1.0E-7d) {
                this.zzf = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.zzg) > 1.0E-7d) {
                this.zzg = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.zzh;
            if (jArr2 == null || jArr2.length != length) {
                z3 = true;
                break;
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (this.zzh[i3] != jArr[i3]) {
                    z3 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z3) {
            this.zzh = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.zzi = jSONObject.getJSONObject("customData");
        return true;
    }

    public long[] getActiveTrackIds() {
        return this.zzh;
    }

    public boolean getAutoplay() {
        return this.zzd;
    }

    public JSONObject getCustomData() {
        return this.zzi;
    }

    public int getItemId() {
        return this.zzc;
    }

    public MediaInfo getMedia() {
        return this.zzb;
    }

    public double getPlaybackDuration() {
        return this.zzf;
    }

    public double getPreloadTime() {
        return this.zzg;
    }

    public double getStartTime() {
        return this.zze;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzj;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd), Double.valueOf(this.zze), Double.valueOf(this.zzf), Double.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), String.valueOf(this.zzi));
    }

    @KeepForSdk
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.zzb;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.zza());
            }
            int i = this.zzc;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.zzd);
            if (!Double.isNaN(this.zze)) {
                jSONObject.put("startTime", this.zze);
            }
            double d = this.zzf;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.zzg);
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.zzh) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.zzi;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzi;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMedia(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getItemId());
        SafeParcelWriter.writeBoolean(parcel, 4, getAutoplay());
        SafeParcelWriter.writeDouble(parcel, 5, getStartTime());
        SafeParcelWriter.writeDouble(parcel, 6, getPlaybackDuration());
        SafeParcelWriter.writeDouble(parcel, 7, getPreloadTime());
        SafeParcelWriter.writeLongArray(parcel, 8, getActiveTrackIds(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zzi() {
        if (this.zzb == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(this.zze) && this.zze < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.zzf)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.zzg) || this.zzg < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public /* synthetic */ MediaQueueItem(MediaInfo mediaInfo, zzcj zzcjVar) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public /* synthetic */ MediaQueueItem(MediaQueueItem mediaQueueItem, zzcj zzcjVar) {
        this(mediaQueueItem.getMedia(), mediaQueueItem.getItemId(), mediaQueueItem.getAutoplay(), mediaQueueItem.getStartTime(), mediaQueueItem.getPlaybackDuration(), mediaQueueItem.getPreloadTime(), mediaQueueItem.getActiveTrackIds(), null);
        if (this.zzb != null) {
            this.zzi = mediaQueueItem.getCustomData();
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @KeepForSdk
    public MediaQueueItem(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, null);
        fromJson(jSONObject);
    }
}
