package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
final class zzdn implements com.google.android.gms.cast.internal.zzat {
    final /* synthetic */ zzdp zza;

    public zzdn(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zza(long j, int i, Object obj) {
        if (true != (obj instanceof com.google.android.gms.cast.internal.zzap)) {
            obj = null;
        }
        try {
            this.zza.setResult((zzdp) new zzdq(new Status(i), obj != null ? ((com.google.android.gms.cast.internal.zzap) obj).zza : null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zzb(long j) {
        try {
            zzdp zzdpVar = this.zza;
            zzdpVar.setResult((zzdp) new zzdo(zzdpVar, new Status(2103)));
        } catch (IllegalStateException unused) {
        }
    }
}
