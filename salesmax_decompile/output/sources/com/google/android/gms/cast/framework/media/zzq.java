package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

/* loaded from: classes5.dex */
final class zzq extends TimerTask {
    final /* synthetic */ MediaQueue zza;

    public zzq(MediaQueue mediaQueue) {
        this.zza = mediaQueue;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MediaQueue.zzj(this.zza);
    }
}
