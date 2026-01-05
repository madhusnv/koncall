package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzw extends com.google.android.gms.internal.maps.zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzl zzlVarZzb = com.google.android.gms.internal.maps.zzk.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzlVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
