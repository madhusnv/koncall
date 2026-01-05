package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzy extends com.google.android.gms.internal.cast.zzb implements zzz {
    public static zzz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        return iInterfaceQueryLocalInterface instanceof zzz ? (zzz) iInterfaceQueryLocalInterface : new zzx(iBinder);
    }
}
