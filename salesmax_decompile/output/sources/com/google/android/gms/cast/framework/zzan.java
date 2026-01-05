package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzan extends com.google.android.gms.internal.cast.zza implements zzao {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final int zze() {
        Parcel parcelZzb = zzb(8, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final IObjectWrapper zzf() {
        Parcel parcelZzb = zzb(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final IObjectWrapper zzg() {
        Parcel parcelZzb = zzb(7, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzh(zzae zzaeVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzaeVar);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzi(zzaq zzaqVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzaqVar);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzj(boolean z, boolean z2) {
        Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        parcelZza.writeInt(1);
        parcelZza.writeInt(z2 ? 1 : 0);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzk(zzae zzaeVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzaeVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzl(zzaq zzaqVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzaqVar);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzao
    public final void zzm(Bundle bundle) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(parcelZza, bundle);
        zzc(9, parcelZza);
    }
}
