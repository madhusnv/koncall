package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzm extends zza {
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
    }

    public final LatLng zzd() {
        Parcel parcelZzJ = zzJ(1, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    public final List zze() {
        Parcel parcelZzJ = zzJ(2, zza());
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcelZzJ.createBinderArrayList();
        parcelZzJ.recycle();
        return arrayListCreateBinderArrayList;
    }
}
