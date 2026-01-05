package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "MediaQueueDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new zzci();
    public static final int MEDIA_QUEUE_TYPE_ALBUM = 1;
    public static final int MEDIA_QUEUE_TYPE_AUDIO_BOOK = 3;
    public static final int MEDIA_QUEUE_TYPE_GENERIC = 0;
    public static final int MEDIA_QUEUE_TYPE_LIVE_TV = 8;
    public static final int MEDIA_QUEUE_TYPE_MOVIE = 9;
    public static final int MEDIA_QUEUE_TYPE_PLAYLIST = 2;
    public static final int MEDIA_QUEUE_TYPE_PODCAST_SERIES = 5;
    public static final int MEDIA_QUEUE_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_QUEUE_TYPE_TV_SERIES = 6;
    public static final int MEDIA_QUEUE_TYPE_VIDEO_PLAYLIST = 7;

    @SafeParcelable.Field(getter = "getQueueId", id = 2)
    private String zza;

    @SafeParcelable.Field(getter = "getEntity", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getQueueType", id = 4)
    private int zzc;

    @SafeParcelable.Field(getter = "getName", id = 5)
    private String zzd;

    @SafeParcelable.Field(getter = "getContainerMetadata", id = 6)
    private MediaQueueContainerMetadata zze;

    @SafeParcelable.Field(getter = "getRepeatMode", id = 7)
    private int zzf;

    @SafeParcelable.Field(getter = "getItems", id = 8)
    private List zzg;

    @SafeParcelable.Field(getter = "getStartIndex", id = 9)
    private int zzh;

    @SafeParcelable.Field(getter = "getStartTime", id = 10)
    private long zzi;

    @SafeParcelable.Field(getter = "getShuffle", id = 11)
    private boolean zzj;

    public static class Builder {
        private final MediaQueueData zza;

        public Builder() {
            this.zza = new MediaQueueData(null);
        }

        public MediaQueueData build() {
            return new MediaQueueData(this.zza, null);
        }

        public Builder setContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
            this.zza.zze = mediaQueueContainerMetadata;
            return this;
        }

        public Builder setEntity(String str) {
            this.zza.zzb = str;
            return this;
        }

        public Builder setItems(List<MediaQueueItem> list) {
            MediaQueueData.zze(this.zza, list);
            return this;
        }

        public Builder setName(String str) {
            this.zza.zzd = str;
            return this;
        }

        public Builder setQueueId(String str) {
            this.zza.zza = str;
            return this;
        }

        public Builder setQueueType(int i) {
            this.zza.zzc = i;
            return this;
        }

        public Builder setRepeatMode(int i) {
            this.zza.setRepeatMode(i);
            return this;
        }

        public Builder setStartIndex(int i) {
            this.zza.zzh = i;
            return this;
        }

        public Builder setStartTime(long j) {
            this.zza.zzi = j;
            return this;
        }

        public final Builder zza(JSONObject jSONObject) {
            MediaQueueData.zzb(this.zza, jSONObject);
            return this;
        }

        @KeepForSdk
        public Builder(MediaQueueData mediaQueueData) {
            this.zza = new MediaQueueData(mediaQueueData, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaQueueType {
    }

    private MediaQueueData() {
        zzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void zzb(MediaQueueData mediaQueueData, JSONObject jSONObject) {
        mediaQueueData.zzl();
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.zza = CastUtils.optStringOrNull(jSONObject, OutcomeConstants.OUTCOME_ID);
        mediaQueueData.zzb = CastUtils.optStringOrNull(jSONObject, "entity");
        switch (jSONObject.optString("queueType")) {
            case "ALBUM":
                mediaQueueData.zzc = 1;
                break;
            case "PLAYLIST":
                mediaQueueData.zzc = 2;
                break;
            case "AUDIOBOOK":
                mediaQueueData.zzc = 3;
                break;
            case "RADIO_STATION":
                mediaQueueData.zzc = 4;
                break;
            case "PODCAST_SERIES":
                mediaQueueData.zzc = 5;
                break;
            case "TV_SERIES":
                mediaQueueData.zzc = 6;
                break;
            case "VIDEO_PLAYLIST":
                mediaQueueData.zzc = 7;
                break;
            case "LIVE_TV":
                mediaQueueData.zzc = 8;
                break;
            case "MOVIE":
                mediaQueueData.zzc = 9;
                break;
        }
        mediaQueueData.zzd = CastUtils.optStringOrNull(jSONObject, "name");
        JSONObject jSONObjectOptJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
        if (jSONObjectOptJSONObject != null) {
            MediaQueueContainerMetadata.Builder builder = new MediaQueueContainerMetadata.Builder();
            builder.zza(jSONObjectOptJSONObject);
            mediaQueueData.zze = builder.build();
        }
        Integer numMediaRepeatModeFromString = MediaCommon.mediaRepeatModeFromString(jSONObject.optString("repeatMode"));
        if (numMediaRepeatModeFromString != null) {
            mediaQueueData.zzf = numMediaRepeatModeFromString.intValue();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueData.zzg = arrayList;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    try {
                        arrayList.add(new MediaQueueItem(jSONObjectOptJSONObject2));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        mediaQueueData.zzh = jSONObject.optInt("startIndex", mediaQueueData.zzh);
        if (jSONObject.has("startTime")) {
            mediaQueueData.zzi = CastUtils.secToMillisec(jSONObject.optDouble("startTime", mediaQueueData.zzi));
        }
        mediaQueueData.zzj = jSONObject.optBoolean("shuffle");
    }

    public static /* bridge */ /* synthetic */ void zze(MediaQueueData mediaQueueData, List list) {
        mediaQueueData.zzg = list == null ? null : new ArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = 0;
        this.zzd = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = 0;
        this.zzi = -1L;
        this.zzj = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.zza, mediaQueueData.zza) && TextUtils.equals(this.zzb, mediaQueueData.zzb) && this.zzc == mediaQueueData.zzc && TextUtils.equals(this.zzd, mediaQueueData.zzd) && Objects.equal(this.zze, mediaQueueData.zze) && this.zzf == mediaQueueData.zzf && Objects.equal(this.zzg, mediaQueueData.zzg) && this.zzh == mediaQueueData.zzh && this.zzi == mediaQueueData.zzi && this.zzj == mediaQueueData.zzj;
    }

    public MediaQueueContainerMetadata getContainerMetadata() {
        return this.zze;
    }

    public String getEntity() {
        return this.zzb;
    }

    public List<MediaQueueItem> getItems() {
        List list = this.zzg;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getName() {
        return this.zzd;
    }

    public String getQueueId() {
        return this.zza;
    }

    public int getQueueType() {
        return this.zzc;
    }

    public int getRepeatMode() {
        return this.zzf;
    }

    public int getStartIndex() {
        return this.zzh;
    }

    public long getStartTime() {
        return this.zzi;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Long.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    @KeepForSdk
    public void setRepeatMode(int i) {
        this.zzf = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getQueueId(), false);
        SafeParcelWriter.writeString(parcel, 3, getEntity(), false);
        SafeParcelWriter.writeInt(parcel, 4, getQueueType());
        SafeParcelWriter.writeString(parcel, 5, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getContainerMetadata(), i, false);
        SafeParcelWriter.writeInt(parcel, 7, getRepeatMode());
        SafeParcelWriter.writeTypedList(parcel, 8, getItems(), false);
        SafeParcelWriter.writeInt(parcel, 9, getStartIndex());
        SafeParcelWriter.writeLong(parcel, 10, getStartTime());
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                jSONObject.put(OutcomeConstants.OUTCOME_ID, this.zza);
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                jSONObject.put("entity", this.zzb);
            }
            switch (this.zzc) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                jSONObject.put("name", this.zzd);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.zze;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.zza());
            }
            String strZza = MediaCommon.zza(Integer.valueOf(this.zzf));
            if (strZza != null) {
                jSONObject.put("repeatMode", strZza);
            }
            List list = this.zzg;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaQueueItem) it.next()).toJson());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.zzh);
            long j = this.zzi;
            if (j != -1) {
                jSONObject.put("startTime", CastUtils.millisecToSec(j));
            }
            jSONObject.put("shuffle", this.zzj);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @ShowFirstParty
    public final boolean zzk() {
        return this.zzj;
    }

    public /* synthetic */ MediaQueueData(zzch zzchVar) {
        zzl();
    }

    public /* synthetic */ MediaQueueData(MediaQueueData mediaQueueData, zzch zzchVar) {
        this.zza = mediaQueueData.zza;
        this.zzb = mediaQueueData.zzb;
        this.zzc = mediaQueueData.zzc;
        this.zzd = mediaQueueData.zzd;
        this.zze = mediaQueueData.zze;
        this.zzf = mediaQueueData.zzf;
        this.zzg = mediaQueueData.zzg;
        this.zzh = mediaQueueData.zzh;
        this.zzi = mediaQueueData.zzi;
        this.zzj = mediaQueueData.zzj;
    }

    @SafeParcelable.Constructor
    public MediaQueueData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) MediaQueueContainerMetadata mediaQueueContainerMetadata, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 8) List list, @SafeParcelable.Param(id = 9) int i3, @SafeParcelable.Param(id = 10) long j, @SafeParcelable.Param(id = 11) boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = mediaQueueContainerMetadata;
        this.zzf = i2;
        this.zzg = list;
        this.zzh = i3;
        this.zzi = j;
        this.zzj = z;
    }
}
