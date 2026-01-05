package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.OneSignal;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class UpgradeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        if (Build.VERSION.SDK_INT == 24) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "context.applicationContext");
        if (OneSignal.initWithContext(applicationContext)) {
            ((INotificationRestoreWorkManager) OneSignal.INSTANCE.getServices().getService(INotificationRestoreWorkManager.class)).beginEnqueueingWork(context, true);
        }
    }
}
