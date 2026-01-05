package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzad extends zzb implements zzae {
    public static zzae zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
        return iInterfaceQueryLocalInterface instanceof zzae ? (zzae) iInterfaceQueryLocalInterface : new zzac(iBinder);
    }
}
