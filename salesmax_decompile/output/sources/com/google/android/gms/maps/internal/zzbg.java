package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzbg extends com.google.android.gms.internal.maps.zzb implements zzbh {
    public zzbg() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzam zzamVarZzb = com.google.android.gms.internal.maps.zzal.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzamVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
