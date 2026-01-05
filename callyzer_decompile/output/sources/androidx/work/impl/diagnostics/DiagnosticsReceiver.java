package androidx.work.impl.diagnostics;

import al.C0182j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        C7077w.m13372b("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C7077w.m13371a().getClass();
        try {
            AbstractC4154l.m8923f(context, "context");
            C7368p.m13783g(context).m13354b(new C0182j(DiagnosticsWorker.class).m411b());
        } catch (IllegalStateException unused) {
            C7077w.m13371a().getClass();
        }
    }
}
