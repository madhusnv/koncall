package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TextModuleDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class TextModuleData extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<TextModuleData> CREATOR = new zzk();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    public TextModuleData() {
    }

    @RecentlyNonNull
    public String getBody() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getHeader() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TextModuleData(@RecentlyNonNull @SafeParcelable.Param(id = 2) String str, @RecentlyNonNull @SafeParcelable.Param(id = 3) String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
