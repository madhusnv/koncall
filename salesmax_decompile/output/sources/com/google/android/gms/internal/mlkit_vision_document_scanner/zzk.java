package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzk {
    public static final zzk zza;
    public static final zzk zzb;
    public static final zzk zzc;
    private final boolean zzd;
    private final boolean zze = false;
    private final zzad zzf;

    static {
        zzh zzhVar = null;
        zzi zziVar = new zzi(zzhVar);
        zziVar.zzb();
        zza = zziVar.zzd();
        zzi zziVar2 = new zzi(zzhVar);
        zziVar2.zzb();
        zziVar2.zza(new zzg());
        zzb = zziVar2.zzd();
        zzi zziVar3 = new zzi(zzhVar);
        zziVar3.zzc();
        zzc = zziVar3.zzd();
    }

    public /* synthetic */ zzk(boolean z, boolean z2, zzad zzadVar, zzj zzjVar) {
        this.zzd = z;
        this.zzf = zzadVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzk zzkVar) {
        boolean z = zzkVar.zze;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzk zzkVar, Context context, zzp zzpVar) {
        zzad zzadVar = zzkVar.zzf;
        int size = zzadVar.size();
        int i = 0;
        while (i < size) {
            int iZza = ((zzq) zzadVar.get(i)).zza(context, zzpVar, zzkVar.zzd) - 1;
            i++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
