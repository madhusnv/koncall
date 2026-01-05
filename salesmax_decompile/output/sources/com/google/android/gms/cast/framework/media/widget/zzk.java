package com.google.android.gms.cast.framework.media.widget;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.internal.cast.zzdy;
import java.util.TimerTask;

/* loaded from: classes5.dex */
final class zzk extends TimerTask {
    final /* synthetic */ RemoteMediaClient zza;
    final /* synthetic */ ExpandedControllerActivity zzb;

    public zzk(ExpandedControllerActivity expandedControllerActivity, RemoteMediaClient remoteMediaClient) {
        this.zzb = expandedControllerActivity;
        this.zza = remoteMediaClient;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new zzdy(Looper.getMainLooper()).post(new zzj(this));
    }
}
