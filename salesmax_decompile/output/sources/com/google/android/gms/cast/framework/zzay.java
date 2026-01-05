package com.google.android.gms.cast.framework;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes5.dex */
final class zzay extends zzat {
    final /* synthetic */ Session zza;

    public /* synthetic */ zzay(Session session, zzax zzaxVar) {
        this.zza = session;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final long zzb() {
        return this.zza.getSessionRemainingTimeMs();
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final IObjectWrapper zzc() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzd(boolean z) {
        this.zza.end(z);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zze(Bundle bundle) {
        this.zza.onResuming(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzf(Bundle bundle) {
        this.zza.onStarting(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzg(Bundle bundle) {
        this.zza.resume(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzh(Bundle bundle) {
        this.zza.start(bundle);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzi(Bundle bundle) {
        this.zza.zzi(bundle);
    }
}
