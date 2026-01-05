package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzai extends zzb implements zzaj {
    public zzai() {
        super("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzm zzmVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzm ? (zzm) iInterfaceQueryLocalInterface : new zzm(strongBinder);
        }
        zzc.zzd(parcel);
        zzb(zzmVar);
        parcel2.writeNoException();
        return true;
    }
}
