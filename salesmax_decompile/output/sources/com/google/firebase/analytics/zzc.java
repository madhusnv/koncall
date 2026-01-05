package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.zza.zzb.zzh();
    }
}
