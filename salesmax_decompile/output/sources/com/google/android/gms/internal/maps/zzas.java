package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzas extends zza implements zzau {
    public zzas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final float zzd() {
        Parcel parcelZzJ = zzJ(13, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final float zze() {
        Parcel parcelZzJ = zzJ(5, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final int zzf() {
        Parcel parcelZzJ = zzJ(9, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final String zzg() {
        Parcel parcelZzJ = zzJ(3, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzh() {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzi() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzj(boolean z) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzk(float f) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzl(boolean z) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzm(float f) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzn(zzau zzauVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzauVar);
        Parcel parcelZzJ = zzJ(8, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzo() {
        Parcel parcelZzJ = zzJ(11, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzp() {
        Parcel parcelZzJ = zzJ(7, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
