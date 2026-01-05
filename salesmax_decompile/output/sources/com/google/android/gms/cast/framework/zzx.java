package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzx extends com.google.android.gms.internal.cast.zza implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final int zze() {
        Parcel parcelZzb = zzb(13, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final Bundle zzf() {
        Parcel parcelZzb = zzb(1, zza());
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zza(parcelZzb, Bundle.CREATOR);
        parcelZzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final zzag zzg() {
        zzag zzafVar;
        Parcel parcelZzb = zzb(6, zza());
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzafVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            zzafVar = iInterfaceQueryLocalInterface instanceof zzag ? (zzag) iInterfaceQueryLocalInterface : new zzaf(strongBinder);
        }
        parcelZzb.recycle();
        return zzafVar;
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final zzao zzh() {
        zzao zzanVar;
        Parcel parcelZzb = zzb(5, zza());
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzanVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            zzanVar = iInterfaceQueryLocalInterface instanceof zzao ? (zzao) iInterfaceQueryLocalInterface : new zzan(strongBinder);
        }
        parcelZzb.recycle();
        return zzanVar;
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final void zzi(zzu zzuVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzuVar);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final void zzj(boolean z) {
        Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        parcelZza.writeInt(0);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzz
    public final void zzk(String str, Map map) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeMap(map);
        zzc(11, parcelZza);
    }
}
