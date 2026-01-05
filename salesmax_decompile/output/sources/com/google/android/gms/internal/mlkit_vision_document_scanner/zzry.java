package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DocumentScanningPageParcelCreator")
/* loaded from: classes3.dex */
public final class zzry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzry> CREATOR = new zzrz();

    @SafeParcelable.Field(getter = "getImageTeleporter", id = 1)
    private final BitmapTeleporter zza;

    @SafeParcelable.Constructor
    public zzry(@SafeParcelable.Param(id = 1) BitmapTeleporter bitmapTeleporter) {
        this.zza = bitmapTeleporter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final BitmapTeleporter zza() {
        return this.zza;
    }
}
