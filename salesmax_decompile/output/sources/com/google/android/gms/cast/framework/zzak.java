package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzak extends com.google.android.gms.internal.cast.zza implements zzam {
    public zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final int zze() {
        Parcel parcelZzb = zzb(17, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final int zzf() {
        Parcel parcelZzb = zzb(18, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final IObjectWrapper zzg() {
        Parcel parcelZzb = zzb(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final String zzh() {
        Parcel parcelZzb = zzb(2, zza());
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final String zzi() {
        Parcel parcelZzb = zzb(3, zza());
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzj(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzk(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzl(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzm(boolean z) {
        Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzn(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzo(int i) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzp() {
        Parcel parcelZzb = zzb(5, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzq() {
        Parcel parcelZzb = zzb(6, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzr() {
        Parcel parcelZzb = zzb(8, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzs() {
        Parcel parcelZzb = zzb(7, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzt() {
        Parcel parcelZzb = zzb(9, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final boolean zzu() {
        Parcel parcelZzb = zzb(10, zza());
        boolean zZzf = com.google.android.gms.internal.cast.zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }
}
