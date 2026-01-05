package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamic.IObjectWrapper;

@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzs {
    private static final Logger zza = new Logger("DiscoveryManager");
    private final zzag zzb;

    public zzs(zzag zzagVar) {
        this.zzb = zzagVar;
    }

    public final IObjectWrapper zza() {
        try {
            return this.zzb.zze();
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "getWrappedThis", zzag.class.getSimpleName());
            return null;
        }
    }
}
