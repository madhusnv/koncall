package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.C2319g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzas extends C2319g.a {
    private static final Logger zza = new Logger("MediaRouterCallback");
    private final zzan zzb;

    public zzas(zzan zzanVar) {
        this.zzb = (zzan) Preconditions.checkNotNull(zzanVar);
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
        try {
            this.zzb.zzf(hVar.m8357k(), hVar.m8355i());
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "onRouteAdded", zzan.class.getSimpleName());
        }
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
        try {
            this.zzb.zzg(hVar.m8357k(), hVar.m8355i());
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "onRouteChanged", zzan.class.getSimpleName());
        }
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
        try {
            this.zzb.zzh(hVar.m8357k(), hVar.m8355i());
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "onRouteRemoved", zzan.class.getSimpleName());
        }
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteSelected(C2319g c2319g, C2319g.h hVar, int i) {
        CastDevice fromBundle;
        CastDevice fromBundle2;
        zza.m13799i("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), hVar.m8357k());
        if (hVar.m8361o() != 1) {
            return;
        }
        try {
            String strM8357k = hVar.m8357k();
            String strM8357k2 = hVar.m8357k();
            if (strM8357k2 != null && strM8357k2.endsWith("-groupRoute") && (fromBundle = CastDevice.getFromBundle(hVar.m8355i())) != null) {
                String deviceId = fromBundle.getDeviceId();
                Iterator it = c2319g.m8246m().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2319g.h hVar2 = (C2319g.h) it.next();
                    String strM8357k3 = hVar2.m8357k();
                    if (strM8357k3 != null && !strM8357k3.endsWith("-groupRoute") && (fromBundle2 = CastDevice.getFromBundle(hVar2.m8355i())) != null && TextUtils.equals(fromBundle2.getDeviceId(), deviceId)) {
                        zza.m13795d("routeId is changed from %s to %s", strM8357k2, hVar2.m8357k());
                        strM8357k2 = hVar2.m8357k();
                        break;
                    }
                }
            }
            if (this.zzb.zze() >= 220400000) {
                this.zzb.zzj(strM8357k2, strM8357k, hVar.m8355i());
            } else {
                this.zzb.zzi(strM8357k2, hVar.m8355i());
            }
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "onRouteSelected", zzan.class.getSimpleName());
        }
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteUnselected(C2319g c2319g, C2319g.h hVar, int i) {
        Logger logger = zza;
        logger.m13799i("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), hVar.m8357k());
        if (hVar.m8361o() != 1) {
            logger.m13795d("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.zzb.zzk(hVar.m8357k(), hVar.m8355i(), i);
        } catch (RemoteException e) {
            zza.m13796d(e, "Unable to call %s on %s.", "onRouteUnselected", zzan.class.getSimpleName());
        }
    }
}
