package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            com.google.android.gms.internal.maps.zzah zzahVarZzb = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzd(zzahVarZzb);
        } else if (i == 2) {
            com.google.android.gms.internal.maps.zzah zzahVarZzb2 = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(zzahVarZzb2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.internal.maps.zzah zzahVarZzb3 = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzahVarZzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
