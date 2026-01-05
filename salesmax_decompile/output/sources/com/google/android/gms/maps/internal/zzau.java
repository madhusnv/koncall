package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzau extends com.google.android.gms.internal.maps.zzb implements zzav {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzah zzahVarZzb = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        boolean zZzb = zzb(zzahVarZzb);
        parcel2.writeNoException();
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
