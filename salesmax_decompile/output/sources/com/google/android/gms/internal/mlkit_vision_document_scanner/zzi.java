package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* loaded from: classes3.dex */
public final class zzi {
    private final zzaa zza = new zzaa();
    private Boolean zzb;

    private zzi() {
    }

    public final zzi zza(zzq zzqVar) {
        zzt.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zza(zzqVar);
        return this;
    }

    public final zzi zzb() {
        zzt.zzf(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzi zzc() {
        zzt.zzf(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzk zzd() {
        zzt.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzk(this.zzb.booleanValue(), false, this.zza.zzb(), null);
    }

    public /* synthetic */ zzi(zzh zzhVar) {
    }
}
