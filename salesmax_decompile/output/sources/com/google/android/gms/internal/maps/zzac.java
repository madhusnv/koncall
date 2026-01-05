package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzac extends zza implements zzae {
    public zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzae
    public final boolean zzd() {
        Parcel parcelZzJ = zzJ(1, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzae
    public final boolean zze() {
        Parcel parcelZzJ = zzJ(2, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
