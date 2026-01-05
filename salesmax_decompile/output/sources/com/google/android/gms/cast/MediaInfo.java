package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzfe;
import com.google.android.gms.internal.cast.zzfh;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "MediaInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1;
    public static final long UNKNOWN_START_ABSOLUTE_TIME = -1;

    @SafeParcelable.Field(id = 9)
    String zzb;

    @SafeParcelable.Field(getter = "getContentId", id = 2)
    private String zzc;

    @SafeParcelable.Field(getter = "getStreamType", id = 3)
    private int zzd;

    @SafeParcelable.Field(getter = "getContentType", id = 4)
    private String zze;

    @SafeParcelable.Field(getter = "getMetadata", id = 5)
    private MediaMetadata zzf;

    @SafeParcelable.Field(getter = "getStreamDuration", id = 6)
    private long zzg;

    @SafeParcelable.Field(getter = "getMediaTracks", id = 7)
    private List zzh;

    @SafeParcelable.Field(getter = "getTextTrackStyle", id = 8)
    private TextTrackStyle zzi;

    @SafeParcelable.Field(getter = "getAdBreaks", id = 10)
    private List zzj;

    @SafeParcelable.Field(getter = "getAdBreakClips", id = 11)
    private List zzk;

    @SafeParcelable.Field(getter = "getEntity", id = 12)
    private String zzl;

    @SafeParcelable.Field(getter = "getVmapAdsRequest", id = 13)
    private VastAdsRequest zzm;

    @SafeParcelable.Field(getter = "getStartAbsoluteTime", id = 14)
    private long zzn;

    @SafeParcelable.Field(getter = "getAtvEntity", id = 15)
    private String zzo;

    @SafeParcelable.Field(getter = "getContentUrl", id = 16)
    private String zzp;

    @HlsSegmentFormat
    @SafeParcelable.Field(getter = "getHlsSegmentFormat", id = 17)
    private String zzq;

    @HlsVideoSegmentFormat
    @SafeParcelable.Field(getter = "getHlsVideoSegmentFormat", id = 18)
    private String zzr;
    private JSONObject zzs;
    private final Writer zzt;
    public static final long zza = CastUtils.secToMillisec(-1L);
    public static final Parcelable.Creator<MediaInfo> CREATOR = new zzby();

    public static class Builder {
        private String zza;
        private String zzc;
        private MediaMetadata zzd;
        private List zzf;
        private TextTrackStyle zzg;
        private String zzh;
        private List zzi;
        private List zzj;
        private String zzk;
        private VastAdsRequest zzl;
        private String zzm;
        private String zzn;

        @HlsSegmentFormat
        private String zzo;

        @HlsVideoSegmentFormat
        private String zzp;
        private int zzb = -1;
        private long zze = -1;

        public Builder() {
        }

        public MediaInfo build() {
            return new MediaInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, -1L, this.zzm, this.zzn, this.zzo, this.zzp);
        }

        public Builder setAdBreakClips(List<AdBreakClipInfo> list) {
            this.zzj = list;
            return this;
        }

        public Builder setAdBreaks(List<AdBreakInfo> list) {
            this.zzi = list;
            return this;
        }

        public Builder setAtvEntity(String str) {
            this.zzm = str;
            return this;
        }

        public Builder setContentType(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setContentUrl(String str) {
            this.zzn = str;
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzh = jSONObject == null ? null : jSONObject.toString();
            return this;
        }

        public Builder setEntity(String str) {
            this.zzk = str;
            return this;
        }

        public Builder setHlsSegmentFormat(@HlsSegmentFormat String str) {
            this.zzo = str;
            return this;
        }

        public Builder setHlsVideoSegmentFormat(@HlsVideoSegmentFormat String str) {
            this.zzp = str;
            return this;
        }

        public Builder setMediaTracks(List<MediaTrack> list) {
            this.zzf = list;
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.zzd = mediaMetadata;
            return this;
        }

        public Builder setStreamDuration(long j) {
            if (j < 0 && j != -1) {
                throw new IllegalArgumentException("Invalid stream duration");
            }
            this.zze = j;
            return this;
        }

        public Builder setStreamType(int i) {
            if (i < -1 || i > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            this.zzb = i;
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle textTrackStyle) {
            this.zzg = textTrackStyle;
            return this;
        }

        public Builder setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
            this.zzl = vastAdsRequest;
            return this;
        }

        public Builder(String str) {
            this.zza = str;
        }

        public Builder(String str, String str2) {
            this.zza = str;
            this.zzk = str2;
        }
    }

    @KeepForSdk
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setAdBreakClips(List<AdBreakClipInfo> list) {
            MediaInfo.this.zzk = list;
        }

        @KeepForSdk
        public void setAdBreaks(List<AdBreakInfo> list) {
            MediaInfo.this.zzj = list;
        }

        @KeepForSdk
        public void setContentId(String str) {
            MediaInfo.this.zzc = str;
        }

        @KeepForSdk
        public void setContentType(String str) {
            MediaInfo.this.zze = str;
        }

        @KeepForSdk
        public void setContentUrl(String str) {
            MediaInfo.this.zzp = str;
        }

        @KeepForSdk
        public void setCustomData(JSONObject jSONObject) {
            MediaInfo.this.zzs = jSONObject;
        }

        @KeepForSdk
        public void setEntity(String str) {
            MediaInfo.this.zzl = str;
        }

        @KeepForSdk
        public void setHlsSegmentFormat(@HlsSegmentFormat String str) {
            MediaInfo.this.zzq = str;
        }

        @KeepForSdk
        public void setHlsVideoSegmentFormat(@HlsVideoSegmentFormat String str) {
            MediaInfo.this.zzr = str;
        }

        @KeepForSdk
        public void setMediaTracks(List<MediaTrack> list) {
            MediaInfo.this.zzh = list;
        }

        @KeepForSdk
        public void setMetadata(MediaMetadata mediaMetadata) {
            MediaInfo.this.zzf = mediaMetadata;
        }

        @KeepForSdk
        public void setStartAbsoluteTime(long j) {
            if (j < 0 && j != -1) {
                throw new IllegalArgumentException("Invalid start absolute time");
            }
            MediaInfo.this.zzn = j;
        }

        @KeepForSdk
        public void setStreamDuration(long j) {
            if (j < 0 && j != -1) {
                throw new IllegalArgumentException("Invalid stream duration");
            }
            MediaInfo.this.zzg = j;
        }

        @KeepForSdk
        public void setStreamType(int i) {
            if (i < -1 || i > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            MediaInfo.this.zzd = i;
        }

        @KeepForSdk
        public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
            MediaInfo.this.zzi = textTrackStyle;
        }

        @KeepForSdk
        public void setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
            MediaInfo.this.zzm = vastAdsRequest;
        }
    }

    @SafeParcelable.Constructor
    public MediaInfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) MediaMetadata mediaMetadata, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) List list, @SafeParcelable.Param(id = 8) TextTrackStyle textTrackStyle, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) List list2, @SafeParcelable.Param(id = 11) List list3, @SafeParcelable.Param(id = 12) String str4, @SafeParcelable.Param(id = 13) VastAdsRequest vastAdsRequest, @SafeParcelable.Param(id = 14) long j2, @SafeParcelable.Param(id = 15) String str5, @SafeParcelable.Param(id = 16) String str6, @HlsSegmentFormat @SafeParcelable.Param(id = 17) String str7, @SafeParcelable.Param(id = 18) @HlsVideoSegmentFormat String str8) {
        this.zzt = new Writer();
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
        this.zzf = mediaMetadata;
        this.zzg = j;
        this.zzh = list;
        this.zzi = textTrackStyle;
        this.zzb = str3;
        if (str3 != null) {
            try {
                this.zzs = new JSONObject(this.zzb);
            } catch (JSONException unused) {
                this.zzs = null;
                this.zzb = null;
            }
        } else {
            this.zzs = null;
        }
        this.zzj = list2;
        this.zzk = list3;
        this.zzl = str4;
        this.zzm = vastAdsRequest;
        this.zzn = j2;
        this.zzo = str5;
        this.zzp = str6;
        this.zzq = str7;
        this.zzr = str8;
        if (this.zzc == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.zzs;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.zzs;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && CastUtils.zze(this.zzc, mediaInfo.zzc) && this.zzd == mediaInfo.zzd && CastUtils.zze(this.zze, mediaInfo.zze) && CastUtils.zze(this.zzf, mediaInfo.zzf) && this.zzg == mediaInfo.zzg && CastUtils.zze(this.zzh, mediaInfo.zzh) && CastUtils.zze(this.zzi, mediaInfo.zzi) && CastUtils.zze(this.zzj, mediaInfo.zzj) && CastUtils.zze(this.zzk, mediaInfo.zzk) && CastUtils.zze(this.zzl, mediaInfo.zzl) && CastUtils.zze(this.zzm, mediaInfo.zzm) && this.zzn == mediaInfo.zzn && CastUtils.zze(this.zzo, mediaInfo.zzo) && CastUtils.zze(this.zzp, mediaInfo.zzp) && CastUtils.zze(this.zzq, mediaInfo.zzq) && CastUtils.zze(this.zzr, mediaInfo.zzr);
    }

    public List<AdBreakClipInfo> getAdBreakClips() {
        List list = this.zzk;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<AdBreakInfo> getAdBreaks() {
        List list = this.zzj;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getContentId() {
        String str = this.zzc;
        return str == null ? "" : str;
    }

    public String getContentType() {
        return this.zze;
    }

    public String getContentUrl() {
        return this.zzp;
    }

    public JSONObject getCustomData() {
        return this.zzs;
    }

    public String getEntity() {
        return this.zzl;
    }

    @HlsSegmentFormat
    public String getHlsSegmentFormat() {
        return this.zzq;
    }

    @HlsVideoSegmentFormat
    public String getHlsVideoSegmentFormat() {
        return this.zzr;
    }

    public List<MediaTrack> getMediaTracks() {
        return this.zzh;
    }

    public MediaMetadata getMetadata() {
        return this.zzf;
    }

    public long getStartAbsoluteTime() {
        return this.zzn;
    }

    public long getStreamDuration() {
        return this.zzg;
    }

    public int getStreamType() {
        return this.zzd;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzi;
    }

    public VastAdsRequest getVmapAdsRequest() {
        return this.zzm;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzt;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzc, Integer.valueOf(this.zzd), this.zze, this.zzf, Long.valueOf(this.zzg), String.valueOf(this.zzs), this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzq, this.zzr);
    }

    public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zzi = textTrackStyle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzs;
        this.zzb = jSONObject == null ? null : jSONObject.toString();
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getContentId(), false);
        SafeParcelWriter.writeInt(parcel, 3, getStreamType());
        SafeParcelWriter.writeString(parcel, 4, getContentType(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getMetadata(), i, false);
        SafeParcelWriter.writeLong(parcel, 6, getStreamDuration());
        SafeParcelWriter.writeTypedList(parcel, 7, getMediaTracks(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getTextTrackStyle(), i, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 10, getAdBreaks(), false);
        SafeParcelWriter.writeTypedList(parcel, 11, getAdBreakClips(), false);
        SafeParcelWriter.writeString(parcel, 12, getEntity(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, getVmapAdsRequest(), i, false);
        SafeParcelWriter.writeLong(parcel, 14, getStartAbsoluteTime());
        SafeParcelWriter.writeString(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, getContentUrl(), false);
        SafeParcelWriter.writeString(parcel, 17, getHlsSegmentFormat(), false);
        SafeParcelWriter.writeString(parcel, 18, getHlsVideoSegmentFormat(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.zzc);
            jSONObject.putOpt("contentUrl", this.zzp);
            int i = this.zzd;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.zze;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.zzf;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.zza());
            }
            long j = this.zzg;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", CastUtils.millisecToSec(j));
            }
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzh.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).zza());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.zzi;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.zza());
            }
            JSONObject jSONObject2 = this.zzs;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.zzl;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.zzj != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.zzj.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AdBreakInfo) it2.next()).zza());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.zzk != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.zzk.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((AdBreakClipInfo) it3.next()).zza());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.zzm;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.zza());
            }
            long j2 = this.zzn;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", CastUtils.millisecToSec(j2));
            }
            jSONObject.putOpt("atvEntity", this.zzo);
            String str3 = this.zzq;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.zzr;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[LOOP:0: B:5:0x0021->B:26:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e A[LOOP:2: B:32:0x00cb->B:59:0x017e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzr(JSONObject jSONObject) {
        JSONObject jSONObject2;
        long jSecToMillisec;
        AdBreakClipInfo adBreakClipInfo;
        AdBreakInfo adBreakInfo;
        int i = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                Parcelable.Creator<AdBreakInfo> creator = AdBreakInfo.CREATOR;
                if (jSONObject3 != null && jSONObject3.has(OutcomeConstants.OUTCOME_ID) && jSONObject3.has("position")) {
                    try {
                        String string = jSONObject3.getString(OutcomeConstants.OUTCOME_ID);
                        long jSecToMillisec2 = CastUtils.secToMillisec(jSONObject3.getLong("position"));
                        boolean zOptBoolean = jSONObject3.optBoolean("isWatched");
                        long jSecToMillisec3 = CastUtils.secToMillisec(jSONObject3.optLong("duration"));
                        JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("breakClipIds");
                        String[] strArr = new String[i];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            for (int i3 = i; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                strArr[i3] = jSONArrayOptJSONArray.getString(i3);
                            }
                        }
                        adBreakInfo = new AdBreakInfo(jSecToMillisec2, string, jSecToMillisec3, zOptBoolean, strArr, jSONObject3.optBoolean("isEmbedded"), jSONObject3.optBoolean("expanded"));
                    } catch (JSONException e) {
                        String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e.getMessage());
                    }
                    if (adBreakInfo != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(adBreakInfo);
                        i2++;
                        i = 0;
                    }
                } else {
                    adBreakInfo = null;
                    if (adBreakInfo != null) {
                    }
                }
            }
            this.zzj = new ArrayList(arrayList);
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            int i4 = 0;
            while (true) {
                if (i4 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i4);
                Parcelable.Creator<AdBreakClipInfo> creator2 = AdBreakClipInfo.CREATOR;
                if (jSONObject4 != null && jSONObject4.has(OutcomeConstants.OUTCOME_ID)) {
                    try {
                        String string2 = jSONObject4.getString(OutcomeConstants.OUTCOME_ID);
                        long jSecToMillisec4 = CastUtils.secToMillisec(jSONObject4.optLong("duration"));
                        String strOptStringOrNull = CastUtils.optStringOrNull(jSONObject4, "clickThroughUrl");
                        String strOptStringOrNull2 = CastUtils.optStringOrNull(jSONObject4, "contentUrl");
                        String strOptStringOrNull3 = CastUtils.optStringOrNull(jSONObject4, "mimeType");
                        if (strOptStringOrNull3 == null) {
                            strOptStringOrNull3 = CastUtils.optStringOrNull(jSONObject4, "contentType");
                        }
                        String str = strOptStringOrNull3;
                        String strOptStringOrNull4 = CastUtils.optStringOrNull(jSONObject4, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("customData");
                        String strOptStringOrNull5 = CastUtils.optStringOrNull(jSONObject4, "contentId");
                        String strOptStringOrNull6 = CastUtils.optStringOrNull(jSONObject4, "posterUrl");
                        if (jSONObject4.has("whenSkippable")) {
                            jSONObject2 = jSONObjectOptJSONObject;
                            jSecToMillisec = CastUtils.secToMillisec(((Integer) jSONObject4.get("whenSkippable")).intValue());
                        } else {
                            jSONObject2 = jSONObjectOptJSONObject;
                            jSecToMillisec = -1;
                        }
                        adBreakClipInfo = new AdBreakClipInfo(string2, strOptStringOrNull4, jSecToMillisec4, strOptStringOrNull2, str, strOptStringOrNull, (jSONObject2 == null || jSONObject2.length() == 0) ? null : jSONObject2.toString(), strOptStringOrNull5, strOptStringOrNull6, jSecToMillisec, CastUtils.optStringOrNull(jSONObject4, "hlsSegmentFormat"), VastAdsRequest.fromJson(jSONObject4.optJSONObject("vastAdsRequest")));
                    } catch (JSONException e2) {
                        String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e2.getMessage());
                    }
                    if (adBreakClipInfo != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(adBreakClipInfo);
                        i4++;
                    }
                } else {
                    adBreakClipInfo = null;
                    if (adBreakClipInfo != null) {
                    }
                }
            }
            this.zzk = new ArrayList(arrayList2);
        }
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        MediaInfo mediaInfo;
        int i;
        int i2;
        zzfh zzfhVarZzc;
        int i3;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        int i4 = 2;
        int i5 = 1;
        if ("NONE".equals(strOptString)) {
            mediaInfo = this;
            mediaInfo.zzd = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(strOptString)) {
                mediaInfo.zzd = 1;
            } else if ("LIVE".equals(strOptString)) {
                mediaInfo.zzd = 2;
            } else {
                mediaInfo.zzd = -1;
            }
        }
        mediaInfo.zze = CastUtils.optStringOrNull(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            mediaInfo.zzf = mediaMetadata;
            mediaMetadata.zzc(jSONObject2);
        }
        mediaInfo.zzg = -1L;
        if (mediaInfo.zzd != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                mediaInfo.zzg = CastUtils.secToMillisec(dOptDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i6 = 0;
            while (i6 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                String str = MediaTrack.ROLE_ALTERNATE;
                long j = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                if ("TEXT".equals(strOptString2)) {
                    i = i5;
                } else if ("AUDIO".equals(strOptString2)) {
                    i = i4;
                } else {
                    i = "VIDEO".equals(strOptString2) ? 3 : 0;
                }
                String strOptStringOrNull = CastUtils.optStringOrNull(jSONObject3, "trackContentId");
                String strOptStringOrNull2 = CastUtils.optStringOrNull(jSONObject3, "trackContentType");
                String strOptStringOrNull3 = CastUtils.optStringOrNull(jSONObject3, "name");
                String strOptStringOrNull4 = CastUtils.optStringOrNull(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = i5;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = i4;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        if ("CHAPTERS".equals(string)) {
                            i3 = 4;
                        } else if ("METADATA".equals(string)) {
                            i3 = 5;
                        } else {
                            i2 = -1;
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    zzfe zzfeVar = new zzfe();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                        zzfeVar.zzb(jSONArray2.optString(i7));
                    }
                    zzfhVarZzc = zzfeVar.zzc();
                } else {
                    zzfhVarZzc = null;
                }
                arrayList.add(new MediaTrack(j, i, strOptStringOrNull, strOptStringOrNull2, strOptStringOrNull3, strOptStringOrNull4, i2, zzfhVarZzc, jSONObject3.optJSONObject("customData")));
                i6++;
                i4 = 2;
                i5 = 1;
            }
            mediaInfo.zzh = new ArrayList(arrayList);
        } else {
            mediaInfo.zzh = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.fromJson(jSONObject4);
            mediaInfo.zzi = textTrackStyle;
        } else {
            mediaInfo.zzi = null;
        }
        zzr(jSONObject);
        mediaInfo.zzs = jSONObject.optJSONObject("customData");
        mediaInfo.zzl = CastUtils.optStringOrNull(jSONObject, "entity");
        mediaInfo.zzo = CastUtils.optStringOrNull(jSONObject, "atvEntity");
        mediaInfo.zzm = VastAdsRequest.fromJson(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                mediaInfo.zzn = CastUtils.secToMillisec(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.zzp = jSONObject.optString("contentUrl");
        }
        mediaInfo.zzq = CastUtils.optStringOrNull(jSONObject, "hlsSegmentFormat");
        mediaInfo.zzr = CastUtils.optStringOrNull(jSONObject, "hlsVideoSegmentFormat");
    }
}
