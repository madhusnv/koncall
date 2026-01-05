package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzb();
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzy zzyVarZzb = com.google.android.gms.internal.maps.zzx.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzyVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
