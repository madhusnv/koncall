package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "VideoInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    public static final int HDR_TYPE_DV = 3;
    public static final int HDR_TYPE_HDR = 4;
    public static final int HDR_TYPE_HDR10 = 2;
    public static final int HDR_TYPE_SDR = 1;
    public static final int HDR_TYPE_UNKNOWN = 0;

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getHeight", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getHdrType", id = 4)
    private final int zzd;
    private static final Logger zza = new Logger("VideoInfo");
    public static final Parcelable.Creator<VideoInfo> CREATOR = new zzdu();

    public static class Builder {
        private int zza;
        private int zzb;
        private int zzc;

        public VideoInfo build() {
            return new VideoInfo(this.zza, this.zzb, this.zzc);
        }

        public Builder setHdrType(int i) {
            this.zzc = i;
            return this;
        }

        public Builder setHeight(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setWidth(int i) {
            this.zza = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public VideoInfo(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VideoInfo zza(JSONObject jSONObject) throws JSONException {
        char c;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            int iHashCode = string.hashCode();
            int i = 3;
            if (iHashCode != 3218) {
                if (iHashCode != 103158) {
                    if (iHashCode != 113729) {
                        c = (iHashCode == 99136405 && string.equals("hdr10")) ? (char) 1 : (char) 65535;
                    } else if (string.equals("sdr")) {
                        c = 3;
                    }
                } else if (string.equals("hdr")) {
                    c = 2;
                }
            } else if (string.equals("dv")) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    i = 2;
                } else if (c == 2) {
                    i = 4;
                } else if (c != 3) {
                    zza.m13795d("Unknown HDR type: %s", string);
                    i = 0;
                } else {
                    i = 1;
                }
            }
            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            zza.m13796d(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.zzc == videoInfo.getHeight() && this.zzb == videoInfo.getWidth() && this.zzd == videoInfo.getHdrType();
    }

    public int getHdrType() {
        return this.zzd;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.writeInt(parcel, 4, getHdrType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", this.zzb);
            jSONObject.put("height", this.zzc);
            int i = this.zzd;
            jSONObject.put("hdrType", i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : "hdr" : "dv" : "hdr10" : "sdr");
            return jSONObject;
        } catch (JSONException unused) {
            zza.m13797e("Failed to transform VideoInfo into Json", new Object[0]);
            return new JSONObject();
        }
    }
}
