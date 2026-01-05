package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes5.dex */
final class zzd extends AnimatorListenerAdapter {
    final /* synthetic */ zzh zza;

    public zzd(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzh zzhVar = this.zza;
        zzhVar.zza = zzh.zza(zzhVar);
        this.zza.zza.start();
    }
}
