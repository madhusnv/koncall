package ai.salesmax.ui.service;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public class WhatsappNotificationListenerService extends NotificationListenerService {
    /* renamed from: a */
    public final int m2669a(StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification.getPackageName();
        if (packageName.equals("com.facebook.katana") || packageName.equals("com.facebook.orca")) {
            return 1;
        }
        if (packageName.equals("com.instagram.android")) {
            return 3;
        }
        return packageName.equals("com.whatsapp") ? 2 : 4;
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        m2669a(statusBarNotification);
        statusBarNotification.getNotification();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        StatusBarNotification[] activeNotifications;
        int iM2669a = m2669a(statusBarNotification);
        if (iM2669a == 4 || (activeNotifications = getActiveNotifications()) == null || activeNotifications.length <= 0) {
            return;
        }
        for (int i = 0; i < activeNotifications.length && iM2669a != m2669a(activeNotifications[i]); i++) {
        }
    }
}
