package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzag extends com.google.android.gms.internal.maps.zzb implements zzah {
    public zzag() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzah zzahVarZzb = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzahVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
