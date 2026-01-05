package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzr extends zzb implements zzs {
    public static zzs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzq(iBinder);
    }
}
