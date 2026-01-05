package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjy {
    final /* synthetic */ zzkc zza;
    private zzjx zzb;

    public zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    public final void zza(long j) {
        this.zzb = new zzjx(this, this.zza.zzt.zzav().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            this.zza.zzd.removeCallbacks(zzjxVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
