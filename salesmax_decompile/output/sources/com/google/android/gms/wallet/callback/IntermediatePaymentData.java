package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IntermediatePaymentDataCreator")
/* loaded from: classes3.dex */
public class IntermediatePaymentData extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<IntermediatePaymentData> CREATOR = new zzl();

    @SafeParcelable.Field(id = 1)
    String zza;

    @SafeParcelable.Field(id = 2)
    Bundle zzb;

    @SafeParcelable.Constructor
    public IntermediatePaymentData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @RecentlyNonNull
    public static IntermediatePaymentData fromJson(@RecentlyNonNull String str) {
        return new IntermediatePaymentData((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    @RecentlyNullable
    public Bundle getLastSavedState() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String toJson() {
        return this.zza;
    }

    @RecentlyNonNull
    public IntermediatePaymentData withLastSavedState(Bundle bundle) {
        this.zzb = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
