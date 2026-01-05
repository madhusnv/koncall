package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.view.Choreographer;

/* loaded from: classes3.dex */
public abstract class zzef {
    private Runnable zza;
    private Choreographer.FrameCallback zzb;

    public abstract void zza(long j);

    @TargetApi(16)
    public final Choreographer.FrameCallback zzb() {
        if (this.zzb == null) {
            this.zzb = new Choreographer.FrameCallback() { // from class: com.google.android.gms.internal.cast.zzee
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.zza.zza(j);
                }
            };
        }
        return this.zzb;
    }

    public final Runnable zzc() {
        if (this.zza == null) {
            this.zza = new Runnable() { // from class: com.google.android.gms.internal.cast.zzed
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(System.nanoTime());
                }
            };
        }
        return this.zza;
    }
}
