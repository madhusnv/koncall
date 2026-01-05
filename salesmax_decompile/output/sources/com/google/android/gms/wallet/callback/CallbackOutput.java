package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CallbackOutputCreator")
/* loaded from: classes3.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CallbackOutput> CREATOR = new zzk();

    @SafeParcelable.Field(id = 1)
    int zza;

    @SafeParcelable.Field(id = 2)
    int zzb;

    @SafeParcelable.Field(id = 3)
    byte[] zzc;

    @SafeParcelable.Field(id = 4)
    String zzd;

    private CallbackOutput() {
    }

    public static zzj zza() {
        return new zzj(new CallbackOutput(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CallbackOutput(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = str;
    }
}
