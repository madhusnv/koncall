package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes5.dex */
final class zza extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ zzh zza;

    public zza(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        zzh zzhVar = this.zza;
        if (zzhVar.zzk == null) {
            return true;
        }
        if (zzhVar.zzd.contains(Math.round(x), Math.round(y)) && this.zza.zze.zzg(x, y)) {
            return true;
        }
        this.zza.zzk.zza();
        return true;
    }
}
