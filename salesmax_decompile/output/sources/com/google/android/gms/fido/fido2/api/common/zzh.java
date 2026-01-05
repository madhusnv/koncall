package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticationExtensionsPrfOutputsCreator")
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getSupported", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getOutputs", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = z;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.zza == zzhVar.zza && Arrays.equals(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
