package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NotificationActionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class NotificationAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotificationAction> CREATOR = new zzx();

    @SafeParcelable.Field(getter = "getAction", id = 2)
    private final String zza;

    @SafeParcelable.Field(getter = "getIconResId", id = 3)
    private final int zzb;

    @SafeParcelable.Field(getter = "getContentDescription", id = 4)
    private final String zzc;

    public static final class Builder {
        String zza;
        int zzb;
        String zzc;

        public NotificationAction build() {
            return new NotificationAction(this.zza, this.zzb, this.zzc);
        }

        public Builder setAction(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("action cannot be null or an empty string.");
            }
            this.zza = str;
            return this;
        }

        public Builder setContentDescription(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("contentDescription cannot be null  or an empty string.");
            }
            this.zzc = str;
            return this;
        }

        public Builder setIconResId(int i) {
            this.zzb = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public NotificationAction(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
    }

    public String getAction() {
        return this.zza;
    }

    public String getContentDescription() {
        return this.zzc;
    }

    public int getIconResId() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAction(), false);
        SafeParcelWriter.writeInt(parcel, 3, getIconResId());
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
