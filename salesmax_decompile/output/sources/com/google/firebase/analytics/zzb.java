package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzb implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.zza.zzb.zzl();
    }
}
