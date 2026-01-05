package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzj extends SessionTransferCallback {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferFailed(int i, int i2) {
        zzk.zza.m13795d("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzf(zzkVar.zzh, i, i2), 232);
        this.zza.zzk = false;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferred(int i, SessionState sessionState) {
        zzk.zza.m13795d("onTransferred with type = %d", Integer.valueOf(i));
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzg(zzkVar.zzh, i), 231);
        this.zza.zzk = false;
        this.zza.zzh = null;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void onTransferring(int i) {
        zzk.zza.m13795d("onTransferring with type = %d", Integer.valueOf(i));
        this.zza.zzk = true;
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzg(zzkVar.zzh, i), 230);
    }
}
