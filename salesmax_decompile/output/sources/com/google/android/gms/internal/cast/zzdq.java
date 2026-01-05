package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.view.Surface;

/* loaded from: classes3.dex */
public abstract class zzdq extends zzb implements zzdr {
    public zzdq() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            Surface surface = (Surface) zzc.zza(parcel, Surface.CREATOR);
            zzc.zzb(parcel);
            zzb(i3, i4, surface);
        } else if (i == 2) {
            int i5 = parcel.readInt();
            zzc.zzb(parcel);
            zzd(i5);
        } else if (i == 3) {
            zzf();
        } else if (i == 4) {
            zzc();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zZzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zze(zZzf);
        }
        parcel2.writeNoException();
        return true;
    }
}
