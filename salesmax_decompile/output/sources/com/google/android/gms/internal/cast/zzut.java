package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zzut extends zzur {
    @Override // com.google.android.gms.internal.cast.zzur
    public final /* synthetic */ int zza(Object obj) {
        return ((zzus) obj).zza();
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzus) obj).zzb();
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzsh) obj).zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        if (zzus.zzc().equals(obj2)) {
            return obj;
        }
        if (zzus.zzc().equals(obj)) {
            return zzus.zze((zzus) obj, (zzus) obj2);
        }
        ((zzus) obj).zzd((zzus) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final void zze(Object obj) {
        ((zzsh) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        ((zzsh) obj).zzc = (zzus) obj2;
    }

    @Override // com.google.android.gms.internal.cast.zzur
    public final /* synthetic */ void zzg(Object obj, zzvi zzviVar) {
    }
}
