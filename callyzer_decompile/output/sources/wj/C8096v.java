package wj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.v */
/* loaded from: classes.dex */
public final class C8096v extends BroadcastReceiver {

    /* renamed from: a */
    public RunnableC8097w f38753a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        RunnableC8097w runnableC8097w = this.f38753a;
        if (runnableC8097w == null) {
            return;
        }
        if (runnableC8097w.m15280c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            RunnableC8097w runnableC8097w2 = this.f38753a;
            runnableC8097w2.f38760d.f38750f.schedule(runnableC8097w2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f38753a = null;
        }
    }
}
