package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
final class zzbi implements com.google.android.gms.cast.internal.zzat {
    final /* synthetic */ zzbk zza;

    public zzbi(zzbk zzbkVar) {
        this.zza = zzbkVar;
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zza(long j, int i, Object obj) {
        if (true != (obj instanceof com.google.android.gms.cast.internal.zzap)) {
            obj = null;
        }
        try {
            this.zza.setResult(new zzbl(new Status(i), obj != null ? ((com.google.android.gms.cast.internal.zzap) obj).zza : null, obj != null ? ((com.google.android.gms.cast.internal.zzap) obj).zzb : null));
        } catch (IllegalStateException e) {
            RemoteMediaClient.zzb.m13798e(e, "Result already set when calling onRequestCompleted", new Object[0]);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zzb(long j) {
        try {
            zzbk zzbkVar = this.zza;
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2103)));
        } catch (IllegalStateException e) {
            RemoteMediaClient.zzb.m13798e(e, "Result already set when calling onRequestReplaced", new Object[0]);
        }
    }
}
