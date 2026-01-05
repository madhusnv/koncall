package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzai extends com.google.android.gms.internal.cast.zzb implements zzaj {
    public static zzaj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzah(iBinder);
    }
}
