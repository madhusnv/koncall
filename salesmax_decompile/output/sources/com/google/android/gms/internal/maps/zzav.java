package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes3.dex */
public final class zzav extends zza implements zzax {
    public zzav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzax
    public final Tile zzb(int i, int i2, int i3) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        Parcel parcelZzJ = zzJ(1, parcelZza);
        Tile tile = (Tile) zzc.zza(parcelZzJ, Tile.CREATOR);
        parcelZzJ.recycle();
        return tile;
    }
}
