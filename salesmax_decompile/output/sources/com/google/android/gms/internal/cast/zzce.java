package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.Cast;

/* loaded from: classes3.dex */
final class zzce extends Cast.Listener {
    final /* synthetic */ zzcf zza;

    public zzce(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onVolumeChanged() {
        this.zza.zza();
    }
}
