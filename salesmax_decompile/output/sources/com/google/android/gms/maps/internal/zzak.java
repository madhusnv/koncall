package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzak extends com.google.android.gms.internal.maps.zzb implements zzal {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzae zzaeVarZzb = com.google.android.gms.internal.maps.zzad.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzaeVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
