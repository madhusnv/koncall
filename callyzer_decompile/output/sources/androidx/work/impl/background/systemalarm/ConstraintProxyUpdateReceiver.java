package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dj.RunnableC1730c;
import t8.C7077w;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f2882a = 0;

    static {
        C7077w.m13372b("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            C7368p.m13783g(context).f35046d.m5712a(new RunnableC1730c(12, intent, context, goAsync(), false));
        } else {
            C7077w.m13371a().getClass();
        }
    }
}
