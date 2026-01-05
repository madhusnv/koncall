package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzds extends zza {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void zze() {
        zzd(3, zza());
    }

    public final void zzf(zzdr zzdrVar, int i) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        parcelZza.writeInt(i);
        zzd(5, parcelZza);
    }

    public final void zzg(zzdr zzdrVar, zzdu zzduVar, String str, String str2, Bundle bundle) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzc.zze(parcelZza, zzduVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzc(parcelZza, bundle);
        zzd(7, parcelZza);
    }

    public final void zzh(zzdr zzdrVar, PendingIntent pendingIntent, String str, String str2, Bundle bundle) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzc.zzc(parcelZza, pendingIntent);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzc.zzc(parcelZza, bundle);
        zzd(8, parcelZza);
    }

    public final void zzi(zzdr zzdrVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzdrVar);
        zzd(6, parcelZza);
    }
}
