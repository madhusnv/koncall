package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zznk {
    private zznw zza;
    private Long zzb;
    private zznf zzc;
    private Long zzd;
    private zznl zze;
    private Long zzf;

    public final zznk zzb(Long l) {
        this.zzf = l;
        return this;
    }

    public final zznk zzc(zznl zznlVar) {
        this.zze = zznlVar;
        return this;
    }

    public final zznk zzd(zznf zznfVar) {
        this.zzc = zznfVar;
        return this;
    }

    public final zznk zze(Long l) {
        this.zzd = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznk zzf(zznw zznwVar) {
        this.zza = zznwVar;
        return this;
    }

    public final zznk zzg(Long l) {
        this.zzb = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznn zzi() {
        return new zznn(this, null);
    }
}
