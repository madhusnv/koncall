package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes5.dex */
final class zze extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzh zzb;

    public zze(zzh zzhVar, Runnable runnable) {
        this.zzb = zzhVar;
        this.zza = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.zzb.setVisibility(8);
        this.zzb.zza = null;
        this.zza.run();
    }
}
