package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzz extends zza implements zzab {
    public zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final int zzd() {
        Parcel parcelZzJ = zzJ(5, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final String zze() {
        Parcel parcelZzJ = zzJ(1, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final String zzf() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final void zzg() {
        zzc(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final boolean zzh(zzab zzabVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzabVar);
        Parcel parcelZzJ = zzJ(4, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
