package com.google.android.gms.internal.cast;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzdt extends zzb implements zzdu {
    public zzdt() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        zzc.zzb(parcel);
        zzb(i3);
        return true;
    }
}
