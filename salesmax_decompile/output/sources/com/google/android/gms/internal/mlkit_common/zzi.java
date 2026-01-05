package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzi {
    public static final zzi zza;
    public static final zzi zzb;
    public static final zzi zzc;
    private final boolean zzd;
    private final boolean zze = false;
    private final zzaq zzf;

    static {
        zzf zzfVar = null;
        zzg zzgVar = new zzg(zzfVar);
        zzgVar.zzb();
        zza = zzgVar.zzd();
        zzg zzgVar2 = new zzg(zzfVar);
        zzgVar2.zzb();
        zzgVar2.zza(new zze());
        zzb = zzgVar2.zzd();
        zzg zzgVar3 = new zzg(zzfVar);
        zzgVar3.zzc();
        zzc = zzgVar3.zzd();
    }

    public /* synthetic */ zzi(boolean z, boolean z2, zzaq zzaqVar, zzh zzhVar) {
        this.zzd = z;
        this.zzf = zzaqVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzi zziVar) {
        boolean z = zziVar.zze;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzi zziVar, Context context, zzr zzrVar) {
        zzaq zzaqVar = zziVar.zzf;
        int size = zzaqVar.size();
        int i = 0;
        while (i < size) {
            int iZza = ((zzs) zzaqVar.get(i)).zza(context, zzrVar, zziVar.zzd) - 1;
            i++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
