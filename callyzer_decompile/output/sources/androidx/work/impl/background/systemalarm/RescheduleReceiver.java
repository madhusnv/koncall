package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import t8.C7077w;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        C7077w.m13372b("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C7077w c7077wM13371a = C7077w.m13371a();
        Objects.toString(intent);
        c7077wM13371a.getClass();
        try {
            C7368p c7368pM13783g = C7368p.m13783g(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C7368p.f35042m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c7368pM13783g.f35051i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c7368pM13783g.f35051i = pendingResultGoAsync;
                    if (c7368pM13783g.f35050h) {
                        pendingResultGoAsync.finish();
                        c7368pM13783g.f35051i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException unused) {
            C7077w.m13371a().getClass();
        }
    }
}
