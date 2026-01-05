package com.google.android.gms.internal.cast;

import androidx.mediarouter.media.C2319g;

/* loaded from: classes3.dex */
final class zzw extends C2319g.a {
    final /* synthetic */ zzy zza;

    public zzw(zzy zzyVar) {
        this.zza = zzyVar;
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
        this.zza.zzf();
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
        this.zza.zzf();
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
        this.zza.zzf();
    }

    @Override // androidx.mediarouter.media.C2319g.a
    public final void onRouteSelected(C2319g c2319g, C2319g.h hVar, int i) {
        this.zza.zzs = hVar;
        this.zza.dismiss();
    }
}
