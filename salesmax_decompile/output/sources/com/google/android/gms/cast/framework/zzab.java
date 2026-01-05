package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzab extends com.google.android.gms.internal.cast.zzb implements zzac {
    public static zzac zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return iInterfaceQueryLocalInterface instanceof zzac ? (zzac) iInterfaceQueryLocalInterface : new zzaa(iBinder);
    }
}
