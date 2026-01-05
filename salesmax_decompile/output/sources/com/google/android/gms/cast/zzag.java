package com.google.android.gms.cast;

import androidx.mediarouter.media.C2319g;

/* loaded from: classes5.dex */
final class zzag extends C2319g.a {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzag(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteUnselected(C2319g c2319g, C2319g.h hVar) {
        this.zza.zzv("onRouteUnselected");
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.zza;
        if (castRemoteDisplayLocalService.zzm == null) {
            castRemoteDisplayLocalService.zzv("onRouteUnselected, no device was selected");
            return;
        }
        CastDevice fromBundle = CastDevice.getFromBundle(hVar.m8355i());
        if (fromBundle == null || !fromBundle.getDeviceId().equals(this.zza.zzm.getDeviceId())) {
            this.zza.zzv("onRouteUnselected, device does not match");
        } else {
            CastRemoteDisplayLocalService.stopService();
        }
    }
}
