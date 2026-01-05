package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzbi extends com.google.android.gms.internal.maps.zzb implements zzbj {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzap zzapVarZzb = com.google.android.gms.internal.maps.zzao.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzapVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
