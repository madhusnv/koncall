package r5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r5.a */
/* loaded from: classes.dex */
public abstract class AbstractC6466a {
    /* renamed from: a */
    public static Intent m12446a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    /* renamed from: b */
    public static Intent m12447b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    /* renamed from: c */
    public static void m12448c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
