package com.google.android.gms.cast.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class zzae extends com.google.android.gms.internal.cast.zzb implements zzaf {
    public zzae() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.zzc.zzb(parcel);
        zzb(bundle);
        return true;
    }
}
