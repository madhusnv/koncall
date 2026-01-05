package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzax;

/* loaded from: classes3.dex */
final class zzai implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzax zzb;

    public zzai(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzb.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
