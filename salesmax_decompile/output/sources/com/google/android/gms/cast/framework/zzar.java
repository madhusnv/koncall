package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public abstract class zzar extends com.google.android.gms.internal.cast.zzb implements zzas {
    public zzar() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            IObjectWrapper iObjectWrapperZzb = zzb(string);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, iObjectWrapperZzb);
        } else if (i == 2) {
            boolean zZzd = zzd();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.cast.zzc.zza;
            parcel2.writeInt(zZzd ? 1 : 0);
        } else if (i == 3) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        }
        return true;
    }
}
