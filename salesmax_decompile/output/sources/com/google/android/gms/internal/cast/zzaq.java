package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
final class zzaq implements com.google.android.gms.cast.framework.internal.featurehighlight.zzg {
    final /* synthetic */ Activity zza;
    final /* synthetic */ com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzb;
    final /* synthetic */ zzar zzc;

    public zzaq(zzar zzarVar, Activity activity, com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar) {
        this.zzc = zzarVar;
        this.zza = activity;
        this.zzb = zzhVar;
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zza() {
        if (this.zzc.zzf) {
            com.google.android.gms.cast.framework.zzav.zza(this.zza);
            com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
            final Activity activity = this.zza;
            zzhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.cast.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    zzaq zzaqVar = this.zza;
                    Activity activity2 = activity;
                    if (zzaqVar.zzc.zzf) {
                        ((ViewGroup) activity2.getWindow().getDecorView()).removeView(zzaqVar.zzc);
                        zzar zzarVar = zzaqVar.zzc;
                        if (zzarVar.zzc != null) {
                            zzarVar.zzc.onOverlayDismissed();
                        }
                        zzaqVar.zzc.zzd();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zzb() {
        if (this.zzc.zzf) {
            com.google.android.gms.cast.framework.zzav.zza(this.zza);
            com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
            final Activity activity = this.zza;
            zzhVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.cast.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    zzaq zzaqVar = this.zza;
                    Activity activity2 = activity;
                    if (zzaqVar.zzc.zzf) {
                        ((ViewGroup) activity2.getWindow().getDecorView()).removeView(zzaqVar.zzc);
                        zzar zzarVar = zzaqVar.zzc;
                        if (zzarVar.zzc != null) {
                            zzarVar.zzc.onOverlayDismissed();
                        }
                        zzaqVar.zzc.zzd();
                    }
                }
            });
        }
    }
}
