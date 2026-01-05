package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzy extends com.google.android.gms.internal.maps.zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzv zzvVarZzb = com.google.android.gms.internal.maps.zzu.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzvVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
